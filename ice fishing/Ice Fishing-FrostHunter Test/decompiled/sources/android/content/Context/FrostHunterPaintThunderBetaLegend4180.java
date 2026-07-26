package android.content.Context;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
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
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintThunderBetaLegend4180 {
    public static final FrostHunterRemoteModelManagerPrimeInferno3493[][] FrostHunterBillingClientFusionVortex9008;
    public static final byte[] FrostHunterBitmapTurboDeltaNebula8743;
    public static final byte[] FrostHunterCameraXTurboCelestialHero5430;
    public static final int[] FrostHunterCardViewSpectraCyber7714;
    public static final String[] FrostHunterDatabaseEliteShadowUltra2452;
    public static final byte[] FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public static final byte[] FrostHunterEditTextPulseHyperion1262;
    public static final byte[] FrostHunterFCMDeltaQuantumHero8364;
    public static final byte[] FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public static final int[] FrostHunterLightSensorForceFusion4241;
    public static final byte[] FrostHunterLintTitanVortexQuantum9911;
    public static final byte[] FrostHunterLooperHyperionForce4133;
    public static final byte[] FrostHunterLooperThreadBetaHyperionMax1000;
    public static final Set FrostHunterMagnetometerFusionTitanium8202;
    public static final FrostHunterRemoteModelManagerPrimeInferno3493[] FrostHunterMediaPlayerCelestialBetaTitan3868;
    public static final byte[] FrostHunterMeteringPointBetaCyber9571;
    public static final FrostHunterRemoteModelManagerPrimeInferno3493 FrostHunterMeteringPointMegaCyber7955;
    public static final byte[] FrostHunterMotionSceneAuroraMega2271;
    public static final HashMap FrostHunterPagingDataTurboTitanium7332;
    public static final Charset FrostHunterR8MasterNebulaSpark7247;
    public static final byte[] FrostHunterResourcesTitanHyperVision5823;
    public static final byte[] FrostHunterRewardedAdMasterStrike9463;
    public static final int[] FrostHunterScaleAnimationStrikeSpark5059;
    public static final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719 = Log.isLoggable("ExifInterface", 3);
    public static final byte[] FrostHunterServiceInfoHyperionSparkMax9966;
    public static final HashMap[] FrostHunterStateCelestialNovaPixel8414;
    public static final byte[] FrostHunterTextViewDragonStormMega4297;
    public static final HashMap[] FrostHunterTranslateAnimationCyberSolarUltra7101;
    public static final byte[] FrostHunterViewPhantomNeo1634;
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final FileDescriptor FrostHunterAlphaAnimationNeoCosmos5761;
    public int FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public final AssetManager.AssetInputStream FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterFlowMaxDragonHero5809;
    public FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public ByteOrder FrostHunterLevelListDrawableFusionDragonHero2232;
    public final HashSet FrostHunterLifecycleBlazeGammaElite2889;
    public boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public final HashMap[] FrostHunterServiceEliteCelestialThunder1757;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        FrostHunterLightSensorForceFusion4241 = new int[]{8, 8, 8};
        FrostHunterScaleAnimationStrikeSpark5059 = new int[]{8};
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new byte[]{-1, -40, -1};
        FrostHunterLintTitanVortexQuantum9911 = new byte[]{102, 116, 121, 112};
        FrostHunterCameraXTurboCelestialHero5430 = new byte[]{109, 105, 102, 49};
        FrostHunterResourcesTitanHyperVision5823 = new byte[]{104, 101, 105, 99};
        FrostHunterTextViewDragonStormMega4297 = new byte[]{97, 118, 105, 102};
        FrostHunterLooperThreadBetaHyperionMax1000 = new byte[]{97, 118, 105, 115};
        FrostHunterMotionSceneAuroraMega2271 = new byte[]{79, 76, 89, 77, 80, 0};
        FrostHunterBitmapTurboDeltaNebula8743 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        FrostHunterDialogFragmentTurboPhoenixDragon7627 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        FrostHunterLooperHyperionForce4133 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        FrostHunterMeteringPointBetaCyber9571 = new byte[]{82, 73, 70, 70};
        FrostHunterServiceInfoHyperionSparkMax9966 = new byte[]{87, 69, 66, 80};
        FrostHunterEditTextPulseHyperion1262 = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        FrostHunterDatabaseEliteShadowUltra2452 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        FrostHunterCardViewSpectraCyber7714 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        FrostHunterViewPhantomNeo1634 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr = {new FrostHunterRemoteModelManagerPrimeInferno3493("NewSubfileType", 254, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SubfileType", 255, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageWidth", 256, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageLength", 257, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("BitsPerSample", 258, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Compression", 259, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("PhotometricInterpretation", 262, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageDescription", 270, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Make", 271, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Model", 272, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("StripOffsets", 273, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("Orientation", 274, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("SamplesPerPixel", 277, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("RowsPerStrip", 278, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("StripByteCounts", 279, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("XResolution", 282, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("YResolution", 283, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("PlanarConfiguration", 284, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ResolutionUnit", 296, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("TransferFunction", 301, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Software", 305, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("DateTime", 306, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Artist", 315, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("WhitePoint", 318, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("PrimaryChromaticities", 319, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SubIFDPointer", 330, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("JPEGInterchangeFormat", 513, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("JPEGInterchangeFormatLength", 514, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrCoefficients", 529, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrSubSampling", 530, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrPositioning", 531, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ReferenceBlackWhite", 532, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("Copyright", 33432, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("ExifIFDPointer", 34665, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSInfoIFDPointer", 34853, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SensorTopBorder", 4, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SensorLeftBorder", 5, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SensorBottomBorder", 6, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SensorRightBorder", 7, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ISO", 23, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("JpgFromRaw", 46, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("Xmp", 700, 1)};
        FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr2 = {new FrostHunterRemoteModelManagerPrimeInferno3493("ExposureTime", 33434, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("FNumber", 33437, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("ExposureProgram", 34850, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("SpectralSensitivity", 34852, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("PhotographicSensitivity", 34855, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("OECF", 34856, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("SensitivityType", 34864, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("StandardOutputSensitivity", 34865, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("RecommendedExposureIndex", 34866, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ISOSpeed", 34867, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ISOSpeedLatitudeyyy", 34868, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ISOSpeedLatitudezzz", 34869, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ExifVersion", 36864, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("DateTimeOriginal", 36867, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("DateTimeDigitized", 36868, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("OffsetTime", 36880, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("OffsetTimeOriginal", 36881, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("OffsetTimeDigitized", 36882, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("ComponentsConfiguration", 37121, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("CompressedBitsPerPixel", 37122, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("ShutterSpeedValue", 37377, 10), new FrostHunterRemoteModelManagerPrimeInferno3493("ApertureValue", 37378, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("BrightnessValue", 37379, 10), new FrostHunterRemoteModelManagerPrimeInferno3493("ExposureBiasValue", 37380, 10), new FrostHunterRemoteModelManagerPrimeInferno3493("MaxApertureValue", 37381, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SubjectDistance", 37382, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("MeteringMode", 37383, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("LightSource", 37384, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Flash", 37385, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("FocalLength", 37386, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SubjectArea", 37396, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("MakerNote", 37500, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("UserComment", 37510, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("SubSecTime", 37520, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("SubSecTimeOriginal", 37521, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("SubSecTimeDigitized", 37522, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("FlashpixVersion", 40960, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("ColorSpace", 40961, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("PixelXDimension", 40962, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("PixelYDimension", 40963, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("RelatedSoundFile", 40964, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("InteroperabilityIFDPointer", 40965, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("FlashEnergy", 41483, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SpatialFrequencyResponse", 41484, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("FocalPlaneXResolution", 41486, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("FocalPlaneYResolution", 41487, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("FocalPlaneResolutionUnit", 41488, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("SubjectLocation", 41492, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ExposureIndex", 41493, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SensingMethod", 41495, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("FileSource", 41728, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("SceneType", 41729, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("CFAPattern", 41730, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("CustomRendered", 41985, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ExposureMode", 41986, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("WhiteBalance", 41987, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("DigitalZoomRatio", 41988, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("FocalLengthIn35mmFilm", 41989, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("SceneCaptureType", 41990, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("GainControl", 41991, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Contrast", 41992, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Saturation", 41993, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Sharpness", 41994, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("DeviceSettingDescription", 41995, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("SubjectDistanceRange", 41996, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageUniqueID", 42016, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("CameraOwnerName", 42032, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("BodySerialNumber", 42033, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("LensSpecification", 42034, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("LensMake", 42035, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("LensModel", 42036, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Gamma", 42240, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("DNGVersion", 50706, 1), new FrostHunterRemoteModelManagerPrimeInferno3493("DefaultCropSize", 50720, 3, 4)};
        FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr3 = {new FrostHunterRemoteModelManagerPrimeInferno3493("GPSVersionID", 0, 1), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSLatitudeRef", 1, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSLatitude", 2, 5, 10), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSLongitudeRef", 3, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSLongitude", 4, 5, 10), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSAltitudeRef", 5, 1), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSAltitude", 6, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSTimeStamp", 7, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSSatellites", 8, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSStatus", 9, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSMeasureMode", 10, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDOP", 11, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSSpeedRef", 12, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSSpeed", 13, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSTrackRef", 14, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSTrack", 15, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSImgDirectionRef", 16, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSImgDirection", 17, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSMapDatum", 18, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestLatitudeRef", 19, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestLatitude", 20, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestLongitudeRef", 21, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestLongitude", 22, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestBearingRef", 23, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestBearing", 24, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestDistanceRef", 25, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDestDistance", 26, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSProcessingMethod", 27, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSAreaInformation", 28, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDateStamp", 29, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSDifferential", 30, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSHPositioningError", 31, 5)};
        FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr4 = {new FrostHunterRemoteModelManagerPrimeInferno3493("InteroperabilityIndex", 1, 2)};
        FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr5 = {new FrostHunterRemoteModelManagerPrimeInferno3493("NewSubfileType", 254, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("SubfileType", 255, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ThumbnailImageWidth", 256, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ThumbnailImageLength", 257, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("BitsPerSample", 258, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Compression", 259, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("PhotometricInterpretation", 262, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageDescription", 270, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Make", 271, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Model", 272, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("StripOffsets", 273, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ThumbnailOrientation", 274, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("SamplesPerPixel", 277, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("RowsPerStrip", 278, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("StripByteCounts", 279, 3, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("XResolution", 282, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("YResolution", 283, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("PlanarConfiguration", 284, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ResolutionUnit", 296, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("TransferFunction", 301, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("Software", 305, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("DateTime", 306, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("Artist", 315, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("WhitePoint", 318, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("PrimaryChromaticities", 319, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("SubIFDPointer", 330, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("JPEGInterchangeFormat", 513, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("JPEGInterchangeFormatLength", 514, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrCoefficients", 529, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrSubSampling", 530, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("YCbCrPositioning", 531, 3), new FrostHunterRemoteModelManagerPrimeInferno3493("ReferenceBlackWhite", 532, 5), new FrostHunterRemoteModelManagerPrimeInferno3493("Copyright", 33432, 2), new FrostHunterRemoteModelManagerPrimeInferno3493("ExifIFDPointer", 34665, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSInfoIFDPointer", 34853, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("DNGVersion", 50706, 1), new FrostHunterRemoteModelManagerPrimeInferno3493("DefaultCropSize", 50720, 3, 4)};
        FrostHunterMeteringPointMegaCyber7955 = new FrostHunterRemoteModelManagerPrimeInferno3493("StripOffsets", 273, 3);
        FrostHunterBillingClientFusionVortex9008 = new FrostHunterRemoteModelManagerPrimeInferno3493[][]{frostHunterRemoteModelManagerPrimeInferno3493Arr, frostHunterRemoteModelManagerPrimeInferno3493Arr2, frostHunterRemoteModelManagerPrimeInferno3493Arr3, frostHunterRemoteModelManagerPrimeInferno3493Arr4, frostHunterRemoteModelManagerPrimeInferno3493Arr5, frostHunterRemoteModelManagerPrimeInferno3493Arr, new FrostHunterRemoteModelManagerPrimeInferno3493[]{new FrostHunterRemoteModelManagerPrimeInferno3493("ThumbnailImage", 256, 7), new FrostHunterRemoteModelManagerPrimeInferno3493("CameraSettingsIFDPointer", 8224, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageProcessingIFDPointer", 8256, 4)}, new FrostHunterRemoteModelManagerPrimeInferno3493[]{new FrostHunterRemoteModelManagerPrimeInferno3493("PreviewImageStart", 257, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("PreviewImageLength", 258, 4)}, new FrostHunterRemoteModelManagerPrimeInferno3493[]{new FrostHunterRemoteModelManagerPrimeInferno3493("AspectFrame", 4371, 3)}, new FrostHunterRemoteModelManagerPrimeInferno3493[]{new FrostHunterRemoteModelManagerPrimeInferno3493("ColorSpace", 55, 3)}};
        FrostHunterMediaPlayerCelestialBetaTitan3868 = new FrostHunterRemoteModelManagerPrimeInferno3493[]{new FrostHunterRemoteModelManagerPrimeInferno3493("SubIFDPointer", 330, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("ExifIFDPointer", 34665, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("GPSInfoIFDPointer", 34853, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("InteroperabilityIFDPointer", 40965, 4), new FrostHunterRemoteModelManagerPrimeInferno3493("CameraSettingsIFDPointer", 8224, 1), new FrostHunterRemoteModelManagerPrimeInferno3493("ImageProcessingIFDPointer", 8256, 1)};
        FrostHunterTranslateAnimationCyberSolarUltra7101 = new HashMap[10];
        FrostHunterStateCelestialNovaPixel8414 = new HashMap[10];
        FrostHunterMagnetometerFusionTitanium8202 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        FrostHunterPagingDataTurboTitanium7332 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        FrostHunterR8MasterNebulaSpark7247 = forName;
        FrostHunterFCMDeltaQuantumHero8364 = "Exif\u0000\u0000".getBytes(forName);
        FrostHunterRewardedAdMasterStrike9463 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            FrostHunterRemoteModelManagerPrimeInferno3493[][] frostHunterRemoteModelManagerPrimeInferno3493Arr6 = FrostHunterBillingClientFusionVortex9008;
            if (i >= frostHunterRemoteModelManagerPrimeInferno3493Arr6.length) {
                HashMap hashMap = FrostHunterPagingDataTurboTitanium7332;
                FrostHunterRemoteModelManagerPrimeInferno3493[] frostHunterRemoteModelManagerPrimeInferno3493Arr7 = FrostHunterMediaPlayerCelestialBetaTitan3868;
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[0].FrostHunterAlphaAnimationNeoCosmos5761), 5);
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[1].FrostHunterAlphaAnimationNeoCosmos5761), 1);
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[2].FrostHunterAlphaAnimationNeoCosmos5761), 2);
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[3].FrostHunterAlphaAnimationNeoCosmos5761), 3);
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[4].FrostHunterAlphaAnimationNeoCosmos5761), 7);
                hashMap.put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493Arr7[5].FrostHunterAlphaAnimationNeoCosmos5761), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            FrostHunterTranslateAnimationCyberSolarUltra7101[i] = new HashMap();
            FrostHunterStateCelestialNovaPixel8414[i] = new HashMap();
            for (FrostHunterRemoteModelManagerPrimeInferno3493 frostHunterRemoteModelManagerPrimeInferno3493 : frostHunterRemoteModelManagerPrimeInferno3493Arr6[i]) {
                FrostHunterTranslateAnimationCyberSolarUltra7101[i].put(Integer.valueOf(frostHunterRemoteModelManagerPrimeInferno3493.FrostHunterAlphaAnimationNeoCosmos5761), frostHunterRemoteModelManagerPrimeInferno3493);
                FrostHunterStateCelestialNovaPixel8414[i].put(frostHunterRemoteModelManagerPrimeInferno3493.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterRemoteModelManagerPrimeInferno3493);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00db A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterPaintThunderBetaLegend4180(InputStream inputStream) {
        FrostHunterRemoteModelManagerPrimeInferno3493[][] frostHunterRemoteModelManagerPrimeInferno3493Arr = FrostHunterBillingClientFusionVortex9008;
        this.FrostHunterServiceEliteCelestialThunder1757 = new HashMap[frostHunterRemoteModelManagerPrimeInferno3493Arr.length];
        this.FrostHunterLifecycleBlazeGammaElite2889 = new HashSet(frostHunterRemoteModelManagerPrimeInferno3493Arr.length);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = (AssetManager.AssetInputStream) inputStream;
            this.FrostHunterAlphaAnimationNeoCosmos5761 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                    this.FrostHunterAlphaAnimationNeoCosmos5761 = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
            this.FrostHunterAlphaAnimationNeoCosmos5761 = null;
        }
        boolean z = FrostHunterServiceConnectionTurboPhoenixOmega6719;
        for (int i = 0; i < frostHunterRemoteModelManagerPrimeInferno3493Arr.length; i++) {
            try {
                this.FrostHunterServiceEliteCelestialThunder1757[i] = new HashMap();
            } catch (IOException | UnsupportedOperationException unused2) {
                FrostHunterAlphaAnimationNeoCosmos5761();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                FrostHunterAlphaAnimationNeoCosmos5761();
                if (z) {
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(bufferedInputStream);
        this.FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableFusionDragonHero2232;
        if (FrostHunterLevelListDrawableFusionDragonHero2232 != 4 && FrostHunterLevelListDrawableFusionDragonHero2232 != 9 && FrostHunterLevelListDrawableFusionDragonHero2232 != 13 && FrostHunterLevelListDrawableFusionDragonHero2232 != 14) {
            FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490 = new FrostHunterAlertDialogInfernoInfernoStrike1490(bufferedInputStream);
            int i2 = this.FrostHunterBundlePulseFusionHero2475;
            if (i2 != 12 && i2 != 15) {
                if (i2 == 7) {
                    FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAlertDialogInfernoInfernoStrike1490);
                } else if (i2 == 10) {
                    FrostHunterKeyframeGammaGamma1197(frostHunterAlertDialogInfernoInfernoStrike1490);
                } else {
                    FrostHunterAlertDialogAuroraDelta3200(frostHunterAlertDialogInfernoInfernoStrike1490);
                }
                frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterCameraXPixelTurboCosmos9814);
                FrostHunterLooperThreadBetaHyperionMax1000(frostHunterAlertDialogInfernoInfernoStrike1490);
                FrostHunterAlphaAnimationNeoCosmos5761();
                if (!z) {
                    return;
                }
                FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
            }
            FrostHunterServiceEliteCelestialThunder1757(frostHunterAlertDialogInfernoInfernoStrike1490, i2);
            frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterLooperThreadBetaHyperionMax1000(frostHunterAlertDialogInfernoInfernoStrike1490);
            FrostHunterAlphaAnimationNeoCosmos5761();
            if (!z) {
            }
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        }
        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956 = new FrostHunterGuidelineAuroraStrike4956(bufferedInputStream);
        int i3 = this.FrostHunterBundlePulseFusionHero2475;
        if (i3 == 4) {
            FrostHunterLifecycleBlazeGammaElite2889(frostHunterGuidelineAuroraStrike4956, 0, 0);
        } else if (i3 == 13) {
            FrostHunterCameraXPixelTurboCosmos9814(frostHunterGuidelineAuroraStrike4956);
        } else if (i3 == 9) {
            FrostHunterFlowMaxDragonHero5809(frostHunterGuidelineAuroraStrike4956);
        } else if (i3 == 14) {
            FrostHunterFragmentBetaMegaVortex6025(frostHunterGuidelineAuroraStrike4956);
        }
        FrostHunterAlphaAnimationNeoCosmos5761();
        if (!z) {
        }
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
    }

    public static ByteOrder FrostHunterLintTitanVortexQuantum9911(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956) {
        short readShort = frostHunterGuidelineAuroraStrike4956.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(Integer.toHexString(readShort), "Invalid byte order: ");
        return null;
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490) {
        FrostHunterScaleAnimationStrikeSpark5059(frostHunterAlertDialogInfernoInfernoStrike1490);
        FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, 0);
        FrostHunterBitmapTurboDeltaNebula8743(frostHunterAlertDialogInfernoInfernoStrike1490, 0);
        FrostHunterBitmapTurboDeltaNebula8743(frostHunterAlertDialogInfernoInfernoStrike1490, 5);
        FrostHunterBitmapTurboDeltaNebula8743(frostHunterAlertDialogInfernoInfernoStrike1490, 4);
        FrostHunterDialogFragmentTurboPhoenixDragon7627();
        if (this.FrostHunterBundlePulseFusionHero2475 == 8) {
            HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[1].get("MakerNote");
            if (frostHunterLevelListDrawableAuroraTurboDelta7963 != null) {
                FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike14902 = new FrostHunterAlertDialogInfernoInfernoStrike1490(frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterServiceEliteCelestialThunder1757);
                frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterAlphaAnimationNeoCosmos5761(6);
                FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike14902, 9);
                FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[9].get("ColorSpace");
                if (frostHunterLevelListDrawableAuroraTurboDelta79632 != null) {
                    hashMapArr[1].put("ColorSpace", frostHunterLevelListDrawableAuroraTurboDelta79632);
                }
            }
        }
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        String FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633("DateTimeOriginal");
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null && FrostHunterConstraintSetCloneMasterUltraRogue2633("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = FrostHunterConstraintSetCloneMasterUltraRogue2633.concat("\u0000").getBytes(FrostHunterR8MasterNebulaSpark7247);
            hashMap.put("DateTime", new FrostHunterLevelListDrawableAuroraTurboDelta7963(bytes, 2, bytes.length));
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(0L, this.FrostHunterLevelListDrawableFusionDragonHero2232));
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(0L, this.FrostHunterLevelListDrawableFusionDragonHero2232));
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633("Orientation") == null) {
            hashMapArr[0].put("Orientation", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(0L, this.FrostHunterLevelListDrawableFusionDragonHero2232));
        }
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633("LightSource") == null) {
            hashMapArr[1].put("LightSource", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(0L, this.FrostHunterLevelListDrawableFusionDragonHero2232));
        }
    }

    public final void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490, int i) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24752;
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("DefaultCropSize");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("SensorTopBorder");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("SensorLeftBorder");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79634 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("SensorBottomBorder");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79635 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("SensorRightBorder");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 != null) {
            int i2 = frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761;
            ByteOrder byteOrder = this.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (i2 == 5) {
                FrostHunterConstraintSetTitaniumGamma8871[] frostHunterConstraintSetTitaniumGamma8871Arr = (FrostHunterConstraintSetTitaniumGamma8871[]) frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterRemoteConfigSpeedSpeed8566(byteOrder);
                if (frostHunterConstraintSetTitaniumGamma8871Arr == null || frostHunterConstraintSetTitaniumGamma8871Arr.length != 2) {
                    Arrays.toString(frostHunterConstraintSetTitaniumGamma8871Arr);
                    return;
                } else {
                    FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterConstraintSetTitaniumGamma8871Arr[0], this.FrostHunterLevelListDrawableFusionDragonHero2232);
                    FrostHunterBundlePulseFusionHero24752 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterConstraintSetTitaniumGamma8871Arr[1], this.FrostHunterLevelListDrawableFusionDragonHero2232);
                }
            } else {
                int[] iArr = (int[]) frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterRemoteConfigSpeedSpeed8566(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(iArr[0], this.FrostHunterLevelListDrawableFusionDragonHero2232);
                    FrostHunterBundlePulseFusionHero24752 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(iArr[1], this.FrostHunterLevelListDrawableFusionDragonHero2232);
                }
            }
            hashMapArr[i].put("ImageWidth", FrostHunterBundlePulseFusionHero2475);
            hashMapArr[i].put("ImageLength", FrostHunterBundlePulseFusionHero24752);
            return;
        }
        if (frostHunterLevelListDrawableAuroraTurboDelta79632 != null && frostHunterLevelListDrawableAuroraTurboDelta79633 != null && frostHunterLevelListDrawableAuroraTurboDelta79634 != null && frostHunterLevelListDrawableAuroraTurboDelta79635 != null) {
            int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterLevelListDrawableAuroraTurboDelta79632.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            int FrostHunterLifecycleBlazeGammaElite28892 = frostHunterLevelListDrawableAuroraTurboDelta79634.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            int FrostHunterLifecycleBlazeGammaElite28893 = frostHunterLevelListDrawableAuroraTurboDelta79635.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            int FrostHunterLifecycleBlazeGammaElite28894 = frostHunterLevelListDrawableAuroraTurboDelta79633.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            if (FrostHunterLifecycleBlazeGammaElite28892 <= FrostHunterLifecycleBlazeGammaElite2889 || FrostHunterLifecycleBlazeGammaElite28893 <= FrostHunterLifecycleBlazeGammaElite28894) {
                return;
            }
            FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24753 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite28892 - FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232);
            FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24754 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite28893 - FrostHunterLifecycleBlazeGammaElite28894, this.FrostHunterLevelListDrawableFusionDragonHero2232);
            hashMapArr[i].put("ImageLength", FrostHunterBundlePulseFusionHero24753);
            hashMapArr[i].put("ImageWidth", FrostHunterBundlePulseFusionHero24754);
            return;
        }
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79636 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("ImageLength");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79637 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("ImageWidth");
        if (frostHunterLevelListDrawableAuroraTurboDelta79636 == null || frostHunterLevelListDrawableAuroraTurboDelta79637 == null) {
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79638 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("JPEGInterchangeFormat");
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79639 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (frostHunterLevelListDrawableAuroraTurboDelta79638 == null || frostHunterLevelListDrawableAuroraTurboDelta79639 == null) {
                return;
            }
            int FrostHunterLifecycleBlazeGammaElite28895 = frostHunterLevelListDrawableAuroraTurboDelta79638.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            int FrostHunterLifecycleBlazeGammaElite28896 = frostHunterLevelListDrawableAuroraTurboDelta79638.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLifecycleBlazeGammaElite28895);
            byte[] bArr = new byte[FrostHunterLifecycleBlazeGammaElite28896];
            frostHunterAlertDialogInfernoInfernoStrike1490.readFully(bArr);
            FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterGuidelineAuroraStrike4956(bArr), FrostHunterLifecycleBlazeGammaElite28895, i);
        }
    }

    public final FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475(String str) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963;
        int i;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.FrostHunterBundlePulseFusionHero2475) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (frostHunterLevelListDrawableAuroraTurboDelta79632 = this.FrostHunterFragmentBetaMegaVortex6025) != null)) {
            return frostHunterLevelListDrawableAuroraTurboDelta79632;
        }
        for (int i2 = 0; i2 < FrostHunterBillingClientFusionVortex9008.length; i2++) {
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) this.FrostHunterServiceEliteCelestialThunder1757[i2].get(str);
            if (frostHunterLevelListDrawableAuroraTurboDelta79633 != null) {
                return frostHunterLevelListDrawableAuroraTurboDelta79633;
            }
        }
        if (!"Xmp".equals(str) || (frostHunterLevelListDrawableAuroraTurboDelta7963 = this.FrostHunterFragmentBetaMegaVortex6025) == null) {
            return null;
        }
        return frostHunterLevelListDrawableAuroraTurboDelta7963;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956) {
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            Objects.toString(frostHunterGuidelineAuroraStrike4956);
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = ByteOrder.BIG_ENDIAN;
        int i = frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809;
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDialogFragmentTurboPhoenixDragon7627.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int readInt = frostHunterGuidelineAuroraStrike4956.readInt();
                int readInt2 = frostHunterGuidelineAuroraStrike4956.readInt();
                int i2 = frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i4;
                    byte[] bArr = new byte[readInt];
                    frostHunterGuidelineAuroraStrike4956.readFully(bArr);
                    int readInt3 = frostHunterGuidelineAuroraStrike4956.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    FrostHunterCameraXTurboCelestialHero5430(bArr, 0);
                    FrostHunterDialogFragmentTurboPhoenixDragon7627();
                    FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterGuidelineAuroraStrike4956(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = FrostHunterLooperHyperionForce4133;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        frostHunterGuidelineAuroraStrike4956.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809 - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            frostHunterGuidelineAuroraStrike4956.readFully(bArr4);
                            this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterLevelListDrawableAuroraTurboDelta7963(i5, bArr4, 1, i6);
                            z2 = true;
                        }
                    }
                }
                frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(i3 - frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void FrostHunterCameraXTurboCelestialHero5430(byte[] bArr, int i) {
        FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490 = new FrostHunterAlertDialogInfernoInfernoStrike1490(bArr);
        FrostHunterScaleAnimationStrikeSpark5059(frostHunterAlertDialogInfernoInfernoStrike1490);
        FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, i);
    }

    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(str);
        if (FrostHunterBundlePulseFusionHero2475 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i == 5 || i == 10) {
                    FrostHunterConstraintSetTitaniumGamma8871[] frostHunterConstraintSetTitaniumGamma8871Arr = (FrostHunterConstraintSetTitaniumGamma8871[]) FrostHunterBundlePulseFusionHero2475.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterLevelListDrawableFusionDragonHero2232);
                    if (frostHunterConstraintSetTitaniumGamma8871Arr == null || frostHunterConstraintSetTitaniumGamma8871Arr.length != 3) {
                        Arrays.toString(frostHunterConstraintSetTitaniumGamma8871Arr);
                        return null;
                    }
                    FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma8871 = frostHunterConstraintSetTitaniumGamma8871Arr[0];
                    Integer valueOf = Integer.valueOf((int) (frostHunterConstraintSetTitaniumGamma8871.FrostHunterAlphaAnimationNeoCosmos5761 / frostHunterConstraintSetTitaniumGamma8871.FrostHunterConstraintSetCloneMasterUltraRogue2633));
                    FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma88712 = frostHunterConstraintSetTitaniumGamma8871Arr[1];
                    Integer valueOf2 = Integer.valueOf((int) (frostHunterConstraintSetTitaniumGamma88712.FrostHunterAlphaAnimationNeoCosmos5761 / frostHunterConstraintSetTitaniumGamma88712.FrostHunterConstraintSetCloneMasterUltraRogue2633));
                    FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma88713 = frostHunterConstraintSetTitaniumGamma8871Arr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (frostHunterConstraintSetTitaniumGamma88713.FrostHunterAlphaAnimationNeoCosmos5761 / frostHunterConstraintSetTitaniumGamma88713.FrostHunterConstraintSetCloneMasterUltraRogue2633)));
                }
            } else {
                boolean contains = FrostHunterMagnetometerFusionTitanium8202.contains(str);
                ByteOrder byteOrder = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (!contains) {
                    return FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232(byteOrder);
                }
                try {
                    return Double.toString(FrostHunterBundlePulseFusionHero2475.FrostHunterServiceEliteCelestialThunder1757(byteOrder));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final void FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        FrostHunterMotionSceneAuroraMega2271(0, 5);
        FrostHunterMotionSceneAuroraMega2271(0, 4);
        FrostHunterMotionSceneAuroraMega2271(5, 4);
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[1].get("PixelXDimension");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[1].get("PixelYDimension");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 != null && frostHunterLevelListDrawableAuroraTurboDelta79632 != null) {
            hashMapArr[0].put("ImageWidth", frostHunterLevelListDrawableAuroraTurboDelta7963);
            hashMapArr[0].put("ImageLength", frostHunterLevelListDrawableAuroraTurboDelta79632);
        }
        if (hashMapArr[4].isEmpty() && FrostHunterLightSensorForceFusion4241(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        FrostHunterLightSensorForceFusion4241(hashMapArr[4]);
        FrostHunterTextViewDragonStormMega4297("ThumbnailOrientation", 0, "Orientation");
        FrostHunterTextViewDragonStormMega4297("ThumbnailImageLength", 0, "ImageLength");
        FrostHunterTextViewDragonStormMega4297("ThumbnailImageWidth", 0, "ImageWidth");
        FrostHunterTextViewDragonStormMega4297("ThumbnailOrientation", 5, "Orientation");
        FrostHunterTextViewDragonStormMega4297("ThumbnailImageLength", 5, "ImageLength");
        FrostHunterTextViewDragonStormMega4297("ThumbnailImageWidth", 5, "ImageWidth");
        FrostHunterTextViewDragonStormMega4297("Orientation", 4, "ThumbnailOrientation");
        FrostHunterTextViewDragonStormMega4297("ImageLength", 4, "ThumbnailImageLength");
        FrostHunterTextViewDragonStormMega4297("ImageWidth", 4, "ThumbnailImageWidth");
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) entry.getValue();
                frostHunterLevelListDrawableAuroraTurboDelta7963.toString();
                frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            }
            i++;
        }
    }

    public final void FrostHunterFlowMaxDragonHero5809(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956) {
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            Objects.toString(frostHunterGuidelineAuroraStrike4956);
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        frostHunterGuidelineAuroraStrike4956.readFully(bArr);
        frostHunterGuidelineAuroraStrike4956.readFully(bArr2);
        frostHunterGuidelineAuroraStrike4956.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(i - frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809);
        frostHunterGuidelineAuroraStrike4956.readFully(bArr4);
        FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterGuidelineAuroraStrike4956(bArr4), i, 5);
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(i3 - frostHunterGuidelineAuroraStrike4956.FrostHunterFlowMaxDragonHero5809);
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = ByteOrder.BIG_ENDIAN;
        int readInt = frostHunterGuidelineAuroraStrike4956.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = frostHunterGuidelineAuroraStrike4956.readUnsignedShort();
            int readUnsignedShort2 = frostHunterGuidelineAuroraStrike4956.readUnsignedShort();
            if (readUnsignedShort == FrostHunterMeteringPointMegaCyber7955.FrostHunterAlphaAnimationNeoCosmos5761) {
                short readShort = frostHunterGuidelineAuroraStrike4956.readShort();
                short readShort2 = frostHunterGuidelineAuroraStrike4956.readShort();
                FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(readShort, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24752 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(readShort2, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
                hashMapArr[0].put("ImageLength", FrostHunterBundlePulseFusionHero2475);
                hashMapArr[0].put("ImageWidth", FrostHunterBundlePulseFusionHero24752);
                return;
            }
            frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(readUnsignedShort2);
        }
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956) {
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            Objects.toString(frostHunterGuidelineAuroraStrike4956);
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = ByteOrder.LITTLE_ENDIAN;
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMeteringPointBetaCyber9571.length);
        int readInt = frostHunterGuidelineAuroraStrike4956.readInt() + 8;
        byte[] bArr = FrostHunterServiceInfoHyperionSparkMax9966;
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                frostHunterGuidelineAuroraStrike4956.readFully(bArr2);
                int readInt2 = frostHunterGuidelineAuroraStrike4956.readInt();
                int i = length + 8;
                if (Arrays.equals(FrostHunterEditTextPulseHyperion1262, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    frostHunterGuidelineAuroraStrike4956.readFully(bArr3);
                    byte[] bArr4 = FrostHunterFCMDeltaQuantumHero8364;
                    if (FrostHunterPaintCyberPulse5979.FrostHunterNavigationMasterMegaMax2752(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i;
                    FrostHunterCameraXTurboCelestialHero5430(bArr3, 0);
                    FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterGuidelineAuroraStrike4956(bArr3));
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
                frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void FrostHunterKeyframeGammaGamma1197(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490) {
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            Objects.toString(frostHunterAlertDialogInfernoInfernoStrike1490);
        }
        FrostHunterAlertDialogAuroraDelta3200(frostHunterAlertDialogInfernoInfernoStrike1490);
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[0].get("JpgFromRaw");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 != null) {
            FrostHunterLifecycleBlazeGammaElite2889(new FrostHunterGuidelineAuroraStrike4956(frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterServiceEliteCelestialThunder1757), (int) frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475, 5);
        }
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[0].get("ISO");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[1].get("PhotographicSensitivity");
        if (frostHunterLevelListDrawableAuroraTurboDelta79632 == null || frostHunterLevelListDrawableAuroraTurboDelta79633 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", frostHunterLevelListDrawableAuroraTurboDelta79632);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x00ea, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0185, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int FrostHunterLevelListDrawableFusionDragonHero2232(BufferedInputStream bufferedInputStream) {
        int i;
        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956;
        int i2;
        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike49562;
        int i3;
        int i4;
        int i5;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (i6 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i6] != bArr3[i6]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i7 = 0; i7 < bytes.length; i7++) {
                    if (bArr2[i7] != bytes[i7]) {
                        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike49563 = null;
                        int i8 = 1;
                        try {
                            frostHunterGuidelineAuroraStrike4956 = new FrostHunterGuidelineAuroraStrike4956(bArr2);
                            try {
                                try {
                                    readInt = frostHunterGuidelineAuroraStrike4956.readInt();
                                    bArr = new byte[4];
                                    frostHunterGuidelineAuroraStrike4956.readFully(bArr);
                                } catch (Exception unused) {
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                frostHunterGuidelineAuroraStrike49563 = frostHunterGuidelineAuroraStrike4956;
                                if (frostHunterGuidelineAuroraStrike49563 != null) {
                                    frostHunterGuidelineAuroraStrike49563.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                            frostHunterGuidelineAuroraStrike4956 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, FrostHunterLintTitanVortexQuantum9911)) {
                            if (readInt == 1) {
                                readInt = frostHunterGuidelineAuroraStrike4956.readLong();
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
                                        frostHunterGuidelineAuroraStrike4956.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, FrostHunterCameraXTurboCelestialHero5430)) {
                                                    z = true;
                                                } else if (Arrays.equals(bArr4, FrostHunterResourcesTitanHyperVision5823)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, FrostHunterTextViewDragonStormMega4297) || Arrays.equals(bArr4, FrostHunterLooperThreadBetaHyperionMax1000)) {
                                                    z3 = true;
                                                }
                                                if (z) {
                                                    if (z2) {
                                                        frostHunterGuidelineAuroraStrike4956.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z3) {
                                                        frostHunterGuidelineAuroraStrike4956.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception unused3) {
                                            }
                                        }
                                    } catch (EOFException unused4) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                frostHunterGuidelineAuroraStrike4956.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    frostHunterGuidelineAuroraStrike49562 = new FrostHunterGuidelineAuroraStrike4956(bArr2);
                                } catch (Exception unused5) {
                                    frostHunterGuidelineAuroraStrike49562 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder FrostHunterLintTitanVortexQuantum99112 = FrostHunterLintTitanVortexQuantum9911(frostHunterGuidelineAuroraStrike49562);
                                    this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLintTitanVortexQuantum99112;
                                    frostHunterGuidelineAuroraStrike49562.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLintTitanVortexQuantum99112;
                                    short readShort = frostHunterGuidelineAuroraStrike49562.readShort();
                                    i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                    frostHunterGuidelineAuroraStrike49562.close();
                                } catch (Exception unused6) {
                                    if (frostHunterGuidelineAuroraStrike49562 != null) {
                                        frostHunterGuidelineAuroraStrike49562.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    frostHunterGuidelineAuroraStrike49563 = frostHunterGuidelineAuroraStrike49562;
                                    if (frostHunterGuidelineAuroraStrike49563 != null) {
                                        frostHunterGuidelineAuroraStrike49563.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike49564 = new FrostHunterGuidelineAuroraStrike4956(bArr2);
                                    try {
                                        ByteOrder FrostHunterLintTitanVortexQuantum99113 = FrostHunterLintTitanVortexQuantum9911(frostHunterGuidelineAuroraStrike49564);
                                        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLintTitanVortexQuantum99113;
                                        frostHunterGuidelineAuroraStrike49564.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLintTitanVortexQuantum99113;
                                        i4 = frostHunterGuidelineAuroraStrike49564.readShort() == 85 ? 1 : i;
                                        frostHunterGuidelineAuroraStrike49564.close();
                                    } catch (Exception unused7) {
                                        frostHunterGuidelineAuroraStrike49563 = frostHunterGuidelineAuroraStrike49564;
                                        if (frostHunterGuidelineAuroraStrike49563 != null) {
                                            frostHunterGuidelineAuroraStrike49563.close();
                                        }
                                        i4 = i;
                                        if (i4 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        frostHunterGuidelineAuroraStrike49563 = frostHunterGuidelineAuroraStrike49564;
                                        if (frostHunterGuidelineAuroraStrike49563 != null) {
                                            frostHunterGuidelineAuroraStrike49563.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i4 == 0) {
                                    return 10;
                                }
                                int i9 = i;
                                while (true) {
                                    byte[] bArr5 = FrostHunterDialogFragmentTurboPhoenixDragon7627;
                                    if (i9 >= bArr5.length) {
                                        i5 = 1;
                                        break;
                                    }
                                    if (bArr2[i9] != bArr5[i9]) {
                                        i5 = i;
                                        break;
                                    }
                                    i9++;
                                }
                                if (i5 != 0) {
                                    return 13;
                                }
                                int i10 = i;
                                while (true) {
                                    byte[] bArr6 = FrostHunterMeteringPointBetaCyber9571;
                                    if (i10 >= bArr6.length) {
                                        int i11 = i;
                                        while (true) {
                                            byte[] bArr7 = FrostHunterServiceInfoHyperionSparkMax9966;
                                            if (i11 >= bArr7.length) {
                                                break;
                                            }
                                            if (bArr2[bArr6.length + i11 + 4] != bArr7[i11]) {
                                                break;
                                            }
                                            i11++;
                                        }
                                    } else {
                                        if (bArr2[i10] != bArr6[i10]) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                if (i8 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                        }
                        frostHunterGuidelineAuroraStrike4956.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i6++;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0067. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118 A[LOOP:0: B:9:0x0024->B:35:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956, int i, int i2) {
        boolean z = FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (z) {
            Objects.toString(frostHunterGuidelineAuroraStrike4956);
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = ByteOrder.BIG_ENDIAN;
        byte readByte = frostHunterGuidelineAuroraStrike4956.readByte();
        if (readByte != -1) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (frostHunterGuidelineAuroraStrike4956.readByte() != -40) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = frostHunterGuidelineAuroraStrike4956.readByte();
            if (readByte2 != -1) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            while (true) {
                int i4 = i3 + 1;
                byte readByte3 = frostHunterGuidelineAuroraStrike4956.readByte();
                if (readByte3 != -1) {
                    if (z) {
                        Integer.toHexString(readByte3 & 255);
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = frostHunterGuidelineAuroraStrike4956.readUnsignedShort();
                        int i5 = readUnsignedShort - 2;
                        int i6 = i3 + 4;
                        if (z) {
                            Integer.toHexString(readByte3 & 255);
                        }
                        if (i5 < 0) {
                            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Invalid length");
                            return;
                        }
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
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
                                                        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(1);
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterGuidelineAuroraStrike4956.readUnsignedShort(), this.FrostHunterLevelListDrawableFusionDragonHero2232));
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterGuidelineAuroraStrike4956.readUnsignedShort(), this.FrostHunterLevelListDrawableFusionDragonHero2232));
                                                        i5 = readUnsignedShort - 7;
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
                                if (i5 >= 0) {
                                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Invalid length");
                                    return;
                                } else {
                                    frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(i5);
                                    i3 = i6 + i5;
                                }
                            } else {
                                byte[] bArr = new byte[i5];
                                frostHunterGuidelineAuroraStrike4956.readFully(bArr);
                                if (FrostHunterConstraintSetCloneMasterUltraRogue2633("UserComment") == null) {
                                    HashMap hashMap = hashMapArr[1];
                                    Charset charset = FrostHunterR8MasterNebulaSpark7247;
                                    byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                    hashMap.put("UserComment", new FrostHunterLevelListDrawableAuroraTurboDelta7963(bytes, 2, bytes.length));
                                }
                            }
                        } else {
                            byte[] bArr2 = new byte[i5];
                            frostHunterGuidelineAuroraStrike4956.readFully(bArr2);
                            int i7 = i6 + i5;
                            byte[] bArr3 = FrostHunterFCMDeltaQuantumHero8364;
                            if (FrostHunterPaintCyberPulse5979.FrostHunterNavigationMasterMegaMax2752(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
                                this.FrostHunterCameraXPixelTurboCosmos9814 = i + i6 + bArr3.length;
                                FrostHunterCameraXTurboCelestialHero5430(copyOfRange, i2);
                                FrostHunterLooperThreadBetaHyperionMax1000(new FrostHunterGuidelineAuroraStrike4956(copyOfRange));
                            } else {
                                byte[] bArr4 = FrostHunterRewardedAdMasterStrike9463;
                                if (FrostHunterPaintCyberPulse5979.FrostHunterNavigationMasterMegaMax2752(bArr2, bArr4)) {
                                    int length = i6 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
                                    this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterLevelListDrawableAuroraTurboDelta7963(length, copyOfRange2, 1, copyOfRange2.length);
                                }
                            }
                            i6 = i7;
                        }
                        i5 = 0;
                        if (i5 >= 0) {
                        }
                    }
                } else {
                    i3 = i4;
                }
            }
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    public final boolean FrostHunterLightSensorForceFusion4241(HashMap hashMap) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("ImageLength");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("ImageWidth");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 == null || frostHunterLevelListDrawableAuroraTurboDelta79632 == null) {
            return false;
        }
        return frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232) <= 512 && frostHunterLevelListDrawableAuroraTurboDelta79632.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232) <= 512;
    }

    public final void FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963;
        HashMap hashMap = this.FrostHunterServiceEliteCelestialThunder1757[4];
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("Compression");
        if (frostHunterLevelListDrawableAuroraTurboDelta79632 == null) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterGuidelineAuroraStrike4956, hashMap);
            return;
        }
        int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterLevelListDrawableAuroraTurboDelta79632.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        if (FrostHunterLifecycleBlazeGammaElite2889 != 1) {
            if (FrostHunterLifecycleBlazeGammaElite2889 == 6) {
                FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterGuidelineAuroraStrike4956, hashMap);
                return;
            } else if (FrostHunterLifecycleBlazeGammaElite2889 != 7) {
                return;
            }
        }
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("BitsPerSample");
        if (frostHunterLevelListDrawableAuroraTurboDelta79633 != null) {
            int[] iArr = (int[]) frostHunterLevelListDrawableAuroraTurboDelta79633.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterLevelListDrawableFusionDragonHero2232);
            int[] iArr2 = FrostHunterLightSensorForceFusion4241;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.FrostHunterBundlePulseFusionHero2475 != 3 || (frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int FrostHunterLifecycleBlazeGammaElite28892 = frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
                if ((FrostHunterLifecycleBlazeGammaElite28892 != 1 || !Arrays.equals(iArr, FrostHunterScaleAnimationStrikeSpark5059)) && (FrostHunterLifecycleBlazeGammaElite28892 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79634 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("StripOffsets");
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79635 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("StripByteCounts");
            if (frostHunterLevelListDrawableAuroraTurboDelta79634 == null || frostHunterLevelListDrawableAuroraTurboDelta79635 == null) {
                return;
            }
            long[] FrostHunterLintTitanVortexQuantum99112 = FrostHunterPaintCyberPulse5979.FrostHunterLintTitanVortexQuantum9911(frostHunterLevelListDrawableAuroraTurboDelta79634.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterLevelListDrawableFusionDragonHero2232));
            long[] FrostHunterLintTitanVortexQuantum99113 = FrostHunterPaintCyberPulse5979.FrostHunterLintTitanVortexQuantum9911(frostHunterLevelListDrawableAuroraTurboDelta79635.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterLevelListDrawableFusionDragonHero2232));
            if (FrostHunterLintTitanVortexQuantum99112 == null || FrostHunterLintTitanVortexQuantum99112.length == 0 || FrostHunterLintTitanVortexQuantum99113 == null || FrostHunterLintTitanVortexQuantum99113.length == 0 || FrostHunterLintTitanVortexQuantum99112.length != FrostHunterLintTitanVortexQuantum99113.length) {
                return;
            }
            long j = 0;
            for (long j2 : FrostHunterLintTitanVortexQuantum99113) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.FrostHunterRemoteConfigSpeedSpeed8566 = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < FrostHunterLintTitanVortexQuantum99112.length; i3++) {
                int i4 = (int) FrostHunterLintTitanVortexQuantum99112[i3];
                int i5 = (int) FrostHunterLintTitanVortexQuantum99113[i3];
                if (i3 < FrostHunterLintTitanVortexQuantum99112.length - 1 && i4 + i5 != FrostHunterLintTitanVortexQuantum99112[i3 + 1]) {
                    this.FrostHunterRemoteConfigSpeedSpeed8566 = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    frostHunterGuidelineAuroraStrike4956.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.FrostHunterRemoteConfigSpeedSpeed8566) {
                long j3 = FrostHunterLintTitanVortexQuantum99112[0];
            }
        }
    }

    public final void FrostHunterMotionSceneAuroraMega2271(int i, int i2) {
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("ImageLength");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i].get("ImageWidth");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i2].get("ImageLength");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79634 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[i2].get("ImageWidth");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 == null || frostHunterLevelListDrawableAuroraTurboDelta79632 == null || frostHunterLevelListDrawableAuroraTurboDelta79633 == null || frostHunterLevelListDrawableAuroraTurboDelta79634 == null) {
            return;
        }
        int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        int FrostHunterLifecycleBlazeGammaElite28892 = frostHunterLevelListDrawableAuroraTurboDelta79632.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        int FrostHunterLifecycleBlazeGammaElite28893 = frostHunterLevelListDrawableAuroraTurboDelta79633.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        int FrostHunterLifecycleBlazeGammaElite28894 = frostHunterLevelListDrawableAuroraTurboDelta79634.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        if (FrostHunterLifecycleBlazeGammaElite2889 >= FrostHunterLifecycleBlazeGammaElite28893 || FrostHunterLifecycleBlazeGammaElite28892 >= FrostHunterLifecycleBlazeGammaElite28894) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490) {
        int i;
        int i2;
        FrostHunterAlertDialogAuroraDelta3200(frostHunterAlertDialogInfernoInfernoStrike1490);
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[1].get("MakerNote");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 != null) {
            FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike14902 = new FrostHunterAlertDialogInfernoInfernoStrike1490(frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterServiceEliteCelestialThunder1757);
            frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
            byte[] bArr = FrostHunterMotionSceneAuroraMega2271;
            byte[] bArr2 = new byte[bArr.length];
            frostHunterAlertDialogInfernoInfernoStrike14902.readFully(bArr2);
            frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterServiceEliteCelestialThunder1757(0L);
            byte[] bArr3 = FrostHunterBitmapTurboDeltaNebula8743;
            byte[] bArr4 = new byte[bArr3.length];
            frostHunterAlertDialogInfernoInfernoStrike14902.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterServiceEliteCelestialThunder1757(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                frostHunterAlertDialogInfernoInfernoStrike14902.FrostHunterServiceEliteCelestialThunder1757(12L);
            }
            FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike14902, 6);
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[7].get("PreviewImageStart");
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79633 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[7].get("PreviewImageLength");
            if (frostHunterLevelListDrawableAuroraTurboDelta79632 != null && frostHunterLevelListDrawableAuroraTurboDelta79633 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", frostHunterLevelListDrawableAuroraTurboDelta79632);
                hashMapArr[5].put("JPEGInterchangeFormatLength", frostHunterLevelListDrawableAuroraTurboDelta79633);
            }
            FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79634 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMapArr[8].get("AspectFrame");
            if (frostHunterLevelListDrawableAuroraTurboDelta79634 != null) {
                int[] iArr = (int[]) frostHunterLevelListDrawableAuroraTurboDelta79634.FrostHunterRemoteConfigSpeedSpeed8566(this.FrostHunterLevelListDrawableFusionDragonHero2232);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
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
                FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(i5, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero24752 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(i6, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                hashMapArr[0].put("ImageWidth", FrostHunterBundlePulseFusionHero2475);
                hashMapArr[0].put("ImageLength", FrostHunterBundlePulseFusionHero24752);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterResourcesTitanHyperVision5823(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490, int i) {
        boolean z;
        HashMap[] hashMapArr;
        short s;
        boolean z2;
        long j;
        HashMap[] hashMapArr2;
        FrostHunterRemoteModelManagerPrimeInferno3493 frostHunterRemoteModelManagerPrimeInferno3493;
        long j2;
        boolean z3;
        int i2;
        HashMap[] hashMapArr3;
        int i3;
        FrostHunterRemoteModelManagerPrimeInferno3493 frostHunterRemoteModelManagerPrimeInferno34932;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5;
        int i6 = i;
        Integer valueOf = Integer.valueOf(frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterFlowMaxDragonHero5809);
        HashSet hashSet = this.FrostHunterLifecycleBlazeGammaElite2889;
        hashSet.add(valueOf);
        short readShort = frostHunterAlertDialogInfernoInfernoStrike1490.readShort();
        if (readShort <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            z = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
            if (s2 >= readShort) {
                break;
            }
            int readUnsignedShort2 = frostHunterAlertDialogInfernoInfernoStrike1490.readUnsignedShort();
            int readUnsignedShort3 = frostHunterAlertDialogInfernoInfernoStrike1490.readUnsignedShort();
            int readInt = frostHunterAlertDialogInfernoInfernoStrike1490.readInt();
            short s3 = s2;
            long j4 = frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterFlowMaxDragonHero5809 + 4;
            FrostHunterRemoteModelManagerPrimeInferno3493 frostHunterRemoteModelManagerPrimeInferno34933 = (FrostHunterRemoteModelManagerPrimeInferno3493) FrostHunterTranslateAnimationCyberSolarUltra7101[i6].get(Integer.valueOf(readUnsignedShort2));
            if (z) {
                j = 4;
                s = readShort;
                z2 = z;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i6), Integer.valueOf(readUnsignedShort2), frostHunterRemoteModelManagerPrimeInferno34933 != null ? frostHunterRemoteModelManagerPrimeInferno34933.FrostHunterConstraintSetCloneMasterUltraRogue2633 : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
            } else {
                s = readShort;
                z2 = z;
                j = 4;
            }
            if (frostHunterRemoteModelManagerPrimeInferno34933 != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < FrostHunterCardViewSpectraCyber7714.length) {
                    int i7 = frostHunterRemoteModelManagerPrimeInferno34933.FrostHunterBundlePulseFusionHero2475;
                    if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = frostHunterRemoteModelManagerPrimeInferno34933.FrostHunterServiceEliteCelestialThunder1757) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i7;
                        }
                        hashMapArr2 = hashMapArr;
                        frostHunterRemoteModelManagerPrimeInferno3493 = frostHunterRemoteModelManagerPrimeInferno34933;
                        j2 = readInt * r15[readUnsignedShort3];
                        if (j2 >= 0 && j2 <= 2147483647L) {
                            z3 = true;
                            if (z3) {
                                if (j2 > j) {
                                    int readInt2 = frostHunterAlertDialogInfernoInfernoStrike1490.readInt();
                                    if (this.FrostHunterBundlePulseFusionHero2475 == 7) {
                                        hashMapArr3 = hashMapArr2;
                                        frostHunterRemoteModelManagerPrimeInferno34932 = frostHunterRemoteModelManagerPrimeInferno3493;
                                        if ("MakerNote".equals(frostHunterRemoteModelManagerPrimeInferno34932.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                            this.FrostHunterFlowMaxDragonHero5809 = readInt2;
                                        } else if (i6 == 6 && "ThumbnailImage".equals(frostHunterRemoteModelManagerPrimeInferno34932.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                            this.FrostHunterAlertDialogAuroraDelta3200 = readInt2;
                                            this.FrostHunterKeyframeGammaGamma1197 = readInt;
                                            FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(6, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            i3 = readUnsignedShort2;
                                            FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            i4 = readInt;
                                            FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterLevelListDrawableFusionDragonHero2232);
                                            hashMapArr3[4].put("Compression", FrostHunterBundlePulseFusionHero2475);
                                            hashMapArr3[4].put("JPEGInterchangeFormat", FrostHunterAlphaAnimationNeoCosmos5761);
                                            hashMapArr3[4].put("JPEGInterchangeFormatLength", FrostHunterAlphaAnimationNeoCosmos57612);
                                            frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(readInt2);
                                        }
                                        i3 = readUnsignedShort2;
                                    } else {
                                        hashMapArr3 = hashMapArr2;
                                        i3 = readUnsignedShort2;
                                        frostHunterRemoteModelManagerPrimeInferno34932 = frostHunterRemoteModelManagerPrimeInferno3493;
                                    }
                                    i4 = readInt;
                                    frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(readInt2);
                                } else {
                                    hashMapArr3 = hashMapArr2;
                                    i3 = readUnsignedShort2;
                                    frostHunterRemoteModelManagerPrimeInferno34932 = frostHunterRemoteModelManagerPrimeInferno3493;
                                    i4 = readInt;
                                }
                                Integer num = (Integer) FrostHunterPagingDataTurboTitanium7332.get(Integer.valueOf(i3));
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 == 4) {
                                            j3 = frostHunterAlertDialogInfernoInfernoStrike1490.readInt() & 4294967295L;
                                        } else if (readUnsignedShort3 == 8) {
                                            readUnsignedShort = frostHunterAlertDialogInfernoInfernoStrike1490.readShort();
                                        } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                            readUnsignedShort = frostHunterAlertDialogInfernoInfernoStrike1490.readInt();
                                        } else {
                                            j3 = -1;
                                        }
                                        if (z2) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j3), frostHunterRemoteModelManagerPrimeInferno34932.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                                        }
                                        if (j3 > 0 && (((i5 = frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterFragmentBetaMegaVortex6025) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
                                            frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j3);
                                            FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, num.intValue());
                                        }
                                        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j4);
                                    } else {
                                        readUnsignedShort = frostHunterAlertDialogInfernoInfernoStrike1490.readUnsignedShort();
                                    }
                                    j3 = readUnsignedShort;
                                    if (z2) {
                                    }
                                    if (j3 > 0) {
                                        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j3);
                                        FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, num.intValue());
                                    }
                                    frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j4);
                                } else {
                                    int i8 = frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterFlowMaxDragonHero5809 + this.FrostHunterCameraXPixelTurboCosmos9814;
                                    byte[] bArr = new byte[(int) j2];
                                    frostHunterAlertDialogInfernoInfernoStrike1490.readFully(bArr);
                                    FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = new FrostHunterLevelListDrawableAuroraTurboDelta7963(i8, bArr, readUnsignedShort3, i4);
                                    HashMap hashMap = hashMapArr3[i];
                                    String str = frostHunterRemoteModelManagerPrimeInferno34932.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                    hashMap.put(str, frostHunterLevelListDrawableAuroraTurboDelta7963);
                                    if ("DNGVersion".equals(str)) {
                                        this.FrostHunterBundlePulseFusionHero2475 = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLevelListDrawableFusionDragonHero2232(this.FrostHunterLevelListDrawableFusionDragonHero2232).contains("PENTAX")) || ("Compression".equals(str) && frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232) == 65535)) {
                                        this.FrostHunterBundlePulseFusionHero2475 = 8;
                                    }
                                    if (frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterFlowMaxDragonHero5809 != j4) {
                                        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j4);
                                    }
                                }
                            } else {
                                frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j4);
                            }
                            s2 = (short) (s3 + 1);
                            i6 = i;
                            readShort = s;
                        }
                        z3 = false;
                        if (z3) {
                        }
                        s2 = (short) (s3 + 1);
                        i6 = i;
                        readShort = s;
                    } else if (z2) {
                        String str2 = FrostHunterDatabaseEliteShadowUltra2452[readUnsignedShort3];
                    }
                }
            }
            frostHunterRemoteModelManagerPrimeInferno3493 = frostHunterRemoteModelManagerPrimeInferno34933;
            hashMapArr2 = hashMapArr;
            j2 = 0;
            z3 = false;
            if (z3) {
            }
            s2 = (short) (s3 + 1);
            i6 = i;
            readShort = s;
        }
        int readInt3 = frostHunterAlertDialogInfernoInfernoStrike1490.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
        }
        long j5 = readInt3;
        if (j5 <= 0 || hashSet.contains(Integer.valueOf(readInt3))) {
            return;
        }
        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j5);
        if (hashMapArr[4].isEmpty()) {
            FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, 4);
        } else if (hashMapArr[5].isEmpty()) {
            FrostHunterResourcesTitanHyperVision5823(frostHunterAlertDialogInfernoInfernoStrike1490, 5);
        }
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490) {
        ByteOrder FrostHunterLintTitanVortexQuantum99112 = FrostHunterLintTitanVortexQuantum9911(frostHunterAlertDialogInfernoInfernoStrike1490);
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLintTitanVortexQuantum99112;
        frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterLintTitanVortexQuantum99112;
        int readUnsignedShort = frostHunterAlertDialogInfernoInfernoStrike1490.readUnsignedShort();
        int i = this.FrostHunterBundlePulseFusionHero2475;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = frostHunterAlertDialogInfernoInfernoStrike1490.readInt();
        if (readInt < 8) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Invalid first Ifd offset: ", readInt));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterAlphaAnimationNeoCosmos5761(i2);
        }
    }

    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956, HashMap hashMap) {
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta7963 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("JPEGInterchangeFormat");
        FrostHunterLevelListDrawableAuroraTurboDelta7963 frostHunterLevelListDrawableAuroraTurboDelta79632 = (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get("JPEGInterchangeFormatLength");
        if (frostHunterLevelListDrawableAuroraTurboDelta7963 == null || frostHunterLevelListDrawableAuroraTurboDelta79632 == null) {
            return;
        }
        int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        int FrostHunterLifecycleBlazeGammaElite28892 = frostHunterLevelListDrawableAuroraTurboDelta79632.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        if (this.FrostHunterBundlePulseFusionHero2475 == 7) {
            FrostHunterLifecycleBlazeGammaElite2889 += this.FrostHunterFlowMaxDragonHero5809;
        }
        if (FrostHunterLifecycleBlazeGammaElite2889 <= 0 || FrostHunterLifecycleBlazeGammaElite28892 <= 0 || this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != null || this.FrostHunterAlphaAnimationNeoCosmos5761 != null) {
            return;
        }
        frostHunterGuidelineAuroraStrike4956.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite2889);
        frostHunterGuidelineAuroraStrike4956.readFully(new byte[FrostHunterLifecycleBlazeGammaElite28892]);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterAlertDialogInfernoInfernoStrike1490 frostHunterAlertDialogInfernoInfernoStrike1490, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new FrostHunterOrientationSensorOlympianHyperNova9803(frostHunterAlertDialogInfernoInfernoStrike1490));
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
                HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(Integer.parseInt(str), this.FrostHunterLevelListDrawableFusionDragonHero2232));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(Integer.parseInt(str3), this.FrostHunterLevelListDrawableFusionDragonHero2232));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", FrostHunterLevelListDrawableAuroraTurboDelta7963.FrostHunterBundlePulseFusionHero2475(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.FrostHunterLevelListDrawableFusionDragonHero2232));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(parseInt2);
                    byte[] bArr = new byte[6];
                    frostHunterAlertDialogInfernoInfernoStrike1490.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, FrostHunterFCMDeltaQuantumHero8364)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    frostHunterAlertDialogInfernoInfernoStrike1490.readFully(bArr2);
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i3;
                    FrostHunterCameraXTurboCelestialHero5430(bArr2, 0);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    frostHunterAlertDialogInfernoInfernoStrike1490.FrostHunterServiceEliteCelestialThunder1757(j);
                    byte[] bArr3 = new byte[parseInt5];
                    frostHunterAlertDialogInfernoInfernoStrike1490.readFully(bArr3);
                    this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterLevelListDrawableAuroraTurboDelta7963(j, bArr3, 1, parseInt5);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    public final void FrostHunterTextViewDragonStormMega4297(String str, int i, String str2) {
        HashMap[] hashMapArr = this.FrostHunterServiceEliteCelestialThunder1757;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (FrostHunterLevelListDrawableAuroraTurboDelta7963) hashMap.get(str));
        hashMapArr[i].remove(str);
    }
}
