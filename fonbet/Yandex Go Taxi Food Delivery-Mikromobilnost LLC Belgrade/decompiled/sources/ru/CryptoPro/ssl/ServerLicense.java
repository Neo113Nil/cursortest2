package ru.CryptoPro.ssl;

import java.io.IOException;
import java.text.MessageFormat;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.JCPLicenseLoader;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.LicenseConfig;
import ru.CryptoPro.JCP.tools.LicenseException;
import ru.CryptoPro.JCSP.JCSPLicense;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
public final class ServerLicense extends License {
    public ServerLicense() throws IOException {
    }

    public static void main(String[] strArr) {
        License.printRequiredInfo(ServerLicense.class, JTLSInstall.TEMP_PRODUCT_ID, strArr);
    }

    public static String n(int i, String str) {
        return i == -1 ? MessageFormat.format(AbstractLicense.licenseResource.getString("license.run.out.of.time.additional.info"), System.getProperty("user.name"), str) : MessageFormat.format(AbstractLicense.licenseResource.getString("license.product.additional.info"), str);
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public void check(Object obj) throws LicenseException {
        try {
            int verifyLicense = new ServerLicense().verifyLicense(obj);
            if (verifyLicense < 0) {
                throw new LicenseException(verifyLicense, licenseValidationMessage(verifyLicense));
            }
            if (verifyLicense == 2) {
                cl_103 cl_103Var = new cl_103(this);
                cl_103Var.setPriority(1);
                cl_103Var.start();
            }
            if (cpSSLConfig.isJCP()) {
                try {
                    License license = new License();
                    int verifyLicense2 = license.verifyLicense();
                    if (verifyLicense2 < 0) {
                        throw new LicenseException(verifyLicense2, n(verifyLicense2, "JCP"));
                    }
                    if (!license.isServer()) {
                        throw new LicenseException("License type of JCP MUST be 'Server'.");
                    }
                    return;
                } catch (IOException e) {
                    SSLLogger.warning(e.toString());
                    throw new LicenseException(e.getMessage(), e);
                }
            }
            try {
                JCSPLicense jCSPLicense = new JCSPLicense();
                int verifyLicense3 = jCSPLicense.verifyLicense(null, true);
                if (verifyLicense3 < 0) {
                    throw new LicenseException(verifyLicense3, n(verifyLicense3, "JCSP"));
                }
                if (!jCSPLicense.isServer()) {
                    throw new LicenseException("Licenses' types of CSP and Java CSP MUST be 'Server'.");
                }
            } catch (IOException e2) {
                SSLLogger.warning(e2.toString());
                throw new LicenseException(e2.getMessage(), e2);
            }
        } catch (IOException e3) {
            SSLLogger.warning(e3.toString());
            throw new LicenseException(e3.getMessage(), e3);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public LicenseConfig getConfig() {
        return new LicenseConfig("CT", 5555, 7777);
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public String getDefaultLoaderName() {
        return JCPLicenseLoader.class.getName();
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public final String getInstDatePrefName() {
        return "SSLCheckSum_2_0";
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public final String getLoaderPrefName() {
        return "LicLoader";
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public final String getPrefName() {
        return "License_2_0";
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public final JCPPref getSpecialNode() {
        return this.node.parent();
    }

    @Override // ru.CryptoPro.JCP.tools.License, ru.CryptoPro.JCP.tools.AbstractLicense
    public int verifyAmount(Object obj) {
        return 0;
    }

    public ServerLicense(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
