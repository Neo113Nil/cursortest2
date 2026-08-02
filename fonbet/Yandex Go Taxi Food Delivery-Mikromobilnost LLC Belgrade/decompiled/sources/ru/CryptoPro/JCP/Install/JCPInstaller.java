package ru.CryptoPro.JCP.Install;

import defpackage.zs61;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.text.MessageFormat;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.ExpectedArgumentException;
import ru.CryptoPro.Install.ExpectedValueException;
import ru.CryptoPro.Install.FileTools;
import ru.CryptoPro.Install.GeneralSettingsInterface;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.SecurityProperties;
import ru.CryptoPro.Install.ShellInstaller;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;
import ru.CryptoPro.JCP.Util.SetDefaultLic;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.AbstractLicense;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.License;
import ru.CryptoPro.JCP.tools.LicenseException;
import ru.CryptoPro.JCP.tools.LocalMutex;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public final class JCPInstaller implements PackageInterface {
    public static final Map ALL_INSTALL;
    public static final String PACKAGE_NICKNAME = "JCP";
    public static final String TEMP_PRODUCT_ID = "CF20X-X0030-00BAA-1F1NT-ZDFK2";
    public static final Collection VERIFIABLE_JARS;
    public License a = null;
    public GeneralSettingsInterface b = null;
    public static final String c = JCP.class.getName();
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.Install.resources.jcpinst";
    public static final ResourceBundle d = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());
    public static final String[] ALL_JARS = {"JCP.jar", "JCPControlPane.jar", "forms_rt.jar", "asn1rt.jar"};

    static {
        cl_1 cl_1Var = new cl_1();
        cl_1Var.add("JCPinst.jar");
        cl_1Var.add("JCP.jar");
        cl_1Var.add("JCPControlPane.jar");
        cl_1Var.add("ASN1P.jar");
        cl_1Var.add("asn1rt.jar");
        cl_1Var.add("forms_rt.jar");
        cl_1Var.add("JCPRequest.jar");
        cl_1Var.add("JCPxml.jar");
        cl_1Var.add("XMLDSigRI.jar");
        cl_1Var.add("JCPRevCheck.jar");
        cl_1Var.add("JCPRevTools.jar");
        cl_1Var.add("J6CF.jar");
        cl_1Var.add("J6Oscar.jar");
        cl_1Var.add("CAdES.jar");
        cl_1Var.add("XAdES.jar");
        cl_1Var.add("AdES-core.jar");
        cl_1Var.add("JCryptoP.jar");
        cl_1Var.add("cpSSL.jar");
        cl_1Var.add("sspiSSL.jar");
        cl_1Var.add("JCSP.jar");
        cl_1Var.add("Rutoken.jar");
        VERIFIABLE_JARS = cl_1Var;
        HashMap hashMap = new HashMap(1);
        ALL_INSTALL = hashMap;
        hashMap.put(JCPInstaller.class.getName(), "true");
    }

    public static License a(String str, String str2, GeneralSettingsInterface generalSettingsInterface) {
        if (str2 != null && str == null) {
            throw new ExpectedArgumentException("serial");
        }
        if (str2 == null) {
            try {
                str2 = new License().getCompanyName();
            } catch (IOException unused) {
                str2 = null;
            }
        }
        if (str == null) {
            return null;
        }
        License license = new License(null, str2, str);
        if (license.verifyLicense("Crypto") < 0) {
            return null;
        }
        generalSettingsInterface.getVerboseWriter().println(AbstractLicense.STR_VALID_LICENSE);
        return license;
    }

    public static void b() {
        if (new JCPPref(AbstractBioRandom.class).get(AbstractBioRandom.STR_DEF_USED_BIO, null) == null) {
            AbstractBioRandom.setDefaultBioRandom(GraphicsEnvironment.isHeadless() ? 1 : 0);
        }
    }

    public static void copyFileWithCheck(String str, GeneralSettingsInterface generalSettingsInterface) throws IOException {
        if (generalSettingsInterface.isSkipFiles()) {
            return;
        }
        FileTools.copyFile(FileTools.mergeURL(generalSettingsInterface.getSourceURL(), str), new File(generalSettingsInterface.getDestDir(), str), generalSettingsInterface);
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new zs61()), ALL_INSTALL, ALL_JARS, strArr)) {
            return;
        }
        System.exit(1);
    }

    public static void setLicense(License license) throws LicenseException {
        License license2;
        try {
            license2 = new License();
        } catch (Exception unused) {
            license2 = null;
        }
        if (license2 != null && !license2.isHashCorrect()) {
            license2 = null;
        }
        if (license != null && license.verifyLicense("Crypto") >= 0) {
            try {
                license.store();
                return;
            } catch (Exception unused2) {
            }
        }
        if (license2 != null) {
            try {
                if (license2.isHashCorrect()) {
                    license2.store();
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        try {
            new License(null, null, TEMP_PRODUCT_ID).store();
        } catch (Exception unused4) {
        }
        try {
            try {
                License.checkExist();
            } catch (Exception e) {
                JCPLogger.warning("Can't set license.", (Throwable) e);
            }
        } catch (LicenseException unused5) {
            SetDefaultLic.setPrefLic();
        }
    }

    public String depends() {
        return "Installer";
    }

    public void install() throws Exception {
        boolean z;
        boolean z2;
        String str = c;
        boolean z3 = false;
        try {
            setLicense(this.a);
            SelfTester_JCP.addJarVerifyTest(JCPInstaller.class.getName());
            z = true;
            try {
                z2 = SecurityProperties.addSecurityLinks(str);
                try {
                    copyFileWithCheck("JCP.jar", this.b);
                    copyFileWithCheck("JCPControlPane.jar", this.b);
                    copyFileWithCheck("asn1rt.jar", this.b);
                    copyFileWithCheck("forms_rt.jar", this.b);
                    try {
                        JCPLogger.fine("Creating of tmp and key directories...");
                        try {
                            new LocalMutex("test");
                            JCPLogger.fine("Creating of tmp directory completed.");
                            new HDImageStore().engineLoad(null, null);
                            JCPLogger.fine("Creating of key directory completed.");
                        } catch (Exception e) {
                            JCPLogger.warning("Exception when attempted to create directories", (Throwable) e);
                        }
                        b();
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        if (!z3) {
                            if (z2) {
                                SecurityProperties.delSecurityLinks(str);
                            }
                            if (z) {
                                SelfTester_JCP.removeJarVerifyTest(JCPInstaller.class.getName());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z2 = false;
            }
        } catch (Throwable th4) {
            th = th4;
            z = false;
            z2 = false;
        }
    }

    public String nickname() {
        return "JCP";
    }

    public String[] options() {
        ResourceBundle resourceBundle = d;
        return new String[]{MessageFormat.format(resourceBundle.getString("license.option.serial"), "serial"), MessageFormat.format(resourceBundle.getString("license.option.company"), "company")};
    }

    public String[] optionsAnnotation() {
        ResourceBundle resourceBundle = d;
        return new String[]{resourceBundle.getString("license.annotation.serial"), resourceBundle.getString("license.annotation.company")};
    }

    public void parseArgs(String[] strArr, String[] strArr2, BitSet bitSet, GeneralSettingsInterface generalSettingsInterface) throws ArgumentException {
        this.b = generalSettingsInterface;
        String str = null;
        String str2 = null;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase("serial")) {
                str = strArr2[i];
                if (str == null) {
                    throw new ExpectedValueException(strArr[i]);
                }
                bitSet.set(i);
            }
            if (strArr[i].equalsIgnoreCase("company")) {
                str2 = strArr2[i];
                if (str2 == null) {
                    throw new ExpectedValueException(strArr[i]);
                }
                bitSet.set(i);
            }
        }
        if (this.b.getAction() == 1) {
            this.a = a(str, AbstractLicense.getParameterTruncatedByLength(str2), this.b);
        }
    }

    public void uninstall() throws Exception {
        SelfTester_JCP.removeJarVerifyTest(JCPInstaller.class.getName());
        FileTools.removeFile("JCP.jar", this.b);
        FileTools.removeFile("JCPControlPane.jar", this.b);
        FileTools.removeFile("asn1rt.jar", this.b);
        FileTools.removeFile("forms_rt.jar", this.b);
        if (this.b.isRemoveSettings()) {
            new JCPPref(JCP.class).removeNode();
        }
        SecurityProperties.delSecurityLinks(c);
    }
}
