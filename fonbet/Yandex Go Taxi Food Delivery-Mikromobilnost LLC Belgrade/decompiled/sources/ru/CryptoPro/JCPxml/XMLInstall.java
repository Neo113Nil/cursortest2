package ru.CryptoPro.JCPxml;

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
public class XMLInstall implements PackageInterface {
    public static final Map ALL_INSTALL;
    public static final String PACKAGE_NICKNAME = "JCPxml";
    private GeneralSettingsInterface general = null;
    private static final String INSTALL_JAR = "JCPxml.jar";
    private static final String INSTALL_XMLDSIGRI_JAR = "XMLDSigRI.jar";
    public static final String[] ALL_JARS = {INSTALL_JAR, INSTALL_XMLDSIGRI_JAR};

    static {
        HashMap hashMap = new HashMap(1);
        ALL_INSTALL = hashMap;
        hashMap.put(XMLInstall.class.getName(), "true");
    }

    public static void main(String[] strArr) {
        if (ShellInstaller.makeActionNoEx((URL) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCPxml.XMLInstall.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                CodeSource codeSource = XMLInstall.class.getProtectionDomain().getCodeSource();
                if (codeSource != null) {
                    return codeSource.getLocation();
                }
                return null;
            }
        }), ALL_INSTALL, ALL_JARS, strArr)) {
            return;
        }
        System.exit(1);
    }

    public String depends() {
        return "Installer,JCP";
    }

    public void install() throws Exception {
        JCPInstaller.copyFileWithCheck(INSTALL_JAR, this.general);
        JCPInstaller.copyFileWithCheck(INSTALL_XMLDSIGRI_JAR, this.general);
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
        this.general = generalSettingsInterface;
    }

    public void uninstall() throws Exception {
        FileTools.removeFile(INSTALL_XMLDSIGRI_JAR, this.general);
        FileTools.removeFile(INSTALL_JAR, this.general);
    }
}
