package androidx.camera.core.impl.utils;

import android.util.Pair;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.internal.EocdRecord;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ExifData {
    public static final String COMPONENTS_CONFIGURATION_YCBCR;
    public static final ExifTag[] EXIF_POINTER_TAGS;
    public static final ExifTag[][] EXIF_TAGS;
    public static final HashSet sTagSetForCompatibility;
    public final ArrayList mAttributes;
    public final ByteOrder mByteOrder;

    public final class Builder {
        public static final ArrayList sExifTagMapsForWriting;
        public final ArrayList mAttributes;
        public final ByteOrder mByteOrder;
        public static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: androidx.camera.core.impl.utils.ExifData$Builder$1, reason: invalid class name */
        public final class AnonymousClass1 implements Enumeration {
            public final /* synthetic */ int $r8$classId;
            public int mIfdIndex;

            public /* synthetic */ AnonymousClass1(int i) {
                this.$r8$classId = i;
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                switch (this.$r8$classId) {
                    case 0:
                        int i = this.mIfdIndex;
                        ExifTag[] exifTagArr = ExifData.EXIF_POINTER_TAGS;
                        if (i < 4) {
                            break;
                        }
                        break;
                    default:
                        int i2 = this.mIfdIndex;
                        ExifTag[] exifTagArr2 = ExifData.EXIF_POINTER_TAGS;
                        if (i2 < 4) {
                            break;
                        }
                        break;
                }
                return true;
            }

            @Override // java.util.Enumeration
            public final Object nextElement() {
                switch (this.$r8$classId) {
                    case 0:
                        HashMap hashMap = new HashMap();
                        for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                            hashMap.put(exifTag.name, exifTag);
                        }
                        this.mIfdIndex++;
                        return hashMap;
                    default:
                        this.mIfdIndex++;
                        return new HashMap();
                }
            }
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(0);
            anonymousClass1.mIfdIndex = 0;
            sExifTagMapsForWriting = Collections.list(anonymousClass1);
        }

        public Builder() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1);
            anonymousClass1.mIfdIndex = 0;
            this.mAttributes = Collections.list(anonymousClass1);
            this.mByteOrder = byteOrder;
        }

        public static Pair guessDataFormat(String str) {
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair guessDataFormat = guessDataFormat(split[0]);
                if (((Integer) guessDataFormat.first).intValue() == 2) {
                    return guessDataFormat;
                }
                for (int i = 1; i < split.length; i++) {
                    Pair guessDataFormat2 = guessDataFormat(split[i]);
                    int intValue = (((Integer) guessDataFormat2.first).equals(guessDataFormat.first) || ((Integer) guessDataFormat2.second).equals(guessDataFormat.first)) ? ((Integer) guessDataFormat.first).intValue() : -1;
                    int intValue2 = (((Integer) guessDataFormat.second).intValue() == -1 || !(((Integer) guessDataFormat2.first).equals(guessDataFormat.second) || ((Integer) guessDataFormat2.second).equals(guessDataFormat.second))) ? -1 : ((Integer) guessDataFormat.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (intValue == -1) {
                        guessDataFormat = new Pair(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        guessDataFormat = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
                return guessDataFormat;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            }
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        public final void setAttributeIfMissing(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, arrayList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x0175, code lost:
        
            if (r6 != r8) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0329  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void setAttributeInternal(String str, String str2, List list) {
            int i;
            String str3;
            int i2;
            int i3;
            int i4;
            ExifAttribute exifAttribute;
            int i5;
            int i6;
            int i7;
            String str4 = str;
            String str5 = str2;
            if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str5).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str5).find();
                if (str5.length() != 19 || (!find && !find2)) {
                    StringUtilsKt.w("ExifData", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
                if (find2) {
                    str5 = str5.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str4)) {
                str4 = "PhotographicSensitivity";
            }
            String str6 = str4;
            int i8 = 3;
            int i9 = 2;
            int i10 = 1;
            if (str5 != null && ExifData.sTagSetForCompatibility.contains(str6)) {
                if (str6.equals("GPSTimeStamp")) {
                    Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(str5);
                    if (!matcher.find()) {
                        StringUtilsKt.w("ExifData", "Invalid value for " + str6 + " : " + str5);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String group = matcher.group(1);
                    group.getClass();
                    sb.append(Integer.parseInt(group));
                    sb.append("/1,");
                    String group2 = matcher.group(2);
                    group2.getClass();
                    sb.append(Integer.parseInt(group2));
                    sb.append("/1,");
                    String group3 = matcher.group(3);
                    group3.getClass();
                    sb.append(Integer.parseInt(group3));
                    sb.append("/1");
                    str5 = sb.toString();
                } else {
                    try {
                        str5 = ((long) (Double.parseDouble(str5) * 10000.0d)) + "/10000";
                    } catch (NumberFormatException e) {
                        StringUtilsKt.w("ExifData", CameraSelector$$ExternalSyntheticOutline0.m("Invalid value for ", str6, " : ", str5), e);
                        return;
                    }
                }
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ExifTag[] exifTagArr = ExifData.EXIF_POINTER_TAGS;
                if (i12 >= 4) {
                    return;
                }
                ExifTag exifTag = (ExifTag) ((HashMap) sExifTagMapsForWriting.get(i12)).get(str6);
                if (exifTag != null) {
                    int i13 = exifTag.secondaryFormat;
                    int i14 = exifTag.primaryFormat;
                    if (str5 == null) {
                        ((Map) list.get(i12)).remove(str6);
                    } else {
                        Pair guessDataFormat = guessDataFormat(str5);
                        int i15 = -1;
                        if (i14 != ((Integer) guessDataFormat.first).intValue() && i14 != ((Integer) guessDataFormat.second).intValue()) {
                            if (i13 == -1 || (i13 != ((Integer) guessDataFormat.first).intValue() && i13 != ((Integer) guessDataFormat.second).intValue())) {
                                if (i14 != i10) {
                                    if (i14 != 7) {
                                    }
                                }
                            }
                            ByteOrder byteOrder = this.mByteOrder;
                            switch (i13) {
                                case 1:
                                    str3 = str6;
                                    int i16 = i10;
                                    i3 = i9;
                                    i4 = i8;
                                    Map map = (Map) list.get(i12);
                                    Charset charset = ExifAttribute.ASCII;
                                    i2 = i16;
                                    if (str5.length() == i2) {
                                        i = 0;
                                        if (str5.charAt(0) >= '0' && str5.charAt(0) <= '1') {
                                            byte[] bArr = new byte[i2];
                                            bArr[0] = (byte) (str5.charAt(0) - '0');
                                            exifAttribute = new ExifAttribute(i2, i2, bArr);
                                            map.put(str3, exifAttribute);
                                            break;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    byte[] bytes = str5.getBytes(ExifAttribute.ASCII);
                                    exifAttribute = new ExifAttribute(i2, bytes.length, bytes);
                                    map.put(str3, exifAttribute);
                                    break;
                                case 2:
                                case 7:
                                    i4 = i8;
                                    str3 = str6;
                                    int i17 = i10;
                                    Map map2 = (Map) list.get(i12);
                                    Charset charset2 = ExifAttribute.ASCII;
                                    byte[] bytes2 = str5.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(ExifAttribute.ASCII);
                                    i3 = 2;
                                    map2.put(str3, new ExifAttribute(2, bytes2.length, bytes2));
                                    i2 = i17;
                                    i = 0;
                                    break;
                                case 3:
                                    int i18 = i8;
                                    str3 = str6;
                                    int i19 = i10;
                                    String[] split = str5.split(",", -1);
                                    int length = split.length;
                                    int[] iArr = new int[length];
                                    for (int i20 = 0; i20 < split.length; i20++) {
                                        iArr[i20] = Integer.parseInt(split[i20]);
                                    }
                                    Map map3 = (Map) list.get(i12);
                                    ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[i18] * length]);
                                    wrap.order(byteOrder);
                                    for (int i21 = 0; i21 < length; i21++) {
                                        wrap.putShort((short) iArr[i21]);
                                    }
                                    i4 = i18;
                                    map3.put(str3, new ExifAttribute(i4, length, wrap.array()));
                                    i2 = i19;
                                    i = 0;
                                    i3 = 2;
                                    break;
                                case 4:
                                    i5 = i8;
                                    str3 = str6;
                                    i6 = i10;
                                    String[] split2 = str5.split(",", -1);
                                    long[] jArr = new long[split2.length];
                                    for (int i22 = 0; i22 < split2.length; i22++) {
                                        jArr[i22] = Long.parseLong(split2[i22]);
                                    }
                                    ((Map) list.get(i12)).put(str3, ExifAttribute.createULong(jArr, byteOrder));
                                    i2 = i6;
                                    i4 = i5;
                                    i = 0;
                                    i3 = 2;
                                    break;
                                case 5:
                                    i5 = i8;
                                    i6 = i10;
                                    int i23 = -1;
                                    String[] split3 = str5.split(",", -1);
                                    int length2 = split3.length;
                                    EocdRecord[] eocdRecordArr = new EocdRecord[length2];
                                    int i24 = i11;
                                    while (i24 < split3.length) {
                                        String[] split4 = split3[i24].split("/", i23);
                                        eocdRecordArr[i24] = new EocdRecord((long) Double.parseDouble(split4[i11]), (long) Double.parseDouble(split4[i6]), 1, (byte) 0);
                                        i24++;
                                        length2 = length2;
                                        str6 = str6;
                                        i23 = -1;
                                        i11 = 0;
                                    }
                                    String str7 = str6;
                                    int i25 = length2;
                                    Map map4 = (Map) list.get(i12);
                                    ByteBuffer wrap2 = ByteBuffer.wrap(new byte[ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[5] * i25]);
                                    wrap2.order(byteOrder);
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        EocdRecord eocdRecord = eocdRecordArr[i26];
                                        wrap2.putInt((int) eocdRecord.entryCount);
                                        wrap2.putInt((int) eocdRecord.centralDirectoryOffset);
                                    }
                                    ExifAttribute exifAttribute2 = new ExifAttribute(5, i25, wrap2.array());
                                    str3 = str7;
                                    map4.put(str3, exifAttribute2);
                                    i2 = i6;
                                    i4 = i5;
                                    i = 0;
                                    i3 = 2;
                                    break;
                                case 9:
                                    i7 = i8;
                                    int i27 = i10;
                                    String[] split5 = str5.split(",", -1);
                                    int length3 = split5.length;
                                    int[] iArr2 = new int[length3];
                                    for (int i28 = i11; i28 < split5.length; i28++) {
                                        iArr2[i28] = Integer.parseInt(split5[i28]);
                                    }
                                    Map map5 = (Map) list.get(i12);
                                    ByteBuffer wrap3 = ByteBuffer.wrap(new byte[ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[9] * length3]);
                                    wrap3.order(byteOrder);
                                    for (int i29 = i11; i29 < length3; i29++) {
                                        wrap3.putInt(iArr2[i29]);
                                    }
                                    map5.put(str6, new ExifAttribute(9, length3, wrap3.array()));
                                    String str8 = str6;
                                    i = i11;
                                    str3 = str8;
                                    i2 = i27;
                                    i3 = i9;
                                    i4 = i7;
                                    break;
                                case 10:
                                    int i30 = i10;
                                    String[] split6 = str5.split(",", -1);
                                    int length4 = split6.length;
                                    EocdRecord[] eocdRecordArr2 = new EocdRecord[length4];
                                    int i31 = i11;
                                    while (i31 < split6.length) {
                                        String[] split7 = split6[i31].split("/", i15);
                                        int i32 = i31;
                                        eocdRecordArr2[i32] = new EocdRecord((long) Double.parseDouble(split7[i11]), (long) Double.parseDouble(split7[i30]), 1, (byte) 0);
                                        i31 = i32 + 1;
                                        i8 = i8;
                                        str5 = str5;
                                        i15 = -1;
                                    }
                                    i7 = i8;
                                    String str9 = str5;
                                    Map map6 = (Map) list.get(i12);
                                    ByteBuffer wrap4 = ByteBuffer.wrap(new byte[ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[10] * length4]);
                                    wrap4.order(byteOrder);
                                    for (int i33 = i11; i33 < length4; i33++) {
                                        EocdRecord eocdRecord2 = eocdRecordArr2[i33];
                                        wrap4.putInt((int) eocdRecord2.entryCount);
                                        wrap4.putInt((int) eocdRecord2.centralDirectoryOffset);
                                    }
                                    map6.put(str6, new ExifAttribute(10, length4, wrap4.array()));
                                    String str10 = str6;
                                    i = i11;
                                    str3 = str10;
                                    i2 = i30;
                                    i3 = i9;
                                    str5 = str9;
                                    i4 = i7;
                                    break;
                                case 12:
                                    String[] split8 = str5.split(",", -1);
                                    int length5 = split8.length;
                                    double[] dArr = new double[length5];
                                    for (int i34 = i11; i34 < split8.length; i34++) {
                                        dArr[i34] = Double.parseDouble(split8[i34]);
                                    }
                                    Map map7 = (Map) list.get(i12);
                                    ByteBuffer wrap5 = ByteBuffer.wrap(new byte[ExifAttribute.IFD_FORMAT_BYTES_PER_FORMAT[12] * length5]);
                                    wrap5.order(byteOrder);
                                    int i35 = i11;
                                    while (i35 < length5) {
                                        wrap5.putDouble(dArr[i35]);
                                        i35++;
                                        i10 = i10;
                                    }
                                    map7.put(str6, new ExifAttribute(12, length5, wrap5.array()));
                                    String str11 = str6;
                                    i = i11;
                                    str3 = str11;
                                    i2 = i10;
                                    i3 = i9;
                                    i4 = i8;
                                    break;
                            }
                            i12++;
                            int i36 = i;
                            str6 = str3;
                            i11 = i36;
                            i8 = i4;
                            i9 = i3;
                            i10 = i2;
                        }
                        i13 = i14;
                        ByteOrder byteOrder2 = this.mByteOrder;
                        switch (i13) {
                        }
                        i12++;
                        int i362 = i;
                        str6 = str3;
                        i11 = i362;
                        i8 = i4;
                        i9 = i3;
                        i10 = i2;
                    }
                }
                String str12 = str6;
                i = i11;
                str3 = str12;
                i2 = i10;
                i3 = i9;
                i4 = i8;
                i12++;
                int i3622 = i;
                str6 = str3;
                i11 = i3622;
                i8 = i4;
                i9 = i3;
                i10 = i2;
            }
        }

        public final void setOrientationDegrees(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                StringUtilsKt.w("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            setAttributeInternal("Orientation", String.valueOf(i2), this.mAttributes);
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new ExifTag("Make", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new ExifTag("Model", EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new ExifTag("Orientation", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new ExifTag("XResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new ExifTag("YResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new ExifTag("ResolutionUnit", EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new ExifTag("Software", EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new ExifTag("DateTime", EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("SensitivityType", 34864, 3), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestDistanceRef", 25, 2)};
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4)};
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, new ExifTag[]{new ExifTag("InteroperabilityIndex", 1, 2)}};
        sTagSetForCompatibility = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        COMPONENTS_CONFIGURATION_YCBCR = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        TransactorKt.checkState("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.mByteOrder = byteOrder;
        this.mAttributes = arrayList;
    }

    public final Map getAttributes(int i) {
        TransactorKt.checkArgumentInRange(i, 0, 4, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.mAttributes.get(i);
    }
}
