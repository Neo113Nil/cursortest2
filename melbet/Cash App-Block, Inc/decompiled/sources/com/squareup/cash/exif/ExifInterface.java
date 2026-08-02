package com.squareup.cash.exif;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes9.dex */
public final class ExifInterface {
    public static final Charset ASCII;
    public static final ExifTag[] EXIF_POINTER_TAGS;
    public static final ExifTag[][] EXIF_TAGS;
    public static final byte[] IDENTIFIER_EXIF_APP1;
    public static final ExifTag TAG_RAF_IMAGE_SIZE;
    public static final HashMap sExifPointerTagMap;
    public static final HashMap[] sExifTagMapsForReading;
    public static final HashMap[] sExifTagMapsForWriting;
    public static final HashSet sTagSetForCompatibility;
    public final AssetManager.AssetInputStream mAssetInputStream;
    public final HashMap[] mAttributes;
    public final HashSet mAttributesOffsets;
    public ByteOrder mExifByteOrder;
    public int mExifOffset;
    public int mMimeType;
    public int mOrfMakerNoteOffset;
    public int mOrfThumbnailLength;
    public int mOrfThumbnailOffset;
    public int mRw2JpgFromRawOffset;
    public static final List ROTATION_ORDER = Arrays.asList(1, 6, 3, 8);
    public static final List FLIPPED_ROTATION_ORDER = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    public static final byte[] JPEG_SIGNATURE = {-1, -40, -1};
    public static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, PnmConstants.PNM_PREFIX_BYTE, 0};
    public static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, PnmConstants.PNM_PREFIX_BYTE, 85, 83, 0, 73, 73};
    public static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    public final class ExifAttribute {
        public final byte[] bytes;

        /* renamed from: format, reason: collision with root package name */
        public final int f1129format;
        public final int numberOfComponents;

        public ExifAttribute(int i, int i2, byte[] bArr) {
            this.f1129format = i;
            this.numberOfComponents = i2;
            this.bytes = bArr;
        }

        public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4]]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new ExifAttribute(4, 1, wrap.array());
        }

        public static ExifAttribute createURational(Rational rational, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5]]);
            wrap.order(byteOrder);
            Rational rational2 = new Rational[]{rational}[0];
            wrap.putInt((int) rational2.numerator);
            wrap.putInt((int) rational2.denominator);
            return new ExifAttribute(5, 1, wrap.array());
        }

        public static ExifAttribute createUShort(int i, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3]]);
            wrap.order(byteOrder);
            wrap.putShort((short) new int[]{i}[0]);
            return new ExifAttribute(3, 1, wrap.array());
        }

        public final double getDoubleValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (value instanceof String) {
                return Double.parseDouble((String) value);
            }
            if (value instanceof long[]) {
                if (((long[]) value).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                if (((int[]) value).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(value instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) value;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.numerator / rational.denominator;
        }

        public final int getIntValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (value instanceof String) {
                return Integer.parseInt((String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(value instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) value;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String getStringValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(value instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) value;
            while (i < rationalArr.length) {
                sb.append(rationalArr[i].numerator);
                sb.append('/');
                sb.append(rationalArr[i].denominator);
                i++;
                if (i != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:107:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v16, types: [com.squareup.cash.exif.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [com.squareup.cash.exif.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable getValue(ByteOrder byteOrder) {
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            String str;
            byte b;
            ?? r13;
            byte[] bArr = this.bytes;
            InputStream inputStream2 = null;
            try {
                try {
                    byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
                    try {
                        byteOrderedDataInputStream.mByteOrder = byteOrder;
                        int i = this.f1129format;
                        int i2 = 0;
                        int i3 = this.numberOfComponents;
                        switch (i) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                    str = new String(bArr, ExifInterface.ASCII);
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str2;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i3 >= ExifInterface.EXIF_ASCII_PREFIX.length) {
                                    int i4 = 0;
                                    while (true) {
                                        byte[] bArr2 = ExifInterface.EXIF_ASCII_PREFIX;
                                        if (i4 >= bArr2.length) {
                                            i2 = bArr2.length;
                                        } else if (bArr[i4] == bArr2[i4]) {
                                            i4++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (i2 < i3) {
                                    byte b2 = bArr[i2];
                                    if (b2 == 0) {
                                        str = sb.toString();
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i2++;
                                }
                                str = sb.toString();
                                byteOrderedDataInputStream.close();
                                return str;
                            case 3:
                                r13 = new int[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readUnsignedShort();
                                    i2++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return r13;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                    return r13;
                                }
                            case 4:
                                r13 = new long[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readInt() & BodyPartID.bodyIdMax;
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 5:
                                r13 = new Rational[i3];
                                while (i2 < i3) {
                                    r13[i2] = new Rational(byteOrderedDataInputStream.readInt() & BodyPartID.bodyIdMax, byteOrderedDataInputStream.readInt() & BodyPartID.bodyIdMax);
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 8:
                                r13 = new int[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readShort();
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 9:
                                r13 = new int[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readInt();
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 10:
                                r13 = new Rational[i3];
                                while (i2 < i3) {
                                    r13[i2] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 11:
                                r13 = new double[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readFloat();
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 12:
                                r13 = new double[i3];
                                while (i2 < i3) {
                                    r13[i2] = byteOrderedDataInputStream.readDouble();
                                    i2++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            default:
                                try {
                                    byteOrderedDataInputStream.close();
                                    return null;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return null;
                                }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (byteOrderedDataInputStream != null) {
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                byteOrderedDataInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.IFD_FORMAT_NAMES[this.f1129format]);
            sb.append(", data length:");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, ")", sb);
        }
    }

    public final class Rational {
        public final long denominator;
        public final long numerator;

        public Rational(long j, long j2) {
            if (j2 == 0) {
                this.numerator = 0L;
                this.denominator = 1L;
            } else {
                this.numerator = j;
                this.denominator = j2;
            }
        }

        public final String toString() {
            return this.numerator + "/" + this.denominator;
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256), new ExifTag("ImageLength", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE), new ExifTag("BitsPerSample", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new ExifTag("Compression", EnumC0170g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new ExifTag("PhotometricInterpretation", EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new ExifTag("ImageDescription", EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new ExifTag("Make", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new ExifTag("Model", EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), new ExifTag("Orientation", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new ExifTag("SamplesPerPixel", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new ExifTag("RowsPerStrip", EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE), new ExifTag("StripByteCounts", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE), new ExifTag("XResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new ExifTag("YResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new ExifTag("PlanarConfiguration", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new ExifTag("ResolutionUnit", EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new ExifTag("TransferFunction", EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new ExifTag("Software", EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new ExifTag("DateTime", EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new ExifTag("Artist", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new ExifTag("WhitePoint", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new ExifTag("PrimaryChromaticities", EnumC0170g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962), new ExifTag("PixelYDimension", 40963), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256), new ExifTag("ThumbnailImageLength", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE), new ExifTag("BitsPerSample", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new ExifTag("Compression", EnumC0170g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new ExifTag("PhotometricInterpretation", EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new ExifTag("ImageDescription", EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new ExifTag("Make", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new ExifTag("Model", EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE), new ExifTag("Orientation", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new ExifTag("SamplesPerPixel", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new ExifTag("RowsPerStrip", EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE), new ExifTag("StripByteCounts", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE), new ExifTag("XResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new ExifTag("YResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new ExifTag("PlanarConfiguration", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new ExifTag("ResolutionUnit", EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new ExifTag("TransferFunction", EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new ExifTag("Software", EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new ExifTag("DateTime", EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new ExifTag("Artist", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new ExifTag("WhitePoint", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new ExifTag("PrimaryChromaticities", EnumC0170g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720)};
        TAG_RAF_IMAGE_SIZE = new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3);
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 4), new ExifTag("PreviewImageLength", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        sExifTagMapsForReading = new HashMap[10];
        sExifTagMapsForWriting = new HashMap[10];
        sTagSetForCompatibility = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        sExifPointerTagMap = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = EXIF_TAGS;
            if (i >= exifTagArr6.length) {
                HashMap hashMap = sExifPointerTagMap;
                ExifTag[] exifTagArr7 = EXIF_POINTER_TAGS;
                hashMap.put(Integer.valueOf(exifTagArr7[0].number), 5);
                hashMap.put(Integer.valueOf(exifTagArr7[1].number), 1);
                hashMap.put(Integer.valueOf(exifTagArr7[2].number), 2);
                hashMap.put(Integer.valueOf(exifTagArr7[3].number), 3);
                hashMap.put(Integer.valueOf(exifTagArr7[4].number), 7);
                hashMap.put(Integer.valueOf(exifTagArr7[5].number), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            sExifTagMapsForReading[i] = new HashMap();
            sExifTagMapsForWriting[i] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i]) {
                sExifTagMapsForReading[i].put(Integer.valueOf(exifTag.number), exifTag);
                sExifTagMapsForWriting[i].put(exifTag.name, exifTag);
            }
            i++;
        }
    }

    public ExifInterface(FileInputStream fileInputStream) {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (fileInputStream == null) {
            a$$ExternalSyntheticBUOutline0.m$3("inputStream cannot be null");
            throw null;
        }
        this.mAssetInputStream = null;
        for (int i = 0; i < exifTagArr.length; i++) {
            try {
                this.mAttributes[i] = new HashMap();
            } catch (IOException unused) {
                addDefaultValuesForCompatibility();
                return;
            } catch (Throwable th) {
                addDefaultValuesForCompatibility();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 5000);
        this.mMimeType = getMimeType(bufferedInputStream);
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bufferedInputStream);
        switch (this.mMimeType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                getRawAttributes(byteOrderedDataInputStream);
                break;
            case 4:
                getJpegAttributes(byteOrderedDataInputStream, 0, 0);
                break;
            case 7:
                getOrfAttributes(byteOrderedDataInputStream);
                break;
            case 9:
                getRafAttributes(byteOrderedDataInputStream);
                break;
            case 10:
                getRw2Attributes(byteOrderedDataInputStream);
                break;
        }
        setThumbnailData(byteOrderedDataInputStream);
        addDefaultValuesForCompatibility();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] convertToLongArray(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readShort, new StringBuilder("Invalid byte order: ")));
        return null;
    }

    public final void addDefaultValuesForCompatibility() {
        String attribute = getAttribute("DateTimeOriginal");
        HashMap[] hashMapArr = this.mAttributes;
        if (attribute != null && getAttribute("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = attribute.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(ASCII);
            hashMap.put("DateTime", new ExifAttribute(2, bytes.length, bytes));
        }
        if (getAttribute("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute("Orientation") == null) {
            hashMapArr[0].put("Orientation", ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (getAttribute("LightSource") == null) {
            hashMapArr[1].put("LightSource", ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
    }

    public final String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            int i = exifAttribute.f1129format;
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
                if (rationalArr == null || rationalArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                    return null;
                }
                Rational rational = rationalArr[0];
                Integer valueOf = Integer.valueOf((int) (rational.numerator / rational.denominator));
                Rational rational2 = rationalArr[1];
                Integer valueOf2 = Integer.valueOf((int) (rational2.numerator / rational2.denominator));
                Rational rational3 = rationalArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (rational3.numerator / rational3.denominator)));
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Integer getAttributeInt(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return null;
        }
        try {
            return Integer.valueOf(exifAttribute.getIntValue(this.mExifByteOrder));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final ExifAttribute getExifAttribute(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            ExifAttribute exifAttribute = (ExifAttribute) this.mAttributes[i].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
    
        r12.mByteOrder = r11.mExifByteOrder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0119, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getJpegAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream, int i, int i2) {
        byteOrderedDataInputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        byteOrderedDataInputStream.seek(i);
        byte readByte = byteOrderedDataInputStream.readByte();
        if (readByte != -1) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte & 255, new StringBuilder("Invalid marker: ")));
            return;
        }
        if (byteOrderedDataInputStream.readByte() != -40) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte & 255, new StringBuilder("Invalid marker: ")));
            return;
        }
        int i3 = i + 2;
        while (true) {
            byte readByte2 = byteOrderedDataInputStream.readByte();
            if (readByte2 != -1) {
                a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte2 & 255, new StringBuilder("Invalid marker:")));
                return;
            }
            byte readByte3 = byteOrderedDataInputStream.readByte();
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                int i4 = readUnsignedShort - 2;
                int i5 = i3 + 4;
                if (i4 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                    return;
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.mAttributes;
                    if (readByte3 != -2) {
                        switch (readByte3) {
                            default:
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                }
                                            case -55:
                                            case -54:
                                            case -53:
                                                if (byteOrderedDataInputStream.skipBytes(1) != 1) {
                                                    a$$ExternalSyntheticBUOutline0.m$4("Invalid SOFx");
                                                    return;
                                                }
                                                hashMapArr[i2].put("ImageLength", ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                                hashMapArr[i2].put("ImageWidth", ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                                i4 = readUnsignedShort - 7;
                                                break;
                                        }
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                        }
                    } else {
                        byte[] bArr = new byte[i4];
                        if (byteOrderedDataInputStream.read(bArr) != i4) {
                            a$$ExternalSyntheticBUOutline0.m$4("Invalid exif");
                            return;
                        }
                        if (getAttribute("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = ASCII;
                            byte[] bytes = new String(bArr, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                            hashMap.put("UserComment", new ExifAttribute(2, bytes.length, bytes));
                        }
                        i4 = 0;
                    }
                } else if (i4 >= 6) {
                    byte[] bArr2 = new byte[6];
                    if (byteOrderedDataInputStream.read(bArr2) != 6) {
                        a$$ExternalSyntheticBUOutline0.m$4("Invalid exif");
                        return;
                    }
                    i5 = i3 + 10;
                    int i6 = readUnsignedShort - 8;
                    if (!Arrays.equals(bArr2, IDENTIFIER_EXIF_APP1)) {
                        i4 = i6;
                    } else {
                        if (i6 <= 0) {
                            a$$ExternalSyntheticBUOutline0.m$4("Invalid exif");
                            return;
                        }
                        this.mExifOffset = i5;
                        byte[] bArr3 = new byte[i6];
                        if (byteOrderedDataInputStream.read(bArr3) != i6) {
                            a$$ExternalSyntheticBUOutline0.m$4("Invalid exif");
                            return;
                        }
                        i5 += i6;
                        ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr3);
                        parseTiffHeaders(byteOrderedDataInputStream2, i6);
                        readImageFileDirectory(byteOrderedDataInputStream2, i2);
                        i4 = 0;
                    }
                }
                if (i4 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                    return;
                } else {
                    if (byteOrderedDataInputStream.skipBytes(i4) != i4) {
                        a$$ExternalSyntheticBUOutline0.m$4("Invalid JPEG segment");
                        return;
                    }
                    i3 = i5 + i4;
                }
            }
        }
    }

    public final int getMimeType(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i >= bArr2.length) {
                return 4;
            }
            if (bArr[i] != bArr2[i]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i2 = 0; i2 < bytes.length; i2++) {
                    if (bArr[i2] != bytes[i2]) {
                        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
                        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
                        this.mExifByteOrder = readByteOrder;
                        byteOrderedDataInputStream.mByteOrder = readByteOrder;
                        short readShort = byteOrderedDataInputStream.readShort();
                        byteOrderedDataInputStream.close();
                        if (readShort == 20306 || readShort == 21330) {
                            return 7;
                        }
                        ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr);
                        ByteOrder readByteOrder2 = readByteOrder(byteOrderedDataInputStream2);
                        this.mExifByteOrder = readByteOrder2;
                        byteOrderedDataInputStream2.mByteOrder = readByteOrder2;
                        short readShort2 = byteOrderedDataInputStream2.readShort();
                        byteOrderedDataInputStream2.close();
                        return readShort2 == 85 ? 10 : 0;
                    }
                }
                return 9;
            }
            i++;
        }
    }

    public final void getOrfAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        int i;
        int i2;
        getRawAttributes(byteOrderedDataInputStream);
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(exifAttribute.bytes);
            byteOrderedDataInputStream2.mByteOrder = this.mExifByteOrder;
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            byteOrderedDataInputStream2.readFully(bArr2);
            byteOrderedDataInputStream2.seek(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            byteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                byteOrderedDataInputStream2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                byteOrderedDataInputStream2.seek(12L);
            }
            readImageFileDirectory(byteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                ExifAttribute createUShort = ExifAttribute.createUShort(i5, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(i6, this.mExifByteOrder);
                hashMapArr[0].put("ImageWidth", createUShort);
                hashMapArr[0].put("ImageLength", createUShort2);
            }
        }
    }

    public final void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        byteOrderedDataInputStream.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.skipBytes(4);
        byteOrderedDataInputStream.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        getJpegAttributes(byteOrderedDataInputStream, i, 5);
        byteOrderedDataInputStream.seek(i2);
        byteOrderedDataInputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        int readInt = byteOrderedDataInputStream.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == TAG_RAF_IMAGE_SIZE.number) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute createUShort = ExifAttribute.createUShort(readShort, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(readShort2, this.mExifByteOrder);
                HashMap[] hashMapArr = this.mAttributes;
                hashMapArr[0].put("ImageLength", createUShort);
                hashMapArr[0].put("ImageWidth", createUShort2);
                return;
            }
            byteOrderedDataInputStream.skipBytes(readUnsignedShort2);
        }
    }

    public final void getRawAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ExifAttribute exifAttribute;
        parseTiffHeaders(byteOrderedDataInputStream, byteOrderedDataInputStream.mDataInputStream.available());
        readImageFileDirectory(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 5);
        updateImageSizeValues(byteOrderedDataInputStream, 4);
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[1].get("PixelYDimension");
        if (exifAttribute2 != null && exifAttribute3 != null) {
            hashMapArr[0].put("ImageWidth", exifAttribute2);
            hashMapArr[0].put("ImageLength", exifAttribute3);
        }
        if (hashMapArr[4].isEmpty() && isThumbnail(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!isThumbnail(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.mMimeType != 8 || (exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote")) == null) {
            return;
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(exifAttribute.bytes);
        byteOrderedDataInputStream2.mByteOrder = this.mExifByteOrder;
        byteOrderedDataInputStream2.seek(6L);
        readImageFileDirectory(byteOrderedDataInputStream2, 9);
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[9].get("ColorSpace");
        if (exifAttribute4 != null) {
            hashMapArr[1].put("ColorSpace", exifAttribute4);
        }
    }

    public final void getRw2Attributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        getRawAttributes(byteOrderedDataInputStream);
        HashMap[] hashMapArr = this.mAttributes;
        if (((ExifAttribute) hashMapArr[0].get("JpgFromRaw")) != null) {
            getJpegAttributes(byteOrderedDataInputStream, this.mRw2JpgFromRawOffset, 5);
        }
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[0].get("ISO");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[1].get("PhotographicSensitivity");
        if (exifAttribute == null || exifAttribute2 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", exifAttribute);
    }

    public final void handleThumbnailFromJfif(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        int i;
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int min = Math.min(exifAttribute2.getIntValue(this.mExifByteOrder), byteOrderedDataInputStream.mDataInputStream.available() - intValue);
        int i2 = this.mMimeType;
        if (i2 != 4 && i2 != 9 && i2 != 10) {
            if (i2 == 7) {
                i = this.mOrfMakerNoteOffset;
            }
            if (intValue > 0 || min <= 0 || this.mAssetInputStream != null) {
                return;
            }
            byteOrderedDataInputStream.seek(intValue);
            byteOrderedDataInputStream.readFully(new byte[min]);
            return;
        }
        i = this.mExifOffset;
        intValue += i;
        if (intValue > 0) {
        }
    }

    public final boolean isThumbnail(HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    public final void parseTiffHeaders(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) {
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.mByteOrder = readByteOrder;
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.mMimeType;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readUnsignedShort, new StringBuilder("Invalid start code: ")));
            return;
        }
        int readInt = byteOrderedDataInputStream.readInt();
        if (readInt < 8 || readInt >= i) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = readInt - 8;
        if (i3 <= 0 || byteOrderedDataInputStream.skipBytes(i3) == i3) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Couldn't jump to first Ifd: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readImageFileDirectory(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) {
        HashMap[] hashMapArr;
        short s;
        short s2;
        HashMap[] hashMapArr2;
        long j;
        boolean z;
        int i2;
        long j2;
        int i3;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5 = i;
        Integer valueOf = Integer.valueOf(byteOrderedDataInputStream.mPosition);
        HashSet hashSet = this.mAttributesOffsets;
        hashSet.add(valueOf);
        int i6 = byteOrderedDataInputStream.mPosition + 2;
        int i7 = byteOrderedDataInputStream.mLength;
        if (i6 > i7) {
            return;
        }
        short readShort = byteOrderedDataInputStream.readShort();
        if ((readShort * 12) + byteOrderedDataInputStream.mPosition > i7 || readShort <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            hashMapArr = this.mAttributes;
            if (s3 >= readShort) {
                break;
            }
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort3 = byteOrderedDataInputStream.readUnsignedShort();
            int readInt = byteOrderedDataInputStream.readInt();
            long j4 = byteOrderedDataInputStream.mPosition + 4;
            ExifTag exifTag = (ExifTag) sExifTagMapsForReading[i5].get(Integer.valueOf(readUnsignedShort2));
            if (exifTag == null) {
                s = readShort;
                Log.w("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                s2 = s3;
            } else {
                s = readShort;
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < IFD_FORMAT_BYTES_PER_FORMAT.length) {
                        int i8 = exifTag.primaryFormat;
                        if (i8 == 7 || readUnsignedShort3 == 7 || i8 == readUnsignedShort3 || (i2 = exifTag.secondaryFormat) == readUnsignedShort3) {
                            s2 = s3;
                        } else {
                            s2 = s3;
                            if (((i8 != 4 && i2 != 4) || readUnsignedShort3 != 3) && (((i8 != 9 && i2 != 9) || readUnsignedShort3 != 8) && ((i8 != 12 && i2 != 12) || readUnsignedShort3 != 11))) {
                                Log.w("ExifInterface", "Skip the tag entry since data format (" + IFD_FORMAT_NAMES[readUnsignedShort3] + ") is unexpected for tag: " + exifTag.name);
                            }
                        }
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i8;
                        }
                        j = r3[readUnsignedShort3] * readInt;
                        if (j < 0 || j > 2147483647L) {
                            hashMapArr2 = hashMapArr;
                            Log.w("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                            z = false;
                            if (z) {
                                byteOrderedDataInputStream.seek(j4);
                            } else {
                                if (j > 4) {
                                    int readInt2 = byteOrderedDataInputStream.readInt();
                                    i3 = readUnsignedShort2;
                                    int i9 = this.mMimeType;
                                    j2 = j;
                                    if (i9 == 7) {
                                        if ("MakerNote".equals(exifTag.name)) {
                                            this.mOrfMakerNoteOffset = readInt2;
                                        } else if (i5 == 6 && "ThumbnailImage".equals(exifTag.name)) {
                                            this.mOrfThumbnailOffset = readInt2;
                                            this.mOrfThumbnailLength = readInt;
                                            ExifAttribute createUShort = ExifAttribute.createUShort(6, this.mExifByteOrder);
                                            i4 = readUnsignedShort3;
                                            ExifAttribute createULong = ExifAttribute.createULong(this.mOrfThumbnailOffset, this.mExifByteOrder);
                                            ExifAttribute createULong2 = ExifAttribute.createULong(this.mOrfThumbnailLength, this.mExifByteOrder);
                                            hashMapArr2[4].put("Compression", createUShort);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", createULong);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", createULong2);
                                        }
                                        i4 = readUnsignedShort3;
                                    } else {
                                        i4 = readUnsignedShort3;
                                        if (i9 == 10 && "JpgFromRaw".equals(exifTag.name)) {
                                            this.mRw2JpgFromRawOffset = readInt2;
                                        }
                                    }
                                    long j5 = readInt2;
                                    if (j5 + j2 <= i7) {
                                        byteOrderedDataInputStream.seek(j5);
                                    } else {
                                        Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + readInt2);
                                        byteOrderedDataInputStream.seek(j4);
                                    }
                                } else {
                                    j2 = j;
                                    i3 = readUnsignedShort2;
                                    i4 = readUnsignedShort3;
                                }
                                Integer num = (Integer) sExifPointerTagMap.get(Integer.valueOf(i3));
                                if (num != null) {
                                    int i10 = i4;
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            j3 = byteOrderedDataInputStream.readInt() & BodyPartID.bodyIdMax;
                                        } else if (i10 == 8) {
                                            readUnsignedShort = byteOrderedDataInputStream.readShort();
                                        } else if (i10 == 9 || i10 == 13) {
                                            readUnsignedShort = byteOrderedDataInputStream.readInt();
                                        } else {
                                            j3 = -1;
                                        }
                                        if (j3 > 0 || j3 >= i7) {
                                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                                        } else if (hashSet.contains(Integer.valueOf((int) j3))) {
                                            Log.w("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                                        } else {
                                            byteOrderedDataInputStream.seek(j3);
                                            readImageFileDirectory(byteOrderedDataInputStream, num.intValue());
                                        }
                                        byteOrderedDataInputStream.seek(j4);
                                    } else {
                                        readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                                    }
                                    j3 = readUnsignedShort;
                                    if (j3 > 0) {
                                    }
                                    Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j3);
                                    byteOrderedDataInputStream.seek(j4);
                                } else {
                                    byte[] bArr = new byte[(int) j2];
                                    byteOrderedDataInputStream.readFully(bArr);
                                    ExifAttribute exifAttribute = new ExifAttribute(i4, readInt, bArr);
                                    HashMap hashMap = hashMapArr2[i];
                                    String str = exifTag.name;
                                    hashMap.put(str, exifAttribute);
                                    if ("DNGVersion".equals(str)) {
                                        this.mMimeType = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && exifAttribute.getStringValue(this.mExifByteOrder).contains("PENTAX")) || ("Compression".equals(str) && exifAttribute.getIntValue(this.mExifByteOrder) == 65535)) {
                                        this.mMimeType = 8;
                                    }
                                    if (byteOrderedDataInputStream.mPosition != j4) {
                                        byteOrderedDataInputStream.seek(j4);
                                    }
                                }
                            }
                            s3 = (short) (s2 + 1);
                            i5 = i;
                            readShort = s;
                        } else {
                            z = true;
                            hashMapArr2 = hashMapArr;
                            if (z) {
                            }
                            s3 = (short) (s2 + 1);
                            i5 = i;
                            readShort = s;
                        }
                    }
                }
                s2 = s3;
                hashMapArr2 = hashMapArr;
                Log.w("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                j = 0;
                z = false;
                if (z) {
                }
                s3 = (short) (s2 + 1);
                i5 = i;
                readShort = s;
            }
            hashMapArr2 = hashMapArr;
            j = 0;
            z = false;
            if (z) {
            }
            s3 = (short) (s2 + 1);
            i5 = i;
            readShort = s;
        }
        if (byteOrderedDataInputStream.mPosition + 4 <= i7) {
            int readInt3 = byteOrderedDataInputStream.readInt();
            long j6 = readInt3;
            if (j6 <= 0 || readInt3 >= i7) {
                Log.w("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
            } else {
                if (hashSet.contains(Integer.valueOf(readInt3))) {
                    Log.w("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    return;
                }
                byteOrderedDataInputStream.seek(j6);
                if (hashMapArr[4].isEmpty()) {
                    readImageFileDirectory(byteOrderedDataInputStream, 4);
                } else if (hashMapArr[5].isEmpty()) {
                    readImageFileDirectory(byteOrderedDataInputStream, 5);
                }
            }
        }
    }

    public final void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ExifAttribute exifAttribute;
        HashMap hashMap = this.mAttributes[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("Compression");
        if (exifAttribute2 == null) {
            handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
            return;
        }
        int intValue = exifAttribute2.getIntValue(this.mExifByteOrder);
        if (intValue != 1) {
            if (intValue == 6) {
                handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
                return;
            } else if (intValue != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMap.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.getValue(this.mExifByteOrder);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.mMimeType != 3 || (exifAttribute = (ExifAttribute) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int intValue2 = exifAttribute.getIntValue(this.mExifByteOrder);
                if ((intValue2 != 1 || !Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) && (intValue2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) hashMap.get("StripOffsets");
            ExifAttribute exifAttribute5 = (ExifAttribute) hashMap.get("StripByteCounts");
            if (exifAttribute4 == null || exifAttribute5 == null) {
                return;
            }
            long[] convertToLongArray = convertToLongArray(exifAttribute4.getValue(this.mExifByteOrder));
            long[] convertToLongArray2 = convertToLongArray(exifAttribute5.getValue(this.mExifByteOrder));
            if (convertToLongArray == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (convertToLongArray2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long j = 0;
            for (long j2 : convertToLongArray2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < convertToLongArray.length; i3++) {
                int i4 = (int) convertToLongArray[i3];
                int i5 = (int) convertToLongArray2[i3];
                int i6 = i4 - i;
                if (i6 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                byteOrderedDataInputStream.seek(i6);
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                byteOrderedDataInputStream.read(bArr2);
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
        }
    }

    public final void swapBasedOnImageSize(int i, int i2) {
        HashMap[] hashMapArr = this.mAttributes;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[i].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null || exifAttribute3 == null || exifAttribute4 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
        int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
        if (intValue >= intValue3 || intValue2 >= intValue4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void updateImageSizeValues(ByteOrderedDataInputStream byteOrderedDataInputStream, int i) {
        ExifAttribute exifAttribute;
        ExifAttribute createUShort;
        ExifAttribute createUShort2;
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i].get("DefaultCropSize");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i].get("SensorTopBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) hashMapArr[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute6 = (ExifAttribute) hashMapArr[i].get("SensorRightBorder");
        if (exifAttribute2 != null) {
            int i2 = exifAttribute2.f1129format;
            ByteOrder byteOrder = this.mExifByteOrder;
            if (i2 == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute2.getValue(byteOrder);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                createUShort = ExifAttribute.createURational(rationalArr[0], this.mExifByteOrder);
                createUShort2 = ExifAttribute.createURational(rationalArr[1], this.mExifByteOrder);
            } else {
                int[] iArr = (int[]) exifAttribute2.getValue(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                createUShort = ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
                createUShort2 = ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
            }
            hashMapArr[i].put("ImageWidth", createUShort);
            hashMapArr[i].put("ImageLength", createUShort2);
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null || exifAttribute5 == null || exifAttribute6 == null) {
            ExifAttribute exifAttribute7 = (ExifAttribute) hashMapArr[i].get("ImageLength");
            ExifAttribute exifAttribute8 = (ExifAttribute) hashMapArr[i].get("ImageWidth");
            if ((exifAttribute7 == null || exifAttribute8 == null) && (exifAttribute = (ExifAttribute) hashMapArr[i].get("JPEGInterchangeFormat")) != null) {
                getJpegAttributes(byteOrderedDataInputStream, exifAttribute.getIntValue(this.mExifByteOrder), i);
                return;
            }
            return;
        }
        int intValue = exifAttribute3.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute5.getIntValue(this.mExifByteOrder);
        int intValue3 = exifAttribute6.getIntValue(this.mExifByteOrder);
        int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
        if (intValue2 <= intValue || intValue3 <= intValue4) {
            return;
        }
        ExifAttribute createUShort3 = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
        ExifAttribute createUShort4 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
        hashMapArr[i].put("ImageLength", createUShort3);
        hashMapArr[i].put("ImageWidth", createUShort4);
    }

    public final class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public ByteOrder mByteOrder;
        public final DataInputStream mDataInputStream;
        public final int mLength;
        public int mPosition;
        public static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this.mByteOrder = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            int available = dataInputStream.available();
            this.mLength = available;
            this.mPosition = 0;
            dataInputStream.mark(available);
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.mDataInputStream.available();
        }

        @Override // java.io.InputStream
        public final int read() {
            this.mPosition++;
            return this.mDataInputStream.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.mPosition++;
            return this.mDataInputStream.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() {
            int i = this.mPosition + 1;
            this.mPosition = i;
            if (i > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return (byte) 0;
            }
            int read = this.mDataInputStream.read();
            if (read >= 0) {
                return (byte) read;
            }
            Path$$ExternalSyntheticBUOutline0.m$1();
            return (byte) 0;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.mPosition += 2;
            return this.mDataInputStream.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) {
            int length = this.mPosition + bArr.length;
            this.mPosition = length;
            if (length > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            if (this.mDataInputStream.read(bArr, 0, bArr.length) == bArr.length) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$4("Couldn't read up to the length of buffer");
        }

        @Override // java.io.DataInput
        public final int readInt() {
            int i = this.mPosition + 4;
            this.mPosition = i;
            if (i > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() {
            int i = this.mPosition + 8;
            this.mPosition = i;
            if (i > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0L;
            }
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0L;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return 0L;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            int i = this.mPosition + 2;
            this.mPosition = i;
            if (i > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return (short) 0;
            }
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return (short) 0;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return (short) 0;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.mPosition += 2;
            return this.mDataInputStream.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.mPosition++;
            return this.mDataInputStream.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() {
            int i = this.mPosition + 2;
            this.mPosition = i;
            if (i > this.mLength) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return 0;
        }

        public final void seek(long j) {
            int i = this.mPosition;
            if (i > j) {
                this.mPosition = 0;
                DataInputStream dataInputStream = this.mDataInputStream;
                dataInputStream.reset();
                dataInputStream.mark(this.mLength);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) == i2) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$4("Couldn't seek up to the byteCount");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            int min = Math.min(i, this.mLength - this.mPosition);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.mDataInputStream.skipBytes(min - i2);
            }
            this.mPosition += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int read = this.mDataInputStream.read(bArr, i, i2);
            this.mPosition += read;
            return read;
        }

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.mPosition + i2;
            this.mPosition = i3;
            if (i3 <= this.mLength) {
                if (this.mDataInputStream.read(bArr, i, i2) == i2) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$4("Couldn't read up to the length of buffer");
                return;
            }
            Path$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    public final class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(String str, int i) {
            this.name = str;
            this.number = i;
            this.primaryFormat = 3;
            this.secondaryFormat = 4;
        }

        public ExifTag(String str, int i, int i2) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = -1;
        }
    }
}
