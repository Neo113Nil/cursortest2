package androidx.camera.core.impl.utils;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.trace.core.scopemanager.ScopeStack;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.time.zzhh;
import com.google.android.libraries.places.internal.zzbmt;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzur;
import com.google.android.libraries.places.internal.zzvd;
import com.google.crypto.tink.aead.internal.AesGcmSiv;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class Exif {
    public final ExifInterface mExifInterface;
    public static final AnonymousClass1 DATE_FORMAT = new AnonymousClass1(0);
    public static final AnonymousClass1 TIME_FORMAT = new AnonymousClass1(1);
    public static final AnonymousClass1 DATETIME_FORMAT = new AnonymousClass1(2);
    public static final List ALL_EXIF_TAGS = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List DO_NOT_COPY_EXIF_TAGS = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: androidx.camera.core.impl.utils.Exif$1, reason: invalid class name */
    public final class AnonymousClass1 extends ThreadLocal {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            switch (this.$r8$classId) {
                case 0:
                    return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                case 1:
                    return new SimpleDateFormat("HH:mm:ss", Locale.US);
                case 2:
                    return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                case 3:
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        return zzabp.mainThreadExecutor();
                    }
                    if (Looper.myLooper() != null) {
                        return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
                    }
                    return null;
                case 4:
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    return simpleDateFormat;
                case 5:
                    ScopeStack scopeStack = new ScopeStack();
                    new ArrayDeque();
                    return scopeStack;
                case 6:
                    try {
                        return MessageDigest.getInstance("SHA-256");
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                case 7:
                    return Boolean.FALSE;
                case 8:
                    return new Random();
                case 9:
                    return new Random();
                case 10:
                    zzhh zzhhVar = new zzhh();
                    zzhhVar.zzb = 0;
                    return zzhhVar;
                case 11:
                    AnonymousClass1 anonymousClass1 = zzbmt.zzb;
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
                    gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                    simpleDateFormat2.setCalendar(gregorianCalendar);
                    return simpleDateFormat2;
                case 12:
                    Thread.currentThread();
                    if (zzie.f71zza == null) {
                        zzie.f71zza = Looper.getMainLooper().getThread();
                    }
                    zzvd zzvdVar = new zzvd();
                    zzvdVar.zza = false;
                    zzvdVar.zzb = null;
                    Thread currentThread = Thread.currentThread();
                    WeakHashMap weakHashMap = zzur.zzd;
                    synchronized (weakHashMap) {
                        weakHashMap.put(currentThread, zzvdVar);
                    }
                    return zzvdVar;
                case 13:
                    return new char[1024];
                case 14:
                    try {
                        return (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/GCM/NoPadding");
                    } catch (GeneralSecurityException e2) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e2);
                        return null;
                    }
                case 15:
                    try {
                        Cipher cipher = (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/GCM-SIV/NoPadding");
                        if (AesGcmSiv.isAesGcmSivCipher(cipher)) {
                            return cipher;
                        }
                        return null;
                    } catch (GeneralSecurityException e3) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e3);
                        return null;
                    }
                case 16:
                    try {
                        return (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/ECB/NoPadding");
                    } catch (GeneralSecurityException e4) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e4);
                        return null;
                    }
                case 17:
                    try {
                        return (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/CTR/NoPadding");
                    } catch (GeneralSecurityException e5) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e5);
                        return null;
                    }
                case 18:
                    try {
                        return (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/CTR/NOPADDING");
                    } catch (GeneralSecurityException e6) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e6);
                        return null;
                    }
                case 19:
                    try {
                        return (Cipher) EngineFactory.CIPHER.policy.getInstance("AES/CTR/NoPadding");
                    } catch (GeneralSecurityException e7) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e7);
                        return null;
                    }
                default:
                    return new WeakConcurrentMap.LookupKey();
            }
        }
    }

    public Exif(ExifInterface exifInterface) {
        this.mExifInterface = exifInterface;
    }

    public final void copyToCroppedImage(Exif exif) {
        ExifInterface exifInterface = exif.mExifInterface;
        ArrayList arrayList = new ArrayList(ALL_EXIF_TAGS);
        arrayList.removeAll(DO_NOT_COPY_EXIF_TAGS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String attribute = this.mExifInterface.getAttribute(str);
            String attribute2 = exifInterface.getAttribute(str);
            if (attribute != null && !attribute.equals(attribute2)) {
                exifInterface.setAttribute(str, attribute);
            }
        }
    }

    public final int getRotation() {
        switch (this.mExifInterface.getAttributeInt(0, "Orientation")) {
            case 3:
            case 4:
                return EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
            case 5:
            case 8:
                return EnumC0170g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void rotate(int i) {
        int i2 = i % 90;
        ExifInterface exifInterface = this.mExifInterface;
        if (i2 != 0) {
            Locale locale = Locale.US;
            StringUtilsKt.w("Exif", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            exifInterface.setAttribute("Orientation", String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int attributeInt = exifInterface.getAttributeInt(0, "Orientation");
        while (i3 < 0) {
            i3 += 90;
            switch (attributeInt) {
                case 2:
                    attributeInt = 5;
                    break;
                case 3:
                case 8:
                    attributeInt = 6;
                    break;
                case 4:
                    attributeInt = 7;
                    break;
                case 5:
                    attributeInt = 4;
                    break;
                case 6:
                    attributeInt = 1;
                    break;
                case 7:
                    attributeInt = 2;
                    break;
                default:
                    attributeInt = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (attributeInt) {
                case 2:
                    attributeInt = 7;
                    break;
                case 3:
                    attributeInt = 8;
                    break;
                case 4:
                    attributeInt = 5;
                    break;
                case 5:
                    attributeInt = 2;
                    break;
                case 6:
                    attributeInt = 3;
                    break;
                case 7:
                    attributeInt = 4;
                    break;
                case 8:
                    attributeInt = 1;
                    break;
                default:
                    attributeInt = 6;
                    break;
            }
        }
        exifInterface.setAttribute("Orientation", String.valueOf(attributeInt));
    }

    public final void save() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass1 anonymousClass1 = DATETIME_FORMAT;
        String format2 = ((SimpleDateFormat) anonymousClass1.get()).format(new Date(currentTimeMillis));
        ExifInterface exifInterface = this.mExifInterface;
        exifInterface.setAttribute("DateTime", format2);
        try {
            exifInterface.setAttribute("SubSecTime", Long.toString(currentTimeMillis - ((SimpleDateFormat) anonymousClass1.get()).parse(format2).getTime()));
        } catch (ParseException unused) {
        }
        exifInterface.saveAttributes();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|1|(1:124)(1:7)|8|(1:10)(1:123)|11|(1:122)(27:16|17|18|19|(22:115|116|22|(1:114)(3:(1:26)(1:113)|27|28)|29|(16:109|110|32|(1:34)|35|(11:96|(1:98)(1:(1:102)(11:103|104|105|(1:41)(9:(1:68)(1:95)|69|70|(1:72)|73|(6:75|(2:77|(2:79|(4:83|84|85|86))(1:88))(1:90)|87|84|85|86)|91|(1:93)|94)|42|(6:63|64|45|(3:47|(5:50|51|(3:54|56|52)|57|58)|49)|60|61)|44|45|(0)|60|61))|99|(0)(0)|42|(0)|44|45|(0)|60|61)|38|39|(0)(0)|42|(0)|44|45|(0)|60|61)|31|32|(0)|35|(0)|96|(0)(0)|99|(0)(0)|42|(0)|44|45|(0)|60|61)|21|22|(0)|114|29|(0)|31|32|(0)|35|(0)|96|(0)(0)|99|(0)(0)|42|(0)|44|45|(0)|60|61)|121|19|(0)|21|22|(0)|114|29|(0)|31|32|(0)|35|(0)|96|(0)(0)|99|(0)(0)|42|(0)|44|45|(0)|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        if (r3.equals("M") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116 A[Catch: ParseException -> 0x010f, TRY_ENTER, TryCatch #0 {ParseException -> 0x010f, blocks: (B:98:0x0116, B:102:0x012b), top: B:96:0x0114 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        char c;
        double[] dArr;
        char c2;
        ExifInterface.ExifAttribute exifAttribute;
        double doubleValue;
        boolean z;
        String str;
        double d;
        ExifInterface.ExifAttribute exifAttribute2;
        double doubleValue2;
        String attribute;
        String attribute2;
        String attribute3;
        Boolean bool;
        long time;
        Integer num;
        Integer num2;
        Location location;
        double d2;
        String attribute4;
        long time2;
        boolean z2;
        Locale locale = Locale.ENGLISH;
        ExifInterface exifInterface = this.mExifInterface;
        Integer valueOf = Integer.valueOf(exifInterface.getAttributeInt(0, "ImageWidth"));
        Integer valueOf2 = Integer.valueOf(exifInterface.getAttributeInt(0, "ImageLength"));
        Integer valueOf3 = Integer.valueOf(getRotation());
        int attributeInt = exifInterface.getAttributeInt(0, "Orientation");
        Boolean valueOf4 = Boolean.valueOf(attributeInt == 4 || attributeInt == 5 || attributeInt == 7);
        Boolean valueOf5 = Boolean.valueOf(exifInterface.getAttributeInt(0, "Orientation") == 2);
        String attribute5 = exifInterface.getAttribute("GPSProcessingMethod");
        String attribute6 = exifInterface.getAttribute("GPSLatitude");
        String attribute7 = exifInterface.getAttribute("GPSLatitudeRef");
        String attribute8 = exifInterface.getAttribute("GPSLongitude");
        String attribute9 = exifInterface.getAttribute("GPSLongitudeRef");
        if (attribute6 != null && attribute7 != null && attribute8 != null && attribute9 != null) {
            try {
                dArr = new double[]{ExifInterface.convertRationalLatLonToDouble(attribute6, attribute7), ExifInterface.convertRationalLatLonToDouble(attribute8, attribute9)};
                c2 = 0;
            } catch (IllegalArgumentException unused) {
                c = 0;
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("latValue=", attribute6, ", latRef=", attribute7, ", lngValue=");
                m.append(attribute8);
                m.append(", lngRef=");
                m.append(attribute9);
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(m.toString()));
            }
            exifAttribute = exifInterface.getExifAttribute("GPSAltitude");
            if (exifAttribute != null) {
                try {
                    doubleValue = exifAttribute.getDoubleValue(exifInterface.mExifByteOrder);
                } catch (NumberFormatException unused2) {
                }
                int i = -1;
                int attributeInt2 = exifInterface.getAttributeInt(-1, "GPSAltitudeRef");
                if (doubleValue >= 0.0d || attributeInt2 < 0) {
                    z = true;
                    str = attribute5;
                    d = 0.0d;
                } else {
                    if (attributeInt2 == 1) {
                        z2 = true;
                    } else {
                        i = 1;
                        z2 = true;
                    }
                    str = attribute5;
                    d = doubleValue * i;
                    z = z2;
                }
                exifAttribute2 = exifInterface.getExifAttribute("GPSSpeed");
                if (exifAttribute2 != null) {
                    try {
                        doubleValue2 = exifAttribute2.getDoubleValue(exifInterface.mExifByteOrder);
                    } catch (NumberFormatException unused3) {
                    }
                    attribute = exifInterface.getAttribute("GPSSpeedRef");
                    boolean z3 = z;
                    if (attribute == null) {
                        attribute = "K";
                    }
                    attribute2 = exifInterface.getAttribute("GPSDateStamp");
                    attribute3 = exifInterface.getAttribute("GPSTimeStamp");
                    AnonymousClass1 anonymousClass1 = DATETIME_FORMAT;
                    long j = -1;
                    if (attribute2 == null || attribute3 != null) {
                        if (attribute3 != null) {
                            time = ((SimpleDateFormat) DATE_FORMAT.get()).parse(attribute2).getTime();
                        } else {
                            if (attribute2 != null) {
                                bool = valueOf5;
                                try {
                                    time = ((SimpleDateFormat) anonymousClass1.get()).parse(Recorder$$ExternalSyntheticOutline2.m(attribute2, " ", attribute3)).getTime();
                                } catch (ParseException unused4) {
                                }
                                if (dArr != null) {
                                    num = valueOf;
                                    num2 = valueOf2;
                                    location = null;
                                } else {
                                    double[] dArr2 = dArr;
                                    Location location2 = new Location(str == null ? "Exif" : str);
                                    num = valueOf;
                                    num2 = valueOf2;
                                    location2.setLatitude(dArr2[c2]);
                                    location2.setLongitude(dArr2[z3 ? 1 : 0]);
                                    if (d != 0.0d) {
                                        location2.setAltitude(d);
                                    }
                                    if (doubleValue2 != 0.0d) {
                                        int hashCode = attribute.hashCode();
                                        if (hashCode == 75) {
                                            attribute.equals("K");
                                        } else if (hashCode != 77) {
                                            if (hashCode == 78 && attribute.equals("N")) {
                                                d2 = 1.15078d;
                                                doubleValue2 *= d2;
                                                location2.setSpeed((float) (doubleValue2 / 2.23694d));
                                            }
                                        }
                                        d2 = 0.621371d;
                                        doubleValue2 *= d2;
                                        location2.setSpeed((float) (doubleValue2 / 2.23694d));
                                    }
                                    if (time != -1) {
                                        location2.setTime(time);
                                    }
                                    location = location2;
                                }
                                attribute4 = exifInterface.getAttribute("DateTimeOriginal");
                                if (attribute4 != null) {
                                    try {
                                        time2 = ((SimpleDateFormat) anonymousClass1.get()).parse(attribute4).getTime();
                                    } catch (ParseException unused5) {
                                    }
                                    if (time2 != -1) {
                                        String attribute10 = exifInterface.getAttribute("SubSecTimeOriginal");
                                        if (attribute10 != null) {
                                            try {
                                                long parseLong = Long.parseLong(attribute10);
                                                while (parseLong > 1000) {
                                                    parseLong /= 10;
                                                }
                                                j = time2 + parseLong;
                                            } catch (NumberFormatException unused6) {
                                            }
                                        }
                                        j = time2;
                                    }
                                    return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j), exifInterface.getAttribute("ImageDescription"));
                                }
                                time2 = -1;
                                if (time2 != -1) {
                                }
                                return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j), exifInterface.getAttribute("ImageDescription"));
                            }
                            time = ((SimpleDateFormat) TIME_FORMAT.get()).parse(attribute3).getTime();
                        }
                        bool = valueOf5;
                        if (dArr != null) {
                        }
                        attribute4 = exifInterface.getAttribute("DateTimeOriginal");
                        if (attribute4 != null) {
                        }
                        time2 = -1;
                        if (time2 != -1) {
                        }
                        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j), exifInterface.getAttribute("ImageDescription"));
                    }
                    bool = valueOf5;
                    time = -1;
                    if (dArr != null) {
                    }
                    attribute4 = exifInterface.getAttribute("DateTimeOriginal");
                    if (attribute4 != null) {
                    }
                    time2 = -1;
                    if (time2 != -1) {
                    }
                    return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j), exifInterface.getAttribute("ImageDescription"));
                }
                doubleValue2 = 0.0d;
                attribute = exifInterface.getAttribute("GPSSpeedRef");
                boolean z32 = z;
                if (attribute == null) {
                }
                attribute2 = exifInterface.getAttribute("GPSDateStamp");
                attribute3 = exifInterface.getAttribute("GPSTimeStamp");
                AnonymousClass1 anonymousClass12 = DATETIME_FORMAT;
                long j2 = -1;
                if (attribute2 == null) {
                }
                if (attribute3 != null) {
                }
                bool = valueOf5;
                if (dArr != null) {
                }
                attribute4 = exifInterface.getAttribute("DateTimeOriginal");
                if (attribute4 != null) {
                }
                time2 = -1;
                if (time2 != -1) {
                }
                return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j2), exifInterface.getAttribute("ImageDescription"));
            }
            doubleValue = -1.0d;
            int i2 = -1;
            int attributeInt22 = exifInterface.getAttributeInt(-1, "GPSAltitudeRef");
            if (doubleValue >= 0.0d) {
            }
            z = true;
            str = attribute5;
            d = 0.0d;
            exifAttribute2 = exifInterface.getExifAttribute("GPSSpeed");
            if (exifAttribute2 != null) {
            }
            doubleValue2 = 0.0d;
            attribute = exifInterface.getAttribute("GPSSpeedRef");
            boolean z322 = z;
            if (attribute == null) {
            }
            attribute2 = exifInterface.getAttribute("GPSDateStamp");
            attribute3 = exifInterface.getAttribute("GPSTimeStamp");
            AnonymousClass1 anonymousClass122 = DATETIME_FORMAT;
            long j22 = -1;
            if (attribute2 == null) {
            }
            if (attribute3 != null) {
            }
            bool = valueOf5;
            if (dArr != null) {
            }
            attribute4 = exifInterface.getAttribute("DateTimeOriginal");
            if (attribute4 != null) {
            }
            time2 = -1;
            if (time2 != -1) {
            }
            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j22), exifInterface.getAttribute("ImageDescription"));
        }
        c = 0;
        dArr = null;
        c2 = c;
        exifAttribute = exifInterface.getExifAttribute("GPSAltitude");
        if (exifAttribute != null) {
        }
        doubleValue = -1.0d;
        int i22 = -1;
        int attributeInt222 = exifInterface.getAttributeInt(-1, "GPSAltitudeRef");
        if (doubleValue >= 0.0d) {
        }
        z = true;
        str = attribute5;
        d = 0.0d;
        exifAttribute2 = exifInterface.getExifAttribute("GPSSpeed");
        if (exifAttribute2 != null) {
        }
        doubleValue2 = 0.0d;
        attribute = exifInterface.getAttribute("GPSSpeedRef");
        boolean z3222 = z;
        if (attribute == null) {
        }
        attribute2 = exifInterface.getAttribute("GPSDateStamp");
        attribute3 = exifInterface.getAttribute("GPSTimeStamp");
        AnonymousClass1 anonymousClass1222 = DATETIME_FORMAT;
        long j222 = -1;
        if (attribute2 == null) {
        }
        if (attribute3 != null) {
        }
        bool = valueOf5;
        if (dArr != null) {
        }
        attribute4 = exifInterface.getAttribute("DateTimeOriginal");
        if (attribute4 != null) {
        }
        time2 = -1;
        if (time2 != -1) {
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num, num2, valueOf3, valueOf4, bool, location, Long.valueOf(j222), exifInterface.getAttribute("ImageDescription"));
    }
}
