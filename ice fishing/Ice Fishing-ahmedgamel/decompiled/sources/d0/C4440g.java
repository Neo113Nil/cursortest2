package d0;

import L3.F;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4440g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f36983A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f36984B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f36985C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f36986D;

    /* renamed from: E, reason: collision with root package name */
    public static final C4437d f36987E;

    /* renamed from: F, reason: collision with root package name */
    public static final C4437d[][] f36988F;

    /* renamed from: G, reason: collision with root package name */
    public static final C4437d[] f36989G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f36990H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f36991I;
    public static final HashSet J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f36992K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f36993L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f36994M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f36995N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f36996l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f36997m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f36998n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f36999o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f37000p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f37001q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f37002r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f37003s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f37004t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f37005u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f37006v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f37007w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f37008x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f37009y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f37010z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f37011a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f37012b;

    /* renamed from: c, reason: collision with root package name */
    public int f37013c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f37014d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f37015e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f37016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37017g;

    /* renamed from: h, reason: collision with root package name */
    public int f37018h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f37019j;

    /* renamed from: k, reason: collision with root package name */
    public int f37020k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f36997m = new int[]{8, 8, 8};
        f36998n = new int[]{8};
        f36999o = new byte[]{-1, -40, -1};
        f37000p = new byte[]{102, 116, 121, 112};
        f37001q = new byte[]{109, 105, 102, 49};
        f37002r = new byte[]{104, 101, 105, 99};
        f37003s = new byte[]{79, 76, 89, 77, 80, 0};
        f37004t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f37005u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f37006v = new byte[]{101, 88, 73, 102};
        f37007w = new byte[]{73, 72, 68, 82};
        f37008x = new byte[]{73, 69, 78, 68};
        f37009y = new byte[]{82, 73, 70, 70};
        f37010z = new byte[]{87, 69, 66, 80};
        f36983A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f36984B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f36985C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f36986D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C4437d[] c4437dArr = {new C4437d("NewSubfileType", 254, 4), new C4437d("SubfileType", p.f8473b, 4), new C4437d(256, "ImageWidth", 3, 4), new C4437d(257, "ImageLength", 3, 4), new C4437d("BitsPerSample", 258, 3), new C4437d("Compression", 259, 3), new C4437d("PhotometricInterpretation", 262, 3), new C4437d("ImageDescription", 270, 2), new C4437d("Make", 271, 2), new C4437d("Model", 272, 2), new C4437d(273, "StripOffsets", 3, 4), new C4437d("Orientation", 274, 3), new C4437d("SamplesPerPixel", 277, 3), new C4437d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4437d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4437d("XResolution", 282, 5), new C4437d("YResolution", 283, 5), new C4437d("PlanarConfiguration", 284, 3), new C4437d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4437d("TransferFunction", BaseATView.a.f9775L, 3), new C4437d("Software", BaseATView.a.f9779P, 2), new C4437d("DateTime", 306, 2), new C4437d("Artist", 315, 2), new C4437d("WhitePoint", 318, 5), new C4437d("PrimaryChromaticities", 319, 5), new C4437d("SubIFDPointer", 330, 4), new C4437d("JPEGInterchangeFormat", 513, 4), new C4437d("JPEGInterchangeFormatLength", 514, 4), new C4437d("YCbCrCoefficients", 529, 5), new C4437d("YCbCrSubSampling", 530, 3), new C4437d("YCbCrPositioning", 531, 3), new C4437d("ReferenceBlackWhite", 532, 5), new C4437d("Copyright", 33432, 2), new C4437d("ExifIFDPointer", 34665, 4), new C4437d("GPSInfoIFDPointer", 34853, 4), new C4437d("SensorTopBorder", 4, 4), new C4437d("SensorLeftBorder", 5, 4), new C4437d("SensorBottomBorder", 6, 4), new C4437d("SensorRightBorder", 7, 4), new C4437d("ISO", 23, 3), new C4437d("JpgFromRaw", 46, 7), new C4437d("Xmp", com.anythink.core.common.m.a.f14401n, 1)};
        C4437d[] c4437dArr2 = {new C4437d("ExposureTime", 33434, 5), new C4437d("FNumber", 33437, 5), new C4437d("ExposureProgram", 34850, 3), new C4437d("SpectralSensitivity", 34852, 2), new C4437d("PhotographicSensitivity", 34855, 3), new C4437d("OECF", 34856, 7), new C4437d("SensitivityType", 34864, 3), new C4437d("StandardOutputSensitivity", 34865, 4), new C4437d("RecommendedExposureIndex", 34866, 4), new C4437d("ISOSpeed", 34867, 4), new C4437d("ISOSpeedLatitudeyyy", 34868, 4), new C4437d("ISOSpeedLatitudezzz", 34869, 4), new C4437d("ExifVersion", 36864, 2), new C4437d("DateTimeOriginal", 36867, 2), new C4437d("DateTimeDigitized", 36868, 2), new C4437d("OffsetTime", 36880, 2), new C4437d("OffsetTimeOriginal", 36881, 2), new C4437d("OffsetTimeDigitized", 36882, 2), new C4437d("ComponentsConfiguration", 37121, 7), new C4437d("CompressedBitsPerPixel", 37122, 5), new C4437d("ShutterSpeedValue", 37377, 10), new C4437d("ApertureValue", 37378, 5), new C4437d("BrightnessValue", 37379, 10), new C4437d("ExposureBiasValue", 37380, 10), new C4437d("MaxApertureValue", 37381, 5), new C4437d("SubjectDistance", 37382, 5), new C4437d("MeteringMode", 37383, 3), new C4437d("LightSource", 37384, 3), new C4437d("Flash", 37385, 3), new C4437d("FocalLength", 37386, 5), new C4437d("SubjectArea", 37396, 3), new C4437d("MakerNote", 37500, 7), new C4437d("UserComment", 37510, 7), new C4437d("SubSecTime", 37520, 2), new C4437d("SubSecTimeOriginal", 37521, 2), new C4437d("SubSecTimeDigitized", 37522, 2), new C4437d("FlashpixVersion", 40960, 7), new C4437d("ColorSpace", 40961, 3), new C4437d(40962, "PixelXDimension", 3, 4), new C4437d(40963, "PixelYDimension", 3, 4), new C4437d("RelatedSoundFile", 40964, 2), new C4437d("InteroperabilityIFDPointer", 40965, 4), new C4437d("FlashEnergy", 41483, 5), new C4437d("SpatialFrequencyResponse", 41484, 7), new C4437d("FocalPlaneXResolution", 41486, 5), new C4437d("FocalPlaneYResolution", 41487, 5), new C4437d("FocalPlaneResolutionUnit", 41488, 3), new C4437d("SubjectLocation", 41492, 3), new C4437d("ExposureIndex", 41493, 5), new C4437d("SensingMethod", 41495, 3), new C4437d("FileSource", 41728, 7), new C4437d("SceneType", 41729, 7), new C4437d("CFAPattern", 41730, 7), new C4437d("CustomRendered", 41985, 3), new C4437d("ExposureMode", 41986, 3), new C4437d("WhiteBalance", 41987, 3), new C4437d("DigitalZoomRatio", 41988, 5), new C4437d("FocalLengthIn35mmFilm", 41989, 3), new C4437d("SceneCaptureType", 41990, 3), new C4437d("GainControl", 41991, 3), new C4437d("Contrast", 41992, 3), new C4437d("Saturation", 41993, 3), new C4437d("Sharpness", 41994, 3), new C4437d("DeviceSettingDescription", 41995, 7), new C4437d("SubjectDistanceRange", 41996, 3), new C4437d("ImageUniqueID", 42016, 2), new C4437d("CameraOwnerName", 42032, 2), new C4437d("BodySerialNumber", 42033, 2), new C4437d("LensSpecification", 42034, 5), new C4437d("LensMake", 42035, 2), new C4437d("LensModel", 42036, 2), new C4437d("Gamma", 42240, 5), new C4437d("DNGVersion", 50706, 1), new C4437d(50720, "DefaultCropSize", 3, 4)};
        C4437d[] c4437dArr3 = {new C4437d("GPSVersionID", 0, 1), new C4437d("GPSLatitudeRef", 1, 2), new C4437d(2, "GPSLatitude", 5, 10), new C4437d("GPSLongitudeRef", 3, 2), new C4437d(4, "GPSLongitude", 5, 10), new C4437d("GPSAltitudeRef", 5, 1), new C4437d("GPSAltitude", 6, 5), new C4437d("GPSTimeStamp", 7, 5), new C4437d("GPSSatellites", 8, 2), new C4437d("GPSStatus", 9, 2), new C4437d("GPSMeasureMode", 10, 2), new C4437d("GPSDOP", 11, 5), new C4437d("GPSSpeedRef", 12, 2), new C4437d("GPSSpeed", 13, 5), new C4437d("GPSTrackRef", 14, 2), new C4437d("GPSTrack", 15, 5), new C4437d("GPSImgDirectionRef", 16, 2), new C4437d("GPSImgDirection", 17, 5), new C4437d("GPSMapDatum", 18, 2), new C4437d("GPSDestLatitudeRef", 19, 2), new C4437d("GPSDestLatitude", 20, 5), new C4437d("GPSDestLongitudeRef", 21, 2), new C4437d("GPSDestLongitude", 22, 5), new C4437d("GPSDestBearingRef", 23, 2), new C4437d("GPSDestBearing", 24, 5), new C4437d("GPSDestDistanceRef", 25, 2), new C4437d("GPSDestDistance", 26, 5), new C4437d("GPSProcessingMethod", 27, 7), new C4437d("GPSAreaInformation", 28, 7), new C4437d("GPSDateStamp", 29, 2), new C4437d("GPSDifferential", 30, 3), new C4437d("GPSHPositioningError", 31, 5)};
        C4437d[] c4437dArr4 = {new C4437d("InteroperabilityIndex", 1, 2)};
        C4437d[] c4437dArr5 = {new C4437d("NewSubfileType", 254, 4), new C4437d("SubfileType", p.f8473b, 4), new C4437d(256, "ThumbnailImageWidth", 3, 4), new C4437d(257, "ThumbnailImageLength", 3, 4), new C4437d("BitsPerSample", 258, 3), new C4437d("Compression", 259, 3), new C4437d("PhotometricInterpretation", 262, 3), new C4437d("ImageDescription", 270, 2), new C4437d("Make", 271, 2), new C4437d("Model", 272, 2), new C4437d(273, "StripOffsets", 3, 4), new C4437d("ThumbnailOrientation", 274, 3), new C4437d("SamplesPerPixel", 277, 3), new C4437d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4437d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4437d("XResolution", 282, 5), new C4437d("YResolution", 283, 5), new C4437d("PlanarConfiguration", 284, 3), new C4437d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4437d("TransferFunction", BaseATView.a.f9775L, 3), new C4437d("Software", BaseATView.a.f9779P, 2), new C4437d("DateTime", 306, 2), new C4437d("Artist", 315, 2), new C4437d("WhitePoint", 318, 5), new C4437d("PrimaryChromaticities", 319, 5), new C4437d("SubIFDPointer", 330, 4), new C4437d("JPEGInterchangeFormat", 513, 4), new C4437d("JPEGInterchangeFormatLength", 514, 4), new C4437d("YCbCrCoefficients", 529, 5), new C4437d("YCbCrSubSampling", 530, 3), new C4437d("YCbCrPositioning", 531, 3), new C4437d("ReferenceBlackWhite", 532, 5), new C4437d("Copyright", 33432, 2), new C4437d("ExifIFDPointer", 34665, 4), new C4437d("GPSInfoIFDPointer", 34853, 4), new C4437d("DNGVersion", 50706, 1), new C4437d(50720, "DefaultCropSize", 3, 4)};
        f36987E = new C4437d("StripOffsets", 273, 3);
        f36988F = new C4437d[][]{c4437dArr, c4437dArr2, c4437dArr3, c4437dArr4, c4437dArr5, c4437dArr, new C4437d[]{new C4437d("ThumbnailImage", 256, 7), new C4437d("CameraSettingsIFDPointer", 8224, 4), new C4437d("ImageProcessingIFDPointer", 8256, 4)}, new C4437d[]{new C4437d("PreviewImageStart", 257, 4), new C4437d("PreviewImageLength", 258, 4)}, new C4437d[]{new C4437d("AspectFrame", 4371, 3)}, new C4437d[]{new C4437d("ColorSpace", 55, 3)}};
        f36989G = new C4437d[]{new C4437d("SubIFDPointer", 330, 4), new C4437d("ExifIFDPointer", 34665, 4), new C4437d("GPSInfoIFDPointer", 34853, 4), new C4437d("InteroperabilityIFDPointer", 40965, 4), new C4437d("CameraSettingsIFDPointer", 8224, 1), new C4437d("ImageProcessingIFDPointer", 8256, 1)};
        f36990H = new HashMap[10];
        f36991I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f36992K = new HashMap();
        Charset forName = Charset.forName(com.anythink.basead.exoplayer.b.i);
        f36993L = forName;
        f36994M = "Exif\u0000\u0000".getBytes(forName);
        f36995N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4437d[][] c4437dArr6 = f36988F;
            if (i >= c4437dArr6.length) {
                HashMap hashMap = f36992K;
                C4437d[] c4437dArr7 = f36989G;
                hashMap.put(Integer.valueOf(c4437dArr7[0].f36977a), 5);
                hashMap.put(Integer.valueOf(c4437dArr7[1].f36977a), 1);
                hashMap.put(Integer.valueOf(c4437dArr7[2].f36977a), 2);
                hashMap.put(Integer.valueOf(c4437dArr7[3].f36977a), 3);
                hashMap.put(Integer.valueOf(c4437dArr7[4].f36977a), 7);
                hashMap.put(Integer.valueOf(c4437dArr7[5].f36977a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f36990H[i] = new HashMap();
            f36991I[i] = new HashMap();
            for (C4437d c4437d : c4437dArr6[i]) {
                f36990H[i].put(Integer.valueOf(c4437d.f36977a), c4437d);
                f36991I[i].put(c4437d.f36978b, c4437d);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:6:0x004f, B:8:0x0052, B:10:0x0067, B:16:0x0084, B:18:0x008f, B:19:0x00a5, B:28:0x0096, B:31:0x009e, B:32:0x00a2, B:33:0x00af, B:35:0x00b8, B:37:0x00be, B:39:0x00c4, B:41:0x00ca, B:51:0x00d8), top: B:5:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4440g(InputStream inputStream) {
        C4437d[][] c4437dArr = f36988F;
        this.f37014d = new HashMap[c4437dArr.length];
        this.f37015e = new HashSet(c4437dArr.length);
        this.f37016f = ByteOrder.BIG_ENDIAN;
        boolean z3 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z6 = f36996l;
        if (z3) {
            this.f37012b = (AssetManager.AssetInputStream) inputStream;
            this.f37011a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    AbstractC4441h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f37012b = null;
                    this.f37011a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z6) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f37012b = null;
            this.f37011a = null;
        }
        for (int i = 0; i < c4437dArr.length; i++) {
            try {
                try {
                    this.f37014d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z6) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                if (z6) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z6) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e10) {
                e = e10;
                if (z6) {
                }
                a();
                if (!z6) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f3 = f(bufferedInputStream);
        this.f37013c = f3;
        if (f3 != 4 && f3 != 9 && f3 != 13 && f3 != 14) {
            C4439f c4439f = new C4439f(bufferedInputStream);
            int i6 = this.f37013c;
            if (i6 == 12) {
                d(c4439f);
            } else if (i6 == 7) {
                g(c4439f);
            } else if (i6 == 10) {
                k(c4439f);
            } else {
                j(c4439f);
            }
            c4439f.j(this.f37018h);
            u(c4439f);
            a();
            if (!z6) {
                return;
            }
            p();
        }
        C4435b c4435b = new C4435b(bufferedInputStream);
        int i9 = this.f37013c;
        if (i9 == 4) {
            e(c4435b, 0, 0);
        } else if (i9 == 13) {
            h(c4435b);
        } else if (i9 == 9) {
            i(c4435b);
        } else if (i9 == 14) {
            l(c4435b);
        }
        a();
        if (!z6) {
        }
        p();
    }

    public static ByteOrder q(C4435b c4435b) {
        short readShort = c4435b.readShort();
        boolean z3 = f36996l;
        if (readShort == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b9 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f37014d;
        if (b9 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b9.concat("\u0000").getBytes(f36993L);
            hashMap.put("DateTime", new C4436c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C4436c.a(0L, this.f37016f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C4436c.a(0L, this.f37016f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C4436c.a(0L, this.f37016f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C4436c.a(0L, this.f37016f));
        }
    }

    public final String b(String str) {
        C4436c c9 = c(str);
        if (c9 != null) {
            if (!J.contains(str)) {
                return c9.f(this.f37016f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c9.f36973a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C4438e[] c4438eArr = (C4438e[]) c9.g(this.f37016f);
                if (c4438eArr == null || c4438eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c4438eArr));
                    return null;
                }
                C4438e c4438e = c4438eArr[0];
                Integer valueOf = Integer.valueOf((int) (c4438e.f36981a / c4438e.f36982b));
                C4438e c4438e2 = c4438eArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c4438e2.f36981a / c4438e2.f36982b));
                C4438e c4438e3 = c4438eArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c4438e3.f36981a / c4438e3.f36982b)));
            }
            try {
                return Double.toString(c9.d(this.f37016f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C4436c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f36996l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f36988F.length; i++) {
            C4436c c4436c = (C4436c) this.f37014d[i].get(str);
            if (c4436c != null) {
                return c4436c;
            }
        }
        return null;
    }

    public final void d(C4439f c4439f) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC4442i.a(mediaMetadataRetriever, new C4434a(c4439f));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f37014d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C4436c.c(Integer.parseInt(str), this.f37016f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", C4436c.c(Integer.parseInt(str2), this.f37016f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", C4436c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f37016f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c4439f.j(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c4439f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i6 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f36994M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c4439f.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f37018h = i;
                    r(0, bArr2);
                }
                if (f36996l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a2, code lost:
    
        r23.f36970u = r22.f37016f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C4435b c4435b, int i, int i6) {
        boolean z3 = f36996l;
        if (z3) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c4435b);
        }
        c4435b.f36970u = ByteOrder.BIG_ENDIAN;
        byte readByte = c4435b.readByte();
        byte b9 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c4435b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i9 = 2;
        int i10 = 2;
        while (true) {
            byte readByte2 = c4435b.readByte();
            if (readByte2 != b9) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c4435b.readByte();
            if (z3) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c4435b.readUnsignedShort();
                int i11 = readUnsignedShort - 2;
                int i12 = i10 + 4;
                if (z3) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] hashMapArr = this.f37014d;
                int i13 = 0;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i11];
                    c4435b.readFully(bArr);
                    int i14 = i12 + i11;
                    byte[] bArr2 = f36994M;
                    if (bArr2 != null && i11 >= bArr2.length) {
                        int i15 = 0;
                        while (i15 < bArr2.length) {
                            if (bArr[i15] == bArr2[i15]) {
                                i15++;
                                i13 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i11);
                        this.f37018h = i + i12 + bArr2.length;
                        r(i6, copyOfRange);
                        u(new C4435b(copyOfRange));
                        i12 = i14;
                        i11 = 0;
                    }
                    byte[] bArr3 = f36995N;
                    if (bArr3 != null && i11 >= bArr3.length) {
                        int i16 = i13;
                        while (true) {
                            if (i16 >= bArr3.length) {
                                int length = i12 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i11);
                                if (b("Xmp") == null) {
                                    hashMapArr[i13].put("Xmp", new C4436c(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i16] == bArr3[i16]) {
                                i16++;
                            }
                        }
                    }
                    i12 = i14;
                    i11 = 0;
                } else if (readByte3 != -2) {
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
                                            c4435b.a(1);
                                            hashMapArr[i6].put(i6 != 4 ? "ImageLength" : "ThumbnailImageLength", C4436c.a(c4435b.readUnsignedShort(), this.f37016f));
                                            hashMapArr[i6].put(i6 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C4436c.a(c4435b.readUnsignedShort(), this.f37016f));
                                            i11 = readUnsignedShort - 7;
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
                    byte[] bArr4 = new byte[i11];
                    if (c4435b.read(bArr4) != i11) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = f36993L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new C4436c(bytes, i9, bytes.length));
                    }
                    i11 = 0;
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                c4435b.a(i11);
                i10 = i12 + i11;
                i9 = 2;
                b9 = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(3:118|119|(4:124|(3:129|(1:131)(2:139|(1:141))|(3:134|135|136))(2:126|127)|128|120))|117|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|38|39|40|(1:42)(1:79)|43|(1:45)(3:46|(2:47|(2:49|(2:52|53)(1:51))(2:77|78))|(1:55)(3:56|(2:57|(2:59|(1:62)(1:61))(3:67|68|(2:69|(2:71|(1:74)(1:73))(2:75|76))))|(1:65)(1:66)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f4, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fa, code lost:
    
        if (r6 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fc, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ce, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0100, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0102, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0105, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        int i;
        C4435b c4435b;
        int i6;
        int i9;
        int i10;
        int i11;
        long readInt;
        byte[] bArr;
        long j6;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i12 = 0;
        while (true) {
            byte[] bArr3 = f36999o;
            if (i12 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i12] != bArr3[i12]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i13 = 0; i13 < bytes.length; i13++) {
                    if (bArr2[i13] != bytes[i13]) {
                        C4435b c4435b2 = null;
                        try {
                            c4435b = new C4435b(bArr2);
                            try {
                                try {
                                    readInt = c4435b.readInt();
                                    bArr = new byte[4];
                                    c4435b.read(bArr);
                                } catch (Exception e9) {
                                    e = e9;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c4435b2 = c4435b;
                                if (c4435b2 != null) {
                                    c4435b2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i = 0;
                            c4435b = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f37000p)) {
                            if (readInt == 1) {
                                readInt = c4435b.readLong();
                                j6 = 16;
                            } else {
                                j6 = 8;
                            }
                            i = 0;
                            long j9 = 5000;
                            if (readInt > j9) {
                                readInt = j9;
                            }
                            long j10 = readInt - j6;
                            if (j10 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z3 = false;
                                    boolean z6 = false;
                                    for (long j11 = 0; j11 < j10 / 4 && c4435b.read(bArr4) == 4; j11++) {
                                        if (j11 != 1) {
                                            if (Arrays.equals(bArr4, f37001q)) {
                                                z3 = true;
                                            } else if (Arrays.equals(bArr4, f37002r)) {
                                                z6 = true;
                                            }
                                            if (z3 && z6) {
                                                c4435b.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    if (f36996l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            c4435b.close();
                            C4435b c4435b3 = new C4435b(bArr2);
                            ByteOrder q8 = q(c4435b3);
                            this.f37016f = q8;
                            c4435b3.f36970u = q8;
                            short readShort = c4435b3.readShort();
                            i6 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                            c4435b3.close();
                            if (i6 != 0) {
                                return 7;
                            }
                            try {
                                C4435b c4435b4 = new C4435b(bArr2);
                                try {
                                    ByteOrder q9 = q(c4435b4);
                                    this.f37016f = q9;
                                    c4435b4.f36970u = q9;
                                    i9 = c4435b4.readShort() == 85 ? 1 : i;
                                    c4435b4.close();
                                } catch (Exception unused) {
                                    c4435b2 = c4435b4;
                                    if (c4435b2 != null) {
                                        c4435b2.close();
                                    }
                                    i9 = i;
                                    if (i9 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4435b2 = c4435b4;
                                    if (c4435b2 != null) {
                                        c4435b2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            if (i9 == 0) {
                                return 10;
                            }
                            int i14 = i;
                            while (true) {
                                byte[] bArr5 = f37005u;
                                if (i14 >= bArr5.length) {
                                    i10 = 1;
                                    break;
                                }
                                if (bArr2[i14] != bArr5[i14]) {
                                    i10 = i;
                                    break;
                                }
                                i14++;
                            }
                            if (i10 != 0) {
                                return 13;
                            }
                            int i15 = i;
                            while (true) {
                                byte[] bArr6 = f37009y;
                                if (i15 >= bArr6.length) {
                                    int i16 = i;
                                    while (true) {
                                        byte[] bArr7 = f37010z;
                                        if (i16 >= bArr7.length) {
                                            i11 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i16 + 4] != bArr7[i16]) {
                                            break;
                                        }
                                        i16++;
                                    }
                                } else {
                                    if (bArr2[i15] != bArr6[i15]) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                            if (i11 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        c4435b.close();
                        i = 0;
                        C4435b c4435b32 = new C4435b(bArr2);
                        ByteOrder q82 = q(c4435b32);
                        this.f37016f = q82;
                        c4435b32.f36970u = q82;
                        short readShort2 = c4435b32.readShort();
                        if (readShort2 != 20306) {
                        }
                        c4435b32.close();
                        if (i6 != 0) {
                        }
                    }
                }
                return 9;
            }
            i12++;
        }
    }

    public final void g(C4439f c4439f) {
        int i;
        int i6;
        j(c4439f);
        HashMap[] hashMapArr = this.f37014d;
        C4436c c4436c = (C4436c) hashMapArr[1].get("MakerNote");
        if (c4436c != null) {
            C4439f c4439f2 = new C4439f(c4436c.f36976d);
            c4439f2.f36970u = this.f37016f;
            byte[] bArr = f37003s;
            byte[] bArr2 = new byte[bArr.length];
            c4439f2.readFully(bArr2);
            c4439f2.j(0L);
            byte[] bArr3 = f37004t;
            byte[] bArr4 = new byte[bArr3.length];
            c4439f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c4439f2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c4439f2.j(12L);
            }
            s(c4439f2, 6);
            C4436c c4436c2 = (C4436c) hashMapArr[7].get("PreviewImageStart");
            C4436c c4436c3 = (C4436c) hashMapArr[7].get("PreviewImageLength");
            if (c4436c2 != null && c4436c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c4436c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c4436c3);
            }
            C4436c c4436c4 = (C4436c) hashMapArr[8].get("AspectFrame");
            if (c4436c4 != null) {
                int[] iArr = (int[]) c4436c4.g(this.f37016f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i = iArr[3]) <= (i6 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i - i6) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                C4436c c9 = C4436c.c(i11, this.f37016f);
                C4436c c10 = C4436c.c(i12, this.f37016f);
                hashMapArr[0].put("ImageWidth", c9);
                hashMapArr[0].put("ImageLength", c10);
            }
        }
    }

    public final void h(C4435b c4435b) {
        if (f36996l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c4435b);
        }
        c4435b.f36970u = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f37005u;
        c4435b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c4435b.readInt();
                byte[] bArr2 = new byte[4];
                if (c4435b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f37007w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f37008x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f37006v)) {
                    byte[] bArr3 = new byte[readInt];
                    if (c4435b.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + F.c(bArr2));
                    }
                    int readInt2 = c4435b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f37018h = i;
                        r(0, bArr3);
                        x();
                        u(new C4435b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i6 = readInt + 4;
                c4435b.a(i6);
                length = i + i6;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C4435b c4435b) {
        boolean z3 = f36996l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c4435b);
        }
        c4435b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c4435b.read(bArr);
        c4435b.read(bArr2);
        c4435b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i6 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i6];
        c4435b.a(i - c4435b.f36971v);
        c4435b.read(bArr4);
        e(new C4435b(bArr4), i, 5);
        c4435b.a(i9 - c4435b.f36971v);
        c4435b.f36970u = ByteOrder.BIG_ENDIAN;
        int readInt = c4435b.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = c4435b.readUnsignedShort();
            int readUnsignedShort2 = c4435b.readUnsignedShort();
            if (readUnsignedShort == f36987E.f36977a) {
                short readShort = c4435b.readShort();
                short readShort2 = c4435b.readShort();
                C4436c c9 = C4436c.c(readShort, this.f37016f);
                C4436c c10 = C4436c.c(readShort2, this.f37016f);
                HashMap[] hashMapArr = this.f37014d;
                hashMapArr[0].put("ImageLength", c9);
                hashMapArr[0].put("ImageWidth", c10);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c4435b.a(readUnsignedShort2);
        }
    }

    public final void j(C4439f c4439f) {
        o(c4439f);
        s(c4439f, 0);
        w(c4439f, 0);
        w(c4439f, 5);
        w(c4439f, 4);
        x();
        if (this.f37013c == 8) {
            HashMap[] hashMapArr = this.f37014d;
            C4436c c4436c = (C4436c) hashMapArr[1].get("MakerNote");
            if (c4436c != null) {
                C4439f c4439f2 = new C4439f(c4436c.f36976d);
                c4439f2.f36970u = this.f37016f;
                c4439f2.a(6);
                s(c4439f2, 9);
                C4436c c4436c2 = (C4436c) hashMapArr[9].get("ColorSpace");
                if (c4436c2 != null) {
                    hashMapArr[1].put("ColorSpace", c4436c2);
                }
            }
        }
    }

    public final void k(C4439f c4439f) {
        if (f36996l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c4439f);
        }
        j(c4439f);
        HashMap[] hashMapArr = this.f37014d;
        C4436c c4436c = (C4436c) hashMapArr[0].get("JpgFromRaw");
        if (c4436c != null) {
            e(new C4435b(c4436c.f36976d), (int) c4436c.f36975c, 5);
        }
        C4436c c4436c2 = (C4436c) hashMapArr[0].get("ISO");
        C4436c c4436c3 = (C4436c) hashMapArr[1].get("PhotographicSensitivity");
        if (c4436c2 == null || c4436c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c4436c2);
    }

    public final void l(C4435b c4435b) {
        if (f36996l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c4435b);
        }
        c4435b.f36970u = ByteOrder.LITTLE_ENDIAN;
        c4435b.a(f37009y.length);
        int readInt = c4435b.readInt() + 8;
        byte[] bArr = f37010z;
        c4435b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c4435b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c4435b.readInt();
                int i = length + 8;
                if (Arrays.equals(f36983A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (c4435b.read(bArr3) == readInt2) {
                        this.f37018h = i;
                        r(0, bArr3);
                        u(new C4435b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + F.c(bArr2));
                    }
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
                c4435b.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C4435b c4435b, HashMap hashMap) {
        C4436c c4436c = (C4436c) hashMap.get("JPEGInterchangeFormat");
        C4436c c4436c2 = (C4436c) hashMap.get("JPEGInterchangeFormatLength");
        if (c4436c == null || c4436c2 == null) {
            return;
        }
        int e9 = c4436c.e(this.f37016f);
        int e10 = c4436c2.e(this.f37016f);
        if (this.f37013c == 7) {
            e9 += this.i;
        }
        if (e9 > 0 && e10 > 0 && this.f37012b == null && this.f37011a == null) {
            c4435b.skip(e9);
            c4435b.read(new byte[e10]);
        }
        if (f36996l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e9 + ", length: " + e10);
        }
    }

    public final boolean n(HashMap hashMap) {
        C4436c c4436c = (C4436c) hashMap.get("ImageLength");
        C4436c c4436c2 = (C4436c) hashMap.get("ImageWidth");
        if (c4436c == null || c4436c2 == null) {
            return false;
        }
        return c4436c.e(this.f37016f) <= 512 && c4436c2.e(this.f37016f) <= 512;
    }

    public final void o(C4439f c4439f) {
        ByteOrder q8 = q(c4439f);
        this.f37016f = q8;
        c4439f.f36970u = q8;
        int readUnsignedShort = c4439f.readUnsignedShort();
        int i = this.f37013c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c4439f.readInt();
        if (readInt < 8) {
            throw new IOException(AbstractC4404f.e(readInt, "Invalid first Ifd offset: "));
        }
        int i6 = readInt - 8;
        if (i6 > 0) {
            c4439f.a(i6);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f37014d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder i6 = AbstractC4404f.i(i, "The size of tag group[", "]: ");
            i6.append(hashMapArr[i].size());
            Log.d("ExifInterface", i6.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C4436c c4436c = (C4436c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c4436c.toString() + ", tagValue: '" + c4436c.f(this.f37016f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        C4439f c4439f = new C4439f(bArr);
        o(c4439f);
        s(c4439f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C4439f c4439f, int i) {
        HashMap[] hashMapArr;
        short s9;
        boolean z3;
        short s10;
        HashMap[] hashMapArr2;
        HashSet hashSet;
        long j6;
        boolean z6;
        int i6;
        HashSet hashSet2;
        int i9;
        int i10;
        int readUnsignedShort;
        long j9;
        int i11 = i;
        Integer valueOf = Integer.valueOf(c4439f.f36971v);
        HashSet hashSet3 = this.f37015e;
        hashSet3.add(valueOf);
        short readShort = c4439f.readShort();
        boolean z9 = f36996l;
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            hashMapArr = this.f37014d;
            if (s11 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c4439f.readUnsignedShort();
            int readUnsignedShort3 = c4439f.readUnsignedShort();
            int readInt = c4439f.readInt();
            long j10 = c4439f.f36971v + 4;
            C4437d c4437d = (C4437d) f36990H[i11].get(Integer.valueOf(readUnsignedShort2));
            if (z9) {
                s9 = readShort;
                z3 = z9;
                s10 = s11;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i11), Integer.valueOf(readUnsignedShort2), c4437d != null ? c4437d.f36978b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s9 = readShort;
                z3 = z9;
                s10 = s11;
                hashMapArr2 = hashMapArr;
            }
            if (c4437d != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f36985C.length) {
                        int i12 = c4437d.f36979c;
                        if (i12 == 7 || readUnsignedShort3 == 7 || i12 == readUnsignedShort3 || (i6 = c4437d.f36980d) == readUnsignedShort3 || (((i12 == 4 || i6 == 4) && readUnsignedShort3 == 3) || (((i12 == 9 || i6 == 9) && readUnsignedShort3 == 8) || ((i12 == 12 || i6 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i12;
                            }
                            hashSet = hashSet3;
                            j6 = readInt * r6[readUnsignedShort3];
                            if (j6 < 0 || j6 > 2147483647L) {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z6 = false;
                                if (z6) {
                                    c4439f.j(j10);
                                } else {
                                    if (j6 > 4) {
                                        int readInt2 = c4439f.readInt();
                                        if (z3) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f37013c == 7) {
                                            if ("MakerNote".equals(c4437d.f36978b)) {
                                                this.i = readInt2;
                                            } else if (i11 == 6 && "ThumbnailImage".equals(c4437d.f36978b)) {
                                                this.f37019j = readInt2;
                                                this.f37020k = readInt;
                                                C4436c c9 = C4436c.c(6, this.f37016f);
                                                i9 = readUnsignedShort2;
                                                C4436c a9 = C4436c.a(this.f37019j, this.f37016f);
                                                i10 = readInt;
                                                C4436c a10 = C4436c.a(this.f37020k, this.f37016f);
                                                hashMapArr2[4].put("Compression", c9);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a9);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                                c4439f.j(readInt2);
                                            }
                                        }
                                        i9 = readUnsignedShort2;
                                        i10 = readInt;
                                        c4439f.j(readInt2);
                                    } else {
                                        hashSet2 = hashSet;
                                        i9 = readUnsignedShort2;
                                        i10 = readInt;
                                    }
                                    Integer num = (Integer) f36992K.get(Integer.valueOf(i9));
                                    if (z3) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j6);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j9 = c4439f.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = c4439f.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = c4439f.readInt();
                                            } else {
                                                j9 = -1;
                                            }
                                            if (z3) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), c4437d.f36978b));
                                            }
                                            if (j9 <= 0) {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j9))) {
                                                    c4439f.j(j9);
                                                    s(c4439f, num.intValue());
                                                } else if (z3) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j9 + ")");
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (z3) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j9);
                                                }
                                            }
                                            c4439f.j(j10);
                                        } else {
                                            readUnsignedShort = c4439f.readUnsignedShort();
                                        }
                                        j9 = readUnsignedShort;
                                        if (z3) {
                                        }
                                        if (j9 <= 0) {
                                        }
                                        c4439f.j(j10);
                                    } else {
                                        hashSet = hashSet2;
                                        int i13 = c4439f.f36971v + this.f37018h;
                                        byte[] bArr = new byte[(int) j6];
                                        c4439f.readFully(bArr);
                                        C4436c c4436c = new C4436c(i13, bArr, readUnsignedShort3, i10);
                                        hashMapArr2[i].put(c4437d.f36978b, c4436c);
                                        String str = c4437d.f36978b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f37013c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c4436c.f(this.f37016f).contains("PENTAX")) || ("Compression".equals(str) && c4436c.e(this.f37016f) == 65535)) {
                                            this.f37013c = 8;
                                        }
                                        if (c4439f.f36971v != j10) {
                                            c4439f.j(j10);
                                        }
                                    }
                                }
                                s11 = (short) (s10 + 1);
                                i11 = i;
                                hashSet3 = hashSet;
                                readShort = s9;
                                z9 = z3;
                            } else {
                                z6 = true;
                                if (z6) {
                                }
                                s11 = (short) (s10 + 1);
                                i11 = i;
                                hashSet3 = hashSet;
                                readShort = s9;
                                z9 = z3;
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f36984B[readUnsignedShort3] + ") is unexpected for tag: " + c4437d.f36978b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j6 = 0;
                z6 = false;
                if (z6) {
                }
                s11 = (short) (s10 + 1);
                i11 = i;
                hashSet3 = hashSet;
                readShort = s9;
                z9 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            hashSet = hashSet3;
            j6 = 0;
            z6 = false;
            if (z6) {
            }
            s11 = (short) (s10 + 1);
            i11 = i;
            hashSet3 = hashSet;
            readShort = s9;
            z9 = z3;
        }
        HashSet hashSet4 = hashSet3;
        boolean z10 = z9;
        int readInt3 = c4439f.readInt();
        if (z10) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j11 = readInt3;
        if (j11 <= 0) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z10) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        c4439f.j(j11);
        if (hashMapArr[4].isEmpty()) {
            s(c4439f, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c4439f, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f37014d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(C4435b c4435b) {
        C4436c c4436c;
        int e9;
        HashMap hashMap = this.f37014d[4];
        C4436c c4436c2 = (C4436c) hashMap.get("Compression");
        if (c4436c2 == null) {
            m(c4435b, hashMap);
            return;
        }
        int e10 = c4436c2.e(this.f37016f);
        if (e10 != 1) {
            if (e10 == 6) {
                m(c4435b, hashMap);
                return;
            } else if (e10 != 7) {
                return;
            }
        }
        C4436c c4436c3 = (C4436c) hashMap.get("BitsPerSample");
        if (c4436c3 != null) {
            int[] iArr = (int[]) c4436c3.g(this.f37016f);
            int[] iArr2 = f36997m;
            if (Arrays.equals(iArr2, iArr) || (this.f37013c == 3 && (c4436c = (C4436c) hashMap.get("PhotometricInterpretation")) != null && (((e9 = c4436c.e(this.f37016f)) == 1 && Arrays.equals(iArr, f36998n)) || (e9 == 6 && Arrays.equals(iArr, iArr2))))) {
                C4436c c4436c4 = (C4436c) hashMap.get("StripOffsets");
                C4436c c4436c5 = (C4436c) hashMap.get("StripByteCounts");
                if (c4436c4 == null || c4436c5 == null) {
                    return;
                }
                long[] h9 = F.h(c4436c4.g(this.f37016f));
                long[] h10 = F.h(c4436c5.g(this.f37016f));
                if (h9 == null || h9.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (h10 == null || h10.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (h9.length != h10.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j6 = 0;
                for (long j9 : h10) {
                    j6 += j9;
                }
                byte[] bArr = new byte[(int) j6];
                this.f37017g = true;
                int i = 0;
                int i6 = 0;
                for (int i9 = 0; i9 < h9.length; i9++) {
                    int i10 = (int) h9[i9];
                    int i11 = (int) h10[i9];
                    if (i9 < h9.length - 1 && i10 + i11 != h9[i9 + 1]) {
                        this.f37017g = false;
                    }
                    int i12 = i10 - i;
                    if (i12 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j10 = i12;
                    if (c4435b.skip(j10) != j10) {
                        Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                    int i13 = i + i12;
                    byte[] bArr2 = new byte[i11];
                    if (c4435b.read(bArr2) != i11) {
                        Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                        return;
                    }
                    i = i13 + i11;
                    System.arraycopy(bArr2, 0, bArr, i6, i11);
                    i6 += i11;
                }
                if (this.f37017g) {
                    long j11 = h9[0];
                    return;
                }
                return;
            }
        }
        if (f36996l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i6) {
        HashMap[] hashMapArr = this.f37014d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z3 = f36996l;
        if (isEmpty || hashMapArr[i6].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C4436c c4436c = (C4436c) hashMapArr[i].get("ImageLength");
        C4436c c4436c2 = (C4436c) hashMapArr[i].get("ImageWidth");
        C4436c c4436c3 = (C4436c) hashMapArr[i6].get("ImageLength");
        C4436c c4436c4 = (C4436c) hashMapArr[i6].get("ImageWidth");
        if (c4436c == null || c4436c2 == null) {
            if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c4436c3 == null || c4436c4 == null) {
            if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e9 = c4436c.e(this.f37016f);
        int e10 = c4436c2.e(this.f37016f);
        int e11 = c4436c3.e(this.f37016f);
        int e12 = c4436c4.e(this.f37016f);
        if (e9 >= e11 || e10 >= e12) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i6];
        hashMapArr[i6] = hashMap;
    }

    public final void w(C4439f c4439f, int i) {
        C4436c c9;
        C4436c c10;
        HashMap[] hashMapArr = this.f37014d;
        C4436c c4436c = (C4436c) hashMapArr[i].get("DefaultCropSize");
        C4436c c4436c2 = (C4436c) hashMapArr[i].get("SensorTopBorder");
        C4436c c4436c3 = (C4436c) hashMapArr[i].get("SensorLeftBorder");
        C4436c c4436c4 = (C4436c) hashMapArr[i].get("SensorBottomBorder");
        C4436c c4436c5 = (C4436c) hashMapArr[i].get("SensorRightBorder");
        if (c4436c != null) {
            if (c4436c.f36973a == 5) {
                C4438e[] c4438eArr = (C4438e[]) c4436c.g(this.f37016f);
                if (c4438eArr == null || c4438eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c4438eArr));
                    return;
                }
                c9 = C4436c.b(c4438eArr[0], this.f37016f);
                c10 = C4436c.b(c4438eArr[1], this.f37016f);
            } else {
                int[] iArr = (int[]) c4436c.g(this.f37016f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c9 = C4436c.c(iArr[0], this.f37016f);
                c10 = C4436c.c(iArr[1], this.f37016f);
            }
            hashMapArr[i].put("ImageWidth", c9);
            hashMapArr[i].put("ImageLength", c10);
            return;
        }
        if (c4436c2 != null && c4436c3 != null && c4436c4 != null && c4436c5 != null) {
            int e9 = c4436c2.e(this.f37016f);
            int e10 = c4436c4.e(this.f37016f);
            int e11 = c4436c5.e(this.f37016f);
            int e12 = c4436c3.e(this.f37016f);
            if (e10 <= e9 || e11 <= e12) {
                return;
            }
            C4436c c11 = C4436c.c(e10 - e9, this.f37016f);
            C4436c c12 = C4436c.c(e11 - e12, this.f37016f);
            hashMapArr[i].put("ImageLength", c11);
            hashMapArr[i].put("ImageWidth", c12);
            return;
        }
        C4436c c4436c6 = (C4436c) hashMapArr[i].get("ImageLength");
        C4436c c4436c7 = (C4436c) hashMapArr[i].get("ImageWidth");
        if (c4436c6 == null || c4436c7 == null) {
            C4436c c4436c8 = (C4436c) hashMapArr[i].get("JPEGInterchangeFormat");
            C4436c c4436c9 = (C4436c) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c4436c8 == null || c4436c9 == null) {
                return;
            }
            int e13 = c4436c8.e(this.f37016f);
            int e14 = c4436c8.e(this.f37016f);
            c4439f.j(e13);
            byte[] bArr = new byte[e14];
            c4439f.read(bArr);
            e(new C4435b(bArr), e13, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f37014d;
        C4436c c4436c = (C4436c) hashMapArr[1].get("PixelXDimension");
        C4436c c4436c2 = (C4436c) hashMapArr[1].get("PixelYDimension");
        if (c4436c != null && c4436c2 != null) {
            hashMapArr[0].put("ImageWidth", c4436c);
            hashMapArr[0].put("ImageLength", c4436c2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
