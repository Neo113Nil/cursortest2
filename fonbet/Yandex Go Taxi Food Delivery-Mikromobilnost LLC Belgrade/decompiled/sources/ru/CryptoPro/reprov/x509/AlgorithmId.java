package ru.CryptoPro.reprov.x509;

import defpackage.g8e;
import defpackage.lt61;
import defpackage.ny61;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;

/* loaded from: classes4.dex */
public class AlgorithmId implements Serializable, lt61 {
    private static final int[] DH_PKIX_data;
    public static final ObjectIdentifier DH_PKIX_oid;
    private static final int[] DH_data;
    public static final ObjectIdentifier DH_oid;
    private static final int[] DSA_OIW_data;
    public static final ObjectIdentifier DSA_OIW_oid;
    private static final int[] DSA_PKIX_data;
    public static final ObjectIdentifier DSA_oid;
    public static final ObjectIdentifier EC_oid;
    public static final ObjectIdentifier MD2_oid;
    public static final ObjectIdentifier MD5_oid;
    private static final int[] RSAEncryption_data;
    public static final ObjectIdentifier RSAEncryption_oid;
    private static final int[] RSA_data;
    public static final ObjectIdentifier RSA_oid;
    public static final ObjectIdentifier SHA256_oid;
    public static final ObjectIdentifier SHA384_oid;
    public static final ObjectIdentifier SHA512_oid;
    public static final ObjectIdentifier SHA_oid;
    private static final int[] dsaWithSHA1_PKIX_data;
    private static boolean initOidTable = false;
    private static final int[] md2WithRSAEncryption_data;
    public static final ObjectIdentifier md2WithRSAEncryption_oid;
    private static final int[] md5WithRSAEncryption_data;
    public static final ObjectIdentifier md5WithRSAEncryption_oid;
    private static final Map nameTable;
    private static Map oidTable = null;
    public static final ObjectIdentifier pbeWithMD5AndDES_oid;
    public static final ObjectIdentifier pbeWithMD5AndRC2_oid;
    public static final ObjectIdentifier pbeWithSHA1AndDES_oid;
    public static ObjectIdentifier pbeWithSHA1AndDESede_oid = null;
    public static ObjectIdentifier pbeWithSHA1AndRC2_40_oid = null;
    public static final ObjectIdentifier pbeWithSHA1AndRC2_oid;
    private static final long serialVersionUID = 7205873507486557157L;
    private static final int[] sha1WithDSA_OIW_data;
    public static final ObjectIdentifier sha1WithDSA_OIW_oid;
    public static final ObjectIdentifier sha1WithDSA_oid;
    public static final ObjectIdentifier sha1WithECDSA_oid;
    private static final int[] sha1WithRSAEncryption_OIW_data;
    public static final ObjectIdentifier sha1WithRSAEncryption_OIW_oid;
    private static final int[] sha1WithRSAEncryption_data;
    public static final ObjectIdentifier sha1WithRSAEncryption_oid;
    public static final ObjectIdentifier sha224WithECDSA_oid;
    public static final ObjectIdentifier sha256WithECDSA_oid;
    private static final int[] sha256WithRSAEncryption_data;
    public static final ObjectIdentifier sha256WithRSAEncryption_oid;
    public static final ObjectIdentifier sha384WithECDSA_oid;
    private static final int[] sha384WithRSAEncryption_data;
    public static final ObjectIdentifier sha384WithRSAEncryption_oid;
    public static final ObjectIdentifier sha512WithECDSA_oid;
    private static final int[] sha512WithRSAEncryption_data;
    public static final ObjectIdentifier sha512WithRSAEncryption_oid;
    private static final int[] shaWithDSA_OIW_data;
    public static final ObjectIdentifier shaWithDSA_OIW_oid;
    public static final ObjectIdentifier specifiedWithECDSA_oid;
    private AlgorithmParameters algParams;
    private ObjectIdentifier algid;
    private boolean constructedFromDer = true;
    protected DerValue params;

    static {
        ObjectIdentifier newInternal = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 2, 2});
        MD2_oid = newInternal;
        ObjectIdentifier newInternal2 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 2, 5});
        MD5_oid = newInternal2;
        ObjectIdentifier newInternal3 = ObjectIdentifier.newInternal(new int[]{1, 3, 14, 3, 2, 26});
        SHA_oid = newInternal3;
        ObjectIdentifier newInternal4 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 1});
        SHA256_oid = newInternal4;
        ObjectIdentifier newInternal5 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 2});
        SHA384_oid = newInternal5;
        ObjectIdentifier newInternal6 = ObjectIdentifier.newInternal(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 3});
        SHA512_oid = newInternal6;
        int[] iArr = {1, 2, 840, 113549, 1, 3, 1};
        DH_data = iArr;
        int[] iArr2 = {1, 2, 840, 10046, 2, 1};
        DH_PKIX_data = iArr2;
        int[] iArr3 = {1, 3, 14, 3, 2, 12};
        DSA_OIW_data = iArr3;
        int[] iArr4 = {1, 2, 840, 10040, 4, 1};
        DSA_PKIX_data = iArr4;
        int[] iArr5 = {1, 2, 5, 8, 1, 1};
        RSA_data = iArr5;
        int[] iArr6 = {1, 2, 840, 113549, 1, 1, 1};
        RSAEncryption_data = iArr6;
        ObjectIdentifier oid = oid(new int[]{1, 2, 840, 10045, 2, 1});
        EC_oid = oid;
        int[] iArr7 = {1, 2, 840, 113549, 1, 1, 2};
        md2WithRSAEncryption_data = iArr7;
        int[] iArr8 = {1, 2, 840, 113549, 1, 1, 4};
        md5WithRSAEncryption_data = iArr8;
        int[] iArr9 = {1, 2, 840, 113549, 1, 1, 5};
        sha1WithRSAEncryption_data = iArr9;
        int[] iArr10 = {1, 3, 14, 3, 2, 29};
        sha1WithRSAEncryption_OIW_data = iArr10;
        int[] iArr11 = {1, 2, 840, 113549, 1, 1, 11};
        sha256WithRSAEncryption_data = iArr11;
        int[] iArr12 = {1, 2, 840, 113549, 1, 1, 12};
        sha384WithRSAEncryption_data = iArr12;
        int[] iArr13 = {1, 2, 840, 113549, 1, 1, 13};
        sha512WithRSAEncryption_data = iArr13;
        int[] iArr14 = {1, 3, 14, 3, 2, 13};
        shaWithDSA_OIW_data = iArr14;
        int[] iArr15 = {1, 3, 14, 3, 2, 27};
        sha1WithDSA_OIW_data = iArr15;
        int[] iArr16 = {1, 2, 840, 10040, 4, 3};
        dsaWithSHA1_PKIX_data = iArr16;
        ObjectIdentifier oid2 = oid(new int[]{1, 2, 840, 10045, 4, 1});
        sha1WithECDSA_oid = oid2;
        ObjectIdentifier oid3 = oid(new int[]{1, 2, 840, 10045, 4, 3, 1});
        sha224WithECDSA_oid = oid3;
        ObjectIdentifier oid4 = oid(new int[]{1, 2, 840, 10045, 4, 3, 2});
        sha256WithECDSA_oid = oid4;
        ObjectIdentifier oid5 = oid(new int[]{1, 2, 840, 10045, 4, 3, 3});
        sha384WithECDSA_oid = oid5;
        ObjectIdentifier oid6 = oid(new int[]{1, 2, 840, 10045, 4, 3, 4});
        sha512WithECDSA_oid = oid6;
        specifiedWithECDSA_oid = oid(new int[]{1, 2, 840, 10045, 4, 3});
        ObjectIdentifier newInternal7 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 3});
        pbeWithMD5AndDES_oid = newInternal7;
        ObjectIdentifier newInternal8 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 6});
        pbeWithMD5AndRC2_oid = newInternal8;
        ObjectIdentifier newInternal9 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 10});
        pbeWithSHA1AndDES_oid = newInternal9;
        ObjectIdentifier newInternal10 = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 5, 11});
        pbeWithSHA1AndRC2_oid = newInternal10;
        pbeWithSHA1AndDESede_oid = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 12, 1, 3});
        pbeWithSHA1AndRC2_40_oid = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 12, 1, 6});
        ObjectIdentifier newInternal11 = ObjectIdentifier.newInternal(iArr);
        DH_oid = newInternal11;
        ObjectIdentifier newInternal12 = ObjectIdentifier.newInternal(iArr2);
        DH_PKIX_oid = newInternal12;
        ObjectIdentifier newInternal13 = ObjectIdentifier.newInternal(iArr3);
        DSA_OIW_oid = newInternal13;
        ObjectIdentifier newInternal14 = ObjectIdentifier.newInternal(iArr4);
        DSA_oid = newInternal14;
        ObjectIdentifier newInternal15 = ObjectIdentifier.newInternal(iArr5);
        RSA_oid = newInternal15;
        ObjectIdentifier newInternal16 = ObjectIdentifier.newInternal(iArr6);
        RSAEncryption_oid = newInternal16;
        ObjectIdentifier newInternal17 = ObjectIdentifier.newInternal(iArr7);
        md2WithRSAEncryption_oid = newInternal17;
        ObjectIdentifier newInternal18 = ObjectIdentifier.newInternal(iArr8);
        md5WithRSAEncryption_oid = newInternal18;
        ObjectIdentifier newInternal19 = ObjectIdentifier.newInternal(iArr9);
        sha1WithRSAEncryption_oid = newInternal19;
        ObjectIdentifier newInternal20 = ObjectIdentifier.newInternal(iArr10);
        sha1WithRSAEncryption_OIW_oid = newInternal20;
        ObjectIdentifier newInternal21 = ObjectIdentifier.newInternal(iArr11);
        sha256WithRSAEncryption_oid = newInternal21;
        ObjectIdentifier newInternal22 = ObjectIdentifier.newInternal(iArr12);
        sha384WithRSAEncryption_oid = newInternal22;
        ObjectIdentifier newInternal23 = ObjectIdentifier.newInternal(iArr13);
        sha512WithRSAEncryption_oid = newInternal23;
        ObjectIdentifier newInternal24 = ObjectIdentifier.newInternal(iArr14);
        shaWithDSA_OIW_oid = newInternal24;
        ObjectIdentifier newInternal25 = ObjectIdentifier.newInternal(iArr15);
        sha1WithDSA_OIW_oid = newInternal25;
        ObjectIdentifier newInternal26 = ObjectIdentifier.newInternal(iArr16);
        sha1WithDSA_oid = newInternal26;
        HashMap hashMap = new HashMap();
        nameTable = hashMap;
        hashMap.put(newInternal2, "MD5");
        hashMap.put(newInternal, "MD2");
        hashMap.put(newInternal3, "SHA");
        hashMap.put(newInternal4, JCP.DIGEST_SHA256);
        hashMap.put(newInternal5, JCP.DIGEST_SHA384);
        hashMap.put(newInternal6, JCP.DIGEST_SHA512);
        hashMap.put(newInternal16, "RSA");
        hashMap.put(newInternal15, "RSA");
        hashMap.put(newInternal11, "Diffie-Hellman");
        hashMap.put(newInternal12, "Diffie-Hellman");
        hashMap.put(newInternal14, "DSA");
        hashMap.put(newInternal13, "DSA");
        hashMap.put(oid, "EC");
        hashMap.put(oid2, JCP.SIGN_SHA1_ECDSA_NAME);
        hashMap.put(oid3, JCP.SIGN_SHA224_ECDSA_NAME);
        hashMap.put(oid4, JCP.SIGN_SHA256_ECDSA_NAME);
        hashMap.put(oid5, JCP.SIGN_SHA384_ECDSA_NAME);
        hashMap.put(oid6, JCP.SIGN_SHA512_ECDSA_NAME);
        hashMap.put(newInternal18, "MD5withRSA");
        hashMap.put(newInternal17, "MD2withRSA");
        hashMap.put(newInternal26, "SHA1withDSA");
        hashMap.put(newInternal25, "SHA1withDSA");
        hashMap.put(newInternal24, "SHA1withDSA");
        hashMap.put(newInternal19, JCP.SIGN_SHA1_RSA_NAME);
        hashMap.put(newInternal20, JCP.SIGN_SHA1_RSA_NAME);
        hashMap.put(newInternal21, JCP.SIGN_SHA256_RSA_NAME);
        hashMap.put(newInternal22, JCP.SIGN_SHA384_RSA_NAME);
        hashMap.put(newInternal23, JCP.SIGN_SHA512_RSA_NAME);
        hashMap.put(newInternal7, "PBEWithMD5AndDES");
        hashMap.put(newInternal8, "PBEWithMD5AndRC2");
        hashMap.put(newInternal9, "PBEWithSHA1AndDES");
        hashMap.put(newInternal10, "PBEWithSHA1AndRC2");
        hashMap.put(pbeWithSHA1AndDESede_oid, "PBEWithSHA1AndDESede");
        hashMap.put(pbeWithSHA1AndRC2_40_oid, "PBEWithSHA1AndRC2_40");
    }

    private AlgorithmId(ObjectIdentifier objectIdentifier, DerValue derValue) throws IOException {
        this.algid = objectIdentifier;
        this.params = derValue;
        if (derValue != null) {
            decodeParams();
        }
    }

    private static ObjectIdentifier algOID(String str) throws IOException {
        int indexOf;
        if (str.indexOf(46) != -1) {
            return str.startsWith("OID.") ? new ObjectIdentifier(str.substring(4)) : new ObjectIdentifier(str);
        }
        if (str.equalsIgnoreCase("MD5")) {
            return MD5_oid;
        }
        if (str.equalsIgnoreCase("MD2")) {
            return MD2_oid;
        }
        if (str.equalsIgnoreCase("SHA") || str.equalsIgnoreCase(JCP.DIGEST_SHA1) || str.equalsIgnoreCase("SHA-1")) {
            return SHA_oid;
        }
        if (str.equalsIgnoreCase(JCP.DIGEST_SHA_256) || str.equalsIgnoreCase(JCP.DIGEST_SHA256)) {
            return SHA256_oid;
        }
        if (str.equalsIgnoreCase(JCP.DIGEST_SHA_384) || str.equalsIgnoreCase(JCP.DIGEST_SHA384)) {
            return SHA384_oid;
        }
        if (str.equalsIgnoreCase(JCP.DIGEST_SHA_512) || str.equalsIgnoreCase(JCP.DIGEST_SHA512)) {
            return SHA512_oid;
        }
        if (str.equalsIgnoreCase("RSA")) {
            return RSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("Diffie-Hellman") || str.equalsIgnoreCase("DH")) {
            return DH_oid;
        }
        if (str.equalsIgnoreCase("DSA")) {
            return DSA_oid;
        }
        if (str.equalsIgnoreCase("EC")) {
            return EC_oid;
        }
        if (str.equalsIgnoreCase("MD5withRSA") || str.equalsIgnoreCase("MD5/RSA")) {
            return md5WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("MD2withRSA") || str.equalsIgnoreCase("MD2/RSA")) {
            return md2WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase("SHAwithDSA") || str.equalsIgnoreCase("SHA1withDSA") || str.equalsIgnoreCase("SHA/DSA") || str.equalsIgnoreCase("SHA1/DSA") || str.equalsIgnoreCase("DSAWithSHA1") || str.equalsIgnoreCase("DSS") || str.equalsIgnoreCase("SHA-1/DSA")) {
            return sha1WithDSA_oid;
        }
        if (str.equalsIgnoreCase("SHA1WithRSA") || str.equalsIgnoreCase("SHA1/RSA")) {
            return sha1WithRSAEncryption_oid;
        }
        if (str.equalsIgnoreCase(JCP.SIGN_SHA1_ECDSA_NAME) || str.equalsIgnoreCase(JCP.ECDSA_NAME)) {
            return sha1WithECDSA_oid;
        }
        if (str.equalsIgnoreCase(JCP.SIGN_SHA224_ECDSA_NAME)) {
            return sha224WithECDSA_oid;
        }
        if (str.equalsIgnoreCase(JCP.SIGN_SHA256_ECDSA_NAME)) {
            return sha256WithECDSA_oid;
        }
        if (str.equalsIgnoreCase(JCP.SIGN_SHA384_ECDSA_NAME)) {
            return sha384WithECDSA_oid;
        }
        if (str.equalsIgnoreCase(JCP.SIGN_SHA512_ECDSA_NAME)) {
            return sha512WithECDSA_oid;
        }
        if (!initOidTable) {
            Provider[] providers = Security.getProviders();
            for (int i = 0; i < providers.length; i++) {
                Enumeration<Object> keys = providers[i].keys();
                while (keys.hasMoreElements()) {
                    String str2 = (String) keys.nextElement();
                    Locale locale = Locale.ENGLISH;
                    String upperCase = str2.toUpperCase(locale);
                    if (upperCase.startsWith("ALG.ALIAS") && (indexOf = upperCase.indexOf("OID.", 0)) != -1) {
                        int i2 = indexOf + 4;
                        if (i2 == str2.length()) {
                            break;
                        }
                        if (oidTable == null) {
                            oidTable = new HashMap();
                        }
                        String substring = str2.substring(i2);
                        String property = providers[i].getProperty(str2);
                        if (property != null) {
                            property = property.toUpperCase(locale);
                        }
                        if (property != null && oidTable.get(property) == null) {
                            oidTable.put(property, new ObjectIdentifier(substring));
                        }
                    }
                }
            }
            if (oidTable == null) {
                oidTable = new HashMap(1);
            }
            initOidTable = true;
        }
        return (ObjectIdentifier) oidTable.get(str.toUpperCase(Locale.ENGLISH));
    }

    public static AlgorithmId get(AlgorithmParameters algorithmParameters) throws NoSuchAlgorithmException {
        String algorithm = algorithmParameters.getAlgorithm();
        try {
            ObjectIdentifier algOID = algOID(algorithm);
            if (algOID != null) {
                return new AlgorithmId(algOID, algorithmParameters);
            }
            throw new NoSuchAlgorithmException(g8e.o("unrecognized algorithm name: ", algorithm));
        } catch (IOException unused) {
            throw new NoSuchAlgorithmException(g8e.o("Invalid OID ", algorithm));
        }
    }

    public static AlgorithmId getAlgorithmId(String str) throws NoSuchAlgorithmException {
        return get(str);
    }

    public static String getDigAlgFromSigAlg(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int indexOf = upperCase.indexOf("WITH");
        if (indexOf > 0) {
            return upperCase.substring(0, indexOf);
        }
        return null;
    }

    public static String getEncAlgFromSigAlg(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        int indexOf = upperCase.indexOf("WITH");
        if (indexOf <= 0) {
            return null;
        }
        int i = indexOf + 4;
        int indexOf2 = upperCase.indexOf(VsidGenerator.PLAYER_SERVICE_CODE, i);
        String substring = indexOf2 > 0 ? upperCase.substring(i, indexOf2) : upperCase.substring(i);
        return substring.equalsIgnoreCase(JCP.ECDSA_NAME) ? "EC" : substring;
    }

    public static String makeSigAlg(String str, String str2) {
        String replace = str.replace("-", "");
        Locale locale = Locale.ENGLISH;
        String upperCase = replace.toUpperCase(locale);
        if (upperCase.equalsIgnoreCase("SHA")) {
            upperCase = JCP.DIGEST_SHA1;
        }
        String upperCase2 = str2.toUpperCase(locale);
        if (upperCase2.equals("EC")) {
            upperCase2 = JCP.ECDSA_NAME;
        }
        return g8e.p(upperCase, "with", upperCase2);
    }

    private static ObjectIdentifier oid(int[] iArr) {
        return ObjectIdentifier.newInternal(iArr);
    }

    public static AlgorithmId parse(DerValue derValue) throws IOException {
        String str;
        DerValue derValue2 = null;
        if (derValue.tag == 48) {
            DerInputStream derInputStream = derValue.toDerInputStream();
            ObjectIdentifier oid = derInputStream.getOID();
            if (derInputStream.available() != 0) {
                DerValue derValue3 = derInputStream.getDerValue();
                if (derValue3.tag == 5) {
                    if (derValue3.length() == 0) {
                        derValue3 = null;
                    } else {
                        str = "invalid NULL";
                    }
                }
                if (derInputStream.available() == 0) {
                    derValue2 = derValue3;
                } else {
                    str = "Invalid AlgorithmIdentifier: extra data";
                }
            }
            return new AlgorithmId(oid, derValue2);
        }
        str = "algid parse error, not a sequence";
        ny61.v(str);
        return null;
    }

    public void decodeParams() throws IOException {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algid.toString());
            this.algParams = algorithmParameters;
            algorithmParameters.init(this.params.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            this.algParams = null;
        }
    }

    @Override // defpackage.lt61
    public void derEncode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream.putOID(this.algid);
        if (!this.constructedFromDer) {
            AlgorithmParameters algorithmParameters = this.algParams;
            if (algorithmParameters != null) {
                this.params = new DerValue(algorithmParameters.getEncoded());
            } else {
                this.params = null;
            }
        }
        DerValue derValue = this.params;
        if (derValue == null) {
            derOutputStream.putNull();
        } else {
            derOutputStream.putDerValue(derValue);
        }
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    public final byte[] encode() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        derEncode(derOutputStream);
        return derOutputStream.toByteArray();
    }

    public boolean equals(AlgorithmId algorithmId) {
        DerValue derValue = this.params;
        return this.algid.equals((Object) algorithmId.algid) && (derValue == null ? algorithmId.params == null : derValue.equals(algorithmId.params));
    }

    public byte[] getEncodedParams() throws IOException {
        DerValue derValue = this.params;
        if (derValue == null) {
            return null;
        }
        return derValue.toByteArray();
    }

    public String getName() {
        String str = (String) nameTable.get(this.algid);
        if (str != null) {
            return str;
        }
        if (this.params != null && this.algid.equals((Object) specifiedWithECDSA_oid)) {
            try {
                String name = parse(new DerValue(getEncodedParams())).getName();
                if (name.equals("SHA")) {
                    name = JCP.DIGEST_SHA1;
                }
                str = name.concat("withECDSA");
            } catch (IOException unused) {
            }
        }
        return str == null ? this.algid.toString() : str;
    }

    public final ObjectIdentifier getOID() {
        return this.algid;
    }

    public AlgorithmParameters getParameters() {
        return this.algParams;
    }

    public int hashCode() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.algid.toString());
        stringBuffer.append(paramsToString());
        return stringBuffer.toString().hashCode();
    }

    public String paramsToString() {
        if (this.params == null) {
            return "";
        }
        AlgorithmParameters algorithmParameters = this.algParams;
        return algorithmParameters != null ? algorithmParameters.toString() : ", params unparsed";
    }

    public String toString() {
        return getName() + paramsToString();
    }

    public final void encode(DerOutputStream derOutputStream) throws IOException {
        derEncode(derOutputStream);
    }

    public AlgorithmId(ObjectIdentifier objectIdentifier) {
        this.algid = objectIdentifier;
    }

    public AlgorithmId(ObjectIdentifier objectIdentifier, AlgorithmParameters algorithmParameters) {
        this.algid = objectIdentifier;
        this.algParams = algorithmParameters;
    }

    public AlgorithmId() {
    }

    public final boolean equals(ObjectIdentifier objectIdentifier) {
        return this.algid.equals((Object) objectIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlgorithmId) {
            return equals((AlgorithmId) obj);
        }
        if (obj instanceof ObjectIdentifier) {
            return equals((ObjectIdentifier) obj);
        }
        return false;
    }

    public static AlgorithmId get(String str) throws NoSuchAlgorithmException {
        try {
            ObjectIdentifier algOID = algOID(str);
            if (algOID != null) {
                return new AlgorithmId(algOID);
            }
            throw new NoSuchAlgorithmException(g8e.o("unrecognized algorithm name: ", str));
        } catch (IOException unused) {
            throw new NoSuchAlgorithmException(g8e.o("Invalid OID ", str));
        }
    }
}
