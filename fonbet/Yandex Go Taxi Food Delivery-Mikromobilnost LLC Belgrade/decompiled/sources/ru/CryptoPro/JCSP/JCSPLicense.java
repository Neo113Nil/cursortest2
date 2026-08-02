package ru.CryptoPro.JCSP;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.LicenseConfig;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public final class JCSPLicense extends License {
    public static final /* synthetic */ int g = 0;

    public JCSPLicense() throws IOException {
    }

    public static void main(String[] strArr) {
        License.printRequiredInfo(JCSPLicense.class, JCSPInstaller.a, strArr);
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public List getAcceptedLicenseTypes() {
        return Arrays.asList(4, 5);
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public long getAllowedAmount() {
        return 0L;
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public LicenseConfig getConfig() {
        return new LicenseConfig("PF", 1503, 4491);
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public String getDefaultLoaderName() {
        return JCSPLicenseLoader.class.getName();
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public String getInstDatePrefName() {
        return "JCSPCheckSum";
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public String getLoaderPrefName() {
        return "LicLoader";
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public String getPrefName() {
        return "License";
    }

    public String getProductName() {
        return "JCSP";
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public JCPPref getSpecialNode() {
        return this.node.parent();
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public int verifyLicense(Object obj, boolean z) {
        boolean isServerPlatform = Platform.isServerPlatform();
        if (z) {
            isServerPlatform = true;
        }
        if (isServerPlatform) {
            return super.verifyLicense(obj, z);
        }
        return 0;
    }

    public JCSPLicense(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
