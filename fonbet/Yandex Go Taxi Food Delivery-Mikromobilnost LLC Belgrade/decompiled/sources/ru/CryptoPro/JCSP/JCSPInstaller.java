package ru.CryptoPro.JCSP;

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
import ru.CryptoPro.JCP.tools.LicenseException;
import ru.CryptoPro.JCSP.Pane.JCSPLicensePage;
import ru.CryptoPro.JCSP.Pane.JCSPSettings;
import ru.CryptoPro.JCSP.tools.SelfTester_JavaCSP;

/* loaded from: classes4.dex */
public class JCSPInstaller implements PackageInterface {
    public static final String PACKAGE_NICKNAME = "JCSP";
    public static String a = "PF405-60030-00REK-39KYH-LZXTX";
    public static final String b = "Failed to store license";
    public static final Map e;
    private static final String l = "serial";
    private static final String m = "company";
    private static final String n = "combase";
    private GeneralSettingsInterface k = null;
    private JCSPLicense o = null;
    private static final String f = "JCSP.jar";
    public static final String[] c = {f};
    private static final String g = JCSP.class.getName();
    private static final String h = JCSPRSA.class.getName();
    private static final String i = JCSPECDSA.class.getName();
    private static final String j = JCSPEDDSA.class.getName();
    public static final String d = "ru.CryptoPro.JCSP.install.resources.jcspinst";
    private static final ResourceBundle p = ResourceBundle.getBundle(d, Locale.getDefault());

    static {
        HashMap hashMap = new HashMap(1);
        e = hashMap;
        hashMap.put(JCSPInstaller.class.getName(), "true");
    }

    private static JCSPLicense a(String str, String str2, GeneralSettingsInterface generalSettingsInterface) throws ArgumentException {
        JCSPLicense jCSPLicense;
        if (str2 != null && str == null) {
            throw new ExpectedArgumentException(l);
        }
        if (str2 == null) {
            try {
                str2 = new JCSPLicense().getCompanyName();
            } catch (IOException unused) {
                str2 = null;
            }
        }
        if (str == null) {
            try {
                jCSPLicense = new JCSPLicense();
                int verifyLicense = jCSPLicense.verifyLicense();
                if (verifyLicense < 0) {
                    throw new LicenseException(verifyLicense);
                }
            } catch (Exception unused2) {
                jCSPLicense = new JCSPLicense(null, str2, a);
            }
        } else {
            jCSPLicense = new JCSPLicense(null, str2, str);
        }
        if (str != null) {
            int verifyLicense2 = jCSPLicense.verifyLicense(null, true);
            if (verifyLicense2 < 0) {
                throw new ArgumentException(new LicenseException(verifyLicense2));
            }
            generalSettingsInterface.getVerboseWriter().println(AbstractLicense.STR_VALID_LICENSE);
        }
        return jCSPLicense;
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new cl_2()), e, c, strArr)) {
            return;
        }
        System.exit(1);
    }

    public String depends() {
        return "Installer,JCP,";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void install() throws Exception {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        MainControlPaneConfig config = MainControlPaneConfig.getConfig();
        try {
            this.o.store();
        } catch (ConfigurationException unused) {
            this.k.getVerboseWriter().println("Failed to store license");
        }
        boolean z7 = false;
        try {
            SelfTester_JavaCSP.addJarVerifyTest(JCSPInstaller.class.getName());
            try {
                boolean addSecurityLinks = SecurityProperties.addSecurityLinks(g);
                try {
                    z3 = SecurityProperties.addSecurityLinks(h);
                    try {
                        z4 = SecurityProperties.addSecurityLinks(i);
                        try {
                            z5 = SecurityProperties.addSecurityLinks(j);
                        } catch (Throwable th) {
                            th = th;
                            z5 = false;
                            z6 = z5;
                            z7 = addSecurityLinks;
                            z2 = true;
                            z = z6;
                            if (z7) {
                                SecurityProperties.delSecurityLinks(g);
                            }
                            if (z3) {
                                SecurityProperties.delSecurityLinks(h);
                            }
                            if (z4) {
                                SecurityProperties.delSecurityLinks(i);
                            }
                            if (z5) {
                                SecurityProperties.delSecurityLinks(j);
                            }
                            if (z6) {
                                config.removeClass(JCSPLicensePage.class.getName());
                            }
                            if (z) {
                                config.removeClass(JCSPSettings.class.getName());
                            }
                            if (z2) {
                                SelfTester_JavaCSP.removeJarVerifyTest(JCSPInstaller.class.getName());
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = false;
                        z5 = z4;
                        z6 = z5;
                        z7 = addSecurityLinks;
                        z2 = true;
                        z = z6;
                        if (z7) {
                        }
                        if (z3) {
                        }
                        if (z4) {
                        }
                        if (z5) {
                        }
                        if (z6) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z3 = false;
                    z4 = false;
                }
                try {
                    z6 = config.addClassUnchecked(JCSPLicensePage.class.getName());
                    try {
                        z7 = config.addClassUnchecked(JCSPSettings.class.getName());
                        JCPInstaller.copyFileWithCheck(f, this.k);
                    } catch (Throwable th4) {
                        th = th4;
                        z = z7;
                        z7 = addSecurityLinks;
                        z2 = true;
                        if (z7) {
                        }
                        if (z3) {
                        }
                        if (z4) {
                        }
                        if (z5) {
                        }
                        if (z6) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z6 = false;
                    z7 = addSecurityLinks;
                    z2 = true;
                    z = z6;
                    if (z7) {
                    }
                    if (z3) {
                    }
                    if (z4) {
                    }
                    if (z5) {
                    }
                    if (z6) {
                    }
                    if (z) {
                    }
                    if (z2) {
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
            }
        } catch (Throwable th7) {
            th = th7;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
    }

    public String nickname() {
        return "JCSP";
    }

    public String[] options() {
        ResourceBundle resourceBundle = p;
        return new String[]{MessageFormat.format(resourceBundle.getString("license.option.serial"), l), MessageFormat.format(resourceBundle.getString("license.option.company"), m)};
    }

    public String[] optionsAnnotation() {
        ResourceBundle resourceBundle = p;
        return new String[]{resourceBundle.getString("license.annotation.serial"), resourceBundle.getString("license.annotation.company")};
    }

    public void parseArgs(String[] strArr, String[] strArr2, BitSet bitSet, GeneralSettingsInterface generalSettingsInterface) throws ArgumentException {
        this.k = generalSettingsInterface;
        String str = null;
        String str2 = null;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equalsIgnoreCase(l)) {
                str = strArr2[i2];
                if (str == null) {
                    throw new ExpectedValueException(strArr[i2]);
                }
                bitSet.set(i2);
            }
            if (strArr[i2].equalsIgnoreCase(m)) {
                str2 = strArr2[i2];
                if (str2 == null) {
                    throw new ExpectedValueException(strArr[i2]);
                }
                bitSet.set(i2);
            } else if (!strArr[i2].equalsIgnoreCase(n)) {
                continue;
            } else {
                if (strArr2[i2] == null) {
                    throw new ExpectedValueException(strArr[i2]);
                }
                try {
                    String str3 = new String(new Decoder().decodeBuffer(new ByteArrayInputStream(strArr2[i2].getBytes("UTF-8"))), "windows-1251");
                    bitSet.set(i2);
                    str2 = str3;
                } catch (UnsupportedEncodingException e2) {
                    throw new InvalidValueException(strArr[i2], strArr2[i2], e2);
                } catch (IOException e3) {
                    throw new InvalidValueException(strArr[i2], strArr2[i2], e3);
                }
            }
        }
        if (this.k.getAction() == 1) {
            this.o = a(str, AbstractLicense.getParameterTruncatedByLength(str2), this.k);
        }
    }

    public void uninstall() throws Exception {
        SelfTester_JavaCSP.removeJarVerifyTest(JCSPInstaller.class.getName());
        FileTools.removeFile(f, this.k);
        SecurityProperties.delSecurityLinks(g);
        SecurityProperties.delSecurityLinks(h);
        SecurityProperties.delSecurityLinks(i);
        SecurityProperties.delSecurityLinks(j);
        MainControlPaneConfig config = MainControlPaneConfig.getConfig();
        config.removeClass(JCSPLicensePage.class.getName());
        config.removeClass(JCSPSettings.class.getName());
        if (this.k.isRemoveSettings()) {
            new JCPPref(JCSP.class).removeNode();
        }
    }
}
