package d0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.google.android.gms.internal.ads.Wv;
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
public final class C4455g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f37136A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f37137B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f37138C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f37139D;

    /* renamed from: E, reason: collision with root package name */
    public static final C4452d f37140E;

    /* renamed from: F, reason: collision with root package name */
    public static final C4452d[][] f37141F;

    /* renamed from: G, reason: collision with root package name */
    public static final C4452d[] f37142G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f37143H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f37144I;
    public static final HashSet J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f37145K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f37146L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f37147M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f37148N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f37149l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f37150m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f37151n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f37152o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f37153p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f37154q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f37155r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f37156s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f37157t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f37158u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f37159v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f37160w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f37161x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f37162y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f37163z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f37164a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f37165b;

    /* renamed from: c, reason: collision with root package name */
    public int f37166c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f37167d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f37168e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f37169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37170g;

    /* renamed from: h, reason: collision with root package name */
    public int f37171h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f37172j;

    /* renamed from: k, reason: collision with root package name */
    public int f37173k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f37150m = new int[]{8, 8, 8};
        f37151n = new int[]{8};
        f37152o = new byte[]{-1, -40, -1};
        f37153p = new byte[]{102, 116, 121, 112};
        f37154q = new byte[]{109, 105, 102, 49};
        f37155r = new byte[]{104, 101, 105, 99};
        f37156s = new byte[]{79, 76, 89, 77, 80, 0};
        f37157t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f37158u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f37159v = new byte[]{101, 88, 73, 102};
        f37160w = new byte[]{73, 72, 68, 82};
        f37161x = new byte[]{73, 69, 78, 68};
        f37162y = new byte[]{82, 73, 70, 70};
        f37163z = new byte[]{87, 69, 66, 80};
        f37136A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f37137B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f37138C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f37139D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C4452d[] c4452dArr = {new C4452d("NewSubfileType", 254, 4), new C4452d("SubfileType", p.f9259b, 4), new C4452d(256, "ImageWidth", 3, 4), new C4452d(257, "ImageLength", 3, 4), new C4452d("BitsPerSample", 258, 3), new C4452d("Compression", 259, 3), new C4452d("PhotometricInterpretation", 262, 3), new C4452d("ImageDescription", 270, 2), new C4452d("Make", 271, 2), new C4452d("Model", 272, 2), new C4452d(273, "StripOffsets", 3, 4), new C4452d("Orientation", 274, 3), new C4452d("SamplesPerPixel", 277, 3), new C4452d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4452d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4452d("XResolution", 282, 5), new C4452d("YResolution", 283, 5), new C4452d("PlanarConfiguration", 284, 3), new C4452d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4452d("TransferFunction", BaseATView.a.f10561L, 3), new C4452d("Software", BaseATView.a.f10565P, 2), new C4452d("DateTime", 306, 2), new C4452d("Artist", 315, 2), new C4452d("WhitePoint", 318, 5), new C4452d("PrimaryChromaticities", 319, 5), new C4452d("SubIFDPointer", 330, 4), new C4452d("JPEGInterchangeFormat", 513, 4), new C4452d("JPEGInterchangeFormatLength", 514, 4), new C4452d("YCbCrCoefficients", 529, 5), new C4452d("YCbCrSubSampling", 530, 3), new C4452d("YCbCrPositioning", 531, 3), new C4452d("ReferenceBlackWhite", 532, 5), new C4452d("Copyright", 33432, 2), new C4452d("ExifIFDPointer", 34665, 4), new C4452d("GPSInfoIFDPointer", 34853, 4), new C4452d("SensorTopBorder", 4, 4), new C4452d("SensorLeftBorder", 5, 4), new C4452d("SensorBottomBorder", 6, 4), new C4452d("SensorRightBorder", 7, 4), new C4452d("ISO", 23, 3), new C4452d("JpgFromRaw", 46, 7), new C4452d("Xmp", com.anythink.core.common.m.a.f15187n, 1)};
        C4452d[] c4452dArr2 = {new C4452d("ExposureTime", 33434, 5), new C4452d("FNumber", 33437, 5), new C4452d("ExposureProgram", 34850, 3), new C4452d("SpectralSensitivity", 34852, 2), new C4452d("PhotographicSensitivity", 34855, 3), new C4452d("OECF", 34856, 7), new C4452d("SensitivityType", 34864, 3), new C4452d("StandardOutputSensitivity", 34865, 4), new C4452d("RecommendedExposureIndex", 34866, 4), new C4452d("ISOSpeed", 34867, 4), new C4452d("ISOSpeedLatitudeyyy", 34868, 4), new C4452d("ISOSpeedLatitudezzz", 34869, 4), new C4452d("ExifVersion", 36864, 2), new C4452d("DateTimeOriginal", 36867, 2), new C4452d("DateTimeDigitized", 36868, 2), new C4452d("OffsetTime", 36880, 2), new C4452d("OffsetTimeOriginal", 36881, 2), new C4452d("OffsetTimeDigitized", 36882, 2), new C4452d("ComponentsConfiguration", 37121, 7), new C4452d("CompressedBitsPerPixel", 37122, 5), new C4452d("ShutterSpeedValue", 37377, 10), new C4452d("ApertureValue", 37378, 5), new C4452d("BrightnessValue", 37379, 10), new C4452d("ExposureBiasValue", 37380, 10), new C4452d("MaxApertureValue", 37381, 5), new C4452d("SubjectDistance", 37382, 5), new C4452d("MeteringMode", 37383, 3), new C4452d("LightSource", 37384, 3), new C4452d("Flash", 37385, 3), new C4452d("FocalLength", 37386, 5), new C4452d("SubjectArea", 37396, 3), new C4452d("MakerNote", 37500, 7), new C4452d("UserComment", 37510, 7), new C4452d("SubSecTime", 37520, 2), new C4452d("SubSecTimeOriginal", 37521, 2), new C4452d("SubSecTimeDigitized", 37522, 2), new C4452d("FlashpixVersion", 40960, 7), new C4452d("ColorSpace", 40961, 3), new C4452d(40962, "PixelXDimension", 3, 4), new C4452d(40963, "PixelYDimension", 3, 4), new C4452d("RelatedSoundFile", 40964, 2), new C4452d("InteroperabilityIFDPointer", 40965, 4), new C4452d("FlashEnergy", 41483, 5), new C4452d("SpatialFrequencyResponse", 41484, 7), new C4452d("FocalPlaneXResolution", 41486, 5), new C4452d("FocalPlaneYResolution", 41487, 5), new C4452d("FocalPlaneResolutionUnit", 41488, 3), new C4452d("SubjectLocation", 41492, 3), new C4452d("ExposureIndex", 41493, 5), new C4452d("SensingMethod", 41495, 3), new C4452d("FileSource", 41728, 7), new C4452d("SceneType", 41729, 7), new C4452d("CFAPattern", 41730, 7), new C4452d("CustomRendered", 41985, 3), new C4452d("ExposureMode", 41986, 3), new C4452d("WhiteBalance", 41987, 3), new C4452d("DigitalZoomRatio", 41988, 5), new C4452d("FocalLengthIn35mmFilm", 41989, 3), new C4452d("SceneCaptureType", 41990, 3), new C4452d("GainControl", 41991, 3), new C4452d("Contrast", 41992, 3), new C4452d("Saturation", 41993, 3), new C4452d("Sharpness", 41994, 3), new C4452d("DeviceSettingDescription", 41995, 7), new C4452d("SubjectDistanceRange", 41996, 3), new C4452d("ImageUniqueID", 42016, 2), new C4452d("CameraOwnerName", 42032, 2), new C4452d("BodySerialNumber", 42033, 2), new C4452d("LensSpecification", 42034, 5), new C4452d("LensMake", 42035, 2), new C4452d("LensModel", 42036, 2), new C4452d("Gamma", 42240, 5), new C4452d("DNGVersion", 50706, 1), new C4452d(50720, "DefaultCropSize", 3, 4)};
        C4452d[] c4452dArr3 = {new C4452d("GPSVersionID", 0, 1), new C4452d("GPSLatitudeRef", 1, 2), new C4452d(2, "GPSLatitude", 5, 10), new C4452d("GPSLongitudeRef", 3, 2), new C4452d(4, "GPSLongitude", 5, 10), new C4452d("GPSAltitudeRef", 5, 1), new C4452d("GPSAltitude", 6, 5), new C4452d("GPSTimeStamp", 7, 5), new C4452d("GPSSatellites", 8, 2), new C4452d("GPSStatus", 9, 2), new C4452d("GPSMeasureMode", 10, 2), new C4452d("GPSDOP", 11, 5), new C4452d("GPSSpeedRef", 12, 2), new C4452d("GPSSpeed", 13, 5), new C4452d("GPSTrackRef", 14, 2), new C4452d("GPSTrack", 15, 5), new C4452d("GPSImgDirectionRef", 16, 2), new C4452d("GPSImgDirection", 17, 5), new C4452d("GPSMapDatum", 18, 2), new C4452d("GPSDestLatitudeRef", 19, 2), new C4452d("GPSDestLatitude", 20, 5), new C4452d("GPSDestLongitudeRef", 21, 2), new C4452d("GPSDestLongitude", 22, 5), new C4452d("GPSDestBearingRef", 23, 2), new C4452d("GPSDestBearing", 24, 5), new C4452d("GPSDestDistanceRef", 25, 2), new C4452d("GPSDestDistance", 26, 5), new C4452d("GPSProcessingMethod", 27, 7), new C4452d("GPSAreaInformation", 28, 7), new C4452d("GPSDateStamp", 29, 2), new C4452d("GPSDifferential", 30, 3), new C4452d("GPSHPositioningError", 31, 5)};
        C4452d[] c4452dArr4 = {new C4452d("InteroperabilityIndex", 1, 2)};
        C4452d[] c4452dArr5 = {new C4452d("NewSubfileType", 254, 4), new C4452d("SubfileType", p.f9259b, 4), new C4452d(256, "ThumbnailImageWidth", 3, 4), new C4452d(257, "ThumbnailImageLength", 3, 4), new C4452d("BitsPerSample", 258, 3), new C4452d("Compression", 259, 3), new C4452d("PhotometricInterpretation", 262, 3), new C4452d("ImageDescription", 270, 2), new C4452d("Make", 271, 2), new C4452d("Model", 272, 2), new C4452d(273, "StripOffsets", 3, 4), new C4452d("ThumbnailOrientation", 274, 3), new C4452d("SamplesPerPixel", 277, 3), new C4452d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4452d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4452d("XResolution", 282, 5), new C4452d("YResolution", 283, 5), new C4452d("PlanarConfiguration", 284, 3), new C4452d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4452d("TransferFunction", BaseATView.a.f10561L, 3), new C4452d("Software", BaseATView.a.f10565P, 2), new C4452d("DateTime", 306, 2), new C4452d("Artist", 315, 2), new C4452d("WhitePoint", 318, 5), new C4452d("PrimaryChromaticities", 319, 5), new C4452d("SubIFDPointer", 330, 4), new C4452d("JPEGInterchangeFormat", 513, 4), new C4452d("JPEGInterchangeFormatLength", 514, 4), new C4452d("YCbCrCoefficients", 529, 5), new C4452d("YCbCrSubSampling", 530, 3), new C4452d("YCbCrPositioning", 531, 3), new C4452d("ReferenceBlackWhite", 532, 5), new C4452d("Copyright", 33432, 2), new C4452d("ExifIFDPointer", 34665, 4), new C4452d("GPSInfoIFDPointer", 34853, 4), new C4452d("DNGVersion", 50706, 1), new C4452d(50720, "DefaultCropSize", 3, 4)};
        f37140E = new C4452d("StripOffsets", 273, 3);
        f37141F = new C4452d[][]{c4452dArr, c4452dArr2, c4452dArr3, c4452dArr4, c4452dArr5, c4452dArr, new C4452d[]{new C4452d("ThumbnailImage", 256, 7), new C4452d("CameraSettingsIFDPointer", 8224, 4), new C4452d("ImageProcessingIFDPointer", 8256, 4)}, new C4452d[]{new C4452d("PreviewImageStart", 257, 4), new C4452d("PreviewImageLength", 258, 4)}, new C4452d[]{new C4452d("AspectFrame", 4371, 3)}, new C4452d[]{new C4452d("ColorSpace", 55, 3)}};
        f37142G = new C4452d[]{new C4452d("SubIFDPointer", 330, 4), new C4452d("ExifIFDPointer", 34665, 4), new C4452d("GPSInfoIFDPointer", 34853, 4), new C4452d("InteroperabilityIFDPointer", 40965, 4), new C4452d("CameraSettingsIFDPointer", 8224, 1), new C4452d("ImageProcessingIFDPointer", 8256, 1)};
        f37143H = new HashMap[10];
        f37144I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f37145K = new HashMap();
        Charset forName = Charset.forName(com.anythink.basead.exoplayer.b.i);
        f37146L = forName;
        f37147M = "Exif\u0000\u0000".getBytes(forName);
        f37148N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4452d[][] c4452dArr6 = f37141F;
            if (i >= c4452dArr6.length) {
                HashMap hashMap = f37145K;
                C4452d[] c4452dArr7 = f37142G;
                hashMap.put(Integer.valueOf(c4452dArr7[0].f37130a), 5);
                hashMap.put(Integer.valueOf(c4452dArr7[1].f37130a), 1);
                hashMap.put(Integer.valueOf(c4452dArr7[2].f37130a), 2);
                hashMap.put(Integer.valueOf(c4452dArr7[3].f37130a), 3);
                hashMap.put(Integer.valueOf(c4452dArr7[4].f37130a), 7);
                hashMap.put(Integer.valueOf(c4452dArr7[5].f37130a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f37143H[i] = new HashMap();
            f37144I[i] = new HashMap();
            for (C4452d c4452d : c4452dArr6[i]) {
                f37143H[i].put(Integer.valueOf(c4452d.f37130a), c4452d);
                f37144I[i].put(c4452d.f37131b, c4452d);
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
    public C4455g(InputStream inputStream) {
        C4452d[][] c4452dArr = f37141F;
        this.f37167d = new HashMap[c4452dArr.length];
        this.f37168e = new HashSet(c4452dArr.length);
        this.f37169f = ByteOrder.BIG_ENDIAN;
        boolean z6 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z9 = f37149l;
        if (z6) {
            this.f37165b = (AssetManager.AssetInputStream) inputStream;
            this.f37164a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    AbstractC4456h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f37165b = null;
                    this.f37164a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z9) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f37165b = null;
            this.f37164a = null;
        }
        for (int i = 0; i < c4452dArr.length; i++) {
            try {
                try {
                    this.f37167d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z9) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z9) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e10) {
                e = e10;
                if (z9) {
                }
                a();
                if (!z9) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f2 = f(bufferedInputStream);
        this.f37166c = f2;
        if (f2 != 4 && f2 != 9 && f2 != 13 && f2 != 14) {
            C4454f c4454f = new C4454f(bufferedInputStream);
            int i4 = this.f37166c;
            if (i4 == 12) {
                d(c4454f);
            } else if (i4 == 7) {
                g(c4454f);
            } else if (i4 == 10) {
                k(c4454f);
            } else {
                j(c4454f);
            }
            c4454f.j(this.f37171h);
            u(c4454f);
            a();
            if (!z9) {
                return;
            }
            p();
        }
        C4450b c4450b = new C4450b(bufferedInputStream);
        int i6 = this.f37166c;
        if (i6 == 4) {
            e(c4450b, 0, 0);
        } else if (i6 == 13) {
            h(c4450b);
        } else if (i6 == 9) {
            i(c4450b);
        } else if (i6 == 14) {
            l(c4450b);
        }
        a();
        if (!z9) {
        }
        p();
    }

    public static ByteOrder q(C4450b c4450b) {
        short readShort = c4450b.readShort();
        boolean z6 = f37149l;
        if (readShort == 18761) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b9 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f37167d;
        if (b9 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b9.concat("\u0000").getBytes(f37146L);
            hashMap.put("DateTime", new C4451c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C4451c.a(0L, this.f37169f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C4451c.a(0L, this.f37169f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C4451c.a(0L, this.f37169f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C4451c.a(0L, this.f37169f));
        }
    }

    public final String b(String str) {
        C4451c c9 = c(str);
        if (c9 != null) {
            if (!J.contains(str)) {
                return c9.f(this.f37169f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c9.f37126a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C4453e[] c4453eArr = (C4453e[]) c9.g(this.f37169f);
                if (c4453eArr == null || c4453eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c4453eArr));
                    return null;
                }
                C4453e c4453e = c4453eArr[0];
                Integer valueOf = Integer.valueOf((int) (c4453e.f37134a / c4453e.f37135b));
                C4453e c4453e2 = c4453eArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c4453e2.f37134a / c4453e2.f37135b));
                C4453e c4453e3 = c4453eArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c4453e3.f37134a / c4453e3.f37135b)));
            }
            try {
                return Double.toString(c9.d(this.f37169f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C4451c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f37149l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f37141F.length; i++) {
            C4451c c4451c = (C4451c) this.f37167d[i].get(str);
            if (c4451c != null) {
                return c4451c;
            }
        }
        return null;
    }

    public final void d(C4454f c4454f) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC4457i.a(mediaMetadataRetriever, new C4449a(c4454f));
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
                HashMap[] hashMapArr = this.f37167d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C4451c.c(Integer.parseInt(str), this.f37169f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", C4451c.c(Integer.parseInt(str2), this.f37169f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", C4451c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f37169f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c4454f.j(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c4454f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f37147M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    if (c4454f.read(bArr2) != i4) {
                        throw new IOException("Can't read exif");
                    }
                    this.f37171h = i;
                    r(0, bArr2);
                }
                if (f37149l) {
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
    
        r23.f37123u = r22.f37169f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C4450b c4450b, int i, int i4) {
        boolean z6 = f37149l;
        if (z6) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c4450b);
        }
        c4450b.f37123u = ByteOrder.BIG_ENDIAN;
        byte readByte = c4450b.readByte();
        byte b9 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c4450b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i6 = 2;
        int i9 = 2;
        while (true) {
            byte readByte2 = c4450b.readByte();
            if (readByte2 != b9) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c4450b.readByte();
            if (z6) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c4450b.readUnsignedShort();
                int i10 = readUnsignedShort - 2;
                int i11 = i9 + 4;
                if (z6) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] hashMapArr = this.f37167d;
                int i12 = 0;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i10];
                    c4450b.readFully(bArr);
                    int i13 = i11 + i10;
                    byte[] bArr2 = f37147M;
                    if (bArr2 != null && i10 >= bArr2.length) {
                        int i14 = 0;
                        while (i14 < bArr2.length) {
                            if (bArr[i14] == bArr2[i14]) {
                                i14++;
                                i12 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i10);
                        this.f37171h = i + i11 + bArr2.length;
                        r(i4, copyOfRange);
                        u(new C4450b(copyOfRange));
                        i11 = i13;
                        i10 = 0;
                    }
                    byte[] bArr3 = f37148N;
                    if (bArr3 != null && i10 >= bArr3.length) {
                        int i15 = i12;
                        while (true) {
                            if (i15 >= bArr3.length) {
                                int length = i11 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i10);
                                if (b("Xmp") == null) {
                                    hashMapArr[i12].put("Xmp", new C4451c(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i15] == bArr3[i15]) {
                                i15++;
                            }
                        }
                    }
                    i11 = i13;
                    i10 = 0;
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
                                            c4450b.a(1);
                                            hashMapArr[i4].put(i4 != 4 ? "ImageLength" : "ThumbnailImageLength", C4451c.a(c4450b.readUnsignedShort(), this.f37169f));
                                            hashMapArr[i4].put(i4 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C4451c.a(c4450b.readUnsignedShort(), this.f37169f));
                                            i10 = readUnsignedShort - 7;
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
                    byte[] bArr4 = new byte[i10];
                    if (c4450b.read(bArr4) != i10) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = f37146L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new C4451c(bytes, i6, bytes.length));
                    }
                    i10 = 0;
                }
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                c4450b.a(i10);
                i9 = i11 + i10;
                i6 = 2;
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
        C4450b c4450b;
        int i4;
        int i6;
        int i9;
        int i10;
        long readInt;
        byte[] bArr;
        long j6;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i11 = 0;
        while (true) {
            byte[] bArr3 = f37152o;
            if (i11 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i11] != bArr3[i11]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i12 = 0; i12 < bytes.length; i12++) {
                    if (bArr2[i12] != bytes[i12]) {
                        C4450b c4450b2 = null;
                        try {
                            c4450b = new C4450b(bArr2);
                            try {
                                try {
                                    readInt = c4450b.readInt();
                                    bArr = new byte[4];
                                    c4450b.read(bArr);
                                } catch (Exception e9) {
                                    e = e9;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c4450b2 = c4450b;
                                if (c4450b2 != null) {
                                    c4450b2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i = 0;
                            c4450b = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f37153p)) {
                            if (readInt == 1) {
                                readInt = c4450b.readLong();
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
                                    boolean z6 = false;
                                    boolean z9 = false;
                                    for (long j11 = 0; j11 < j10 / 4 && c4450b.read(bArr4) == 4; j11++) {
                                        if (j11 != 1) {
                                            if (Arrays.equals(bArr4, f37154q)) {
                                                z6 = true;
                                            } else if (Arrays.equals(bArr4, f37155r)) {
                                                z9 = true;
                                            }
                                            if (z6 && z9) {
                                                c4450b.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    if (f37149l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            c4450b.close();
                            C4450b c4450b3 = new C4450b(bArr2);
                            ByteOrder q8 = q(c4450b3);
                            this.f37169f = q8;
                            c4450b3.f37123u = q8;
                            short readShort = c4450b3.readShort();
                            i4 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                            c4450b3.close();
                            if (i4 != 0) {
                                return 7;
                            }
                            try {
                                C4450b c4450b4 = new C4450b(bArr2);
                                try {
                                    ByteOrder q9 = q(c4450b4);
                                    this.f37169f = q9;
                                    c4450b4.f37123u = q9;
                                    i6 = c4450b4.readShort() == 85 ? 1 : i;
                                    c4450b4.close();
                                } catch (Exception unused) {
                                    c4450b2 = c4450b4;
                                    if (c4450b2 != null) {
                                        c4450b2.close();
                                    }
                                    i6 = i;
                                    if (i6 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4450b2 = c4450b4;
                                    if (c4450b2 != null) {
                                        c4450b2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            if (i6 == 0) {
                                return 10;
                            }
                            int i13 = i;
                            while (true) {
                                byte[] bArr5 = f37158u;
                                if (i13 >= bArr5.length) {
                                    i9 = 1;
                                    break;
                                }
                                if (bArr2[i13] != bArr5[i13]) {
                                    i9 = i;
                                    break;
                                }
                                i13++;
                            }
                            if (i9 != 0) {
                                return 13;
                            }
                            int i14 = i;
                            while (true) {
                                byte[] bArr6 = f37162y;
                                if (i14 >= bArr6.length) {
                                    int i15 = i;
                                    while (true) {
                                        byte[] bArr7 = f37163z;
                                        if (i15 >= bArr7.length) {
                                            i10 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i15 + 4] != bArr7[i15]) {
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    if (bArr2[i14] != bArr6[i14]) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            if (i10 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        c4450b.close();
                        i = 0;
                        C4450b c4450b32 = new C4450b(bArr2);
                        ByteOrder q82 = q(c4450b32);
                        this.f37169f = q82;
                        c4450b32.f37123u = q82;
                        short readShort2 = c4450b32.readShort();
                        if (readShort2 != 20306) {
                        }
                        c4450b32.close();
                        if (i4 != 0) {
                        }
                    }
                }
                return 9;
            }
            i11++;
        }
    }

    public final void g(C4454f c4454f) {
        int i;
        int i4;
        j(c4454f);
        HashMap[] hashMapArr = this.f37167d;
        C4451c c4451c = (C4451c) hashMapArr[1].get("MakerNote");
        if (c4451c != null) {
            C4454f c4454f2 = new C4454f(c4451c.f37129d);
            c4454f2.f37123u = this.f37169f;
            byte[] bArr = f37156s;
            byte[] bArr2 = new byte[bArr.length];
            c4454f2.readFully(bArr2);
            c4454f2.j(0L);
            byte[] bArr3 = f37157t;
            byte[] bArr4 = new byte[bArr3.length];
            c4454f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c4454f2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c4454f2.j(12L);
            }
            s(c4454f2, 6);
            C4451c c4451c2 = (C4451c) hashMapArr[7].get("PreviewImageStart");
            C4451c c4451c3 = (C4451c) hashMapArr[7].get("PreviewImageLength");
            if (c4451c2 != null && c4451c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c4451c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c4451c3);
            }
            C4451c c4451c4 = (C4451c) hashMapArr[8].get("AspectFrame");
            if (c4451c4 != null) {
                int[] iArr = (int[]) c4451c4.g(this.f37169f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i9 = iArr[0];
                if (i6 <= i9 || (i = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i10 = (i6 - i9) + 1;
                int i11 = (i - i4) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                C4451c c9 = C4451c.c(i10, this.f37169f);
                C4451c c10 = C4451c.c(i11, this.f37169f);
                hashMapArr[0].put("ImageWidth", c9);
                hashMapArr[0].put("ImageLength", c10);
            }
        }
    }

    public final void h(C4450b c4450b) {
        if (f37149l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c4450b);
        }
        c4450b.f37123u = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f37158u;
        c4450b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c4450b.readInt();
                byte[] bArr2 = new byte[4];
                if (c4450b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f37160w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f37161x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f37159v)) {
                    byte[] bArr3 = new byte[readInt];
                    if (c4450b.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t8.g.a(bArr2));
                    }
                    int readInt2 = c4450b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f37171h = i;
                        r(0, bArr3);
                        x();
                        u(new C4450b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = readInt + 4;
                c4450b.a(i4);
                length = i + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C4450b c4450b) {
        boolean z6 = f37149l;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c4450b);
        }
        c4450b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c4450b.read(bArr);
        c4450b.read(bArr2);
        c4450b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        c4450b.a(i - c4450b.f37124v);
        c4450b.read(bArr4);
        e(new C4450b(bArr4), i, 5);
        c4450b.a(i6 - c4450b.f37124v);
        c4450b.f37123u = ByteOrder.BIG_ENDIAN;
        int readInt = c4450b.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i9 = 0; i9 < readInt; i9++) {
            int readUnsignedShort = c4450b.readUnsignedShort();
            int readUnsignedShort2 = c4450b.readUnsignedShort();
            if (readUnsignedShort == f37140E.f37130a) {
                short readShort = c4450b.readShort();
                short readShort2 = c4450b.readShort();
                C4451c c9 = C4451c.c(readShort, this.f37169f);
                C4451c c10 = C4451c.c(readShort2, this.f37169f);
                HashMap[] hashMapArr = this.f37167d;
                hashMapArr[0].put("ImageLength", c9);
                hashMapArr[0].put("ImageWidth", c10);
                if (z6) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c4450b.a(readUnsignedShort2);
        }
    }

    public final void j(C4454f c4454f) {
        o(c4454f);
        s(c4454f, 0);
        w(c4454f, 0);
        w(c4454f, 5);
        w(c4454f, 4);
        x();
        if (this.f37166c == 8) {
            HashMap[] hashMapArr = this.f37167d;
            C4451c c4451c = (C4451c) hashMapArr[1].get("MakerNote");
            if (c4451c != null) {
                C4454f c4454f2 = new C4454f(c4451c.f37129d);
                c4454f2.f37123u = this.f37169f;
                c4454f2.a(6);
                s(c4454f2, 9);
                C4451c c4451c2 = (C4451c) hashMapArr[9].get("ColorSpace");
                if (c4451c2 != null) {
                    hashMapArr[1].put("ColorSpace", c4451c2);
                }
            }
        }
    }

    public final void k(C4454f c4454f) {
        if (f37149l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c4454f);
        }
        j(c4454f);
        HashMap[] hashMapArr = this.f37167d;
        C4451c c4451c = (C4451c) hashMapArr[0].get("JpgFromRaw");
        if (c4451c != null) {
            e(new C4450b(c4451c.f37129d), (int) c4451c.f37128c, 5);
        }
        C4451c c4451c2 = (C4451c) hashMapArr[0].get("ISO");
        C4451c c4451c3 = (C4451c) hashMapArr[1].get("PhotographicSensitivity");
        if (c4451c2 == null || c4451c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c4451c2);
    }

    public final void l(C4450b c4450b) {
        if (f37149l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c4450b);
        }
        c4450b.f37123u = ByteOrder.LITTLE_ENDIAN;
        c4450b.a(f37162y.length);
        int readInt = c4450b.readInt() + 8;
        byte[] bArr = f37163z;
        c4450b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c4450b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c4450b.readInt();
                int i = length + 8;
                if (Arrays.equals(f37136A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (c4450b.read(bArr3) == readInt2) {
                        this.f37171h = i;
                        r(0, bArr3);
                        u(new C4450b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t8.g.a(bArr2));
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
                c4450b.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C4450b c4450b, HashMap hashMap) {
        C4451c c4451c = (C4451c) hashMap.get("JPEGInterchangeFormat");
        C4451c c4451c2 = (C4451c) hashMap.get("JPEGInterchangeFormatLength");
        if (c4451c == null || c4451c2 == null) {
            return;
        }
        int e9 = c4451c.e(this.f37169f);
        int e10 = c4451c2.e(this.f37169f);
        if (this.f37166c == 7) {
            e9 += this.i;
        }
        if (e9 > 0 && e10 > 0 && this.f37165b == null && this.f37164a == null) {
            c4450b.skip(e9);
            c4450b.read(new byte[e10]);
        }
        if (f37149l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e9 + ", length: " + e10);
        }
    }

    public final boolean n(HashMap hashMap) {
        C4451c c4451c = (C4451c) hashMap.get("ImageLength");
        C4451c c4451c2 = (C4451c) hashMap.get("ImageWidth");
        if (c4451c == null || c4451c2 == null) {
            return false;
        }
        return c4451c.e(this.f37169f) <= 512 && c4451c2.e(this.f37169f) <= 512;
    }

    public final void o(C4454f c4454f) {
        ByteOrder q8 = q(c4454f);
        this.f37169f = q8;
        c4454f.f37123u = q8;
        int readUnsignedShort = c4454f.readUnsignedShort();
        int i = this.f37166c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c4454f.readInt();
        if (readInt < 8) {
            throw new IOException(Wv.f(readInt, "Invalid first Ifd offset: "));
        }
        int i4 = readInt - 8;
        if (i4 > 0) {
            c4454f.a(i4);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f37167d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder k9 = Wv.k(i, "The size of tag group[", "]: ");
            k9.append(hashMapArr[i].size());
            Log.d("ExifInterface", k9.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C4451c c4451c = (C4451c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c4451c.toString() + ", tagValue: '" + c4451c.f(this.f37169f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        C4454f c4454f = new C4454f(bArr);
        o(c4454f);
        s(c4454f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C4454f c4454f, int i) {
        HashMap[] hashMapArr;
        short s9;
        boolean z6;
        short s10;
        HashMap[] hashMapArr2;
        HashSet hashSet;
        long j6;
        boolean z9;
        int i4;
        HashSet hashSet2;
        int i6;
        int i9;
        int readUnsignedShort;
        long j9;
        int i10 = i;
        Integer valueOf = Integer.valueOf(c4454f.f37124v);
        HashSet hashSet3 = this.f37168e;
        hashSet3.add(valueOf);
        short readShort = c4454f.readShort();
        boolean z10 = f37149l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            hashMapArr = this.f37167d;
            if (s11 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c4454f.readUnsignedShort();
            int readUnsignedShort3 = c4454f.readUnsignedShort();
            int readInt = c4454f.readInt();
            long j10 = c4454f.f37124v + 4;
            C4452d c4452d = (C4452d) f37143H[i10].get(Integer.valueOf(readUnsignedShort2));
            if (z10) {
                s9 = readShort;
                z6 = z10;
                s10 = s11;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(readUnsignedShort2), c4452d != null ? c4452d.f37131b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s9 = readShort;
                z6 = z10;
                s10 = s11;
                hashMapArr2 = hashMapArr;
            }
            if (c4452d != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f37138C.length) {
                        int i11 = c4452d.f37132c;
                        if (i11 == 7 || readUnsignedShort3 == 7 || i11 == readUnsignedShort3 || (i4 = c4452d.f37133d) == readUnsignedShort3 || (((i11 == 4 || i4 == 4) && readUnsignedShort3 == 3) || (((i11 == 9 || i4 == 9) && readUnsignedShort3 == 8) || ((i11 == 12 || i4 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i11;
                            }
                            hashSet = hashSet3;
                            j6 = readInt * r6[readUnsignedShort3];
                            if (j6 < 0 || j6 > 2147483647L) {
                                if (z6) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z9 = false;
                                if (z9) {
                                    c4454f.j(j10);
                                } else {
                                    if (j6 > 4) {
                                        int readInt2 = c4454f.readInt();
                                        if (z6) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f37166c == 7) {
                                            if ("MakerNote".equals(c4452d.f37131b)) {
                                                this.i = readInt2;
                                            } else if (i10 == 6 && "ThumbnailImage".equals(c4452d.f37131b)) {
                                                this.f37172j = readInt2;
                                                this.f37173k = readInt;
                                                C4451c c9 = C4451c.c(6, this.f37169f);
                                                i6 = readUnsignedShort2;
                                                C4451c a9 = C4451c.a(this.f37172j, this.f37169f);
                                                i9 = readInt;
                                                C4451c a10 = C4451c.a(this.f37173k, this.f37169f);
                                                hashMapArr2[4].put("Compression", c9);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a9);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                                c4454f.j(readInt2);
                                            }
                                        }
                                        i6 = readUnsignedShort2;
                                        i9 = readInt;
                                        c4454f.j(readInt2);
                                    } else {
                                        hashSet2 = hashSet;
                                        i6 = readUnsignedShort2;
                                        i9 = readInt;
                                    }
                                    Integer num = (Integer) f37145K.get(Integer.valueOf(i6));
                                    if (z6) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j6);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j9 = c4454f.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = c4454f.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = c4454f.readInt();
                                            } else {
                                                j9 = -1;
                                            }
                                            if (z6) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j9), c4452d.f37131b));
                                            }
                                            if (j9 <= 0) {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j9))) {
                                                    c4454f.j(j9);
                                                    s(c4454f, num.intValue());
                                                } else if (z6) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j9 + ")");
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (z6) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j9);
                                                }
                                            }
                                            c4454f.j(j10);
                                        } else {
                                            readUnsignedShort = c4454f.readUnsignedShort();
                                        }
                                        j9 = readUnsignedShort;
                                        if (z6) {
                                        }
                                        if (j9 <= 0) {
                                        }
                                        c4454f.j(j10);
                                    } else {
                                        hashSet = hashSet2;
                                        int i12 = c4454f.f37124v + this.f37171h;
                                        byte[] bArr = new byte[(int) j6];
                                        c4454f.readFully(bArr);
                                        C4451c c4451c = new C4451c(i12, bArr, readUnsignedShort3, i9);
                                        hashMapArr2[i].put(c4452d.f37131b, c4451c);
                                        String str = c4452d.f37131b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f37166c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c4451c.f(this.f37169f).contains("PENTAX")) || ("Compression".equals(str) && c4451c.e(this.f37169f) == 65535)) {
                                            this.f37166c = 8;
                                        }
                                        if (c4454f.f37124v != j10) {
                                            c4454f.j(j10);
                                        }
                                    }
                                }
                                s11 = (short) (s10 + 1);
                                i10 = i;
                                hashSet3 = hashSet;
                                readShort = s9;
                                z10 = z6;
                            } else {
                                z9 = true;
                                if (z9) {
                                }
                                s11 = (short) (s10 + 1);
                                i10 = i;
                                hashSet3 = hashSet;
                                readShort = s9;
                                z10 = z6;
                            }
                        } else if (z6) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f37137B[readUnsignedShort3] + ") is unexpected for tag: " + c4452d.f37131b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z6) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j6 = 0;
                z9 = false;
                if (z9) {
                }
                s11 = (short) (s10 + 1);
                i10 = i;
                hashSet3 = hashSet;
                readShort = s9;
                z10 = z6;
            } else if (z6) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            hashSet = hashSet3;
            j6 = 0;
            z9 = false;
            if (z9) {
            }
            s11 = (short) (s10 + 1);
            i10 = i;
            hashSet3 = hashSet;
            readShort = s9;
            z10 = z6;
        }
        HashSet hashSet4 = hashSet3;
        boolean z11 = z10;
        int readInt3 = c4454f.readInt();
        if (z11) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j11 = readInt3;
        if (j11 <= 0) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        c4454f.j(j11);
        if (hashMapArr[4].isEmpty()) {
            s(c4454f, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c4454f, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f37167d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(C4450b c4450b) {
        C4451c c4451c;
        int e9;
        HashMap hashMap = this.f37167d[4];
        C4451c c4451c2 = (C4451c) hashMap.get("Compression");
        if (c4451c2 == null) {
            m(c4450b, hashMap);
            return;
        }
        int e10 = c4451c2.e(this.f37169f);
        if (e10 != 1) {
            if (e10 == 6) {
                m(c4450b, hashMap);
                return;
            } else if (e10 != 7) {
                return;
            }
        }
        C4451c c4451c3 = (C4451c) hashMap.get("BitsPerSample");
        if (c4451c3 != null) {
            int[] iArr = (int[]) c4451c3.g(this.f37169f);
            int[] iArr2 = f37150m;
            if (Arrays.equals(iArr2, iArr) || (this.f37166c == 3 && (c4451c = (C4451c) hashMap.get("PhotometricInterpretation")) != null && (((e9 = c4451c.e(this.f37169f)) == 1 && Arrays.equals(iArr, f37151n)) || (e9 == 6 && Arrays.equals(iArr, iArr2))))) {
                C4451c c4451c4 = (C4451c) hashMap.get("StripOffsets");
                C4451c c4451c5 = (C4451c) hashMap.get("StripByteCounts");
                if (c4451c4 == null || c4451c5 == null) {
                    return;
                }
                long[] e11 = t8.g.e(c4451c4.g(this.f37169f));
                long[] e12 = t8.g.e(c4451c5.g(this.f37169f));
                if (e11 == null || e11.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (e12 == null || e12.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (e11.length != e12.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j6 = 0;
                for (long j9 : e12) {
                    j6 += j9;
                }
                byte[] bArr = new byte[(int) j6];
                this.f37170g = true;
                int i = 0;
                int i4 = 0;
                for (int i6 = 0; i6 < e11.length; i6++) {
                    int i9 = (int) e11[i6];
                    int i10 = (int) e12[i6];
                    if (i6 < e11.length - 1 && i9 + i10 != e11[i6 + 1]) {
                        this.f37170g = false;
                    }
                    int i11 = i9 - i;
                    if (i11 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j10 = i11;
                    if (c4450b.skip(j10) != j10) {
                        Log.d("ExifInterface", "Failed to skip " + i11 + " bytes.");
                        return;
                    }
                    int i12 = i + i11;
                    byte[] bArr2 = new byte[i10];
                    if (c4450b.read(bArr2) != i10) {
                        Log.d("ExifInterface", "Failed to read " + i10 + " bytes.");
                        return;
                    }
                    i = i12 + i10;
                    System.arraycopy(bArr2, 0, bArr, i4, i10);
                    i4 += i10;
                }
                if (this.f37170g) {
                    long j11 = e11[0];
                    return;
                }
                return;
            }
        }
        if (f37149l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i4) {
        HashMap[] hashMapArr = this.f37167d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z6 = f37149l;
        if (isEmpty || hashMapArr[i4].isEmpty()) {
            if (z6) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C4451c c4451c = (C4451c) hashMapArr[i].get("ImageLength");
        C4451c c4451c2 = (C4451c) hashMapArr[i].get("ImageWidth");
        C4451c c4451c3 = (C4451c) hashMapArr[i4].get("ImageLength");
        C4451c c4451c4 = (C4451c) hashMapArr[i4].get("ImageWidth");
        if (c4451c == null || c4451c2 == null) {
            if (z6) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c4451c3 == null || c4451c4 == null) {
            if (z6) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e9 = c4451c.e(this.f37169f);
        int e10 = c4451c2.e(this.f37169f);
        int e11 = c4451c3.e(this.f37169f);
        int e12 = c4451c4.e(this.f37169f);
        if (e9 >= e11 || e10 >= e12) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i4];
        hashMapArr[i4] = hashMap;
    }

    public final void w(C4454f c4454f, int i) {
        C4451c c9;
        C4451c c10;
        HashMap[] hashMapArr = this.f37167d;
        C4451c c4451c = (C4451c) hashMapArr[i].get("DefaultCropSize");
        C4451c c4451c2 = (C4451c) hashMapArr[i].get("SensorTopBorder");
        C4451c c4451c3 = (C4451c) hashMapArr[i].get("SensorLeftBorder");
        C4451c c4451c4 = (C4451c) hashMapArr[i].get("SensorBottomBorder");
        C4451c c4451c5 = (C4451c) hashMapArr[i].get("SensorRightBorder");
        if (c4451c != null) {
            if (c4451c.f37126a == 5) {
                C4453e[] c4453eArr = (C4453e[]) c4451c.g(this.f37169f);
                if (c4453eArr == null || c4453eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c4453eArr));
                    return;
                }
                c9 = C4451c.b(c4453eArr[0], this.f37169f);
                c10 = C4451c.b(c4453eArr[1], this.f37169f);
            } else {
                int[] iArr = (int[]) c4451c.g(this.f37169f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c9 = C4451c.c(iArr[0], this.f37169f);
                c10 = C4451c.c(iArr[1], this.f37169f);
            }
            hashMapArr[i].put("ImageWidth", c9);
            hashMapArr[i].put("ImageLength", c10);
            return;
        }
        if (c4451c2 != null && c4451c3 != null && c4451c4 != null && c4451c5 != null) {
            int e9 = c4451c2.e(this.f37169f);
            int e10 = c4451c4.e(this.f37169f);
            int e11 = c4451c5.e(this.f37169f);
            int e12 = c4451c3.e(this.f37169f);
            if (e10 <= e9 || e11 <= e12) {
                return;
            }
            C4451c c11 = C4451c.c(e10 - e9, this.f37169f);
            C4451c c12 = C4451c.c(e11 - e12, this.f37169f);
            hashMapArr[i].put("ImageLength", c11);
            hashMapArr[i].put("ImageWidth", c12);
            return;
        }
        C4451c c4451c6 = (C4451c) hashMapArr[i].get("ImageLength");
        C4451c c4451c7 = (C4451c) hashMapArr[i].get("ImageWidth");
        if (c4451c6 == null || c4451c7 == null) {
            C4451c c4451c8 = (C4451c) hashMapArr[i].get("JPEGInterchangeFormat");
            C4451c c4451c9 = (C4451c) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c4451c8 == null || c4451c9 == null) {
                return;
            }
            int e13 = c4451c8.e(this.f37169f);
            int e14 = c4451c8.e(this.f37169f);
            c4454f.j(e13);
            byte[] bArr = new byte[e14];
            c4454f.read(bArr);
            e(new C4450b(bArr), e13, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f37167d;
        C4451c c4451c = (C4451c) hashMapArr[1].get("PixelXDimension");
        C4451c c4451c2 = (C4451c) hashMapArr[1].get("PixelYDimension");
        if (c4451c != null && c4451c2 != null) {
            hashMapArr[0].put("ImageWidth", c4451c);
            hashMapArr[0].put("ImageLength", c4451c2);
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
