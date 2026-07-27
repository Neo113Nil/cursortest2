package H;

import E0.h;
import a.AbstractC0069a;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f357A;

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f358B;

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f359C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f360D;

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f361E;

    /* renamed from: F, reason: collision with root package name */
    public static final d f362F;

    /* renamed from: G, reason: collision with root package name */
    public static final d[][] f363G;

    /* renamed from: H, reason: collision with root package name */
    public static final d[] f364H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashMap[] f365I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashMap[] f366J;

    /* renamed from: K, reason: collision with root package name */
    public static final Set f367K;

    /* renamed from: L, reason: collision with root package name */
    public static final HashMap f368L;

    /* renamed from: M, reason: collision with root package name */
    public static final Charset f369M;

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f370N;

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f371O;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f372m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f373n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f374o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f375p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f376q;
    public static final byte[] r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f377s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f378t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f379u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f380v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f381w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f382x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f383y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f384z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f385a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f386b;

    /* renamed from: c, reason: collision with root package name */
    public int f387c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap[] f388d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f389e;

    /* renamed from: f, reason: collision with root package name */
    public ByteOrder f390f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f391g;

    /* renamed from: h, reason: collision with root package name */
    public int f392h;

    /* renamed from: i, reason: collision with root package name */
    public int f393i;

    /* renamed from: j, reason: collision with root package name */
    public int f394j;

    /* renamed from: k, reason: collision with root package name */
    public int f395k;

    /* renamed from: l, reason: collision with root package name */
    public c f396l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f373n = new int[]{8, 8, 8};
        f374o = new int[]{8};
        f375p = new byte[]{-1, -40, -1};
        f376q = new byte[]{102, 116, 121, 112};
        r = new byte[]{109, 105, 102, 49};
        f377s = new byte[]{104, 101, 105, 99};
        f378t = new byte[]{97, 118, 105, 102};
        f379u = new byte[]{97, 118, 105, 115};
        f380v = new byte[]{79, 76, 89, 77, 80, 0};
        f381w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f382x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f383y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f384z = new byte[]{82, 73, 70, 70};
        f357A = new byte[]{87, 69, 66, 80};
        f358B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f359C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f360D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f361E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f362F = new d("StripOffsets", 273, 3);
        f363G = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f364H = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f365I = new HashMap[10];
        f366J = new HashMap[10];
        f367K = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f368L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f369M = forName;
        f370N = "Exif\u0000\u0000".getBytes(forName);
        f371O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr6 = f363G;
            if (i2 >= dVarArr6.length) {
                HashMap hashMap = f368L;
                d[] dVarArr7 = f364H;
                hashMap.put(Integer.valueOf(dVarArr7[0].f351a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f351a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f351a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f351a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f351a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f351a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f365I[i2] = new HashMap();
            f366J[i2] = new HashMap();
            for (d dVar : dVarArr6[i2]) {
                f365I[i2].put(Integer.valueOf(dVar.f351a), dVar);
                f366J[i2].put(dVar.f352b, dVar);
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:7:0x0039, B:13:0x0056, B:20:0x0069, B:21:0x007c, B:30:0x0071, B:31:0x0075, B:32:0x0079, B:33:0x0086, B:35:0x008f, B:37:0x0095, B:39:0x009b, B:41:0x00a1, B:51:0x00af), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(ByteArrayInputStream byteArrayInputStream) {
        d[][] dVarArr = f363G;
        this.f388d = new HashMap[dVarArr.length];
        this.f389e = new HashSet(dVarArr.length);
        this.f390f = ByteOrder.BIG_ENDIAN;
        boolean z2 = f372m;
        this.f386b = null;
        this.f385a = null;
        for (int i2 = 0; i2 < dVarArr.length; i2++) {
            try {
                try {
                    this.f388d[i2] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e3) {
                e = e3;
                if (z2) {
                }
                a();
                if (!z2) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int f2 = f(bufferedInputStream);
        this.f387c = f2;
        if (f2 != 4 && f2 != 9 && f2 != 13 && f2 != 14) {
            f fVar = new f(bufferedInputStream);
            int i3 = this.f387c;
            if (i3 != 12 && i3 != 15) {
                if (i3 == 7) {
                    g(fVar);
                } else if (i3 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.b(this.f392h);
                u(fVar);
                a();
                if (!z2) {
                    return;
                }
                p();
            }
            d(fVar, i3);
            fVar.b(this.f392h);
            u(fVar);
            a();
            if (!z2) {
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i4 = this.f387c;
        if (i4 == 4) {
            e(bVar, 0, 0);
        } else if (i4 == 13) {
            h(bVar);
        } else if (i4 == 9) {
            i(bVar);
        } else if (i4 == 14) {
            l(bVar);
        }
        a();
        if (!z2) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z2 = f372m;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b2 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f388d;
        if (b2 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b2.concat("\u0000").getBytes(f369M);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f390f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f390f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f390f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f390f));
        }
    }

    public final String b(String str) {
        c c2 = c(str);
        if (c2 == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f367K.contains(str)) {
                return c2.f(this.f390f);
            }
            try {
                return Double.toString(c2.d(this.f390f));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = c2.f347a;
        if (i2 != 5 && i2 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
            return null;
        }
        e[] eVarArr = (e[]) c2.g(this.f390f);
        if (eVarArr == null || eVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
            return null;
        }
        e eVar = eVarArr[0];
        Integer valueOf = Integer.valueOf((int) (eVar.f355a / eVar.f356b));
        e eVar2 = eVarArr[1];
        Integer valueOf2 = Integer.valueOf((int) (eVar2.f355a / eVar2.f356b));
        e eVar3 = eVarArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f355a / eVar3.f356b)));
    }

    public final c c(String str) {
        c cVar;
        int i2;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f372m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i2 = this.f387c) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (cVar2 = this.f396l) != null)) {
            return cVar2;
        }
        for (int i3 = 0; i3 < f363G.length; i3++) {
            c cVar3 = (c) this.f388d[i3].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f396l) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i2) {
        String str;
        String str2;
        String str3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i2 == 15 && i3 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
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
                HashMap[] hashMapArr = this.f388d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f390f));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f390f));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f390f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i4 = parseInt2 + 6;
                    int i5 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f370N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    fVar.readFully(bArr2);
                    this.f392h = i4;
                    r(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j2 = parseInt4;
                    fVar.b(j2);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f396l = new c(j2, bArr3, 1, parseInt5);
                }
                if (f372m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e2) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r23.f344g = r22.f390f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158 A[LOOP:0: B:9:0x0034->B:32:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i2, int i3) {
        boolean z2 = f372m;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f344g = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b2 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i4 = 2;
        int i5 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b2) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i6 = readUnsignedShort - 2;
                int i7 = i5 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                if (readByte3 != -31) {
                    HashMap[] hashMapArr = this.f388d;
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
                                                bVar.a(1);
                                                hashMapArr[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f390f));
                                                hashMapArr[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f390f));
                                                i6 = readUnsignedShort - 7;
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
                        if (i6 >= 0) {
                            throw new IOException("Invalid length");
                        }
                        bVar.a(i6);
                        i5 = i7 + i6;
                        i4 = 2;
                        b2 = -1;
                    } else {
                        byte[] bArr = new byte[i6];
                        bVar.readFully(bArr);
                        if (b("UserComment") == null) {
                            HashMap hashMap = hashMapArr[1];
                            Charset charset = f369M;
                            byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                            hashMap.put("UserComment", new c(bytes, i4, bytes.length));
                        }
                    }
                } else {
                    byte[] bArr2 = new byte[i6];
                    bVar.readFully(bArr2);
                    int i8 = i7 + i6;
                    byte[] bArr3 = f370N;
                    if (AbstractC0069a.J(bArr2, bArr3)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i6);
                        this.f392h = i2 + i7 + bArr3.length;
                        r(copyOfRange, i3);
                        u(new b(copyOfRange));
                    } else {
                        byte[] bArr4 = f371O;
                        if (AbstractC0069a.J(bArr2, bArr4)) {
                            int length = i7 + bArr4.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i6);
                            this.f396l = new c(length, copyOfRange2, 1, copyOfRange2.length);
                        }
                    }
                    i7 = i8;
                }
                i6 = 0;
                if (i6 >= 0) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d8, code lost:
    
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        InputStream inputStream;
        b bVar;
        int i2;
        b bVar2;
        b bVar3;
        boolean z2;
        b bVar4;
        b bVar5;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f375p;
            if (i3 >= bArr2.length) {
                return 4;
            }
            if (bArr[i3] != bArr2[i3]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i4 = 0; i4 < bytes.length; i4++) {
                    byte b2 = bArr[i4];
                    ?? r8 = bytes[i4];
                    try {
                        if (b2 != r8) {
                            try {
                                bVar = new b(bArr);
                                try {
                                    long readInt = bVar.readInt();
                                    byte[] bArr3 = new byte[4];
                                    bVar.readFully(bArr3);
                                    if (Arrays.equals(bArr3, f376q)) {
                                        if (readInt == 1) {
                                            readInt = bVar.readLong();
                                            j2 = 16;
                                            if (readInt < 16) {
                                            }
                                        } else {
                                            j2 = 8;
                                        }
                                        long j3 = 5000;
                                        if (readInt > j3) {
                                            readInt = j3;
                                        }
                                        long j4 = readInt - j2;
                                        if (j4 >= 8) {
                                            byte[] bArr4 = new byte[4];
                                            boolean z6 = false;
                                            boolean z7 = false;
                                            boolean z8 = false;
                                            for (long j5 = 0; j5 < j4 / 4; j5++) {
                                                try {
                                                    bVar.readFully(bArr4);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr4, r)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr4, f377s)) {
                                                            z7 = true;
                                                        } else if (Arrays.equals(bArr4, f378t) || Arrays.equals(bArr4, f379u)) {
                                                            z8 = true;
                                                        }
                                                        if (z6) {
                                                            if (z7) {
                                                                bVar.close();
                                                                i2 = 12;
                                                                break;
                                                            }
                                                            if (z8) {
                                                                bVar.close();
                                                                i2 = 15;
                                                                break;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                } catch (EOFException unused) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    if (f372m) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                bVar = null;
                            } catch (Throwable th) {
                                th = th;
                                inputStream = null;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                            bVar.close();
                            i2 = 0;
                            if (i2 != 0) {
                                return i2;
                            }
                            try {
                                bVar3 = new b(bArr);
                                try {
                                    ByteOrder q2 = q(bVar3);
                                    this.f390f = q2;
                                    bVar3.f344g = q2;
                                    short readShort = bVar3.readShort();
                                    z2 = readShort == 20306 || readShort == 21330;
                                    bVar3.close();
                                } catch (Exception unused2) {
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar2 = bVar3;
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                bVar3 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar2 = null;
                            }
                            if (!z2) {
                                return 7;
                            }
                            try {
                                b bVar6 = new b(bArr);
                                try {
                                    ByteOrder q3 = q(bVar6);
                                    this.f390f = q3;
                                    bVar6.f344g = q3;
                                    z3 = bVar6.readShort() == 85;
                                    bVar6.close();
                                } catch (Exception unused4) {
                                    bVar5 = bVar6;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    z3 = false;
                                    if (!z3) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar4 = bVar6;
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                bVar5 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar4 = null;
                            }
                            if (!z3) {
                                return 10;
                            }
                            int i5 = 0;
                            while (true) {
                                byte[] bArr5 = f382x;
                                if (i5 >= bArr5.length) {
                                    z4 = true;
                                    break;
                                }
                                if (bArr[i5] != bArr5[i5]) {
                                    z4 = false;
                                    break;
                                }
                                i5++;
                            }
                            if (z4) {
                                return 13;
                            }
                            int i6 = 0;
                            while (true) {
                                byte[] bArr6 = f384z;
                                if (i6 >= bArr6.length) {
                                    int i7 = 0;
                                    while (true) {
                                        byte[] bArr7 = f357A;
                                        if (i7 >= bArr7.length) {
                                            z5 = true;
                                            break;
                                        }
                                        if (bArr[bArr6.length + i7 + 4] != bArr7[i7]) {
                                            break;
                                        }
                                        i7++;
                                    }
                                } else {
                                    if (bArr[i6] != bArr6[i6]) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                            return z5 ? 14 : 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = r8;
                    }
                }
                return 9;
            }
            i3++;
        }
    }

    public final void g(f fVar) {
        int i2;
        int i3;
        j(fVar);
        HashMap[] hashMapArr = this.f388d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f350d);
            fVar2.f344g = this.f390f;
            byte[] bArr = f380v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f381w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f390f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 <= i5 || (i2 = iArr[3]) <= (i3 = iArr[1])) {
                    return;
                }
                int i6 = (i4 - i5) + 1;
                int i7 = (i2 - i3) + 1;
                if (i6 < i7) {
                    int i8 = i6 + i7;
                    i7 = i8 - i7;
                    i6 = i8 - i7;
                }
                c c2 = c.c(i6, this.f390f);
                c c3 = c.c(i7, this.f390f);
                hashMapArr[0].put("ImageWidth", c2);
                hashMapArr[0].put("ImageLength", c3);
            }
        }
    }

    public final void h(b bVar) {
        if (f372m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f344g = ByteOrder.BIG_ENDIAN;
        int i2 = bVar.f343f;
        bVar.a(f382x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i3 = bVar.f343f;
                int i4 = i3 + readInt + 4;
                int i5 = i3 - i2;
                if (i5 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.f392h = i5;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(bArr, 0);
                    x();
                    u(new b(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = f383y;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i6 = bVar.f343f - i2;
                            int i7 = readInt - length;
                            byte[] bArr4 = new byte[i7];
                            bVar.readFully(bArr4);
                            this.f396l = new c(i6, bArr4, 1, i7);
                            z3 = true;
                        }
                    }
                }
                bVar.a(i4 - bVar.f343f);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    public final void i(b bVar) {
        boolean z2 = f372m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        bVar.a(i2 - bVar.f343f);
        bVar.readFully(bArr4);
        e(new b(bArr4), i2, 5);
        bVar.a(i4 - bVar.f343f);
        bVar.f344g = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f362F.f351a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c2 = c.c(readShort, this.f390f);
                c c3 = c.c(readShort2, this.f390f);
                HashMap[] hashMapArr = this.f388d;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c3);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f387c == 8) {
            HashMap[] hashMapArr = this.f388d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f350d);
                fVar2.f344g = this.f390f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f372m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f388d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f350d), (int) cVar.f349c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f372m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f344g = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f384z.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f357A;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i2 = length + 8;
                if (Arrays.equals(f358B, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f370N;
                    if (AbstractC0069a.J(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f392h = i2;
                    r(bArr3, 0);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(readInt2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e2 = cVar.e(this.f390f);
        int e3 = cVar2.e(this.f390f);
        if (this.f387c == 7) {
            e2 += this.f393i;
        }
        if (e2 > 0 && e3 > 0 && this.f386b == null && this.f385a == null) {
            bVar.a(e2);
            bVar.readFully(new byte[e3]);
        }
        if (f372m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e2 + ", length: " + e3);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f390f) <= 512 && cVar2.e(this.f390f) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q2 = q(fVar);
        this.f390f = q2;
        fVar.f344g = q2;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i2 = this.f387c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(h.e("Invalid first Ifd offset: ", readInt));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            fVar.a(i3);
        }
    }

    public final void p() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f388d;
            if (i2 >= hashMapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + hashMapArr[i2].size());
            for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f390f) + "'");
            }
            i2++;
        }
    }

    public final void r(byte[] bArr, int i2) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i2) {
        HashMap[] hashMapArr;
        short s2;
        HashSet hashSet;
        short s3;
        HashMap[] hashMapArr2;
        long j2;
        boolean z2;
        int i3;
        long j3;
        int i4;
        int i5;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        Integer valueOf = Integer.valueOf(fVar.f343f);
        HashSet hashSet3 = this.f389e;
        hashSet3.add(valueOf);
        short readShort = fVar.readShort();
        boolean z3 = f372m;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            hashMapArr = this.f388d;
            if (s4 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j5 = fVar.f343f + 4;
            d dVar = (d) f365I[i2].get(Integer.valueOf(readUnsignedShort2));
            if (z3) {
                s2 = readShort;
                s3 = s4;
                hashSet = hashSet3;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i2), Integer.valueOf(readUnsignedShort2), dVar != null ? dVar.f352b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s2 = readShort;
                hashSet = hashSet3;
                s3 = s4;
                hashMapArr2 = hashMapArr;
            }
            if (dVar != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f360D.length) {
                        int i6 = dVar.f353c;
                        if (i6 == 7 || readUnsignedShort3 == 7 || i6 == readUnsignedShort3 || (i3 = dVar.f354d) == readUnsignedShort3 || (((i6 == 4 || i3 == 4) && readUnsignedShort3 == 3) || (((i6 == 9 || i3 == 9) && readUnsignedShort3 == 8) || ((i6 == 12 || i3 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i6;
                            }
                            j2 = r4[readUnsignedShort3] * readInt;
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z2 = false;
                                if (z2) {
                                    if (j2 > 4) {
                                        int readInt2 = fVar.readInt();
                                        if (z3) {
                                            j3 = j5;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            j3 = j5;
                                        }
                                        if (this.f387c == 7) {
                                            if ("MakerNote".equals(dVar.f352b)) {
                                                this.f393i = readInt2;
                                            } else if (i2 == 6 && "ThumbnailImage".equals(dVar.f352b)) {
                                                this.f394j = readInt2;
                                                this.f395k = readInt;
                                                c c2 = c.c(6, this.f390f);
                                                i5 = readInt;
                                                c a2 = c.a(this.f394j, this.f390f);
                                                i4 = readUnsignedShort3;
                                                c a3 = c.a(this.f395k, this.f390f);
                                                hashMapArr2[4].put("Compression", c2);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a2);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a3);
                                                fVar.b(readInt2);
                                            }
                                        }
                                        i4 = readUnsignedShort3;
                                        i5 = readInt;
                                        fVar.b(readInt2);
                                    } else {
                                        j3 = j5;
                                        i4 = readUnsignedShort3;
                                        i5 = readInt;
                                    }
                                    Integer num = (Integer) f368L.get(Integer.valueOf(readUnsignedShort2));
                                    if (z3) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        int i7 = i4;
                                        if (i7 != 3) {
                                            if (i7 == 4) {
                                                j4 = fVar.readInt() & 4294967295L;
                                            } else if (i7 == 8) {
                                                readUnsignedShort = fVar.readShort();
                                            } else if (i7 == 9 || i7 == 13) {
                                                readUnsignedShort = fVar.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z3) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), dVar.f352b));
                                            }
                                            int i8 = fVar.f346i;
                                            if (j4 > 0 || (i8 != -1 && j4 >= i8)) {
                                                hashSet2 = hashSet;
                                                if (z3) {
                                                    String str = "Skip jump into the IFD since its offset is invalid: " + j4;
                                                    if (i8 != -1) {
                                                        str = str + " (total length: " + i8 + ")";
                                                    }
                                                    Log.d("ExifInterface", str);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    fVar.b(j4);
                                                    s(fVar, num.intValue());
                                                } else if (z3) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            fVar.b(j3);
                                        } else {
                                            readUnsignedShort = fVar.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z3) {
                                        }
                                        int i82 = fVar.f346i;
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z3) {
                                        }
                                        fVar.b(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j6 = j3;
                                        int i9 = fVar.f343f + this.f392h;
                                        byte[] bArr = new byte[(int) j2];
                                        fVar.readFully(bArr);
                                        c cVar = new c(i9, bArr, i4, i5);
                                        hashMapArr2[i2].put(dVar.f352b, cVar);
                                        String str2 = dVar.f352b;
                                        if ("DNGVersion".equals(str2)) {
                                            this.f387c = 3;
                                        }
                                        if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f390f).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f390f) == 65535)) {
                                            this.f387c = 8;
                                        }
                                        if (fVar.f343f != j6) {
                                            fVar.b(j6);
                                        }
                                    }
                                } else {
                                    fVar.b(j5);
                                    hashSet2 = hashSet;
                                }
                                s4 = (short) (s3 + 1);
                                hashSet3 = hashSet2;
                                readShort = s2;
                            } else {
                                z2 = true;
                                if (z2) {
                                }
                                s4 = (short) (s3 + 1);
                                hashSet3 = hashSet2;
                                readShort = s2;
                            }
                        } else if (z3) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f359C[readUnsignedShort3] + ") is unexpected for tag: " + dVar.f352b);
                        }
                    }
                }
                if (z3) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j2 = 0;
            z2 = false;
            if (z2) {
            }
            s4 = (short) (s3 + 1);
            hashSet3 = hashSet2;
            readShort = s2;
        }
        HashSet hashSet4 = hashSet3;
        int readInt3 = fVar.readInt();
        if (z3) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j7 = readInt3;
        if (j7 <= 0) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z3) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.b(j7);
        if (hashMapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.f388d;
        if (hashMapArr[i2].isEmpty() || hashMapArr[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i2].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e2;
        HashMap hashMap = this.f388d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e3 = cVar2.e(this.f390f);
        if (e3 != 1) {
            if (e3 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e3 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f390f);
            int[] iArr2 = f373n;
            if (Arrays.equals(iArr2, iArr) || (this.f387c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e2 = cVar.e(this.f390f)) == 1 && Arrays.equals(iArr, f374o)) || (e2 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] i2 = AbstractC0069a.i(cVar4.g(this.f390f));
                long[] i3 = AbstractC0069a.i(cVar5.g(this.f390f));
                if (i2 == null || i2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (i3 == null || i3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (i2.length != i3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j2 = 0;
                for (long j3 : i3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[(int) j2];
                this.f391g = true;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2.length; i6++) {
                    int i7 = (int) i2[i6];
                    int i8 = (int) i3[i6];
                    if (i6 < i2.length - 1 && i7 + i8 != i2[i6 + 1]) {
                        this.f391g = false;
                    }
                    int i9 = i7 - i4;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i9);
                        int i10 = i4 + i9;
                        byte[] bArr2 = new byte[i8];
                        try {
                            bVar.readFully(bArr2);
                            i4 = i10 + i8;
                            System.arraycopy(bArr2, 0, bArr, i5, i8);
                            i5 += i8;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                }
                if (this.f391g) {
                    long j4 = i2[0];
                    return;
                }
                return;
            }
        }
        if (f372m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i2, int i3) {
        HashMap[] hashMapArr = this.f388d;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z2 = f372m;
        if (isEmpty || hashMapArr[i3].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i2].get("ImageLength");
        c cVar2 = (c) hashMapArr[i2].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i3].get("ImageLength");
        c cVar4 = (c) hashMapArr[i3].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e2 = cVar.e(this.f390f);
        int e3 = cVar2.e(this.f390f);
        int e4 = cVar3.e(this.f390f);
        int e5 = cVar4.e(this.f390f);
        if (e2 >= e4 || e3 >= e5) {
            return;
        }
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    public final void w(f fVar, int i2) {
        c c2;
        c c3;
        HashMap[] hashMapArr = this.f388d;
        c cVar = (c) hashMapArr[i2].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i2].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i2].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i2].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i2].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f347a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f390f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c2 = c.b(eVarArr[0], this.f390f);
                c3 = c.b(eVarArr[1], this.f390f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f390f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2 = c.c(iArr[0], this.f390f);
                c3 = c.c(iArr[1], this.f390f);
            }
            hashMapArr[i2].put("ImageWidth", c2);
            hashMapArr[i2].put("ImageLength", c3);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e2 = cVar2.e(this.f390f);
            int e3 = cVar4.e(this.f390f);
            int e4 = cVar5.e(this.f390f);
            int e5 = cVar3.e(this.f390f);
            if (e3 <= e2 || e4 <= e5) {
                return;
            }
            c c4 = c.c(e3 - e2, this.f390f);
            c c5 = c.c(e4 - e5, this.f390f);
            hashMapArr[i2].put("ImageLength", c4);
            hashMapArr[i2].put("ImageWidth", c5);
            return;
        }
        c cVar6 = (c) hashMapArr[i2].get("ImageLength");
        c cVar7 = (c) hashMapArr[i2].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i2].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i2].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e6 = cVar8.e(this.f390f);
            int e7 = cVar8.e(this.f390f);
            fVar.b(e6);
            byte[] bArr = new byte[e7];
            fVar.readFully(bArr);
            e(new b(bArr), e6, i2);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f388d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
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
