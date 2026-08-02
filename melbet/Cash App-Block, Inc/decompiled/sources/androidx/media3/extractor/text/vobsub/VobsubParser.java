package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class VobsubParser implements SubtitleParser {
    public static final CuesWithTiming EMPTY_CUES;
    public final CueBuilder cueBuilder;
    public Inflater inflater;
    public final ParsableByteArray scratch = new ParsableByteArray();
    public final ParsableByteArray inflatedScratch = new ParsableByteArray();

    public final class CueBuilder {
        public Rect boundingBox;
        public boolean hasColors;
        public boolean hasPlane;
        public int[] palette;
        public int planeHeight;
        public int planeWidth;
        public long startTimeUs = -9223372036854775807L;
        public long endTimeUs = -9223372036854775807L;
        public final int[] colors = new int[4];
        public int dataOffset0 = -1;
        public int dataOffset1 = -1;

        public static int getColor(int i, int[] iArr) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        public static int setAlpha(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public final void parseRleData(VorbisBitArray vorbisBitArray, boolean z, Rect rect, int[] iArr) {
            int i;
            int i2;
            int width = rect.width();
            int height = rect.height();
            int i3 = !z ? 1 : 0;
            int i4 = i3 * width;
            while (true) {
                int i5 = 0;
                do {
                    int i6 = 0;
                    for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                        if (vorbisBitArray.bitsLeft() < 4) {
                            i = -1;
                            i2 = 0;
                            break;
                        }
                        i6 = (i6 << 4) | vorbisBitArray.readBits(4);
                    }
                    i = i6 & 3;
                    i2 = i6 < 4 ? width : i6 >> 2;
                    int min = Math.min(i2, width - i5);
                    if (min > 0) {
                        int i8 = i4 + min;
                        Arrays.fill(iArr, i4, i8, this.colors[i]);
                        i5 += min;
                        i4 = i8;
                    }
                } while (i5 < width);
                i3 += 2;
                if (i3 >= height) {
                    return;
                }
                i4 = i3 * width;
                vorbisBitArray.byteAlign();
            }
        }
    }

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        EMPTY_CUES = new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, RegularImmutableList.EMPTY);
    }

    public VobsubParser(List list) {
        int i;
        CueBuilder cueBuilder = new CueBuilder();
        this.cueBuilder = cueBuilder;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = Util.DEVICE_DEBUG_INFO;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                cueBuilder.palette = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = cueBuilder.palette;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        Log.w("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    Log.w("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        cueBuilder.planeWidth = Integer.parseInt(split2[0]);
                        cueBuilder.planeHeight = Integer.parseInt(split2[1]);
                        cueBuilder.hasPlane = true;
                    } catch (RuntimeException e2) {
                        Log.w("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x00cb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028e  */
    @Override // androidx.media3.extractor.text.SubtitleParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        CuesWithTiming cuesWithTiming;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        Cue cue;
        long j2;
        long j3;
        Rect rect;
        ParsableByteArray parsableByteArray = this.scratch;
        parsableByteArray.reset(i + i2, bArr);
        parsableByteArray.setPosition(i);
        if (this.inflater == null) {
            this.inflater = new Inflater();
        }
        Inflater inflater = this.inflater;
        String str = Util.DEVICE_DEBUG_INFO;
        if (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 120) {
            ParsableByteArray parsableByteArray2 = this.inflatedScratch;
            if (Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                parsableByteArray.reset(parsableByteArray2.limit, parsableByteArray2.data);
            }
        }
        CueBuilder cueBuilder = this.cueBuilder;
        long j4 = -9223372036854775807L;
        cueBuilder.startTimeUs = -9223372036854775807L;
        cueBuilder.endTimeUs = -9223372036854775807L;
        boolean z4 = false;
        cueBuilder.hasColors = false;
        cueBuilder.boundingBox = null;
        cueBuilder.dataOffset0 = -1;
        cueBuilder.dataOffset1 = -1;
        int bytesLeft = parsableByteArray.bytesLeft();
        if (bytesLeft < 2 || parsableByteArray.readUnsignedShort() != bytesLeft) {
            cuesWithTiming = EMPTY_CUES;
        } else {
            if (cueBuilder.palette == null) {
                Log.w("VobsubParser", "Skipping SPU (no palette)");
            } else if (cueBuilder.hasPlane) {
                int i3 = parsableByteArray.position - 2;
                parsableByteArray.setPosition(parsableByteArray.readUnsignedShort() + i3);
                while (true) {
                    if (parsableByteArray.bytesLeft() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = parsableByteArray.position;
                        int readUnsignedShort = parsableByteArray.readUnsignedShort() * 10000;
                        int readUnsignedShort2 = parsableByteArray.readUnsignedShort() + i3;
                        z = (readUnsignedShort2 == i4 || readUnsignedShort2 >= parsableByteArray.limit) ? z4 : true;
                        int i5 = z ? readUnsignedShort2 : parsableByteArray.limit;
                        j = j4;
                        boolean z5 = true;
                        while (parsableByteArray.position < i5 && z5) {
                            long j5 = readUnsignedShort;
                            int[] iArr = cueBuilder.colors;
                            boolean z6 = z4;
                            int readUnsignedByte = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte != 255) {
                                switch (readUnsignedByte) {
                                    case 0:
                                        z3 = true;
                                        break;
                                    case 1:
                                        cueBuilder.startTimeUs = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        cueBuilder.endTimeUs = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (parsableByteArray.bytesLeft() >= 2) {
                                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                            iArr[3] = CueBuilder.getColor(readUnsignedByte2 >> 4, cueBuilder.palette);
                                            iArr[2] = CueBuilder.getColor(readUnsignedByte2 & 15, cueBuilder.palette);
                                            iArr[1] = CueBuilder.getColor(readUnsignedByte3 >> 4, cueBuilder.palette);
                                            iArr[z6 ? 1 : 0] = CueBuilder.getColor(readUnsignedByte3 & 15, cueBuilder.palette);
                                            cueBuilder.hasColors = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            Log.w("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (parsableByteArray.bytesLeft() >= 2) {
                                            if (!cueBuilder.hasColors) {
                                                Log.w("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                                int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                                                iArr[3] = CueBuilder.setAlpha(iArr[3], readUnsignedByte4 >> 4);
                                                iArr[2] = CueBuilder.setAlpha(iArr[2], readUnsignedByte4 & 15);
                                                iArr[1] = CueBuilder.setAlpha(iArr[1], readUnsignedByte5 >> 4);
                                                iArr[z6 ? 1 : 0] = CueBuilder.setAlpha(iArr[z6 ? 1 : 0], readUnsignedByte5 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            Log.w("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (parsableByteArray.bytesLeft() >= 6) {
                                            int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                            int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                            int i6 = (readUnsignedByte6 << 4) | (readUnsignedByte7 >> 4);
                                            int readUnsignedByte8 = ((readUnsignedByte7 & 15) << 8) | parsableByteArray.readUnsignedByte();
                                            int readUnsignedByte9 = parsableByteArray.readUnsignedByte();
                                            int readUnsignedByte10 = parsableByteArray.readUnsignedByte();
                                            cueBuilder.boundingBox = new Rect(i6, (readUnsignedByte9 << 4) | (readUnsignedByte10 >> 4), readUnsignedByte8 + 1, (((readUnsignedByte10 & 15) << 8) | parsableByteArray.readUnsignedByte()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            Log.w("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (parsableByteArray.bytesLeft() >= 4) {
                                            cueBuilder.dataOffset0 = parsableByteArray.readUnsignedShort();
                                            cueBuilder.dataOffset1 = parsableByteArray.readUnsignedShort();
                                            z3 = true;
                                            break;
                                        } else {
                                            Log.w("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        Fragment$5$$ExternalSyntheticOutline0.m(readUnsignedByte, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        if (z) {
                            parsableByteArray.setPosition(readUnsignedShort2);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (cueBuilder.palette != null || !cueBuilder.hasPlane || !cueBuilder.hasColors || (rect = cueBuilder.boundingBox) == null || cueBuilder.dataOffset0 == -1 || cueBuilder.dataOffset1 == -1 || rect.width() < 2 || cueBuilder.boundingBox.height() < 2) {
                            cue = null;
                        } else {
                            Rect rect2 = cueBuilder.boundingBox;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            VorbisBitArray vorbisBitArray = new VorbisBitArray();
                            parsableByteArray.setPosition(cueBuilder.dataOffset0);
                            vorbisBitArray.reset(parsableByteArray);
                            cueBuilder.parseRleData(vorbisBitArray, true, rect2, iArr2);
                            parsableByteArray.setPosition(cueBuilder.dataOffset1);
                            vorbisBitArray.reset(parsableByteArray);
                            cueBuilder.parseRleData(vorbisBitArray, z2, rect2, iArr2);
                            cue = new Cue(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / cueBuilder.planeHeight, 0, 0, rect2.left / cueBuilder.planeWidth, 0, PKIFailureInfo.systemUnavail, -3.4028235E38f, rect2.width() / cueBuilder.planeWidth, rect2.height() / cueBuilder.planeHeight, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0);
                        }
                        j2 = cueBuilder.endTimeUs;
                        if (j2 == j) {
                            long j6 = cueBuilder.startTimeUs;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        cuesWithTiming = new CuesWithTiming(cueBuilder.startTimeUs, j3, cue == null ? ImmutableList.of((Object) cue) : RegularImmutableList.EMPTY);
                    }
                }
            } else {
                Log.w("VobsubParser", "Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (cueBuilder.palette != null) {
            }
            cue = null;
            j2 = cueBuilder.endTimeUs;
            if (j2 == j) {
            }
            cuesWithTiming = new CuesWithTiming(cueBuilder.startTimeUs, j3, cue == null ? ImmutableList.of((Object) cue) : RegularImmutableList.EMPTY);
        }
        consumer.accept(cuesWithTiming);
    }
}
