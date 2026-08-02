package ru.CryptoPro.JCP.tools;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.g8e;
import defpackage.unr0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import ru.CryptoPro.AdES.AdESConfigParameters;
import ru.CryptoPro.Crypto.CryptoProvider;
import ru.CryptoPro.Crypto.tools.SelfTester_Crypt;
import ru.CryptoPro.JCP.ASN.CertificateExtensions._CertificateExtensionsValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88._PKIX1Explicit88Values;
import ru.CryptoPro.JCP.ControlPane.MainControlPaneConfig;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageReader;
import ru.CryptoPro.JCP.ProviderParameters;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.Util.DefaultProvider;
import ru.CryptoPro.JCP.Util.DefaultProviders;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.CPVerify.DigestStoreReg;
import ru.CryptoPro.JCP.tools.CertReader.ExtendedCerReader;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCSP.JCSPLicense;
import ru.CryptoPro.JCSP.SSLProviderConstants;
import ru.CryptoPro.JCSP.params.DefaultCSPProvider;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.CryptoPro.JCSP.tools.SelfTester_JavaCSP;
import ru.CryptoPro.reprov.RevCheck;
import ru.CryptoPro.reprov.certpath.URICertStore;
import ru.CryptoPro.ssl.cl_39;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public class Check {
    public static final String ALL = "-all";
    public static final String DEF = "-def";
    public static final String DIR = "-dir";
    public static final String HLP = "-hlp";
    public static final String PHELP = "HELP\nrun: Check <options> <options with values>\noptions:\n-hlp        print this help\n-all        all test and writing jar with results\n-def        default tests\noptions with values:\n-dir        work directory for \"all\" tests   (def: current)\n\n";
    public static String d;
    public static final Vector h;
    public static final ResourceBundle a = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    public static final String b = System.getProperty("line.separator");
    public static final String c = File.separator;
    public static final StringBuffer e = new StringBuffer();
    public static final String[] JAR_VER_CLASS_NAMES = {"com.objsys.asn1j.runtime.Asn1Value", "ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateKeys", "com.intellij.uiDesigner.core.Spacer", DefaultProviders.CLASS_PROVIDER_JCP, "ru.CryptoPro.Install.ShellInstaller", "ru.CryptoPro.JCPRequest.GostCertificateRequest", "ru.CryptoPro.JCPxml.xmldsig.JCPXMLDSigInit", DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER, SSLProviderConstants.CP_SSL_PROVIDER, "ru.CryptoPro.TestUtil.TestUtils", "ru.CryptoPro.JCPxml.dsig.internal.dom.XMLDSigRI", "ru.CryptoPro.AdES.AdESConfig", "ru.CryptoPro.CAdES.CAdESSignature", "ru.CryptoPro.XAdES.XAdESSignature", "ru.CryptoPro.reprov.RevCheck", "ru.CryptoPro.reprov.utils.CRLCertUtils", "ru.CryptoPro.JCP.KeyStore.J6CF.CardReader", "ru.CryptoPro.JCP.KeyStore.J6Oscar.OscarService", DefaultProviders.CLASS_PROVIDER_CSP, "ru.CryptoPro.JCP.KeyStore.Rutoken.RutokenStore", "ru.CryptoPro.JCP.ControlPane.JCPInputLicense"};
    public static final Class[] f = {JCP.class, PrivateKeySpec.class, HDImageReader.class, AlgIdSpec.class, CertifiedRandom.class, DigestStoreReg.class, ExtendedCerReader.class, License.class, MainControlPaneConfig.class, _PKIX1Explicit88Values.class, _CertificateExtensionsValues.class, DefaultProvider.class, KeyUsageControlUtility.class};
    public static final Class[] g = {JCP.class, CertifiedRandom.class, MainControlPaneConfig.class};

    static {
        Vector vector = new Vector(6);
        h = vector;
        try {
            String str = CryptoProvider.PROVIDER_NAME;
            vector.add(CryptoProvider.class);
            String str2 = SelfTester_Crypt.THREAD_NAME;
            vector.add(SelfTester_Crypt.class);
            String str3 = RevCheck.PROVIDER_NAME;
            vector.add(RevCheck.class);
            int i = URICertStore.i;
            vector.add(URICertStore.class);
            vector.add(Class.forName("ru.CryptoPro.Install.ShellInstaller"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            h.add(Class.forName(TLSSettings.DEFAULT_SETTINGS_CLASS_NAME));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            Vector vector2 = h;
            int i2 = JCSPLicense.g;
            vector2.add(JCSPLicense.class);
            String str4 = SelfTester_JavaCSP.THREAD_NAME;
            vector2.add(SelfTester_JavaCSP.class);
            int i3 = DefaultCSPProvider.KEY_SET_USER;
            vector2.add(DefaultCSPProvider.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            Vector vector3 = h;
            vector3.add(Class.forName("ru.CryptoPro.JCP.KeyStore.J6CF.ReaderConfig"));
            vector3.add(Class.forName("ru.CryptoPro.JCP.KeyStore.J6Oscar.OscarConfig"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            Vector vector4 = h;
            String str5 = AdESConfigParameters.PREF_NAME;
            vector4.add(AdESConfigParameters.class);
        } catch (ClassNotFoundException unused5) {
        }
    }

    public static void a(StringBuffer stringBuffer) {
        String str = b;
        stringBuffer.append(str);
        stringBuffer.append(str);
        stringBuffer.append("Supported charsets:");
        Iterator<Charset> it = Charset.availableCharsets().values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            stringBuffer.append(str);
            if (!hasNext) {
                return;
            } else {
                stringBuffer.append(it.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0350 A[Catch: BackingStoreException -> 0x036a, TryCatch #6 {BackingStoreException -> 0x036a, blocks: (B:105:0x034a, B:107:0x0350, B:109:0x035a), top: B:104:0x034a }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bd A[LOOP:6: B:112:0x03ba->B:114:0x03bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cd A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0293 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028b A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a1 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02df A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, TryCatch #5 {ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x030a, blocks: (B:80:0x0245, B:82:0x028b, B:83:0x028f, B:84:0x0298, B:86:0x02a1, B:87:0x02a5, B:88:0x02ae, B:90:0x02c5, B:91:0x02d1, B:93:0x02df, B:94:0x0307, B:141:0x02ea, B:142:0x02f1, B:143:0x02cd, B:144:0x02a9, B:145:0x0293), top: B:79:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031c A[Catch: BackingStoreException -> 0x0336, TryCatch #10 {BackingStoreException -> 0x0336, blocks: (B:97:0x0316, B:99:0x031c, B:101:0x0326), top: B:96:0x0316 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ResourceBundle] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void all() {
        ?? r3;
        String str;
        String str2;
        long j;
        long j2;
        int i;
        Preferences systemRoot;
        Preferences userRoot;
        File[] listFiles;
        File file;
        String string;
        String string2;
        String str3;
        String str4;
        String[] strArr;
        Properties properties;
        String str5 = "LicenseTillN";
        String str6 = "LicenseUndef";
        String str7 = "panel.licensePage.SerialUndef";
        String str8 = "SerialLabel";
        ?? r12 = a;
        StringBuffer stringBuffer = e;
        f(stringBuffer);
        d(stringBuffer);
        String str9 = b;
        stringBuffer.append(str9);
        stringBuffer.append(str9);
        stringBuffer.append("--- SYSTEM PROPERTIES ---");
        stringBuffer.append(str9);
        Properties properties2 = System.getProperties();
        Enumeration keys = properties2.keys();
        Enumeration keys2 = System.getProperties().keys();
        String str10 = "LicensePerm";
        int i2 = 0;
        while (keys2.hasMoreElements()) {
            String str11 = (String) keys2.nextElement();
            String str12 = str5;
            if (i2 < str11.length()) {
                i2 = str11.length();
            }
            str5 = str12;
        }
        String str13 = str5;
        while (keys.hasMoreElements()) {
            int i3 = i2;
            String str14 = (String) keys.nextElement();
            String str15 = str6;
            String property = properties2.getProperty(str14);
            stringBuffer.append(str14);
            int i4 = 0;
            while (true) {
                properties = properties2;
                if (i4 < (i3 - str14.length()) + 5) {
                    stringBuffer.append(" ");
                    i4++;
                    properties2 = properties;
                }
            }
            stringBuffer.append(property);
            stringBuffer.append(str9);
            str6 = str15;
            i2 = i3;
            properties2 = properties;
        }
        String str16 = str6;
        Provider[] providers = Security.getProviders();
        stringBuffer.append(str9);
        stringBuffer.append(str9);
        stringBuffer.append("--- PROVIDERS ---");
        for (int i5 = 0; i5 < providers.length; i5++) {
            stringBuffer.append(str9);
            stringBuffer.append("provider[");
            stringBuffer.append(i5);
            stringBuffer.append("] = ");
            stringBuffer.append(providers[i5]);
        }
        stringBuffer.append(str9);
        stringBuffer.append(str9);
        stringBuffer.append("--- JAR VERSIONS ---");
        int i6 = 0;
        while (true) {
            String[] strArr2 = JAR_VER_CLASS_NAMES;
            if (i6 >= strArr2.length) {
                break;
            }
            String str17 = strArr2[i6];
            int i7 = i6;
            String jarName = JarTools.getJarName(str17, false);
            if (jarName != null) {
                str3 = str7;
                str4 = str8;
                strArr = new String[]{jarName, g8e.o(" build ", JarTools.getFromManifest(str17, ProviderParameters.PRODUCT_BUILD_ATTR, "0.0.0")), g8e.o(" version ", JarTools.getFromManifest(str17, ProviderParameters.PRODUCT_VER_ATTR, ProviderParameters.DEFAULT_PRODUCT_VER))};
            } else {
                str3 = str7;
                str4 = str8;
                strArr = null;
            }
            if (strArr != null && strArr.length != 0) {
                stringBuffer.append(str9);
                for (String str18 : strArr) {
                    stringBuffer.append(str18);
                }
            }
            i6 = i7 + 1;
            str7 = str3;
            str8 = str4;
        }
        String str19 = str7;
        String str20 = str8;
        try {
            License license = new License();
            stringBuffer.append(str9);
            stringBuffer.append(str9);
            j = 0;
            try {
                stringBuffer.append("--- JCP LICENSE ---");
                stringBuffer.append(str9);
                stringBuffer.append(r12.getString("OrganLabel"));
                stringBuffer.append(" ");
                stringBuffer.append(license.getCompanyName());
                stringBuffer.append(str9);
                stringBuffer.append(r12.getString("TypeLabel"));
                stringBuffer.append(" ");
                stringBuffer.append(license.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
                stringBuffer.append(Extension.SEMICOLON_SPACE);
                stringBuffer.append(license.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
                stringBuffer.append(str9);
                str2 = str20;
                try {
                    stringBuffer.append(r12.getString(str2));
                    stringBuffer.append(" ");
                    String productID = license.getProductID();
                    if (productID.length() > 0) {
                        j2 = -2;
                        try {
                            string = productID.substring(0, 20);
                            str = str19;
                        } catch (IOException unused) {
                            r3 = str13;
                            str = str19;
                        }
                    } else {
                        str = str19;
                        j2 = -2;
                        try {
                            string = r12.getString(str);
                        } catch (IOException unused2) {
                            r3 = str13;
                            int i8 = JCSPLicense.g;
                            Constructor constructor = JCSPLicense.class.getConstructor(null);
                            constructor.setAccessible(true);
                            License license2 = (License) constructor.newInstance(null);
                            stringBuffer.append(str9);
                            stringBuffer.append(str9);
                            stringBuffer.append("--- JCSP LICENSE ---");
                            stringBuffer.append(str9);
                            stringBuffer.append(r12.getString("OrganLabel"));
                            stringBuffer.append(" ");
                            stringBuffer.append(license2.getCompanyName());
                            stringBuffer.append(str9);
                            stringBuffer.append(r12.getString("TypeLabel"));
                            stringBuffer.append(" ");
                            stringBuffer.append(license2.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
                            stringBuffer.append(Extension.SEMICOLON_SPACE);
                            stringBuffer.append(license2.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
                            stringBuffer.append(str9);
                            stringBuffer.append(r12.getString(str2));
                            stringBuffer.append(" ");
                            String productID2 = license2.getProductID();
                            stringBuffer.append(productID2.length() > 0 ? productID2.substring(0, 20) : r12.getString(str));
                            stringBuffer.append(str9);
                            long endDate = license2.getEndDate();
                            stringBuffer.append(endDate == j2 ? r12.getString(str16) : endDate == j ? r12.getString(str10) : new MessageFormat(r12.getString(r3)).format(new Object[]{new Date(endDate)}));
                            test(stringBuffer, false);
                            systemRoot = Preferences.systemRoot();
                            if (systemRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                            }
                            userRoot = Preferences.userRoot();
                            if (userRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                            }
                            a(stringBuffer);
                            JCPLogger.info(stringBuffer.toString());
                            StringBuilder sb = new StringBuilder();
                            sb.append(System.getProperty("java.home"));
                            String str21 = c;
                            String r = g8e.r(sb, str21, "lib", str21, BKSTrustStore.STORAGE_DIRECTORY);
                            File file2 = new File(g8e.p(r, str21, "java.security"));
                            listFiles = new File(r).listFiles();
                            stringBuffer.append(str9);
                            stringBuffer.append("-------");
                            while (i < listFiles.length) {
                            }
                            file = new File(unr0.r(new StringBuilder(), d, str21, "CryptoProJCPInfo.txt"));
                            Array.writeFile(file, stringBuffer.toString().getBytes("UTF-8"));
                            File[] fileArr = {file2, file};
                            String str22 = d + str21 + "CryptoProJCPInfo.jar";
                            writeJar(fileArr, str22);
                            JCPLogger.info("Jar writing to ", str22);
                            if (file.delete()) {
                            }
                        }
                    }
                    stringBuffer.append(string);
                    stringBuffer.append(str9);
                    r3 = license.isValidVersion();
                    try {
                        if (r3 != 0) {
                            long endDate2 = license.getEndDate();
                            if (endDate2 == j2) {
                                try {
                                    string2 = r12.getString(str16);
                                    str16 = str16;
                                } catch (IOException unused3) {
                                    str16 = str16;
                                    r3 = str13;
                                    int i82 = JCSPLicense.g;
                                    Constructor constructor2 = JCSPLicense.class.getConstructor(null);
                                    constructor2.setAccessible(true);
                                    License license22 = (License) constructor2.newInstance(null);
                                    stringBuffer.append(str9);
                                    stringBuffer.append(str9);
                                    stringBuffer.append("--- JCSP LICENSE ---");
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString("OrganLabel"));
                                    stringBuffer.append(" ");
                                    stringBuffer.append(license22.getCompanyName());
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString("TypeLabel"));
                                    stringBuffer.append(" ");
                                    stringBuffer.append(license22.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
                                    stringBuffer.append(Extension.SEMICOLON_SPACE);
                                    stringBuffer.append(license22.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString(str2));
                                    stringBuffer.append(" ");
                                    String productID22 = license22.getProductID();
                                    stringBuffer.append(productID22.length() > 0 ? productID22.substring(0, 20) : r12.getString(str));
                                    stringBuffer.append(str9);
                                    long endDate3 = license22.getEndDate();
                                    stringBuffer.append(endDate3 == j2 ? r12.getString(str16) : endDate3 == j ? r12.getString(str10) : new MessageFormat(r12.getString(r3)).format(new Object[]{new Date(endDate3)}));
                                    test(stringBuffer, false);
                                    systemRoot = Preferences.systemRoot();
                                    if (systemRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                                    }
                                    userRoot = Preferences.userRoot();
                                    if (userRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                                    }
                                    a(stringBuffer);
                                    JCPLogger.info(stringBuffer.toString());
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(System.getProperty("java.home"));
                                    String str212 = c;
                                    String r2 = g8e.r(sb2, str212, "lib", str212, BKSTrustStore.STORAGE_DIRECTORY);
                                    File file22 = new File(g8e.p(r2, str212, "java.security"));
                                    listFiles = new File(r2).listFiles();
                                    stringBuffer.append(str9);
                                    stringBuffer.append("-------");
                                    while (i < listFiles.length) {
                                    }
                                    file = new File(unr0.r(new StringBuilder(), d, str212, "CryptoProJCPInfo.txt"));
                                    Array.writeFile(file, stringBuffer.toString().getBytes("UTF-8"));
                                    File[] fileArr2 = {file22, file};
                                    String str222 = d + str212 + "CryptoProJCPInfo.jar";
                                    writeJar(fileArr2, str222);
                                    JCPLogger.info("Jar writing to ", str222);
                                    if (file.delete()) {
                                    }
                                }
                            } else if (endDate2 == 0) {
                                str16 = str16;
                                try {
                                    string2 = r12.getString(str10);
                                    str10 = str10;
                                } catch (IOException unused4) {
                                    str10 = str10;
                                    r3 = str13;
                                    int i822 = JCSPLicense.g;
                                    Constructor constructor22 = JCSPLicense.class.getConstructor(null);
                                    constructor22.setAccessible(true);
                                    License license222 = (License) constructor22.newInstance(null);
                                    stringBuffer.append(str9);
                                    stringBuffer.append(str9);
                                    stringBuffer.append("--- JCSP LICENSE ---");
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString("OrganLabel"));
                                    stringBuffer.append(" ");
                                    stringBuffer.append(license222.getCompanyName());
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString("TypeLabel"));
                                    stringBuffer.append(" ");
                                    stringBuffer.append(license222.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
                                    stringBuffer.append(Extension.SEMICOLON_SPACE);
                                    stringBuffer.append(license222.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
                                    stringBuffer.append(str9);
                                    stringBuffer.append(r12.getString(str2));
                                    stringBuffer.append(" ");
                                    String productID222 = license222.getProductID();
                                    stringBuffer.append(productID222.length() > 0 ? productID222.substring(0, 20) : r12.getString(str));
                                    stringBuffer.append(str9);
                                    long endDate32 = license222.getEndDate();
                                    stringBuffer.append(endDate32 == j2 ? r12.getString(str16) : endDate32 == j ? r12.getString(str10) : new MessageFormat(r12.getString(r3)).format(new Object[]{new Date(endDate32)}));
                                    test(stringBuffer, false);
                                    systemRoot = Preferences.systemRoot();
                                    if (systemRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                                    }
                                    userRoot = Preferences.userRoot();
                                    if (userRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                                    }
                                    a(stringBuffer);
                                    JCPLogger.info(stringBuffer.toString());
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append(System.getProperty("java.home"));
                                    String str2122 = c;
                                    String r22 = g8e.r(sb22, str2122, "lib", str2122, BKSTrustStore.STORAGE_DIRECTORY);
                                    File file222 = new File(g8e.p(r22, str2122, "java.security"));
                                    listFiles = new File(r22).listFiles();
                                    stringBuffer.append(str9);
                                    stringBuffer.append("-------");
                                    while (i < listFiles.length) {
                                    }
                                    file = new File(unr0.r(new StringBuilder(), d, str2122, "CryptoProJCPInfo.txt"));
                                    Array.writeFile(file, stringBuffer.toString().getBytes("UTF-8"));
                                    File[] fileArr22 = {file222, file};
                                    String str2222 = d + str2122 + "CryptoProJCPInfo.jar";
                                    writeJar(fileArr22, str2222);
                                    JCPLogger.info("Jar writing to ", str2222);
                                    if (file.delete()) {
                                    }
                                }
                            } else {
                                str16 = str16;
                                Date date = new Date(endDate2);
                                String str23 = str13;
                                string2 = new MessageFormat(r12.getString(str23)).format(new Object[]{date});
                                r3 = str23;
                            }
                            r3 = str13;
                        } else {
                            r3 = str13;
                            string2 = r12.getString("incorrect_license_version");
                        }
                        stringBuffer.append(string2);
                    } catch (IOException unused5) {
                    }
                } catch (IOException unused6) {
                    r3 = str13;
                    str = str19;
                    j2 = -2;
                    int i8222 = JCSPLicense.g;
                    Constructor constructor222 = JCSPLicense.class.getConstructor(null);
                    constructor222.setAccessible(true);
                    License license2222 = (License) constructor222.newInstance(null);
                    stringBuffer.append(str9);
                    stringBuffer.append(str9);
                    stringBuffer.append("--- JCSP LICENSE ---");
                    stringBuffer.append(str9);
                    stringBuffer.append(r12.getString("OrganLabel"));
                    stringBuffer.append(" ");
                    stringBuffer.append(license2222.getCompanyName());
                    stringBuffer.append(str9);
                    stringBuffer.append(r12.getString("TypeLabel"));
                    stringBuffer.append(" ");
                    stringBuffer.append(license2222.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
                    stringBuffer.append(Extension.SEMICOLON_SPACE);
                    stringBuffer.append(license2222.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
                    stringBuffer.append(str9);
                    stringBuffer.append(r12.getString(str2));
                    stringBuffer.append(" ");
                    String productID2222 = license2222.getProductID();
                    stringBuffer.append(productID2222.length() > 0 ? productID2222.substring(0, 20) : r12.getString(str));
                    stringBuffer.append(str9);
                    long endDate322 = license2222.getEndDate();
                    stringBuffer.append(endDate322 == j2 ? r12.getString(str16) : endDate322 == j ? r12.getString(str10) : new MessageFormat(r12.getString(r3)).format(new Object[]{new Date(endDate322)}));
                    test(stringBuffer, false);
                    systemRoot = Preferences.systemRoot();
                    if (systemRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                    }
                    userRoot = Preferences.userRoot();
                    if (userRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                    }
                    a(stringBuffer);
                    JCPLogger.info(stringBuffer.toString());
                    StringBuilder sb222 = new StringBuilder();
                    sb222.append(System.getProperty("java.home"));
                    String str21222 = c;
                    String r222 = g8e.r(sb222, str21222, "lib", str21222, BKSTrustStore.STORAGE_DIRECTORY);
                    File file2222 = new File(g8e.p(r222, str21222, "java.security"));
                    listFiles = new File(r222).listFiles();
                    stringBuffer.append(str9);
                    stringBuffer.append("-------");
                    while (i < listFiles.length) {
                    }
                    file = new File(unr0.r(new StringBuilder(), d, str21222, "CryptoProJCPInfo.txt"));
                    Array.writeFile(file, stringBuffer.toString().getBytes("UTF-8"));
                    File[] fileArr222 = {file2222, file};
                    String str22222 = d + str21222 + "CryptoProJCPInfo.jar";
                    writeJar(fileArr222, str22222);
                    JCPLogger.info("Jar writing to ", str22222);
                    if (file.delete()) {
                    }
                }
            } catch (IOException unused7) {
                r3 = str13;
                str = str19;
                str2 = str20;
            }
        } catch (IOException unused8) {
            r3 = str13;
            str = str19;
            str2 = str20;
            j = 0;
        }
        try {
            int i82222 = JCSPLicense.g;
            Constructor constructor2222 = JCSPLicense.class.getConstructor(null);
            constructor2222.setAccessible(true);
            License license22222 = (License) constructor2222.newInstance(null);
            stringBuffer.append(str9);
            stringBuffer.append(str9);
            stringBuffer.append("--- JCSP LICENSE ---");
            stringBuffer.append(str9);
            stringBuffer.append(r12.getString("OrganLabel"));
            stringBuffer.append(" ");
            stringBuffer.append(license22222.getCompanyName());
            stringBuffer.append(str9);
            stringBuffer.append(r12.getString("TypeLabel"));
            stringBuffer.append(" ");
            stringBuffer.append(license22222.isServer() ? r12.getString("panel.licensePage.ServerLic") : r12.getString("panel.licensePage.ClientLic"));
            stringBuffer.append(Extension.SEMICOLON_SPACE);
            stringBuffer.append(license22222.hasCrypt() ? r12.getString("panel.licensePage.SignAndEnc") : r12.getString("panel.licensePage.SignOnly"));
            stringBuffer.append(str9);
            stringBuffer.append(r12.getString(str2));
            stringBuffer.append(" ");
            String productID22222 = license22222.getProductID();
            stringBuffer.append(productID22222.length() > 0 ? productID22222.substring(0, 20) : r12.getString(str));
            stringBuffer.append(str9);
            long endDate3222 = license22222.getEndDate();
            stringBuffer.append(endDate3222 == j2 ? r12.getString(str16) : endDate3222 == j ? r12.getString(str10) : new MessageFormat(r12.getString(r3)).format(new Object[]{new Date(endDate3222)}));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused9) {
        }
        test(stringBuffer, false);
        systemRoot = Preferences.systemRoot();
        try {
            if (systemRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                Preferences node = systemRoot.node(ClearCryptoProPrefs.COUNTRY);
                if (node.nodeExists(ClearCryptoProPrefs.COMPANY)) {
                    b(node.node(ClearCryptoProPrefs.COMPANY));
                    stringBuffer.append(str9);
                    stringBuffer.append("Get JCP System Preferences - ok");
                }
            }
        } catch (BackingStoreException e2) {
            stringBuffer.append(str9);
            stringBuffer.append("Get JCP System Preferences error: ");
            stringBuffer.append(e2.toString());
        }
        userRoot = Preferences.userRoot();
        try {
            if (userRoot.nodeExists(ClearCryptoProPrefs.COUNTRY)) {
                Preferences node2 = userRoot.node(ClearCryptoProPrefs.COUNTRY);
                if (node2.nodeExists(ClearCryptoProPrefs.COMPANY)) {
                    b(node2.node(ClearCryptoProPrefs.COMPANY));
                    stringBuffer.append(str9);
                    stringBuffer.append("Get JCP User Preferences - ok");
                }
            }
        } catch (BackingStoreException e3) {
            stringBuffer.append(str9);
            stringBuffer.append("Get JCP User Preferences error: ");
            stringBuffer.append(e3.toString());
        }
        a(stringBuffer);
        JCPLogger.info(stringBuffer.toString());
        StringBuilder sb2222 = new StringBuilder();
        sb2222.append(System.getProperty("java.home"));
        String str212222 = c;
        String r2222 = g8e.r(sb2222, str212222, "lib", str212222, BKSTrustStore.STORAGE_DIRECTORY);
        File file22222 = new File(g8e.p(r2222, str212222, "java.security"));
        listFiles = new File(r2222).listFiles();
        stringBuffer.append(str9);
        stringBuffer.append("-------");
        for (i = 0; i < listFiles.length; i++) {
            stringBuffer.append(str9);
            stringBuffer.append(listFiles[i].getName());
            stringBuffer.append(" size: ");
            stringBuffer.append(listFiles[i].length());
        }
        file = new File(unr0.r(new StringBuilder(), d, str212222, "CryptoProJCPInfo.txt"));
        try {
            Array.writeFile(file, stringBuffer.toString().getBytes("UTF-8"));
        } catch (IOException e4) {
            JCPLogger.info("Can't writing file", e4.toString());
        }
        File[] fileArr2222 = {file22222, file};
        try {
            String str222222 = d + str212222 + "CryptoProJCPInfo.jar";
            writeJar(fileArr2222, str222222);
            JCPLogger.info("Jar writing to ", str222222);
        } catch (IOException e5) {
            JCPLogger.info("Can't writing file", e5.toString());
        }
        if (file.delete()) {
            return;
        }
        JCPLogger.info("Can't delete temp file", file.getPath());
    }

    public static void b(Preferences preferences) {
        for (String str : preferences.keys()) {
            preferences.get(str, null);
        }
        for (String str2 : preferences.childrenNames()) {
            b(preferences.node(str2));
        }
    }

    public static void c(Preferences preferences, String str, StringBuffer stringBuffer) {
        String str2 = b;
        try {
            stringBuffer.append(str2);
            stringBuffer.append(str);
            String[] keys = preferences.keys();
            for (int i = 0; i < keys.length; i++) {
                stringBuffer.append(str2);
                stringBuffer.append("   " + keys[i] + " = " + preferences.get(keys[i], null));
            }
        } catch (BackingStoreException e2) {
            stringBuffer.append(str2);
            stringBuffer.append(" Preferences error: " + e2.toString());
        }
    }

    public static void d(StringBuffer stringBuffer) {
        String str = b;
        stringBuffer.append(str);
        e(Preferences.systemNodeForPackage(JCP.class), "System", stringBuffer);
        e(Preferences.userNodeForPackage(JCP.class), "User", stringBuffer);
        stringBuffer.append(str);
        stringBuffer.append(str);
        stringBuffer.append("--- PREFERENCES ---");
        stringBuffer.append(str);
        stringBuffer.append("*** SYSTEM PREFERENCES ***");
        int i = 0;
        int i2 = 0;
        while (true) {
            Class[] clsArr = f;
            if (i2 >= clsArr.length) {
                break;
            }
            c(Preferences.systemNodeForPackage(clsArr[i2]), clsArr[i2].getName().concat(Extension.COLON_SPACE), stringBuffer);
            i2++;
        }
        Vector vector = h;
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            c(Preferences.systemNodeForPackage(cls), cls.getName().concat(Extension.COLON_SPACE), stringBuffer);
        }
        stringBuffer.append(str);
        stringBuffer.append("*** USER PREFERENCES ***");
        while (true) {
            Class[] clsArr2 = g;
            if (i >= clsArr2.length) {
                break;
            }
            c(Preferences.userNodeForPackage(clsArr2[i]), clsArr2[i].getName().concat(Extension.COLON_SPACE), stringBuffer);
            i++;
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            c(Preferences.userNodeForPackage(cls2), cls2.getName().concat(Extension.COLON_SPACE), stringBuffer);
        }
    }

    public static void def() {
        StringBuffer stringBuffer = e;
        f(stringBuffer);
        d(stringBuffer);
        test(null, true);
        a(stringBuffer);
        JCPLogger.info(stringBuffer.toString());
    }

    public static void e(Preferences preferences, String str, StringBuffer stringBuffer) {
        String str2;
        String str3 = b;
        try {
            preferences.put("preftest", WriteBlocks.OK);
            preferences.flush();
            preferences.get("preftest", null);
            if (preferences.get("preftest", null).equals(WriteBlocks.OK)) {
                stringBuffer.append(str3);
                stringBuffer.append(str);
                str2 = " Preferences - ok";
            } else {
                stringBuffer.append(str3);
                stringBuffer.append(str);
                str2 = " Preferences error";
            }
            stringBuffer.append(str2);
        } catch (Exception e2) {
            stringBuffer.append(str3);
            stringBuffer.append(str);
            stringBuffer.append(" Preferences error: " + e2.toString());
        }
    }

    public static void f(StringBuffer stringBuffer) {
        String str = b;
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("os.name"));
        if (System.getProperty("sun.os.patch.level") != null) {
            stringBuffer.append(Extension.SEMICOLON_SPACE);
            stringBuffer.append(System.getProperty("sun.os.patch.level"));
        }
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("os.version"));
        stringBuffer.append(str);
        stringBuffer.append(Runtime.getRuntime().availableProcessors());
        stringBuffer.append(" proc.");
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("os.arch"));
        stringBuffer.append(str);
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("java.runtime.name"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.runtime.version"));
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("java.version"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty(Platform.STR_VENDOR_PROPERTY));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.vendor.url"));
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("java.vm.specification.name"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.vm.specification.version"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.vm.specification.vendor"));
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("java.vm.name"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.vm.version"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.vm.info"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty(Platform.STR_VM_VENDOR_PROPERTY));
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("java.specification.name"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.specification.version"));
        stringBuffer.append(Extension.SEMICOLON_SPACE);
        stringBuffer.append(System.getProperty("java.specification.vendor"));
        stringBuffer.append(str);
        stringBuffer.append("Java class format version number: ");
        stringBuffer.append(System.getProperty("java.class.version"));
        stringBuffer.append(str);
        stringBuffer.append("JIT: ");
        stringBuffer.append(System.getProperty("java.compiler"));
    }

    public static boolean getFunc(String str, String[] strArr) {
        boolean z = false;
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                z = true;
            }
        }
        return z;
    }

    public static String getValue(String str, String[] strArr, String str2) {
        String str3 = null;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                int i2 = i + 1;
                if (!"-".equals(strArr[i2].substring(0, 1))) {
                    str3 = strArr[i2];
                }
            }
        }
        return str3 == null ? str2 : str3;
    }

    public static void main(String[] strArr) throws IOException {
        try {
            d = getValue(DIR, strArr, new File(Extension.DOT_CHAR).getCanonicalPath());
            if (!new File(d).isDirectory()) {
                d = new File(Extension.DOT_CHAR).getCanonicalPath();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            d = new File(Extension.DOT_CHAR).getCanonicalPath();
        }
        if (strArr.length == 0) {
            def();
        } else if (getFunc("-all", strArr)) {
            all();
            return;
        } else if (getFunc(DEF, strArr)) {
            def();
            return;
        } else if (getFunc("-all", strArr) && getFunc(DEF, strArr) && !getFunc(HLP, strArr)) {
            return;
        }
        JCPLogger.info(PHELP);
    }

    public static void test(StringBuffer stringBuffer, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = b;
        if (stringBuffer != null) {
            stringBuffer.append(str5);
            stringBuffer.append(str5);
            stringBuffer.append("--- TESTS ---");
        }
        Provider[] providers = Security.getProviders();
        int i = 0;
        int i2 = 0;
        while (true) {
            str = "JCP not installed";
            if (i2 >= providers.length) {
                break;
            }
            if ("JCP".equals(providers[i2].getName())) {
                try {
                    Signature.getInstance("GOST3411withGOST3410EL", "JCP");
                    str = "JCP - ok";
                    break;
                } catch (NoSuchAlgorithmException unused) {
                    str = "JCP doesn't work";
                } catch (NoSuchProviderException unused2) {
                }
            } else {
                i2++;
            }
        }
        if (stringBuffer != null) {
            stringBuffer.append(str5);
            stringBuffer.append(str);
        }
        if (z) {
            JCPLogger.info(str);
        }
        Provider[] providers2 = Security.getProviders();
        int i3 = 0;
        while (true) {
            str2 = "Crypto not installed";
            if (i3 >= providers2.length) {
                break;
            }
            if ("Crypto".equals(providers2[i3].getName())) {
                try {
                    KeyPairGenerator.getInstance("GOST3410DHELEPH", "Crypto");
                    str2 = "Crypto - ok";
                    break;
                } catch (NoSuchAlgorithmException unused3) {
                    str2 = "Crypto doesn't work";
                } catch (NoSuchProviderException unused4) {
                }
            } else {
                i3++;
            }
        }
        if (stringBuffer != null) {
            stringBuffer.append(str5);
            stringBuffer.append(str2);
        }
        if (z) {
            JCPLogger.info(str2);
        }
        Provider[] providers3 = Security.getProviders();
        int i4 = 0;
        while (true) {
            if (i4 >= providers3.length) {
                str3 = "JTLS not installed";
                break;
            }
            if ("JTLS".equals(providers3[i4].getName())) {
                String property = Security.getProperty("ssl.SocketFactory.provider");
                String property2 = Security.getProperty("ssl.ServerSocketFactory.provider");
                String property3 = Security.getProperty("ssl.KeyManagerFactory.algorithm");
                String property4 = Security.getProperty("ssl.TrustManagerFactory.algorithm");
                StringBuffer stringBuffer2 = new StringBuffer("");
                if (property == null || cl_39.SOCKET_FACTORY.indexOf(property) == -1) {
                    stringBuffer2.append("ssl.SocketFactory.provider | MUST BE ru.CryptoPro.ssl.SSLSocketFactoryImpl FOUND ");
                    stringBuffer2.append(property);
                    stringBuffer2.append(str5);
                }
                if (property2 == null || cl_39.SERVER_SOCKET_FACTORY.indexOf(property2) == -1) {
                    stringBuffer2.append("ssl.ServerSocketFactory.provider | MUST BE ru.CryptoPro.ssl.SSLServerSocketFactoryImpl FOUND ");
                    stringBuffer2.append(property2);
                    stringBuffer2.append(str5);
                }
                if (property3 == null || "GostX509".indexOf(property3) == -1) {
                    stringBuffer2.append("ssl.KeyManagerFactory.algorithm | MUST BE GostX509 FOUND ");
                    stringBuffer2.append(property3);
                    stringBuffer2.append(str5);
                }
                if (property4 == null || "GostX509".indexOf(property4) == -1) {
                    stringBuffer2.append("ssl.TrustManagerFactory.algorithm | MUST BE GostX509 FOUND ");
                    stringBuffer2.append(property4);
                    stringBuffer2.append(str5);
                }
                if (stringBuffer2.length() == 0) {
                    str3 = "JTLS - ok";
                } else {
                    StringBuffer stringBuffer3 = new StringBuffer("wrong values in java.security:");
                    stringBuffer3.append(str5);
                    stringBuffer3.append(stringBuffer2);
                    str3 = stringBuffer3.toString();
                }
            } else {
                i4++;
            }
        }
        if (stringBuffer != null) {
            stringBuffer.append(str5);
            stringBuffer.append(str3);
        }
        if (z) {
            JCPLogger.info(str3);
        }
        Provider[] providers4 = Security.getProviders();
        while (true) {
            str4 = "JCSP not installed";
            if (i >= providers4.length) {
                break;
            }
            if ("JCSP".equals(providers4[i].getName())) {
                try {
                    Signature.getInstance("GOST3411withGOST3410EL", "JCSP");
                    KeyPairGenerator.getInstance("GOST3410DHELEPH", "JCSP");
                    str4 = "JCSP - ok";
                    break;
                } catch (NoSuchAlgorithmException unused5) {
                    str4 = "JCSP doesn't work";
                } catch (NoSuchProviderException unused6) {
                }
            } else {
                i++;
            }
        }
        if (stringBuffer != null) {
            stringBuffer.append(str5);
            stringBuffer.append(str4);
        }
        if (z) {
            JCPLogger.info(str4);
        }
    }

    public static void writeJar(File[] fileArr, String str) throws IOException {
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(str));
        for (int i = 0; i < fileArr.length; i++) {
            jarOutputStream.putNextEntry(new JarEntry(fileArr[i].getName()));
            jarOutputStream.write(Array.readFile(fileArr[i]));
            jarOutputStream.closeEntry();
        }
        jarOutputStream.close();
    }
}
