package ru.CryptoPro.JCSP;

import ru.CryptoPro.JCSP.MSCAPI.CAPI;

/* loaded from: classes4.dex */
public class CSPVersionUtility {
    public static final int CSP_BUILD_KECCAK = 13454;
    public static final int CSP_BUILD_KOBLITZ = 13333;
    public static final int CSP_BUILD_R1 = 11455;
    public static final int CSP_BUILD_R2 = 12000;
    public static final int CSP_BUILD_SHA3_WITH_RSA = 13454;

    public static boolean isCSPBuildEqual11455OrLower() {
        int i = CAPI.CSPVersion;
        if (i >= 1280) {
            return i == 1280 && CAPI.CSPBuild <= 11455;
        }
        return true;
    }

    public static boolean isCSPBuildEqual12000OrHigher() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild >= 12000;
        }
        return true;
    }

    public static boolean isCSPBuildHigher11455() {
        int i = CAPI.CSPVersion;
        if (i <= 1280) {
            return i == 1280 && CAPI.CSPBuild > 11455;
        }
        return true;
    }

    public static boolean isCSPBuildHigher40() {
        return CAPI.CSPVersion > 1024;
    }

    public static boolean isCSPBuildLess12600() {
        int i = CAPI.CSPVersion;
        if (i >= 1280) {
            return i == 1280 && CAPI.CSPBuild < 12600;
        }
        return true;
    }

    public static boolean isCSPVersion40OrHigher() {
        return CAPI.CSPVersion >= 1024;
    }

    public static boolean isCSPVersion50OrHigher() {
        return CAPI.CSPVersion >= 1280;
    }
}
