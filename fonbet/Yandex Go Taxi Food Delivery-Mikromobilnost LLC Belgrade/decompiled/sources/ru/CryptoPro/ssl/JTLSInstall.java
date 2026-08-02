package ru.CryptoPro.ssl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.text.MessageFormat;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ExpectedArgumentException;
import ru.CryptoPro.Install.ExpectedValueException;
import ru.CryptoPro.Install.FileTools;
import ru.CryptoPro.Install.GeneralSettingsInterface;
import ru.CryptoPro.Install.InvalidValueException;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.SecurityProperties;
import ru.CryptoPro.Install.ShellInstaller;
import ru.CryptoPro.JCP.ControlPane.MainControlPaneConfig;
import ru.CryptoPro.JCP.Install.JCPInstaller;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.Decoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.LicenseException;
import ru.CryptoPro.JCSP.SSLProviderConstants;

/* loaded from: classes4.dex */
public class JTLSInstall implements PackageInterface {
    public static final Map ALL_INSTALL;
    public static final String[] ALL_JARS = {"cpSSL.jar"};
    public static final String BUNDLE_NAME = "ru.CryptoPro.ssl.resources.jtlsinst";
    public static final String PACKAGE_NICKNAME = "cpSSL";
    public static final String STORE_LICENSE_FAIL = "Failed to store license";
    public static String TEMP_PRODUCT_ID = "CT20B-00030-00YEV-5A0PE-M2LH7";
    public static final ResourceBundle c;
    public GeneralSettingsInterface a = null;
    public ServerLicense b = null;

    static {
        HashMap hashMap = new HashMap(1);
        ALL_INSTALL = hashMap;
        c = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());
        hashMap.put(JTLSInstall.class.getName(), "true");
    }

    public static ServerLicense a(String str, String str2, GeneralSettingsInterface generalSettingsInterface) {
        boolean z;
        ServerLicense serverLicense = new ServerLicense(null, null, TEMP_PRODUCT_ID);
        try {
            z = new License().isServer();
        } catch (IOException e) {
            JCPLogger.info("JTLSInstall checkInstallLicense exception: ", e.getMessage());
            z = false;
        }
        JCPLogger.info("JTLSInstall checkInstallLicense isServer: ", Boolean.valueOf(z));
        if (z) {
            if (str2 != null && str == null) {
                throw new ExpectedArgumentException("sslserial");
            }
            if (str2 == null) {
                try {
                    str2 = new ServerLicense().getCompanyName();
                } catch (IOException unused) {
                    str2 = null;
                }
            }
            if (str == null) {
                try {
                    serverLicense = new ServerLicense();
                    int verifyLicense = serverLicense.verifyLicense();
                    if (verifyLicense < 0) {
                        throw new LicenseException(verifyLicense);
                    }
                } catch (Exception unused2) {
                    serverLicense = new ServerLicense(null, str2, TEMP_PRODUCT_ID);
                }
            } else {
                serverLicense = new ServerLicense(null, str2, str);
            }
            if (str != null) {
                int verifyLicense2 = serverLicense.verifyLicense();
                if (verifyLicense2 < 0) {
                    throw new ArgumentException(new LicenseException(verifyLicense2));
                }
                generalSettingsInterface.getVerboseWriter().println(AbstractLicense.STR_VALID_LICENSE);
            }
        }
        return serverLicense;
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new cl_72()), ALL_INSTALL, ALL_JARS, strArr)) {
            return;
        }
        System.exit(1);
    }

    public String depends() {
        return "Installer,JCP,JCryptoP";
    }

    public void install() throws Exception {
        boolean z;
        boolean z2;
        boolean addSecurityLinks;
        JCPPref jCPPref = new JCPPref(Provider.class);
        MainControlPaneConfig config = MainControlPaneConfig.getConfig();
        try {
            this.b.store();
        } catch (ConfigurationException unused) {
            this.a.getVerboseWriter().println("Failed to store license");
        }
        boolean z3 = false;
        try {
            addSecurityLinks = SecurityProperties.addSecurityLinks(SSLProviderConstants.CP_SSL_PROVIDER);
            try {
                jCPPref.put("ssl.KeyManagerFactory.algorithm", SecurityProperties.getSecurityKey("ssl.KeyManagerFactory.algorithm", ""));
                jCPPref.put("ssl.TrustManagerFactory.algorithm", SecurityProperties.getSecurityKey("ssl.TrustManagerFactory.algorithm", ""));
                SecurityProperties.delSecurityKey("ssl.SocketFactory.provider");
                SecurityProperties.delSecurityKey("ssl.ServerSocketFactory.provider");
                z = config.addClassUnchecked(TLSLicensePage.class.getName());
            } catch (Throwable th) {
                th = th;
                z = false;
                z2 = false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            z2 = false;
        }
        try {
            z3 = config.addClassUnchecked(ServerSettings.class.getName());
            JCPInstaller.copyFileWithCheck("cpSSL.jar", this.a);
        } catch (Throwable th3) {
            th = th3;
            z2 = z3;
            z3 = addSecurityLinks;
            if (z3) {
                SecurityProperties.delSecurityLinks(SSLProviderConstants.CP_SSL_PROVIDER);
            }
            if (z) {
                config.removeClass(TLSLicensePage.class.getName());
            }
            if (z2) {
                config.removeClass(ServerSettings.class.getName());
            }
            throw th;
        }
    }

    public String nickname() {
        return PACKAGE_NICKNAME;
    }

    public String[] options() {
        ResourceBundle resourceBundle = c;
        return new String[]{MessageFormat.format(resourceBundle.getString("license.option.sslserial"), "sslserial"), MessageFormat.format(resourceBundle.getString("license.option.sslcompany"), "sslcompany")};
    }

    public String[] optionsAnnotation() {
        ResourceBundle resourceBundle = c;
        return new String[]{resourceBundle.getString("license.annotation.sslserial"), resourceBundle.getString("license.annotation.sslcompany")};
    }

    public void parseArgs(String[] strArr, String[] strArr2, BitSet bitSet, GeneralSettingsInterface generalSettingsInterface) throws ArgumentException {
        this.a = generalSettingsInterface;
        String str = null;
        String str2 = null;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase("sslserial")) {
                str = strArr2[i];
                if (str == null) {
                    throw new ExpectedValueException(strArr[i]);
                }
                bitSet.set(i);
            }
            if (strArr[i].equalsIgnoreCase("sslcompany")) {
                str2 = strArr2[i];
                if (str2 == null) {
                    throw new ExpectedValueException(strArr[i]);
                }
                bitSet.set(i);
            } else if (!strArr[i].equalsIgnoreCase("sslcombase")) {
                continue;
            } else {
                if (strArr2[i] == null) {
                    throw new ExpectedValueException(strArr[i]);
                }
                try {
                    String str3 = new String(new Decoder().decodeBuffer(new ByteArrayInputStream(strArr2[i].getBytes("UTF-8"))), "windows-1251");
                    bitSet.set(i);
                    str2 = str3;
                } catch (UnsupportedEncodingException e) {
                    throw new InvalidValueException(strArr[i], strArr2[i], e);
                } catch (IOException e2) {
                    throw new InvalidValueException(strArr[i], strArr2[i], e2);
                }
            }
        }
        if (this.a.getAction() == 1) {
            this.b = a(str, AbstractLicense.getParameterTruncatedByLength(str2), this.a);
        }
    }

    public void uninstall() throws Exception {
        JCPPref jCPPref = new JCPPref(Provider.class);
        String str = jCPPref.get("ssl.KeyManagerFactory.algorithm", "");
        String str2 = jCPPref.get("ssl.TrustManagerFactory.algorithm", "");
        if (str.equals("GostX509")) {
            str = "";
        }
        String str3 = str2.equals("GostX509") ? "" : str2;
        FileTools.removeFile("cpSSL.jar", this.a);
        SecurityProperties.delSecurityLinks(SSLProviderConstants.CP_SSL_PROVIDER);
        SecurityProperties.setSecurityKey("ssl.KeyManagerFactory.algorithm", str);
        SecurityProperties.setSecurityKey("ssl.TrustManagerFactory.algorithm", str3);
        SecurityProperties.delSecurityKey("ssl.SocketFactory.provider");
        SecurityProperties.delSecurityKey("ssl.ServerSocketFactory.provider");
        MainControlPaneConfig config = MainControlPaneConfig.getConfig();
        config.removeClass(ServerSettings.class.getName());
        config.removeClass(TLSLicensePage.class.getName());
        if (this.a.isRemoveSettings()) {
            jCPPref.removeNode();
        }
    }
}
