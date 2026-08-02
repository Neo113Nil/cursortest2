package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import j$.util.DesugarTimeZone;
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
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class epb {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final bpb E;
    public static final bpb[][] F;
    public static final bpb[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        bpb[] bpbVarArr = {new bpb("NewSubfileType", 254, 4), new bpb("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new bpb("ImageWidth", 256, 3, 4), new bpb("ImageLength", 257, 3, 4), new bpb("BitsPerSample", 258, 3), new bpb("Compression", 259, 3), new bpb("PhotometricInterpretation", 262, 3), new bpb("ImageDescription", 270, 2), new bpb("Make", 271, 2), new bpb("Model", 272, 2), new bpb("StripOffsets", 273, 3, 4), new bpb("Orientation", 274, 3), new bpb("SamplesPerPixel", 277, 3), new bpb("RowsPerStrip", 278, 3, 4), new bpb("StripByteCounts", 279, 3, 4), new bpb("XResolution", 282, 5), new bpb("YResolution", 283, 5), new bpb("PlanarConfiguration", 284, 3), new bpb("ResolutionUnit", 296, 3), new bpb("TransferFunction", 301, 3), new bpb("Software", 305, 2), new bpb("DateTime", 306, 2), new bpb("Artist", 315, 2), new bpb("WhitePoint", 318, 5), new bpb("PrimaryChromaticities", 319, 5), new bpb("SubIFDPointer", 330, 4), new bpb("JPEGInterchangeFormat", 513, 4), new bpb("JPEGInterchangeFormatLength", 514, 4), new bpb("YCbCrCoefficients", 529, 5), new bpb("YCbCrSubSampling", 530, 3), new bpb("YCbCrPositioning", 531, 3), new bpb("ReferenceBlackWhite", 532, 5), new bpb("Copyright", 33432, 2), new bpb("ExifIFDPointer", 34665, 4), new bpb("GPSInfoIFDPointer", 34853, 4), new bpb("SensorTopBorder", 4, 4), new bpb("SensorLeftBorder", 5, 4), new bpb("SensorBottomBorder", 6, 4), new bpb("SensorRightBorder", 7, 4), new bpb("ISO", 23, 3), new bpb("JpgFromRaw", 46, 7), new bpb("Xmp", 700, 1)};
        bpb[] bpbVarArr2 = {new bpb("ExposureTime", 33434, 5), new bpb("FNumber", 33437, 5), new bpb("ExposureProgram", 34850, 3), new bpb("SpectralSensitivity", 34852, 2), new bpb("PhotographicSensitivity", 34855, 3), new bpb("OECF", 34856, 7), new bpb("SensitivityType", 34864, 3), new bpb("StandardOutputSensitivity", 34865, 4), new bpb("RecommendedExposureIndex", 34866, 4), new bpb("ISOSpeed", 34867, 4), new bpb("ISOSpeedLatitudeyyy", 34868, 4), new bpb("ISOSpeedLatitudezzz", 34869, 4), new bpb("ExifVersion", 36864, 2), new bpb("DateTimeOriginal", 36867, 2), new bpb("DateTimeDigitized", 36868, 2), new bpb("OffsetTime", 36880, 2), new bpb("OffsetTimeOriginal", 36881, 2), new bpb("OffsetTimeDigitized", 36882, 2), new bpb("ComponentsConfiguration", 37121, 7), new bpb("CompressedBitsPerPixel", 37122, 5), new bpb("ShutterSpeedValue", 37377, 10), new bpb("ApertureValue", 37378, 5), new bpb("BrightnessValue", 37379, 10), new bpb("ExposureBiasValue", 37380, 10), new bpb("MaxApertureValue", 37381, 5), new bpb("SubjectDistance", 37382, 5), new bpb("MeteringMode", 37383, 3), new bpb("LightSource", 37384, 3), new bpb("Flash", 37385, 3), new bpb("FocalLength", 37386, 5), new bpb("SubjectArea", 37396, 3), new bpb("MakerNote", 37500, 7), new bpb("UserComment", 37510, 7), new bpb("SubSecTime", 37520, 2), new bpb("SubSecTimeOriginal", 37521, 2), new bpb("SubSecTimeDigitized", 37522, 2), new bpb("FlashpixVersion", 40960, 7), new bpb("ColorSpace", 40961, 3), new bpb("PixelXDimension", 40962, 3, 4), new bpb("PixelYDimension", 40963, 3, 4), new bpb("RelatedSoundFile", 40964, 2), new bpb("InteroperabilityIFDPointer", 40965, 4), new bpb("FlashEnergy", 41483, 5), new bpb("SpatialFrequencyResponse", 41484, 7), new bpb("FocalPlaneXResolution", 41486, 5), new bpb("FocalPlaneYResolution", 41487, 5), new bpb("FocalPlaneResolutionUnit", 41488, 3), new bpb("SubjectLocation", 41492, 3), new bpb("ExposureIndex", 41493, 5), new bpb("SensingMethod", 41495, 3), new bpb("FileSource", 41728, 7), new bpb("SceneType", 41729, 7), new bpb("CFAPattern", 41730, 7), new bpb("CustomRendered", 41985, 3), new bpb("ExposureMode", 41986, 3), new bpb("WhiteBalance", 41987, 3), new bpb("DigitalZoomRatio", 41988, 5), new bpb("FocalLengthIn35mmFilm", 41989, 3), new bpb("SceneCaptureType", 41990, 3), new bpb("GainControl", 41991, 3), new bpb("Contrast", 41992, 3), new bpb("Saturation", 41993, 3), new bpb("Sharpness", 41994, 3), new bpb("DeviceSettingDescription", 41995, 7), new bpb("SubjectDistanceRange", 41996, 3), new bpb("ImageUniqueID", 42016, 2), new bpb("CameraOwnerName", 42032, 2), new bpb("BodySerialNumber", 42033, 2), new bpb("LensSpecification", 42034, 5), new bpb("LensMake", 42035, 2), new bpb("LensModel", 42036, 2), new bpb("Gamma", 42240, 5), new bpb("DNGVersion", 50706, 1), new bpb("DefaultCropSize", 50720, 3, 4)};
        bpb[] bpbVarArr3 = {new bpb("GPSVersionID", 0, 1), new bpb("GPSLatitudeRef", 1, 2), new bpb("GPSLatitude", 2, 5, 10), new bpb("GPSLongitudeRef", 3, 2), new bpb("GPSLongitude", 4, 5, 10), new bpb("GPSAltitudeRef", 5, 1), new bpb("GPSAltitude", 6, 5), new bpb("GPSTimeStamp", 7, 5), new bpb("GPSSatellites", 8, 2), new bpb("GPSStatus", 9, 2), new bpb("GPSMeasureMode", 10, 2), new bpb("GPSDOP", 11, 5), new bpb("GPSSpeedRef", 12, 2), new bpb("GPSSpeed", 13, 5), new bpb("GPSTrackRef", 14, 2), new bpb("GPSTrack", 15, 5), new bpb("GPSImgDirectionRef", 16, 2), new bpb("GPSImgDirection", 17, 5), new bpb("GPSMapDatum", 18, 2), new bpb("GPSDestLatitudeRef", 19, 2), new bpb("GPSDestLatitude", 20, 5), new bpb("GPSDestLongitudeRef", 21, 2), new bpb("GPSDestLongitude", 22, 5), new bpb("GPSDestBearingRef", 23, 2), new bpb("GPSDestBearing", 24, 5), new bpb("GPSDestDistanceRef", 25, 2), new bpb("GPSDestDistance", 26, 5), new bpb("GPSProcessingMethod", 27, 7), new bpb("GPSAreaInformation", 28, 7), new bpb("GPSDateStamp", 29, 2), new bpb("GPSDifferential", 30, 3), new bpb("GPSHPositioningError", 31, 5)};
        bpb[] bpbVarArr4 = {new bpb("InteroperabilityIndex", 1, 2)};
        bpb[] bpbVarArr5 = {new bpb("NewSubfileType", 254, 4), new bpb("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new bpb("ThumbnailImageWidth", 256, 3, 4), new bpb("ThumbnailImageLength", 257, 3, 4), new bpb("BitsPerSample", 258, 3), new bpb("Compression", 259, 3), new bpb("PhotometricInterpretation", 262, 3), new bpb("ImageDescription", 270, 2), new bpb("Make", 271, 2), new bpb("Model", 272, 2), new bpb("StripOffsets", 273, 3, 4), new bpb("ThumbnailOrientation", 274, 3), new bpb("SamplesPerPixel", 277, 3), new bpb("RowsPerStrip", 278, 3, 4), new bpb("StripByteCounts", 279, 3, 4), new bpb("XResolution", 282, 5), new bpb("YResolution", 283, 5), new bpb("PlanarConfiguration", 284, 3), new bpb("ResolutionUnit", 296, 3), new bpb("TransferFunction", 301, 3), new bpb("Software", 305, 2), new bpb("DateTime", 306, 2), new bpb("Artist", 315, 2), new bpb("WhitePoint", 318, 5), new bpb("PrimaryChromaticities", 319, 5), new bpb("SubIFDPointer", 330, 4), new bpb("JPEGInterchangeFormat", 513, 4), new bpb("JPEGInterchangeFormatLength", 514, 4), new bpb("YCbCrCoefficients", 529, 5), new bpb("YCbCrSubSampling", 530, 3), new bpb("YCbCrPositioning", 531, 3), new bpb("ReferenceBlackWhite", 532, 5), new bpb("Copyright", 33432, 2), new bpb("ExifIFDPointer", 34665, 4), new bpb("GPSInfoIFDPointer", 34853, 4), new bpb("DNGVersion", 50706, 1), new bpb("DefaultCropSize", 50720, 3, 4)};
        E = new bpb("StripOffsets", 273, 3);
        F = new bpb[][]{bpbVarArr, bpbVarArr2, bpbVarArr3, bpbVarArr4, bpbVarArr5, bpbVarArr, new bpb[]{new bpb("ThumbnailImage", 256, 7), new bpb("CameraSettingsIFDPointer", 8224, 4), new bpb("ImageProcessingIFDPointer", 8256, 4)}, new bpb[]{new bpb("PreviewImageStart", 257, 4), new bpb("PreviewImageLength", 258, 4)}, new bpb[]{new bpb("AspectFrame", 4371, 3)}, new bpb[]{new bpb("ColorSpace", 55, 3)}};
        G = new bpb[]{new bpb("SubIFDPointer", 330, 4), new bpb("ExifIFDPointer", 34665, 4), new bpb("GPSInfoIFDPointer", 34853, 4), new bpb("InteroperabilityIFDPointer", 40965, 4), new bpb("CameraSettingsIFDPointer", 8224, 1), new bpb("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            bpb[][] bpbVarArr6 = F;
            if (i >= bpbVarArr6.length) {
                HashMap hashMap = K;
                bpb[] bpbVarArr7 = G;
                hashMap.put(Integer.valueOf(bpbVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(bpbVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(bpbVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(bpbVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(bpbVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(bpbVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (bpb bpbVar : bpbVarArr6[i]) {
                H[i].put(Integer.valueOf(bpbVar.a), bpbVar);
                I[i].put(bpbVar.b, bpbVar);
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
    public epb(InputStream inputStream) {
        bpb[][] bpbVarArr = F;
        this.d = new HashMap[bpbVarArr.length];
        this.e = new HashSet(bpbVarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = l;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    gpb.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.b = null;
                    this.a = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (z3) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < bpbVarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        q();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
                q();
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                }
                a();
                if (!z3) {
                }
                q();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, ScreenMirroringConfig.Test.pcVideoUdpPort);
        int g = g(bufferedInputStream);
        this.c = g;
        if (g != 4 && g != 9 && g != 13 && g != 14) {
            dpb dpbVar = new dpb(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 12) {
                e(dpbVar);
            } else if (i2 == 7) {
                h(dpbVar);
            } else if (i2 == 10) {
                l(dpbVar);
            } else {
                k(dpbVar);
            }
            dpbVar.b(this.h);
            v(dpbVar);
            a();
            if (!z3) {
                return;
            }
            q();
        }
        zob zobVar = new zob(bufferedInputStream);
        int i3 = this.c;
        if (i3 == 4) {
            f(zobVar, 0, 0);
        } else if (i3 == 13) {
            i(zobVar);
        } else if (i3 == 9) {
            j(zobVar);
        } else if (i3 == 14) {
            m(zobVar);
        }
        a();
        if (!z3) {
        }
        q();
    }

    public static ByteOrder r(zob zobVar) {
        short readShort = zobVar.readShort();
        boolean z2 = l;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            xla.h(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(L);
            hashMap.put("DateTime", new apb(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", apb.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", apb.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", apb.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", apb.a(0L, this.f));
        }
    }

    public final String b(String str) {
        apb d = d(str);
        if (d != null) {
            int i = d.a;
            if (!J.contains(str)) {
                return d.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                cpb[] cpbVarArr = (cpb[]) d.g(this.f);
                if (cpbVarArr == null || cpbVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(cpbVarArr));
                    return null;
                }
                cpb cpbVar = cpbVarArr[0];
                Integer valueOf = Integer.valueOf((int) (cpbVar.a / cpbVar.b));
                cpb cpbVar2 = cpbVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (cpbVar2.a / cpbVar2.b));
                cpb cpbVar3 = cpbVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (cpbVar3.a / cpbVar3.b)));
            }
            try {
                return Double.toString(d.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        apb d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final apb d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            apb apbVar = (apb) this.d[i].get(str);
            if (apbVar != null) {
                return apbVar;
            }
        }
        return null;
    }

    public final void e(dpb dpbVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            qq6.d("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                hpb.a(mediaMetadataRetriever, new yob(dpbVar));
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
                HashMap[] hashMapArr = this.d;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", apb.c(Integer.parseInt(str), this.f));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", apb.c(Integer.parseInt(str2), this.f));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", apb.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    dpbVar.b(parseInt2);
                    byte[] bArr = new byte[6];
                    dpbVar.readFully(bArr);
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    dpbVar.readFully(bArr2);
                    this.h = i;
                    s(0, bArr2);
                }
                if (l) {
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

    public final void f(zob zobVar, int i, int i2) {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + zobVar);
        }
        zobVar.c = ByteOrder.BIG_ENDIAN;
        byte readByte = zobVar.readByte();
        byte b = -1;
        if (readByte != -1) {
            xla.h(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (zobVar.readByte() != -40) {
            xla.h(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte readByte2 = zobVar.readByte();
            if (readByte2 != b) {
                xla.h(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            byte readByte3 = zobVar.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = zobVar.readUnsignedShort();
                int i5 = readUnsignedShort - 2;
                int i6 = i4 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i5 < 0) {
                    kac.f("Invalid length");
                    return;
                }
                int i7 = 0;
                HashMap[] hashMapArr = this.d;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i5];
                    zobVar.readFully(bArr);
                    int i8 = i6 + i5;
                    byte[] bArr2 = M;
                    if (bArr2 != null && i5 >= bArr2.length) {
                        int i9 = 0;
                        while (i9 < bArr2.length) {
                            if (bArr[i9] == bArr2[i9]) {
                                i9++;
                                i7 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i5);
                        this.h = i + i6 + bArr2.length;
                        s(i2, copyOfRange);
                        v(new zob(copyOfRange));
                        i6 = i8;
                        i5 = 0;
                    }
                    byte[] bArr3 = N;
                    if (bArr3 != null && i5 >= bArr3.length) {
                        int i10 = i7;
                        while (true) {
                            if (i10 >= bArr3.length) {
                                int length = i6 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i5);
                                if (b("Xmp") == null) {
                                    hashMapArr[i7].put("Xmp", new apb(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i10] == bArr3[i10]) {
                                i10++;
                            }
                        }
                    }
                    i6 = i8;
                    i5 = 0;
                } else if (readByte3 != -2) {
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
                    zobVar.a(1);
                    hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", apb.a(zobVar.readUnsignedShort(), this.f));
                    hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", apb.a(zobVar.readUnsignedShort(), this.f));
                    i5 = readUnsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i5];
                    zobVar.readFully(bArr4);
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = L;
                        byte[] bytes = new String(bArr4, charset).concat("\u0000").getBytes(charset);
                        hashMap.put("UserComment", new apb(bytes, i3, bytes.length));
                    }
                    i5 = 0;
                }
                if (i5 < 0) {
                    kac.f("Invalid length");
                    return;
                }
                zobVar.a(i5);
                i4 = i6 + i5;
                i3 = 2;
                b = -1;
            }
        }
        zobVar.c = this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(16:107|(2:109|110)(1:153)|112|113|(1:115)|116|(4:119|120|(7:124|125|126|(3:128|(1:130)(2:139|(1:141))|(3:133|134|135))(1:142)|137|121|122)|145)|118|22|23|25|26|27|(1:93)(1:31)|32|(1:34)(8:36|37|39|40|41|(1:43)(1:79)|44|(1:46)(3:47|(2:48|(2:50|(2:53|54)(1:52))(2:77|78))|(1:56)(4:57|(2:58|(2:60|(1:63)(1:62))(3:68|69|(2:70|(1:76)(2:72|(1:75)(1:74)))))|64|(1:66)(1:67)))))|21|22|23|25|26|27|(1:29)|93|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f1, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f8, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00cb, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fe, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0100, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0103, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        zob zobVar;
        int i;
        zob zobVar2;
        int i2;
        zob zobVar3;
        zob zobVar4;
        int i3;
        int i4;
        zob zobVar5;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(ScreenMirroringConfig.Test.pcVideoUdpPort);
        byte[] bArr2 = new byte[ScreenMirroringConfig.Test.pcVideoUdpPort];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = o;
            if (i5 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i5] != bArr3[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr2[i6] != bytes[i6]) {
                        int i7 = 1;
                        try {
                            zobVar2 = new zob(bArr2);
                            try {
                                try {
                                    readInt = zobVar2.readInt();
                                    bArr = new byte[4];
                                    zobVar2.readFully(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                zobVar = zobVar2;
                                if (zobVar != null) {
                                    zobVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            zobVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            zobVar = null;
                        }
                        if (Arrays.equals(bArr, p)) {
                            if (readInt == 1) {
                                readInt = zobVar2.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            i = 0;
                            long j2 = ScreenMirroringConfig.Test.pcVideoUdpPort;
                            if (readInt > j2) {
                                readInt = j2;
                            }
                            long j3 = readInt - j;
                            if (j3 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    for (long j4 = 0; j4 < j3 / 4; j4++) {
                                        try {
                                            zobVar2.readFully(bArr4);
                                            if (j4 != 1) {
                                                if (Arrays.equals(bArr4, q)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, r)) {
                                                    z3 = true;
                                                }
                                                if (z2 && z3) {
                                                    zobVar2.close();
                                                    return 12;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    if (l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            zobVar2.close();
                            zob zobVar6 = new zob(bArr2);
                            ByteOrder r2 = r(zobVar6);
                            this.f = r2;
                            zobVar6.c = r2;
                            short readShort = zobVar6.readShort();
                            i2 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                            zobVar6.close();
                            if (i2 != 0) {
                                return 7;
                            }
                            try {
                                zobVar5 = new zob(bArr2);
                            } catch (Exception unused2) {
                                zobVar4 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                zobVar3 = null;
                            }
                            try {
                                ByteOrder r3 = r(zobVar5);
                                this.f = r3;
                                zobVar5.c = r3;
                                i3 = zobVar5.readShort() == 85 ? 1 : i;
                                zobVar5.close();
                            } catch (Exception unused3) {
                                zobVar4 = zobVar5;
                                if (zobVar4 != null) {
                                    zobVar4.close();
                                }
                                i3 = i;
                                if (i3 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zobVar3 = zobVar5;
                                if (zobVar3 != null) {
                                    zobVar3.close();
                                }
                                throw th;
                            }
                            if (i3 == 0) {
                                return 10;
                            }
                            int i8 = i;
                            while (true) {
                                byte[] bArr5 = u;
                                if (i8 >= bArr5.length) {
                                    i4 = 1;
                                    break;
                                }
                                if (bArr2[i8] != bArr5[i8]) {
                                    i4 = i;
                                    break;
                                }
                                i8++;
                            }
                            if (i4 != 0) {
                                return 13;
                            }
                            int i9 = i;
                            while (true) {
                                byte[] bArr6 = y;
                                if (i9 >= bArr6.length) {
                                    int i10 = i;
                                    while (true) {
                                        byte[] bArr7 = z;
                                        if (i10 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i10 + 4] != bArr7[i10]) {
                                            break;
                                        }
                                        i10++;
                                    }
                                } else {
                                    if (bArr2[i9] != bArr6[i9]) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            i7 = i;
                            if (i7 != 0) {
                                return 14;
                            }
                            return i;
                        }
                        zobVar2.close();
                        i = 0;
                        zob zobVar62 = new zob(bArr2);
                        ByteOrder r22 = r(zobVar62);
                        this.f = r22;
                        zobVar62.c = r22;
                        short readShort2 = zobVar62.readShort();
                        if (readShort2 != 20306) {
                        }
                        zobVar62.close();
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void h(dpb dpbVar) {
        int i;
        int i2;
        k(dpbVar);
        HashMap[] hashMapArr = this.d;
        apb apbVar = (apb) hashMapArr[1].get("MakerNote");
        if (apbVar != null) {
            dpb dpbVar2 = new dpb(apbVar.d);
            dpbVar2.c = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            dpbVar2.readFully(bArr2);
            dpbVar2.b(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            dpbVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                dpbVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                dpbVar2.b(12L);
            }
            t(dpbVar2, 6);
            apb apbVar2 = (apb) hashMapArr[7].get("PreviewImageStart");
            apb apbVar3 = (apb) hashMapArr[7].get("PreviewImageLength");
            if (apbVar2 != null && apbVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", apbVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", apbVar3);
            }
            apb apbVar4 = (apb) hashMapArr[8].get("AspectFrame");
            if (apbVar4 != null) {
                int[] iArr = (int[]) apbVar4.g(this.f);
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
                apb c = apb.c(i5, this.f);
                apb c2 = apb.c(i6, this.f);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void i(zob zobVar) {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + zobVar);
        }
        zobVar.c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        zobVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = zobVar.readInt();
                byte[] bArr2 = new byte[4];
                zobVar.readFully(bArr2);
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[readInt];
                    zobVar.readFully(bArr3);
                    int readInt2 = zobVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.h = i;
                        s(0, bArr3);
                        y();
                        v(new zob(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                zobVar.a(i2);
                length = i + i2;
            } catch (EOFException unused) {
                kac.f("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(zob zobVar) {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + zobVar);
        }
        zobVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        zobVar.readFully(bArr);
        zobVar.readFully(bArr2);
        zobVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        zobVar.a(i - zobVar.b);
        zobVar.readFully(bArr4);
        f(new zob(bArr4), i, 5);
        zobVar.a(i3 - zobVar.b);
        zobVar.c = ByteOrder.BIG_ENDIAN;
        int readInt = zobVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = zobVar.readUnsignedShort();
            int readUnsignedShort2 = zobVar.readUnsignedShort();
            if (readUnsignedShort == E.a) {
                short readShort = zobVar.readShort();
                short readShort2 = zobVar.readShort();
                apb c = apb.c(readShort, this.f);
                apb c2 = apb.c(readShort2, this.f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            zobVar.a(readUnsignedShort2);
        }
    }

    public final void k(dpb dpbVar) {
        p(dpbVar);
        t(dpbVar, 0);
        x(dpbVar, 0);
        x(dpbVar, 5);
        x(dpbVar, 4);
        y();
        if (this.c == 8) {
            HashMap[] hashMapArr = this.d;
            apb apbVar = (apb) hashMapArr[1].get("MakerNote");
            if (apbVar != null) {
                dpb dpbVar2 = new dpb(apbVar.d);
                dpbVar2.c = this.f;
                dpbVar2.a(6);
                t(dpbVar2, 9);
                apb apbVar2 = (apb) hashMapArr[9].get("ColorSpace");
                if (apbVar2 != null) {
                    hashMapArr[1].put("ColorSpace", apbVar2);
                }
            }
        }
    }

    public final void l(dpb dpbVar) {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + dpbVar);
        }
        k(dpbVar);
        HashMap[] hashMapArr = this.d;
        apb apbVar = (apb) hashMapArr[0].get("JpgFromRaw");
        if (apbVar != null) {
            f(new zob(apbVar.d), (int) apbVar.c, 5);
        }
        apb apbVar2 = (apb) hashMapArr[0].get("ISO");
        apb apbVar3 = (apb) hashMapArr[1].get("PhotographicSensitivity");
        if (apbVar2 == null || apbVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", apbVar2);
    }

    public final void m(zob zobVar) {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + zobVar);
        }
        zobVar.c = ByteOrder.LITTLE_ENDIAN;
        zobVar.a(y.length);
        int readInt = zobVar.readInt() + 8;
        byte[] bArr = z;
        zobVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                zobVar.readFully(bArr2);
                int readInt2 = zobVar.readInt();
                int i = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    zobVar.readFully(bArr3);
                    this.h = i;
                    s(0, bArr3);
                    v(new zob(bArr3));
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
                zobVar.a(readInt2);
            } catch (EOFException unused) {
                kac.f("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(zob zobVar, HashMap hashMap) {
        apb apbVar = (apb) hashMap.get("JPEGInterchangeFormat");
        apb apbVar2 = (apb) hashMap.get("JPEGInterchangeFormatLength");
        if (apbVar == null || apbVar2 == null) {
            return;
        }
        int e = apbVar.e(this.f);
        int e2 = apbVar2.e(this.f);
        if (this.c == 7) {
            e += this.i;
        }
        if (e > 0 && e2 > 0 && this.b == null && this.a == null) {
            zobVar.a(e);
            zobVar.readFully(new byte[e2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final boolean o(HashMap hashMap) {
        apb apbVar = (apb) hashMap.get("ImageLength");
        apb apbVar2 = (apb) hashMap.get("ImageWidth");
        if (apbVar == null || apbVar2 == null) {
            return false;
        }
        return apbVar.e(this.f) <= 512 && apbVar2.e(this.f) <= 512;
    }

    public final void p(dpb dpbVar) {
        ByteOrder r2 = r(dpbVar);
        this.f = r2;
        dpbVar.c = r2;
        int readUnsignedShort = dpbVar.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            xla.h(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = dpbVar.readInt();
        if (readInt < 8) {
            kac.f(k5r.i(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            dpbVar.a(i2);
        }
    }

    public final void q() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder q2 = k5r.q(i, "The size of tag group[", "]: ");
            q2.append(hashMapArr[i].size());
            Log.d("ExifInterface", q2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                apb apbVar = (apb) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + apbVar.toString() + ", tagValue: '" + apbVar.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void s(int i, byte[] bArr) {
        dpb dpbVar = new dpb(bArr);
        p(dpbVar);
        t(dpbVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(dpb dpbVar, int i) {
        HashMap[] hashMapArr;
        HashSet hashSet;
        boolean z2;
        short s2;
        HashMap[] hashMapArr2;
        long j;
        long j2;
        boolean z3;
        int i2;
        long j3;
        int i3;
        bpb bpbVar;
        HashSet hashSet2;
        int readUnsignedShort;
        long j4;
        int i4 = i;
        int i5 = dpbVar.b;
        int i6 = dpbVar.e;
        Integer valueOf = Integer.valueOf(i5);
        HashSet hashSet3 = this.e;
        hashSet3.add(valueOf);
        short readShort = dpbVar.readShort();
        boolean z4 = l;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            hashMapArr = this.d;
            if (s3 >= readShort) {
                break;
            }
            int readUnsignedShort2 = dpbVar.readUnsignedShort();
            int readUnsignedShort3 = dpbVar.readUnsignedShort();
            int readInt = dpbVar.readInt();
            long j5 = dpbVar.b + 4;
            short s4 = readShort;
            bpb bpbVar2 = (bpb) H[i4].get(Integer.valueOf(readUnsignedShort2));
            if (z4) {
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
                hashSet = hashSet3;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i4), Integer.valueOf(readUnsignedShort2), bpbVar2 != null ? bpbVar2.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                hashSet = hashSet3;
                z2 = z4;
                s2 = s3;
                hashMapArr2 = hashMapArr;
            }
            if (bpbVar2 != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < C.length) {
                        int i7 = bpbVar2.c;
                        if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = bpbVar2.d) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i7;
                            }
                            j = j5;
                            j2 = readInt * r7[readUnsignedShort3];
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z2) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z3 = false;
                                if (z3) {
                                    dpbVar.b(j);
                                    hashSet2 = hashSet;
                                } else {
                                    long j6 = j;
                                    if (j2 > 4) {
                                        int readInt2 = dpbVar.readInt();
                                        if (z2) {
                                            i3 = readUnsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            i3 = readUnsignedShort2;
                                        }
                                        if (this.c == 7) {
                                            if ("MakerNote".equals(bpbVar2.b)) {
                                                this.i = readInt2;
                                            } else if (i4 == 6 && "ThumbnailImage".equals(bpbVar2.b)) {
                                                this.j = readInt2;
                                                this.k = readInt;
                                                apb c = apb.c(6, this.f);
                                                j3 = j6;
                                                apb a = apb.a(this.j, this.f);
                                                bpbVar = bpbVar2;
                                                apb a2 = apb.a(this.k, this.f);
                                                hashMapArr2[4].put("Compression", c);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                                dpbVar.b(readInt2);
                                            }
                                        }
                                        bpbVar = bpbVar2;
                                        j3 = j6;
                                        dpbVar.b(readInt2);
                                    } else {
                                        j3 = j6;
                                        i3 = readUnsignedShort2;
                                        bpbVar = bpbVar2;
                                    }
                                    Integer num = (Integer) K.get(Integer.valueOf(i3));
                                    if (z2) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j4 = dpbVar.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = dpbVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = dpbVar.readInt();
                                            } else {
                                                j4 = -1;
                                            }
                                            if (z2) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), bpbVar.b));
                                            }
                                            if (j4 > 0 || (i6 != -1 && j4 >= i6)) {
                                                hashSet2 = hashSet;
                                                if (z2) {
                                                    String d = dfi.d(j4, "Skip jump into the IFD since its offset is invalid: ");
                                                    if (i6 != -1) {
                                                        d = d + " (total length: " + i6 + ")";
                                                    }
                                                    Log.d("ExifInterface", d);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j4))) {
                                                    dpbVar.b(j4);
                                                    t(dpbVar, num.intValue());
                                                } else if (z2) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                                }
                                            }
                                            dpbVar.b(j3);
                                        } else {
                                            readUnsignedShort = dpbVar.readUnsignedShort();
                                        }
                                        j4 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        if (j4 > 0) {
                                        }
                                        hashSet2 = hashSet;
                                        if (z2) {
                                        }
                                        dpbVar.b(j3);
                                    } else {
                                        hashSet2 = hashSet;
                                        long j7 = j3;
                                        int i8 = dpbVar.b + this.h;
                                        byte[] bArr = new byte[(int) j2];
                                        dpbVar.readFully(bArr);
                                        apb apbVar = new apb(i8, bArr, readUnsignedShort3, readInt);
                                        HashMap hashMap = hashMapArr2[i];
                                        String str = bpbVar.b;
                                        hashMap.put(str, apbVar);
                                        if ("DNGVersion".equals(str)) {
                                            this.c = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && apbVar.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && apbVar.e(this.f) == 65535)) {
                                            this.c = 8;
                                        }
                                        if (dpbVar.b != j7) {
                                            dpbVar.b(j7);
                                        }
                                    }
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            } else {
                                z3 = true;
                                if (z3) {
                                }
                                s3 = (short) (s2 + 1);
                                i4 = i;
                                hashSet3 = hashSet2;
                                readShort = s4;
                                z4 = z2;
                            }
                        } else if (z2) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[readUnsignedShort3] + ") is unexpected for tag: " + bpbVar2.b);
                        }
                    }
                }
                j = j5;
                if (z2) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j2 = 0;
                z3 = false;
                if (z3) {
                }
                s3 = (short) (s2 + 1);
                i4 = i;
                hashSet3 = hashSet2;
                readShort = s4;
                z4 = z2;
            } else if (z2) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            j = j5;
            j2 = 0;
            z3 = false;
            if (z3) {
            }
            s3 = (short) (s2 + 1);
            i4 = i;
            hashSet3 = hashSet2;
            readShort = s4;
            z4 = z2;
        }
        HashSet hashSet4 = hashSet3;
        boolean z5 = z4;
        int readInt3 = dpbVar.readInt();
        if (z5) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j8 = readInt3;
        if (j8 <= 0) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z5) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        dpbVar.b(j8);
        if (hashMapArr[4].isEmpty()) {
            t(dpbVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            t(dpbVar, 5);
        }
    }

    public final void u(int i, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void v(zob zobVar) {
        apb apbVar;
        int e;
        HashMap hashMap = this.d[4];
        apb apbVar2 = (apb) hashMap.get("Compression");
        if (apbVar2 == null) {
            n(zobVar, hashMap);
            return;
        }
        int e2 = apbVar2.e(this.f);
        if (e2 != 1) {
            if (e2 == 6) {
                n(zobVar, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        apb apbVar3 = (apb) hashMap.get("BitsPerSample");
        if (apbVar3 != null) {
            int[] iArr = (int[]) apbVar3.g(this.f);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (apbVar = (apb) hashMap.get("PhotometricInterpretation")) != null && (((e = apbVar.e(this.f)) == 1 && Arrays.equals(iArr, n)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                apb apbVar4 = (apb) hashMap.get("StripOffsets");
                apb apbVar5 = (apb) hashMap.get("StripByteCounts");
                if (apbVar4 == null || apbVar5 == null) {
                    return;
                }
                long[] E2 = c3x.E(apbVar4.g(this.f));
                long[] E3 = c3x.E(apbVar5.g(this.f));
                if (E2 == null || E2.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (E3 == null || E3.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (E2.length != E3.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : E3) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < E2.length; i3++) {
                    int i4 = (int) E2[i3];
                    int i5 = (int) E3[i3];
                    if (i3 < E2.length - 1 && i4 + i5 != E2[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        zobVar.a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            zobVar.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.g) {
                    long j3 = E2[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void w(int i, int i2) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = l;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        apb apbVar = (apb) hashMapArr[i].get("ImageLength");
        apb apbVar2 = (apb) hashMapArr[i].get("ImageWidth");
        apb apbVar3 = (apb) hashMapArr[i2].get("ImageLength");
        apb apbVar4 = (apb) hashMapArr[i2].get("ImageWidth");
        if (apbVar == null || apbVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (apbVar3 == null || apbVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = apbVar.e(this.f);
        int e2 = apbVar2.e(this.f);
        int e3 = apbVar3.e(this.f);
        int e4 = apbVar4.e(this.f);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void x(dpb dpbVar, int i) {
        apb c;
        apb c2;
        HashMap[] hashMapArr = this.d;
        apb apbVar = (apb) hashMapArr[i].get("DefaultCropSize");
        apb apbVar2 = (apb) hashMapArr[i].get("SensorTopBorder");
        apb apbVar3 = (apb) hashMapArr[i].get("SensorLeftBorder");
        apb apbVar4 = (apb) hashMapArr[i].get("SensorBottomBorder");
        apb apbVar5 = (apb) hashMapArr[i].get("SensorRightBorder");
        if (apbVar != null) {
            int i2 = apbVar.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                cpb[] cpbVarArr = (cpb[]) apbVar.g(byteOrder);
                if (cpbVarArr == null || cpbVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(cpbVarArr));
                    return;
                }
                c = apb.b(cpbVarArr[0], this.f);
                c2 = apb.b(cpbVarArr[1], this.f);
            } else {
                int[] iArr = (int[]) apbVar.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = apb.c(iArr[0], this.f);
                c2 = apb.c(iArr[1], this.f);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (apbVar2 != null && apbVar3 != null && apbVar4 != null && apbVar5 != null) {
            int e = apbVar2.e(this.f);
            int e2 = apbVar4.e(this.f);
            int e3 = apbVar5.e(this.f);
            int e4 = apbVar3.e(this.f);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            apb c3 = apb.c(e2 - e, this.f);
            apb c4 = apb.c(e3 - e4, this.f);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        apb apbVar6 = (apb) hashMapArr[i].get("ImageLength");
        apb apbVar7 = (apb) hashMapArr[i].get("ImageWidth");
        if (apbVar6 == null || apbVar7 == null) {
            apb apbVar8 = (apb) hashMapArr[i].get("JPEGInterchangeFormat");
            apb apbVar9 = (apb) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (apbVar8 == null || apbVar9 == null) {
                return;
            }
            int e5 = apbVar8.e(this.f);
            int e6 = apbVar8.e(this.f);
            dpbVar.b(e5);
            byte[] bArr = new byte[e6];
            dpbVar.readFully(bArr);
            f(new zob(bArr), e5, i);
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] hashMapArr = this.d;
        apb apbVar = (apb) hashMapArr[1].get("PixelXDimension");
        apb apbVar2 = (apb) hashMapArr[1].get("PixelYDimension");
        if (apbVar != null && apbVar2 != null) {
            hashMapArr[0].put("ImageWidth", apbVar);
            hashMapArr[0].put("ImageLength", apbVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
