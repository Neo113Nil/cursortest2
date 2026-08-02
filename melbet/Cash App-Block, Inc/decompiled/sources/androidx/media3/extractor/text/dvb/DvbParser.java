package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.compose.runtime.OffsetApplier;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.ssa.SsaDialogueFormat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DvbParser implements SubtitleParser {
    public static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    public static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    public static final byte[] defaultMap4To8 = {0, 17, 34, PnmConstants.PPM_TEXT_CODE, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap bitmap;
    public final Canvas canvas;
    public final ClutDefinition defaultClutDefinition;
    public final SsaDialogueFormat defaultDisplayDefinition;
    public final Paint defaultPaint;
    public final Paint fillRegionPaint;
    public final SubtitleService subtitleService;

    public final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    public final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(byte[] bArr, byte[] bArr2, int i, boolean z) {
            this.id = i;
            this.nonModifyingColorFlag = z;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    public final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i, int i2) {
            this.horizontalAddress = i;
            this.verticalAddress = i2;
        }
    }

    public final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray regionObjects;
        public final int width;

        public RegionComposition(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.id = i;
            this.fillFlag = z;
            this.width = i2;
            this.height = i3;
            this.depth = i4;
            this.clutId = i5;
            this.pixelCode8Bit = i6;
            this.pixelCode4Bit = i7;
            this.pixelCode2Bit = i8;
            this.regionObjects = sparseArray;
        }
    }

    public final class RegionObject {
        public final int horizontalPosition;
        public final int verticalPosition;

        public RegionObject(int i, int i2) {
            this.horizontalPosition = i;
            this.verticalPosition = i2;
        }
    }

    public final class SubtitleService {
        public final int ancillaryPageId;
        public SsaDialogueFormat displayDefinition;
        public OffsetApplier pageComposition;
        public final int subtitlePageId;
        public final SparseArray regions = new SparseArray();
        public final SparseArray cluts = new SparseArray();
        public final SparseArray objects = new SparseArray();
        public final SparseArray ancillaryCluts = new SparseArray();
        public final SparseArray ancillaryObjects = new SparseArray();

        public SubtitleService(int i, int i2) {
            this.subtitlePageId = i;
            this.ancillaryPageId = i2;
        }
    }

    public DvbParser(List list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray((byte[]) list.get(0));
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new SsaDialogueFormat(719, 575, 0, 719, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, new int[]{0, -1, -16777216, -8421505}, generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(readUnsignedShort, readUnsignedShort2);
    }

    public static byte[] buildClutMapTable(int i, int i2, VorbisBitArray vorbisBitArray) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) vorbisBitArray.readBits(i2);
        }
        return bArr;
    }

    public static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = getColor(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = getColor(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] generateDefault8BitClutEntries() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = getColor(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int getColor(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        char c;
        char c2;
        boolean z;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        boolean z2;
        int i7;
        int readBits;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int readBits2;
        int i12;
        Paint paint2 = paint;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, bArr.length);
        int i13 = i2;
        int i14 = i3;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (vorbisBitArray.bitsLeft() != 0) {
            int i15 = 8;
            int readBits3 = vorbisBitArray.readBits(8);
            if (readBits3 != 240) {
                int i16 = 3;
                int i17 = 2;
                int i18 = 4;
                switch (readBits3) {
                    case 16:
                        byte[] bArr6 = i == 3 ? bArr3 == null ? defaultMap2To8 : bArr3 : i == 2 ? bArr5 == null ? defaultMap2To4 : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            int readBits4 = vorbisBitArray.readBits(2);
                            if (readBits4 != 0) {
                                z = z4;
                                i4 = readBits4;
                                i5 = 1;
                            } else if (vorbisBitArray.readBit()) {
                                int readBits5 = vorbisBitArray.readBits(3) + 3;
                                z = z4;
                                i4 = vorbisBitArray.readBits(2);
                                i5 = readBits5;
                            } else {
                                if (vorbisBitArray.readBit()) {
                                    z = z4;
                                    i5 = 1;
                                    c = '\b';
                                    c2 = 4;
                                } else {
                                    int readBits6 = vorbisBitArray.readBits(2);
                                    if (readBits6 == 0) {
                                        c = '\b';
                                        c2 = 4;
                                        z = true;
                                    } else if (readBits6 == 1) {
                                        c = '\b';
                                        c2 = 4;
                                        z = z4;
                                        i5 = 2;
                                    } else if (readBits6 == 2) {
                                        c = '\b';
                                        c2 = 4;
                                        i5 = vorbisBitArray.readBits(4) + 12;
                                        i4 = vorbisBitArray.readBits(2);
                                        z = z4;
                                        if (i5 != 0) {
                                        }
                                        i6 = i13;
                                        i13 = i6 + i5;
                                        if (z) {
                                        }
                                    } else if (readBits6 != 3) {
                                        z = z4;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        c = '\b';
                                        int readBits7 = vorbisBitArray.readBits(8) + 29;
                                        i4 = vorbisBitArray.readBits(2);
                                        z = z4;
                                        i5 = readBits7;
                                        c2 = 4;
                                        if (i5 != 0 || paint2 == null) {
                                            i6 = i13;
                                        } else {
                                            if (bArr6 != 0) {
                                                i4 = bArr6[i4];
                                            }
                                            paint2.setColor(iArr[i4]);
                                            i6 = i13;
                                            canvas.drawRect(i13, i14, i13 + i5, i14 + 1, paint2);
                                        }
                                        i13 = i6 + i5;
                                        if (z) {
                                            vorbisBitArray.byteAlign();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z4 = z;
                                        }
                                    }
                                    i4 = 0;
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                    i6 = i13;
                                    i13 = i6 + i5;
                                    if (z) {
                                    }
                                }
                                i4 = 0;
                                if (i5 != 0) {
                                }
                                i6 = i13;
                                i13 = i6 + i5;
                                if (z) {
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i5 != 0) {
                            }
                            i6 = i13;
                            i13 = i6 + i5;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i == 3) {
                            bArr2 = bArr4 == null ? defaultMap4To8 : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int readBits8 = vorbisBitArray.readBits(i18);
                            if (readBits8 != 0) {
                                z2 = z5;
                                i8 = readBits8;
                                i7 = 1;
                            } else if (vorbisBitArray.readBit()) {
                                if (vorbisBitArray.readBit()) {
                                    int readBits9 = vorbisBitArray.readBits(i17);
                                    if (readBits9 == 0) {
                                        z2 = z5;
                                        i7 = 1;
                                    } else if (readBits9 != 1) {
                                        if (readBits9 == i17) {
                                            i7 = vorbisBitArray.readBits(i18) + 9;
                                            readBits = vorbisBitArray.readBits(i18);
                                        } else if (readBits9 != i16) {
                                            z2 = z5;
                                            i7 = 0;
                                        } else {
                                            i7 = vorbisBitArray.readBits(i15) + 25;
                                            readBits = vorbisBitArray.readBits(i18);
                                        }
                                        i8 = readBits;
                                    } else {
                                        z2 = z5;
                                        i7 = i17;
                                    }
                                    i8 = 0;
                                } else {
                                    i7 = vorbisBitArray.readBits(i17) + 4;
                                    i8 = vorbisBitArray.readBits(i18);
                                }
                                z2 = z5;
                            } else {
                                int readBits10 = vorbisBitArray.readBits(i16);
                                if (readBits10 != 0) {
                                    i7 = readBits10 + 2;
                                    z2 = z5;
                                    i8 = 0;
                                } else {
                                    z2 = true;
                                    i7 = 0;
                                    i8 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i9 = i13;
                                i10 = i16;
                                i11 = i17;
                            } else {
                                if (bArr2 != 0) {
                                    i8 = bArr2[i8];
                                }
                                paint2.setColor(iArr[i8]);
                                i10 = i16;
                                i11 = 2;
                                i9 = i13;
                                canvas.drawRect(i13, i14, i13 + i7, i14 + 1, paint2);
                            }
                            i13 = i9 + i7;
                            if (z2) {
                                vorbisBitArray.byteAlign();
                                break;
                            } else {
                                z5 = z2;
                                i16 = i10;
                                i17 = i11;
                                i18 = 4;
                                i15 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int readBits11 = vorbisBitArray.readBits(8);
                            if (readBits11 != 0) {
                                z3 = z6;
                                readBits2 = 1;
                            } else if (vorbisBitArray.readBit()) {
                                z3 = z6;
                                readBits2 = vorbisBitArray.readBits(7);
                                readBits11 = vorbisBitArray.readBits(8);
                            } else {
                                int readBits12 = vorbisBitArray.readBits(7);
                                if (readBits12 != 0) {
                                    z3 = z6;
                                    readBits2 = readBits12;
                                    readBits11 = 0;
                                } else {
                                    z3 = true;
                                    readBits11 = 0;
                                    readBits2 = 0;
                                }
                            }
                            if (readBits2 == 0 || paint2 == null) {
                                i12 = i13;
                            } else {
                                paint2.setColor(iArr[readBits11]);
                                i12 = i13;
                                canvas.drawRect(i13, i14, i13 + readBits2, i14 + 1, paint2);
                            }
                            i13 = i12 + readBits2;
                            if (z3) {
                                break;
                            } else {
                                z6 = z3;
                            }
                        }
                        break;
                    default:
                        switch (readBits3) {
                            case 32:
                                bArr5 = buildClutMapTable(4, 4, vorbisBitArray);
                                break;
                            case 33:
                                bArr3 = buildClutMapTable(4, 8, vorbisBitArray);
                                break;
                            case 34:
                                bArr4 = buildClutMapTable(16, 8, vorbisBitArray);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i2;
            }
            paint2 = paint;
        }
    }

    public static ClutDefinition parseClutDefinition(VorbisBitArray vorbisBitArray, int i) {
        int readBits;
        int i2;
        int readBits2;
        int i3;
        int i4;
        int i5 = 8;
        int readBits3 = vorbisBitArray.readBits(8);
        vorbisBitArray.skipBits(8);
        int i6 = 2;
        int i7 = i - 2;
        int i8 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i7 > 0) {
            int readBits4 = vorbisBitArray.readBits(i5);
            int readBits5 = vorbisBitArray.readBits(i5);
            int[] iArr2 = (readBits5 & 128) != 0 ? iArr : (readBits5 & 64) != 0 ? generateDefault4BitClutEntries : generateDefault8BitClutEntries;
            if ((readBits5 & 1) != 0) {
                i3 = vorbisBitArray.readBits(i5);
                i4 = vorbisBitArray.readBits(i5);
                readBits = vorbisBitArray.readBits(i5);
                readBits2 = vorbisBitArray.readBits(i5);
                i2 = i7 - 6;
            } else {
                int readBits6 = vorbisBitArray.readBits(6) << i6;
                int readBits7 = vorbisBitArray.readBits(4) << 4;
                readBits = vorbisBitArray.readBits(4) << 4;
                i2 = i7 - 4;
                readBits2 = vorbisBitArray.readBits(i6) << 6;
                i3 = readBits6;
                i4 = readBits7;
            }
            if (i3 == 0) {
                i4 = i8;
                readBits = i4;
                readBits2 = 255;
            }
            double d = i3;
            double d2 = i4 - 128;
            double d3 = readBits - 128;
            iArr2[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) ((1.402d * d2) + d), 0, 255), Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.constrainValue((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = i2;
            i8 = 0;
            readBits3 = readBits3;
            generateDefault8BitClutEntries = generateDefault8BitClutEntries;
            i5 = 8;
            i6 = 2;
        }
        return new ClutDefinition(readBits3, iArr, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    public static ObjectData parseObjectData(VorbisBitArray vorbisBitArray) {
        byte[] bArr;
        int readBits = vorbisBitArray.readBits(16);
        vorbisBitArray.skipBits(4);
        int readBits2 = vorbisBitArray.readBits(2);
        boolean readBit = vorbisBitArray.readBit();
        vorbisBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (readBits2 == 1) {
            vorbisBitArray.skipBits(vorbisBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = vorbisBitArray.readBits(16);
            int readBits4 = vorbisBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                vorbisBitArray.readBytes(readBits3, bArr2);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                vorbisBitArray.readBytes(readBits4, bArr);
                return new ObjectData(bArr2, bArr, readBits, readBit);
            }
        }
        bArr = bArr2;
        return new ObjectData(bArr2, bArr, readBits, readBit);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        SubtitleService subtitleService;
        boolean z;
        CuesWithTiming cuesWithTiming;
        char c;
        char c2;
        char c3;
        int i3;
        ArrayList arrayList;
        int i4;
        SsaDialogueFormat ssaDialogueFormat;
        SubtitleService subtitleService2;
        RegionComposition regionComposition;
        int i5;
        int i6;
        int i7;
        int i8;
        RegionComposition regionComposition2;
        int i9;
        int i10;
        int i11;
        int i12;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, i + i2);
        vorbisBitArray.setPosition(i);
        while (true) {
            int bitsLeft = vorbisBitArray.bitsLeft();
            subtitleService = this.subtitleService;
            z = true;
            if (bitsLeft >= 48 && vorbisBitArray.readBits(8) == 15) {
                int readBits = vorbisBitArray.readBits(8);
                int readBits2 = vorbisBitArray.readBits(16);
                int readBits3 = vorbisBitArray.readBits(16);
                int bytePosition = vorbisBitArray.getBytePosition() + readBits3;
                if (readBits3 * 8 > vorbisBitArray.bitsLeft()) {
                    Log.w("DvbParser", "Data field length exceeds limit");
                    vorbisBitArray.skipBits(vorbisBitArray.bitsLeft());
                } else {
                    switch (readBits) {
                        case 16:
                            if (readBits2 == subtitleService.subtitlePageId) {
                                OffsetApplier offsetApplier = subtitleService.pageComposition;
                                vorbisBitArray.readBits(8);
                                int readBits4 = vorbisBitArray.readBits(4);
                                int readBits5 = vorbisBitArray.readBits(2);
                                vorbisBitArray.skipBits(2);
                                int i13 = readBits3 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i13 > 0) {
                                    int readBits6 = vorbisBitArray.readBits(8);
                                    vorbisBitArray.skipBits(8);
                                    i13 -= 6;
                                    sparseArray.put(readBits6, new PageRegion(vorbisBitArray.readBits(16), vorbisBitArray.readBits(16)));
                                }
                                OffsetApplier offsetApplier2 = new OffsetApplier(readBits4, readBits5, sparseArray, 5);
                                if (readBits5 != 0) {
                                    subtitleService.pageComposition = offsetApplier2;
                                    subtitleService.regions.clear();
                                    subtitleService.cluts.clear();
                                    subtitleService.objects.clear();
                                    break;
                                } else if (offsetApplier != null && offsetApplier.offset != readBits4) {
                                    subtitleService.pageComposition = offsetApplier2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            OffsetApplier offsetApplier3 = subtitleService.pageComposition;
                            SparseArray sparseArray2 = subtitleService.regions;
                            if (readBits2 == subtitleService.subtitlePageId && offsetApplier3 != null) {
                                int readBits7 = vorbisBitArray.readBits(8);
                                vorbisBitArray.skipBits(4);
                                boolean readBit = vorbisBitArray.readBit();
                                vorbisBitArray.skipBits(3);
                                int readBits8 = vorbisBitArray.readBits(16);
                                int readBits9 = vorbisBitArray.readBits(16);
                                vorbisBitArray.readBits(3);
                                int readBits10 = vorbisBitArray.readBits(3);
                                vorbisBitArray.skipBits(2);
                                int readBits11 = vorbisBitArray.readBits(8);
                                int readBits12 = vorbisBitArray.readBits(8);
                                int readBits13 = vorbisBitArray.readBits(4);
                                int readBits14 = vorbisBitArray.readBits(2);
                                vorbisBitArray.skipBits(2);
                                int i14 = readBits3 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i14 > 0) {
                                    int readBits15 = vorbisBitArray.readBits(16);
                                    int readBits16 = vorbisBitArray.readBits(2);
                                    vorbisBitArray.readBits(2);
                                    int readBits17 = vorbisBitArray.readBits(12);
                                    vorbisBitArray.skipBits(4);
                                    int readBits18 = vorbisBitArray.readBits(12);
                                    int i15 = i14 - 6;
                                    if (readBits16 == 1 || readBits16 == 2) {
                                        vorbisBitArray.readBits(8);
                                        vorbisBitArray.readBits(8);
                                        i14 -= 8;
                                    } else {
                                        i14 = i15;
                                    }
                                    sparseArray3.put(readBits15, new RegionObject(readBits17, readBits18));
                                }
                                RegionComposition regionComposition3 = new RegionComposition(readBits7, readBit, readBits8, readBits9, readBits10, readBits11, readBits12, readBits13, readBits14, sparseArray3);
                                if (offsetApplier3.nesting == 0 && (regionComposition2 = (RegionComposition) sparseArray2.get(readBits7)) != null) {
                                    SparseArray sparseArray4 = regionComposition2.regionObjects;
                                    for (int i16 = 0; i16 < sparseArray4.size(); i16++) {
                                        regionComposition3.regionObjects.put(sparseArray4.keyAt(i16), (RegionObject) sparseArray4.valueAt(i16));
                                    }
                                }
                                sparseArray2.put(regionComposition3.id, regionComposition3);
                                break;
                            }
                            break;
                        case 18:
                            if (readBits2 == subtitleService.subtitlePageId) {
                                ClutDefinition parseClutDefinition = parseClutDefinition(vorbisBitArray, readBits3);
                                subtitleService.cluts.put(parseClutDefinition.id, parseClutDefinition);
                                break;
                            } else if (readBits2 == subtitleService.ancillaryPageId) {
                                ClutDefinition parseClutDefinition2 = parseClutDefinition(vorbisBitArray, readBits3);
                                subtitleService.ancillaryCluts.put(parseClutDefinition2.id, parseClutDefinition2);
                                break;
                            }
                            break;
                        case 19:
                            if (readBits2 == subtitleService.subtitlePageId) {
                                ObjectData parseObjectData = parseObjectData(vorbisBitArray);
                                subtitleService.objects.put(parseObjectData.id, parseObjectData);
                                break;
                            } else if (readBits2 == subtitleService.ancillaryPageId) {
                                ObjectData parseObjectData2 = parseObjectData(vorbisBitArray);
                                subtitleService.ancillaryObjects.put(parseObjectData2.id, parseObjectData2);
                                break;
                            }
                            break;
                        case 20:
                            if (readBits2 == subtitleService.subtitlePageId) {
                                vorbisBitArray.skipBits(4);
                                boolean readBit2 = vorbisBitArray.readBit();
                                vorbisBitArray.skipBits(3);
                                int readBits19 = vorbisBitArray.readBits(16);
                                int readBits20 = vorbisBitArray.readBits(16);
                                if (readBit2) {
                                    int readBits21 = vorbisBitArray.readBits(16);
                                    i9 = vorbisBitArray.readBits(16);
                                    i12 = vorbisBitArray.readBits(16);
                                    i10 = vorbisBitArray.readBits(16);
                                    i11 = readBits21;
                                } else {
                                    i9 = readBits19;
                                    i10 = readBits20;
                                    i11 = 0;
                                    i12 = 0;
                                }
                                subtitleService.displayDefinition = new SsaDialogueFormat(readBits19, readBits20, i11, i9, i12, i10);
                                break;
                            }
                            break;
                    }
                    vorbisBitArray.skipBytes(bytePosition - vorbisBitArray.getBytePosition());
                }
            }
        }
        OffsetApplier offsetApplier4 = subtitleService.pageComposition;
        if (offsetApplier4 == null) {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            cuesWithTiming = new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, RegularImmutableList.EMPTY);
        } else {
            SsaDialogueFormat ssaDialogueFormat2 = subtitleService.displayDefinition;
            if (ssaDialogueFormat2 == null) {
                ssaDialogueFormat2 = this.defaultDisplayDefinition;
            }
            Bitmap bitmap = this.bitmap;
            Canvas canvas = this.canvas;
            if (bitmap == null || ssaDialogueFormat2.layerIndex + 1 != bitmap.getWidth() || ssaDialogueFormat2.startTimeIndex + 1 != this.bitmap.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(ssaDialogueFormat2.layerIndex + 1, ssaDialogueFormat2.startTimeIndex + 1, Bitmap.Config.ARGB_8888);
                this.bitmap = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) offsetApplier4.applier;
            int i17 = 0;
            while (i17 < sparseArray5.size()) {
                canvas.save();
                PageRegion pageRegion = (PageRegion) sparseArray5.valueAt(i17);
                RegionComposition regionComposition4 = (RegionComposition) subtitleService.regions.get(sparseArray5.keyAt(i17));
                int i18 = pageRegion.horizontalAddress + ssaDialogueFormat2.endTimeIndex;
                int i19 = pageRegion.verticalAddress + ssaDialogueFormat2.textIndex;
                int i20 = regionComposition4.width;
                int i21 = regionComposition4.clutId;
                int i22 = regionComposition4.height;
                boolean z2 = z;
                int i23 = i18 + i20;
                int i24 = i19 + i22;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i18, i19, Math.min(i23, ssaDialogueFormat2.styleIndex), Math.min(i24, ssaDialogueFormat2.length));
                ClutDefinition clutDefinition = (ClutDefinition) subtitleService.cluts.get(i21);
                if (clutDefinition == null && (clutDefinition = (ClutDefinition) subtitleService.ancillaryCluts.get(i21)) == null) {
                    clutDefinition = this.defaultClutDefinition;
                }
                SparseArray sparseArray7 = regionComposition4.regionObjects;
                int i25 = i17;
                int i26 = 0;
                while (i26 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i26);
                    SparseArray sparseArray8 = sparseArray7;
                    RegionObject regionObject = (RegionObject) sparseArray7.valueAt(i26);
                    int i27 = i19;
                    ObjectData objectData = (ObjectData) subtitleService.objects.get(keyAt);
                    if (objectData == null) {
                        objectData = (ObjectData) subtitleService.ancillaryObjects.get(keyAt);
                    }
                    ObjectData objectData2 = objectData;
                    if (objectData2 != null) {
                        Paint paint = objectData2.nonModifyingColorFlag ? null : this.defaultPaint;
                        int i28 = i18;
                        int i29 = regionComposition4.depth;
                        subtitleService2 = subtitleService;
                        int i30 = i28 + regionObject.horizontalPosition;
                        int i31 = i27 + regionObject.verticalPosition;
                        int i32 = i22;
                        Paint paint2 = paint;
                        ssaDialogueFormat = ssaDialogueFormat2;
                        i6 = i20;
                        i5 = i28;
                        arrayList = arrayList2;
                        i4 = i27;
                        RegionComposition regionComposition5 = regionComposition4;
                        int[] iArr = i29 == 3 ? clutDefinition.clutEntries8Bit : i29 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
                        regionComposition = regionComposition5;
                        i7 = i26;
                        i8 = i32;
                        paintPixelDataSubBlock(objectData2.topFieldData, iArr, i29, i30, i31, paint2, canvas);
                        paintPixelDataSubBlock(objectData2.bottomFieldData, iArr, i29, i30, i31 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i4 = i27;
                        ssaDialogueFormat = ssaDialogueFormat2;
                        subtitleService2 = subtitleService;
                        regionComposition = regionComposition4;
                        i5 = i18;
                        i6 = i20;
                        i7 = i26;
                        i8 = i22;
                    }
                    i26 = i7 + 1;
                    i20 = i6;
                    i19 = i4;
                    regionComposition4 = regionComposition;
                    i18 = i5;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    ssaDialogueFormat2 = ssaDialogueFormat;
                    subtitleService = subtitleService2;
                    i22 = i8;
                }
                SsaDialogueFormat ssaDialogueFormat3 = ssaDialogueFormat2;
                ArrayList arrayList3 = arrayList2;
                SubtitleService subtitleService3 = subtitleService;
                int i33 = i19;
                RegionComposition regionComposition6 = regionComposition4;
                int i34 = i18;
                int i35 = i20;
                int i36 = i22;
                if (regionComposition6.fillFlag) {
                    int i37 = regionComposition6.depth;
                    if (i37 == 3) {
                        i3 = clutDefinition.clutEntries8Bit[regionComposition6.pixelCode8Bit];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i37 == 2 ? clutDefinition.clutEntries4Bit[regionComposition6.pixelCode4Bit] : clutDefinition.clutEntries2Bit[regionComposition6.pixelCode2Bit];
                    }
                    Paint paint3 = this.fillRegionPaint;
                    paint3.setColor(i3);
                    c = c3;
                    c2 = 3;
                    canvas.drawRect(i34, i33, i23, i24, paint3);
                } else {
                    c = 2;
                    c2 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.bitmap, i34, i33, i35, i36);
                float f = ssaDialogueFormat3.layerIndex;
                float f2 = ssaDialogueFormat3.startTimeIndex;
                arrayList3.add(new Cue(null, null, null, createBitmap2, i33 / f2, 0, 0, i34 / f, 0, PKIFailureInfo.systemUnavail, -3.4028235E38f, i35 / f, i36 / f2, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i17 = i25 + 1;
                z = z2;
                ssaDialogueFormat2 = ssaDialogueFormat3;
                arrayList2 = arrayList3;
                subtitleService = subtitleService3;
                sparseArray5 = sparseArray6;
            }
            cuesWithTiming = new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        consumer.accept(cuesWithTiming);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void reset() {
        SubtitleService subtitleService = this.subtitleService;
        subtitleService.regions.clear();
        subtitleService.cluts.clear();
        subtitleService.objects.clear();
        subtitleService.ancillaryCluts.clear();
        subtitleService.ancillaryObjects.clear();
        subtitleService.displayDefinition = null;
        subtitleService.pageComposition = null;
    }
}
