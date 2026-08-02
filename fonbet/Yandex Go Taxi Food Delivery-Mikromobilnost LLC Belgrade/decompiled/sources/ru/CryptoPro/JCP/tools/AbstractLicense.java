package ru.CryptoPro.JCP.tools;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import defpackage.w511;
import defpackage.yq61;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.pref.ConfigurationException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public abstract class AbstractLicense extends LicenseUtility {
    public static final int CORRECT_TEMP_LICENSE = 1;
    public static final int INCORRECT_CPU_AMOUNT = -5;
    public static final int INCORRECT_FIRST_DATE = -6;
    public static final int INCORRECT_ID_CRYPTO = -8;
    public static final int INCORRECT_ID_FORM = -2;
    public static final int INCORRECT_ID_HASH = -4;
    public static final int INCORRECT_ID_SERVER = -7;
    public static final int INCORRECT_LICENSE_VERSION = -9;
    public static final int INCORRECT_PRODUCT_TYPE = -3;
    public static final int LICENSE_ERROR = -10;
    public static int LICENSE_FIELD_LENGTH = 40;
    public static final int LICENSE_NOT_FOUND = -11;
    public static final int NEED_NOTIFY = 2;
    public static final int PERMANENT_LICENSE = 0;
    public static final int PERSONAL_MASK = 1;
    public static final int RUN_OUT_OF_TIME = -1;
    public static final String STR_INVALID_LICENSE = "Invalid license.";
    public static final String STR_PREFERENCE_LICENSE_KEY = "License_class_license_2_0";
    public static final String STR_PREFERENCE_LICENSE_NODE = "/ru/CryptoPro/JCP/tools";
    public static final String STR_VALID_LICENSE = "Valid license.";
    private static final int e = 13;
    private static final int f = 52;
    protected static final ResourceBundle licenseResource = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    private final String a;
    private final String b;
    private final String c;
    protected char[] id;
    protected int type;
    protected final JCPPref node = new JCPPref(getClass());
    private final String d = k();

    public AbstractLicense() throws IOException {
        this.type = 0;
        DataInputStream dataInputStream = null;
        this.id = null;
        String[] strArr = {"", "", ""};
        byte[] bArr = (byte[]) AccessController.doPrivileged(new a(this));
        if (bArr != null) {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr));
                try {
                    strArr = new String[]{dataInputStream2.readUTF(), dataInputStream2.readUTF(), dataInputStream2.readUTF()};
                    dataInputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.a = strArr[0];
        this.b = strArr[1];
        try {
            String str = strArr[2];
            if (str != null) {
                char[] delSeparators = delSeparators(str);
                this.id = delSeparators;
                this.type = getType(delSeparators);
            }
            this.c = str;
        } catch (Exception e2) {
            IOException iOException = new IOException(e2.toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public static long a(char[] cArr) {
        long j = LicenseUtility.decode5Bit(cArr, 7)[0];
        return (((j & 255) >>> 5) | ((r8[1] & 3) << 3) | ((31 & j) << 5)) * 2592000000L;
    }

    public static char[] addSeparators(char[] cArr) {
        if (cArr.length != 25) {
            ny61.g(licenseResource.getString("license.invalid.length"));
            return null;
        }
        char[] cArr2 = new char[29];
        int i = 0;
        int i2 = 0;
        while (i < 29) {
            System.arraycopy(cArr, i2, cArr2, i, 5);
            i2 += 5;
            int i3 = i + 5;
            if (i3 < 29) {
                i += 6;
                cArr2[i3] = LicenseUtility.SEPARATOR;
            } else {
                i = i3;
            }
        }
        return cArr2;
    }

    public static byte[] d(String str, String str2, String str3) {
        DataOutputStream dataOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream2.writeUTF(str);
                dataOutputStream2.writeUTF(str2);
                dataOutputStream2.writeUTF(str3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream2.close();
                return byteArray;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static char[] delSeparators(String str) {
        char[] charArray = str.toUpperCase().trim().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (c != ' ' && c != '-') {
                sb.append(c);
            }
        }
        char[] charArray2 = sb.toString().toCharArray();
        if (charArray2.length == 25) {
            return charArray2;
        }
        ny61.g(licenseResource.getString("license.invalid.length"));
        return null;
    }

    public static byte[] f(char[] cArr) {
        byte[] bArr = new byte[cArr.length << 1];
        for (int i = 0; i < cArr.length; i++) {
            int i2 = i * 2;
            char c = cArr[i];
            bArr[i2] = (byte) c;
            bArr[i2 + 1] = (byte) (((short) c) >>> 8);
        }
        return bArr;
    }

    public static char[] g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length % 5 == 0 ? (length << 3) / 5 : ((length << 3) / 5) + 1];
        int i = 0;
        int i2 = 0;
        byte b = 0;
        int i3 = 0;
        while (length != 0) {
            for (byte b2 = 0; b2 < 8; b2 = (byte) (b2 + 1)) {
                b = (byte) (b | (((bArr[i3] >> b2) & 1) << i));
                i++;
                if (i == 5) {
                    if (b >= 0) {
                        char[] cArr2 = LicenseUtility.ALPHABET;
                        if (b < cArr2.length) {
                            cArr[i2] = cArr2[b];
                            i2++;
                            i = 0;
                            b = 0;
                        }
                    }
                    w511.q();
                    return null;
                }
            }
            length--;
            i3++;
        }
        if (i == 0) {
            return cArr;
        }
        if (b >= 0) {
            char[] cArr3 = LicenseUtility.ALPHABET;
            if (b < cArr3.length) {
                cArr[i2] = cArr3[b];
                return cArr;
            }
        }
        w511.q();
        return null;
    }

    public static String getDefaultUserName() {
        return System.getProperty("user.name");
    }

    public static String getParameterTruncatedByLength(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = LICENSE_FIELD_LENGTH;
        return length > i ? str.substring(0, i) : str;
    }

    public static String getTimeDescription(int i) {
        if (i == -6) {
            return licenseResource.getString("license.status.incorrect") + " ";
        }
        if (i == -1) {
            return licenseResource.getString("license.status.expired") + " ";
        }
        if (i == 0) {
            return licenseResource.getString("license.status.permanent") + " ";
        }
        if (i != 1 && i != 2) {
            return licenseResource.getString("license.valid.false");
        }
        return licenseResource.getString("license.status.temporary") + " ";
    }

    public static int getType(char[] cArr) {
        return LicenseUtility.DECODED_ALPHABET[cArr[6] - '0'];
    }

    public static long j(char[] cArr) {
        byte[] decode5Bit = LicenseUtility.decode5Bit(cArr, 0);
        if ((decode5Bit[0] & DerValue.TAG_CONTEXT) != 0) {
            w511.q();
            return 0L;
        }
        long j = 0;
        for (int i = 0; i < 8; i++) {
            byte b = decode5Bit[i];
            long j2 = (b & 255) << ((7 - i) << 3);
            if (b != 0 && j2 == 0) {
                w511.q();
                return 0L;
            }
            j |= j2;
        }
        return j * 1000;
    }

    public static boolean needCompany(int i) {
        return (i & 7) % 3 == 1;
    }

    private void setFirstInstDate(long j) {
        AccessController.doPrivileged(new yq61(2, this, b(j)));
    }

    public final String b(long j) {
        byte[] bArr = new byte[8];
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        long j2 = j / 1000;
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j2 >> ((7 - i) << 3)) & 255);
        }
        char[] g = g(bArr);
        return new String(Array.merge(g, e(g)));
    }

    public final boolean c(char[] cArr, char[] cArr2, boolean z) {
        char[] cArr3 = new char[cArr.length - 8];
        char[] cArr4 = new char[8];
        Array.separate(cArr, cArr3, cArr4, cArr.length - 8);
        char[] h = z ? h(cArr3, cArr2) : h(cArr3, new char[0]);
        char[] cArr5 = new char[8];
        Array.separate(h, cArr5, new char[h.length - 8], 8);
        return Array.compare(cArr5, cArr4, 8);
    }

    public void check() throws LicenseException {
        check(null);
    }

    public abstract void check(Object obj) throws LicenseException;

    public void checkHashOnly() throws LicenseException {
        char[] cArr = this.id;
        if (cArr == null) {
            throw new LicenseException("Error code:-2");
        }
        if (!checkProductType(cArr)) {
            throw new LicenseException("Error code:-3");
        }
        if (!checkSerialHash(this.id, getCompanyName().toCharArray())) {
            throw new LicenseException("Error code:-4");
        }
    }

    public boolean checkLicenseVersion() {
        int i;
        String version = getVersion();
        List acceptedLicenseTypes = getAcceptedLicenseTypes();
        if (version == null || acceptedLicenseTypes.isEmpty()) {
            JCPLogger.warning("Invalid expected license version or read from manifest.");
            return false;
        }
        int indexOf = version.indexOf(46);
        if (indexOf > 0) {
            try {
                version = version.substring(0, indexOf);
            } catch (Exception unused) {
                i = 0;
            }
        }
        i = Integer.valueOf(version).intValue();
        if (i != 0) {
            return acceptedLicenseTypes.contains(Integer.valueOf(i));
        }
        JCPLogger.warning("Invalid license version: ", Integer.valueOf(i));
        return false;
    }

    public boolean checkProductType(char[] cArr) {
        if (cArr.length >= 2) {
            return getConfig().getAbbr().equals(new String(new char[]{cArr[0], cArr[1]}));
        }
        return false;
    }

    public boolean checkSerialHash(char[] cArr, char[] cArr2) {
        boolean needCompany = needCompany(this.type);
        boolean c = c(cArr, cArr2, false);
        if (c || !needCompany) {
            return c;
        }
        if (cArr2.length == 0) {
            return false;
        }
        return c(cArr, cArr2, needCompany);
    }

    public final char[] e(char[] cArr) {
        byte[] byteArray = Array.toByteArray(getConfig().getC1());
        byte[] merge = Array.merge(Array.merge(byteArray, f(cArr)), Array.toByteArray(getConfig().getC2()));
        GostDigest gostDigest = new GostDigest();
        gostDigest.reset(DigestParamsSpec.OID_HashTest);
        gostDigest.engineUpdate(merge, 0, merge.length);
        return g(gostDigest.digestValue());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractLicense) {
            AbstractLicense abstractLicense = (AbstractLicense) obj;
            if (this.c.equals(abstractLicense.c) && this.b.equals(abstractLicense.b) && this.a.equals(abstractLicense.a)) {
                return true;
            }
        }
        return false;
    }

    public abstract List getAcceptedLicenseTypes();

    public long getAllowedAmount() {
        char[] cArr = this.id;
        if (cArr == null) {
            return -1L;
        }
        byte[] decode5Bit = LicenseUtility.decode5Bit(cArr, 9);
        long j = decode5Bit[0];
        long j2 = (j & 31) << 10;
        long j3 = decode5Bit[1];
        return ((((j & 255) >>> 5) | ((3 & j3) << 3)) << 5) | j2 | (31 & ((j3 & 255) >>> 2));
    }

    public String getCompanyName() {
        return this.b;
    }

    public abstract LicenseConfig getConfig();

    public String getDefaultLoaderName() {
        return getClass().getName().concat("Loader");
    }

    public long getEndDate() {
        char[] cArr = this.id;
        if (cArr == null) {
            return -2L;
        }
        char c = cArr[7];
        char c2 = cArr[8];
        if (c == c2 && c2 == '0') {
            return 0L;
        }
        if ((7 & this.type) < 3) {
            return j(Array.leftPart(this.d.toCharArray(), 13)) + a(cArr);
        }
        int[] iArr = LicenseUtility.DECODED_ALPHABET;
        int i = iArr[cArr[12] - MoneyInputEditView.DEFAULT_VALUE];
        int i2 = iArr[cArr[13] - MoneyInputEditView.DEFAULT_VALUE];
        int i3 = iArr[cArr[14] - MoneyInputEditView.DEFAULT_VALUE];
        Calendar calendar = Calendar.getInstance();
        calendar.set(i + 2006, i2 - 1, i3);
        return calendar.getTimeInMillis();
    }

    public long getFirstInstDat() {
        return j(this.d.toCharArray());
    }

    public String getInstDatePrefName() {
        return "JCPCheckSum_2_0";
    }

    public String getLoaderPrefName() {
        return "License_class_def_class_name";
    }

    public long getNotifyTime() {
        return 86400000L;
    }

    public String getPrefName() {
        return STR_PREFERENCE_LICENSE_KEY;
    }

    public String getProductID() {
        return this.c;
    }

    public JCPPref getSpecialNode() {
        return this.node.parent();
    }

    public String getUserName() {
        return this.a;
    }

    public String getVersion() {
        if (this.id == null) {
            return "";
        }
        return Character.toString(this.id[2]) + '.' + this.id[3];
    }

    public final char[] h(char[] cArr, char[] cArr2) {
        byte[] byteArray = Array.toByteArray(getConfig().getC1());
        byte[] byteArray2 = Array.toByteArray(getConfig().getC2());
        byte[] merge = Array.merge(byteArray, f(cArr));
        if (cArr2.length != 0) {
            merge = Array.merge(merge, f(cArr2));
        }
        byte[] merge2 = Array.merge(merge, byteArray2);
        GostDigest gostDigest = new GostDigest(DigestParamsSpec.OID_HashVerbaO);
        gostDigest.engineUpdate(merge2, 0, merge2.length);
        return g(gostDigest.digestValue());
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode() + this.c.hashCode();
    }

    public final String i() {
        String str = this.node.get(getLoaderPrefName(), null);
        return str == null ? getDefaultLoaderName() : str;
    }

    public boolean isHashCorrect() {
        char[] cArr = this.id;
        return cArr != null && checkProductType(cArr) && checkSerialHash(this.id, getCompanyName().toCharArray());
    }

    public boolean isValidVersion() {
        return checkLicenseVersion();
    }

    public boolean isWriteAvailable() {
        return this.node.isWriteAvailable();
    }

    public final String k() {
        JCPPref specialNode = getSpecialNode();
        String withoutLogger = specialNode.getWithoutLogger(getInstDatePrefName(), null);
        if (withoutLogger != null) {
            return !l(withoutLogger) ? "" : withoutLogger;
        }
        String b = b(System.currentTimeMillis());
        specialNode.put(getInstDatePrefName(), b);
        return b;
    }

    public final boolean l(String str) {
        if (str.length() != 65) {
            return false;
        }
        char[] cArr = new char[13];
        char[] cArr2 = new char[52];
        Array.separate(str.toCharArray(), cArr, cArr2, 13);
        return Array.compare(e(cArr), cArr2, 52);
    }

    public void setLoaderName(String str) {
        this.node.put(getLoaderPrefName(), str);
    }

    public void setNewLicense() throws Exception {
        try {
            Object newInstance = Class.forName(i()).newInstance();
            if (!(newInstance instanceof LicenseLoader)) {
                throw new ClassCastException("Illegal class for loading new license");
            }
            AbstractLicense newLicense = ((LicenseLoader) newInstance).getNewLicense();
            int verifyLicense = newLicense.verifyLicense(null, true);
            if (verifyLicense != 0 && verifyLicense != 1) {
                if (verifyLicense != 2) {
                    throw new LicenseException(verifyLicense);
                }
                throw new LicenseException("License already needs to be reinstalled: cannot install");
            }
            newLicense.store();
        } catch (IOException e2) {
            throw new Exception("New license cannot be installed: Cannot read current license", e2);
        } catch (ClassNotFoundException e3) {
            throw new Exception("New license cannot be installed: Class name is incorrect", e3);
        } catch (IllegalAccessException e4) {
            throw new Exception("New license cannot be installed: Access denied", e4);
        } catch (InstantiationException e5) {
            throw new Exception("New license cannot be installed: Class type is incorrect", e5);
        } catch (ConfigurationException e6) {
            throw new Exception("New license cannot be installed: User aborted process", e6);
        }
    }

    public void setType(int i) {
        this.type = i;
    }

    public void store() throws ConfigurationException {
        try {
            this.node.putByteArray(getPrefName(), d(this.a, this.b, this.c));
            this.node.flush();
        } catch (IOException e2) {
            throw new ConfigurationException(e2);
        } catch (BackingStoreException e3) {
            throw new ConfigurationException(e3);
        }
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        if (str2 != null && str2.length() != 0) {
            str = str + LicenseUtility.SEPARATOR + this.b;
        }
        String str3 = this.a;
        if (str3 == null || str3.length() == 0) {
            return str;
        }
        return str + LicenseUtility.SEPARATOR + this.a;
    }

    public abstract int verifyAmount(Object obj);

    public int verifyDate() {
        long currentTimeMillis = System.currentTimeMillis();
        if (a(this.id) == 0) {
            return 0;
        }
        if (!l(this.d)) {
            return -6;
        }
        long j = j(this.d.toCharArray());
        if (j <= 0 || currentTimeMillis - j < 0) {
            return -6;
        }
        long endDate = getEndDate();
        if (endDate > currentTimeMillis) {
            return endDate - currentTimeMillis < getNotifyTime() ? 2 : 1;
        }
        return -1;
    }

    public int verifyLicense(Object obj, boolean z) {
        char[] cArr = this.id;
        if (cArr == null) {
            return -2;
        }
        if (!checkProductType(cArr)) {
            return -3;
        }
        if (!checkLicenseVersion()) {
            return -9;
        }
        if (!checkSerialHash(this.id, this.b.toCharArray())) {
            return -4;
        }
        int verifyAmount = verifyAmount(obj);
        return (verifyAmount == -5 || verifyAmount == -7 || verifyAmount == -8) ? verifyAmount : verifyDate();
    }

    private void setFirstInstDate() {
        setFirstInstDate(System.currentTimeMillis());
    }

    public int verifyLicense(Object obj) {
        return verifyLicense(obj, false);
    }

    public int verifyLicense() {
        return verifyLicense(null);
    }

    public AbstractLicense(String str, String str2, String str3) {
        this.type = 0;
        this.id = null;
        if (str == null) {
            this.a = "";
        } else {
            this.a = str;
        }
        if (str2 == null) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if (str3 == null) {
            this.c = "";
            return;
        }
        String upperCase = str3.toUpperCase();
        if (upperCase != null) {
            char[] delSeparators = delSeparators(upperCase);
            this.id = delSeparators;
            this.type = getType(delSeparators);
        }
        this.c = upperCase;
    }
}
