package ru.CryptoPro.JCSP;

/* loaded from: classes4.dex */
public class CSPVersionDependentFixes extends CSPVersionUtility {
    public static boolean isCSPErrorForEnvelopedCMSFixed() {
        return CSPVersionUtility.isCSPBuildEqual12000OrHigher();
    }

    public static boolean isCrossKeyExportFixed() {
        return CSPVersionUtility.isCSPBuildEqual12000OrHigher();
    }

    public static boolean isSystemStoreFixed() {
        return CSPVersionUtility.isCSPBuildEqual12000OrHigher();
    }
}
