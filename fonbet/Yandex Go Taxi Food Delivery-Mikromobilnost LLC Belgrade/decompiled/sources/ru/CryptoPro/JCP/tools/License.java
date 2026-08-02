package ru.CryptoPro.JCP.tools;

import defpackage.ir61;
import defpackage.kds0;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.w511;
import java.io.IOException;
import java.io.PrintStream;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.jar.JarFile;
import ru.CryptoPro.Crypto.CryptoProvider;
import ru.CryptoPro.JCP.Install.JCPInstaller;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.DefaultProviders;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.yandex.video.player.multiplatform.BuildConfig;

/* loaded from: classes4.dex */
public class License extends AbstractLicense {
    public static final int CRYPTO_MASK = 16;
    public static final int SERVER_MASK = 8;
    public static final String STR_CRYPTO = "Crypto";
    public static final String STR_INCORRECT_CPU_AMOUNT;
    public static final String STR_INCORRECT_FIRST_DATE;
    public static final String STR_INCORRECT_ID_CRYPTO;
    public static final String STR_INCORRECT_ID_FORM;
    public static final String STR_INCORRECT_ID_HASH;
    public static final String STR_INCORRECT_ID_SERVER;
    public static final String STR_INCORRECT_LICENSE_VERSION;
    public static final String STR_INCORRECT_PRODUCT_TYPE;
    public static final String STR_LICENSE_ERROR;
    public static final String STR_LICENSE_NOT_FOUND;
    public static final String STR_RUN_OUT_OF_TIME;
    private static final String b;
    private static final LicenseConfig c;
    JarFile a;

    static {
        ResourceBundle resourceBundle = AbstractLicense.licenseResource;
        STR_INCORRECT_FIRST_DATE = resourceBundle.getString("incorrect_first_date");
        STR_INCORRECT_CPU_AMOUNT = resourceBundle.getString("incorrect_cpu_amount");
        STR_INCORRECT_ID_HASH = resourceBundle.getString("incorrect_id_hash");
        STR_INCORRECT_PRODUCT_TYPE = resourceBundle.getString("incorrect_product_type");
        STR_INCORRECT_ID_FORM = resourceBundle.getString("incorrect_id_form");
        STR_RUN_OUT_OF_TIME = resourceBundle.getString("incorrect_run_out_of_time");
        STR_INCORRECT_ID_SERVER = resourceBundle.getString("incorrect_id_server");
        STR_INCORRECT_ID_CRYPTO = resourceBundle.getString("incorrect_id_crypto");
        STR_INCORRECT_LICENSE_VERSION = resourceBundle.getString("incorrect_license_version");
        STR_LICENSE_ERROR = resourceBundle.getString("license.error");
        STR_LICENSE_NOT_FOUND = resourceBundle.getString("license.not.found");
        b = resourceBundle.getString("unknown_cause");
        LicenseConfig licenseConfig = new LicenseConfig();
        licenseConfig.a = "CF";
        licenseConfig.b = BuildConfig.VERSION_CODE;
        licenseConfig.c = 8774;
        c = licenseConfig;
    }

    public License() throws IOException {
        this.a = null;
    }

    public static void checkExist() throws LicenseException {
        try {
            AccessController.doPrivileged(new ir61(1));
        } catch (Exception e) {
            JCPLogger.warning(e);
            LicenseException licenseException = new LicenseException(e.getMessage());
            licenseException.initCause(e);
            throw licenseException;
        }
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

    public static String getLicenseMessage(int i) {
        return i == -6 ? STR_INCORRECT_FIRST_DATE : i == -5 ? STR_INCORRECT_CPU_AMOUNT : i == -7 ? STR_INCORRECT_ID_SERVER : i == -8 ? STR_INCORRECT_ID_CRYPTO : i == -4 ? STR_INCORRECT_ID_HASH : i == -3 ? STR_INCORRECT_PRODUCT_TYPE : i == -2 ? STR_INCORRECT_ID_FORM : i == -1 ? STR_RUN_OUT_OF_TIME : i == -9 ? STR_INCORRECT_LICENSE_VERSION : i == -10 ? STR_LICENSE_ERROR : i == -11 ? STR_LICENSE_NOT_FOUND : b;
    }

    public static String getValue(String str, String[] strArr, String str2) {
        String str3;
        String str4 = null;
        int i = 0;
        while (i < strArr.length) {
            int i2 = i + 1;
            try {
                str3 = strArr[i2];
            } catch (ArrayIndexOutOfBoundsException unused) {
                str3 = null;
            }
            if (str3 != null && strArr[i].equalsIgnoreCase(str) && !"-".equals(str3.substring(0, 1))) {
                str4 = str3;
            }
            i = i2;
        }
        return str4 == null ? str2 : str4;
    }

    public static Properties m(Class cls, ResourceBundle resourceBundle) {
        Properties properties = new Properties();
        if (cls != null && cls.getSimpleName().equals("JCSPLicense")) {
            String string = resourceBundle.getString(Platform.isServerPlatform() ? "provider.java.csp.need_license" : "provider.java.csp.not_need_license");
            properties.setProperty(resourceBundle.getString("LicJCSP"), string);
            properties.setProperty(resourceBundle.getString("license.java.csp"), string);
        }
        return properties;
    }

    public static void main(String[] strArr) {
        printRequiredInfo(License.class, JCPInstaller.TEMP_PRODUCT_ID, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f1, code lost:
    
        if (r7 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f3, code lost:
    
        r0 = ru.CryptoPro.JCP.tools.AbstractLicense.getParameterTruncatedByLength(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f7, code lost:
    
        r14 = ru.CryptoPro.JCP.tools.LicenseUtility.constructLicenseObject(r16, null, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fb, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fd, code lost:
    
        if (r13 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ff, code lost:
    
        r0 = new ru.CryptoPro.JCP.tools.Decoder();
        r4 = java.nio.charset.StandardCharsets.UTF_8;
        r0 = ru.CryptoPro.JCP.tools.AbstractLicense.getParameterTruncatedByLength(new java.lang.String(r0.decodeBuffer(new java.io.ByteArrayInputStream(r13.getBytes(r4))), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x021d, code lost:
    
        r14 = ru.CryptoPro.JCP.tools.LicenseUtility.constructLicenseObject(r16, null, null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0231, code lost:
    
        if (r0.getCause() == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0233, code lost:
    
        r1 = java.lang.System.out;
        r0.getCause().toString();
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023f, code lost:
    
        java.lang.System.out.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bd, code lost:
    
        if (r0.getCause() == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void printRequiredInfo(Class cls, String str, String[] strArr) {
        License constructLicenseObject;
        PrintStream printStream;
        Platform.setEncoding();
        ResourceBundle resourceBundle = AbstractLicense.licenseResource;
        StringBuffer stringBuffer = new StringBuffer(resourceBundle.getString("license.help"));
        stringBuffer.append(resourceBundle.getString("license.help.verify.installed"));
        stringBuffer.append("\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append("\n");
        stringBuffer.append(resourceBundle.getString("license.help.requared"));
        stringBuffer.append("\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -required\n");
        stringBuffer.append(resourceBundle.getString("license.help.firstDate"));
        stringBuffer.append("\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -first\n");
        stringBuffer.append(resourceBundle.getString("license.help.verify.given"));
        stringBuffer.append("\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -serial \"serial_number\" -company \"company_name\" \n\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -serial \"serial_number\" -combase \"company_name_in_base64\" \n");
        stringBuffer.append(resourceBundle.getString("license.help.verify.given.store"));
        stringBuffer.append("\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -serial \"serial_number\" -company \"company_name\" -store\n\t");
        stringBuffer.append(cls.getName());
        stringBuffer.append(" -serial \"serial_number\" -combase \"company_name_in_base64\" -store");
        boolean equals = cls.getSimpleName().equals("JCSPLicense");
        int i = 0;
        if (getFunc("-required", strArr)) {
            PrintStream printStream2 = System.out;
            resourceBundle.getString("license.username");
            printStream2.getClass();
            PrintStream printStream3 = System.out;
            resourceBundle.getString("license.product.version");
            JCP.getJarVersion().getProductVersion();
            JCP.getJarVersion().getProductBuild();
            printStream3.getClass();
            Properties sysInfo = sysInfo(cls);
            String[] strArr2 = new String[2];
            String string = resourceBundle.getString("panel.licensePage.OS.type");
            if (equals) {
                strArr2[0] = string;
                strArr2[1] = resourceBundle.getString("license.java.csp");
            } else {
                strArr2[0] = string;
                strArr2[1] = resourceBundle.getString("panel.licensePage.lic.info");
            }
            while (i < strArr2.length) {
                PrintStream printStream4 = System.out;
                sysInfo.getProperty(strArr2[i]);
                printStream4.getClass();
                i++;
            }
            return;
        }
        License license = null;
        if (getFunc("-first", strArr)) {
            try {
                constructLicenseObject = LicenseUtility.constructLicenseObject(cls);
            } catch (Exception e) {
                System.out.getClass();
                if (e.getCause() != null) {
                    PrintStream printStream5 = System.out;
                    e.getCause().toString();
                    printStream5.getClass();
                }
                PrintStream printStream6 = System.out;
                AbstractLicense.licenseResource.getString("license.try.temp");
                printStream6.getClass();
                try {
                    constructLicenseObject = LicenseUtility.constructLicenseObject(cls, null, null, str);
                } catch (Exception unused) {
                    System.out.getClass();
                    if (e.getCause() != null) {
                        PrintStream printStream7 = System.out;
                        e.getCause().toString();
                        printStream7.getClass();
                    }
                    System.out.getClass();
                    return;
                }
            }
            Properties info = constructLicenseObject.info();
            printStream = System.out;
            ResourceBundle resourceBundle2 = AbstractLicense.licenseResource;
            resourceBundle2.getString("FirstInstLabel");
            info.getProperty(resourceBundle2.getString("FirstInstLabel"));
        } else if (strArr.length == 0) {
            try {
                license = LicenseUtility.constructLicenseObject(cls);
            } catch (Exception e2) {
                System.out.getClass();
                if (e2.getCause() != null) {
                    PrintStream printStream8 = System.out;
                    e2.getCause().toString();
                    printStream8.getClass();
                }
                PrintStream printStream9 = System.out;
                AbstractLicense.licenseResource.getString("license.try.temp");
                printStream9.getClass();
                try {
                    license = LicenseUtility.constructLicenseObject(cls, null, null, str);
                } catch (Exception e3) {
                    e = e3;
                    System.out.getClass();
                }
            }
            if (i == 0) {
                return;
            }
            int verifyLicense = license.verifyLicense("Crypto", true);
            PrintStream printStream10 = System.out;
            ResourceBundle resourceBundle3 = AbstractLicense.licenseResource;
            resourceBundle3.getString("license.username");
            printStream10.getClass();
            PrintStream printStream11 = System.out;
            resourceBundle3.getString("license.product.version");
            JCP.getJarVersion().getProductVersion();
            JCP.getJarVersion().getProductBuild();
            printStream11.getClass();
            PrintStream printStream12 = System.out;
            resourceBundle3.getString("license.verify");
            printStream12.getClass();
            PrintStream printStream13 = System.out;
            license.getDescriptionString();
            printStream13.getClass();
            Properties info2 = license.info();
            Vector vector = new Vector(4);
            vector.add(resourceBundle3.getString("TypeLabel"));
            vector.add(resourceBundle3.getString("ProcLabel"));
            vector.add(resourceBundle3.getString("SerialLabel"));
            vector.add(resourceBundle3.getString("PeriodLabel"));
            if (equals) {
                vector.add(resourceBundle3.getString("license.java.csp"));
            }
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                PrintStream printStream14 = System.out;
                info2.getProperty(str2);
                printStream14.getClass();
            }
            if (verifyLicense >= 0) {
                PrintStream printStream15 = System.out;
                ResourceBundle resourceBundle4 = AbstractLicense.licenseResource;
                resourceBundle4.getString("license.valid.true");
                printStream15.getClass();
                if (getFunc("-store", strArr)) {
                    try {
                        license.store();
                        PrintStream printStream16 = System.out;
                        resourceBundle4.getString("license.store.ok");
                        printStream16.getClass();
                        return;
                    } catch (ConfigurationException e4) {
                        MessageFormat messageFormat = new MessageFormat(AbstractLicense.licenseResource.getString("license.store.err"));
                        PrintStream printStream17 = System.out;
                        messageFormat.format(new String[]{e4.toString()});
                        printStream17.getClass();
                        return;
                    }
                }
                return;
            }
            PrintStream printStream18 = System.out;
            AbstractLicense.licenseResource.getString("license.check.failed");
            printStream18.getClass();
            printStream = System.out;
            getLicenseMessage(verifyLicense);
        } else {
            try {
                String value = getValue("-serial", strArr, null);
                String value2 = getValue("-company", strArr, null);
                String value3 = getValue("-combase", strArr, null);
                MessageFormat messageFormat2 = new MessageFormat(resourceBundle.getString("license.options.err"));
                if (value2 != null && value3 != null) {
                    throw new IllegalArgumentException(messageFormat2.format(new String[]{"-company", "-combase"}));
                }
                System.out.getClass();
            } catch (Exception e5) {
                e = e5;
                System.out.getClass();
            }
            i = -1;
            if (i == 0) {
            }
        }
        printStream.getClass();
    }

    public static Properties sysInfo(Class cls) {
        ResourceBundle resourceBundle;
        String str;
        String string;
        Properties properties = new Properties();
        if (Platform.isServerPlatform()) {
            resourceBundle = AbstractLicense.licenseResource;
            str = "panel.licensePage.Server";
        } else {
            resourceBundle = AbstractLicense.licenseResource;
            str = "panel.licensePage.Client";
        }
        String string2 = resourceBundle.getString(str);
        ResourceBundle resourceBundle2 = AbstractLicense.licenseResource;
        properties.setProperty(resourceBundle2.getString("panel.licensePage.OS.type"), string2);
        if (Platform.isServerPlatform()) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            if (Platform.is86Arch()) {
                int i = availableProcessors % 2;
                availableProcessors /= 2;
                if (i != 0) {
                    availableProcessors++;
                }
            }
            string = Platform.getProcAmountString(availableProcessors);
        } else {
            string = resourceBundle2.getString("panel.licensePage.ClientOS.lic");
        }
        properties.setProperty(resourceBundle2.getString("panel.licensePage.lic.info"), string);
        Properties m = m(cls, resourceBundle2);
        if (!m.isEmpty()) {
            properties.putAll(m);
        }
        return properties;
    }

    public boolean a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long allowedAmount = getAllowedAmount();
        long j = availableProcessors;
        return ((allowedAmount > 0L ? 1 : (allowedAmount == 0L ? 0 : -1)) == 0) || ((j > allowedAmount ? 1 : (j == allowedAmount ? 0 : -1)) <= 0) || (Platform.is86Arch() && (j > (allowedAmount << 1) ? 1 : (j == (allowedAmount << 1) ? 0 : -1)) <= 0) || (availableProcessors <= 4 && !Platform.isServerPlatform());
    }

    public String b() {
        return "JCP";
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public void check(Object obj) throws LicenseException {
        try {
            int verifyLicense = LicenseUtility.constructLicenseObject(getClass()).verifyLicense(obj);
            if (verifyLicense < 0) {
                throw new LicenseException(verifyLicense, a(verifyLicense));
            }
            if (verifyLicense == 2) {
                kds0 kds0Var = new kds0(3, this, false);
                kds0Var.setPriority(1);
                kds0Var.start();
            }
        } catch (IOException e) {
            JCPLogger.warning(e);
            throw new LicenseException(e.getMessage(), e);
        } catch (Exception e2) {
            JCPLogger.warning(e2);
            throw new LicenseException(e2.getMessage(), e2);
        }
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public List getAcceptedLicenseTypes() {
        return Collections.singletonList(2);
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public LicenseConfig getConfig() {
        return c;
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public String getDefaultLoaderName() {
        return JCPLicenseLoader.class.getName();
    }

    public String getDescriptionString() {
        StringBuilder t;
        String string;
        StringBuilder t2;
        String str;
        char[] cArr = this.id;
        if (cArr == null || !checkProductType(cArr) || !checkSerialHash(this.id, getCompanyName().toCharArray())) {
            return AbstractLicense.licenseResource.getString("license.valid.false");
        }
        String timeDescription = AbstractLicense.getTimeDescription(verifyDate());
        if (isServer()) {
            t = qv10.t(timeDescription);
            ResourceBundle resourceBundle = AbstractLicense.licenseResource;
            t.append(resourceBundle.getString("license.type.server"));
            if (getAllowedAmount() == 0) {
                string = " " + resourceBundle.getString("license.type.unlimited");
            } else {
                string = "";
            }
        } else {
            t = qv10.t(timeDescription);
            string = AbstractLicense.licenseResource.getString("license.type.client");
        }
        t.append(string);
        StringBuilder v = oyr.v(t.toString(), " ");
        ResourceBundle resourceBundle2 = AbstractLicense.licenseResource;
        v.append(resourceBundle2.getString("license.name"));
        v.append(" ");
        String sb = v.toString();
        if (isServer()) {
            StringBuilder t3 = qv10.t(sb);
            t3.append(resourceBundle2.getString("license.for"));
            t3.append(" ");
            t3.append(Platform.getProcAmountString((int) getAllowedAmount()));
            t3.append(" ");
            sb = t3.toString();
        }
        if (hasCrypt()) {
            t2 = qv10.t(sb);
            str = "license.type.encryption";
        } else {
            t2 = qv10.t(sb);
            str = "license.type.no_encryption";
        }
        t2.append(resourceBundle2.getString(str));
        String sb2 = t2.toString();
        if ((this.type & 1) == 0) {
            StringBuilder v2 = oyr.v(sb2, " ");
            v2.append(resourceBundle2.getString("license.type.common"));
            return v2.toString();
        }
        StringBuilder v3 = oyr.v(sb2, " ");
        v3.append(resourceBundle2.getString("license.type.personal"));
        return v3.toString();
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public JCPPref getSpecialNode() {
        return this.node.parent().parent();
    }

    public boolean hasCrypt() {
        return (this.type & 16) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Properties info() {
        String str;
        String string;
        Properties properties = new Properties();
        String str2 = "" + getVersion();
        if (str2.length() <= 0) {
            str2 = AbstractLicense.licenseResource.getString("panel.licensePage.VersionUndef");
        }
        ResourceBundle resourceBundle = AbstractLicense.licenseResource;
        properties.setProperty(resourceBundle.getString("VersionLabel"), str2);
        String productID = getProductID();
        properties.setProperty(resourceBundle.getString("SerialLabel"), productID.length() > 0 ? productID.substring(0, 20) : resourceBundle.getString("panel.licensePage.SerialUndef"));
        String userName = getUserName();
        if (userName.length() <= 0) {
            userName = resourceBundle.getString("panel.licensePage.UserUndefined");
        }
        properties.setProperty(resourceBundle.getString("OwnerLabel"), userName);
        String companyName = getCompanyName();
        if (companyName.length() <= 0) {
            companyName = resourceBundle.getString("panel.licensePage.OrganizationUndef");
        }
        properties.setProperty(resourceBundle.getString("OrganLabel"), companyName);
        properties.setProperty(resourceBundle.getString("TypeLabel"), new MessageFormat("{0}, {1}").format(new String[]{resourceBundle.getString(isServer() ? "panel.licensePage.ServerLic" : "panel.licensePage.ClientLic"), resourceBundle.getString(hasCrypt() ? "panel.licensePage.SignAndEnc" : "panel.licensePage.SignOnly")}));
        Properties m = m(getClass(), resourceBundle);
        if (!m.isEmpty()) {
            properties.putAll(m);
        }
        if (checkLicenseVersion()) {
            long endDate = getEndDate();
            if (endDate == -2) {
                string = resourceBundle.getString("LicenseUndef");
            } else if (endDate == 0) {
                str = "LicensePerm";
            } else {
                string = new MessageFormat(resourceBundle.getString("LicenseTillN")).format(new Object[]{new Date(endDate)});
            }
            properties.setProperty(resourceBundle.getString("PeriodLabel"), string);
            long allowedAmount = getAllowedAmount();
            properties.setProperty(resourceBundle.getString("ProcLabel"), allowedAmount != -1 ? resourceBundle.getString("LicenseUndef") : allowedAmount == 0 ? resourceBundle.getString("NoBoundedCPU") : String.valueOf(allowedAmount));
            properties.setProperty(resourceBundle.getString("FirstInstLabel"), String.valueOf(DateFormat.getDateInstance().format(new Date(getFirstInstDat()))));
            return properties;
        }
        str = "LicenseVersionIncorrect";
        string = resourceBundle.getString(str);
        properties.setProperty(resourceBundle.getString("PeriodLabel"), string);
        long allowedAmount2 = getAllowedAmount();
        properties.setProperty(resourceBundle.getString("ProcLabel"), allowedAmount2 != -1 ? resourceBundle.getString("LicenseUndef") : allowedAmount2 == 0 ? resourceBundle.getString("NoBoundedCPU") : String.valueOf(allowedAmount2));
        properties.setProperty(resourceBundle.getString("FirstInstLabel"), String.valueOf(DateFormat.getDateInstance().format(new Date(getFirstInstDat()))));
        return properties;
    }

    public boolean isServer() {
        return (this.type & 8) == 0;
    }

    @Override // ru.CryptoPro.JCP.tools.AbstractLicense
    public int verifyAmount(Object obj) {
        if (obj != null) {
            if (!(obj instanceof String)) {
                w511.q();
                return 0;
            }
            if (((String) obj).equals("Crypto")) {
                if (this.a == null) {
                    synchronized (this) {
                        try {
                            if (this.a == null) {
                                try {
                                    JCPLogger.fine("Trying find CryptoProvider");
                                    String str = CryptoProvider.PROVIDER_NAME;
                                    this.a = JarTools.getJAR(CryptoProvider.class);
                                    JCPLogger.fine("CryptoProvider found");
                                } catch (ClassNotFoundException unused) {
                                    this.a = JarTools.getJAR(Class.forName(DefaultProviders.CLASS_PROVIDER_CRYPTO_PROVIDER, false, Thread.currentThread().getContextClassLoader()));
                                }
                            }
                        } catch (Exception e) {
                            JCPLogger.thrown(e);
                        }
                    }
                }
                if (this.a != null && !hasCrypt()) {
                    return -8;
                }
            }
        }
        if (!Platform.isServerPlatform() || isServer()) {
            return !a() ? -5 : 0;
        }
        return -7;
    }

    public License(String str, String str2, String str3) {
        super(str, str2, str3);
        this.a = null;
    }

    public String a(int i) {
        return i == -1 ? MessageFormat.format(AbstractLicense.licenseResource.getString("license.run.out.of.time.additional.info"), System.getProperty("user.name"), b()) : "";
    }

    public static Properties sysInfo() {
        return sysInfo(null);
    }
}
