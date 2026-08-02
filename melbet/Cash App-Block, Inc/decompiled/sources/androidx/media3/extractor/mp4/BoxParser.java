package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.OffsetApplier;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box$ContainerBox;
import androidx.media3.container.Mp4Box$LeafBox;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.OpusUtil;
import androidx.media3.decoder.Buffer;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache$cache$1;
import com.fillr.featuretoggle.UnleashContext;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.EocdRecord;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class BoxParser {
    public static final byte[] opusMagic;

    public final class ChunkIterator {
        public final ParsableByteArray chunkOffsets;
        public final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        public int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        public int remainingSamplesPerChunkChanges;
        public final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            AacUtil.checkContainerInput("first_chunk must be 1", parsableByteArray.readInt() == 1);
            this.index = -1;
        }

        public final boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            boolean z = this.chunkOffsetsAreLongs;
            ParsableByteArray parsableByteArray = this.chunkOffsets;
            this.offset = z ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                ParsableByteArray parsableByteArray2 = this.stsc;
                this.numSamples = parsableByteArray2.readUnsignedIntToInt();
                parsableByteArray2.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? parsableByteArray2.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public final class StriData {
        public boolean eyeViewsReversed;
        public boolean hasLeftEyeView;
        public boolean hasRightEyeView;

        public AudioOffloadSupport build() {
            if (this.hasLeftEyeView || !(this.hasRightEyeView || this.eyeViewsReversed)) {
                return new AudioOffloadSupport(this);
            }
            a$$ExternalSyntheticBUOutline0.m$1("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }

        public boolean isComplete() {
            return (this.eyeViewsReversed || this.hasRightEyeView) && this.hasLeftEyeView;
        }
    }

    public final class TkhdData {
        public int alternateGroup;
        public int height;
        public int id;
        public int rotationDegrees;
        public int width;

        public boolean boundsMatch() {
            int i = this.id;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.width;
                int i4 = this.alternateGroup;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.width;
                int i6 = this.rotationDegrees;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.height;
                int i8 = this.alternateGroup;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.height;
                int i10 = this.rotationDegrees;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if (((i2 << 12) & i) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        String str = Util.DEVICE_DEBUG_INFO;
        opusMagic = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.position;
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            i += 4;
        }
        parsableByteArray.setPosition(i);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, androidx.media3.common.DrmInitData r56, androidx.media3.common.util.TimedValueQueue r57, int r58) {
        /*
            Method dump skipped, instructions count: 3194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.common.util.TimedValueQueue, int):void");
    }

    public static RealStrongMemoryCache$cache$1 parseEsdsFromParent(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new RealStrongMemoryCache$cache$1(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(0, parseExpandableClassSize, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new RealStrongMemoryCache$cache$1(mimeTypeFromMp4ObjectType, bArr, j, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    public static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.readInt();
        r10 = r14.readInt();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.readBytes(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new androidx.media3.container.MdtaMetadataEntry(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0.m("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Metadata parseMdtaFromMeta(Mp4Box$ContainerBox mp4Box$ContainerBox) {
        Mp4Box$LeafBox leafBoxOfType = mp4Box$ContainerBox.getLeafBoxOfType(1751411826);
        Mp4Box$LeafBox leafBoxOfType2 = mp4Box$ContainerBox.getLeafBoxOfType(1801812339);
        Mp4Box$LeafBox leafBoxOfType3 = mp4Box$ContainerBox.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(16);
        if (parsableByteArray.readInt() != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType2.data;
        parsableByteArray2.setPosition(12);
        int readInt = parsableByteArray2.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray2.readInt();
            parsableByteArray2.skipBytes(4);
            strArr[i] = parsableByteArray2.readString(readInt2 - 8, StandardCharsets.UTF_8);
        }
        ParsableByteArray parsableByteArray3 = leafBoxOfType3.data;
        parsableByteArray3.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray3.bytesLeft() > 8) {
            int i2 = parsableByteArray3.position;
            int readInt3 = parsableByteArray3.readInt();
            int readInt4 = parsableByteArray3.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                Fragment$5$$ExternalSyntheticOutline0.m(readInt4, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[readInt4];
                int i3 = i2 + readInt3;
                while (true) {
                    int i4 = parsableByteArray3.position;
                    if (i4 >= i3) {
                        break;
                    }
                    int readInt5 = parsableByteArray3.readInt();
                    if (parsableByteArray3.readInt() == 1684108385) {
                        break;
                    }
                    parsableByteArray3.setPosition(i4 + readInt5);
                }
                MdtaMetadataEntry mdtaMetadataEntry = null;
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            parsableByteArray3.setPosition(i2 + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    public static Pair parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Integer num;
        TrackEncryptionBox trackEncryptionBox;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = parsableByteArray.position;
        while (i5 - i < i2) {
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            AacUtil.checkContainerInput("childAtomSize must be positive", readInt > 0);
            if (parsableByteArray.readInt() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < readInt) {
                    parsableByteArray.setPosition(i6);
                    int readInt2 = parsableByteArray.readInt();
                    int readInt3 = parsableByteArray.readInt();
                    if (readInt3 == 1718775137) {
                        num3 = Integer.valueOf(parsableByteArray.readInt());
                    } else if (readInt3 == 1935894637) {
                        parsableByteArray.skipBytes(4);
                        str = parsableByteArray.readString(4, StandardCharsets.UTF_8);
                    } else if (readInt3 == 1935894633) {
                        i8 = i6;
                        i7 = readInt2;
                    }
                    i6 += readInt2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AacUtil.checkContainerInput("frma atom is mandatory", num3 != null);
                    AacUtil.checkContainerInput("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            trackEncryptionBox = null;
                            break;
                        }
                        parsableByteArray.setPosition(i9);
                        int readInt4 = parsableByteArray.readInt();
                        if (parsableByteArray.readInt() == 1952804451) {
                            int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                            parsableByteArray.skipBytes(1);
                            if (parseFullBoxVersion == 0) {
                                parsableByteArray.skipBytes(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                                i3 = readUnsignedByte & 15;
                                i4 = (readUnsignedByte & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
                            }
                            if (parsableByteArray.readUnsignedByte() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            byte[] bArr2 = new byte[16];
                            parsableByteArray.readBytes(0, 16, bArr2);
                            if (z && readUnsignedByte2 == 0) {
                                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                byte[] bArr3 = new byte[readUnsignedByte3];
                                parsableByteArray.readBytes(0, readUnsignedByte3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += readInt4;
                        }
                    }
                    AacUtil.checkContainerInput("tenc atom is mandatory", trackEncryptionBox != null);
                    String str2 = Util.DEVICE_DEBUG_INFO;
                    create = Pair.create(num, trackEncryptionBox);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += readInt;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x099a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TimedValueQueue parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, String str, DrmInitData drmInitData, boolean z) {
        int i;
        int i2;
        DrmInitData drmInitData2;
        int i3;
        int i4;
        int i5;
        String str2;
        String str3;
        String str4;
        int i6;
        String str5;
        String str6;
        int i7;
        UnleashContext unleashContext;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        byte[] bArr2;
        int i11;
        int i12;
        int i13;
        int readBits;
        int i14;
        int i15;
        int readBits2;
        int i16;
        int i17;
        int i18;
        ColorInfo colorInfo;
        ColorInfo colorInfo2;
        int i19;
        int i20;
        int i21;
        String str7;
        int i22;
        int i23;
        int i24;
        DrmInitData drmInitData3;
        int i25;
        int i26;
        String str8;
        RegularImmutableList regularImmutableList;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        TkhdData tkhdData2 = tkhdData;
        String str9 = str;
        int i27 = tkhdData2.id;
        parsableByteArray2.setPosition(12);
        int readInt = parsableByteArray2.readInt();
        TimedValueQueue timedValueQueue = new TimedValueQueue(readInt);
        int i28 = 0;
        while (i28 < readInt) {
            int i29 = parsableByteArray2.position;
            int readInt2 = parsableByteArray2.readInt();
            String str10 = "childAtomSize must be positive";
            AacUtil.checkContainerInput("childAtomSize must be positive", readInt2 > 0);
            int readInt3 = parsableByteArray2.readInt();
            int i30 = 8;
            byte b = 3;
            byte[] bArr3 = null;
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1987470129 || readInt3 == 1987471665 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241 || readInt3 == 1684108849) {
                int i31 = tkhdData2.rotationDegrees;
                parsableByteArray2.setPosition(i29 + 16);
                parsableByteArray2.skipBytes(16);
                int readUnsignedShort = parsableByteArray2.readUnsignedShort();
                int readUnsignedShort2 = parsableByteArray2.readUnsignedShort();
                parsableByteArray2.skipBytes(50);
                int i32 = parsableByteArray2.position;
                i = i28;
                if (readInt3 == 1701733238) {
                    Pair parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray2, i29, readInt2);
                    if (parseSampleEntryEncryptionData != null) {
                        readInt3 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                        if (drmInitData == null) {
                            i2 = i29;
                            drmInitData3 = null;
                        } else {
                            i2 = i29;
                            drmInitData3 = drmInitData.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                        }
                        ((TrackEncryptionBox[]) timedValueQueue.timestamps)[i] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
                    } else {
                        i2 = i29;
                        drmInitData3 = drmInitData;
                    }
                    parsableByteArray2.setPosition(i32);
                    drmInitData2 = drmInitData3;
                } else {
                    i2 = i29;
                    drmInitData2 = drmInitData;
                }
                DrmInitData drmInitData4 = drmInitData2;
                i3 = i27;
                i4 = readInt;
                int i33 = i32;
                int i34 = 8;
                UnleashContext unleashContext2 = null;
                List list = null;
                ByteBuffer byteBuffer = null;
                String str11 = null;
                byte[] bArr4 = null;
                Joiner joiner = null;
                EocdRecord eocdRecord = null;
                RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = null;
                String str12 = readInt3 == 1831958048 ? "video/mpeg" : readInt3 == 1211250227 ? "video/3gpp" : null;
                float f = 1.0f;
                int i35 = -1;
                int i36 = -1;
                int i37 = -1;
                int i38 = -1;
                boolean z2 = false;
                int i39 = -1;
                int i40 = -1;
                int i41 = -1;
                int i42 = -1;
                int i43 = 8;
                while (i33 - i2 < readInt2) {
                    parsableByteArray2.setPosition(i33);
                    int i44 = parsableByteArray2.position;
                    int i45 = i33;
                    int readInt4 = parsableByteArray2.readInt();
                    if (readInt4 == 0 && parsableByteArray2.position - i2 == readInt2) {
                        break;
                    }
                    AacUtil.checkContainerInput(str10, readInt4 > 0);
                    int readInt5 = parsableByteArray2.readInt();
                    int i46 = readInt2;
                    if (readInt5 == 1635148611) {
                        AacUtil.checkContainerInput(bArr3, str12 == null);
                        parsableByteArray2.setPosition(i44 + 8);
                        AvcConfig parse = AvcConfig.parse(parsableByteArray2);
                        list = parse.initializationData;
                        timedValueQueue.first = parse.nalUnitLengthFieldLength;
                        float f2 = !z2 ? parse.pixelWidthHeightRatio : f;
                        String str13 = parse.codecs;
                        int i47 = parse.maxNumReorderFrames;
                        i38 = parse.colorSpace;
                        int i48 = parse.colorRange;
                        int i49 = parse.colorTransfer;
                        int i50 = parse.bitdepthLuma;
                        i34 = parse.bitdepthChroma;
                        i8 = readInt3;
                        i40 = i47;
                        str5 = str10;
                        i6 = i49;
                        f = f2;
                        unleashContext = unleashContext2;
                        i7 = i50;
                        str6 = "video/avc";
                        bArr = null;
                        str11 = str13;
                        i37 = i48;
                        i9 = i30;
                    } else {
                        int i51 = readInt3;
                        if (readInt5 == 1752589123) {
                            AacUtil.checkContainerInput(null, str12 == null);
                            parsableByteArray2.setPosition(i44 + 8);
                            HevcConfig parseImpl = HevcConfig.parseImpl(parsableByteArray2, false, null);
                            list = parseImpl.initializationData;
                            timedValueQueue.first = parseImpl.nalUnitLengthFieldLength;
                            float f3 = !z2 ? parseImpl.pixelWidthHeightRatio : f;
                            int i52 = parseImpl.maxNumReorderPics;
                            int i53 = parseImpl.maxSubLayers;
                            String str14 = parseImpl.codecs;
                            int i54 = parseImpl.stereoMode;
                            if (i54 != -1) {
                                i35 = i54;
                            }
                            int i55 = parseImpl.decodedWidth;
                            int i56 = parseImpl.decodedHeight;
                            i38 = parseImpl.colorSpace;
                            int i57 = parseImpl.colorRange;
                            int i58 = parseImpl.colorTransfer;
                            int i59 = parseImpl.bitdepthLuma;
                            i34 = parseImpl.bitdepthChroma;
                            str6 = "video/hevc";
                            unleashContext = parseImpl.vpsData;
                            str5 = str10;
                            i41 = i56;
                            i42 = i55;
                            f = f3;
                            i37 = i57;
                            i9 = i30;
                            i6 = i58;
                            i7 = i59;
                            i8 = i51;
                            bArr = null;
                            i40 = i52;
                            i39 = i53;
                            str11 = str14;
                        } else {
                            int i60 = i35;
                            if (readInt5 == 1818785347) {
                                AacUtil.checkContainerInput("lhvC must follow hvcC atom", "video/hevc".equals(str12));
                                AacUtil.checkContainerInput("must have at least two layers", unleashContext2 != null && ((ImmutableList) unleashContext2.userId).size() >= 2);
                                parsableByteArray2.setPosition(i44 + 8);
                                unleashContext2.getClass();
                                HevcConfig parseImpl2 = HevcConfig.parseImpl(parsableByteArray2, true, unleashContext2);
                                AacUtil.checkContainerInput("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", timedValueQueue.first == parseImpl2.nalUnitLengthFieldLength);
                                int i61 = parseImpl2.colorSpace;
                                if (i61 != -1) {
                                    AacUtil.checkContainerInput("colorSpace must be the same for both views", i38 == i61);
                                }
                                int i62 = parseImpl2.colorRange;
                                if (i62 != -1) {
                                    AacUtil.checkContainerInput("colorRange must be the same for both views", i37 == i62);
                                }
                                int i63 = parseImpl2.colorTransfer;
                                if (i63 != -1) {
                                    AacUtil.checkContainerInput("colorTransfer must be the same for both views", i36 == i63);
                                }
                                AacUtil.checkContainerInput("bitdepthLuma must be the same for both views", i43 == parseImpl2.bitdepthLuma);
                                AacUtil.checkContainerInput("bitdepthChroma must be the same for both views", i34 == parseImpl2.bitdepthChroma);
                                if (list != null) {
                                    ImmutableList.Builder builder = ImmutableList.builder();
                                    builder.addAll(list);
                                    builder.addAll(parseImpl2.initializationData);
                                    list = builder.build();
                                } else {
                                    AacUtil.checkContainerInput("initializationData must be already set from hvcC atom", false);
                                }
                                str11 = parseImpl2.codecs;
                                str6 = "video/mv-hevc";
                                i6 = i36;
                                str5 = str10;
                                i7 = i43;
                                unleashContext = unleashContext2;
                                i9 = i30;
                                i8 = i51;
                                i35 = i60;
                                bArr = null;
                            } else {
                                int i64 = 7;
                                if (readInt5 == 1987470147) {
                                    AacUtil.checkContainerInput(null, str12 == null);
                                    parsableByteArray2.setPosition(i44 + 8);
                                    try {
                                        if (parsableByteArray2.readInt() != 0) {
                                            throw ParserException.createForMalformedContainer(null, "Unsupported VVC version");
                                        }
                                        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
                                        int i65 = (readUnsignedByte >> 1) & 3;
                                        boolean z3 = (readUnsignedByte & 1) != 0;
                                        int i66 = i65 + 1;
                                        str7 = "L";
                                        if (z3) {
                                            parsableByteArray2.skipBytes(1);
                                            int readUnsignedByte2 = (parsableByteArray2.readUnsignedByte() >> 4) & 7;
                                            i23 = (parsableByteArray2.readUnsignedByte() >> 5) & 7;
                                            int readUnsignedByte3 = parsableByteArray2.readUnsignedByte() & 63;
                                            int readUnsignedByte4 = parsableByteArray2.readUnsignedByte();
                                            int i67 = (readUnsignedByte4 >> 1) & 127;
                                            str7 = (readUnsignedByte4 & 1) != 0 ? "H" : "L";
                                            i24 = parsableByteArray2.readUnsignedByte();
                                            parsableByteArray2.skipBytes(readUnsignedByte3);
                                            int i68 = 1;
                                            if (readUnsignedByte2 > 1) {
                                                int readUnsignedByte5 = parsableByteArray2.readUnsignedByte();
                                                int i69 = 0;
                                                while (i69 < readUnsignedByte2 - 1) {
                                                    if (((readUnsignedByte5 >> (7 - i69)) & i68) != 0) {
                                                        parsableByteArray2.skipBytes(i68);
                                                    }
                                                    i69++;
                                                    i68 = 1;
                                                }
                                            }
                                            parsableByteArray2.skipBytes(parsableByteArray2.readUnsignedByte() * 4);
                                            parsableByteArray2.skipBytes(6);
                                            i22 = i67;
                                        } else {
                                            i22 = 0;
                                            i23 = 0;
                                            i24 = 0;
                                        }
                                        int readUnsignedByte6 = parsableByteArray2.readUnsignedByte();
                                        int i70 = parsableByteArray2.position;
                                        int i71 = i23;
                                        int i72 = 0;
                                        int i73 = 0;
                                        while (i73 < readUnsignedByte6) {
                                            int i74 = i37;
                                            int readUnsignedByte7 = parsableByteArray2.readUnsignedByte() & 31;
                                            int i75 = i73;
                                            int readUnsignedShort3 = (readUnsignedByte7 == 13 || readUnsignedByte7 == 12) ? 1 : parsableByteArray2.readUnsignedShort();
                                            int i76 = 0;
                                            while (i76 < readUnsignedShort3) {
                                                int i77 = i72;
                                                int readUnsignedShort4 = parsableByteArray2.readUnsignedShort();
                                                parsableByteArray2.skipBytes(readUnsignedShort4);
                                                i76++;
                                                i72 = readUnsignedShort4 + 4 + i77;
                                            }
                                            i73 = i75 + 1;
                                            i37 = i74;
                                        }
                                        int i78 = i37;
                                        parsableByteArray2.setPosition(i70);
                                        byte[] bArr5 = new byte[i72];
                                        int i79 = 0;
                                        int i80 = 0;
                                        while (i79 < readUnsignedByte6) {
                                            int readUnsignedByte8 = parsableByteArray2.readUnsignedByte() & 31;
                                            int i81 = readUnsignedByte6;
                                            int readUnsignedShort5 = (readUnsignedByte8 == 13 || readUnsignedByte8 == 12) ? 1 : parsableByteArray2.readUnsignedShort();
                                            int i82 = 0;
                                            while (i82 < readUnsignedShort5) {
                                                int i83 = readUnsignedShort5;
                                                int readUnsignedShort6 = parsableByteArray2.readUnsignedShort();
                                                System.arraycopy(OpusUtil.NAL_START_CODE, 0, bArr5, i80, 4);
                                                int i84 = i80 + 4;
                                                parsableByteArray2.readBytes(i84, readUnsignedShort6, bArr5);
                                                i80 = i84 + readUnsignedShort6;
                                                i82++;
                                                readUnsignedShort5 = i83;
                                                i79 = i79;
                                                i36 = i36;
                                            }
                                            i79++;
                                            readUnsignedByte6 = i81;
                                        }
                                        i6 = i36;
                                        Locale locale = Locale.US;
                                        String str15 = "vvc1." + i22 + "." + str7 + i24;
                                        list = ImmutableList.of((Object) bArr5);
                                        int i85 = i71 + 8;
                                        timedValueQueue.first = i66;
                                        str11 = str15;
                                        str6 = "video/vvc";
                                        str5 = str10;
                                        i34 = i85;
                                        i7 = i34;
                                        unleashContext = unleashContext2;
                                        i9 = i30;
                                        i8 = i51;
                                        i35 = i60;
                                        i37 = i78;
                                        bArr = null;
                                        i40 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw ParserException.createForMalformedContainer(e, "Error parsing VVC configuration");
                                    }
                                } else {
                                    i6 = i36;
                                    int i86 = i37;
                                    if (readInt5 == 1986361461) {
                                        parsableByteArray2.setPosition(i44 + 8);
                                        int i87 = parsableByteArray2.position;
                                        Recorder.AnonymousClass6 anonymousClass6 = null;
                                        while (i87 - i44 < readInt4) {
                                            parsableByteArray2.setPosition(i87);
                                            int readInt6 = parsableByteArray2.readInt();
                                            AacUtil.checkContainerInput(str10, readInt6 > 0);
                                            if (parsableByteArray2.readInt() == 1702454643) {
                                                parsableByteArray2.setPosition(i87 + 8);
                                                int i88 = parsableByteArray2.position;
                                                while (true) {
                                                    if (i88 - i87 >= readInt6) {
                                                        i20 = i34;
                                                        i21 = i87;
                                                        anonymousClass6 = null;
                                                        break;
                                                    }
                                                    parsableByteArray2.setPosition(i88);
                                                    int readInt7 = parsableByteArray2.readInt();
                                                    AacUtil.checkContainerInput(str10, readInt7 > 0);
                                                    if (parsableByteArray2.readInt() == 1937011305) {
                                                        parsableByteArray2.skipBytes(4);
                                                        int readUnsignedByte9 = parsableByteArray2.readUnsignedByte();
                                                        i20 = i34;
                                                        boolean z4 = (readUnsignedByte9 & 1) == 1;
                                                        i21 = i87;
                                                        boolean z5 = (readUnsignedByte9 & 2) == 2;
                                                        boolean z6 = (readUnsignedByte9 & 8) == i30;
                                                        StriData striData = new StriData();
                                                        striData.hasLeftEyeView = z4;
                                                        striData.hasRightEyeView = z5;
                                                        striData.eyeViewsReversed = z6;
                                                        anonymousClass6 = new Recorder.AnonymousClass6(striData, 25);
                                                    } else {
                                                        i88 += readInt7;
                                                        i30 = 8;
                                                    }
                                                }
                                            } else {
                                                i20 = i34;
                                                i21 = i87;
                                            }
                                            i87 = i21 + readInt6;
                                            i34 = i20;
                                            i30 = 8;
                                        }
                                        int i89 = i34;
                                        BiometricPrompt biometricPrompt = anonymousClass6 == null ? null : new BiometricPrompt(anonymousClass6, 28);
                                        if (biometricPrompt != null) {
                                            StriData striData2 = (StriData) ((Recorder.AnonymousClass6) biometricPrompt.mClientFragmentManager).this$0;
                                            boolean z7 = striData2.eyeViewsReversed;
                                            if (unleashContext2 == null || ((ImmutableList) unleashContext2.userId).size() < 2) {
                                                i19 = i60;
                                                if (i19 == -1) {
                                                    i35 = z7 ? 5 : 4;
                                                    str5 = str10;
                                                    str6 = str12;
                                                    i7 = i43;
                                                    unleashContext = unleashContext2;
                                                    i8 = i51;
                                                    i37 = i86;
                                                    i34 = i89;
                                                    bArr = null;
                                                }
                                                i35 = i19;
                                                str5 = str10;
                                                str6 = str12;
                                                i7 = i43;
                                                unleashContext = unleashContext2;
                                                i8 = i51;
                                                i37 = i86;
                                                i34 = i89;
                                                bArr = null;
                                            } else {
                                                AacUtil.checkContainerInput("both eye views must be marked as available", striData2.hasLeftEyeView && striData2.hasRightEyeView);
                                                AacUtil.checkContainerInput("for MV-HEVC, eye_views_reversed must be set to false", !z7);
                                            }
                                        }
                                        i19 = i60;
                                        i35 = i19;
                                        str5 = str10;
                                        str6 = str12;
                                        i7 = i43;
                                        unleashContext = unleashContext2;
                                        i8 = i51;
                                        i37 = i86;
                                        i34 = i89;
                                        bArr = null;
                                    } else {
                                        int i90 = i34;
                                        int i91 = i60;
                                        if (readInt5 == 1685480259 || readInt5 == 1685485123 || readInt5 == 1685485379) {
                                            str5 = str10;
                                            str6 = str12;
                                            i7 = i43;
                                            unleashContext = unleashContext2;
                                            i8 = i51;
                                            bArr = null;
                                            i9 = 8;
                                            i6 = i6;
                                            joiner = Joiner.parse(parsableByteArray2);
                                        } else if (readInt5 == 1987076931) {
                                            AacUtil.checkContainerInput(null, str12 == null);
                                            String str16 = i51 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            parsableByteArray2.setPosition(i44 + 12);
                                            byte readUnsignedByte10 = (byte) parsableByteArray2.readUnsignedByte();
                                            byte readUnsignedByte11 = (byte) parsableByteArray2.readUnsignedByte();
                                            int readUnsignedByte12 = parsableByteArray2.readUnsignedByte();
                                            int i92 = readUnsignedByte12 >> 4;
                                            byte b2 = (byte) ((readUnsignedByte12 >> 1) & 7);
                                            if (str16.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr6 = CodecSpecificDataUtil.NAL_START_CODE;
                                                byte[] bArr7 = new byte[12];
                                                bArr7[0] = 1;
                                                bArr7[1] = 1;
                                                bArr7[2] = readUnsignedByte10;
                                                bArr7[b] = 2;
                                                bArr7[4] = 1;
                                                bArr7[5] = readUnsignedByte11;
                                                bArr7[6] = b;
                                                bArr7[7] = 1;
                                                bArr7[8] = (byte) i92;
                                                bArr7[9] = 4;
                                                bArr7[10] = 1;
                                                bArr7[11] = b2;
                                                list = ImmutableList.of((Object) bArr7);
                                            }
                                            boolean z8 = (readUnsignedByte12 & 1) != 0;
                                            int readUnsignedByte13 = parsableByteArray2.readUnsignedByte();
                                            int readUnsignedByte14 = parsableByteArray2.readUnsignedByte();
                                            i38 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte13);
                                            int i93 = z8 ? 1 : 2;
                                            i6 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte14);
                                            i7 = i92;
                                            i8 = i51;
                                            str5 = str10;
                                            str6 = str16;
                                            unleashContext = unleashContext2;
                                            i37 = i93;
                                            bArr = null;
                                            i9 = 8;
                                            i35 = i91;
                                            i34 = i7;
                                        } else {
                                            int i94 = 11;
                                            if (readInt5 == 1635135811) {
                                                int i95 = readInt4 - 8;
                                                byte[] bArr8 = new byte[i95];
                                                parsableByteArray2.readBytes(0, i95, bArr8);
                                                list = ImmutableList.of((Object) bArr8);
                                                parsableByteArray2.setPosition(i44 + 8);
                                                byte[] bArr9 = parsableByteArray2.data;
                                                VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr9, bArr9.length);
                                                vorbisBitArray.setPosition(parsableByteArray2.position * 8);
                                                vorbisBitArray.skipBytes(1);
                                                int readBits3 = vorbisBitArray.readBits(b);
                                                vorbisBitArray.skipBits(6);
                                                boolean readBit = vorbisBitArray.readBit();
                                                boolean readBit2 = vorbisBitArray.readBit();
                                                int i96 = -1;
                                                if (readBits3 == 2 && readBit) {
                                                    int i97 = readBit2 ? 12 : 10;
                                                    i13 = readBit2 ? 12 : 10;
                                                    i11 = i97;
                                                } else if (readBits3 <= 2) {
                                                    int i98 = readBit ? 10 : 8;
                                                    i13 = readBit ? 10 : 8;
                                                    i11 = i98;
                                                } else {
                                                    i11 = -1;
                                                    i12 = -1;
                                                    vorbisBitArray.skipBits(13);
                                                    vorbisBitArray.skipBit();
                                                    readBits = vorbisBitArray.readBits(4);
                                                    if (readBits == 1) {
                                                        Log.i("BoxParsers", "Unsupported obu_type: " + readBits);
                                                        colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                    } else if (vorbisBitArray.readBit()) {
                                                        Log.i("BoxParsers", "Unsupported obu_extension_flag");
                                                        colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                    } else {
                                                        boolean readBit3 = vorbisBitArray.readBit();
                                                        vorbisBitArray.skipBit();
                                                        if (!readBit3 || vorbisBitArray.readBits(8) <= 127) {
                                                            int readBits4 = vorbisBitArray.readBits(3);
                                                            vorbisBitArray.skipBit();
                                                            if (vorbisBitArray.readBit()) {
                                                                Log.i("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                            } else if (vorbisBitArray.readBit()) {
                                                                Log.i("BoxParsers", "Unsupported timing_info_present_flag");
                                                                colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                            } else if (vorbisBitArray.readBit()) {
                                                                Log.i("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                            } else {
                                                                int i99 = 5;
                                                                int readBits5 = vorbisBitArray.readBits(5);
                                                                int i100 = 0;
                                                                while (i100 <= readBits5) {
                                                                    vorbisBitArray.skipBits(12);
                                                                    if (vorbisBitArray.readBits(i99) > i64) {
                                                                        vorbisBitArray.skipBit();
                                                                    }
                                                                    i100++;
                                                                    i99 = 5;
                                                                    i64 = 7;
                                                                }
                                                                int readBits6 = vorbisBitArray.readBits(4);
                                                                int readBits7 = vorbisBitArray.readBits(4);
                                                                vorbisBitArray.skipBits(readBits6 + 1);
                                                                vorbisBitArray.skipBits(readBits7 + 1);
                                                                if (vorbisBitArray.readBit()) {
                                                                    i14 = 7;
                                                                    vorbisBitArray.skipBits(7);
                                                                } else {
                                                                    i14 = 7;
                                                                }
                                                                vorbisBitArray.skipBits(i14);
                                                                boolean readBit4 = vorbisBitArray.readBit();
                                                                if (readBit4) {
                                                                    vorbisBitArray.skipBits(2);
                                                                }
                                                                if (vorbisBitArray.readBit()) {
                                                                    readBits2 = 2;
                                                                    i15 = 1;
                                                                } else {
                                                                    i15 = 1;
                                                                    readBits2 = vorbisBitArray.readBits(1);
                                                                }
                                                                if (readBits2 > 0 && !vorbisBitArray.readBit()) {
                                                                    vorbisBitArray.skipBits(i15);
                                                                }
                                                                if (readBit4) {
                                                                    vorbisBitArray.skipBits(3);
                                                                }
                                                                vorbisBitArray.skipBits(3);
                                                                boolean readBit5 = vorbisBitArray.readBit();
                                                                if (readBits4 == 2 && readBit5) {
                                                                    vorbisBitArray.skipBit();
                                                                }
                                                                boolean z9 = readBits4 != 1 && vorbisBitArray.readBit();
                                                                if (vorbisBitArray.readBit()) {
                                                                    int readBits8 = vorbisBitArray.readBits(8);
                                                                    int readBits9 = vorbisBitArray.readBits(8);
                                                                    int readBits10 = (!z9 && readBits8 == 1 && readBits9 == 13 && vorbisBitArray.readBits(8) == 0) ? 1 : vorbisBitArray.readBits(1);
                                                                    int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readBits8);
                                                                    int i101 = readBits10 == 1 ? 1 : 2;
                                                                    i16 = isoColorPrimariesToColorSpace;
                                                                    i17 = i12;
                                                                    i18 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits9);
                                                                    i96 = i101;
                                                                } else {
                                                                    i16 = -1;
                                                                    i17 = i12;
                                                                    i18 = -1;
                                                                }
                                                                colorInfo = new ColorInfo(i16, i96, i18, i11, i17, null);
                                                                int i102 = colorInfo.lumaBitdepth;
                                                                int i103 = colorInfo.chromaBitdepth;
                                                                i38 = colorInfo.colorSpace;
                                                                int i104 = colorInfo.colorRange;
                                                                i6 = colorInfo.colorTransfer;
                                                                str6 = "video/av01";
                                                                i8 = i51;
                                                                str5 = str10;
                                                                i37 = i104;
                                                                i7 = i102;
                                                                unleashContext = unleashContext2;
                                                                bArr = null;
                                                                i9 = 8;
                                                                i35 = i91;
                                                                i34 = i103;
                                                            }
                                                        } else {
                                                            Log.i("BoxParsers", "Excessive obu_size");
                                                            colorInfo2 = new ColorInfo(-1, -1, -1, i11, i12, null);
                                                        }
                                                    }
                                                    colorInfo = colorInfo2;
                                                    int i1022 = colorInfo.lumaBitdepth;
                                                    int i1032 = colorInfo.chromaBitdepth;
                                                    i38 = colorInfo.colorSpace;
                                                    int i1042 = colorInfo.colorRange;
                                                    i6 = colorInfo.colorTransfer;
                                                    str6 = "video/av01";
                                                    i8 = i51;
                                                    str5 = str10;
                                                    i37 = i1042;
                                                    i7 = i1022;
                                                    unleashContext = unleashContext2;
                                                    bArr = null;
                                                    i9 = 8;
                                                    i35 = i91;
                                                    i34 = i1032;
                                                }
                                                i12 = i13;
                                                vorbisBitArray.skipBits(13);
                                                vorbisBitArray.skipBit();
                                                readBits = vorbisBitArray.readBits(4);
                                                if (readBits == 1) {
                                                }
                                                colorInfo = colorInfo2;
                                                int i10222 = colorInfo.lumaBitdepth;
                                                int i10322 = colorInfo.chromaBitdepth;
                                                i38 = colorInfo.colorSpace;
                                                int i10422 = colorInfo.colorRange;
                                                i6 = colorInfo.colorTransfer;
                                                str6 = "video/av01";
                                                i8 = i51;
                                                str5 = str10;
                                                i37 = i10422;
                                                i7 = i10222;
                                                unleashContext = unleashContext2;
                                                bArr = null;
                                                i9 = 8;
                                                i35 = i91;
                                                i34 = i10322;
                                            } else {
                                                if (readInt5 == 1668050025) {
                                                    ByteBuffer order = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    order.position(21);
                                                    order.putShort(parsableByteArray2.readShort());
                                                    order.putShort(parsableByteArray2.readShort());
                                                    byteBuffer = order;
                                                    i8 = i51;
                                                    str5 = str10;
                                                    str6 = str12;
                                                    i7 = i43;
                                                    unleashContext = unleashContext2;
                                                } else if (readInt5 == 1835295606) {
                                                    ByteBuffer order2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short readShort = parsableByteArray2.readShort();
                                                    short readShort2 = parsableByteArray2.readShort();
                                                    short readShort3 = parsableByteArray2.readShort();
                                                    short readShort4 = parsableByteArray2.readShort();
                                                    i8 = i51;
                                                    short readShort5 = parsableByteArray2.readShort();
                                                    str5 = str10;
                                                    short readShort6 = parsableByteArray2.readShort();
                                                    str6 = str12;
                                                    short readShort7 = parsableByteArray2.readShort();
                                                    i7 = i43;
                                                    short readShort8 = parsableByteArray2.readShort();
                                                    long readUnsignedInt = parsableByteArray2.readUnsignedInt();
                                                    long readUnsignedInt2 = parsableByteArray2.readUnsignedInt();
                                                    unleashContext = unleashContext2;
                                                    order2.position(1);
                                                    order2.putShort(readShort5);
                                                    order2.putShort(readShort6);
                                                    order2.putShort(readShort);
                                                    order2.putShort(readShort2);
                                                    order2.putShort(readShort3);
                                                    order2.putShort(readShort4);
                                                    order2.putShort(readShort7);
                                                    order2.putShort(readShort8);
                                                    order2.putShort((short) (readUnsignedInt / 10000));
                                                    order2.putShort((short) (readUnsignedInt2 / 10000));
                                                    byteBuffer = order2;
                                                } else {
                                                    i8 = i51;
                                                    str5 = str10;
                                                    str6 = str12;
                                                    i7 = i43;
                                                    unleashContext = unleashContext2;
                                                    if (readInt5 == 1681012275) {
                                                        bArr = null;
                                                        AacUtil.checkContainerInput(null, str6 == null);
                                                        i35 = i91;
                                                        str6 = "video/3gpp";
                                                        i37 = i86;
                                                        i34 = i90;
                                                    } else {
                                                        bArr = null;
                                                        if (readInt5 == 1702061171) {
                                                            AacUtil.checkContainerInput(null, str6 == null);
                                                            RealStrongMemoryCache$cache$1 parseEsdsFromParent = parseEsdsFromParent(i44, parsableByteArray2);
                                                            String str17 = (String) parseEsdsFromParent.map;
                                                            byte[] bArr10 = (byte[]) parseEsdsFromParent.this$0;
                                                            if (bArr10 != null) {
                                                                list = ImmutableList.of((Object) bArr10);
                                                            }
                                                            realStrongMemoryCache$cache$1 = parseEsdsFromParent;
                                                            str6 = str17;
                                                        } else {
                                                            if (readInt5 == 1651798644) {
                                                                parsableByteArray2.setPosition(i44 + 8);
                                                                parsableByteArray2.skipBytes(4);
                                                                i35 = i91;
                                                                i37 = i86;
                                                                i34 = i90;
                                                                eocdRecord = new EocdRecord(parsableByteArray2.readUnsignedInt(), parsableByteArray2.readUnsignedInt(), 3, (byte) 0);
                                                            } else {
                                                                if (readInt5 == 1885434736) {
                                                                    parsableByteArray2.setPosition(i44 + 8);
                                                                    f = parsableByteArray2.readUnsignedIntToInt() / parsableByteArray2.readUnsignedIntToInt();
                                                                    i37 = i86;
                                                                    i9 = 8;
                                                                    z2 = true;
                                                                } else if (readInt5 == 1937126244) {
                                                                    int i105 = i44 + 8;
                                                                    while (true) {
                                                                        if (i105 - i44 >= readInt4) {
                                                                            bArr2 = null;
                                                                            break;
                                                                        }
                                                                        parsableByteArray2.setPosition(i105);
                                                                        int readInt8 = parsableByteArray2.readInt();
                                                                        if (parsableByteArray2.readInt() == 1886547818) {
                                                                            bArr2 = Arrays.copyOfRange(parsableByteArray2.data, i105, readInt8 + i105);
                                                                            break;
                                                                        }
                                                                        i105 += readInt8;
                                                                    }
                                                                    bArr4 = bArr2;
                                                                } else if (readInt5 == 1936995172) {
                                                                    int readUnsignedByte15 = parsableByteArray2.readUnsignedByte();
                                                                    parsableByteArray2.skipBytes(3);
                                                                    if (readUnsignedByte15 == 0) {
                                                                        int readUnsignedByte16 = parsableByteArray2.readUnsignedByte();
                                                                        if (readUnsignedByte16 == 0) {
                                                                            i91 = 0;
                                                                        } else if (readUnsignedByte16 == 1) {
                                                                            i91 = 1;
                                                                        } else if (readUnsignedByte16 == 2) {
                                                                            i91 = 2;
                                                                        } else if (readUnsignedByte16 == 3) {
                                                                            i91 = 3;
                                                                        }
                                                                    }
                                                                    i35 = i91;
                                                                    i37 = i86;
                                                                    i34 = i90;
                                                                } else if (readInt5 == 1634760259) {
                                                                    int i106 = readInt4 - 12;
                                                                    byte[] bArr11 = new byte[i106];
                                                                    parsableByteArray2.setPosition(i44 + 12);
                                                                    parsableByteArray2.readBytes(0, i106, bArr11);
                                                                    byte[] bArr12 = CodecSpecificDataUtil.NAL_START_CODE;
                                                                    Trace.checkArgument("Invalid APV CSD length: %s", i106, i106 >= 17);
                                                                    byte b3 = bArr11[0];
                                                                    Trace.checkArgument("Invalid APV CSD version: %s", b3, b3 == 1);
                                                                    int unsignedInt = Byte.toUnsignedInt(bArr11[5]);
                                                                    int unsignedInt2 = Byte.toUnsignedInt(bArr11[6]);
                                                                    int unsignedInt3 = Byte.toUnsignedInt(bArr11[7]);
                                                                    String str18 = Util.DEVICE_DEBUG_INFO;
                                                                    Locale locale2 = Locale.US;
                                                                    StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(unsignedInt, unsignedInt2, "apv1.apvf", ".apvl", ".apvb");
                                                                    m107m.append(unsignedInt3);
                                                                    str11 = m107m.toString();
                                                                    list = ImmutableList.of((Object) bArr11);
                                                                    ParsableByteArray parsableByteArray3 = new ParsableByteArray(bArr11);
                                                                    VorbisBitArray vorbisBitArray2 = new VorbisBitArray(bArr11, i106);
                                                                    i9 = 8;
                                                                    vorbisBitArray2.setPosition(parsableByteArray3.position * 8);
                                                                    vorbisBitArray2.skipBytes(1);
                                                                    int readBits11 = vorbisBitArray2.readBits(8);
                                                                    int i107 = 0;
                                                                    int i108 = -1;
                                                                    int i109 = -1;
                                                                    int i110 = -1;
                                                                    int i111 = -1;
                                                                    int i112 = -1;
                                                                    while (i107 < readBits11) {
                                                                        vorbisBitArray2.skipBytes(1);
                                                                        int readBits12 = vorbisBitArray2.readBits(8);
                                                                        int i113 = i112;
                                                                        int i114 = i111;
                                                                        int i115 = i110;
                                                                        int i116 = i109;
                                                                        int i117 = i108;
                                                                        int i118 = 0;
                                                                        while (i118 < readBits12) {
                                                                            vorbisBitArray2.skipBits(6);
                                                                            boolean readBit6 = vorbisBitArray2.readBit();
                                                                            vorbisBitArray2.skipBit();
                                                                            vorbisBitArray2.skipBytes(i94);
                                                                            vorbisBitArray2.skipBits(4);
                                                                            i115 = vorbisBitArray2.readBits(4) + 8;
                                                                            vorbisBitArray2.skipBytes(1);
                                                                            if (readBit6) {
                                                                                int readBits13 = vorbisBitArray2.readBits(8);
                                                                                int readBits14 = vorbisBitArray2.readBits(8);
                                                                                vorbisBitArray2.skipBytes(1);
                                                                                boolean readBit7 = vorbisBitArray2.readBit();
                                                                                int isoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(readBits13);
                                                                                i114 = readBit7 ? 1 : 2;
                                                                                i116 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits14);
                                                                                i113 = isoColorPrimariesToColorSpace2;
                                                                            }
                                                                            i118++;
                                                                            i117 = i115;
                                                                            i94 = 11;
                                                                        }
                                                                        i107++;
                                                                        i108 = i117;
                                                                        i109 = i116;
                                                                        i110 = i115;
                                                                        i111 = i114;
                                                                        i112 = i113;
                                                                        i94 = 11;
                                                                    }
                                                                    str6 = "video/apv";
                                                                    i6 = i109;
                                                                    i7 = i110;
                                                                    i37 = i111;
                                                                    i38 = i112;
                                                                    i35 = i91;
                                                                    i34 = i108;
                                                                } else {
                                                                    i9 = 8;
                                                                    if (readInt5 == 1668246642) {
                                                                        i10 = i6;
                                                                        if (i38 == -1 && i10 == -1) {
                                                                            int readInt9 = parsableByteArray2.readInt();
                                                                            if (readInt9 == 1852009592 || readInt9 == 1852009571) {
                                                                                int readUnsignedShort7 = parsableByteArray2.readUnsignedShort();
                                                                                int readUnsignedShort8 = parsableByteArray2.readUnsignedShort();
                                                                                parsableByteArray2.skipBytes(2);
                                                                                boolean z10 = readInt4 == 19 && (parsableByteArray2.readUnsignedByte() & 128) != 0;
                                                                                i38 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort7);
                                                                                i37 = z10 ? 1 : 2;
                                                                                i6 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort8);
                                                                            } else {
                                                                                Log.w("BoxParsers", "Unsupported color type: ".concat(Buffer.getBoxTypeString(readInt9)));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i10 = i6;
                                                                    }
                                                                    i6 = i10;
                                                                }
                                                                i35 = i91;
                                                                i34 = i90;
                                                            }
                                                            i9 = 8;
                                                        }
                                                        i37 = i86;
                                                        i9 = 8;
                                                        i35 = i91;
                                                        i34 = i90;
                                                    }
                                                }
                                                i37 = i86;
                                                bArr = null;
                                                i9 = 8;
                                                i35 = i91;
                                                i34 = i90;
                                            }
                                        }
                                        i37 = i86;
                                        i35 = i91;
                                        i34 = i90;
                                    }
                                    i9 = 8;
                                }
                            }
                        }
                    }
                    i33 = i45 + readInt4;
                    bArr3 = bArr;
                    i30 = i9;
                    readInt3 = i8;
                    readInt2 = i46;
                    str10 = str5;
                    str12 = str6;
                    i36 = i6;
                    i43 = i7;
                    unleashContext2 = unleashContext;
                    b = 3;
                }
                int i119 = i34;
                int i120 = i35;
                i5 = readInt2;
                int i121 = i36;
                String str19 = str12;
                int i122 = i43;
                int i123 = i37;
                byte[] bArr13 = bArr3;
                if (joiner != null) {
                    str2 = joiner.separator;
                    str3 = "video/dolby-vision";
                } else {
                    str2 = str11;
                    str3 = str19;
                }
                if (str3 == null) {
                    str4 = str;
                } else {
                    Format.Builder builder2 = new Format.Builder();
                    builder2.id = Integer.toString(i3);
                    builder2.sampleMimeType = MimeTypes.normalizeMimeType(str3);
                    builder2.codecs = str2;
                    builder2.width = readUnsignedShort;
                    builder2.height = readUnsignedShort2;
                    builder2.decodedWidth = i42;
                    builder2.decodedHeight = i41;
                    builder2.pixelWidthHeightRatio = f;
                    builder2.rotationDegrees = i31;
                    builder2.projectionData = bArr4;
                    builder2.stereoMode = i120;
                    builder2.initializationData = list;
                    builder2.maxNumReorderSamples = i40;
                    builder2.maxSubLayers = i39;
                    builder2.drmInitData = drmInitData4;
                    str4 = str;
                    builder2.language = str4;
                    builder2.colorInfo = new ColorInfo(i38, i123, i121, i122, i119, byteBuffer != null ? byteBuffer.array() : bArr13);
                    EocdRecord eocdRecord2 = eocdRecord;
                    if (eocdRecord2 != null) {
                        builder2.averageBitrate = CompositeException.WrappedPrintStream.saturatedCast(eocdRecord2.entryCount);
                        builder2.peakBitrate = CompositeException.WrappedPrintStream.saturatedCast(eocdRecord2.centralDirectoryOffset);
                    } else {
                        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$12 = realStrongMemoryCache$cache$1;
                        if (realStrongMemoryCache$cache$12 != null) {
                            builder2.averageBitrate = CompositeException.WrappedPrintStream.saturatedCast(realStrongMemoryCache$cache$12.maxSize);
                            builder2.peakBitrate = CompositeException.WrappedPrintStream.saturatedCast(realStrongMemoryCache$cache$12.size);
                        }
                    }
                    timedValueQueue.values = new Format(builder2);
                }
            } else {
                if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678 || readInt3 == 1768973165 || readInt3 == 1718641517) {
                    parsableByteArray2 = parsableByteArray;
                    parseAudioSampleEntry(parsableByteArray2, readInt3, i29, readInt2, tkhdData2.id, str9, z, drmInitData, timedValueQueue, i28);
                    str4 = str;
                    i2 = i29;
                    i5 = readInt2;
                } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672 || readInt3 == 1836070003) {
                    parsableByteArray2.setPosition(i29 + 16);
                    String str20 = "application/ttml+xml";
                    long j = Long.MAX_VALUE;
                    if (readInt3 != 1414810956) {
                        if (readInt3 == 1954034535) {
                            int i124 = readInt2 - 16;
                            byte[] bArr14 = new byte[i124];
                            parsableByteArray2.readBytes(0, i124, bArr14);
                            regularImmutableList = ImmutableList.of((Object) bArr14);
                            str20 = "application/x-quicktime-tx3g";
                            i25 = i29;
                            i26 = readInt2;
                        } else if (readInt3 == 2004251764) {
                            str20 = "application/x-mp4-vtt";
                        } else if (readInt3 == 1937010800) {
                            j = 0;
                        } else if (readInt3 == 1664495672) {
                            timedValueQueue.size = 1;
                            str20 = "application/x-mp4-cea-608";
                        } else {
                            if (readInt3 != 1836070003) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            int i125 = parsableByteArray2.position;
                            parsableByteArray2.skipBytes(4);
                            if (parsableByteArray2.readInt() == 1702061171) {
                                byte[] bArr15 = (byte[]) parseEsdsFromParent(i125, parsableByteArray2).this$0;
                                if (bArr15 == null || bArr15.length != 64) {
                                    i25 = i29;
                                    i26 = readInt2;
                                    parsableByteArray2 = parsableByteArray;
                                    str4 = str9;
                                    i = i28;
                                    i3 = i27;
                                    i4 = readInt;
                                    i5 = i26;
                                    i2 = i25;
                                } else {
                                    int i126 = tkhdData2.width;
                                    int i127 = tkhdData2.height;
                                    Trace.checkState(bArr15.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i128 = 0;
                                    while (i128 < bArr15.length - 3) {
                                        byte[] bArr16 = bArr15;
                                        int fromBytes = CompositeException.WrappedPrintStream.fromBytes(bArr15[i128], bArr15[i128 + 1], bArr15[i128 + 2], bArr16[i128 + 3]);
                                        int i129 = (fromBytes >> 16) & 255;
                                        int i130 = ((fromBytes >> 8) & 255) - 128;
                                        int i131 = (fromBytes & 255) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(Util.constrainValue(Boxes$$ExternalSyntheticOutline1.m$2(i131, 17790, 10000, i129), 0, 255) | (Util.constrainValue((i129 - ((i131 * 3455) / 10000)) - ((i130 * 7169) / 10000), 0, 255) << 8) | (Util.constrainValue(Boxes$$ExternalSyntheticOutline1.m$2(i130, 14075, 10000, i129), 0, 255) << 16))));
                                        i128 += 4;
                                        bArr15 = bArr16;
                                        i29 = i29;
                                        readInt2 = readInt2;
                                    }
                                    i25 = i29;
                                    i26 = readInt2;
                                    StringBuilder m107m2 = Recorder$$ExternalSyntheticOutline2.m107m(i126, i127, "size: ", "x", "\npalette: ");
                                    m107m2.append(new Joiner(", ").join(arrayList.iterator()));
                                    m107m2.append("\n");
                                    String sb = m107m2.toString();
                                    String str21 = Util.DEVICE_DEBUG_INFO;
                                    regularImmutableList = ImmutableList.of((Object) sb.getBytes(StandardCharsets.UTF_8));
                                    str8 = "application/vobsub";
                                }
                            } else {
                                i25 = i29;
                                i26 = readInt2;
                                str8 = null;
                                regularImmutableList = null;
                            }
                            str20 = str8;
                        }
                        long j2 = j;
                        if (str20 != null) {
                            Format.Builder builder3 = new Format.Builder();
                            builder3.id = Integer.toString(i27);
                            builder3.sampleMimeType = MimeTypes.normalizeMimeType(str20);
                            builder3.language = str9;
                            builder3.subsampleOffsetUs = j2;
                            builder3.initializationData = regularImmutableList;
                            timedValueQueue.values = new Format(builder3);
                        }
                        parsableByteArray2 = parsableByteArray;
                        str4 = str9;
                        i = i28;
                        i3 = i27;
                        i4 = readInt;
                        i5 = i26;
                        i2 = i25;
                    }
                    i25 = i29;
                    i26 = readInt2;
                    regularImmutableList = null;
                    long j22 = j;
                    if (str20 != null) {
                    }
                    parsableByteArray2 = parsableByteArray;
                    str4 = str9;
                    i = i28;
                    i3 = i27;
                    i4 = readInt;
                    i5 = i26;
                    i2 = i25;
                } else {
                    if (readInt3 == 1835365492) {
                        parsableByteArray2.setPosition(i29 + 16);
                        if (readInt3 == 1835365492) {
                            parsableByteArray2.readNullTerminatedString();
                            String readNullTerminatedString = parsableByteArray2.readNullTerminatedString();
                            if (readNullTerminatedString != null) {
                                Format.Builder builder4 = new Format.Builder();
                                builder4.id = Integer.toString(i27);
                                builder4.sampleMimeType = MimeTypes.normalizeMimeType(readNullTerminatedString);
                                timedValueQueue.values = new Format(builder4);
                            }
                        }
                    } else if (readInt3 == 1667329389) {
                        Format.Builder builder5 = new Format.Builder();
                        builder5.id = Integer.toString(i27);
                        builder5.sampleMimeType = MimeTypes.normalizeMimeType("application/x-camera-motion");
                        timedValueQueue.values = new Format(builder5);
                    }
                    i2 = i29;
                    i5 = readInt2;
                    str4 = str9;
                }
                i = i28;
                i3 = i27;
                i4 = readInt;
            }
            parsableByteArray2.setPosition(i2 + i5);
            i28 = i + 1;
            tkhdData2 = tkhdData;
            str9 = str4;
            i27 = i3;
            readInt = i4;
        }
        return timedValueQueue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x00e8, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x00ea, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList parseTraks(Mp4Box$ContainerBox mp4Box$ContainerBox, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function function, boolean z3) {
        int i;
        long j2;
        long j3;
        long j4;
        ArrayList arrayList;
        int i2;
        long j5;
        long j6;
        long scaleLargeValue;
        int i3;
        int i4;
        int i5;
        String str;
        Mp4Box$LeafBox leafBoxOfType;
        long[] jArr;
        long[] jArr2;
        Format format2;
        Format format3;
        Function function2;
        Track track;
        Mp4Box$ContainerBox containerBoxOfType;
        Pair create;
        SampleSizeBox longArrayQueue;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        ArrayList arrayList2;
        int i9;
        long[] jArr3;
        long[] jArr4;
        int i10;
        int[] iArr;
        boolean z6;
        int i11;
        long j7;
        int i12;
        int[] iArr2;
        int i13;
        long j8;
        long j9;
        int i14;
        long[] jArr5;
        long j10;
        long[] jArr6;
        ArrayList arrayList3;
        long j11;
        long j12;
        long[] jArr7;
        int i15;
        boolean z7;
        int i16;
        boolean z8;
        TrackSampleTable trackSampleTable;
        ArrayList arrayList4;
        boolean z9;
        int[] iArr3;
        long[] jArr8;
        int i17;
        TrackSampleTable trackSampleTable2;
        long scaleLargeValue2;
        Mp4Box$ContainerBox mp4Box$ContainerBox2 = mp4Box$ContainerBox;
        ArrayList arrayList5 = new ArrayList();
        int i18 = 0;
        for (ArrayList arrayList6 = mp4Box$ContainerBox2.containerChildren; i18 < arrayList6.size(); arrayList6 = arrayList) {
            Mp4Box$ContainerBox mp4Box$ContainerBox3 = (Mp4Box$ContainerBox) arrayList6.get(i18);
            if (mp4Box$ContainerBox3.flags != 1953653099) {
                arrayList = arrayList6;
                arrayList4 = arrayList5;
                i = i18;
            } else {
                Mp4Box$LeafBox leafBoxOfType2 = mp4Box$ContainerBox2.getLeafBoxOfType(1836476516);
                leafBoxOfType2.getClass();
                Mp4Box$ContainerBox containerBoxOfType2 = mp4Box$ContainerBox3.getContainerBoxOfType(1835297121);
                containerBoxOfType2.getClass();
                Mp4Box$LeafBox leafBoxOfType3 = containerBoxOfType2.getLeafBoxOfType(1751411826);
                leafBoxOfType3.getClass();
                ParsableByteArray parsableByteArray = leafBoxOfType3.data;
                parsableByteArray.setPosition(16);
                int readInt = parsableByteArray.readInt();
                int i19 = readInt == 1936684398 ? 1 : readInt == 1986618469 ? 2 : (readInt == 1952807028 || readInt == 1935832172 || readInt == 1937072756 || readInt == 1668047728 || readInt == 1937072752) ? 3 : readInt == 1835365473 ? 5 : -1;
                int i20 = 1;
                i = i18;
                if (i19 == -1) {
                    arrayList = arrayList6;
                    track = null;
                    j2 = 0;
                    function2 = function;
                } else {
                    j2 = 0;
                    Mp4Box$LeafBox leafBoxOfType4 = mp4Box$ContainerBox3.getLeafBoxOfType(1953196132);
                    leafBoxOfType4.getClass();
                    ParsableByteArray parsableByteArray2 = leafBoxOfType4.data;
                    parsableByteArray2.setPosition(8);
                    int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray2.readInt());
                    parsableByteArray2.skipBytes(parseFullBoxVersion != 0 ? 16 : 8);
                    int readInt2 = parsableByteArray2.readInt();
                    parsableByteArray2.skipBytes(4);
                    int i21 = parsableByteArray2.position;
                    int i22 = parseFullBoxVersion == 0 ? 4 : 8;
                    int i23 = 0;
                    while (true) {
                        j3 = -9223372036854775807L;
                        if (i23 >= i22) {
                            parsableByteArray2.skipBytes(i22);
                            break;
                        }
                        if (parsableByteArray2.data[i21 + i23] != -1) {
                            j4 = parseFullBoxVersion == 0 ? parsableByteArray2.readUnsignedInt() : parsableByteArray2.readUnsignedLongToLong();
                        } else {
                            i23++;
                        }
                    }
                    parsableByteArray2.skipBytes(10);
                    int readUnsignedShort = parsableByteArray2.readUnsignedShort();
                    parsableByteArray2.skipBytes(4);
                    int readInt3 = parsableByteArray2.readInt();
                    int readInt4 = parsableByteArray2.readInt();
                    parsableByteArray2.skipBytes(4);
                    int readInt5 = parsableByteArray2.readInt();
                    int readInt6 = parsableByteArray2.readInt();
                    if (readInt3 == 0 && readInt4 == 65536) {
                        arrayList = arrayList6;
                        if ((readInt5 == -65536 || readInt5 == 65536) && readInt6 == 0) {
                            i2 = 90;
                            parsableByteArray2.skipBytes(16);
                            short readShort = parsableByteArray2.readShort();
                            parsableByteArray2.skipBytes(2);
                            short readShort2 = parsableByteArray2.readShort();
                            TkhdData tkhdData = new TkhdData();
                            tkhdData.id = readInt2;
                            tkhdData.alternateGroup = readUnsignedShort;
                            tkhdData.rotationDegrees = i2;
                            tkhdData.width = readShort;
                            tkhdData.height = readShort2;
                            j5 = j != -9223372036854775807L ? j4 : j;
                            long j13 = parseMvhd(leafBoxOfType2.data).timescale;
                            if (j5 != -9223372036854775807L) {
                                j6 = j13;
                                scaleLargeValue = -9223372036854775807L;
                            } else {
                                String str2 = Util.DEVICE_DEBUG_INFO;
                                j6 = j13;
                                scaleLargeValue = Util.scaleLargeValue(j5, 1000000L, j6, RoundingMode.DOWN);
                            }
                            Mp4Box$ContainerBox containerBoxOfType3 = containerBoxOfType2.getContainerBoxOfType(1835626086);
                            containerBoxOfType3.getClass();
                            Mp4Box$ContainerBox containerBoxOfType4 = containerBoxOfType3.getContainerBoxOfType(1937007212);
                            containerBoxOfType4.getClass();
                            Mp4Box$LeafBox leafBoxOfType5 = containerBoxOfType2.getLeafBoxOfType(1835296868);
                            leafBoxOfType5.getClass();
                            ParsableByteArray parsableByteArray3 = leafBoxOfType5.data;
                            parsableByteArray3.setPosition(8);
                            int parseFullBoxVersion2 = parseFullBoxVersion(parsableByteArray3.readInt());
                            parsableByteArray3.skipBytes(parseFullBoxVersion2 != 0 ? 8 : 16);
                            long readUnsignedInt = parsableByteArray3.readUnsignedInt();
                            int i24 = parsableByteArray3.position;
                            i3 = parseFullBoxVersion2 != 0 ? 4 : 8;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    parsableByteArray3.skipBytes(i3);
                                    break;
                                }
                                if (parsableByteArray3.data[i24 + i4] != -1) {
                                    long readUnsignedInt2 = parseFullBoxVersion2 == 0 ? parsableByteArray3.readUnsignedInt() : parsableByteArray3.readUnsignedLongToLong();
                                    if (readUnsignedInt2 != 0) {
                                        String str3 = Util.DEVICE_DEBUG_INFO;
                                        j3 = Util.scaleLargeValue(readUnsignedInt2, 1000000L, readUnsignedInt, RoundingMode.DOWN);
                                    }
                                } else {
                                    i4++;
                                }
                            }
                            long j14 = j3;
                            int readUnsignedShort2 = parsableByteArray3.readUnsignedShort();
                            char[] cArr = {(char) (((readUnsignedShort2 >> 10) & 31) + 96), (char) (((readUnsignedShort2 >> 5) & 31) + 96), (char) ((readUnsignedShort2 & 31) + 96)};
                            for (i5 = 0; i5 < 3; i5++) {
                                char c = cArr[i5];
                                if (c < 'a' || c > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            leafBoxOfType = containerBoxOfType4.getLeafBoxOfType(1937011556);
                            if (leafBoxOfType != null) {
                                Log.w("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                TimedValueQueue parseStsd = parseStsd(leafBoxOfType.data, tkhdData, str, drmInitData, z2);
                                if (!z && (containerBoxOfType = mp4Box$ContainerBox3.getContainerBoxOfType(1701082227)) != null) {
                                    Mp4Box$LeafBox leafBoxOfType6 = containerBoxOfType.getLeafBoxOfType(1701606260);
                                    if (leafBoxOfType6 == null) {
                                        create = null;
                                    } else {
                                        ParsableByteArray parsableByteArray4 = leafBoxOfType6.data;
                                        parsableByteArray4.setPosition(8);
                                        int parseFullBoxVersion3 = parseFullBoxVersion(parsableByteArray4.readInt());
                                        int readUnsignedIntToInt = parsableByteArray4.readUnsignedIntToInt();
                                        long[] jArr9 = new long[readUnsignedIntToInt];
                                        long[] jArr10 = new long[readUnsignedIntToInt];
                                        int i25 = 0;
                                        while (i25 < readUnsignedIntToInt) {
                                            int i26 = i20;
                                            jArr9[i25] = parseFullBoxVersion3 == i26 ? parsableByteArray4.readUnsignedLongToLong() : parsableByteArray4.readUnsignedInt();
                                            jArr10[i25] = parseFullBoxVersion3 == i26 ? parsableByteArray4.readLong() : parsableByteArray4.readInt();
                                            if (parsableByteArray4.readShort() != 1) {
                                                a$$ExternalSyntheticBUOutline0.m$3("Unsupported media rate.");
                                                return null;
                                            }
                                            parsableByteArray4.skipBytes(2);
                                            i25++;
                                            i20 = 1;
                                        }
                                        create = Pair.create(jArr9, jArr10);
                                    }
                                    if (create != null) {
                                        long[] jArr11 = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        jArr = jArr11;
                                        format2 = (Format) parseStsd.values;
                                        if (format2 != null) {
                                            int i27 = tkhdData.alternateGroup;
                                            if (i27 != 0) {
                                                Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(i27);
                                                Format.Builder buildUpon = format2.buildUpon();
                                                Metadata metadata = ((Format) parseStsd.values).metadata;
                                                buildUpon.metadata = metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData);
                                                format3 = new Format(buildUpon);
                                            } else {
                                                format3 = format2;
                                            }
                                            function2 = function;
                                            track = new Track(tkhdData.id, i19, readUnsignedInt, j6, scaleLargeValue, j14, format3, parseStsd.size, (TrackEncryptionBox[]) parseStsd.timestamps, parseStsd.first, jArr, jArr2);
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                format2 = (Format) parseStsd.values;
                                if (format2 != null) {
                                }
                            }
                            function2 = function;
                            track = null;
                        }
                    } else {
                        arrayList = arrayList6;
                    }
                    i2 = (readInt3 == 0 && readInt4 == -65536 && (readInt5 == 65536 || readInt5 == -65536) && readInt6 == 0) ? EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE : ((readInt3 == -65536 || readInt3 == 65536) && readInt4 == 0 && readInt5 == 0 && readInt6 == -65536) ? EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0;
                    parsableByteArray2.skipBytes(16);
                    short readShort3 = parsableByteArray2.readShort();
                    parsableByteArray2.skipBytes(2);
                    short readShort22 = parsableByteArray2.readShort();
                    TkhdData tkhdData2 = new TkhdData();
                    tkhdData2.id = readInt2;
                    tkhdData2.alternateGroup = readUnsignedShort;
                    tkhdData2.rotationDegrees = i2;
                    tkhdData2.width = readShort3;
                    tkhdData2.height = readShort22;
                    if (j != -9223372036854775807L) {
                    }
                    long j132 = parseMvhd(leafBoxOfType2.data).timescale;
                    if (j5 != -9223372036854775807L) {
                    }
                    Mp4Box$ContainerBox containerBoxOfType32 = containerBoxOfType2.getContainerBoxOfType(1835626086);
                    containerBoxOfType32.getClass();
                    Mp4Box$ContainerBox containerBoxOfType42 = containerBoxOfType32.getContainerBoxOfType(1937007212);
                    containerBoxOfType42.getClass();
                    Mp4Box$LeafBox leafBoxOfType52 = containerBoxOfType2.getLeafBoxOfType(1835296868);
                    leafBoxOfType52.getClass();
                    ParsableByteArray parsableByteArray32 = leafBoxOfType52.data;
                    parsableByteArray32.setPosition(8);
                    int parseFullBoxVersion22 = parseFullBoxVersion(parsableByteArray32.readInt());
                    parsableByteArray32.skipBytes(parseFullBoxVersion22 != 0 ? 8 : 16);
                    long readUnsignedInt3 = parsableByteArray32.readUnsignedInt();
                    int i242 = parsableByteArray32.position;
                    if (parseFullBoxVersion22 != 0) {
                    }
                    i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                        }
                        i4++;
                    }
                    long j142 = j3;
                    int readUnsignedShort22 = parsableByteArray32.readUnsignedShort();
                    char[] cArr2 = {(char) (((readUnsignedShort22 >> 10) & 31) + 96), (char) (((readUnsignedShort22 >> 5) & 31) + 96), (char) ((readUnsignedShort22 & 31) + 96)};
                    while (i5 < 3) {
                    }
                    str = new String(cArr2);
                    leafBoxOfType = containerBoxOfType42.getLeafBoxOfType(1937011556);
                    if (leafBoxOfType != null) {
                    }
                    function2 = function;
                    track = null;
                }
                Track track2 = (Track) function2.apply(track);
                if (track2 == null) {
                    arrayList4 = arrayList5;
                } else {
                    Format format4 = track2.f892format;
                    Mp4Box$ContainerBox containerBoxOfType5 = mp4Box$ContainerBox3.getContainerBoxOfType(1835297121);
                    containerBoxOfType5.getClass();
                    Mp4Box$ContainerBox containerBoxOfType6 = containerBoxOfType5.getContainerBoxOfType(1835626086);
                    containerBoxOfType6.getClass();
                    Mp4Box$ContainerBox containerBoxOfType7 = containerBoxOfType6.getContainerBoxOfType(1937007212);
                    containerBoxOfType7.getClass();
                    Mp4Box$LeafBox leafBoxOfType7 = containerBoxOfType7.getLeafBoxOfType(1937011578);
                    if (leafBoxOfType7 != null) {
                        longArrayQueue = new OffsetApplier(leafBoxOfType7, format4);
                    } else {
                        Mp4Box$LeafBox leafBoxOfType8 = containerBoxOfType7.getLeafBoxOfType(1937013298);
                        if (leafBoxOfType8 == null) {
                            throw ParserException.createForMalformedContainer(null, "Track has no sample table size information");
                        }
                        longArrayQueue = new LongArrayQueue(leafBoxOfType8);
                    }
                    int sampleCount = longArrayQueue.getSampleCount();
                    if (sampleCount == 0) {
                        arrayList4 = arrayList5;
                        trackSampleTable = new TrackSampleTable(track2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (track2.f893type == 2) {
                            long j15 = track2.mediaDurationUs;
                            if (j15 > j2) {
                                Format.Builder buildUpon2 = format4.buildUpon();
                                buildUpon2.frameRate = sampleCount / (j15 / 1000000.0f);
                                track2 = track2.copyWithFormat(new Format(buildUpon2));
                            }
                        }
                        Format format5 = track2.f892format;
                        Mp4Box$LeafBox leafBoxOfType9 = containerBoxOfType7.getLeafBoxOfType(1937007471);
                        if (leafBoxOfType9 == null) {
                            leafBoxOfType9 = containerBoxOfType7.getLeafBoxOfType(1668232756);
                            leafBoxOfType9.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ParsableByteArray parsableByteArray5 = leafBoxOfType9.data;
                        Mp4Box$LeafBox leafBoxOfType10 = containerBoxOfType7.getLeafBoxOfType(1937011555);
                        leafBoxOfType10.getClass();
                        ParsableByteArray parsableByteArray6 = leafBoxOfType10.data;
                        Mp4Box$LeafBox leafBoxOfType11 = containerBoxOfType7.getLeafBoxOfType(1937011827);
                        leafBoxOfType11.getClass();
                        ParsableByteArray parsableByteArray7 = leafBoxOfType11.data;
                        Mp4Box$LeafBox leafBoxOfType12 = containerBoxOfType7.getLeafBoxOfType(1937011571);
                        ParsableByteArray parsableByteArray8 = leafBoxOfType12 != null ? leafBoxOfType12.data : null;
                        Mp4Box$LeafBox leafBoxOfType13 = containerBoxOfType7.getLeafBoxOfType(1668576371);
                        ParsableByteArray parsableByteArray9 = leafBoxOfType13 != null ? leafBoxOfType13.data : null;
                        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray6, parsableByteArray5, z4);
                        parsableByteArray7.setPosition(12);
                        int readUnsignedIntToInt2 = parsableByteArray7.readUnsignedIntToInt() - 1;
                        int readUnsignedIntToInt3 = parsableByteArray7.readUnsignedIntToInt();
                        int readUnsignedIntToInt4 = parsableByteArray7.readUnsignedIntToInt();
                        if (parsableByteArray9 != null) {
                            parsableByteArray9.setPosition(12);
                            i6 = parsableByteArray9.readUnsignedIntToInt();
                        } else {
                            i6 = 0;
                        }
                        if (parsableByteArray8 != null) {
                            parsableByteArray8.setPosition(12);
                            i7 = parsableByteArray8.readUnsignedIntToInt();
                            if (i7 > 0) {
                                i8 = parsableByteArray8.readUnsignedIntToInt() - 1;
                                int fixedSampleSize = longArrayQueue.getFixedSampleSize();
                                ParsableByteArray parsableByteArray10 = parsableByteArray9;
                                String str4 = format5.sampleMimeType;
                                z5 = fixedSampleSize == -1 && ("audio/raw".equals(str4) || "audio/g711-mlaw".equals(str4) || "audio/g711-alaw".equals(str4)) && readUnsignedIntToInt2 == 0 && i6 == 0 && i7 == 0;
                                ArrayList arrayList7 = new ArrayList();
                                boolean z10 = parsableByteArray8 != null;
                                if (z5) {
                                    long[] jArr12 = z3 ? new long[0] : new long[sampleCount];
                                    SampleSizeBox sampleSizeBox = longArrayQueue;
                                    int[] iArr4 = z3 ? new int[0] : new int[sampleCount];
                                    int i28 = i7;
                                    long[] jArr13 = z3 ? new long[0] : new long[sampleCount];
                                    int[] iArr5 = z3 ? new int[0] : new int[sampleCount];
                                    arrayList2 = arrayList5;
                                    int i29 = i6;
                                    int i30 = i28;
                                    int i31 = readUnsignedIntToInt2;
                                    long j16 = j2;
                                    long j17 = j16;
                                    long j18 = j17;
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    int i35 = 0;
                                    int i36 = readUnsignedIntToInt4;
                                    int i37 = readUnsignedIntToInt3;
                                    int i38 = i8;
                                    ParsableByteArray parsableByteArray11 = parsableByteArray8;
                                    int i39 = 0;
                                    while (true) {
                                        if (i39 >= sampleCount) {
                                            i9 = i30;
                                            jArr3 = jArr12;
                                            jArr4 = jArr13;
                                            i10 = i34;
                                            iArr = iArr4;
                                            break;
                                        }
                                        boolean z11 = true;
                                        while (i34 == 0) {
                                            z11 = chunkIterator.moveNext();
                                            if (!z11) {
                                                break;
                                            }
                                            j18 = chunkIterator.offset;
                                            i34 = chunkIterator.numSamples;
                                            i30 = i30;
                                            i33 = i33;
                                        }
                                        int i40 = i33;
                                        i9 = i30;
                                        if (z11) {
                                            i33 = i40;
                                            if (parsableByteArray10 != null) {
                                                while (i35 == 0 && i29 > 0) {
                                                    i35 = parsableByteArray10.readUnsignedIntToInt();
                                                    i33 = parsableByteArray10.readInt();
                                                    i29--;
                                                }
                                                i35--;
                                            }
                                            int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                                            int i41 = sampleCount;
                                            int[] iArr6 = iArr4;
                                            long j19 = readNextSampleSize;
                                            j17 += j19;
                                            if (readNextSampleSize > i32) {
                                                i32 = readNextSampleSize;
                                            }
                                            if (z3) {
                                                i14 = i32;
                                                jArr5 = jArr12;
                                            } else {
                                                jArr12[i39] = j18;
                                                iArr6[i39] = readNextSampleSize;
                                                i14 = i32;
                                                jArr5 = jArr12;
                                                jArr13[i39] = j16 + i33;
                                                iArr5[i39] = parsableByteArray11 == null ? 1 : 0;
                                                if (i39 == i38) {
                                                    iArr5[i39] = 1;
                                                    arrayList7.add(Integer.valueOf(i39));
                                                }
                                            }
                                            if (parsableByteArray11 != null && i39 == i38) {
                                                int i42 = i9 - 1;
                                                if (i42 > 0) {
                                                    i9 = i42;
                                                    i38 = parsableByteArray11.readUnsignedIntToInt() - 1;
                                                } else {
                                                    i9 = i42;
                                                }
                                            }
                                            j16 += i36;
                                            i37--;
                                            if (i37 == 0 && i31 > 0) {
                                                i31--;
                                                i37 = parsableByteArray7.readUnsignedIntToInt();
                                                i36 = parsableByteArray7.readInt();
                                            }
                                            j18 += j19;
                                            i34--;
                                            i39++;
                                            jArr12 = jArr5;
                                            sampleCount = i41;
                                            i30 = i9;
                                            i32 = i14;
                                            iArr4 = iArr6;
                                        } else {
                                            Log.w("BoxParsers", "Unexpected end of chunk data");
                                            if (z3) {
                                                jArr3 = jArr12;
                                                jArr4 = jArr13;
                                                sampleCount = i39;
                                                i10 = i34;
                                                i33 = i40;
                                                iArr = iArr4;
                                            } else {
                                                long[] copyOf = Arrays.copyOf(jArr12, i39);
                                                int[] copyOf2 = Arrays.copyOf(iArr4, i39);
                                                jArr3 = copyOf;
                                                jArr4 = Arrays.copyOf(jArr13, i39);
                                                iArr5 = Arrays.copyOf(iArr5, i39);
                                                sampleCount = i39;
                                                i10 = i34;
                                                iArr = copyOf2;
                                                i33 = i40;
                                            }
                                        }
                                    }
                                    long j20 = j16 + i33;
                                    if (parsableByteArray10 != null) {
                                        while (i29 > 0) {
                                            if (parsableByteArray10.readUnsignedIntToInt() != 0) {
                                                z6 = false;
                                                break;
                                            }
                                            parsableByteArray10.readInt();
                                            i29--;
                                        }
                                    }
                                    z6 = true;
                                    if (i9 == 0 && i37 == 0 && i10 == 0 && i31 == 0 && i35 == 0 && z6) {
                                        i11 = i32;
                                        j7 = j20;
                                    } else {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        i11 = i32;
                                        j7 = j20;
                                        Recorder$$ExternalSyntheticOutline1.m105m(track2.id, i9, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                        Recorder$$ExternalSyntheticOutline1.m105m(i37, i10, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                        sb.append(i31);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i35);
                                        sb.append(!z6 ? ", ctts invalid" : "");
                                        Log.w("BoxParsers", sb.toString());
                                    }
                                    i12 = sampleCount;
                                    iArr2 = iArr5;
                                    i13 = i11;
                                    j8 = j7;
                                    j9 = j17;
                                } else {
                                    int i43 = chunkIterator.length;
                                    long[] jArr14 = new long[i43];
                                    int[] iArr7 = new int[i43];
                                    while (chunkIterator.moveNext()) {
                                        int i44 = chunkIterator.index;
                                        jArr14[i44] = chunkIterator.offset;
                                        iArr7[i44] = chunkIterator.numSamples;
                                    }
                                    long j21 = readUnsignedIntToInt4;
                                    int i45 = PKIFailureInfo.certRevoked / fixedSampleSize;
                                    int i46 = 0;
                                    for (int i47 = 0; i47 < i43; i47++) {
                                        i46 += Util.ceilDivide(iArr7[i47], i45);
                                    }
                                    jArr3 = new long[i46];
                                    iArr = new int[i46];
                                    jArr4 = new long[i46];
                                    int[] iArr8 = new int[i46];
                                    int i48 = 0;
                                    int i49 = 0;
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    while (i48 < i43) {
                                        int i53 = iArr7[i48];
                                        long j22 = jArr14[i48];
                                        int i54 = i52;
                                        int i55 = i48;
                                        int i56 = i51;
                                        int i57 = i54;
                                        int i58 = i43;
                                        int i59 = i53;
                                        while (i59 > 0) {
                                            int min = Math.min(i45, i59);
                                            jArr3[i57] = j22;
                                            int i60 = i59;
                                            int i61 = fixedSampleSize * min;
                                            iArr[i57] = i61;
                                            i56 = Math.max(i56, i61);
                                            long j23 = j21;
                                            jArr4[i57] = j23 * i49;
                                            iArr8[i57] = 1;
                                            j22 += iArr[i57];
                                            i49 += min;
                                            i57++;
                                            i50 += i61;
                                            i59 = i60 - min;
                                            j21 = j23;
                                        }
                                        int i62 = i55 + 1;
                                        i52 = i57;
                                        i51 = i56;
                                        i48 = i62;
                                        i43 = i58;
                                    }
                                    j8 = i49 * j21;
                                    j9 = i50;
                                    if (z3) {
                                        jArr3 = new long[0];
                                    }
                                    if (z3) {
                                        iArr = new int[0];
                                    }
                                    if (z3) {
                                        jArr4 = new long[0];
                                    }
                                    if (z3) {
                                        iArr8 = new int[0];
                                    }
                                    arrayList2 = arrayList5;
                                    i12 = i46;
                                    iArr2 = iArr8;
                                    i13 = i51;
                                }
                                long[] jArr15 = jArr3;
                                int[] iArr9 = iArr;
                                long[] jArr16 = jArr4;
                                j10 = track2.mediaDurationUs;
                                if (j10 > j2) {
                                    long scaleLargeValue3 = Util.scaleLargeValue(j9 * 8, 1000000L, j10, RoundingMode.HALF_DOWN);
                                    if (scaleLargeValue3 > j2 && scaleLargeValue3 < 2147483647L) {
                                        Format.Builder buildUpon3 = format5.buildUpon();
                                        buildUpon3.averageBitrate = (int) scaleLargeValue3;
                                        track2 = track2.copyWithFormat(new Format(buildUpon3));
                                    }
                                }
                                int i63 = track2.f893type;
                                long j24 = track2.timescale;
                                Format format6 = track2.f892format;
                                long[] jArr17 = track2.editListMediaTimes;
                                jArr6 = track2.editListDurations;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long scaleLargeValue4 = Util.scaleLargeValue(j8, 1000000L, j24, roundingMode);
                                int[] array2 = CompositeException.WrappedPrintStream.toArray(arrayList7);
                                if (jArr6 != null) {
                                    if (!z3) {
                                        Util.scaleLargeTimestampsInPlace(jArr16, j24);
                                    }
                                    trackSampleTable2 = new TrackSampleTable(track2, jArr15, iArr9, i13, jArr16, iArr2, array2, z10, scaleLargeValue4, i12);
                                } else if (z3) {
                                    jArr17.getClass();
                                    if (jArr6.length == 1 && jArr6[0] == j2) {
                                        scaleLargeValue2 = Util.scaleLargeValue(j8 - jArr17[0], 1000000L, track2.timescale, roundingMode);
                                    } else {
                                        long j25 = j2;
                                        for (int i64 = 0; i64 < jArr6.length; i64++) {
                                            if (jArr17[i64] != -1) {
                                                j25 += jArr6[i64];
                                            }
                                        }
                                        scaleLargeValue2 = Util.scaleLargeValue(j25, 1000000L, track2.movieTimescale, RoundingMode.DOWN);
                                    }
                                    trackSampleTable2 = new TrackSampleTable(track2, jArr15, iArr9, i13, jArr16, iArr2, array2, z10, scaleLargeValue2, i12);
                                } else {
                                    if (jArr6.length == 1 && i63 == 1 && jArr16.length >= 2) {
                                        jArr17.getClass();
                                        long j26 = jArr17[0];
                                        j12 = -1;
                                        arrayList3 = arrayList7;
                                        long scaleLargeValue5 = j26 + Util.scaleLargeValue(jArr6[0], track2.timescale, track2.movieTimescale, roundingMode);
                                        int length = jArr16.length - 1;
                                        int constrainValue = Util.constrainValue(4, 0, length);
                                        int constrainValue2 = Util.constrainValue(jArr16.length - 4, 0, length);
                                        if (jArr16[0] > j26 || j26 >= jArr16[constrainValue] || jArr16[constrainValue2] >= scaleLargeValue5 || scaleLargeValue5 > 2 + j8) {
                                            j11 = j8;
                                        } else {
                                            long max = Math.max(j2, j8 - scaleLargeValue5);
                                            long scaleLargeValue6 = Util.scaleLargeValue(j26 - jArr16[0], format6.sampleRate, track2.timescale, roundingMode);
                                            j11 = j8;
                                            jArr7 = jArr17;
                                            long scaleLargeValue7 = Util.scaleLargeValue(max, format6.sampleRate, track2.timescale, roundingMode);
                                            if (!(scaleLargeValue6 == j2 && scaleLargeValue7 == j2) && scaleLargeValue6 <= 2147483647L && scaleLargeValue7 <= 2147483647L) {
                                                gaplessInfoHolder.encoderDelay = (int) scaleLargeValue6;
                                                gaplessInfoHolder.encoderPadding = (int) scaleLargeValue7;
                                                Util.scaleLargeTimestampsInPlace(jArr16, j24);
                                                trackSampleTable2 = new TrackSampleTable(track2, jArr15, iArr9, i13, jArr16, iArr2, array2, z10, Util.scaleLargeValue(jArr6[0], 1000000L, track2.movieTimescale, roundingMode), i12);
                                            } else if (jArr6.length == 1 || jArr6[0] != 0) {
                                                int[] iArr10 = iArr2;
                                                int i65 = i12;
                                                boolean z12 = i63 != 1;
                                                int[] iArr11 = new int[jArr6.length];
                                                int[] iArr12 = new int[jArr6.length];
                                                jArr7.getClass();
                                                ArrayList arrayList8 = arrayList3;
                                                int i66 = 0;
                                                int i67 = 0;
                                                i15 = 0;
                                                boolean z13 = false;
                                                while (i15 < jArr6.length) {
                                                    int[] iArr13 = iArr12;
                                                    int i68 = i15;
                                                    long j27 = jArr7[i68];
                                                    if (j27 != j12) {
                                                        jArr8 = jArr7;
                                                        boolean z14 = z13;
                                                        long scaleLargeValue8 = Util.scaleLargeValue(jArr6[i68], track2.timescale, track2.movieTimescale, RoundingMode.DOWN) + j27;
                                                        iArr3 = iArr13;
                                                        iArr11[i68] = Util.binarySearchFloor(jArr16, j27, true);
                                                        int binarySearchCeil = Util.binarySearchCeil(jArr16, scaleLargeValue8, z12);
                                                        z9 = z12;
                                                        int i69 = binarySearchCeil - 1;
                                                        int i70 = 0;
                                                        for (int i71 = binarySearchCeil; i71 < jArr16.length; i71++) {
                                                            if (jArr16[i71] >= scaleLargeValue8) {
                                                                i70++;
                                                                if (i70 > format6.maxNumReorderSamples) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i69 = i71;
                                                            }
                                                        }
                                                        iArr3[i68] = i69 + 1;
                                                        int i72 = iArr11[i68];
                                                        while (true) {
                                                            i17 = iArr11[i68];
                                                            if (i17 <= 0 || (iArr10[i17] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr11[i68] = i17 - 1;
                                                        }
                                                        if (i17 == 0 && (iArr10[0] & 1) == 0) {
                                                            iArr11[i68] = i72;
                                                            while (true) {
                                                                int i73 = iArr11[i68];
                                                                if (i73 >= iArr3[i68] || (iArr10[i73] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr11[i68] = i73 + 1;
                                                            }
                                                        }
                                                        int i74 = iArr3[i68];
                                                        int i75 = iArr11[i68];
                                                        int i76 = (i74 - i75) + i66;
                                                        z13 = z14 | (i67 != i75);
                                                        i67 = i74;
                                                        i66 = i76;
                                                    } else {
                                                        z9 = z12;
                                                        iArr3 = iArr13;
                                                        jArr8 = jArr7;
                                                    }
                                                    i15 = i68 + 1;
                                                    jArr7 = jArr8;
                                                    iArr12 = iArr3;
                                                    z12 = z9;
                                                }
                                                int[] iArr14 = iArr12;
                                                long[] jArr18 = jArr7;
                                                z7 = z13 | (i66 == i65);
                                                long[] jArr19 = !z7 ? new long[i66] : jArr15;
                                                int[] iArr15 = !z7 ? new int[i66] : iArr9;
                                                if (z7) {
                                                    i13 = 0;
                                                }
                                                int[] iArr16 = !z7 ? new int[i66] : iArr10;
                                                ArrayList arrayList9 = !z7 ? new ArrayList() : arrayList8;
                                                long[] jArr20 = new long[i66];
                                                i16 = 0;
                                                z8 = false;
                                                int i77 = 0;
                                                long j28 = 0;
                                                while (i16 < jArr6.length) {
                                                    long j29 = jArr18[i16];
                                                    int i78 = iArr11[i16];
                                                    boolean z15 = z7;
                                                    int i79 = iArr14[i16];
                                                    Format format7 = format6;
                                                    if (z15) {
                                                        int i80 = i79 - i78;
                                                        System.arraycopy(jArr15, i78, jArr19, i77, i80);
                                                        System.arraycopy(iArr9, i78, iArr15, i77, i80);
                                                        System.arraycopy(iArr10, i78, iArr16, i77, i80);
                                                    }
                                                    int i81 = i13;
                                                    while (i78 < i79) {
                                                        int i82 = i78;
                                                        int i83 = i79;
                                                        long j30 = track2.movieTimescale;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long scaleLargeValue9 = Util.scaleLargeValue(j28, 1000000L, j30, roundingMode2);
                                                        long scaleLargeValue10 = Util.scaleLargeValue(jArr16[i82] - j29, 1000000L, track2.timescale, roundingMode2);
                                                        if (scaleLargeValue10 < 0) {
                                                            z8 = true;
                                                        }
                                                        jArr20[i77] = scaleLargeValue9 + scaleLargeValue10;
                                                        if (z15 && iArr15[i77] > i81) {
                                                            i81 = iArr9[i82];
                                                        }
                                                        if (z15 && !z10 && (iArr16[i77] & 1) != 0) {
                                                            arrayList9.add(Integer.valueOf(i77));
                                                        }
                                                        i77++;
                                                        i78 = i82 + 1;
                                                        i79 = i83;
                                                    }
                                                    j28 += jArr6[i16];
                                                    i16++;
                                                    i13 = i81;
                                                    z7 = z15;
                                                    format6 = format7;
                                                }
                                                Format format8 = format6;
                                                long scaleLargeValue11 = Util.scaleLargeValue(j28, 1000000L, track2.movieTimescale, RoundingMode.DOWN);
                                                if (z8) {
                                                    Format.Builder buildUpon4 = format8.buildUpon();
                                                    buildUpon4.hasPrerollSamples = true;
                                                    track2 = track2.copyWithFormat(new Format(buildUpon4));
                                                }
                                                trackSampleTable = new TrackSampleTable(track2, jArr19, iArr15, i13, jArr20, iArr16, CompositeException.WrappedPrintStream.toArray(arrayList9), z10, scaleLargeValue11, jArr19.length);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(trackSampleTable);
                                            } else {
                                                jArr7.getClass();
                                                long j31 = jArr7[0];
                                                for (int i84 = 0; i84 < jArr16.length; i84++) {
                                                    jArr16[i84] = Util.scaleLargeValue(jArr16[i84] - j31, 1000000L, track2.timescale, RoundingMode.DOWN);
                                                }
                                                trackSampleTable2 = new TrackSampleTable(track2, jArr15, iArr9, i13, jArr16, iArr2, array2, z10, Util.scaleLargeValue(j11 - j31, 1000000L, track2.timescale, RoundingMode.DOWN), i12);
                                            }
                                        }
                                    } else {
                                        arrayList3 = arrayList7;
                                        j11 = j8;
                                        j12 = -1;
                                    }
                                    jArr7 = jArr17;
                                    if (jArr6.length == 1) {
                                    }
                                    int[] iArr102 = iArr2;
                                    int i652 = i12;
                                    if (i63 != 1) {
                                    }
                                    int[] iArr112 = new int[jArr6.length];
                                    int[] iArr122 = new int[jArr6.length];
                                    jArr7.getClass();
                                    ArrayList arrayList82 = arrayList3;
                                    int i662 = 0;
                                    int i672 = 0;
                                    i15 = 0;
                                    boolean z132 = false;
                                    while (i15 < jArr6.length) {
                                    }
                                    int[] iArr142 = iArr122;
                                    long[] jArr182 = jArr7;
                                    z7 = z132 | (i662 == i652);
                                    if (!z7) {
                                    }
                                    if (!z7) {
                                    }
                                    if (z7) {
                                    }
                                    if (!z7) {
                                    }
                                    if (!z7) {
                                    }
                                    long[] jArr202 = new long[i662];
                                    i16 = 0;
                                    z8 = false;
                                    int i772 = 0;
                                    long j282 = 0;
                                    while (i16 < jArr6.length) {
                                    }
                                    Format format82 = format6;
                                    long scaleLargeValue112 = Util.scaleLargeValue(j282, 1000000L, track2.movieTimescale, RoundingMode.DOWN);
                                    if (z8) {
                                    }
                                    trackSampleTable = new TrackSampleTable(track2, jArr19, iArr15, i13, jArr202, iArr16, CompositeException.WrappedPrintStream.toArray(arrayList9), z10, scaleLargeValue112, jArr19.length);
                                    arrayList4 = arrayList2;
                                    arrayList4.add(trackSampleTable);
                                }
                                trackSampleTable = trackSampleTable2;
                                arrayList4 = arrayList2;
                            } else {
                                parsableByteArray8 = null;
                            }
                        } else {
                            i7 = 0;
                        }
                        i8 = -1;
                        int fixedSampleSize2 = longArrayQueue.getFixedSampleSize();
                        ParsableByteArray parsableByteArray102 = parsableByteArray9;
                        String str42 = format5.sampleMimeType;
                        if (fixedSampleSize2 == -1) {
                        }
                        ArrayList arrayList72 = new ArrayList();
                        if (parsableByteArray8 != null) {
                        }
                        if (z5) {
                        }
                        long[] jArr152 = jArr3;
                        int[] iArr92 = iArr;
                        long[] jArr162 = jArr4;
                        j10 = track2.mediaDurationUs;
                        if (j10 > j2) {
                        }
                        int i632 = track2.f893type;
                        long j242 = track2.timescale;
                        Format format62 = track2.f892format;
                        long[] jArr172 = track2.editListMediaTimes;
                        jArr6 = track2.editListDurations;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long scaleLargeValue42 = Util.scaleLargeValue(j8, 1000000L, j242, roundingMode3);
                        int[] array22 = CompositeException.WrappedPrintStream.toArray(arrayList72);
                        if (jArr6 != null) {
                        }
                        trackSampleTable = trackSampleTable2;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(trackSampleTable);
                }
            }
            i18 = i + 1;
            mp4Box$ContainerBox2 = mp4Box$ContainerBox;
            arrayList5 = arrayList4;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.setPosition(r9);
        r1.skipBytes(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r8 = new androidx.media3.extractor.metadata.id3.InternalFrame(r0, r8, r1.readNullTerminatedString(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027f, code lost:
    
        androidx.media3.common.util.Log.d("MetadataUtil", "Skipped unknown metadata entry: ".concat(androidx.media3.decoder.Buffer.getBoxTypeString(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x028a, code lost:
    
        r1.setPosition(r15);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = androidx.media3.extractor.metadata.id3.Id3Util.resolveV1Genre(androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r8 = new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", r12, com.google.common.collect.ImmutableList.of((java.lang.Object) r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        androidx.media3.common.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0091, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02aa, code lost:
    
        r1.setPosition(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ad, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b9, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c0, code lost:
    
        if (r0 != 6516084) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c2, code lost:
    
        r0 = r1.readInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
    
        if (r1.readInt() != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
    
        r1.skipBytes(8);
        r0 = r1.readNullTerminatedString(r0 - 16);
        r8 = new androidx.media3.extractor.metadata.id3.CommentFrame("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
    
        androidx.media3.common.util.Log.w("MetadataUtil", "Failed to parse comment attribute: ".concat(androidx.media3.decoder.Buffer.getBoxTypeString(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f6, code lost:
    
        if (r0 == 7233901) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01fb, code lost:
    
        if (r0 != 7631467) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0202, code lost:
    
        if (r0 == 6516589) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0207, code lost:
    
        if (r0 != 7828084) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020e, code lost:
    
        if (r0 != 6578553) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0210, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021a, code lost:
    
        if (r0 != 4280916) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.setPosition(r7);
        r7 = r7 + r13;
        r1.skipBytes(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021c, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0226, code lost:
    
        if (r0 != 7630703) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0228, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0232, code lost:
    
        if (r0 != 6384738) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0234, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x023f, code lost:
    
        if (r0 != 7108978) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0241, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.position;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024c, code lost:
    
        if (r0 != 6776174) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024e, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0257, code lost:
    
        if (r0 != 6779504) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0259, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0264, code lost:
    
        if (r0 != 7173742) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0266, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0271, code lost:
    
        if (r0 != 7173737) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0273, code lost:
    
        r0 = androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x027a, code lost:
    
        r1.setPosition(r15);
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x028f, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0297, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b2, code lost:
    
        if (r6.isEmpty() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.readInt() + r13;
        r13 = r1.readInt();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02b6, code lost:
    
        r12 = new androidx.media3.common.Metadata(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIndexAndCountAttribute(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r1.setPosition(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x029f, code lost:
    
        if (r8 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02a1, code lost:
    
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a4, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIndexAndCountAttribute(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseCoverArt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseIntegerAttribute(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r8 = androidx.media3.extractor.mp4.Sniffer.parseTextAttribute(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r13 = r1.position;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (r13 >= r15) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        r14 = r1.readInt();
        r12 = r1.readInt();
        r1.skipBytes(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        r0 = r1.readNullTerminatedString(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        r8 = r1.readNullTerminatedString(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018a, code lost:
    
        r1.skipBytes(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
    
        if (r9 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b0, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r1.setPosition(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Metadata parseUdta(Mp4Box$LeafBox mp4Box$LeafBox) {
        int i;
        boolean z;
        Metadata metadata;
        Mp4LocationData mp4LocationData;
        Metadata.Entry[] entryArr;
        Metadata metadata2;
        int i2;
        ParsableByteArray parsableByteArray = mp4Box$LeafBox.data;
        int i3 = 8;
        parsableByteArray.setPosition(8);
        boolean z2 = false;
        Metadata metadata3 = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= i3) {
            int i4 = parsableByteArray.position;
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            String str = null;
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(i4);
                int i5 = i4 + readInt;
                parsableByteArray.skipBytes(i3);
                maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
                while (true) {
                    int i6 = parsableByteArray.position;
                    if (i6 >= i5) {
                        break;
                    }
                    int readInt3 = parsableByteArray.readInt();
                    if (parsableByteArray.readInt() == 1768715124) {
                        break;
                    }
                    parsableByteArray.setPosition(i6 + readInt3);
                    i3 = 8;
                    z2 = false;
                    str = null;
                }
                Metadata metadata4 = null;
                metadata3 = metadata3.copyWithAppendedEntriesFrom(metadata4);
                i = 8;
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(i4);
                int i7 = i4 + readInt;
                parsableByteArray.skipBytes(12);
                while (true) {
                    int i8 = parsableByteArray.position;
                    if (i8 >= i7) {
                        i = 8;
                        break;
                    }
                    int readInt4 = parsableByteArray.readInt();
                    if (parsableByteArray.readInt() != 1935766900) {
                        parsableByteArray.setPosition(i8 + readInt4);
                    } else if (readInt4 < 16) {
                        metadata2 = null;
                        i = 8;
                    } else {
                        parsableByteArray.skipBytes(4);
                        int i9 = -1;
                        int i10 = 0;
                        for (int i11 = 0; i11 < 2; i11++) {
                            int readUnsignedByte = parsableByteArray.readUnsignedByte();
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte == 0) {
                                i9 = readUnsignedByte2;
                            } else if (readUnsignedByte == 1) {
                                i10 = readUnsignedByte2;
                            }
                        }
                        if (i9 == 12) {
                            i2 = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                        } else if (i9 == 13) {
                            i2 = 120;
                        } else if (i9 != 21) {
                            i2 = -2147483647;
                        } else {
                            i = 8;
                            if (parsableByteArray.bytesLeft() >= 8 && parsableByteArray.position + 8 <= i7) {
                                int readInt5 = parsableByteArray.readInt();
                                int readInt6 = parsableByteArray.readInt();
                                if (readInt5 >= 12 && readInt6 == 1936877170) {
                                    i2 = parsableByteArray.readUnsignedFixedPoint1616();
                                    if (i2 != -2147483647) {
                                        metadata2 = new Metadata(new SmtaMetadataEntry(i2, i10));
                                    }
                                }
                            }
                            i2 = -2147483647;
                            if (i2 != -2147483647) {
                            }
                        }
                        i = 8;
                        if (i2 != -2147483647) {
                        }
                    }
                }
                metadata2 = null;
                metadata3 = metadata3.copyWithAppendedEntriesFrom(metadata2);
            } else {
                i = 8;
                if (readInt2 == -1451722374) {
                    short readShort = parsableByteArray.readShort();
                    parsableByteArray.skipBytes(2);
                    String readString = parsableByteArray.readString(readShort, StandardCharsets.UTF_8);
                    int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
                    try {
                        try {
                            mp4LocationData = new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1)));
                            entryArr = new Metadata.Entry[1];
                            z = false;
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            z = false;
                        }
                        try {
                            entryArr[0] = mp4LocationData;
                            metadata = new Metadata(entryArr);
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            metadata = null;
                            metadata3 = metadata3.copyWithAppendedEntriesFrom(metadata);
                            parsableByteArray.setPosition(i4 + readInt);
                            i3 = i;
                            z2 = z;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    metadata3 = metadata3.copyWithAppendedEntriesFrom(metadata);
                    parsableByteArray.setPosition(i4 + readInt);
                    i3 = i;
                    z2 = z;
                }
            }
            z = false;
            parsableByteArray.setPosition(i4 + readInt);
            i3 = i;
            z2 = z;
        }
        return metadata3;
    }
}
