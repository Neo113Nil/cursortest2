package androidx.media3.muxer;

import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil$H265SpsData;
import androidx.media3.container.NalUnitUtil$SpsData;
import androidx.media3.container.OpusUtil;
import androidx.tracing.Trace;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class Boxes {
    static {
        ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    public static ByteBuffer avcCBox(Format format2) {
        List list = format2.initializationData;
        Trace.checkArgument("csd-0 and/or csd-1 not found in the format for avcC box.", list.size() >= 2);
        byte[] bArr = (byte[]) list.get(0);
        Trace.checkArgument("csd-0 is empty for avcC box.", bArr.length > 0);
        byte[] bArr2 = (byte[]) list.get(1);
        Trace.checkArgument("csd-1 is empty for avcC box.", bArr2.length > 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer allocate = ByteBuffer.allocate(wrap2.limit() + wrap.limit() + 200);
        allocate.put((byte) 1);
        RegularImmutableList findNalUnits = AnnexBUtils.findNalUnits(wrap);
        Trace.checkArgument("SPS data not found in csd0 for avcC box.", !findNalUnits.isEmpty());
        ByteBuffer byteBuffer = (ByteBuffer) findNalUnits.get(0);
        int remaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[remaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        NalUnitUtil$SpsData parseSpsNalUnit = OpusUtil.parseSpsNalUnit(0, remaining, bArr3);
        allocate.put((byte) parseSpsNalUnit.profileIdc);
        allocate.put((byte) parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits);
        allocate.put((byte) parseSpsNalUnit.levelIdc);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.putShort((short) byteBuffer.remaining());
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        RegularImmutableList findNalUnits2 = AnnexBUtils.findNalUnits(wrap2);
        Trace.checkState("PPS data not found in csd1 for avcC box.", !findNalUnits2.isEmpty());
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) findNalUnits2.get(0);
        allocate.putShort((short) byteBuffer2.remaining());
        allocate.put(byteBuffer2);
        byteBuffer2.rewind();
        allocate.flip();
        return BoxUtils.wrapIntoBox("avcC", allocate);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ByteBuffer codecSpecificBox(Format format2) {
        char c;
        int i;
        int i2;
        ByteBuffer wrapIntoBox;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = format2.sampleMimeType;
        List list = format2.initializationData;
        str.getClass();
        byte b = 8;
        char c2 = 1;
        r13 = true;
        boolean z = true;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Pair dolbyVisionProfileAndLevel = getDolbyVisionProfileAndLevel(format2);
                Trace.checkNotNull(dolbyVisionProfileAndLevel, "Can't identify Dolby vision profile");
                ByteBuffer hvcCBox = ((Integer) dolbyVisionProfileAndLevel.first).intValue() <= 8 ? hvcCBox(format2) : avcCBox(format2);
                int intValue = ((Integer) dolbyVisionProfileAndLevel.first).intValue();
                int intValue2 = ((Integer) dolbyVisionProfileAndLevel.second).intValue();
                byte[] bArr = CodecSpecificDataUtil.NAL_START_CODE;
                byte[] bArr2 = new byte[24];
                if (intValue == 8) {
                    i = 4;
                    i2 = 0;
                } else if (intValue == 9) {
                    i = 2;
                    i2 = 1;
                } else {
                    i = 0;
                    i2 = 0;
                }
                bArr2[0] = 1;
                bArr2[1] = 0;
                byte b2 = (byte) ((intValue & 127) << 1);
                bArr2[2] = b2;
                bArr2[2] = (byte) ((b2 | ((intValue2 >> 5) & 1)) & 255);
                byte b3 = (byte) ((intValue2 & 31) << 3);
                bArr2[3] = b3;
                byte b4 = (byte) (b3 | 4);
                bArr2[3] = b4;
                byte b5 = b4;
                bArr2[3] = b5;
                bArr2[3] = (byte) (b5 | 1);
                byte b6 = (byte) (i << 4);
                bArr2[4] = b6;
                bArr2[4] = (byte) (b6 | (i2 << 2));
                int intValue3 = ((Integer) dolbyVisionProfileAndLevel.first).intValue();
                if (intValue3 == 5) {
                    wrapIntoBox = BoxUtils.wrapIntoBox("dvcC", ByteBuffer.wrap(bArr2));
                } else {
                    if (intValue3 != 8 && intValue3 != 9) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue3, "Unsupported Dolby Vision profile "));
                        return null;
                    }
                    wrapIntoBox = BoxUtils.wrapIntoBox("dvvC", ByteBuffer.wrap(bArr2));
                }
                return BoxUtils.concatenateBuffers(hvcCBox, wrapIntoBox);
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(7);
                allocate.put("    ".getBytes(StandardCharsets.UTF_8));
                allocate.put((byte) 0);
                Pair codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel == null) {
                    codecProfileAndLevel = new Pair(1, 1);
                }
                allocate.put(((Integer) codecProfileAndLevel.second).byteValue());
                allocate.put(((Integer) codecProfileAndLevel.first).byteValue());
                allocate.flip();
                return BoxUtils.wrapIntoBox("d263", allocate);
            case 2:
                return BoxUtils.wrapIntoBox("av1C", ByteBuffer.wrap((byte[]) list.get(0)));
            case 3:
                return hvcCBox(format2);
            case 4:
                return damrBox((short) -31745);
            case 5:
            case 6:
                return esdsBox(format2);
            case 7:
                return ByteBuffer.allocate(0);
            case '\b':
                return esdsBox(format2);
            case '\t':
                Trace.checkArgument("csd-0 is not found in the format for apvC box", !list.isEmpty());
                byte[] bArr3 = (byte[]) list.get(0);
                Trace.checkArgument("csd-0 is empty for apvC box.", bArr3.length > 0);
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr3.length + 4);
                allocate2.putInt(0);
                allocate2.put(bArr3);
                allocate2.flip();
                return BoxUtils.wrapIntoBox("apvC", allocate2);
            case '\n':
                return avcCBox(format2);
            case 11:
                return damrBox((short) -32257);
            case '\f':
                Trace.checkArgument("csd-0 not found in the format for dOps box.", !list.isEmpty());
                byte[] bArr4 = CodecSpecificDataUtil.NAL_START_CODE;
                Trace.checkArgument("csd-0 must be present for Opus.", !list.isEmpty());
                byte[] bArr5 = (byte[]) list.get(0);
                Trace.checkArgument(bArr5.length >= 8);
                ParsableByteArray parsableByteArray = new ParsableByteArray(bArr5);
                int length = bArr5.length;
                String readString = parsableByteArray.readString(8, StandardCharsets.UTF_8);
                if (readString.equals("AOPUSHDR")) {
                    Trace.checkArgument(bArr5.length >= 24);
                    long readLittleEndianLong = parsableByteArray.readLittleEndianLong();
                    Trace.checkArgument(16 + readLittleEndianLong <= ((long) bArr5.length));
                    length = (int) readLittleEndianLong;
                    i3 = 16;
                } else {
                    Trace.checkArgument(readString.equals("OpusHead"));
                    i3 = 0;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr5, i3, length + i3);
                Trace.checkArgument(copyOfRange.length >= 8);
                ByteBuffer allocate3 = ByteBuffer.allocate(copyOfRange.length);
                allocate3.put(copyOfRange, 8, copyOfRange.length - 8);
                if (allocate3.get(0) != 0 && allocate3.get(0) != 1) {
                    z = false;
                }
                Trace.checkState(z);
                allocate3.put(0, (byte) 0);
                allocate3.flip();
                return BoxUtils.wrapIntoBox("dOps", allocate3);
            case '\r':
                ColorInfo colorInfo = format2.colorInfo;
                Trace.checkArgument("csd-0 is not found in the format for vpcC box", !list.isEmpty());
                byte[] bArr6 = (byte[]) list.get(0);
                Trace.checkArgument("csd-0 for vp9 is invalid.", bArr6.length > 3);
                if (CompositeException.WrappedPrintStream.fromByteArray(bArr6) == 16777216) {
                    return BoxUtils.wrapIntoBox("vpcC", ByteBuffer.wrap(bArr6));
                }
                ByteBuffer allocate4 = ByteBuffer.allocate(200);
                allocate4.putInt(16777216);
                if (colorInfo == null || (i4 = colorInfo.colorRange) == -1) {
                    i4 = 0;
                }
                byte b7 = 0;
                byte b8 = 0;
                byte b9 = 10;
                for (int i7 = 0; i7 < bArr6.length; i7 += 3) {
                    byte b10 = bArr6[i7];
                    int i8 = i7 + 2;
                    if (b10 == 1) {
                        b7 = bArr6[i8];
                    } else if (b10 == 2) {
                        b9 = bArr6[i8];
                    } else if (b10 == 3) {
                        b = bArr6[i8];
                    } else if (b10 == 4) {
                        b8 = bArr6[i8];
                    }
                }
                ByteBuffer allocate5 = ByteBuffer.allocate(3);
                allocate5.put(b7);
                allocate5.put(b9);
                allocate5.put((byte) (i4 | (b << 4) | (b8 << 1)));
                allocate5.flip();
                allocate4.put(allocate5);
                if (colorInfo != null) {
                    int i9 = colorInfo.colorSpace;
                    char c3 = i9 != 2 ? i9 != 6 ? (char) 1 : '\t' : (char) 5;
                    i5 = ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer);
                    i6 = i9 != 2 ? i9 != 6 ? 1 : 9 : 6;
                    c2 = c3;
                } else {
                    i5 = 1;
                    i6 = 1;
                }
                allocate4.put((byte) c2);
                allocate4.put((byte) i5);
                allocate4.put((byte) i6);
                allocate4.putShort((short) 0);
                allocate4.flip();
                return BoxUtils.wrapIntoBox("vpcC", allocate4);
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static String codecSpecificFourcc(Format format2) {
        String str;
        int i;
        str = format2.sampleMimeType;
        i = format2.pcmEncoding;
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                Pair dolbyVisionProfileAndLevel = getDolbyVisionProfileAndLevel(format2);
                Trace.checkNotNull(dolbyVisionProfileAndLevel, "Dolby Vision profile and level is not found.");
                int intValue = ((Integer) dolbyVisionProfileAndLevel.first).intValue();
                if (intValue == 5) {
                    return "dvh1";
                }
                if (intValue == 8) {
                    return "hvc1";
                }
                if (intValue == 9) {
                    return "avc1";
                }
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Unsupported profile ", dolbyVisionProfileAndLevel.first, " for format: ", str);
                return null;
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "audio/raw":
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported PCM encoding: "));
                return null;
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Unsupported format: ".concat(str));
                return null;
        }
    }

    public static ByteBuffer damrBox(short s) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.put("    ".getBytes(StandardCharsets.UTF_8));
        allocate.put((byte) 0);
        allocate.putShort(s);
        allocate.put((byte) 0);
        allocate.put((byte) 1);
        allocate.flip();
        return BoxUtils.wrapIntoBox("damr", allocate);
    }

    public static ByteBuffer elstEntry(long j, long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putLong(j);
        allocate.putLong(j2);
        allocate.putShort((short) 1);
        allocate.putShort((short) 0);
        allocate.flip();
        return allocate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ByteBuffer esdsBox(Format format2) {
        ByteBuffer wrap;
        Byte b;
        List list = format2.initializationData;
        Trace.checkArgument("csd-0 not found in the format for esds box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        Trace.checkArgument("csd-0 is empty for esds box.", bArr.length > 0);
        String str = format2.sampleMimeType;
        str.getClass();
        if (str.equals("audio/vorbis")) {
            byte[] bArr2 = CodecSpecificDataUtil.NAL_START_CODE;
            Trace.checkArgument("csd-0 and csd-1 must be present for Vorbis.", list.size() > 1);
            byte[] bArr3 = (byte[]) list.get(0);
            byte[] bArr4 = (byte[]) list.get(1);
            int length = bArr3.length;
            int length2 = bArr4.length;
            int i = length / 255;
            byte[] bArr5 = new byte[i + 1];
            Arrays.fill(bArr5, (byte) -1);
            bArr5[i] = (byte) (length % 255);
            byte[] bArr6 = {23};
            Arrays.fill(bArr6, (byte) -1);
            wrap = ByteBuffer.allocate(i + 3 + length + 23 + length2);
            wrap.put((byte) 2);
            wrap.put(bArr5);
            wrap.put(bArr6);
            wrap.put(bArr3);
            wrap.put(new byte[]{3, 118, 111, 114, 98, 105, 115, 7, 0, 0, 0, 97, 110, 100, 114, 111, 105, 100, 0, 0, 0, 0, 1});
            wrap.put(bArr4);
            wrap.flip();
        } else {
            wrap = ByteBuffer.wrap(bArr);
        }
        int i2 = format2.peakBitrate;
        int i3 = format2.averageBitrate;
        boolean isVideo = MimeTypes.isVideo(str);
        int remaining = wrap.remaining();
        ByteBuffer sizeBuffer = getSizeBuffer(remaining);
        ByteBuffer sizeBuffer2 = getSizeBuffer(sizeBuffer.remaining() + remaining + 14);
        ByteBuffer sizeBuffer3 = getSizeBuffer(sizeBuffer2.remaining() + sizeBuffer.remaining() + remaining + 21);
        ByteBuffer allocate = ByteBuffer.allocate(remaining + 200);
        allocate.putInt(0);
        allocate.put((byte) 3);
        allocate.put(sizeBuffer3);
        allocate.putShort((short) 0);
        allocate.put(isVideo ? (byte) 31 : (byte) 0);
        allocate.put((byte) 4);
        allocate.put(sizeBuffer2);
        switch (str) {
            case "audio/vorbis":
                b = (byte) -35;
                break;
            case "audio/mp4a-latm":
                b = (byte) 64;
                break;
            case "video/mp4v-es":
                b = Byte.valueOf(PnmConstants.PNM_SEPARATOR);
                break;
            default:
                b = null;
                break;
        }
        b.getClass();
        allocate.put(b.byteValue());
        allocate.put((byte) ((isVideo ? 16 : 20) | 1));
        allocate.putShort((short) (((isVideo ? 96000 : 768) >> 8) & 65535));
        allocate.put((byte) 0);
        if (i2 == -1) {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putInt(i3 != -1 ? i3 : 0);
        allocate.put((byte) 5);
        allocate.put(sizeBuffer);
        allocate.put(wrap);
        wrap.rewind();
        allocate.put((byte) 6);
        allocate.put((byte) 1);
        allocate.put((byte) 2);
        allocate.flip();
        return BoxUtils.wrapIntoBox("esds", allocate);
    }

    public static ByteBuffer ftyp() {
        ArrayList arrayList = new ArrayList();
        String str = Util.DEVICE_DEBUG_INFO;
        arrayList.add(ByteBuffer.wrap("isom".getBytes(StandardCharsets.UTF_8)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(PKIFailureInfo.unsupportedVersion);
        allocate.flip();
        arrayList.add(allocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(strArr[i].getBytes(StandardCharsets.UTF_8)));
        }
        return BoxUtils.wrapBoxesIntoBox("ftyp", arrayList);
    }

    public static Pair getDolbyVisionProfileAndLevel(Format format2) {
        String str = format2.codecs;
        Trace.checkNotNull(str, "Codec string is null for Dolby Vision format.");
        List splitToList = Splitter.on('.').splitToList(str);
        if (splitToList.size() < 3) {
            Log.w("Boxes", "Invalid Dolby Vision codec string: ".concat(str));
            return null;
        }
        return Pair.create(Integer.valueOf(Integer.parseInt((String) splitToList.get(1))), Integer.valueOf(Integer.parseInt((String) splitToList.get(2))));
    }

    public static ByteBuffer getSizeBuffer(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & 127))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer allocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            allocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer hdlr(String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        String str3 = Util.DEVICE_DEBUG_INFO;
        Charset charset = StandardCharsets.UTF_8;
        allocate.put(str.getBytes(charset));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(str2.getBytes(charset));
        allocate.put((byte) 0);
        allocate.flip();
        return BoxUtils.wrapIntoBox("hdlr", allocate);
    }

    public static ByteBuffer hvcCBox(Format format2) {
        List list = format2.initializationData;
        Trace.checkArgument("csd-0 not found in the format for hvcC box.", !list.isEmpty());
        byte[] bArr = (byte[]) list.get(0);
        Trace.checkArgument("csd-0 is empty for hvcC box.", bArr.length > 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(wrap.limit() + 200);
        RegularImmutableList findNalUnits = AnnexBUtils.findNalUnits(wrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < findNalUnits.size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) findNalUnits.get(i);
            ByteBuffer allocate2 = ByteBuffer.allocate(byteBuffer.limit());
            int i2 = 0;
            for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
                if (byteBuffer.get(i3) != 3 || i2 < 2) {
                    allocate2.put(byteBuffer.get(i3));
                }
                i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
            }
            allocate2.flip();
            arrayList.add(allocate2);
        }
        allocate.put((byte) 1);
        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.get(0);
        if (byteBuffer2.get(byteBuffer2.position()) != 64) {
            a$$ExternalSyntheticBUOutline0.m$3("First NALU in csd-0 is not the VPS.");
            return null;
        }
        allocate.put(byteBuffer2.get(6));
        allocate.putInt(byteBuffer2.getInt(7));
        allocate.putInt(byteBuffer2.getInt(11));
        allocate.putShort(byteBuffer2.getShort(15));
        allocate.put(byteBuffer2.get(17));
        allocate.putShort((short) -4096);
        allocate.put((byte) -4);
        int i4 = findNalUnits.size;
        ByteBuffer byteBuffer3 = (ByteBuffer) findNalUnits.get(1);
        int remaining = byteBuffer3.remaining();
        byte[] bArr2 = new byte[remaining];
        byteBuffer3.get(bArr2);
        byteBuffer3.rewind();
        NalUnitUtil$H265SpsData parseH265SpsNalUnit = OpusUtil.parseH265SpsNalUnit(bArr2, 0, remaining, null);
        byte b = (byte) (parseH265SpsNalUnit.chromaFormatIdc | EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        byte b2 = (byte) (parseH265SpsNalUnit.bitDepthLumaMinus8 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        byte b3 = (byte) (parseH265SpsNalUnit.bitDepthChromaMinus8 | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        allocate.put(b);
        allocate.put(b2);
        allocate.put(b3);
        allocate.putShort((short) 0);
        allocate.put((byte) 15);
        allocate.put((byte) i4);
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer4 = (ByteBuffer) findNalUnits.get(i5);
            allocate.put((byte) ((byteBuffer4.get(0) >> 1) & 63));
            allocate.putShort((short) 1);
            allocate.putShort((short) byteBuffer4.limit());
            allocate.put(byteBuffer4);
        }
        allocate.flip();
        return BoxUtils.wrapIntoBox("hvcC", allocate);
    }

    public static ByteBuffer moov(ArrayList arrayList, n nVar) {
        ByteBuffer wrapIntoBox;
        ByteBuffer wrapBoxesIntoBox;
        long j;
        String str;
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        Track track;
        int i4;
        long j2;
        int i5;
        ByteBuffer allocate;
        long j3;
        int i6;
        ByteBuffer wrapIntoBox2;
        ByteBuffer wrapIntoBox3;
        ByteBuffer wrapBoxesIntoBox2;
        String str2;
        n nVar2;
        String str3;
        int i7;
        int i8;
        byte[] byteArray;
        int i9;
        ByteBuffer allocate2;
        short s;
        short s2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        ByteBuffer allocate3;
        int i11;
        boolean z;
        ArrayList arrayList4 = arrayList;
        n nVar3 = nVar;
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) nVar3.d;
        HashSet hashSet2 = (HashSet) nVar3.c;
        int i12 = (int) mp4TimestampData.creationTimestampSeconds;
        int i13 = (int) mp4TimestampData.modificationTimestampSeconds;
        long j4 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            Track track2 = (Track) arrayList4.get(i14);
            if (!track2.writtenSamples.isEmpty()) {
                j4 = Math.min(((BufferInfo) track2.writtenSamples.get(0)).presentationTimeUs, j4);
            }
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = -9223372036854775807L;
        }
        if (j4 == -9223372036854775807L) {
            return ByteBuffer.allocate(0);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        int i16 = 1;
        long j5 = 0;
        while (i15 < arrayList4.size()) {
            Track track3 = (Track) arrayList4.get(i15);
            if (track3.writtenSamples.isEmpty()) {
                hashSet = hashSet2;
                i7 = i12;
                j = j4;
                i = i15;
                nVar2 = nVar3;
                i8 = i13;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
            } else {
                Format format2 = track3.f900format;
                ArrayList arrayList7 = track3.writtenSamples;
                if (Objects.equals(format2.sampleMimeType, "video/av01") && format2.initializationData.isEmpty()) {
                    Format.Builder buildUpon = format2.buildUpon();
                    byte[] bArr = track3.parsedCsd;
                    bArr.getClass();
                    buildUpon.initializationData = ImmutableList.of((Object) bArr);
                    format2 = new Format(buildUpon);
                }
                String str4 = format2.language;
                int i17 = format2.height;
                int i18 = format2.width;
                String str5 = str4;
                String str6 = format2.sampleMimeType;
                if (str5 == null) {
                    j = j4;
                    str = null;
                } else {
                    Locale forLanguageTag = Locale.forLanguageTag(str5);
                    if (!forLanguageTag.getISO3Language().isEmpty()) {
                        str5 = forLanguageTag.getISO3Language();
                    }
                    j = j4;
                    str = str5;
                }
                int videoUnitTimebase = track3.videoUnitTimebase();
                ArrayList arrayList8 = arrayList5;
                ArrayList arrayList9 = arrayList6;
                long j6 = track3.endOfStreamTimestampUs;
                i = i15;
                hashSet = hashSet2;
                ArrayList arrayList10 = new ArrayList(arrayList7.size());
                String str7 = str;
                ArrayList arrayList11 = new ArrayList(arrayList7.size());
                int i19 = i13;
                if (arrayList7.isEmpty()) {
                    i3 = i12;
                    i2 = i16;
                    track = track3;
                    i4 = i17;
                } else {
                    long j7 = 0;
                    int i20 = 0;
                    boolean z2 = false;
                    while (i20 < arrayList7.size()) {
                        int i21 = i20;
                        long j8 = ((BufferInfo) arrayList7.get(i20)).presentationTimeUs;
                        arrayList10.add(Long.valueOf(j8));
                        if (j8 < j7) {
                            z2 = true;
                        }
                        i20 = i21 + 1;
                        j7 = j8;
                    }
                    if (z2) {
                        Collections.sort(arrayList10);
                    }
                    long longValue = ((Long) arrayList10.get(0)).longValue();
                    i2 = i16;
                    int i22 = 1;
                    while (true) {
                        i3 = i12;
                        if (i22 >= arrayList10.size()) {
                            break;
                        }
                        int i23 = i17;
                        ArrayList arrayList12 = arrayList10;
                        long longValue2 = ((Long) arrayList10.get(i22)).longValue();
                        Track track4 = track3;
                        long j9 = videoUnitTimebase;
                        long vuFromUs = vuFromUs(longValue2, j9) - vuFromUs(longValue, j9);
                        Trace.checkState("Only 32-bit sample duration is allowed", vuFromUs <= 2147483647L);
                        arrayList11.add(Integer.valueOf((int) vuFromUs));
                        i22++;
                        longValue = longValue2;
                        i12 = i3;
                        i17 = i23;
                        arrayList10 = arrayList12;
                        track3 = track4;
                    }
                    track = track3;
                    i4 = i17;
                    if (j6 != -9223372036854775807L) {
                        long j10 = videoUnitTimebase;
                        j2 = vuFromUs(j6, j10) - vuFromUs(longValue, j10);
                        Trace.checkState("Only 32-bit sample duration is allowed", j2 <= 2147483647L);
                    } else {
                        j2 = -1;
                    }
                    int i24 = (int) j2;
                    if (i24 == -1) {
                        i24 = arrayList11.size() < 2 ? 0 : ((Integer) Maps.getLast(arrayList11)).intValue();
                    }
                    arrayList11.add(Integer.valueOf(i24));
                }
                long j11 = 0;
                for (int i25 = 0; i25 < arrayList11.size(); i25++) {
                    j11 += ((Integer) arrayList11.get(i25)).intValue();
                }
                long j12 = arrayList7.isEmpty() ? 0L : ((BufferInfo) arrayList7.get(0)).presentationTimeUs;
                long scaleLargeValue = Util.scaleLargeValue(j11, 1000000L, track.videoUnitTimebase(), RoundingMode.HALF_UP);
                long j13 = j11;
                if (j12 < 0) {
                    scaleLargeValue -= Math.abs(j12);
                }
                int trackType = MimeTypes.getTrackType(str6);
                ByteBuffer allocate4 = ByteBuffer.allocate((arrayList11.size() * 8) + 200);
                allocate4.putInt(0);
                int position = allocate4.position();
                allocate4.putInt(0);
                long j14 = j12;
                int i26 = -1;
                int i27 = 0;
                int i28 = 0;
                long j15 = -1;
                while (i27 < arrayList11.size()) {
                    int intValue = ((Integer) arrayList11.get(i27)).intValue();
                    long j16 = j13;
                    long j17 = intValue;
                    if (j15 != j17) {
                        i26 = allocate4.position();
                        allocate4.putInt(1);
                        allocate4.putInt(intValue);
                        i28++;
                        j15 = j17;
                    } else {
                        allocate4.putInt(i26, allocate4.getInt(i26) + 1);
                    }
                    i27++;
                    j13 = j16;
                }
                long j18 = j13;
                allocate4.putInt(position, i28);
                allocate4.flip();
                ByteBuffer wrapIntoBox4 = BoxUtils.wrapIntoBox("stts", allocate4);
                if (MimeTypes.isVideo(str6)) {
                    int videoUnitTimebase2 = track.videoUnitTimebase();
                    ArrayList arrayList13 = new ArrayList(arrayList7.size());
                    if (!arrayList7.isEmpty()) {
                        long j19 = ((BufferInfo) arrayList7.get(0)).presentationTimeUs;
                        long j20 = 0;
                        long j21 = 0;
                        int i29 = 0;
                        boolean z3 = false;
                        while (i29 < arrayList7.size()) {
                            long j22 = ((BufferInfo) arrayList7.get(i29)).presentationTimeUs - j19;
                            long j23 = j20;
                            long vuFromUs2 = vuFromUs(j22, videoUnitTimebase2) - j23;
                            if (vuFromUs2 <= 2147483647L) {
                                i11 = videoUnitTimebase2;
                                z = true;
                            } else {
                                i11 = videoUnitTimebase2;
                                z = false;
                            }
                            Trace.checkState("Only 32-bit composition offset is allowed", z);
                            long intValue2 = j23 + ((Integer) arrayList11.get(i29)).intValue();
                            arrayList13.add(Integer.valueOf((int) vuFromUs2));
                            if (j22 < j21) {
                                z3 = true;
                            }
                            i29++;
                            j20 = intValue2;
                            videoUnitTimebase2 = i11;
                            j21 = j22;
                        }
                        if (!z3) {
                            arrayList13.clear();
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        allocate = ByteBuffer.allocate(0);
                    } else {
                        ByteBuffer allocate5 = ByteBuffer.allocate((arrayList13.size() * 8) + 8);
                        allocate5.putInt(16777216);
                        int position2 = allocate5.position();
                        allocate5.putInt(0);
                        int i30 = 0;
                        int i31 = -1;
                        int i32 = -1;
                        for (int i33 = 0; i33 < arrayList13.size(); i33++) {
                            int intValue3 = ((Integer) arrayList13.get(i33)).intValue();
                            if (i31 != intValue3) {
                                int position3 = allocate5.position();
                                allocate5.putInt(1);
                                allocate5.putInt(intValue3);
                                i30++;
                                i32 = position3;
                                i31 = intValue3;
                            } else {
                                allocate5.putInt(i32, allocate5.getInt(i32) + 1);
                            }
                        }
                        allocate5.putInt(position2, i30);
                        allocate5.flip();
                        allocate = BoxUtils.wrapIntoBox("ctts", allocate5);
                    }
                    i5 = 0;
                } else {
                    i5 = 0;
                    allocate = ByteBuffer.allocate(0);
                }
                ByteBuffer byteBuffer = allocate;
                ByteBuffer allocate6 = ByteBuffer.allocate((arrayList7.size() * 4) + 200);
                allocate6.putInt(i5);
                allocate6.putInt(i5);
                allocate6.putInt(arrayList7.size());
                for (int i34 = 0; i34 < arrayList7.size(); i34++) {
                    allocate6.putInt(((BufferInfo) arrayList7.get(i34)).size);
                }
                allocate6.flip();
                ByteBuffer wrapIntoBox5 = BoxUtils.wrapIntoBox("stsz", allocate6);
                Track track5 = track;
                ArrayList arrayList14 = track5.writtenChunkSampleCounts;
                ByteBuffer allocate7 = ByteBuffer.allocate((arrayList14.size() * 12) + 200);
                allocate7.putInt(0);
                int position4 = allocate7.position();
                allocate7.putInt(0);
                int i35 = 1;
                int i36 = 0;
                int i37 = -1;
                for (int i38 = 0; i38 < arrayList14.size(); i38++) {
                    int intValue4 = ((Integer) arrayList14.get(i38)).intValue();
                    if (intValue4 != i37) {
                        allocate7.putInt(i35);
                        allocate7.putInt(intValue4);
                        allocate7.putInt(1);
                        i36++;
                        i37 = intValue4;
                    }
                    i35++;
                }
                allocate7.putInt(position4, i36);
                allocate7.flip();
                ByteBuffer wrapIntoBox6 = BoxUtils.wrapIntoBox("stsc", allocate7);
                ArrayList arrayList15 = track5.writtenChunkOffsets;
                ByteBuffer allocate8 = ByteBuffer.allocate((arrayList15.size() * 8) + 8);
                allocate8.putInt(0);
                allocate8.putInt(arrayList15.size());
                for (int i39 = 0; i39 < arrayList15.size(); i39++) {
                    allocate8.putLong(((Long) arrayList15.get(i39)).longValue());
                }
                allocate8.flip();
                ByteBuffer wrapIntoBox7 = BoxUtils.wrapIntoBox("co64", allocate8);
                if (trackType == -1 || trackType == 5) {
                    j3 = scaleLargeValue;
                    i6 = i4;
                    ByteBuffer allocate9 = ByteBuffer.allocate(200);
                    allocate9.putInt(0);
                    allocate9.flip();
                    wrapIntoBox2 = BoxUtils.wrapIntoBox("nmhd", allocate9);
                    List list = format2.initializationData;
                    if ("application/x-itut-t35".equals(str6)) {
                        Trace.checkArgument(list.size() == 1);
                        ByteBuffer allocate10 = ByteBuffer.allocate(200);
                        allocate10.putInt(0);
                        allocate10.putShort((short) 0);
                        allocate10.putShort((short) 1);
                        allocate10.put((byte) 0);
                        allocate10.put((byte[]) list.get(0));
                        allocate10.flip();
                        wrapIntoBox3 = BoxUtils.wrapIntoBox("it35", allocate10);
                    } else {
                        ByteBuffer allocate11 = ByteBuffer.allocate(200);
                        str6.getClass();
                        String str8 = Util.DEVICE_DEBUG_INFO;
                        byte[] bytes = str6.getBytes(StandardCharsets.UTF_8);
                        allocate11.putInt(0);
                        allocate11.putShort((short) 0);
                        allocate11.putShort((short) 1);
                        allocate11.put(bytes);
                        allocate11.put((byte) 0);
                        allocate11.put(bytes);
                        allocate11.put((byte) 0);
                        allocate11.flip();
                        wrapIntoBox3 = BoxUtils.wrapIntoBox("mett", allocate11);
                    }
                    wrapBoxesIntoBox2 = BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(stsd(wrapIntoBox3), wrapIntoBox4, wrapIntoBox5, wrapIntoBox6, wrapIntoBox7));
                    str2 = "MetaHandle";
                    nVar2 = nVar;
                    str3 = "meta";
                } else if (trackType == 1) {
                    j3 = scaleLargeValue;
                    i6 = i4;
                    ByteBuffer allocate12 = ByteBuffer.allocate(200);
                    allocate12.putInt(0);
                    allocate12.putShort((short) 0);
                    allocate12.putShort((short) 0);
                    allocate12.flip();
                    ByteBuffer wrapIntoBox8 = BoxUtils.wrapIntoBox("smhd", allocate12);
                    String codecSpecificFourcc = codecSpecificFourcc(format2);
                    ByteBuffer codecSpecificBox = codecSpecificBox(format2);
                    ByteBuffer allocate13 = ByteBuffer.allocate(codecSpecificBox.remaining() + 200);
                    allocate13.putInt(0);
                    allocate13.putShort((short) 0);
                    allocate13.putShort((short) 1);
                    allocate13.putInt(0);
                    allocate13.putInt(0);
                    allocate13.putShort((short) format2.channelCount);
                    allocate13.putShort((short) 16);
                    allocate13.putShort((short) 0);
                    allocate13.putShort((short) 0);
                    allocate13.putInt(format2.sampleRate << 16);
                    allocate13.put(codecSpecificBox);
                    allocate13.flip();
                    wrapBoxesIntoBox2 = BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(stsd(BoxUtils.wrapIntoBox(codecSpecificFourcc, allocate13)), wrapIntoBox4, wrapIntoBox5, wrapIntoBox6, wrapIntoBox7));
                    str3 = "soun";
                    str2 = "SoundHandle";
                    nVar2 = nVar;
                    wrapIntoBox2 = wrapIntoBox8;
                } else {
                    if (trackType != 2) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unsupported track type");
                        return null;
                    }
                    ByteBuffer allocate14 = ByteBuffer.allocate(200);
                    allocate14.putInt(0);
                    allocate14.putShort((short) 0);
                    allocate14.putShort((short) 0);
                    allocate14.putShort((short) 0);
                    allocate14.putShort((short) 0);
                    allocate14.flip();
                    wrapIntoBox2 = BoxUtils.wrapIntoBox("vmhd", allocate14);
                    ByteBuffer codecSpecificBox2 = codecSpecificBox(format2);
                    ColorInfo colorInfo = format2.colorInfo;
                    String codecSpecificFourcc2 = codecSpecificFourcc(format2);
                    ByteBuffer allocate15 = ByteBuffer.allocate(codecSpecificBox2.limit() + 200);
                    allocate15.putInt(0);
                    allocate15.putShort((short) 0);
                    allocate15.putShort((short) 1);
                    allocate15.putShort((short) 0);
                    allocate15.putShort((short) 0);
                    allocate15.putInt(0);
                    allocate15.putInt(0);
                    allocate15.putInt(0);
                    allocate15.putShort(i18 != -1 ? (short) i18 : (short) 0);
                    i6 = i4;
                    allocate15.putShort(i6 != -1 ? (short) i6 : (short) 0);
                    allocate15.putInt(4718592);
                    allocate15.putInt(4718592);
                    allocate15.putInt(0);
                    allocate15.putShort((short) 1);
                    j3 = scaleLargeValue;
                    int i40 = 5;
                    allocate15.putLong(0L);
                    allocate15.putLong(0L);
                    allocate15.putLong(0L);
                    allocate15.putLong(0L);
                    allocate15.putShort((short) 24);
                    allocate15.putShort((short) -1);
                    allocate15.put(codecSpecificBox2);
                    if (colorInfo != null && codecSpecificFourcc2.equals("vp09")) {
                        byte[] bArr2 = colorInfo.hdrStaticInfo;
                        if (bArr2 != null) {
                            ByteBuffer allocate16 = ByteBuffer.allocate(200);
                            allocate16.putInt(0);
                            allocate16.put(bArr2);
                            allocate16.flip();
                            allocate3 = BoxUtils.wrapIntoBox("SmDm", allocate16);
                        } else {
                            allocate3 = ByteBuffer.allocate(0);
                        }
                        allocate15.put(allocate3);
                    }
                    ByteBuffer allocate17 = ByteBuffer.allocate(8);
                    allocate17.putInt(65536);
                    allocate17.putInt(65536);
                    allocate17.rewind();
                    allocate15.put(BoxUtils.wrapIntoBox("pasp", allocate17));
                    if (colorInfo != null) {
                        int i41 = colorInfo.colorSpace;
                        ByteBuffer allocate18 = ByteBuffer.allocate(20);
                        allocate18.put((byte) 110);
                        allocate18.put((byte) 99);
                        allocate18.put((byte) 108);
                        allocate18.put((byte) 120);
                        if (i41 != 2) {
                            i10 = 6;
                            i40 = i41 != 6 ? 1 : 9;
                        } else {
                            i10 = 6;
                        }
                        short s3 = (short) i40;
                        short colorTransferToIsoTransferCharacteristics = (short) ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer);
                        short s4 = (short) (i41 != 2 ? i41 != i10 ? 1 : 9 : 6);
                        byte b = colorInfo.colorRange == 1 ? Byte.MIN_VALUE : (byte) 0;
                        allocate18.putShort(s3);
                        allocate18.putShort(colorTransferToIsoTransferCharacteristics);
                        allocate18.putShort(s4);
                        allocate18.put(b);
                        allocate18.flip();
                        allocate15.put(BoxUtils.wrapIntoBox("colr", allocate18));
                    }
                    allocate15.flip();
                    ByteBuffer stsd = stsd(BoxUtils.wrapIntoBox(codecSpecificFourcc2, allocate15));
                    ByteBuffer allocate19 = ByteBuffer.allocate((arrayList7.size() * 4) + 200);
                    allocate19.putInt(0);
                    int position5 = allocate19.position();
                    allocate19.putInt(arrayList7.size());
                    int i42 = 1;
                    int i43 = 0;
                    for (int i44 = 0; i44 < arrayList7.size(); i44++) {
                        if ((((BufferInfo) arrayList7.get(i44)).flags & 1) > 0) {
                            allocate19.putInt(i42);
                            i43++;
                        }
                        i42++;
                    }
                    allocate19.putInt(position5, i43);
                    allocate19.flip();
                    wrapBoxesIntoBox2 = BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(stsd, wrapIntoBox4, byteBuffer, wrapIntoBox5, wrapIntoBox6, wrapIntoBox7, BoxUtils.wrapIntoBox("stss", allocate19)));
                    str3 = "vide";
                    str2 = "VideoHandle";
                    nVar2 = nVar;
                }
                int i45 = ((Mp4OrientationData) nVar2.a).orientation;
                ByteBuffer allocate20 = ByteBuffer.allocate(200);
                allocate20.putInt(7);
                i7 = i3;
                allocate20.putInt(i7);
                i8 = i19;
                allocate20.putInt(i8);
                int i46 = i2;
                allocate20.putInt(i46);
                allocate20.putInt(0);
                ByteBuffer byteBuffer2 = wrapBoxesIntoBox2;
                String str9 = str2;
                ByteBuffer byteBuffer3 = wrapIntoBox2;
                long j24 = j3;
                allocate20.putInt((int) vuFromUs(j24, 10000L));
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.putShort(MimeTypes.isAudio(str6) ? (short) 256 : (short) 0);
                allocate20.putShort((short) 0);
                if (i45 == 0) {
                    byteArray = Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
                } else if (i45 == 90) {
                    byteArray = Util.toByteArray(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
                } else if (i45 == 180) {
                    byteArray = Util.toByteArray(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
                } else {
                    if (i45 != 270) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i45, "invalid orientation "));
                        return null;
                    }
                    byteArray = Util.toByteArray(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
                }
                allocate20.put(byteArray);
                if (i18 == -1) {
                    i18 = 0;
                }
                if (i6 == -1) {
                    i6 = 0;
                }
                allocate20.putInt(i18 << 16);
                allocate20.putInt(i6 << 16);
                allocate20.flip();
                ByteBuffer wrapIntoBox9 = BoxUtils.wrapIntoBox("tkhd", allocate20);
                long videoUnitTimebase3 = track5.videoUnitTimebase();
                long j25 = j > 0 ? j14 - j : j14;
                if (j25 != 0) {
                    ByteBuffer allocate21 = ByteBuffer.allocate(50);
                    allocate21.putInt(16777216);
                    if (j25 > 0) {
                        allocate21.putInt(2);
                        allocate21.put(elstEntry(vuFromUs(j25, 10000L), -1L));
                        allocate21.put(elstEntry(vuFromUs(j24, 10000L), 0L));
                    } else {
                        allocate21.putInt(1);
                        allocate21.put(elstEntry(vuFromUs(j24, 10000L), vuFromUs(Math.abs(j25), videoUnitTimebase3)));
                    }
                    allocate21.flip();
                    allocate2 = BoxUtils.wrapIntoBox("edts", BoxUtils.wrapIntoBox("elst", allocate21));
                    i9 = 0;
                } else {
                    i9 = 0;
                    allocate2 = ByteBuffer.allocate(0);
                }
                int videoUnitTimebase4 = track5.videoUnitTimebase();
                ByteBuffer allocate22 = ByteBuffer.allocate(200);
                allocate22.putInt(i9);
                allocate22.putInt(i7);
                allocate22.putInt(i8);
                allocate22.putInt(videoUnitTimebase4);
                allocate22.putInt((int) j18);
                if (str7 != null) {
                    byte[] bytes2 = str7.getBytes(StandardCharsets.UTF_8);
                    if (bytes2.length == 3) {
                        s2 = 0;
                        s = (short) (((bytes2[2] & 31) + ((bytes2[1] & 31) << 5) + ((bytes2[0] & 31) << 10)) & IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE);
                        allocate22.putShort(s);
                        allocate22.putShort(s2);
                        allocate22.flip();
                        ByteBuffer wrapIntoBox10 = BoxUtils.wrapIntoBox("mdhd", allocate22);
                        ByteBuffer hdlr = hdlr(str3, str9);
                        ByteBuffer allocate23 = ByteBuffer.allocate(4);
                        allocate23.putInt(1);
                        allocate23.flip();
                        ByteBuffer[] byteBufferArr = {BoxUtils.wrapIntoBox("url ", allocate23)};
                        ByteBuffer allocate24 = ByteBuffer.allocate(8);
                        allocate24.putInt(0);
                        allocate24.putInt(1);
                        allocate24.flip();
                        ArrayList arrayList16 = new ArrayList();
                        arrayList16.add(allocate24);
                        Collections.addAll(arrayList16, byteBufferArr);
                        ByteBuffer wrapBoxesIntoBox3 = BoxUtils.wrapBoxesIntoBox("trak", Arrays.asList(wrapIntoBox9, allocate2, BoxUtils.wrapBoxesIntoBox("mdia", Arrays.asList(wrapIntoBox10, hdlr, BoxUtils.wrapBoxesIntoBox("minf", Arrays.asList(byteBuffer3, BoxUtils.wrapIntoBox("dinf", BoxUtils.wrapBoxesIntoBox("dref", arrayList16)), byteBuffer2))))));
                        arrayList2 = arrayList8;
                        arrayList2.add(wrapBoxesIntoBox3);
                        j5 = Math.max(j5, j24);
                        ByteBuffer allocate25 = ByteBuffer.allocate(24);
                        allocate25.putInt(0);
                        allocate25.putInt(i46);
                        allocate25.putInt(1);
                        allocate25.putInt(0);
                        allocate25.putInt(0);
                        allocate25.putInt(0);
                        allocate25.flip();
                        arrayList3 = arrayList9;
                        arrayList3.add(BoxUtils.wrapIntoBox("trex", allocate25));
                        i16 = i46 + 1;
                    }
                }
                s = 0;
                s2 = 0;
                allocate22.putShort(s);
                allocate22.putShort(s2);
                allocate22.flip();
                ByteBuffer wrapIntoBox102 = BoxUtils.wrapIntoBox("mdhd", allocate22);
                ByteBuffer hdlr2 = hdlr(str3, str9);
                ByteBuffer allocate232 = ByteBuffer.allocate(4);
                allocate232.putInt(1);
                allocate232.flip();
                ByteBuffer[] byteBufferArr2 = {BoxUtils.wrapIntoBox("url ", allocate232)};
                ByteBuffer allocate242 = ByteBuffer.allocate(8);
                allocate242.putInt(0);
                allocate242.putInt(1);
                allocate242.flip();
                ArrayList arrayList162 = new ArrayList();
                arrayList162.add(allocate242);
                Collections.addAll(arrayList162, byteBufferArr2);
                ByteBuffer wrapBoxesIntoBox32 = BoxUtils.wrapBoxesIntoBox("trak", Arrays.asList(wrapIntoBox9, allocate2, BoxUtils.wrapBoxesIntoBox("mdia", Arrays.asList(wrapIntoBox102, hdlr2, BoxUtils.wrapBoxesIntoBox("minf", Arrays.asList(byteBuffer3, BoxUtils.wrapIntoBox("dinf", BoxUtils.wrapBoxesIntoBox("dref", arrayList162)), byteBuffer2))))));
                arrayList2 = arrayList8;
                arrayList2.add(wrapBoxesIntoBox32);
                j5 = Math.max(j5, j24);
                ByteBuffer allocate252 = ByteBuffer.allocate(24);
                allocate252.putInt(0);
                allocate252.putInt(i46);
                allocate252.putInt(1);
                allocate252.putInt(0);
                allocate252.putInt(0);
                allocate252.putInt(0);
                allocate252.flip();
                arrayList3 = arrayList9;
                arrayList3.add(BoxUtils.wrapIntoBox("trex", allocate252));
                i16 = i46 + 1;
            }
            i15 = i + 1;
            arrayList5 = arrayList2;
            arrayList6 = arrayList3;
            nVar3 = nVar2;
            i12 = i7;
            i13 = i8;
            j4 = j;
            hashSet2 = hashSet;
            arrayList4 = arrayList;
        }
        HashSet hashSet3 = hashSet2;
        int i47 = i16;
        n nVar4 = nVar3;
        ArrayList arrayList17 = arrayList5;
        ByteBuffer allocate26 = ByteBuffer.allocate(200);
        allocate26.putInt(0);
        allocate26.putInt(i12);
        allocate26.putInt(i13);
        allocate26.putInt(10000);
        allocate26.putInt((int) vuFromUs(j5, 10000L));
        allocate26.putInt(65536);
        allocate26.putShort((short) 256);
        allocate26.putShort((short) 0);
        allocate26.putInt(0);
        allocate26.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i48 = 0; i48 < 9; i48++) {
            allocate26.putInt(iArr[i48]);
        }
        for (int i49 = 0; i49 < 6; i49++) {
            allocate26.putInt(0);
        }
        allocate26.putInt(i47);
        allocate26.flip();
        ByteBuffer wrapIntoBox11 = BoxUtils.wrapIntoBox("mvhd", allocate26);
        Mp4LocationData mp4LocationData = (Mp4LocationData) nVar4.b;
        if (mp4LocationData == null) {
            wrapIntoBox = ByteBuffer.allocate(0);
        } else {
            Object[] objArr = {Float.valueOf(mp4LocationData.latitude), Float.valueOf(mp4LocationData.longitude)};
            String str10 = Util.DEVICE_DEBUG_INFO;
            String format3 = String.format(Locale.US, "%+.4f%+.4f/", objArr);
            ByteBuffer allocate27 = ByteBuffer.allocate(format3.length() + 4);
            allocate27.putShort((short) (allocate27.capacity() - 4));
            allocate27.putShort((short) 5575);
            allocate27.put(format3.getBytes(StandardCharsets.UTF_8));
            Trace.checkState(allocate27.limit() == allocate27.capacity());
            allocate27.flip();
            wrapIntoBox = BoxUtils.wrapIntoBox("udta", BoxUtils.wrapIntoBox(new byte[]{-87, 120, 121, 122}, allocate27));
        }
        if (hashSet3.isEmpty()) {
            wrapBoxesIntoBox = ByteBuffer.allocate(0);
        } else {
            ByteBuffer hdlr3 = hdlr("mdta", "");
            hashSet3.getClass();
            ArrayList arrayList18 = new ArrayList(hashSet3);
            int i50 = 0;
            for (int i51 = 0; i51 < arrayList18.size(); i51++) {
                i50 = Boxes$$ExternalSyntheticOutline1.m(8, i50, ((MdtaMetadataEntry) arrayList18.get(i51)).key);
            }
            ByteBuffer allocate28 = ByteBuffer.allocate(i50 + 8);
            allocate28.putInt(0);
            allocate28.putInt(arrayList18.size());
            for (int i52 = 0; i52 < arrayList18.size(); i52++) {
                String str11 = ((MdtaMetadataEntry) arrayList18.get(i52)).key;
                String str12 = Util.DEVICE_DEBUG_INFO;
                allocate28.put(BoxUtils.wrapIntoBox("mdta", ByteBuffer.wrap(str11.getBytes(StandardCharsets.UTF_8))));
            }
            allocate28.flip();
            ByteBuffer wrapIntoBox12 = BoxUtils.wrapIntoBox("keys", allocate28);
            hashSet3.getClass();
            ArrayList arrayList19 = new ArrayList(hashSet3);
            int i53 = 0;
            for (int i54 = 0; i54 < arrayList19.size(); i54++) {
                i53 += ((MdtaMetadataEntry) arrayList19.get(i54)).value.length + 24;
            }
            ByteBuffer allocate29 = ByteBuffer.allocate(i53);
            int i55 = 0;
            while (i55 < arrayList19.size()) {
                int i56 = i55 + 1;
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) arrayList19.get(i55);
                ByteBuffer allocate30 = ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
                allocate30.putInt(mdtaMetadataEntry.typeIndicator);
                allocate30.putInt(mdtaMetadataEntry.localeIndicator);
                allocate30.put(mdtaMetadataEntry.value);
                allocate30.flip();
                ByteBuffer wrapIntoBox13 = BoxUtils.wrapIntoBox("data", allocate30);
                allocate29.putInt(wrapIntoBox13.remaining() + 8);
                allocate29.putInt(i56);
                allocate29.put(wrapIntoBox13);
                i55 = i56;
            }
            allocate29.flip();
            wrapBoxesIntoBox = BoxUtils.wrapBoxesIntoBox("meta", Arrays.asList(hdlr3, wrapIntoBox12, BoxUtils.wrapIntoBox("ilst", allocate29)));
        }
        ArrayList arrayList20 = new ArrayList();
        arrayList20.add(wrapIntoBox11);
        arrayList20.add(wrapIntoBox);
        arrayList20.add(wrapBoxesIntoBox);
        arrayList20.addAll(arrayList17);
        return BoxUtils.wrapBoxesIntoBox("moov", arrayList20);
    }

    public static ByteBuffer stsd(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return BoxUtils.wrapIntoBox("stsd", allocate);
    }

    public static long vuFromUs(long j, long j2) {
        return Util.scaleLargeValue(j, j2, 1000000L, RoundingMode.HALF_UP);
    }
}
