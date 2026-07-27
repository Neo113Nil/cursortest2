package d0;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.google.android.gms.internal.ads.CL;
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
public final class C4452g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f37146A;

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f37147B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f37148C;

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f37149D;

    /* renamed from: E, reason: collision with root package name */
    public static final C4449d f37150E;

    /* renamed from: F, reason: collision with root package name */
    public static final C4449d[][] f37151F;

    /* renamed from: G, reason: collision with root package name */
    public static final C4449d[] f37152G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f37153H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f37154I;
    public static final HashSet J;

    /* renamed from: K, reason: collision with root package name */
    public static final HashMap f37155K;

    /* renamed from: L, reason: collision with root package name */
    public static final Charset f37156L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f37157M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f37158N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f37159l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f37160m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f37161n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f37162o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f37163p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f37164q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f37165r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f37166s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f37167t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f37168u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f37169v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f37170w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f37171x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f37172y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f37173z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f37174a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f37175b;

    /* renamed from: c, reason: collision with root package name */
    public int f37176c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f37177d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f37178e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f37179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37180g;

    /* renamed from: h, reason: collision with root package name */
    public int f37181h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f37182j;

    /* renamed from: k, reason: collision with root package name */
    public int f37183k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f37160m = new int[]{8, 8, 8};
        f37161n = new int[]{8};
        f37162o = new byte[]{-1, -40, -1};
        f37163p = new byte[]{102, 116, 121, 112};
        f37164q = new byte[]{109, 105, 102, 49};
        f37165r = new byte[]{104, 101, 105, 99};
        f37166s = new byte[]{79, 76, 89, 77, 80, 0};
        f37167t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f37168u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f37169v = new byte[]{101, 88, 73, 102};
        f37170w = new byte[]{73, 72, 68, 82};
        f37171x = new byte[]{73, 69, 78, 68};
        f37172y = new byte[]{82, 73, 70, 70};
        f37173z = new byte[]{87, 69, 66, 80};
        f37146A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f37147B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f37148C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f37149D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C4449d[] c4449dArr = {new C4449d("NewSubfileType", 254, 4), new C4449d("SubfileType", p.f8630b, 4), new C4449d(256, "ImageWidth", 3, 4), new C4449d(257, "ImageLength", 3, 4), new C4449d("BitsPerSample", 258, 3), new C4449d("Compression", 259, 3), new C4449d("PhotometricInterpretation", 262, 3), new C4449d("ImageDescription", 270, 2), new C4449d("Make", 271, 2), new C4449d("Model", 272, 2), new C4449d(273, "StripOffsets", 3, 4), new C4449d("Orientation", 274, 3), new C4449d("SamplesPerPixel", 277, 3), new C4449d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4449d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4449d("XResolution", 282, 5), new C4449d("YResolution", 283, 5), new C4449d("PlanarConfiguration", 284, 3), new C4449d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4449d("TransferFunction", BaseATView.a.f9932L, 3), new C4449d("Software", BaseATView.a.f9936P, 2), new C4449d("DateTime", 306, 2), new C4449d("Artist", 315, 2), new C4449d("WhitePoint", 318, 5), new C4449d("PrimaryChromaticities", 319, 5), new C4449d("SubIFDPointer", 330, 4), new C4449d("JPEGInterchangeFormat", 513, 4), new C4449d("JPEGInterchangeFormatLength", 514, 4), new C4449d("YCbCrCoefficients", 529, 5), new C4449d("YCbCrSubSampling", 530, 3), new C4449d("YCbCrPositioning", 531, 3), new C4449d("ReferenceBlackWhite", 532, 5), new C4449d("Copyright", 33432, 2), new C4449d("ExifIFDPointer", 34665, 4), new C4449d("GPSInfoIFDPointer", 34853, 4), new C4449d("SensorTopBorder", 4, 4), new C4449d("SensorLeftBorder", 5, 4), new C4449d("SensorBottomBorder", 6, 4), new C4449d("SensorRightBorder", 7, 4), new C4449d("ISO", 23, 3), new C4449d("JpgFromRaw", 46, 7), new C4449d("Xmp", com.anythink.core.common.m.a.f14558n, 1)};
        C4449d[] c4449dArr2 = {new C4449d("ExposureTime", 33434, 5), new C4449d("FNumber", 33437, 5), new C4449d("ExposureProgram", 34850, 3), new C4449d("SpectralSensitivity", 34852, 2), new C4449d("PhotographicSensitivity", 34855, 3), new C4449d("OECF", 34856, 7), new C4449d("SensitivityType", 34864, 3), new C4449d("StandardOutputSensitivity", 34865, 4), new C4449d("RecommendedExposureIndex", 34866, 4), new C4449d("ISOSpeed", 34867, 4), new C4449d("ISOSpeedLatitudeyyy", 34868, 4), new C4449d("ISOSpeedLatitudezzz", 34869, 4), new C4449d("ExifVersion", 36864, 2), new C4449d("DateTimeOriginal", 36867, 2), new C4449d("DateTimeDigitized", 36868, 2), new C4449d("OffsetTime", 36880, 2), new C4449d("OffsetTimeOriginal", 36881, 2), new C4449d("OffsetTimeDigitized", 36882, 2), new C4449d("ComponentsConfiguration", 37121, 7), new C4449d("CompressedBitsPerPixel", 37122, 5), new C4449d("ShutterSpeedValue", 37377, 10), new C4449d("ApertureValue", 37378, 5), new C4449d("BrightnessValue", 37379, 10), new C4449d("ExposureBiasValue", 37380, 10), new C4449d("MaxApertureValue", 37381, 5), new C4449d("SubjectDistance", 37382, 5), new C4449d("MeteringMode", 37383, 3), new C4449d("LightSource", 37384, 3), new C4449d("Flash", 37385, 3), new C4449d("FocalLength", 37386, 5), new C4449d("SubjectArea", 37396, 3), new C4449d("MakerNote", 37500, 7), new C4449d("UserComment", 37510, 7), new C4449d("SubSecTime", 37520, 2), new C4449d("SubSecTimeOriginal", 37521, 2), new C4449d("SubSecTimeDigitized", 37522, 2), new C4449d("FlashpixVersion", 40960, 7), new C4449d("ColorSpace", 40961, 3), new C4449d(40962, "PixelXDimension", 3, 4), new C4449d(40963, "PixelYDimension", 3, 4), new C4449d("RelatedSoundFile", 40964, 2), new C4449d("InteroperabilityIFDPointer", 40965, 4), new C4449d("FlashEnergy", 41483, 5), new C4449d("SpatialFrequencyResponse", 41484, 7), new C4449d("FocalPlaneXResolution", 41486, 5), new C4449d("FocalPlaneYResolution", 41487, 5), new C4449d("FocalPlaneResolutionUnit", 41488, 3), new C4449d("SubjectLocation", 41492, 3), new C4449d("ExposureIndex", 41493, 5), new C4449d("SensingMethod", 41495, 3), new C4449d("FileSource", 41728, 7), new C4449d("SceneType", 41729, 7), new C4449d("CFAPattern", 41730, 7), new C4449d("CustomRendered", 41985, 3), new C4449d("ExposureMode", 41986, 3), new C4449d("WhiteBalance", 41987, 3), new C4449d("DigitalZoomRatio", 41988, 5), new C4449d("FocalLengthIn35mmFilm", 41989, 3), new C4449d("SceneCaptureType", 41990, 3), new C4449d("GainControl", 41991, 3), new C4449d("Contrast", 41992, 3), new C4449d("Saturation", 41993, 3), new C4449d("Sharpness", 41994, 3), new C4449d("DeviceSettingDescription", 41995, 7), new C4449d("SubjectDistanceRange", 41996, 3), new C4449d("ImageUniqueID", 42016, 2), new C4449d("CameraOwnerName", 42032, 2), new C4449d("BodySerialNumber", 42033, 2), new C4449d("LensSpecification", 42034, 5), new C4449d("LensMake", 42035, 2), new C4449d("LensModel", 42036, 2), new C4449d("Gamma", 42240, 5), new C4449d("DNGVersion", 50706, 1), new C4449d(50720, "DefaultCropSize", 3, 4)};
        C4449d[] c4449dArr3 = {new C4449d("GPSVersionID", 0, 1), new C4449d("GPSLatitudeRef", 1, 2), new C4449d(2, "GPSLatitude", 5, 10), new C4449d("GPSLongitudeRef", 3, 2), new C4449d(4, "GPSLongitude", 5, 10), new C4449d("GPSAltitudeRef", 5, 1), new C4449d("GPSAltitude", 6, 5), new C4449d("GPSTimeStamp", 7, 5), new C4449d("GPSSatellites", 8, 2), new C4449d("GPSStatus", 9, 2), new C4449d("GPSMeasureMode", 10, 2), new C4449d("GPSDOP", 11, 5), new C4449d("GPSSpeedRef", 12, 2), new C4449d("GPSSpeed", 13, 5), new C4449d("GPSTrackRef", 14, 2), new C4449d("GPSTrack", 15, 5), new C4449d("GPSImgDirectionRef", 16, 2), new C4449d("GPSImgDirection", 17, 5), new C4449d("GPSMapDatum", 18, 2), new C4449d("GPSDestLatitudeRef", 19, 2), new C4449d("GPSDestLatitude", 20, 5), new C4449d("GPSDestLongitudeRef", 21, 2), new C4449d("GPSDestLongitude", 22, 5), new C4449d("GPSDestBearingRef", 23, 2), new C4449d("GPSDestBearing", 24, 5), new C4449d("GPSDestDistanceRef", 25, 2), new C4449d("GPSDestDistance", 26, 5), new C4449d("GPSProcessingMethod", 27, 7), new C4449d("GPSAreaInformation", 28, 7), new C4449d("GPSDateStamp", 29, 2), new C4449d("GPSDifferential", 30, 3), new C4449d("GPSHPositioningError", 31, 5)};
        C4449d[] c4449dArr4 = {new C4449d("InteroperabilityIndex", 1, 2)};
        C4449d[] c4449dArr5 = {new C4449d("NewSubfileType", 254, 4), new C4449d("SubfileType", p.f8630b, 4), new C4449d(256, "ThumbnailImageWidth", 3, 4), new C4449d(257, "ThumbnailImageLength", 3, 4), new C4449d("BitsPerSample", 258, 3), new C4449d("Compression", 259, 3), new C4449d("PhotometricInterpretation", 262, 3), new C4449d("ImageDescription", 270, 2), new C4449d("Make", 271, 2), new C4449d("Model", 272, 2), new C4449d(273, "StripOffsets", 3, 4), new C4449d("ThumbnailOrientation", 274, 3), new C4449d("SamplesPerPixel", 277, 3), new C4449d(com.anythink.expressad.foundation.g.a.aW, "RowsPerStrip", 3, 4), new C4449d(com.anythink.expressad.foundation.g.a.aX, "StripByteCounts", 3, 4), new C4449d("XResolution", 282, 5), new C4449d("YResolution", 283, 5), new C4449d("PlanarConfiguration", 284, 3), new C4449d("ResolutionUnit", com.anythink.expressad.foundation.g.a.aT, 3), new C4449d("TransferFunction", BaseATView.a.f9932L, 3), new C4449d("Software", BaseATView.a.f9936P, 2), new C4449d("DateTime", 306, 2), new C4449d("Artist", 315, 2), new C4449d("WhitePoint", 318, 5), new C4449d("PrimaryChromaticities", 319, 5), new C4449d("SubIFDPointer", 330, 4), new C4449d("JPEGInterchangeFormat", 513, 4), new C4449d("JPEGInterchangeFormatLength", 514, 4), new C4449d("YCbCrCoefficients", 529, 5), new C4449d("YCbCrSubSampling", 530, 3), new C4449d("YCbCrPositioning", 531, 3), new C4449d("ReferenceBlackWhite", 532, 5), new C4449d("Copyright", 33432, 2), new C4449d("ExifIFDPointer", 34665, 4), new C4449d("GPSInfoIFDPointer", 34853, 4), new C4449d("DNGVersion", 50706, 1), new C4449d(50720, "DefaultCropSize", 3, 4)};
        f37150E = new C4449d("StripOffsets", 273, 3);
        f37151F = new C4449d[][]{c4449dArr, c4449dArr2, c4449dArr3, c4449dArr4, c4449dArr5, c4449dArr, new C4449d[]{new C4449d("ThumbnailImage", 256, 7), new C4449d("CameraSettingsIFDPointer", 8224, 4), new C4449d("ImageProcessingIFDPointer", 8256, 4)}, new C4449d[]{new C4449d("PreviewImageStart", 257, 4), new C4449d("PreviewImageLength", 258, 4)}, new C4449d[]{new C4449d("AspectFrame", 4371, 3)}, new C4449d[]{new C4449d("ColorSpace", 55, 3)}};
        f37152G = new C4449d[]{new C4449d("SubIFDPointer", 330, 4), new C4449d("ExifIFDPointer", 34665, 4), new C4449d("GPSInfoIFDPointer", 34853, 4), new C4449d("InteroperabilityIFDPointer", 40965, 4), new C4449d("CameraSettingsIFDPointer", 8224, 1), new C4449d("ImageProcessingIFDPointer", 8256, 1)};
        f37153H = new HashMap[10];
        f37154I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f37155K = new HashMap();
        Charset forName = Charset.forName(com.anythink.basead.exoplayer.b.i);
        f37156L = forName;
        f37157M = "Exif\u0000\u0000".getBytes(forName);
        f37158N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C4449d[][] c4449dArr6 = f37151F;
            if (i >= c4449dArr6.length) {
                HashMap hashMap = f37155K;
                C4449d[] c4449dArr7 = f37152G;
                hashMap.put(Integer.valueOf(c4449dArr7[0].f37140a), 5);
                hashMap.put(Integer.valueOf(c4449dArr7[1].f37140a), 1);
                hashMap.put(Integer.valueOf(c4449dArr7[2].f37140a), 2);
                hashMap.put(Integer.valueOf(c4449dArr7[3].f37140a), 3);
                hashMap.put(Integer.valueOf(c4449dArr7[4].f37140a), 7);
                hashMap.put(Integer.valueOf(c4449dArr7[5].f37140a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f37153H[i] = new HashMap();
            f37154I[i] = new HashMap();
            for (C4449d c4449d : c4449dArr6[i]) {
                f37153H[i].put(Integer.valueOf(c4449d.f37140a), c4449d);
                f37154I[i].put(c4449d.f37141b, c4449d);
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
    public C4452g(InputStream inputStream) {
        C4449d[][] c4449dArr = f37151F;
        this.f37177d = new HashMap[c4449dArr.length];
        this.f37178e = new HashSet(c4449dArr.length);
        this.f37179f = ByteOrder.BIG_ENDIAN;
        boolean z8 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z9 = f37159l;
        if (z8) {
            this.f37175b = (AssetManager.AssetInputStream) inputStream;
            this.f37174a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    AbstractC4453h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f37175b = null;
                    this.f37174a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z9) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.f37175b = null;
            this.f37174a = null;
        }
        for (int i = 0; i < c4449dArr.length; i++) {
            try {
                try {
                    this.f37177d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z9) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z9) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e9) {
                e = e9;
                if (z9) {
                }
                a();
                if (!z9) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int f6 = f(bufferedInputStream);
        this.f37176c = f6;
        if (f6 != 4 && f6 != 9 && f6 != 13 && f6 != 14) {
            C4451f c4451f = new C4451f(bufferedInputStream);
            int i4 = this.f37176c;
            if (i4 == 12) {
                d(c4451f);
            } else if (i4 == 7) {
                g(c4451f);
            } else if (i4 == 10) {
                k(c4451f);
            } else {
                j(c4451f);
            }
            c4451f.g(this.f37181h);
            u(c4451f);
            a();
            if (!z9) {
                return;
            }
            p();
        }
        C4447b c4447b = new C4447b(bufferedInputStream);
        int i9 = this.f37176c;
        if (i9 == 4) {
            e(c4447b, 0, 0);
        } else if (i9 == 13) {
            h(c4447b);
        } else if (i9 == 9) {
            i(c4447b);
        } else if (i9 == 14) {
            l(c4447b);
        }
        a();
        if (!z9) {
        }
        p();
    }

    public static ByteOrder q(C4447b c4447b) {
        short readShort = c4447b.readShort();
        boolean z8 = f37159l;
        if (readShort == 18761) {
            if (z8) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z8) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b9 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f37177d;
        if (b9 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b9.concat("\u0000").getBytes(f37156L);
            hashMap.put("DateTime", new C4448c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C4448c.a(0L, this.f37179f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C4448c.a(0L, this.f37179f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", C4448c.a(0L, this.f37179f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", C4448c.a(0L, this.f37179f));
        }
    }

    public final String b(String str) {
        C4448c c4 = c(str);
        if (c4 != null) {
            if (!J.contains(str)) {
                return c4.f(this.f37179f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = c4.f37136a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                C4450e[] c4450eArr = (C4450e[]) c4.g(this.f37179f);
                if (c4450eArr == null || c4450eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c4450eArr));
                    return null;
                }
                C4450e c4450e = c4450eArr[0];
                Integer valueOf = Integer.valueOf((int) (c4450e.f37144a / c4450e.f37145b));
                C4450e c4450e2 = c4450eArr[1];
                Integer valueOf2 = Integer.valueOf((int) (c4450e2.f37144a / c4450e2.f37145b));
                C4450e c4450e3 = c4450eArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c4450e3.f37144a / c4450e3.f37145b)));
            }
            try {
                return Double.toString(c4.d(this.f37179f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C4448c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f37159l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f37151F.length; i++) {
            C4448c c4448c = (C4448c) this.f37177d[i].get(str);
            if (c4448c != null) {
                return c4448c;
            }
        }
        return null;
    }

    public final void d(C4451f c4451f) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC4454i.a(mediaMetadataRetriever, new C4446a(c4451f));
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
                HashMap[] hashMapArr = this.f37177d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C4448c.c(Integer.parseInt(str), this.f37179f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", C4448c.c(Integer.parseInt(str2), this.f37179f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", C4448c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f37179f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c4451f.g(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c4451f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f37157M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    if (c4451f.read(bArr2) != i4) {
                        throw new IOException("Can't read exif");
                    }
                    this.f37181h = i;
                    r(0, bArr2);
                }
                if (f37159l) {
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
    
        r23.f37133u = r22.f37179f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C4447b c4447b, int i, int i4) {
        boolean z8 = f37159l;
        if (z8) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c4447b);
        }
        c4447b.f37133u = ByteOrder.BIG_ENDIAN;
        byte readByte = c4447b.readByte();
        byte b9 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (c4447b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i9 = 2;
        int i10 = 2;
        while (true) {
            byte readByte2 = c4447b.readByte();
            if (readByte2 != b9) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = c4447b.readByte();
            if (z8) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = c4447b.readUnsignedShort();
                int i11 = readUnsignedShort - 2;
                int i12 = i10 + 4;
                if (z8) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap[] hashMapArr = this.f37177d;
                int i13 = 0;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i11];
                    c4447b.readFully(bArr);
                    int i14 = i12 + i11;
                    byte[] bArr2 = f37157M;
                    if (bArr2 != null && i11 >= bArr2.length) {
                        int i15 = 0;
                        while (i15 < bArr2.length) {
                            if (bArr[i15] == bArr2[i15]) {
                                i15++;
                                i13 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i11);
                        this.f37181h = i + i12 + bArr2.length;
                        r(i4, copyOfRange);
                        u(new C4447b(copyOfRange));
                        i12 = i14;
                        i11 = 0;
                    }
                    byte[] bArr3 = f37158N;
                    if (bArr3 != null && i11 >= bArr3.length) {
                        int i16 = i13;
                        while (true) {
                            if (i16 >= bArr3.length) {
                                int length = i12 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i11);
                                if (b("Xmp") == null) {
                                    hashMapArr[i13].put("Xmp", new C4448c(length, copyOfRange2, 1, copyOfRange2.length));
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
                                            c4447b.a(1);
                                            hashMapArr[i4].put(i4 != 4 ? "ImageLength" : "ThumbnailImageLength", C4448c.a(c4447b.readUnsignedShort(), this.f37179f));
                                            hashMapArr[i4].put(i4 != 4 ? "ImageWidth" : "ThumbnailImageWidth", C4448c.a(c4447b.readUnsignedShort(), this.f37179f));
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
                    if (c4447b.read(bArr4) != i11) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = f37156L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new C4448c(bytes, i9, bytes.length));
                    }
                    i11 = 0;
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                c4447b.a(i11);
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
        C4447b c4447b;
        int i4;
        int i9;
        int i10;
        int i11;
        long readInt;
        byte[] bArr;
        long j9;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i12 = 0;
        while (true) {
            byte[] bArr3 = f37162o;
            if (i12 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i12] != bArr3[i12]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i13 = 0; i13 < bytes.length; i13++) {
                    if (bArr2[i13] != bytes[i13]) {
                        C4447b c4447b2 = null;
                        try {
                            c4447b = new C4447b(bArr2);
                            try {
                                try {
                                    readInt = c4447b.readInt();
                                    bArr = new byte[4];
                                    c4447b.read(bArr);
                                } catch (Exception e6) {
                                    e = e6;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                c4447b2 = c4447b;
                                if (c4447b2 != null) {
                                    c4447b2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            i = 0;
                            c4447b = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, f37163p)) {
                            if (readInt == 1) {
                                readInt = c4447b.readLong();
                                j9 = 16;
                            } else {
                                j9 = 8;
                            }
                            i = 0;
                            long j10 = 5000;
                            if (readInt > j10) {
                                readInt = j10;
                            }
                            long j11 = readInt - j9;
                            if (j11 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    for (long j12 = 0; j12 < j11 / 4 && c4447b.read(bArr4) == 4; j12++) {
                                        if (j12 != 1) {
                                            if (Arrays.equals(bArr4, f37164q)) {
                                                z8 = true;
                                            } else if (Arrays.equals(bArr4, f37165r)) {
                                                z9 = true;
                                            }
                                            if (z8 && z9) {
                                                c4447b.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (f37159l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            c4447b.close();
                            C4447b c4447b3 = new C4447b(bArr2);
                            ByteOrder q6 = q(c4447b3);
                            this.f37179f = q6;
                            c4447b3.f37133u = q6;
                            short readShort = c4447b3.readShort();
                            i4 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                            c4447b3.close();
                            if (i4 != 0) {
                                return 7;
                            }
                            try {
                                C4447b c4447b4 = new C4447b(bArr2);
                                try {
                                    ByteOrder q9 = q(c4447b4);
                                    this.f37179f = q9;
                                    c4447b4.f37133u = q9;
                                    i9 = c4447b4.readShort() == 85 ? 1 : i;
                                    c4447b4.close();
                                } catch (Exception unused) {
                                    c4447b2 = c4447b4;
                                    if (c4447b2 != null) {
                                        c4447b2.close();
                                    }
                                    i9 = i;
                                    if (i9 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4447b2 = c4447b4;
                                    if (c4447b2 != null) {
                                        c4447b2.close();
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
                                byte[] bArr5 = f37168u;
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
                                byte[] bArr6 = f37172y;
                                if (i15 >= bArr6.length) {
                                    int i16 = i;
                                    while (true) {
                                        byte[] bArr7 = f37173z;
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
                        c4447b.close();
                        i = 0;
                        C4447b c4447b32 = new C4447b(bArr2);
                        ByteOrder q62 = q(c4447b32);
                        this.f37179f = q62;
                        c4447b32.f37133u = q62;
                        short readShort2 = c4447b32.readShort();
                        if (readShort2 != 20306) {
                        }
                        c4447b32.close();
                        if (i4 != 0) {
                        }
                    }
                }
                return 9;
            }
            i12++;
        }
    }

    public final void g(C4451f c4451f) {
        int i;
        int i4;
        j(c4451f);
        HashMap[] hashMapArr = this.f37177d;
        C4448c c4448c = (C4448c) hashMapArr[1].get("MakerNote");
        if (c4448c != null) {
            C4451f c4451f2 = new C4451f(c4448c.f37139d);
            c4451f2.f37133u = this.f37179f;
            byte[] bArr = f37166s;
            byte[] bArr2 = new byte[bArr.length];
            c4451f2.readFully(bArr2);
            c4451f2.g(0L);
            byte[] bArr3 = f37167t;
            byte[] bArr4 = new byte[bArr3.length];
            c4451f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c4451f2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c4451f2.g(12L);
            }
            s(c4451f2, 6);
            C4448c c4448c2 = (C4448c) hashMapArr[7].get("PreviewImageStart");
            C4448c c4448c3 = (C4448c) hashMapArr[7].get("PreviewImageLength");
            if (c4448c2 != null && c4448c3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c4448c2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c4448c3);
            }
            C4448c c4448c4 = (C4448c) hashMapArr[8].get("AspectFrame");
            if (c4448c4 != null) {
                int[] iArr = (int[]) c4448c4.g(this.f37179f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i9 = iArr[2];
                int i10 = iArr[0];
                if (i9 <= i10 || (i = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i11 = (i9 - i10) + 1;
                int i12 = (i - i4) + 1;
                if (i11 < i12) {
                    int i13 = i11 + i12;
                    i12 = i13 - i12;
                    i11 = i13 - i12;
                }
                C4448c c4 = C4448c.c(i11, this.f37179f);
                C4448c c9 = C4448c.c(i12, this.f37179f);
                hashMapArr[0].put("ImageWidth", c4);
                hashMapArr[0].put("ImageLength", c9);
            }
        }
    }

    public final void h(C4447b c4447b) {
        if (f37159l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c4447b);
        }
        c4447b.f37133u = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f37168u;
        c4447b.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c4447b.readInt();
                byte[] bArr2 = new byte[4];
                if (c4447b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, f37170w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f37171x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f37169v)) {
                    byte[] bArr3 = new byte[readInt];
                    if (c4447b.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + S0.f.c(bArr2));
                    }
                    int readInt2 = c4447b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f37181h = i;
                        r(0, bArr3);
                        x();
                        u(new C4447b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = readInt + 4;
                c4447b.a(i4);
                length = i + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C4447b c4447b) {
        boolean z8 = f37159l;
        if (z8) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c4447b);
        }
        c4447b.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c4447b.read(bArr);
        c4447b.read(bArr2);
        c4447b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i9 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        c4447b.a(i - c4447b.f37134v);
        c4447b.read(bArr4);
        e(new C4447b(bArr4), i, 5);
        c4447b.a(i9 - c4447b.f37134v);
        c4447b.f37133u = ByteOrder.BIG_ENDIAN;
        int readInt = c4447b.readInt();
        if (z8) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = c4447b.readUnsignedShort();
            int readUnsignedShort2 = c4447b.readUnsignedShort();
            if (readUnsignedShort == f37150E.f37140a) {
                short readShort = c4447b.readShort();
                short readShort2 = c4447b.readShort();
                C4448c c4 = C4448c.c(readShort, this.f37179f);
                C4448c c9 = C4448c.c(readShort2, this.f37179f);
                HashMap[] hashMapArr = this.f37177d;
                hashMapArr[0].put("ImageLength", c4);
                hashMapArr[0].put("ImageWidth", c9);
                if (z8) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c4447b.a(readUnsignedShort2);
        }
    }

    public final void j(C4451f c4451f) {
        o(c4451f);
        s(c4451f, 0);
        w(c4451f, 0);
        w(c4451f, 5);
        w(c4451f, 4);
        x();
        if (this.f37176c == 8) {
            HashMap[] hashMapArr = this.f37177d;
            C4448c c4448c = (C4448c) hashMapArr[1].get("MakerNote");
            if (c4448c != null) {
                C4451f c4451f2 = new C4451f(c4448c.f37139d);
                c4451f2.f37133u = this.f37179f;
                c4451f2.a(6);
                s(c4451f2, 9);
                C4448c c4448c2 = (C4448c) hashMapArr[9].get("ColorSpace");
                if (c4448c2 != null) {
                    hashMapArr[1].put("ColorSpace", c4448c2);
                }
            }
        }
    }

    public final void k(C4451f c4451f) {
        if (f37159l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c4451f);
        }
        j(c4451f);
        HashMap[] hashMapArr = this.f37177d;
        C4448c c4448c = (C4448c) hashMapArr[0].get("JpgFromRaw");
        if (c4448c != null) {
            e(new C4447b(c4448c.f37139d), (int) c4448c.f37138c, 5);
        }
        C4448c c4448c2 = (C4448c) hashMapArr[0].get("ISO");
        C4448c c4448c3 = (C4448c) hashMapArr[1].get("PhotographicSensitivity");
        if (c4448c2 == null || c4448c3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c4448c2);
    }

    public final void l(C4447b c4447b) {
        if (f37159l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c4447b);
        }
        c4447b.f37133u = ByteOrder.LITTLE_ENDIAN;
        c4447b.a(f37172y.length);
        int readInt = c4447b.readInt() + 8;
        byte[] bArr = f37173z;
        c4447b.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c4447b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c4447b.readInt();
                int i = length + 8;
                if (Arrays.equals(f37146A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (c4447b.read(bArr3) == readInt2) {
                        this.f37181h = i;
                        r(0, bArr3);
                        u(new C4447b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + S0.f.c(bArr2));
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
                c4447b.a(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(C4447b c4447b, HashMap hashMap) {
        C4448c c4448c = (C4448c) hashMap.get("JPEGInterchangeFormat");
        C4448c c4448c2 = (C4448c) hashMap.get("JPEGInterchangeFormatLength");
        if (c4448c == null || c4448c2 == null) {
            return;
        }
        int e6 = c4448c.e(this.f37179f);
        int e9 = c4448c2.e(this.f37179f);
        if (this.f37176c == 7) {
            e6 += this.i;
        }
        if (e6 > 0 && e9 > 0 && this.f37175b == null && this.f37174a == null) {
            c4447b.skip(e6);
            c4447b.read(new byte[e9]);
        }
        if (f37159l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e6 + ", length: " + e9);
        }
    }

    public final boolean n(HashMap hashMap) {
        C4448c c4448c = (C4448c) hashMap.get("ImageLength");
        C4448c c4448c2 = (C4448c) hashMap.get("ImageWidth");
        if (c4448c == null || c4448c2 == null) {
            return false;
        }
        return c4448c.e(this.f37179f) <= 512 && c4448c2.e(this.f37179f) <= 512;
    }

    public final void o(C4451f c4451f) {
        ByteOrder q6 = q(c4451f);
        this.f37179f = q6;
        c4451f.f37133u = q6;
        int readUnsignedShort = c4451f.readUnsignedShort();
        int i = this.f37176c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c4451f.readInt();
        if (readInt < 8) {
            throw new IOException(CL.i(readInt, "Invalid first Ifd offset: "));
        }
        int i4 = readInt - 8;
        if (i4 > 0) {
            c4451f.a(i4);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f37177d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder l9 = CL.l(i, "The size of tag group[", "]: ");
            l9.append(hashMapArr[i].size());
            Log.d("ExifInterface", l9.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C4448c c4448c = (C4448c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c4448c.toString() + ", tagValue: '" + c4448c.f(this.f37179f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) {
        C4451f c4451f = new C4451f(bArr);
        o(c4451f);
        s(c4451f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C4451f c4451f, int i) {
        HashMap[] hashMapArr;
        short s3;
        boolean z8;
        short s6;
        HashMap[] hashMapArr2;
        HashSet hashSet;
        long j9;
        boolean z9;
        int i4;
        HashSet hashSet2;
        int i9;
        int i10;
        int readUnsignedShort;
        long j10;
        int i11 = i;
        Integer valueOf = Integer.valueOf(c4451f.f37134v);
        HashSet hashSet3 = this.f37178e;
        hashSet3.add(valueOf);
        short readShort = c4451f.readShort();
        boolean z10 = f37159l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s9 = 0;
        while (true) {
            hashMapArr = this.f37177d;
            if (s9 >= readShort) {
                break;
            }
            int readUnsignedShort2 = c4451f.readUnsignedShort();
            int readUnsignedShort3 = c4451f.readUnsignedShort();
            int readInt = c4451f.readInt();
            long j11 = c4451f.f37134v + 4;
            C4449d c4449d = (C4449d) f37153H[i11].get(Integer.valueOf(readUnsignedShort2));
            if (z10) {
                s3 = readShort;
                z8 = z10;
                s6 = s9;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i11), Integer.valueOf(readUnsignedShort2), c4449d != null ? c4449d.f37141b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s3 = readShort;
                z8 = z10;
                s6 = s9;
                hashMapArr2 = hashMapArr;
            }
            if (c4449d != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f37148C.length) {
                        int i12 = c4449d.f37142c;
                        if (i12 == 7 || readUnsignedShort3 == 7 || i12 == readUnsignedShort3 || (i4 = c4449d.f37143d) == readUnsignedShort3 || (((i12 == 4 || i4 == 4) && readUnsignedShort3 == 3) || (((i12 == 9 || i4 == 9) && readUnsignedShort3 == 8) || ((i12 == 12 || i4 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i12;
                            }
                            hashSet = hashSet3;
                            j9 = readInt * r6[readUnsignedShort3];
                            if (j9 < 0 || j9 > 2147483647L) {
                                if (z8) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z9 = false;
                                if (z9) {
                                    c4451f.g(j11);
                                } else {
                                    if (j9 > 4) {
                                        int readInt2 = c4451f.readInt();
                                        if (z8) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f37176c == 7) {
                                            if ("MakerNote".equals(c4449d.f37141b)) {
                                                this.i = readInt2;
                                            } else if (i11 == 6 && "ThumbnailImage".equals(c4449d.f37141b)) {
                                                this.f37182j = readInt2;
                                                this.f37183k = readInt;
                                                C4448c c4 = C4448c.c(6, this.f37179f);
                                                i9 = readUnsignedShort2;
                                                C4448c a9 = C4448c.a(this.f37182j, this.f37179f);
                                                i10 = readInt;
                                                C4448c a10 = C4448c.a(this.f37183k, this.f37179f);
                                                hashMapArr2[4].put("Compression", c4);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a9);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                                c4451f.g(readInt2);
                                            }
                                        }
                                        i9 = readUnsignedShort2;
                                        i10 = readInt;
                                        c4451f.g(readInt2);
                                    } else {
                                        hashSet2 = hashSet;
                                        i9 = readUnsignedShort2;
                                        i10 = readInt;
                                    }
                                    Integer num = (Integer) f37155K.get(Integer.valueOf(i9));
                                    if (z8) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j9);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j10 = c4451f.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = c4451f.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = c4451f.readInt();
                                            } else {
                                                j10 = -1;
                                            }
                                            if (z8) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j10), c4449d.f37141b));
                                            }
                                            if (j10 <= 0) {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j10))) {
                                                    c4451f.g(j10);
                                                    s(c4451f, num.intValue());
                                                } else if (z8) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j10 + ")");
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (z8) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j10);
                                                }
                                            }
                                            c4451f.g(j11);
                                        } else {
                                            readUnsignedShort = c4451f.readUnsignedShort();
                                        }
                                        j10 = readUnsignedShort;
                                        if (z8) {
                                        }
                                        if (j10 <= 0) {
                                        }
                                        c4451f.g(j11);
                                    } else {
                                        hashSet = hashSet2;
                                        int i13 = c4451f.f37134v + this.f37181h;
                                        byte[] bArr = new byte[(int) j9];
                                        c4451f.readFully(bArr);
                                        C4448c c4448c = new C4448c(i13, bArr, readUnsignedShort3, i10);
                                        hashMapArr2[i].put(c4449d.f37141b, c4448c);
                                        String str = c4449d.f37141b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f37176c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && c4448c.f(this.f37179f).contains("PENTAX")) || ("Compression".equals(str) && c4448c.e(this.f37179f) == 65535)) {
                                            this.f37176c = 8;
                                        }
                                        if (c4451f.f37134v != j11) {
                                            c4451f.g(j11);
                                        }
                                    }
                                }
                                s9 = (short) (s6 + 1);
                                i11 = i;
                                hashSet3 = hashSet;
                                readShort = s3;
                                z10 = z8;
                            } else {
                                z9 = true;
                                if (z9) {
                                }
                                s9 = (short) (s6 + 1);
                                i11 = i;
                                hashSet3 = hashSet;
                                readShort = s3;
                                z10 = z8;
                            }
                        } else if (z8) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f37147B[readUnsignedShort3] + ") is unexpected for tag: " + c4449d.f37141b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z8) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j9 = 0;
                z9 = false;
                if (z9) {
                }
                s9 = (short) (s6 + 1);
                i11 = i;
                hashSet3 = hashSet;
                readShort = s3;
                z10 = z8;
            } else if (z8) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            hashSet = hashSet3;
            j9 = 0;
            z9 = false;
            if (z9) {
            }
            s9 = (short) (s6 + 1);
            i11 = i;
            hashSet3 = hashSet;
            readShort = s3;
            z10 = z8;
        }
        HashSet hashSet4 = hashSet3;
        boolean z11 = z10;
        int readInt3 = c4451f.readInt();
        if (z11) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j12 = readInt3;
        if (j12 <= 0) {
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
        c4451f.g(j12);
        if (hashMapArr[4].isEmpty()) {
            s(c4451f, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(c4451f, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f37177d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void u(C4447b c4447b) {
        C4448c c4448c;
        int e6;
        HashMap hashMap = this.f37177d[4];
        C4448c c4448c2 = (C4448c) hashMap.get("Compression");
        if (c4448c2 == null) {
            m(c4447b, hashMap);
            return;
        }
        int e9 = c4448c2.e(this.f37179f);
        if (e9 != 1) {
            if (e9 == 6) {
                m(c4447b, hashMap);
                return;
            } else if (e9 != 7) {
                return;
            }
        }
        C4448c c4448c3 = (C4448c) hashMap.get("BitsPerSample");
        if (c4448c3 != null) {
            int[] iArr = (int[]) c4448c3.g(this.f37179f);
            int[] iArr2 = f37160m;
            if (Arrays.equals(iArr2, iArr) || (this.f37176c == 3 && (c4448c = (C4448c) hashMap.get("PhotometricInterpretation")) != null && (((e6 = c4448c.e(this.f37179f)) == 1 && Arrays.equals(iArr, f37161n)) || (e6 == 6 && Arrays.equals(iArr, iArr2))))) {
                C4448c c4448c4 = (C4448c) hashMap.get("StripOffsets");
                C4448c c4448c5 = (C4448c) hashMap.get("StripByteCounts");
                if (c4448c4 == null || c4448c5 == null) {
                    return;
                }
                long[] g9 = S0.f.g(c4448c4.g(this.f37179f));
                long[] g10 = S0.f.g(c4448c5.g(this.f37179f));
                if (g9 == null || g9.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (g10 == null || g10.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (g9.length != g10.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j9 = 0;
                for (long j10 : g10) {
                    j9 += j10;
                }
                byte[] bArr = new byte[(int) j9];
                this.f37180g = true;
                int i = 0;
                int i4 = 0;
                for (int i9 = 0; i9 < g9.length; i9++) {
                    int i10 = (int) g9[i9];
                    int i11 = (int) g10[i9];
                    if (i9 < g9.length - 1 && i10 + i11 != g9[i9 + 1]) {
                        this.f37180g = false;
                    }
                    int i12 = i10 - i;
                    if (i12 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j11 = i12;
                    if (c4447b.skip(j11) != j11) {
                        Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                    int i13 = i + i12;
                    byte[] bArr2 = new byte[i11];
                    if (c4447b.read(bArr2) != i11) {
                        Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                        return;
                    }
                    i = i13 + i11;
                    System.arraycopy(bArr2, 0, bArr, i4, i11);
                    i4 += i11;
                }
                if (this.f37180g) {
                    long j12 = g9[0];
                    return;
                }
                return;
            }
        }
        if (f37159l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i4) {
        HashMap[] hashMapArr = this.f37177d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z8 = f37159l;
        if (isEmpty || hashMapArr[i4].isEmpty()) {
            if (z8) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C4448c c4448c = (C4448c) hashMapArr[i].get("ImageLength");
        C4448c c4448c2 = (C4448c) hashMapArr[i].get("ImageWidth");
        C4448c c4448c3 = (C4448c) hashMapArr[i4].get("ImageLength");
        C4448c c4448c4 = (C4448c) hashMapArr[i4].get("ImageWidth");
        if (c4448c == null || c4448c2 == null) {
            if (z8) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c4448c3 == null || c4448c4 == null) {
            if (z8) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e6 = c4448c.e(this.f37179f);
        int e9 = c4448c2.e(this.f37179f);
        int e10 = c4448c3.e(this.f37179f);
        int e11 = c4448c4.e(this.f37179f);
        if (e6 >= e10 || e9 >= e11) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i4];
        hashMapArr[i4] = hashMap;
    }

    public final void w(C4451f c4451f, int i) {
        C4448c c4;
        C4448c c9;
        HashMap[] hashMapArr = this.f37177d;
        C4448c c4448c = (C4448c) hashMapArr[i].get("DefaultCropSize");
        C4448c c4448c2 = (C4448c) hashMapArr[i].get("SensorTopBorder");
        C4448c c4448c3 = (C4448c) hashMapArr[i].get("SensorLeftBorder");
        C4448c c4448c4 = (C4448c) hashMapArr[i].get("SensorBottomBorder");
        C4448c c4448c5 = (C4448c) hashMapArr[i].get("SensorRightBorder");
        if (c4448c != null) {
            if (c4448c.f37136a == 5) {
                C4450e[] c4450eArr = (C4450e[]) c4448c.g(this.f37179f);
                if (c4450eArr == null || c4450eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c4450eArr));
                    return;
                }
                c4 = C4448c.b(c4450eArr[0], this.f37179f);
                c9 = C4448c.b(c4450eArr[1], this.f37179f);
            } else {
                int[] iArr = (int[]) c4448c.g(this.f37179f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c4 = C4448c.c(iArr[0], this.f37179f);
                c9 = C4448c.c(iArr[1], this.f37179f);
            }
            hashMapArr[i].put("ImageWidth", c4);
            hashMapArr[i].put("ImageLength", c9);
            return;
        }
        if (c4448c2 != null && c4448c3 != null && c4448c4 != null && c4448c5 != null) {
            int e6 = c4448c2.e(this.f37179f);
            int e9 = c4448c4.e(this.f37179f);
            int e10 = c4448c5.e(this.f37179f);
            int e11 = c4448c3.e(this.f37179f);
            if (e9 <= e6 || e10 <= e11) {
                return;
            }
            C4448c c10 = C4448c.c(e9 - e6, this.f37179f);
            C4448c c11 = C4448c.c(e10 - e11, this.f37179f);
            hashMapArr[i].put("ImageLength", c10);
            hashMapArr[i].put("ImageWidth", c11);
            return;
        }
        C4448c c4448c6 = (C4448c) hashMapArr[i].get("ImageLength");
        C4448c c4448c7 = (C4448c) hashMapArr[i].get("ImageWidth");
        if (c4448c6 == null || c4448c7 == null) {
            C4448c c4448c8 = (C4448c) hashMapArr[i].get("JPEGInterchangeFormat");
            C4448c c4448c9 = (C4448c) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (c4448c8 == null || c4448c9 == null) {
                return;
            }
            int e12 = c4448c8.e(this.f37179f);
            int e13 = c4448c8.e(this.f37179f);
            c4451f.g(e12);
            byte[] bArr = new byte[e13];
            c4451f.read(bArr);
            e(new C4447b(bArr), e12, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f37177d;
        C4448c c4448c = (C4448c) hashMapArr[1].get("PixelXDimension");
        C4448c c4448c2 = (C4448c) hashMapArr[1].get("PixelYDimension");
        if (c4448c != null && c4448c2 != null) {
            hashMapArr[0].put("ImageWidth", c4448c);
            hashMapArr[0].put("ImageLength", c4448c2);
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
