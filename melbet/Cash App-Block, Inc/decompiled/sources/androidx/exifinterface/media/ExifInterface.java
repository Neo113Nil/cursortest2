package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.utils.ByteOrderedDataOutputStream;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes3.dex */
public final class ExifInterface {
    public static final Charset ASCII;
    public static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN;
    public static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN;
    public static final ExifTag[] EXIF_POINTER_TAGS;
    public static final ExifTag[][] EXIF_TAGS;
    public static final Pattern GPS_TIMESTAMP_PATTERN;
    public static final byte[] IDENTIFIER_EXIF_APP1;
    public static final byte[] IDENTIFIER_XMP_APP1;
    public static final Set RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY;
    public static final ExifTag TAG_RAF_IMAGE_SIZE;
    public static final HashMap sExifPointerTagMap;
    public static final HashMap[] sExifTagMapsForReading;
    public static final HashMap[] sExifTagMapsForWriting;
    public boolean mAreThumbnailStripsConsecutive;
    public final AssetManager.AssetInputStream mAssetInputStream;
    public final HashMap[] mAttributes;
    public final HashSet mAttributesOffsets;
    public ByteOrder mExifByteOrder;
    public boolean mFileOnDiskContainsSeparateXmpMarker;
    public final String mFilename;
    public boolean mHasThumbnail;
    public boolean mHasThumbnailStrips;
    public final boolean mIsExifDataOnly;
    public int mMimeType;
    public int mOffsetToExifData;
    public int mOrfMakerNoteOffset;
    public int mOrfThumbnailLength;
    public int mOrfThumbnailOffset;
    public final FileDescriptor mSeekableFileDescriptor;
    public byte[] mThumbnailBytes;
    public int mThumbnailCompression;
    public int mThumbnailLength;
    public int mThumbnailOffset;
    public ExifAttribute mXmpFromSeparateMarker;
    public static final boolean DEBUG = Log.isLoggable("ExifInterface", 3);
    public static final List ROTATION_ORDER = Arrays.asList(1, 6, 3, 8);
    public static final List FLIPPED_ROTATION_ORDER = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    public static final byte[] JPEG_SIGNATURE = {-1, -40, -1};
    public static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    public static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, PnmConstants.PBM_TEXT_CODE};
    public static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    public static final byte[] HEIF_BRAND_AVIF = {97, 118, 105, 102};
    public static final byte[] HEIF_BRAND_AVIS = {97, 118, 105, 115};
    public static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, PnmConstants.PNM_PREFIX_BYTE, 0};
    public static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, PnmConstants.PNM_PREFIX_BYTE, 85, 83, 0, 73, 73};
    public static final byte[] PNG_SIGNATURE = {-119, PnmConstants.PNM_PREFIX_BYTE, 78, 71, 13, 10, 26, 10};
    public static final byte[] PNG_ITXT_XMP_KEYWORD = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] WEBP_SIGNATURE_1 = {82, 73, 70, 70};
    public static final byte[] WEBP_SIGNATURE_2 = {87, 69, 66, PnmConstants.PNM_PREFIX_BYTE};
    public static final byte[] WEBP_CHUNK_TYPE_EXIF = {69, 88, 73, 70};
    public static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, 42};
    public static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

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
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new ExifTag("BitsPerSample", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new ExifTag("Compression", EnumC0170g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new ExifTag("PhotometricInterpretation", EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new ExifTag("ImageDescription", EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new ExifTag("Make", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new ExifTag("Model", EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new ExifTag("Orientation", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new ExifTag("SamplesPerPixel", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new ExifTag("RowsPerStrip", EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new ExifTag("StripByteCounts", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new ExifTag("XResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new ExifTag("YResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new ExifTag("PlanarConfiguration", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new ExifTag("ResolutionUnit", EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new ExifTag("TransferFunction", EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new ExifTag("Software", EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new ExifTag("DateTime", EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new ExifTag("Artist", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new ExifTag("WhitePoint", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new ExifTag("PrimaryChromaticities", EnumC0170g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new ExifTag("BitsPerSample", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 3), new ExifTag("Compression", EnumC0170g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 3), new ExifTag("PhotometricInterpretation", EnumC0170g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 3), new ExifTag("ImageDescription", EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 2), new ExifTag("Make", EnumC0170g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new ExifTag("Model", EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3, 4), new ExifTag("ThumbnailOrientation", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new ExifTag("SamplesPerPixel", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, 3), new ExifTag("RowsPerStrip", EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 3, 4), new ExifTag("StripByteCounts", EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 3, 4), new ExifTag("XResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new ExifTag("YResolution", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new ExifTag("PlanarConfiguration", EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 3), new ExifTag("ResolutionUnit", EnumC0170g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new ExifTag("TransferFunction", EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 3), new ExifTag("Software", EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new ExifTag("DateTime", EnumC0170g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new ExifTag("Artist", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 2), new ExifTag("WhitePoint", EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 5), new ExifTag("PrimaryChromaticities", EnumC0170g.SDK_ASSET_PLAID_LOGO_CIRCLE_FIRST_PARTY_ENHANCED_CONNECTION_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        TAG_RAF_IMAGE_SIZE = new ExifTag("StripOffsets", EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 3);
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 4), new ExifTag("PreviewImageLength", EnumC0170g.SDK_ASSET_HEADER_BOLT_VALUE, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        sExifTagMapsForReading = new HashMap[10];
        sExifTagMapsForWriting = new HashMap[10];
        RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        sExifPointerTagMap = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
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
                GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
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

    public ExifInterface(String str) {
        FileInputStream fileInputStream;
        boolean z;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("filename cannot be null");
            throw null;
        }
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z = true;
            } catch (Exception unused) {
                if (DEBUG) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z = false;
            }
            if (z) {
                this.mSeekableFileDescriptor = fileInputStream.getFD();
            } else {
                this.mSeekableFileDescriptor = null;
            }
            loadAttributes(fileInputStream);
            ExifInterfaceUtils.closeQuietly(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            ExifInterfaceUtils.closeQuietly(fileInputStream2);
            throw th;
        }
    }

    public static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            Path$$ExternalSyntheticBUOutline0.m(e);
            return 0.0d;
        }
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

    public static ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        short readShort = byteOrderedDataInputStream.readShort();
        boolean z = DEBUG;
        if (readShort == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readShort, new StringBuilder("Invalid byte order: ")));
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void addDefaultValuesForCompatibility() {
        String attribute = getAttribute("DateTimeOriginal");
        HashMap[] hashMapArr = this.mAttributes;
        if (attribute != null && getAttribute("DateTime") == null) {
            hashMapArr[0].put("DateTime", ExifAttribute.createString(attribute));
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
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("tag shouldn't be null");
            return null;
        }
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            int i = exifAttribute.f865format;
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
            boolean contains = RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str);
            ByteOrder byteOrder = this.mExifByteOrder;
            if (!contains) {
                return exifAttribute.getStringValue(byteOrder);
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int getAttributeInt(int i, String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            try {
                return exifAttribute.getIntValue(this.mExifByteOrder);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final ExifAttribute getExifAttribute(String str) {
        ExifAttribute exifAttribute;
        int i;
        ExifAttribute exifAttribute2;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (DEBUG) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.mMimeType) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (exifAttribute2 = this.mXmpFromSeparateMarker) != null)) {
            return exifAttribute2;
        }
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            ExifAttribute exifAttribute3 = (ExifAttribute) this.mAttributes[i2].get(str);
            if (exifAttribute3 != null) {
                return exifAttribute3;
            }
        }
        if (!"Xmp".equals(str) || (exifAttribute = this.mXmpFromSeparateMarker) == null) {
            return null;
        }
        return exifAttribute;
    }

    public final void getHeifAttributes(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) {
        String str;
        String str2;
        String str3;
        if (i == 15 && Build.VERSION.SDK_INT < 31) {
            a$$ExternalSyntheticBUOutline0.m("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                    public long mPosition;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j, byte[] bArr, int i2, int i3) {
                        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = SeekableByteOrderedDataInputStream.this;
                        DataInputStream dataInputStream = seekableByteOrderedDataInputStream2.mDataInputStream;
                        if (i3 == 0) {
                            return 0;
                        }
                        if (j >= 0) {
                            try {
                                long j2 = this.mPosition;
                                if (j2 != j) {
                                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                                        seekableByteOrderedDataInputStream2.seek(j);
                                        this.mPosition = j;
                                    }
                                }
                                if (i3 > dataInputStream.available()) {
                                    i3 = dataInputStream.available();
                                }
                                int read = seekableByteOrderedDataInputStream2.read(bArr, i2, i3);
                                if (read >= 0) {
                                    this.mPosition += read;
                                    return read;
                                }
                            } catch (IOException unused) {
                            }
                            this.mPosition = -1L;
                            return -1;
                        }
                        return -1;
                    }
                });
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.mAttributes;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", ExifAttribute.createUShort(Integer.parseInt(str), this.mExifByteOrder));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", ExifAttribute.createUShort(Integer.parseInt(str3), this.mExifByteOrder));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", ExifAttribute.createUShort(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.mExifByteOrder));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.seek(parseInt2);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i2 = parseInt2 + 6;
                    int i3 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i3];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.mOffsetToExifData = i2;
                    readExifSegment(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    seekableByteOrderedDataInputStream.seek(j);
                    byte[] bArr3 = new byte[parseInt5];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    this.mXmpFromSeparateMarker = new ExifAttribute(j, 1, parseInt5, bArr3);
                    this.mFileOnDiskContainsSeparateXmpMarker = true;
                }
                if (DEBUG) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        r22.mByteOrder = r21.mExifByteOrder;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0168, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getJpegAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream, int i, int i2) {
        int i3;
        boolean z = DEBUG;
        if (z) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        byte readByte = byteOrderedDataInputStream.readByte();
        byte b = -1;
        if (readByte != -1) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte & 255, new StringBuilder("Invalid marker: ")));
            return;
        }
        if (byteOrderedDataInputStream.readByte() != -40) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte & 255, new StringBuilder("Invalid marker: ")));
            return;
        }
        int i4 = 2;
        while (true) {
            byte readByte2 = byteOrderedDataInputStream.readByte();
            if (readByte2 != b) {
                a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readByte2 & 255, new StringBuilder("Invalid marker:")));
                return;
            }
            while (true) {
                int i5 = i4 + 1;
                byte readByte3 = byteOrderedDataInputStream.readByte();
                if (readByte3 != b) {
                    if (z) {
                        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                        int i6 = readUnsignedShort - 2;
                        int i7 = i4 + 4;
                        if (z) {
                            Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                        }
                        if (i6 < 0) {
                            a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                            return;
                        }
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.mAttributes;
                            if (readByte3 != -2) {
                                switch (readByte3) {
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        break;
                                    default:
                                        switch (readByte3) {
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                            default:
                                                switch (readByte3) {
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        break;
                                                    default:
                                                        switch (readByte3) {
                                                        }
                                                }
                                        }
                                }
                                byteOrderedDataInputStream.skipFully(1);
                                hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", ExifAttribute.createULong(byteOrderedDataInputStream.readUnsignedShort(), this.mExifByteOrder));
                                i6 = readUnsignedShort - 7;
                            } else {
                                byte[] bArr = new byte[i6];
                                byteOrderedDataInputStream.readFully(bArr);
                                if (getAttribute("UserComment") == null) {
                                    hashMapArr[1].put("UserComment", ExifAttribute.createString(new String(bArr, ASCII)));
                                }
                                i6 = 0;
                            }
                        } else {
                            byte[] bArr2 = new byte[i6];
                            byteOrderedDataInputStream.readFully(bArr2);
                            int i8 = i7 + i6;
                            byte[] bArr3 = IDENTIFIER_EXIF_APP1;
                            if (ExifInterfaceUtils.startsWith(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i6);
                                this.mOffsetToExifData = i + i7 + bArr3.length;
                                readExifSegment(i2, copyOfRange);
                                setThumbnailData(new ByteOrderedDataInputStream(copyOfRange));
                            } else {
                                byte[] bArr4 = IDENTIFIER_XMP_APP1;
                                if (ExifInterfaceUtils.startsWith(bArr2, bArr4)) {
                                    int length = i7 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i6);
                                    i3 = i8;
                                    this.mXmpFromSeparateMarker = new ExifAttribute(length, 1, copyOfRange2.length, copyOfRange2);
                                    this.mFileOnDiskContainsSeparateXmpMarker = true;
                                    i6 = 0;
                                    i7 = i3;
                                }
                            }
                            i3 = i8;
                            i6 = 0;
                            i7 = i3;
                        }
                        if (i6 < 0) {
                            a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                            return;
                        } else {
                            byteOrderedDataInputStream.skipFully(i6);
                            i4 = i7 + i6;
                            b = -1;
                        }
                    }
                } else {
                    i4 = i5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00f4, code lost:
    
        if (r7 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getMimeType(BufferedInputStream bufferedInputStream) {
        int i;
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        int i2;
        ByteOrderedDataInputStream byteOrderedDataInputStream2;
        int i3;
        int i4;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = JPEG_SIGNATURE;
            if (i5 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i5] != bArr3[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr2[i6] != bytes[i6]) {
                        ByteOrderedDataInputStream byteOrderedDataInputStream3 = null;
                        try {
                            byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr2);
                            try {
                                try {
                                    readInt = byteOrderedDataInputStream.readInt();
                                    bArr = new byte[4];
                                    byteOrderedDataInputStream.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                byteOrderedDataInputStream3 = byteOrderedDataInputStream;
                                if (byteOrderedDataInputStream3 != null) {
                                    byteOrderedDataInputStream3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            byteOrderedDataInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (byteOrderedDataInputStream3 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, HEIF_TYPE_FTYP)) {
                            if (readInt == 1) {
                                readInt = byteOrderedDataInputStream.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        byteOrderedDataInputStream.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, HEIF_BRAND_MIF1)) {
                                                    z = true;
                                                } else if (Arrays.equals(bArr4, HEIF_BRAND_HEIC)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, HEIF_BRAND_AVIF) || Arrays.equals(bArr4, HEIF_BRAND_AVIS)) {
                                                    z3 = true;
                                                }
                                                if (z) {
                                                    if (z2) {
                                                        byteOrderedDataInputStream.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z3) {
                                                        byteOrderedDataInputStream.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (DEBUG) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                            }
                                        }
                                    } catch (EOFException unused) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                byteOrderedDataInputStream.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr2);
                                    try {
                                        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream2);
                                        this.mExifByteOrder = readByteOrder;
                                        byteOrderedDataInputStream2.mByteOrder = readByteOrder;
                                        short readShort = byteOrderedDataInputStream2.readShort();
                                        i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                        byteOrderedDataInputStream2.close();
                                    } catch (Exception unused2) {
                                        if (byteOrderedDataInputStream2 != null) {
                                            byteOrderedDataInputStream2.close();
                                        }
                                        i3 = i;
                                        if (i3 == 0) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        byteOrderedDataInputStream3 = byteOrderedDataInputStream2;
                                        if (byteOrderedDataInputStream3 != null) {
                                            byteOrderedDataInputStream3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    byteOrderedDataInputStream2 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    ByteOrderedDataInputStream byteOrderedDataInputStream4 = new ByteOrderedDataInputStream(bArr2);
                                    try {
                                        ByteOrder readByteOrder2 = readByteOrder(byteOrderedDataInputStream4);
                                        this.mExifByteOrder = readByteOrder2;
                                        byteOrderedDataInputStream4.mByteOrder = readByteOrder2;
                                        i4 = byteOrderedDataInputStream4.readShort() != 85 ? i : 1;
                                        byteOrderedDataInputStream4.close();
                                    } catch (Exception unused4) {
                                        byteOrderedDataInputStream3 = byteOrderedDataInputStream4;
                                        if (byteOrderedDataInputStream3 != null) {
                                            byteOrderedDataInputStream3.close();
                                        }
                                        i4 = i;
                                        if (i4 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        byteOrderedDataInputStream3 = byteOrderedDataInputStream4;
                                        if (byteOrderedDataInputStream3 != null) {
                                            byteOrderedDataInputStream3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused5) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i4 == 0) {
                                    return 10;
                                }
                                int i7 = i;
                                while (true) {
                                    byte[] bArr5 = PNG_SIGNATURE;
                                    if (i7 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i7] != bArr5[i7]) {
                                        int i8 = i;
                                        while (true) {
                                            byte[] bArr6 = WEBP_SIGNATURE_1;
                                            if (i8 >= bArr6.length) {
                                                int i9 = i;
                                                while (true) {
                                                    byte[] bArr7 = WEBP_SIGNATURE_2;
                                                    if (i9 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                            } else {
                                                if (bArr2[i8] != bArr6[i8]) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                        return i;
                                    }
                                    i7++;
                                }
                            }
                        }
                        byteOrderedDataInputStream.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void getOrfAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        int i;
        int i2;
        getRawAttributes(seekableByteOrderedDataInputStream);
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
            seekableByteOrderedDataInputStream2.mByteOrder = this.mExifByteOrder;
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.seek(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.seek(12L);
            }
            readImageFileDirectory(seekableByteOrderedDataInputStream2, 6);
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

    public final void getPngAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (DEBUG) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        int i = byteOrderedDataInputStream.mPosition;
        byteOrderedDataInputStream.skipFully(PNG_SIGNATURE.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                break;
            }
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i2 = byteOrderedDataInputStream.mPosition;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    break;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.mOffsetToExifData = i4;
                    byte[] bArr = new byte[readInt];
                    byteOrderedDataInputStream.readFully(bArr);
                    int readInt3 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    readExifSegment(0, bArr);
                    validateImages();
                    setThumbnailData(new ByteOrderedDataInputStream(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = PNG_ITXT_XMP_KEYWORD;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        byteOrderedDataInputStream.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = byteOrderedDataInputStream.mPosition - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            byteOrderedDataInputStream.readFully(bArr4);
                            this.mXmpFromSeparateMarker = new ExifAttribute(i5, 1, i6, bArr4);
                            z2 = true;
                        }
                    }
                }
                byteOrderedDataInputStream.skipFully(i3 - byteOrderedDataInputStream.mPosition);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
        this.mFileOnDiskContainsSeparateXmpMarker = z2;
    }

    public final void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        boolean z = DEBUG;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.skipFully(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.skipFully(i - byteOrderedDataInputStream.mPosition);
        byteOrderedDataInputStream.readFully(bArr4);
        getJpegAttributes(new ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.skipFully(i3 - byteOrderedDataInputStream.mPosition);
        byteOrderedDataInputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        int readInt = byteOrderedDataInputStream.readInt();
        if (z) {
            CameraState$Type$EnumUnboxingLocalUtility.m(readInt, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i4 = 0; i4 < readInt; i4++) {
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
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.skipFully(readUnsignedShort2);
        }
    }

    public final void getRawAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 0);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 5);
        updateImageSizeValues(seekableByteOrderedDataInputStream, 4);
        validateImages();
        if (this.mMimeType == 8) {
            HashMap[] hashMapArr = this.mAttributes;
            ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.bytes);
                seekableByteOrderedDataInputStream2.mByteOrder = this.mExifByteOrder;
                seekableByteOrderedDataInputStream2.skipFully(6);
                readImageFileDirectory(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    hashMapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    public final void getRw2Attributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        if (DEBUG) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        getRawAttributes(seekableByteOrderedDataInputStream);
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            getJpegAttributes(new ByteOrderedDataInputStream(exifAttribute.bytes), (int) exifAttribute.bytesOffset, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    public final boolean getStandaloneAttributes(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        byte[] bArr2 = new byte[bArr.length];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = seekableByteOrderedDataInputStream.mDataInputStream.read(bArr3, i, bArr3.length - i);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.mOffsetToExifData = bArr.length;
                readExifSegment(0, copyOf);
                return true;
            }
            i += read;
            seekableByteOrderedDataInputStream.mPosition += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] getThumbnailBytes() {
        FileDescriptor fileDescriptor;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (this.mHasThumbnail) {
            byte[] bArr = this.mThumbnailBytes;
            if (bArr != null) {
                return bArr;
            }
            try {
                inputStream = this.mAssetInputStream;
                try {
                    try {
                        if (inputStream != null) {
                            try {
                                if (!inputStream.markSupported()) {
                                    Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                    ExifInterfaceUtils.closeQuietly(inputStream);
                                    return null;
                                }
                                inputStream.reset();
                            } catch (Exception e) {
                                e = e;
                                fileDescriptor = null;
                                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                                ExifInterfaceUtils.closeQuietly(inputStream);
                                if (fileDescriptor != null) {
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                fileDescriptor = null;
                                inputStream2 = inputStream;
                                ExifInterfaceUtils.closeQuietly(inputStream2);
                                if (fileDescriptor != null) {
                                }
                                throw th;
                            }
                        } else {
                            String str = this.mFilename;
                            if (str == null) {
                                FileDescriptor dup = Os.dup(this.mSeekableFileDescriptor);
                                try {
                                    Os.lseek(dup, 0L, OsConstants.SEEK_SET);
                                    fileDescriptor = dup;
                                    inputStream = new FileInputStream(dup);
                                    ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
                                    byteOrderedDataInputStream.skipFully(this.mThumbnailOffset + this.mOffsetToExifData);
                                    byte[] bArr2 = new byte[this.mThumbnailLength];
                                    byteOrderedDataInputStream.readFully(bArr2);
                                    this.mThumbnailBytes = bArr2;
                                    ExifInterfaceUtils.closeQuietly(inputStream);
                                    if (fileDescriptor != null) {
                                        try {
                                            Os.close(fileDescriptor);
                                            return bArr2;
                                        } catch (ErrnoException e2) {
                                            Log.e("ExifInterfaceUtils", "Error closing fd.", e2);
                                        }
                                    }
                                    return bArr2;
                                } catch (Exception e3) {
                                    e = e3;
                                    fileDescriptor = dup;
                                    inputStream = null;
                                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                                    ExifInterfaceUtils.closeQuietly(inputStream);
                                    if (fileDescriptor != null) {
                                    }
                                    return null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileDescriptor = dup;
                                    ExifInterfaceUtils.closeQuietly(inputStream2);
                                    if (fileDescriptor != null) {
                                    }
                                    throw th;
                                }
                            }
                            inputStream = new FileInputStream(str);
                        }
                        ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(inputStream);
                        byteOrderedDataInputStream2.skipFully(this.mThumbnailOffset + this.mOffsetToExifData);
                        byte[] bArr22 = new byte[this.mThumbnailLength];
                        byteOrderedDataInputStream2.readFully(bArr22);
                        this.mThumbnailBytes = bArr22;
                        ExifInterfaceUtils.closeQuietly(inputStream);
                        if (fileDescriptor != null) {
                        }
                        return bArr22;
                    } catch (Exception e4) {
                        e = e4;
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                        ExifInterfaceUtils.closeQuietly(inputStream);
                        if (fileDescriptor != null) {
                            try {
                                Os.close(fileDescriptor);
                            } catch (ErrnoException e5) {
                                Log.e("ExifInterfaceUtils", "Error closing fd.", e5);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                    ExifInterfaceUtils.closeQuietly(inputStream2);
                    if (fileDescriptor != null) {
                        try {
                            Os.close(fileDescriptor);
                        } catch (ErrnoException e6) {
                            Log.e("ExifInterfaceUtils", "Error closing fd.", e6);
                        }
                    }
                    throw th;
                }
                fileDescriptor = null;
            } catch (Exception e7) {
                e = e7;
                inputStream = null;
                fileDescriptor = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        }
        return null;
    }

    public final void getWebpAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        if (DEBUG) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.mByteOrder = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.skipFully(WEBP_SIGNATURE_1.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i = length + 8;
                if (Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    byte[] bArr4 = IDENTIFIER_EXIF_APP1;
                    if (ExifInterfaceUtils.startsWith(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.mOffsetToExifData = i;
                    readExifSegment(0, bArr3);
                    setThumbnailData(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.skipFully(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void handleThumbnailFromJfif(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        if (this.mMimeType == 7) {
            intValue += this.mOrfMakerNoteOffset;
        }
        if (intValue > 0 && intValue2 > 0) {
            this.mHasThumbnail = true;
            if (this.mFilename == null && this.mAssetInputStream == null && this.mSeekableFileDescriptor == null) {
                byte[] bArr = new byte[intValue2];
                byteOrderedDataInputStream.skipFully(intValue);
                byteOrderedDataInputStream.readFully(bArr);
                this.mThumbnailBytes = bArr;
            }
            this.mThumbnailOffset = intValue;
            this.mThumbnailLength = intValue2;
        }
        if (DEBUG) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + intValue + ", length: " + intValue2);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadAttributes(InputStream inputStream) {
        boolean z = DEBUG;
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            try {
                try {
                    this.mAttributes[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException e) {
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    addDefaultValuesForCompatibility();
                    if (z) {
                        printAttributes();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                addDefaultValuesForCompatibility();
                if (z) {
                    printAttributes();
                }
                throw th;
            }
        }
        boolean z2 = this.mIsExifDataOnly;
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.mMimeType = getMimeType(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.mMimeType;
        if (i2 != 4 && i2 != 9 && i2 != 13 && i2 != 14) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (!z2) {
                int i3 = this.mMimeType;
                if (i3 != 12 && i3 != 15) {
                    if (i3 == 7) {
                        getOrfAttributes(seekableByteOrderedDataInputStream);
                    } else if (i3 == 10) {
                        getRw2Attributes(seekableByteOrderedDataInputStream);
                    } else {
                        getRawAttributes(seekableByteOrderedDataInputStream);
                    }
                }
                getHeifAttributes(seekableByteOrderedDataInputStream, i3);
            } else if (!getStandaloneAttributes(seekableByteOrderedDataInputStream)) {
                addDefaultValuesForCompatibility();
                if (z) {
                    printAttributes();
                    return;
                }
                return;
            }
            seekableByteOrderedDataInputStream.seek(this.mOffsetToExifData);
            setThumbnailData(seekableByteOrderedDataInputStream);
            addDefaultValuesForCompatibility();
            if (z) {
                return;
            }
            printAttributes();
            return;
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream);
        int i4 = this.mMimeType;
        if (i4 == 4) {
            getJpegAttributes(byteOrderedDataInputStream, 0, 0);
        } else if (i4 == 13) {
            getPngAttributes(byteOrderedDataInputStream);
        } else if (i4 == 9) {
            getRafAttributes(byteOrderedDataInputStream);
        } else if (i4 == 14) {
            getWebpAttributes(byteOrderedDataInputStream);
        }
        addDefaultValuesForCompatibility();
        if (z) {
        }
    }

    public final void parseTiffHeaders(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) {
        ByteOrder readByteOrder = readByteOrder(seekableByteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        seekableByteOrderedDataInputStream.mByteOrder = readByteOrder;
        int readUnsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
        int i = this.mMimeType;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline1.m(readUnsignedShort, new StringBuilder("Invalid start code: ")));
            return;
        }
        int readInt = seekableByteOrderedDataInputStream.readInt();
        if (readInt < 8) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            seekableByteOrderedDataInputStream.skipFully(i2);
        }
    }

    public final void printAttributes() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.mAttributes;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "The size of tag group[", "]: ");
            m2m.append(hashMapArr[i].size());
            Log.d("ExifInterface", m2m.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.getStringValue(this.mExifByteOrder) + "'");
            }
            i++;
        }
    }

    public final void readExifSegment(int i, byte[] bArr) {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        parseTiffHeaders(seekableByteOrderedDataInputStream);
        readImageFileDirectory(seekableByteOrderedDataInputStream, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void readImageFileDirectory(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z;
        short s;
        HashMap[] hashMapArr2;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        int i3;
        ExifTag exifTag;
        HashSet hashSet2;
        String str;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = seekableByteOrderedDataInputStream.mPosition;
        int i6 = seekableByteOrderedDataInputStream.mLength;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.mAttributesOffsets;
        hashSet3.add(valueOf);
        short readShort = seekableByteOrderedDataInputStream.readShort();
        String str2 = "ExifInterface";
        boolean z3 = DEBUG;
        if (z3) {
            CameraState$Type$EnumUnboxingLocalUtility.m(readShort, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        if (readShort <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            hashMapArr = this.mAttributes;
            if (s2 >= readShort) {
                break;
            }
            int readUnsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int readInt = seekableByteOrderedDataInputStream.readInt();
            long j5 = seekableByteOrderedDataInputStream.mPosition + 4;
            short s3 = readShort;
            ExifTag exifTag2 = (ExifTag) sExifTagMapsForReading[i4].get(Integer.valueOf(readUnsignedShort2));
            if (z3) {
                z = z3;
                s = s2;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d(str2, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i4), Integer.valueOf(readUnsignedShort2), exifTag2 != null ? exifTag2.name : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z = z3;
                s = s2;
                hashMapArr2 = hashMapArr;
            }
            if (exifTag2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < IFD_FORMAT_BYTES_PER_FORMAT.length) {
                        int i7 = exifTag2.primaryFormat;
                        if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = exifTag2.secondaryFormat) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            j = j5;
                            j2 = readInt * r13[readUnsignedShort3];
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z) {
                                    CameraState$Type$EnumUnboxingLocalUtility.m(readInt, "Skip the tag entry since the number of components is invalid: ", str2);
                                }
                                z2 = false;
                                if (z2) {
                                    seekableByteOrderedDataInputStream.seek(j);
                                    str = str2;
                                    hashSet2 = hashSet;
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int readInt2 = seekableByteOrderedDataInputStream.readInt();
                                        if (z) {
                                            CameraState$Type$EnumUnboxingLocalUtility.m(readInt2, "seek to data offset: ", str2);
                                        }
                                        i3 = readUnsignedShort2;
                                        if (this.mMimeType == 7) {
                                            if ("MakerNote".equals(exifTag2.name)) {
                                                this.mOrfMakerNoteOffset = readInt2;
                                            } else if (i4 == 6 && "ThumbnailImage".equals(exifTag2.name)) {
                                                this.mOrfThumbnailOffset = readInt2;
                                                this.mOrfThumbnailLength = readInt;
                                                ExifAttribute createUShort = ExifAttribute.createUShort(6, this.mExifByteOrder);
                                                j3 = j6;
                                                ExifAttribute createULong = ExifAttribute.createULong(this.mOrfThumbnailOffset, this.mExifByteOrder);
                                                exifTag = exifTag2;
                                                ExifAttribute createULong2 = ExifAttribute.createULong(this.mOrfThumbnailLength, this.mExifByteOrder);
                                                hashMapArr2[4].put("Compression", createUShort);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", createULong);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", createULong2);
                                                seekableByteOrderedDataInputStream.seek(readInt2);
                                            }
                                        }
                                        exifTag = exifTag2;
                                        j3 = j6;
                                        seekableByteOrderedDataInputStream.seek(readInt2);
                                    } else {
                                        j3 = j6;
                                        i3 = readUnsignedShort2;
                                        exifTag = exifTag2;
                                    }
                                    Integer num = (Integer) sExifPointerTagMap.get(Integer.valueOf(i3));
                                    if (z) {
                                        Log.d(str2, "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = seekableByteOrderedDataInputStream.readInt() & BodyPartID.bodyIdMax;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = seekableByteOrderedDataInputStream.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z) {
                                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(j4), exifTag.name));
                                            }
                                            if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                hashSet2 = hashSet;
                                                if (z) {
                                                    String m = Recorder$$ExternalSyntheticOutline2.m(j4, "Skip jump into the IFD since its offset is invalid: ");
                                                    if (i6 != -1) {
                                                        m = m + " (total length: " + i6 + ")";
                                                    }
                                                    Log.d(str2, m);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    seekableByteOrderedDataInputStream.seek(j4);
                                                    readImageFileDirectory(seekableByteOrderedDataInputStream, num.intValue());
                                                } else if (z) {
                                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            seekableByteOrderedDataInputStream.seek(j3);
                                            str = str2;
                                        } else {
                                            readUnsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z) {
                                        }
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z) {
                                        }
                                        seekableByteOrderedDataInputStream.seek(j3);
                                        str = str2;
                                    } else {
                                        hashSet2 = hashSet;
                                        long j7 = j3;
                                        int i8 = seekableByteOrderedDataInputStream.mPosition + this.mOffsetToExifData;
                                        byte[] bArr = new byte[(int) j2];
                                        seekableByteOrderedDataInputStream.readFully(bArr);
                                        str = str2;
                                        ExifAttribute exifAttribute = new ExifAttribute(i8, readUnsignedShort3, readInt, bArr);
                                        HashMap hashMap = hashMapArr2[i];
                                        String str3 = exifTag.name;
                                        hashMap.put(str3, exifAttribute);
                                        if ("DNGVersion".equals(str3)) {
                                            this.mMimeType = 3;
                                        }
                                        if ((("Make".equals(str3) || "Model".equals(str3)) && exifAttribute.getStringValue(this.mExifByteOrder).contains("PENTAX")) || ("Compression".equals(str3) && exifAttribute.getIntValue(this.mExifByteOrder) == 65535)) {
                                            this.mMimeType = 8;
                                        }
                                        if (seekableByteOrderedDataInputStream.mPosition != j7) {
                                            seekableByteOrderedDataInputStream.seek(j7);
                                        }
                                    }
                                }
                                s2 = (short) (s + 1);
                                i4 = i;
                                str2 = str;
                                hashSet3 = hashSet2;
                                readShort = s3;
                                z3 = z;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s2 = (short) (s + 1);
                                i4 = i;
                                str2 = str;
                                hashSet3 = hashSet2;
                                readShort = s3;
                                z3 = z;
                            }
                        } else if (z) {
                            Log.d(str2, "Skip the tag entry since data format (" + IFD_FORMAT_NAMES[readUnsignedShort3] + ") is unexpected for tag: " + exifTag2.name);
                        }
                    }
                }
                j = j5;
                if (z) {
                    CameraState$Type$EnumUnboxingLocalUtility.m(readUnsignedShort3, "Skip the tag entry since data format is invalid: ", str2);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                }
                s2 = (short) (s + 1);
                i4 = i;
                str2 = str;
                hashSet3 = hashSet2;
                readShort = s3;
                z3 = z;
            } else if (z) {
                CameraState$Type$EnumUnboxingLocalUtility.m(readUnsignedShort2, "Skip the tag entry since tag number is not defined: ", str2);
            }
            j = j5;
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            s2 = (short) (s + 1);
            i4 = i;
            str2 = str;
            hashSet3 = hashSet2;
            readShort = s3;
            z3 = z;
        }
        HashSet hashSet4 = hashSet3;
        String str4 = str2;
        boolean z4 = z3;
        int readInt3 = seekableByteOrderedDataInputStream.readInt();
        if (z4) {
            Log.d(str4, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j8 = readInt3;
        if (j8 <= 0) {
            if (z4) {
                CameraState$Type$EnumUnboxingLocalUtility.m(readInt3, "Stop reading file since a wrong offset may cause an infinite loop: ", str4);
            }
        } else {
            if (hashSet4.contains(Integer.valueOf(readInt3))) {
                if (z4) {
                    CameraState$Type$EnumUnboxingLocalUtility.m(readInt3, "Stop reading file since re-reading an IFD may cause an infinite loop: ", str4);
                    return;
                }
                return;
            }
            seekableByteOrderedDataInputStream.seek(j8);
            if (hashMapArr[4].isEmpty()) {
                readImageFileDirectory(seekableByteOrderedDataInputStream, 4);
            } else if (hashMapArr[5].isEmpty()) {
                readImageFileDirectory(seekableByteOrderedDataInputStream, 5);
            }
        }
    }

    public final void removeAttribute(String str) {
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            this.mAttributes[i].remove(str);
        }
    }

    public final void replaceInvalidTags(int i, String str, String str2) {
        HashMap[] hashMapArr = this.mAttributes;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (ExifAttribute) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4 A[Catch: all -> 0x00eb, Exception -> 0x00ef, TRY_ENTER, TryCatch #19 {Exception -> 0x00ef, all -> 0x00eb, blocks: (B:66:0x00e4, B:67:0x00fd, B:71:0x00f2), top: B:64:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2 A[Catch: all -> 0x00eb, Exception -> 0x00ef, TryCatch #19 {Exception -> 0x00ef, all -> 0x00eb, blocks: (B:66:0x00e4, B:67:0x00fd, B:71:0x00f2), top: B:64:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void saveAttributes() {
        FileOutputStream fileOutputStream;
        File createTempFile;
        InputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        boolean z;
        FileOutputStream fileOutputStream2;
        BufferedInputStream bufferedInputStream;
        InputStream fileInputStream2;
        InputStream fileInputStream3;
        int i = this.mMimeType;
        if (i != 4 && i != 13 && i != 14) {
            a$$ExternalSyntheticBUOutline0.m$4("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        String str = this.mFilename;
        FileDescriptor fileDescriptor = this.mSeekableFileDescriptor;
        if (fileDescriptor == null && str == null) {
            a$$ExternalSyntheticBUOutline0.m$4("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (this.mHasThumbnail && this.mHasThumbnailStrips && !this.mAreThumbnailStripsConsecutive) {
            a$$ExternalSyntheticBUOutline0.m$4("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i2 = this.mThumbnailCompression;
        InputStream inputStream = null;
        this.mThumbnailBytes = (i2 == 6 || i2 == 7) ? getThumbnailBytes() : null;
        try {
            createTempFile = File.createTempFile("temp", "tmp");
            if (str != null) {
                fileInputStream = new FileInputStream(str);
            } else {
                Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(fileDescriptor);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (Exception e) {
                e = e;
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            ExifInterfaceUtils.copy(fileInputStream, fileOutputStream);
            ExifInterfaceUtils.closeQuietly(fileInputStream);
            ExifInterfaceUtils.closeQuietly(fileOutputStream);
            try {
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                try {
                    fileInputStream3 = new FileInputStream(createTempFile);
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                    z = false;
                    ExifInterfaceUtils.closeQuietly(inputStream);
                    ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                    if (!z) {
                        createTempFile.delete();
                    }
                    throw th;
                }
                try {
                    if (str != null) {
                        fileOutputStream2 = new FileOutputStream(str);
                    } else {
                        Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                        fileOutputStream2 = new FileOutputStream(fileDescriptor);
                    }
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream3);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                            try {
                                int i3 = this.mMimeType;
                                if (i3 == 4) {
                                    saveJpegAttributes(bufferedInputStream, bufferedOutputStream);
                                } else if (i3 == 13) {
                                    savePngAttributes(bufferedInputStream, bufferedOutputStream);
                                } else if (i3 == 14) {
                                    saveWebpAttributes(bufferedInputStream, bufferedOutputStream);
                                }
                                ExifInterfaceUtils.closeQuietly(bufferedInputStream);
                                ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                                createTempFile.delete();
                                this.mThumbnailBytes = null;
                            } catch (Exception e3) {
                                e = e3;
                                inputStream = fileInputStream3;
                                try {
                                    fileInputStream2 = new FileInputStream(createTempFile);
                                } catch (Exception e4) {
                                    e = e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                                try {
                                    if (str == null) {
                                        fileOutputStream2 = new FileOutputStream(str);
                                    } else {
                                        Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(fileDescriptor);
                                    }
                                    ExifInterfaceUtils.copy(fileInputStream2, fileOutputStream2);
                                    ExifInterfaceUtils.closeQuietly(fileInputStream2);
                                    ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                    throw new IOException("Failed to save new file", e);
                                } catch (Exception e5) {
                                    e = e5;
                                    inputStream = fileInputStream2;
                                    z = true;
                                    try {
                                        throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        try {
                                            ExifInterfaceUtils.closeQuietly(inputStream);
                                            ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                            throw th;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            inputStream = bufferedInputStream;
                                            ExifInterfaceUtils.closeQuietly(inputStream);
                                            ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                                            if (!z) {
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    inputStream = fileInputStream2;
                                    z = false;
                                    ExifInterfaceUtils.closeQuietly(inputStream);
                                    ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                                    throw th;
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            bufferedOutputStream = null;
                        } catch (Throwable th9) {
                            th = th9;
                            bufferedOutputStream = null;
                            inputStream = bufferedInputStream;
                            z = false;
                            ExifInterfaceUtils.closeQuietly(inputStream);
                            ExifInterfaceUtils.closeQuietly(bufferedOutputStream);
                            if (!z) {
                            }
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        bufferedInputStream = null;
                        bufferedOutputStream = bufferedInputStream;
                        inputStream = fileInputStream3;
                        fileInputStream2 = new FileInputStream(createTempFile);
                        if (str == null) {
                        }
                        ExifInterfaceUtils.copy(fileInputStream2, fileOutputStream2);
                        ExifInterfaceUtils.closeQuietly(fileInputStream2);
                        ExifInterfaceUtils.closeQuietly(fileOutputStream2);
                        throw new IOException("Failed to save new file", e);
                    }
                } catch (Exception e8) {
                    e = e8;
                    fileOutputStream2 = null;
                    bufferedInputStream = null;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream2 = null;
                bufferedInputStream = null;
                bufferedOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            inputStream = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th10) {
                th = th10;
                ExifInterfaceUtils.closeQuietly(inputStream);
                ExifInterfaceUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            inputStream = fileInputStream;
            ExifInterfaceUtils.closeQuietly(inputStream);
            ExifInterfaceUtils.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    public final void saveJpegAttributes(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        byte readByte;
        if (DEBUG) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bufferedInputStream);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (byteOrderedDataInputStream.readByte() != -1) {
            a$$ExternalSyntheticBUOutline0.m$4("Invalid marker");
            return;
        }
        byteOrderedDataOutputStream.writeByte(-1);
        if (byteOrderedDataInputStream.readByte() != -40) {
            a$$ExternalSyntheticBUOutline0.m$4("Invalid marker");
            return;
        }
        byteOrderedDataOutputStream.writeByte(-40);
        byteOrderedDataOutputStream.writeByte(-1);
        byteOrderedDataOutputStream.writeByte(-31);
        this.mOffsetToExifData = writeExifSegment(byteOrderedDataOutputStream);
        ExifAttribute exifAttribute = this.mXmpFromSeparateMarker;
        byte[] bArr = IDENTIFIER_XMP_APP1;
        if (exifAttribute != null) {
            byteOrderedDataOutputStream.write(-1);
            byteOrderedDataOutputStream.writeByte(-31);
            byteOrderedDataOutputStream.writeUnsignedShort(bArr.length + 2 + this.mXmpFromSeparateMarker.bytes.length);
            byteOrderedDataOutputStream.write(bArr);
            byteOrderedDataOutputStream.write(this.mXmpFromSeparateMarker.bytes);
            this.mFileOnDiskContainsSeparateXmpMarker = true;
        }
        byte[] bArr2 = new byte[4096];
        while (byteOrderedDataInputStream.readByte() == -1) {
            do {
                readByte = byteOrderedDataInputStream.readByte();
            } while (readByte == -1);
            if (readByte == -39 || readByte == -38) {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream);
                return;
            }
            if (readByte != -31) {
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
                byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort);
                int i = readUnsignedShort - 2;
                if (i < 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                    return;
                }
                while (i > 0) {
                    int read = byteOrderedDataInputStream.read(bArr2, 0, Math.min(i, 4096));
                    if (read >= 0) {
                        byteOrderedDataOutputStream.write(bArr2, 0, read);
                        i -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
                int i2 = readUnsignedShort2 - 2;
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$4("Invalid length");
                    return;
                }
                int length = bArr.length;
                byte[] bArr3 = IDENTIFIER_EXIF_APP1;
                byte[] bArr4 = i2 >= length ? new byte[bArr.length] : i2 >= bArr3.length ? new byte[bArr3.length] : null;
                if (bArr4 != null) {
                    byteOrderedDataInputStream.readFully(bArr4);
                    if (ExifInterfaceUtils.startsWith(bArr4, bArr3) || ExifInterfaceUtils.startsWith(bArr4, bArr)) {
                        byteOrderedDataInputStream.skipFully(i2 - bArr4.length);
                    }
                }
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(readByte);
                byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort2);
                if (bArr4 != null) {
                    i2 -= bArr4.length;
                    byteOrderedDataOutputStream.write(bArr4);
                }
                while (i2 > 0) {
                    int read2 = byteOrderedDataInputStream.read(bArr2, 0, Math.min(i2, 4096));
                    if (read2 >= 0) {
                        byteOrderedDataOutputStream.write(bArr2, 0, read2);
                        i2 -= read2;
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4("Invalid marker");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0076 -> B:9:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void savePngAttributes(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = androidx.exifinterface.media.ExifInterface.DEBUG
            if (r0 == 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L25:
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r0 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            r0.<init>(r9)
            androidx.camera.core.impl.utils.ByteOrderedDataOutputStream r9 = new androidx.camera.core.impl.utils.ByteOrderedDataOutputStream
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = androidx.exifinterface.media.ExifInterface.PNG_SIGNATURE
            int r10 = r10.length
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r10)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L41
            boolean r10 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r10 == 0) goto L76
        L41:
            r10 = r1
        L42:
            if (r1 != 0) goto L4b
            if (r10 == 0) goto L47
            goto L4b
        L47:
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9)
            return
        L4b:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L78
            r9.writeInt(r3)
            r9.writeInt(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r3)
            int r3 = r8.mOffsetToExifData
            if (r3 != 0) goto L6b
            r8.writePngExifChunk(r9)
            r1 = r2
        L6b:
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = r8.mXmpFromSeparateMarker
            if (r3 == 0) goto L42
            boolean r3 = r8.mFileOnDiskContainsSeparateXmpMarker
            if (r3 != 0) goto L42
            r8.writePngXmpItxtChunk(r9)
        L76:
            r10 = r2
            goto L42
        L78:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L89
            if (r1 == 0) goto L89
            r8.writePngExifChunk(r9)
            int r3 = r3 + 4
            r0.skipFully(r3)
            r1 = r2
            goto L42
        L89:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lbb
            byte[] r5 = androidx.exifinterface.media.ExifInterface.PNG_ITXT_XMP_KEYWORD
            int r6 = r5.length
            if (r3 < r6) goto Lbb
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lae
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = r8.mXmpFromSeparateMarker
            if (r10 == 0) goto Laa
            r8.writePngXmpItxtChunk(r9)
        Laa:
            r0.skipFully(r6)
            goto L76
        Lae:
            r9.writeInt(r3)
            r9.writeInt(r4)
            r9.write(r7)
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r6)
            goto L42
        Lbb:
            r9.writeInt(r3)
            r9.writeInt(r4)
            int r3 = r3 + 4
            androidx.exifinterface.media.ExifInterfaceUtils.copy(r0, r9, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.savePngAttributes(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027f A[Catch: all -> 0x0247, Exception -> 0x024c, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x024c, all -> 0x0247, blocks: (B:22:0x027f, B:121:0x023d, B:126:0x0258), top: B:11:0x0057 }] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.io.BufferedOutputStream, java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void saveWebpAttributes(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteOrderedDataOutputStream byteOrderedDataOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ByteOrderedDataOutputStream byteOrderedDataOutputStream2;
        int writeExifSegment;
        ByteArrayOutputStream byteArrayOutputStream3;
        byte[] bArr;
        boolean z;
        if (DEBUG) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + ((Object) bufferedOutputStream) + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bufferedInputStream, byteOrder);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream3 = new ByteOrderedDataOutputStream(bufferedOutputStream, byteOrder);
        byte[] bArr2 = WEBP_SIGNATURE_1;
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream3, bArr2.length);
        int readInt = byteOrderedDataInputStream.readInt();
        byte[] bArr3 = WEBP_SIGNATURE_2;
        byteOrderedDataInputStream.skipFully(bArr3.length);
        ByteArrayOutputStream byteArrayOutputStream4 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(byteArrayOutputStream, byteOrder);
                    i = this.mOffsetToExifData;
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                            byteArrayOutputStream4 = byteArrayOutputStream;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream4 = byteArrayOutputStream;
                            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream4);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        byteArrayOutputStream4 = bufferedOutputStream;
                        throw new IOException("Failed to save WebP file", e);
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream4 = bufferedOutputStream;
                        ExifInterfaceUtils.closeQuietly(byteArrayOutputStream4);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (i != 0) {
                ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, (i - ((bArr2.length + 4) + bArr3.length)) - 8);
                byteOrderedDataInputStream.skipFully(4);
                int readInt2 = byteOrderedDataInputStream.readInt();
                if (readInt2 % 2 != 0) {
                    readInt2++;
                }
                byteOrderedDataInputStream.skipFully(readInt2);
                writeExifSegment = writeExifSegment(byteOrderedDataOutputStream);
                byteOrderedDataOutputStream2 = byteOrderedDataOutputStream3;
                i3 = readInt;
                byteArrayOutputStream3 = byteArrayOutputStream;
            } else {
                byte[] bArr4 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr4);
                byte[] bArr5 = WEBP_CHUNK_TYPE_VP8X;
                boolean equals = Arrays.equals(bArr4, bArr5);
                byte[] bArr6 = WEBP_CHUNK_TYPE_VP8;
                byte[] bArr7 = WEBP_CHUNK_TYPE_VP8L;
                if (equals) {
                    int readInt3 = byteOrderedDataInputStream.readInt();
                    byte[] bArr8 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                    byteOrderedDataInputStream.readFully(bArr8);
                    byte b = (byte) (bArr8[0] | 8);
                    bArr8[0] = b;
                    boolean z2 = ((b >> 1) & 1) == 1;
                    byteOrderedDataOutputStream.write(bArr5);
                    byteOrderedDataOutputStream.writeInt(readInt3);
                    byteOrderedDataOutputStream.write(bArr8);
                    if (z2) {
                        byte[] bArr9 = WEBP_CHUNK_TYPE_ANIM;
                        do {
                            bArr = new byte[4];
                            byteOrderedDataInputStream.readFully(bArr);
                            int readInt4 = byteOrderedDataInputStream.readInt();
                            byteOrderedDataOutputStream.write(bArr);
                            byteOrderedDataOutputStream.writeInt(readInt4);
                            if (readInt4 % 2 == 1) {
                                readInt4++;
                            }
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt4);
                        } while (!Arrays.equals(bArr, bArr9));
                        while (true) {
                            byte[] bArr10 = new byte[4];
                            try {
                                byteOrderedDataInputStream.readFully(bArr10);
                                z = !Arrays.equals(bArr10, WEBP_CHUNK_TYPE_ANMF);
                            } catch (EOFException unused) {
                                z = true;
                            }
                            if (z) {
                                break;
                            }
                            int readInt5 = byteOrderedDataInputStream.readInt();
                            byteOrderedDataOutputStream.write(bArr10);
                            byteOrderedDataOutputStream.writeInt(readInt5);
                            if (readInt5 % 2 == 1) {
                                readInt5++;
                            }
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt5);
                        }
                        writeExifSegment = writeExifSegment(byteOrderedDataOutputStream);
                    } else {
                        while (true) {
                            byte[] bArr11 = new byte[4];
                            byteOrderedDataInputStream.readFully(bArr11);
                            int readInt6 = byteOrderedDataInputStream.readInt();
                            byteOrderedDataOutputStream.write(bArr11);
                            byteOrderedDataOutputStream.writeInt(readInt6);
                            if (readInt6 % 2 == 1) {
                                readInt6++;
                            }
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, readInt6);
                            if (Arrays.equals(bArr11, bArr6) || (bArr7 != null && Arrays.equals(bArr11, bArr7))) {
                                break;
                            }
                        }
                        writeExifSegment = writeExifSegment(byteOrderedDataOutputStream);
                    }
                    byteOrderedDataOutputStream2 = byteOrderedDataOutputStream3;
                    i3 = readInt;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                } else {
                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                        int readInt7 = byteOrderedDataInputStream.readInt();
                        int i8 = readInt7 % 2 == 1 ? readInt7 + 1 : readInt7;
                        boolean z3 = true;
                        byte[] bArr12 = new byte[3];
                        boolean equals2 = Arrays.equals(bArr4, bArr6);
                        i2 = -1;
                        byte[] bArr13 = WEBP_VP8_SIGNATURE;
                        if (equals2) {
                            byteOrderedDataInputStream.readFully(bArr12);
                            byte[] bArr14 = new byte[3];
                            byteOrderedDataInputStream.readFully(bArr14);
                            if (!Arrays.equals(bArr13, bArr14)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            i5 = byteOrderedDataInputStream.readInt();
                            i3 = readInt;
                            i8 -= 10;
                            i6 = (i5 >> 16) & 16383;
                            i4 = i5 & 16383;
                            z3 = false;
                        } else {
                            i3 = readInt;
                            if (!Arrays.equals(bArr4, bArr7)) {
                                i4 = 0;
                                i5 = 0;
                                z3 = false;
                                i6 = 0;
                            } else {
                                if (byteOrderedDataInputStream.readByte() != 47) {
                                    throw new IOException("Error checking VP8L signature");
                                }
                                i5 = byteOrderedDataInputStream.readInt();
                                i4 = (i5 & 16383) + 1;
                                i6 = ((i5 & 268419072) >>> 14) + 1;
                                if ((i5 & 268435456) == 0) {
                                    z3 = false;
                                }
                                i8 -= 5;
                            }
                        }
                        byteOrderedDataOutputStream.write(bArr5);
                        byteOrderedDataOutputStream.writeInt(10);
                        byte[] bArr15 = new byte[10];
                        if (z3) {
                            i7 = i4;
                            bArr15[0] = (byte) (bArr15[0] | 16);
                        } else {
                            i7 = i4;
                        }
                        bArr15[0] = (byte) (bArr15[0] | 8);
                        int i9 = i7 - 1;
                        bufferedOutputStream = byteArrayOutputStream;
                        int i10 = i6 - 1;
                        byteOrderedDataOutputStream2 = byteOrderedDataOutputStream3;
                        try {
                            bArr15[4] = (byte) i9;
                            bArr15[5] = (byte) (i9 >> 8);
                            bArr15[6] = (byte) (i9 >> 16);
                            bArr15[7] = (byte) i10;
                            bArr15[8] = (byte) (i10 >> 8);
                            bArr15[9] = (byte) (i10 >> 16);
                            byteOrderedDataOutputStream.write(bArr15);
                            byteOrderedDataOutputStream.write(bArr4);
                            byteOrderedDataOutputStream.writeInt(readInt7);
                            if (Arrays.equals(bArr4, bArr6)) {
                                byteOrderedDataOutputStream.write(bArr12);
                                byteOrderedDataOutputStream.write(bArr13);
                                byteOrderedDataOutputStream.writeInt(i5);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                byteOrderedDataOutputStream.write(47);
                                byteOrderedDataOutputStream.writeInt(i5);
                            }
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, i8);
                            writeExifSegment = writeExifSegment(byteOrderedDataOutputStream);
                            bufferedOutputStream = bufferedOutputStream;
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, (i3 + 8) - byteOrderedDataInputStream.mPosition);
                            ByteOrderedDataOutputStream byteOrderedDataOutputStream4 = byteOrderedDataOutputStream2;
                            byteOrderedDataOutputStream4.writeInt(bufferedOutputStream.size() + bArr3.length);
                            byteOrderedDataOutputStream4.write(bArr3);
                            if (writeExifSegment != i2) {
                                this.mOffsetToExifData = ((DataOutputStream) byteOrderedDataOutputStream4.mOutputStream).size() + writeExifSegment;
                            }
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream2.writeTo(byteOrderedDataOutputStream4);
                            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream4);
                            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
                            return;
                        } catch (Exception e5) {
                            e = e5;
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream4 = byteArrayOutputStream2;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream2 = bufferedOutputStream;
                            byteArrayOutputStream4 = byteArrayOutputStream2;
                            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream4);
                            throw th;
                        }
                    }
                    byteOrderedDataOutputStream2 = byteOrderedDataOutputStream3;
                    i3 = readInt;
                    byteArrayOutputStream3 = byteArrayOutputStream;
                    writeExifSegment = -1;
                }
            }
            byteArrayOutputStream2.writeTo(byteOrderedDataOutputStream4);
            ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream4);
            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream2);
            return;
        } catch (Exception e6) {
            e = e6;
            byteArrayOutputStream4 = byteArrayOutputStream2;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream4 = byteArrayOutputStream2;
            ExifInterfaceUtils.closeQuietly(byteArrayOutputStream4);
            throw th;
        }
        i2 = -1;
        bufferedOutputStream = byteArrayOutputStream3;
        ExifInterfaceUtils.copy(byteOrderedDataInputStream, byteOrderedDataOutputStream, (i3 + 8) - byteOrderedDataInputStream.mPosition);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream42 = byteOrderedDataOutputStream2;
        byteOrderedDataOutputStream42.writeInt(bufferedOutputStream.size() + bArr3.length);
        byteOrderedDataOutputStream42.write(bArr3);
        if (writeExifSegment != i2) {
        }
        byteArrayOutputStream2 = bufferedOutputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAttribute(String str, String str2) {
        boolean z;
        String str3;
        ExifTag exifTag;
        int i;
        String str4;
        String str5;
        Rational rational;
        long j;
        long j2;
        String str6 = str;
        String str7 = str2;
        if (str6 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("tag shouldn't be null");
            return;
        }
        boolean equals = "ISOSpeedRatings".equals(str6);
        boolean z2 = DEBUG;
        if (equals) {
            if (z2) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str6 = "PhotographicSensitivity";
        }
        String str8 = "/";
        if (str7 == null) {
            z = z2;
            str3 = "/";
        } else if (!RATIONAL_TAGS_HANDLED_AS_DECIMALS_FOR_COMPATIBILITY.contains(str6) || str7.contains("/")) {
            z = z2;
            str3 = "/";
            if (str6.equals("GPSTimeStamp")) {
                Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(str7);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str6 + " : " + str7);
                    return;
                }
                str7 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str6) || "DateTimeOriginal".equals(str6) || "DateTimeDigitized".equals(str6)) {
                boolean find = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(str7).find();
                boolean find2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(str7).find();
                if (str7.length() != 19 || (!find && !find2)) {
                    Log.w("ExifInterface", "Invalid value for " + str6 + " : " + str7);
                    return;
                }
                if (find2) {
                    str7 = str7.replaceAll("-", ":");
                }
            }
        } else {
            try {
                double parseDouble = Double.parseDouble(str7);
                long j3 = 1;
                if (parseDouble >= 9.223372036854776E18d || parseDouble <= -9.223372036854776E18d) {
                    z = z2;
                    str3 = "/";
                    rational = new Rational(parseDouble > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                } else {
                    double abs = Math.abs(parseDouble);
                    long j4 = 0;
                    long j5 = 1;
                    double d = abs;
                    long j6 = 0;
                    while (true) {
                        double d2 = d % 1.0d;
                        long j7 = (long) (d - d2);
                        str3 = str8;
                        j = (j7 * j3) + j6;
                        j2 = (j7 * j4) + j5;
                        d = 1.0d / d2;
                        z = z2;
                        if (Math.abs(abs - (j / j2)) <= 1.0E-8d * abs) {
                            break;
                        }
                        z2 = z;
                        j5 = j4;
                        j4 = j2;
                        j6 = j3;
                        j3 = j;
                        str8 = str3;
                    }
                    if (parseDouble < 0.0d) {
                        j = -j;
                    }
                    rational = new Rational(j, j2);
                }
                str7 = rational.toString();
            } catch (NumberFormatException unused) {
                Log.w("ExifInterface", "Invalid value for " + str6 + " : " + str7);
                return;
            }
        }
        boolean equals2 = "Xmp".equals(str6);
        int i2 = 12;
        int i3 = 9;
        int i4 = 4;
        HashMap[] hashMapArr = this.mAttributes;
        int i5 = 0;
        if (equals2) {
            boolean z3 = hashMapArr[0].containsKey("Xmp") || hashMapArr[5].containsKey("Xmp");
            int i6 = this.mMimeType;
            char c = i6 != 4 ? (i6 == 9 || i6 == 15 || i6 == 12 || i6 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c == 2 && (this.mXmpFromSeparateMarker != null || !z3)) || (c == 3 && !z3)) {
                this.mXmpFromSeparateMarker = str7 != null ? ExifAttribute.createByte(str7) : null;
                return;
            }
        }
        int i7 = 0;
        while (i7 < EXIF_TAGS.length) {
            if ((i7 != i4 || this.mHasThumbnail) && (exifTag = (ExifTag) sExifTagMapsForWriting[i7].get(str6)) != null) {
                int i8 = exifTag.secondaryFormat;
                int i9 = exifTag.primaryFormat;
                if (str7 == null) {
                    hashMapArr[i7].remove(str6);
                } else {
                    Pair guessDataFormat = guessDataFormat(str7);
                    int i10 = -1;
                    if (i9 != ((Integer) guessDataFormat.first).intValue() && i9 != ((Integer) guessDataFormat.second).intValue()) {
                        if (i8 != -1 && (i8 == ((Integer) guessDataFormat.first).intValue() || i8 == ((Integer) guessDataFormat.second).intValue())) {
                            i = i5;
                            int[] iArr = IFD_FORMAT_BYTES_PER_FORMAT;
                            switch (i8) {
                            }
                            i7++;
                            i5 = i;
                            str3 = str4;
                            i2 = 12;
                            i3 = 9;
                            i4 = 4;
                        } else if (i9 != 1 && i9 != 7) {
                            if (i9 == 2) {
                                i = i5;
                                i8 = i9;
                                int[] iArr2 = IFD_FORMAT_BYTES_PER_FORMAT;
                                switch (i8) {
                                    case 1:
                                        str4 = str3;
                                        hashMapArr[i7].put(str6, ExifAttribute.createByte(str7));
                                        break;
                                    case 2:
                                    case 7:
                                        str4 = str3;
                                        hashMapArr[i7].put(str6, ExifAttribute.createString(str7));
                                        break;
                                    case 3:
                                        str4 = str3;
                                        String[] split = str7.split(",", -1);
                                        int[] iArr3 = new int[split.length];
                                        for (int i11 = i; i11 < split.length; i11++) {
                                            iArr3[i11] = Integer.parseInt(split[i11]);
                                        }
                                        hashMapArr[i7].put(str6, ExifAttribute.createUShort(iArr3, this.mExifByteOrder));
                                        break;
                                    case 4:
                                        str4 = str3;
                                        String[] split2 = str7.split(",", -1);
                                        long[] jArr = new long[split2.length];
                                        for (int i12 = i; i12 < split2.length; i12++) {
                                            jArr[i12] = Long.parseLong(split2[i12]);
                                        }
                                        hashMapArr[i7].put(str6, ExifAttribute.createULong(jArr, this.mExifByteOrder));
                                        break;
                                    case 5:
                                        int i13 = -1;
                                        str4 = str3;
                                        String[] split3 = str7.split(",", -1);
                                        Rational[] rationalArr = new Rational[split3.length];
                                        int i14 = i;
                                        while (i14 < split3.length) {
                                            String[] split4 = split3[i14].split(str4, i13);
                                            rationalArr[i14] = new Rational((long) Double.parseDouble(split4[i]), (long) Double.parseDouble(split4[1]));
                                            i14++;
                                            i13 = -1;
                                        }
                                        hashMapArr[i7].put(str6, ExifAttribute.createURational(rationalArr, this.mExifByteOrder));
                                        break;
                                    case 6:
                                    case 8:
                                    case 11:
                                    default:
                                        if (z) {
                                            CameraState$Type$EnumUnboxingLocalUtility.m(i8, "Data format isn't one of expected formats: ", "ExifInterface");
                                        }
                                        str4 = str3;
                                        break;
                                    case 9:
                                        int i15 = i3;
                                        str4 = str3;
                                        String[] split5 = str7.split(",", -1);
                                        int length = split5.length;
                                        int[] iArr4 = new int[length];
                                        for (int i16 = i; i16 < split5.length; i16++) {
                                            iArr4[i16] = Integer.parseInt(split5[i16]);
                                        }
                                        HashMap hashMap = hashMapArr[i7];
                                        ByteOrder byteOrder = this.mExifByteOrder;
                                        ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr2[i15] * length]);
                                        wrap.order(byteOrder);
                                        for (int i17 = i; i17 < length; i17++) {
                                            wrap.putInt(iArr4[i17]);
                                        }
                                        hashMap.put(str6, new ExifAttribute(i15, length, wrap.array()));
                                        break;
                                    case 10:
                                        String[] split6 = str7.split(",", -1);
                                        int length2 = split6.length;
                                        Rational[] rationalArr2 = new Rational[length2];
                                        int i18 = i;
                                        while (i18 < split6.length) {
                                            String[] split7 = split6[i18].split(str3, i10);
                                            rationalArr2[i18] = new Rational((long) Double.parseDouble(split7[i]), (long) Double.parseDouble(split7[1]));
                                            i18++;
                                            i3 = i3;
                                            split6 = split6;
                                            i10 = -1;
                                        }
                                        str4 = str3;
                                        HashMap hashMap2 = hashMapArr[i7];
                                        ByteOrder byteOrder2 = this.mExifByteOrder;
                                        ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr2[10] * length2]);
                                        wrap2.order(byteOrder2);
                                        for (int i19 = i; i19 < length2; i19++) {
                                            Rational rational2 = rationalArr2[i19];
                                            wrap2.putInt((int) rational2.numerator);
                                            wrap2.putInt((int) rational2.denominator);
                                        }
                                        hashMap2.put(str6, new ExifAttribute(10, length2, wrap2.array()));
                                        break;
                                    case 12:
                                        String[] split8 = str7.split(",", -1);
                                        int length3 = split8.length;
                                        double[] dArr = new double[length3];
                                        for (int i20 = i; i20 < split8.length; i20++) {
                                            dArr[i20] = Double.parseDouble(split8[i20]);
                                        }
                                        HashMap hashMap3 = hashMapArr[i7];
                                        ByteOrder byteOrder3 = this.mExifByteOrder;
                                        ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr2[i2] * length3]);
                                        wrap3.order(byteOrder3);
                                        for (int i21 = i; i21 < length3; i21++) {
                                            wrap3.putDouble(dArr[i21]);
                                        }
                                        hashMap3.put(str6, new ExifAttribute(i2, length3, wrap3.array()));
                                        str4 = str3;
                                        break;
                                }
                                i7++;
                                i5 = i;
                                str3 = str4;
                                i2 = 12;
                                i3 = 9;
                                i4 = 4;
                            } else if (z) {
                                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Given tag (", str6, ") value didn't match with one of expected formats: ");
                                String[] strArr = IFD_FORMAT_NAMES;
                                m3m.append(strArr[i9]);
                                if (i8 == -1) {
                                    i = i5;
                                    str5 = "";
                                } else {
                                    i = i5;
                                    str5 = ", " + strArr[i8];
                                }
                                m3m.append(str5);
                                m3m.append(" (guess: ");
                                m3m.append(strArr[((Integer) guessDataFormat.first).intValue()]);
                                m3m.append(((Integer) guessDataFormat.second).intValue() != -1 ? ", " + strArr[((Integer) guessDataFormat.second).intValue()] : "");
                                m3m.append(")");
                                Log.d("ExifInterface", m3m.toString());
                                str4 = str3;
                                i7++;
                                i5 = i;
                                str3 = str4;
                                i2 = 12;
                                i3 = 9;
                                i4 = 4;
                            }
                        }
                    }
                    i = i5;
                    i8 = i9;
                    int[] iArr22 = IFD_FORMAT_BYTES_PER_FORMAT;
                    switch (i8) {
                    }
                    i7++;
                    i5 = i;
                    str3 = str4;
                    i2 = 12;
                    i3 = 9;
                    i4 = 4;
                }
            }
            i = i5;
            str4 = str3;
            i7++;
            i5 = i;
            str3 = str4;
            i2 = 12;
            i3 = 9;
            i4 = 4;
        }
    }

    public final void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        String str;
        ExifAttribute exifAttribute;
        int intValue;
        HashMap hashMap = this.mAttributes[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("Compression");
        if (exifAttribute2 == null) {
            this.mThumbnailCompression = 6;
            handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
            return;
        }
        int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
        this.mThumbnailCompression = intValue2;
        int i = 1;
        if (intValue2 != 1) {
            if (intValue2 == 6) {
                handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
                return;
            } else if (intValue2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMap.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.getValue(this.mExifByteOrder);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (Arrays.equals(iArr2, iArr) || (this.mMimeType == 3 && (exifAttribute = (ExifAttribute) hashMap.get("PhotometricInterpretation")) != null && (((intValue = exifAttribute.getIntValue(this.mExifByteOrder)) == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) hashMap.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) hashMap.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] convertToLongArray = ExifInterfaceUtils.convertToLongArray(exifAttribute4.getValue(this.mExifByteOrder));
                long[] convertToLongArray2 = ExifInterfaceUtils.convertToLongArray(exifAttribute5.getValue(this.mExifByteOrder));
                if (convertToLongArray == null || convertToLongArray.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (convertToLongArray2 == null || convertToLongArray2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (convertToLongArray.length != convertToLongArray2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : convertToLongArray2) {
                    j += j2;
                }
                int i2 = (int) j;
                byte[] bArr = new byte[i2];
                this.mAreThumbnailStripsConsecutive = true;
                this.mHasThumbnailStrips = true;
                this.mHasThumbnail = true;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < convertToLongArray.length) {
                    int i6 = (int) convertToLongArray[i3];
                    int i7 = (int) convertToLongArray2[i3];
                    if (i3 < convertToLongArray.length - i) {
                        str = str2;
                        if (i6 + i7 != convertToLongArray[i3 + 1]) {
                            this.mAreThumbnailStripsConsecutive = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        byteOrderedDataInputStream.skipFully(i8);
                        int i9 = i4 + i8;
                        byte[] bArr2 = new byte[i7];
                        try {
                            byteOrderedDataInputStream.readFully(bArr2);
                            i4 = i9 + i7;
                            System.arraycopy(bArr2, 0, bArr, i5, i7);
                            i5 += i7;
                            i3++;
                            str2 = str3;
                            i = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i7 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                }
                this.mThumbnailBytes = bArr;
                if (this.mAreThumbnailStripsConsecutive) {
                    this.mThumbnailOffset = (int) convertToLongArray[0];
                    this.mThumbnailLength = i2;
                    return;
                }
                return;
            }
        }
        if (DEBUG) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void swapBasedOnImageSize(int i, int i2) {
        HashMap[] hashMapArr = this.mAttributes;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z = DEBUG;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[i].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
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

    public final void updateImageSizeValues(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) {
        ExifAttribute createUShort;
        ExifAttribute createUShort2;
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[i].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[i].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) hashMapArr[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) hashMapArr[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) hashMapArr[i].get("SensorRightBorder");
        if (exifAttribute != null) {
            int i2 = exifAttribute.f865format;
            ByteOrder byteOrder = this.mExifByteOrder;
            if (i2 == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.getValue(byteOrder);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                } else {
                    createUShort = ExifAttribute.createURational(new Rational[]{rationalArr[0]}, this.mExifByteOrder);
                    createUShort2 = ExifAttribute.createURational(new Rational[]{rationalArr[1]}, this.mExifByteOrder);
                }
            } else {
                int[] iArr = (int[]) exifAttribute.getValue(byteOrder);
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
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int intValue = exifAttribute2.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute4.getIntValue(this.mExifByteOrder);
            int intValue3 = exifAttribute5.getIntValue(this.mExifByteOrder);
            int intValue4 = exifAttribute3.getIntValue(this.mExifByteOrder);
            if (intValue2 <= intValue || intValue3 <= intValue4) {
                return;
            }
            ExifAttribute createUShort3 = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
            ExifAttribute createUShort4 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
            hashMapArr[i].put("ImageLength", createUShort3);
            hashMapArr[i].put("ImageWidth", createUShort4);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) hashMapArr[i].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) hashMapArr[i].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) hashMapArr[i].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int intValue5 = exifAttribute8.getIntValue(this.mExifByteOrder);
            int intValue6 = exifAttribute8.getIntValue(this.mExifByteOrder);
            seekableByteOrderedDataInputStream.seek(intValue5);
            byte[] bArr = new byte[intValue6];
            seekableByteOrderedDataInputStream.readFully(bArr);
            getJpegAttributes(new ByteOrderedDataInputStream(bArr), intValue5, i);
        }
    }

    public final void validateImages() {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        HashMap[] hashMapArr = this.mAttributes;
        ExifAttribute exifAttribute = (ExifAttribute) hashMapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            hashMapArr[0].put("ImageWidth", exifAttribute);
            hashMapArr[0].put("ImageLength", exifAttribute2);
        }
        if (hashMapArr[4].isEmpty() && isThumbnail(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!isThumbnail(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        replaceInvalidTags(0, "ThumbnailOrientation", "Orientation");
        replaceInvalidTags(0, "ThumbnailImageLength", "ImageLength");
        replaceInvalidTags(0, "ThumbnailImageWidth", "ImageWidth");
        replaceInvalidTags(5, "ThumbnailOrientation", "Orientation");
        replaceInvalidTags(5, "ThumbnailImageLength", "ImageLength");
        replaceInvalidTags(5, "ThumbnailImageWidth", "ImageWidth");
        replaceInvalidTags(4, "Orientation", "ThumbnailOrientation");
        replaceInvalidTags(4, "ImageLength", "ThumbnailImageLength");
        replaceInvalidTags(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final int writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream) {
        HashMap[] hashMapArr;
        int i;
        int i2;
        char c;
        char c2;
        int[] iArr;
        int i3;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        int[] iArr2 = new int[exifTagArr.length];
        int[] iArr3 = new int[exifTagArr.length];
        ExifTag[] exifTagArr2 = EXIF_POINTER_TAGS;
        for (ExifTag exifTag : exifTagArr2) {
            removeAttribute(exifTag.name);
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                removeAttribute("StripOffsets");
                removeAttribute("StripByteCounts");
            } else {
                removeAttribute("JPEGInterchangeFormat");
                removeAttribute("JPEGInterchangeFormatLength");
            }
        }
        int i4 = 0;
        while (true) {
            int length = exifTagArr.length;
            hashMapArr = this.mAttributes;
            if (i4 >= length) {
                break;
            }
            Iterator it = hashMapArr[i4].entrySet().iterator();
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i4++;
        }
        if (hashMapArr[1].isEmpty()) {
            i = 1;
            i2 = 0;
        } else {
            i = 1;
            i2 = 0;
            hashMapArr[0].put(exifTagArr2[1].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (hashMapArr[2].isEmpty()) {
            c = 2;
        } else {
            c = 2;
            hashMapArr[i2].put(exifTagArr2[2].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        if (hashMapArr[3].isEmpty()) {
            c2 = 3;
        } else {
            c2 = 3;
            hashMapArr[i].put(exifTagArr2[3].name, ExifAttribute.createULong(0L, this.mExifByteOrder));
        }
        int i5 = 4;
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                hashMapArr[4].put("StripOffsets", ExifAttribute.createUShort(i2, this.mExifByteOrder));
                hashMapArr[4].put("StripByteCounts", ExifAttribute.createUShort(this.mThumbnailLength, this.mExifByteOrder));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", ExifAttribute.createULong(0L, this.mExifByteOrder));
                hashMapArr[4].put("JPEGInterchangeFormatLength", ExifAttribute.createULong(this.mThumbnailLength, this.mExifByteOrder));
            }
        }
        int i6 = 0;
        while (true) {
            int length2 = exifTagArr.length;
            iArr = IFD_FORMAT_BYTES_PER_FORMAT;
            if (i6 >= length2) {
                break;
            }
            Iterator it2 = hashMapArr[i6].entrySet().iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                ExifAttribute exifAttribute = (ExifAttribute) ((Map.Entry) it2.next()).getValue();
                exifAttribute.getClass();
                int i8 = iArr[exifAttribute.f865format] * exifAttribute.numberOfComponents;
                if (i8 > 4) {
                    i7 += i8;
                }
            }
            iArr3[i6] = iArr3[i6] + i7;
            i6++;
        }
        int i9 = 8;
        for (int i10 = 0; i10 < exifTagArr.length; i10++) {
            if (!hashMapArr[i10].isEmpty()) {
                iArr2[i10] = i9;
                i9 = (hashMapArr[i10].size() * 12) + 6 + iArr3[i10] + i9;
            }
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                hashMapArr[4].put("StripOffsets", ExifAttribute.createUShort(i9, this.mExifByteOrder));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", ExifAttribute.createULong(i9, this.mExifByteOrder));
            }
            this.mThumbnailOffset = i9;
            i9 += this.mThumbnailLength;
        }
        if (this.mMimeType == 4) {
            i9 += 8;
        }
        if (DEBUG) {
            for (int i11 = 0; i11 < exifTagArr.length; i11++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr2[i11]), Integer.valueOf(hashMapArr[i11].size()), Integer.valueOf(iArr3[i11]), Integer.valueOf(i9)));
            }
        }
        if (!hashMapArr[i].isEmpty()) {
            hashMapArr[0].put(exifTagArr2[i].name, ExifAttribute.createULong(iArr2[i], this.mExifByteOrder));
        }
        if (!hashMapArr[c].isEmpty()) {
            hashMapArr[0].put(exifTagArr2[c].name, ExifAttribute.createULong(iArr2[c], this.mExifByteOrder));
        }
        if (!hashMapArr[c2].isEmpty()) {
            hashMapArr[i].put(exifTagArr2[c2].name, ExifAttribute.createULong(iArr2[c2], this.mExifByteOrder));
        }
        int i12 = this.mMimeType;
        if (i12 == 4) {
            if (i9 > 65535) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i9, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            byteOrderedDataOutputStream.writeUnsignedShort(i9);
            byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        } else if (i12 == 13) {
            byteOrderedDataOutputStream.writeInt(i9);
            byteOrderedDataOutputStream.writeInt(1700284774);
        } else if (i12 == 14) {
            byteOrderedDataOutputStream.write(WEBP_CHUNK_TYPE_EXIF);
            byteOrderedDataOutputStream.writeInt(i9);
        }
        int size = ((DataOutputStream) byteOrderedDataOutputStream.mOutputStream).size();
        byteOrderedDataOutputStream.writeShort(this.mExifByteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        byteOrderedDataOutputStream.mByteOrder = this.mExifByteOrder;
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        int i13 = 0;
        while (i13 < exifTagArr.length) {
            if (hashMapArr[i13].isEmpty()) {
                i3 = i5;
            } else {
                byteOrderedDataOutputStream.writeUnsignedShort(hashMapArr[i13].size());
                int size2 = (hashMapArr[i13].size() * 12) + iArr2[i13] + 2 + i5;
                for (Map.Entry entry : hashMapArr[i13].entrySet()) {
                    int i14 = ((ExifTag) sExifTagMapsForWriting[i13].get(entry.getKey())).number;
                    ExifAttribute exifAttribute2 = (ExifAttribute) entry.getValue();
                    exifAttribute2.getClass();
                    int i15 = exifAttribute2.numberOfComponents;
                    int i16 = exifAttribute2.f865format;
                    int i17 = iArr[i16] * i15;
                    byteOrderedDataOutputStream.writeUnsignedShort(i14);
                    byteOrderedDataOutputStream.writeUnsignedShort(i16);
                    byteOrderedDataOutputStream.writeInt(i15);
                    if (i17 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size2);
                        size2 += i17;
                    } else {
                        byteOrderedDataOutputStream.write(exifAttribute2.bytes);
                        if (i17 < 4) {
                            while (i17 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                i17++;
                            }
                        }
                    }
                    i5 = 4;
                }
                int i18 = i5;
                if (i13 != 0 || hashMapArr[i18].isEmpty()) {
                    byteOrderedDataOutputStream.writeUnsignedInt(0L);
                } else {
                    byteOrderedDataOutputStream.writeUnsignedInt(iArr2[i18]);
                }
                Iterator it3 = hashMapArr[i13].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((ExifAttribute) ((Map.Entry) it3.next()).getValue()).bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream.write(bArr, 0, bArr.length);
                    }
                }
                i3 = 4;
            }
            i13++;
            i5 = i3;
        }
        if (this.mHasThumbnail) {
            byteOrderedDataOutputStream.write(getThumbnailBytes());
        }
        if (this.mMimeType == 14 && i9 % 2 == i) {
            byteOrderedDataOutputStream.writeByte(0);
        }
        byteOrderedDataOutputStream.mByteOrder = ByteOrder.BIG_ENDIAN;
        return size;
    }

    public final void writePngExifChunk(ByteOrderedDataOutputStream byteOrderedDataOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.mOffsetToExifData = ((DataOutputStream) byteOrderedDataOutputStream.mOutputStream).size() + writeExifSegment(new ByteOrderedDataOutputStream(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteOrderedDataOutputStream.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        byteOrderedDataOutputStream.writeInt((int) crc32.getValue());
    }

    public final void writePngXmpItxtChunk(ByteOrderedDataOutputStream byteOrderedDataOutputStream) {
        byteOrderedDataOutputStream.writeInt(this.mXmpFromSeparateMarker.bytes.length + 22);
        CRC32 crc32 = new CRC32();
        byteOrderedDataOutputStream.writeInt(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = PNG_ITXT_XMP_KEYWORD;
        byteOrderedDataOutputStream.write(bArr);
        crc32.update(bArr);
        byteOrderedDataOutputStream.write(this.mXmpFromSeparateMarker.bytes);
        crc32.update(this.mXmpFromSeparateMarker.bytes);
        byteOrderedDataOutputStream.writeInt((int) crc32.getValue());
        this.mFileOnDiskContainsSeparateXmpMarker = true;
    }

    public class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public ByteOrder mByteOrder;
        public final DataInputStream mDataInputStream;
        public final int mLength;
        public int mPosition;
        public byte[] mSkipBuffer;

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            dataInputStream.mark(0);
            this.mPosition = 0;
            this.mByteOrder = byteOrder;
            this.mLength = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).mLength : -1;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.mDataInputStream.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
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
            this.mPosition++;
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
            this.mPosition += bArr.length;
            this.mDataInputStream.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final int readInt() {
            this.mPosition += 4;
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
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
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
            this.mPosition += 8;
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
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return 0L;
        }

        @Override // java.io.DataInput
        public final short readShort() {
            this.mPosition += 2;
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return (short) 0;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
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
            this.mPosition += 2;
            DataInputStream dataInputStream = this.mDataInputStream;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            }
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            a$$ExternalSyntheticBUOutline0.m$4(this.mByteOrder, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public final void skipFully(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.mDataInputStream;
                int skip = (int) dataInputStream.skip(i3);
                if (skip <= 0) {
                    if (this.mSkipBuffer == null) {
                        this.mSkipBuffer = new byte[PKIFailureInfo.certRevoked];
                    }
                    skip = dataInputStream.read(this.mSkipBuffer, 0, Math.min(PKIFailureInfo.certRevoked, i3));
                    if (skip == -1) {
                        Path$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Reached EOF while skipping ", " bytes."));
                        return;
                    }
                }
                i2 += skip;
            }
            this.mPosition += i2;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            this.mPosition += i2;
            this.mDataInputStream.readFully(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            int read = this.mDataInputStream.read(bArr, i, i2);
            this.mPosition += read;
            return read;
        }

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public ByteOrderedDataInputStream(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.mLength = bArr.length;
        }
    }

    public final class ExifAttribute {
        public final byte[] bytes;
        public final long bytesOffset;

        /* renamed from: format, reason: collision with root package name */
        public final int f865format;
        public final int numberOfComponents;

        public ExifAttribute(long j, int i, int i2, byte[] bArr) {
            this.f865format = i;
            this.numberOfComponents = i2;
            this.bytesOffset = j;
            this.bytes = bArr;
        }

        public static ExifAttribute createByte(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(ExifInterface.ASCII);
            return new ExifAttribute(1, bytes.length, bytes);
        }

        public static ExifAttribute createString(String str) {
            byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(ExifInterface.ASCII);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new ExifAttribute(4, jArr.length, wrap.array());
        }

        public static ExifAttribute createURational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * rationalArr.length]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new ExifAttribute(3, iArr.length, wrap.array());
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
        /* JADX WARN: Type inference failed for: r13v16, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
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
                        int i = this.f865format;
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
            sb.append(ExifInterface.IFD_FORMAT_NAMES[this.f865format]);
            sb.append(", data length:");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.bytes.length, ")", sb);
        }

        public ExifAttribute(int i, int i2, byte[] bArr) {
            this(-1L, i, i2, bArr);
        }

        public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
            return createULong(new long[]{j}, byteOrder);
        }

        public static ExifAttribute createUShort(int i, ByteOrder byteOrder) {
            return createUShort(new int[]{i}, byteOrder);
        }
    }

    public final class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(String str, int i, int i2) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = -1;
        }

        public ExifTag(String str, int i, int i2, int i3) {
            this.name = str;
            this.number = i;
            this.primaryFormat = i2;
            this.secondaryFormat = i3;
        }
    }

    public final class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.mDataInputStream.mark(Integer.MAX_VALUE);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        public final void seek(long j) {
            int i = this.mPosition;
            if (i > j) {
                this.mPosition = 0;
                this.mDataInputStream.reset();
            } else {
                j -= i;
            }
            skipFully((int) j);
        }

        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.mDataInputStream.mark(Integer.MAX_VALUE);
        }
    }

    public ExifInterface(InputStream inputStream) {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        this.mFilename = null;
        this.mIsExifDataOnly = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.mAssetInputStream = (AssetManager.AssetInputStream) inputStream;
            this.mSeekableFileDescriptor = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.mAssetInputStream = null;
                    this.mSeekableFileDescriptor = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (DEBUG) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.mAssetInputStream = null;
            this.mSeekableFileDescriptor = null;
        }
        loadAttributes(inputStream);
    }
}
