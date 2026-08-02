package ru.CryptoPro.sspiSSL;

import defpackage.puu0;
import java.net.URL;
import java.security.AccessController;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.FileTools;
import ru.CryptoPro.Install.GeneralSettingsInterface;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.SecurityProperties;
import ru.CryptoPro.Install.ShellInstaller;
import ru.CryptoPro.JCP.Install.JCPInstaller;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
public class JSSPIInstall implements PackageInterface {
    public static final Map ALL_INSTALL;
    public static final String[] ALL_JARS = {"sspiSSL.jar"};
    public static final String PACKAGE_NICKNAME = "sspiSSL";
    public GeneralSettingsInterface a = null;

    static {
        HashMap hashMap = new HashMap(1);
        ALL_INSTALL = hashMap;
        hashMap.put(JSSPIInstall.class.getName(), "true");
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new puu0(25)), ALL_INSTALL, ALL_JARS, strArr)) {
            return;
        }
        System.exit(1);
    }

    public String depends() {
        return "Installer,JCP,";
    }

    public void install() throws Exception {
        boolean z;
        new JCPPref(SSPISSL.class);
        try {
            z = SecurityProperties.addSecurityLinks("ru.CryptoPro.sspiSSL.SSPISSL");
            try {
                JCPInstaller.copyFileWithCheck("sspiSSL.jar", this.a);
            } catch (Throwable th) {
                th = th;
                if (z) {
                    SecurityProperties.delSecurityLinks("ru.CryptoPro.sspiSSL.SSPISSL");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public String nickname() {
        return PACKAGE_NICKNAME;
    }

    public String[] options() {
        return new String[0];
    }

    public String[] optionsAnnotation() {
        return new String[0];
    }

    public void parseArgs(String[] strArr, String[] strArr2, BitSet bitSet, GeneralSettingsInterface generalSettingsInterface) throws ArgumentException {
        this.a = generalSettingsInterface;
    }

    public void uninstall() throws Exception {
        FileTools.removeFile("sspiSSL.jar", this.a);
        SecurityProperties.delSecurityLinks("ru.CryptoPro.sspiSSL.SSPISSL");
    }
}
