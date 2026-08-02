package ru.CryptoPro.CAdES.installer;

import java.net.URL;
import java.security.AccessController;
import java.security.CodeSource;
import java.security.PrivilegedAction;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.Install.ArgumentException;
import ru.CryptoPro.Install.FileTools;
import ru.CryptoPro.Install.GeneralSettingsInterface;
import ru.CryptoPro.Install.PackageInterface;
import ru.CryptoPro.Install.ShellInstaller;
import ru.CryptoPro.JCP.Install.JCPInstaller;

/* loaded from: classes4.dex */
public class Install implements PackageInterface {
    public static final Map ALL_INSTALL;
    public static final String[] ALL_JARS = {"CAdES.jar"};
    public static final String PACKAGE_NICKNAME = "CAdES";
    public GeneralSettingsInterface a = null;

    /* renamed from: ru.CryptoPro.CAdES.installer.Install$1, reason: invalid class name */
    class AnonymousClass1 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            CodeSource codeSource = Install.class.getProtectionDomain().getCodeSource();
            if (codeSource != null) {
                return codeSource.getLocation();
            }
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap(1);
        ALL_INSTALL = hashMap;
        hashMap.put(Install.class.getName(), "true");
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new AnonymousClass1()), ALL_INSTALL, ALL_JARS, strArr)) {
            return;
        }
        System.exit(1);
    }

    public String depends() {
        return "Installer,JCP,AdES-core";
    }

    public void install() throws Exception {
        JCPInstaller.copyFileWithCheck("CAdES.jar", this.a);
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
        FileTools.removeFile("CAdES.jar", this.a);
    }
}
