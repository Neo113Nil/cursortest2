package ru.CryptoPro.JCSP;

import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.JCSP.MSCAPI.KoblitzProviderFeature;
import ru.CryptoPro.JCSP.MSCAPI.cl_8;

/* loaded from: classes4.dex */
public class CSPVersionDependentAlgorithms extends CSPVersionUtility implements cl_8 {
    public static final KoblitzProviderFeature CURRENT_FEATURE_KOBLITZ = new KoblitzProviderFeature(CAPI.CSPVersion, CAPI.CSPBuild, CAPI.CSPBuildTimestamp);
    public static final ru.CryptoPro.JCSP.MSCAPI.CSPProviderInfo CSP_SUPPORT_KOBLITZ = new ru.CryptoPro.JCSP.MSCAPI.CSPProviderInfo(1280, CSPVersionUtility.CSP_BUILD_KOBLITZ);

    public static boolean isKeccakSupported() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 13454;
        }
        return true;
    }

    public static boolean isKoblitzCurveSupported() {
        return CURRENT_FEATURE_KOBLITZ.isSupported();
    }

    public static boolean isNoKeyWLockSupported() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 12000;
        }
        return true;
    }

    public static boolean isOMACForEnvelopedCMSSupported() {
        return CSPVersionUtility.isCSPBuildHigher11455();
    }

    public static boolean isPfxVerifyPasswordSupported() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 11707;
        }
        return true;
    }

    public static boolean isPrivateKeyUsageExtensionInRSAOrCheckedInPFXSupported() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 12800;
        }
        return true;
    }

    public static boolean isSHA3withRSASupported() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 13454;
        }
        return true;
    }
}
