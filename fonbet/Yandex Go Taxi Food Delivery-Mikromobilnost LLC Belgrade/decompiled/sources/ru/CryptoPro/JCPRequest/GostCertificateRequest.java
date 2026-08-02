package ru.CryptoPro.JCPRequest;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTCTime;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.b64;
import defpackage.dt61;
import defpackage.ny61;
import defpackage.qz40;
import defpackage.w511;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.TimeZone;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.ALL_CertificateExtensionsValues;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.BasicConstraintsSyntax;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.KeyPurposeId;
import ru.CryptoPro.JCP.ASN.CertificateExtensions._extKeyUsage_ExtnType;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ALL_PKIX1Explicit88Values;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ATTRIBUTE_CLASS;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Attribute;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Attribute_values;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Certificate;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.CertificateSerialNumber;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.RDNSequence;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.TBSCertificate;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Time;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Validity;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Version;
import ru.CryptoPro.JCP.ASN.PKIXCMP.CertificationRequest;
import ru.CryptoPro.JCP.ASN.PKIXCMP.CertificationRequest_certificationRequestInfo;
import ru.CryptoPro.JCP.ASN.PKIXCMP.CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.ASN.PKIXCMP._SetOfAttribute;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.AlgorithmTools;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;
import ru.CryptoPro.JCPRequest.ca15.user.CAUser;
import ru.CryptoPro.JCPRequest.ca20.user.CA20CertAuthUser;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.x509.X500Name;

/* loaded from: classes4.dex */
public class GostCertificateRequest implements KeyUsage {
    public static final String ADDRESS_SHOULD_BE_HTTP = "Address should be HTTP";
    protected static final String ASN_ERROR = "ASN_ERROR";
    public static final String BEGIN_STRING = "-----BEGIN NEW CERTIFICATE REQUEST-----";
    protected static final String CHARSET = "UTF-8";
    protected static final String CONNECT_ERROR = "CONNECT_ERROR";
    public static final String DEFAULT_SIGN_ALGORITHM = "GOST3411withGOST3410EL";
    public static final String END_STRING = "-----END NEW CERTIFICATE REQUEST-----";
    protected static final String INVALID_KEY_ALG_ERROR = "INVALID_KEY_ALG_ERROR";
    protected static final String IS_SIGNED = "IS_SIGNED";
    protected static final String NO_ALG_ERROR = "NO_ALG_ERROR";
    protected static final String NO_SIGNED = "NO_SIGNED";
    public static final String UNKNOWN_KEY_ALGORITHM = "Unknown key algorithm";
    protected static final String UNKNOWN_KEY_ALG_ERROR = "UNKNOWN_KEY_ALG_ERROR";
    protected static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCPRequest.resources.request", Locale.getDefault());
    public CertificationRequest a;
    public boolean b;
    public boolean c;
    public int d;
    public final Vector e;
    protected byte[] encoded;
    public final Vector f;
    public SubjectPublicKeyInfo g;
    public RDNSequence h;
    public String i;
    public Calendar j;
    public Calendar k;
    public boolean l;
    public boolean m;
    protected String providerName;

    public GostCertificateRequest(String str) throws IOException {
        this.a = createRequest();
        this.encoded = null;
        this.b = false;
        this.c = false;
        this.d = 3;
        this.e = new Vector(0);
        this.f = new Vector(0);
        this.g = null;
        this.h = null;
        this.providerName = "JCP";
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = true;
        this.m = false;
        SelfTester_Auxiliary.checkClass(GostCertificateRequest.class);
        init(JCP.GOST_EL_DEGREE_NAME);
        this.providerName = str;
    }

    public static String a(byte b) {
        char[] cArr = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        return Character.toString(cArr[(b >>> 4) & 15]) + cArr[b & PKIBody._CCP];
    }

    public static OID b(PrivateKey privateKey, String str) {
        String algorithm = privateKey.getAlgorithm();
        if (algorithm.equals(JCP.GOST_EL_2012_256_NAME) || algorithm.equals(JCP.GOST_DH_2012_256_NAME)) {
            return new OID("1.2.643.7.1.1.3.2");
        }
        if (algorithm.equals(JCP.GOST_EL_2012_512_NAME) || algorithm.equals(JCP.GOST_DH_2012_512_NAME)) {
            return new OID("1.2.643.7.1.1.3.3");
        }
        if (!algorithm.equalsIgnoreCase("RSA") && !algorithm.equalsIgnoreCase("CP_RSA")) {
            if (!algorithm.equalsIgnoreCase(JCP.ECDSA_NAME) && !algorithm.equalsIgnoreCase(JCP.CP_ECDSA_NAME) && !algorithm.equalsIgnoreCase(JCP.ECDH_NAME) && !algorithm.equalsIgnoreCase(JCP.CP_ECDH_NAME)) {
                return (algorithm.equalsIgnoreCase("Ed25519") || algorithm.equalsIgnoreCase("CP_Ed25519")) ? new OID(JCP.SIGN_EDDSA_OID) : new OID("1.2.643.2.2.3");
            }
            if (str == null) {
                throw new InvalidKeyException(resource.getString(INVALID_KEY_ALG_ERROR));
            }
            if (str.contains(JCP.SIGN_SHA1_ECDSA_NAME)) {
                return new OID(JCP.SIGN_SHA1_ECDSA_OID);
            }
            if (str.contains(JCP.SIGN_SHA256_ECDSA_NAME)) {
                return new OID(JCP.SIGN_SHA256_ECDSA_OID);
            }
            if (str.contains(JCP.SIGN_SHA384_ECDSA_NAME)) {
                return new OID(JCP.SIGN_SHA384_ECDSA_OID);
            }
            if (str.contains(JCP.SIGN_SHA512_ECDSA_NAME)) {
                return new OID(JCP.SIGN_SHA512_ECDSA_OID);
            }
            throw new InvalidKeyException(resource.getString(UNKNOWN_KEY_ALG_ERROR));
        }
        if (str == null) {
            throw new InvalidKeyException(resource.getString(INVALID_KEY_ALG_ERROR));
        }
        if (str.contains(JCP.SIGN_SHA1_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA1_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA224_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA224_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA256_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA256_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA384_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA384_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA512_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA512_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA3_224_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA3_224_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA3_256_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA3_256_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA3_384_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA3_384_RSA_OID);
        }
        if (str.contains(JCP.SIGN_SHA3_512_RSA_NAME)) {
            return new OID(JCP.SIGN_SHA3_512_RSA_OID);
        }
        throw new InvalidKeyException(resource.getString(UNKNOWN_KEY_ALG_ERROR));
    }

    public static byte[] c(String str, byte[] bArr) {
        try {
            URL url = new URL(str + "certfnsh.asp");
            Properties properties = new Properties();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b != 10 && b != 13) {
                    stringBuffer.append('%');
                    stringBuffer.append(a(bArr[i]));
                }
            }
            properties.put("CertRequest", stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer("CryptCP%3A");
            for (int i2 = 0; i2 < 30; i2++) {
                stringBuffer2.append('A');
            }
            properties.put("Mode", "newreq");
            properties.put("TargetStoreFlags", "0");
            properties.put("SaveCert", "no");
            properties.put("FriendlyType", stringBuffer2.toString());
            dt61 httpInstance = RegisteredHttpClient.getHttpInstance(url, false);
            Properties properties2 = new Properties();
            properties2.put("Content-Type", "application/x-www-form-urlencoded");
            httpInstance.getClass();
            properties2.put("Encoding-Type", "UTF-8");
            qz40 qz40Var = (qz40) httpInstance;
            qz40Var.d("POST", properties2, properties);
            return httpGetFile(str + "certnew.cer?ReqID=" + getIdExtended(new String(qz40Var.g())) + "&enc=bin", CAUser.NULL);
        } catch (MalformedURLException e) {
            ConnectException connectException = new ConnectException(resource.getString(CONNECT_ERROR));
            connectException.initCause(e);
            throw connectException;
        }
    }

    public static Extension createBasic() throws IOException {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        Extension extension = new Extension();
        extension.extnID = new Asn1ObjectIdentifier(ALL_CertificateExtensionsValues.id_ce_basicConstraints);
        extension.critical = new Asn1Boolean(true);
        try {
            new BasicConstraintsSyntax(true, 5L).encode(asn1BerEncodeBuffer);
            extension.extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
            return extension;
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static Extension createExtUsage(Vector vector, boolean z) throws IOException {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        if (vector.size() == 0) {
            return null;
        }
        Extension extension = new Extension();
        extension.extnID = new Asn1ObjectIdentifier(ALL_CertificateExtensionsValues.id_ce_extKeyUsage);
        extension.critical = new Asn1Boolean(z);
        _extKeyUsage_ExtnType formExtKeyUsage = formExtKeyUsage(vector);
        asn1BerEncodeBuffer.reset();
        try {
            formExtKeyUsage.encode(asn1BerEncodeBuffer);
            extension.extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
            return extension;
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static BitSet createKeyUsageBitSet(int i) {
        BitSet bitSet = new BitSet(8);
        for (int i2 = 0; i2 < 31; i2++) {
            if (((1 << i2) & i) != 0) {
                bitSet.set(i2);
            }
        }
        return bitSet;
    }

    public static CertificationRequest createRequest() {
        CertificationRequest certificationRequest = new CertificationRequest();
        CertificationRequest_certificationRequestInfo certificationRequest_certificationRequestInfo = new CertificationRequest_certificationRequestInfo();
        certificationRequest.certificationRequestInfo = certificationRequest_certificationRequestInfo;
        certificationRequest_certificationRequestInfo.version = new Asn1Integer(0L);
        return certificationRequest;
    }

    public static Extension createUsage(int i) throws IOException {
        Extension extension = new Extension();
        extension.extnID = new Asn1ObjectIdentifier(ALL_CertificateExtensionsValues.id_ce_keyUsage);
        extension.critical = new Asn1Boolean(true);
        Asn1BitString asn1BitString = new Asn1BitString(createKeyUsageBitSet(i));
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            asn1BitString.encode(asn1BerEncodeBuffer);
            extension.extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
            return extension;
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public static _extKeyUsage_ExtnType formExtKeyUsage(Vector vector) {
        int size = vector.size();
        _extKeyUsage_ExtnType _extkeyusage_extntype = new _extKeyUsage_ExtnType(size);
        for (int i = 0; i < size; i++) {
            _extkeyusage_extntype.elements[i] = (KeyPurposeId) vector.elementAt(i);
        }
        return _extkeyusage_extntype;
    }

    public static byte[] getEncodedCertFromBASE64(String str, InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuffer stringBuffer = new StringBuffer("");
                while (bufferedReader2.ready()) {
                    String readLine = bufferedReader2.readLine();
                    if (!readLine.equals(BEGIN_STRING) && !readLine.equals(END_STRING)) {
                        stringBuffer.append(readLine);
                    }
                }
                byte[] c = c(str, stringBuffer.toString().getBytes("UTF-8"));
                try {
                    bufferedReader2.close();
                } catch (Exception unused) {
                }
                return c;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] getEncodedCertFromDER(String str, InputStream inputStream) throws Exception {
        Encoder encoder = new Encoder();
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, i, available - i);
            if (read <= 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                encoder.encode(bArr, byteArrayOutputStream);
                return c(str, byteArrayOutputStream.toByteArray());
            }
            i += read;
        }
    }

    public static byte[] getEncodedRootCert(String str) throws Exception {
        String j = b64.j(str, "certcarc.asp");
        CAUser cAUser = CAUser.NULL;
        String str2 = new String(httpGetFile(j, cAUser));
        int indexOf = str2.indexOf("var nRenewals=");
        if (indexOf == -1) {
            ny61.v("Request ID not found");
            return null;
        }
        int i = indexOf + 14;
        int indexOf2 = str2.indexOf(";", i);
        if (indexOf2 == -1) {
            ny61.v("Request ID not found");
            return null;
        }
        return httpGetFile(str + "certnew.cer?ReqID=CACert&Renewal=" + str2.substring(i, indexOf2) + "&enc=bin", cAUser);
    }

    public static int getId(String str) throws IOException {
        boolean z;
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf("ReqID=", i);
            if (indexOf == -1) {
                ny61.v("Request ID not found");
                return 0;
            }
            int i3 = indexOf + 6;
            int indexOf2 = str.indexOf("&", i3);
            if (indexOf2 == -1) {
                ny61.v("Request ID not found");
                return 0;
            }
            try {
                i2 = Integer.parseInt(str.substring(i3, indexOf2));
                z = true;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (z) {
                return i2;
            }
            i = indexOf2;
        }
    }

    public static int getIdExtended(String str) throws IOException {
        try {
            return getId(str);
        } catch (IOException unused) {
            return getIdNew(str);
        }
    }

    public static int getIdNew(String str) throws IOException {
        Matcher matcher = Pattern.compile("(<Input Type=Hidden Name=ReqID Value=\")([0-9]+)(\">)").matcher(str);
        if (!matcher.find()) {
            ny61.v("Request ID not found");
            return 0;
        }
        try {
            return Integer.parseInt(matcher.group(2));
        } catch (NumberFormatException unused) {
            ny61.v("Request ID not found");
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dt61] */
    public static byte[] httpGetFile(String str, CAUser cAUser, Properties properties) throws Exception {
        qz40 qz40Var;
        Throwable th;
        HttpURLConnection httpURLConnection;
        try {
            try {
                ?? httpInstance = RegisteredHttpClient.getHttpInstance(new URL(str), cAUser.isCA20());
                try {
                    if (cAUser instanceof CA20CertAuthUser) {
                        ((qz40) httpInstance).e = ((CA20CertAuthUser) cAUser).getCertAuthInfo();
                    }
                    qz40Var = (qz40) httpInstance;
                    qz40Var.d("GET", properties, null);
                    try {
                        byte[] g = qz40Var.g();
                        int i = qz40Var.a;
                        if (i != 200) {
                            throw new Exception("Server has returned an invalid http code: " + i);
                        }
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) qz40Var.f;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return g;
                    } catch (Throwable th2) {
                        th = th2;
                        if (qz40Var != null && (httpURLConnection = (HttpURLConnection) qz40Var.f) != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    qz40Var = httpInstance;
                }
            } catch (Throwable th4) {
                qz40Var = null;
                th = th4;
            }
        } catch (MalformedURLException e) {
            ConnectException connectException = new ConnectException(resource.getString(CONNECT_ERROR));
            connectException.initCause(e);
            throw connectException;
        }
    }

    public static boolean isEquals(Asn1ObjectIdentifier asn1ObjectIdentifier, Asn1ObjectIdentifier asn1ObjectIdentifier2) {
        boolean z = true;
        if (asn1ObjectIdentifier == null && asn1ObjectIdentifier2 == null) {
            return true;
        }
        if (asn1ObjectIdentifier == null || asn1ObjectIdentifier2 == null || asn1ObjectIdentifier.value != asn1ObjectIdentifier2.value) {
            return false;
        }
        int i = 0;
        while (true) {
            int[] iArr = asn1ObjectIdentifier.value;
            if (i >= iArr.length) {
                return z;
            }
            if (iArr[i] != asn1ObjectIdentifier2.value[i]) {
                z = false;
            }
            i++;
        }
    }

    public static void setPublic2Request(CertificationRequest certificationRequest, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        certificationRequest.certificationRequestInfo.subjectPublicKeyInfo = new CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo();
        CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo = certificationRequest.certificationRequestInfo.subjectPublicKeyInfo;
        certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.subjectPublicKey = subjectPublicKeyInfo.subjectPublicKey;
        certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.algorithm = subjectPublicKeyInfo.algorithm;
    }

    public static void setSign2Request(CertificationRequest certificationRequest, byte[] bArr, OID oid) {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(oid.value);
        certificationRequest.signatureAlgorithm = algorithmIdentifier;
        algorithmIdentifier.parameters = null;
        Asn1BitString asn1BitString = new Asn1BitString();
        certificationRequest.signature = asn1BitString;
        asn1BitString.numbits = bArr.length << 3;
        asn1BitString.value = (byte[]) bArr.clone();
    }

    public static void setSubject2Request(CertificationRequest certificationRequest, RDNSequence rDNSequence) {
        certificationRequest.certificationRequestInfo.subject = new Name();
        certificationRequest.certificationRequestInfo.subject.set_rdnSequence(rDNSequence);
    }

    public static byte[] sign(PrivateKey privateKey, byte[] bArr, String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, NoSuchProviderException {
        if (str == null) {
            str = "GOST3411withGOST3410EL";
        }
        Signature signature = Signature.getInstance(str, str2);
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    public void addExtKeyUsage(int[] iArr) {
        Vector vector;
        KeyPurposeId keyPurposeId = new KeyPurposeId(iArr);
        int i = 0;
        while (true) {
            vector = this.e;
            if (i >= vector.size()) {
                break;
            }
            if (isEquals((KeyPurposeId) vector.elementAt(i), keyPurposeId)) {
                keyPurposeId = null;
                break;
            }
            i++;
        }
        if (keyPurposeId != null) {
            vector.add(keyPurposeId);
        }
    }

    public void addExtension(Extension extension) {
        Asn1ObjectIdentifier asn1ObjectIdentifier;
        if (extension == null || (asn1ObjectIdentifier = extension.extnID) == null || Arrays.equals(asn1ObjectIdentifier.value, ALL_CertificateExtensionsValues.id_ce_keyUsage) || Arrays.equals(extension.extnID.value, ALL_CertificateExtensionsValues.id_ce_extKeyUsage)) {
            w511.q();
        } else {
            this.f.add(extension);
        }
    }

    public void clearExtKeyUsage() {
        this.e.clear();
    }

    public void clearExtList() {
        this.f.clear();
    }

    public final Extension[] d(boolean z, boolean z2) {
        Extension extension;
        Vector vector = this.f;
        int size = vector.size();
        Extension createUsage = createUsage(this.d);
        int i = size + 1;
        Extension extension2 = null;
        if (lengthExtKeyUsage() != 0) {
            extension = createExtUsage(this.e, z2);
            i = size + 2;
        } else {
            extension = null;
        }
        if (z) {
            extension2 = createBasic();
            i++;
        }
        Extension[] extensionArr = new Extension[i];
        int i2 = 0;
        while (i2 < vector.size()) {
            extensionArr[i2] = (Extension) vector.elementAt(i2);
            i2++;
        }
        int i3 = i2 + 1;
        extensionArr[i2] = createUsage;
        if (extension != null) {
            extensionArr[i3] = extension;
            i3 = i2 + 2;
        }
        if (extension2 != null) {
            extensionArr[i3] = extension2;
        }
        return extensionArr;
    }

    public void decodeRequest(byte[] bArr) throws IOException {
        Attribute[] attributeArr;
        Attribute_values attribute_values;
        reset();
        try {
            this.a.decode(new Asn1BerDecodeBuffer(bArr));
            byte[] bArr2 = new byte[bArr.length];
            this.encoded = bArr2;
            int i = 0;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            this.g = subjectPublicKeyInfo;
            CertificationRequest_certificationRequestInfo certificationRequest_certificationRequestInfo = this.a.certificationRequestInfo;
            CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo = certificationRequest_certificationRequestInfo.subjectPublicKeyInfo;
            subjectPublicKeyInfo.subjectPublicKey = certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.subjectPublicKey;
            subjectPublicKeyInfo.algorithm = certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.algorithm;
            this.h = (RDNSequence) certificationRequest_certificationRequestInfo.subject.getElement();
            _SetOfAttribute _setofattribute = this.a.certificationRequestInfo.attributes;
            if (_setofattribute == null || (attributeArr = _setofattribute.elements) == null) {
                return;
            }
            int length = attributeArr.length;
            int i2 = 0;
            while (i2 < length) {
                Attribute attribute = attributeArr[i2];
                if (Arrays.equals(attribute.type.value, ALL_PKIX1Explicit88Values.msCertExtensions.id.value) && (attribute_values = attribute.values) != null) {
                    Asn1Type[] asn1TypeArr = attribute_values.elements;
                    int length2 = asn1TypeArr.length;
                    Extensions[] extensionsArr = new Extensions[length2];
                    System.arraycopy(asn1TypeArr, i, extensionsArr, i, length2);
                    int i3 = i;
                    while (i3 < length2) {
                        Extension[] extensionArr = extensionsArr[i3].elements;
                        if (extensionArr != null) {
                            int length3 = extensionArr.length;
                            int i4 = i;
                            while (i4 < length3) {
                                Extension extension = extensionArr[i4];
                                if (Arrays.equals(extension.extnID.value, ALL_CertificateExtensionsValues.id_ce_extKeyUsage)) {
                                    Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(extension.extnValue.value);
                                    _extKeyUsage_ExtnType _extkeyusage_extntype = new _extKeyUsage_ExtnType();
                                    try {
                                        _extkeyusage_extntype.decode(asn1BerDecodeBuffer);
                                        KeyPurposeId[] keyPurposeIdArr = _extkeyusage_extntype.elements;
                                        if (keyPurposeIdArr != null) {
                                            int length4 = keyPurposeIdArr.length;
                                            for (int i5 = i; i5 < length4; i5++) {
                                                KeyPurposeId keyPurposeId = keyPurposeIdArr[i5];
                                                if (Arrays.equals(keyPurposeId.value, KeyUsage.INTS_PKIX_SERVER_AUTH)) {
                                                    this.c = true;
                                                }
                                                addExtKeyUsage(keyPurposeId.value);
                                            }
                                        }
                                    } catch (Asn1Exception e) {
                                        JCPLogger.subThrown(e);
                                    }
                                } else if (Arrays.equals(extension.extnID.value, ALL_CertificateExtensionsValues.id_ce_keyUsage)) {
                                    Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(extension.extnValue.value);
                                    Asn1BitString asn1BitString = new Asn1BitString();
                                    asn1BitString.decode(asn1BerDecodeBuffer2);
                                    this.b = asn1BitString.isSet(2) && asn1BitString.isSet(4);
                                    int i6 = 0;
                                    for (int i7 = 0; i7 < asn1BitString.numbits; i7++) {
                                        i6 |= asn1BitString.isSet(i7) ? 1 << i7 : 0;
                                    }
                                    this.d = i6;
                                } else {
                                    addExtension(extension);
                                }
                                i4++;
                                i = 0;
                            }
                        }
                        i3++;
                        i = 0;
                    }
                }
                i2++;
                i = 0;
            }
        } catch (Asn1Exception e2) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void encodeAndSign(PrivateKey privateKey, String str) throws SignatureException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        CertificationRequest createRequest = createRequest();
        setPublic2Request(createRequest, this.g);
        setSubject2Request(createRequest, this.h);
        CertificationRequest_certificationRequestInfo certificationRequest_certificationRequestInfo = createRequest.certificationRequestInfo;
        _SetOfAttribute _setofattribute = new _SetOfAttribute();
        certificationRequest_certificationRequestInfo.attributes = _setofattribute;
        _setofattribute.elements = new Attribute[]{new Attribute()};
        Attribute attribute = certificationRequest_certificationRequestInfo.attributes.elements[0];
        ATTRIBUTE_CLASS attribute_class = ALL_PKIX1Explicit88Values.msCertExtensions;
        attribute.type = attribute_class.id;
        attribute.values = new Attribute_values(1);
        Attribute[] attributeArr = certificationRequest_certificationRequestInfo.attributes.elements;
        attributeArr[0].values.elements = new Extensions[]{attribute_class.Type};
        ((Extensions) attributeArr[0].values.elements[0]).elements = d(false, false);
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            createRequest.certificationRequestInfo.encode(asn1BerEncodeBuffer);
            byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
            if (str == null) {
                str = AlgorithmTools.getSignatureAlgorithmByPrivateKey(privateKey);
            }
            setSign2Request(createRequest, sign(privateKey, msgCopy, str, this.providerName), b(privateKey, str));
            asn1BerEncodeBuffer.reset();
            try {
                createRequest.encode(asn1BerEncodeBuffer);
                this.encoded = asn1BerEncodeBuffer.getMsgCopy();
            } catch (Asn1Exception e) {
                IOException iOException = new IOException(resource.getString(ASN_ERROR));
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Asn1Exception e2) {
            IOException iOException2 = new IOException(resource.getString(ASN_ERROR));
            iOException2.initCause(e2);
            throw iOException2;
        }
    }

    public void encodeAndSignOLD(PrivateKey privateKey, String str) throws SignatureException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            this.a.certificationRequestInfo.encode(asn1BerEncodeBuffer);
            byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
            if (str == null) {
                str = AlgorithmTools.getSignatureAlgorithmByPrivateKey(privateKey);
            }
            byte[] sign = sign(privateKey, msgCopy, str, this.providerName);
            OID b = b(privateKey, str);
            this.a.signatureAlgorithm = new AlgorithmIdentifier(b.value);
            CertificationRequest certificationRequest = this.a;
            certificationRequest.signatureAlgorithm.parameters = null;
            certificationRequest.signature = new Asn1BitString();
            Asn1BitString asn1BitString = this.a.signature;
            asn1BitString.numbits = sign.length << 3;
            asn1BitString.value = sign;
            asn1BerEncodeBuffer.reset();
            try {
                this.a.encode(asn1BerEncodeBuffer);
                this.encoded = asn1BerEncodeBuffer.getMsgCopy();
            } catch (Asn1Exception e) {
                IOException iOException = new IOException(resource.getString(ASN_ERROR));
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Asn1Exception e2) {
            IOException iOException2 = new IOException(resource.getString(ASN_ERROR));
            iOException2.initCause(e2);
            throw iOException2;
        }
    }

    public byte[] generateCert(PrivateKey privateKey, PublicKey publicKey, X500Name x500Name, X500Name x500Name2, String str) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        RDNSequence rDNSequence;
        if (publicKey != null) {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(publicKey.getEncoded());
            subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            try {
                subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            } catch (Asn1Exception e) {
                IOException iOException = new IOException(resource.getString(ASN_ERROR));
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            subjectPublicKeyInfo = this.g;
        }
        Certificate certificate = new Certificate();
        TBSCertificate tBSCertificate = new TBSCertificate();
        certificate.tbsCertificate = tBSCertificate;
        tBSCertificate.version = new Version(2L);
        OID b = b(privateKey, str);
        certificate.tbsCertificate.signature = new AlgorithmIdentifier(b.value);
        certificate.tbsCertificate.validity = new Validity();
        Calendar calendar = this.j;
        if (calendar == null) {
            calendar = new GregorianCalendar();
            calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        }
        Calendar calendar2 = this.k;
        if (calendar2 == null) {
            calendar2 = new GregorianCalendar();
            calendar2.setTimeZone(TimeZone.getTimeZone("GMT"));
            calendar2.add(1, 1);
        }
        certificate.tbsCertificate.validity.notBefore = new Time();
        certificate.tbsCertificate.validity.notAfter = new Time();
        try {
            Asn1UTCTime asn1UTCTime = new Asn1UTCTime();
            asn1UTCTime.setTime(calendar);
            certificate.tbsCertificate.validity.notBefore.set_utcTime(asn1UTCTime);
            Asn1UTCTime asn1UTCTime2 = new Asn1UTCTime();
            asn1UTCTime2.setTime(calendar2);
            certificate.tbsCertificate.validity.notAfter.set_utcTime(asn1UTCTime2);
            String str2 = this.providerName;
            if (str2 != null && !str2.equals("JCSP") && !str2.equals("JCSPRSA") && !str2.equals("JCSPECDSA") && !str2.equals("JCSPEDDSA")) {
                str2 = "JCP";
            }
            if (this.i == null) {
                byte[] generateSeed = (str2 == null ? SecureRandom.getInstance(JCP.CP_RANDOM) : SecureRandom.getInstance(JCP.CP_RANDOM, str2)).generateSeed(4);
                StringBuffer stringBuffer = new StringBuffer("");
                for (byte b2 : generateSeed) {
                    stringBuffer.append(a(b2));
                }
                String stringBuffer2 = stringBuffer.toString();
                if ((generateSeed[0] & DerValue.TAG_CONTEXT) == 128) {
                    stringBuffer2 = a((byte) 0) + stringBuffer2;
                }
                certificate.tbsCertificate.serialNumber = new CertificateSerialNumber(stringBuffer2, 16);
            } else {
                certificate.tbsCertificate.serialNumber = new CertificateSerialNumber(this.i, 16);
            }
            certificate.tbsCertificate.subject = new Name();
            certificate.tbsCertificate.issuer = new Name();
            if (x500Name != null) {
                Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(x500Name.getEncoded());
                rDNSequence = new RDNSequence();
                try {
                    rDNSequence.decode(asn1BerDecodeBuffer2);
                } catch (Asn1Exception e2) {
                    IOException iOException2 = new IOException(resource.getString(ASN_ERROR));
                    iOException2.initCause(e2);
                    throw iOException2;
                }
            } else {
                rDNSequence = this.h;
            }
            certificate.tbsCertificate.subject.set_rdnSequence(rDNSequence);
            Asn1BerDecodeBuffer asn1BerDecodeBuffer3 = new Asn1BerDecodeBuffer(x500Name2.getEncoded());
            RDNSequence rDNSequence2 = new RDNSequence();
            try {
                rDNSequence2.decode(asn1BerDecodeBuffer3);
                certificate.tbsCertificate.issuer.set_rdnSequence(rDNSequence2);
                asn1BerDecodeBuffer3.reset();
                certificate.tbsCertificate.subjectPublicKeyInfo = new SubjectPublicKeyInfo();
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = certificate.tbsCertificate.subjectPublicKeyInfo;
                subjectPublicKeyInfo2.subjectPublicKey = subjectPublicKeyInfo.subjectPublicKey;
                subjectPublicKeyInfo2.algorithm = subjectPublicKeyInfo.algorithm;
                Extension[] d = d(this.l, this.m);
                certificate.tbsCertificate.extensions = new Extensions(d.length);
                System.arraycopy(d, 0, certificate.tbsCertificate.extensions.elements, 0, d.length);
                Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                try {
                    certificate.tbsCertificate.encode(asn1BerEncodeBuffer);
                    byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
                    if (str == null) {
                        str = AlgorithmTools.getSignatureAlgorithmByPrivateKey(privateKey);
                    }
                    byte[] sign = sign(privateKey, msgCopy, str, this.providerName);
                    certificate.signatureAlgorithm = new AlgorithmIdentifier(b.value);
                    Asn1BitString asn1BitString = new Asn1BitString();
                    certificate.signature = asn1BitString;
                    asn1BitString.numbits = sign.length << 3;
                    asn1BitString.value = sign;
                    asn1BerEncodeBuffer.reset();
                    try {
                        certificate.encode(asn1BerEncodeBuffer);
                        return asn1BerEncodeBuffer.getMsgCopy();
                    } catch (Asn1Exception e3) {
                        IOException iOException3 = new IOException(resource.getString(ASN_ERROR));
                        iOException3.initCause(e3);
                        throw iOException3;
                    }
                } catch (Asn1Exception e4) {
                    IOException iOException4 = new IOException(resource.getString(ASN_ERROR));
                    iOException4.initCause(e4);
                    throw iOException4;
                }
            } catch (Asn1Exception e5) {
                IOException iOException5 = new IOException(resource.getString(ASN_ERROR));
                iOException5.initCause(e5);
                throw iOException5;
            }
        } catch (Asn1Exception e6) {
            IOException iOException6 = new IOException(resource.getString(ASN_ERROR));
            iOException6.initCause(e6);
            throw iOException6;
        }
    }

    public byte[] generateCertFromRequest(PrivateKey privateKey, String str) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(privateKey, (PublicKey) null, (X500Name) null, new X500Name(str), (String) null);
    }

    public byte[] getEncoded() {
        return this.encoded;
    }

    public byte[] getEncodedCert(String str) throws Exception {
        if (this.encoded == null) {
            throw new SignatureException(resource.getString(NO_SIGNED));
        }
        Encoder encoder = new Encoder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encoder.encode(this.encoded, byteArrayOutputStream);
        return c(str, byteArrayOutputStream.toByteArray());
    }

    public byte[] getEncodedSelfCert(KeyPair keyPair, X500Name x500Name, String str) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(keyPair.getPrivate(), keyPair.getPublic(), x500Name, x500Name, str);
    }

    public int getKeyUsageMask() {
        return this.d;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public RDNSequence getSubjectInfo() {
        return this.h;
    }

    public SubjectPublicKeyInfo getSubjectKey() {
        return this.g;
    }

    public void init(String str, boolean z, boolean z2) throws IOException {
        if (str == null || str.length() == 0) {
            str = JCP.GOST_EL_DEGREE_NAME;
        }
        if (str.equals(JCP.GOST_EL_DEGREE_NAME) || str.equals(JCP.GOST_EL_EPH_DEGREE_NAME) || str.equals(JCP.GOST_EL_2012_256_NAME) || str.equals(JCP.GOST_EPH_2012_256_NAME) || str.equals(JCP.GOST_EL_2012_512_NAME) || str.equals(JCP.GOST_EPH_2012_512_NAME) || str.equals(JCP.ECDSA_NAME) || str.equals("Ed25519")) {
            this.d = 3;
            if (z) {
                w511.q();
                return;
            }
            return;
        }
        if (str.equals("GOST3410DHEL") || str.equals("GOST3410DHELEPH") || str.equals(JCP.GOST_DH_2012_256_NAME) || str.equals(JCP.GOST_EPH_DH_2012_256_NAME) || str.equals(JCP.GOST_DH_2012_512_NAME) || str.equals(JCP.GOST_EPH_DH_2012_512_NAME) || str.equals(JCP.ECDH_NAME)) {
            this.d = 23;
            addExtKeyUsage(KeyUsage.INTS_PKIX_CLIENT_AUTH);
            if (z) {
                addExtKeyUsage(KeyUsage.INTS_PKIX_SERVER_AUTH);
                return;
            }
            return;
        }
        if (!str.equalsIgnoreCase("RSA") && !str.equalsIgnoreCase("CP_RSA")) {
            ny61.v(UNKNOWN_KEY_ALGORITHM);
            return;
        }
        if (!z2) {
            this.d = 3;
            if (z) {
                w511.q();
                return;
            }
            return;
        }
        this.d = 23;
        addExtKeyUsage(KeyUsage.INTS_PKIX_CLIENT_AUTH);
        if (z) {
            addExtKeyUsage(KeyUsage.INTS_PKIX_SERVER_AUTH);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initOLD(String str, boolean z) throws IOException {
        if (str.equals(JCP.GOST_EL_DEGREE_NAME)) {
            this.b = false;
        } else {
            if (!str.equals("GOST3410DHEL")) {
                ny61.v(UNKNOWN_KEY_ALGORITHM);
                return;
            }
            this.b = true;
        }
        this.c = z;
        CertificationRequest certificationRequest = new CertificationRequest();
        this.a = certificationRequest;
        certificationRequest.certificationRequestInfo = new CertificationRequest_certificationRequestInfo();
        this.a.certificationRequestInfo.version = new Asn1Integer(0L);
        this.a.certificationRequestInfo.attributes = new _SetOfAttribute();
        _SetOfAttribute _setofattribute = this.a.certificationRequestInfo.attributes;
        _setofattribute.elements = new Attribute[]{new Attribute()};
        Attribute attribute = _setofattribute.elements[0];
        ATTRIBUTE_CLASS attribute_class = ALL_PKIX1Explicit88Values.msCertExtensions;
        attribute.type = attribute_class.id;
        attribute.values = new Attribute_values(1);
        _setofattribute.elements[0].values.elements = new Extensions[]{attribute_class.Type};
        Extension extension = new Extension();
        extension.extnID = new Asn1ObjectIdentifier(ALL_CertificateExtensionsValues.id_ce_keyUsage);
        extension.critical = new Asn1Boolean(true);
        BitSet bitSet = new BitSet(0);
        bitSet.set(0);
        bitSet.set(1);
        if (this.b) {
            bitSet.set(2);
            bitSet.set(4);
        }
        Asn1BitString asn1BitString = new Asn1BitString(bitSet);
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        try {
            asn1BitString.encode(asn1BerEncodeBuffer);
            extension.extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
            Extension extension2 = new Extension();
            extension2.extnID = new Asn1ObjectIdentifier(ALL_CertificateExtensionsValues.id_ce_extKeyUsage);
            _extKeyUsage_ExtnType _extkeyusage_extntype = new _extKeyUsage_ExtnType(1);
            KeyPurposeId[] keyPurposeIdArr = new KeyPurposeId[1];
            _extkeyusage_extntype.elements = keyPurposeIdArr;
            if (this.c) {
                keyPurposeIdArr[0] = new KeyPurposeId(KeyUsage.INTS_PKIX_SERVER_AUTH);
            } else {
                keyPurposeIdArr[0] = new KeyPurposeId(KeyUsage.INTS_PKIX_CLIENT_AUTH);
            }
            asn1BerEncodeBuffer.reset();
            try {
                _extkeyusage_extntype.encode(asn1BerEncodeBuffer);
                extension2.extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
                asn1BerEncodeBuffer.reset();
                Extension[] extensionArr = {extension, extension2};
                Extension[] extensionArr2 = new Extension[2];
                ((Extensions) _setofattribute.elements[0].values.elements[0]).elements = extensionArr2;
                System.arraycopy(extensionArr, 0, extensionArr2, 0, 2);
                this.a.signatureAlgorithm = new AlgorithmIdentifier();
                this.a.signature = new Asn1BitString();
            } catch (Asn1Exception e) {
                IOException iOException = new IOException(resource.getString(ASN_ERROR));
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Asn1Exception e2) {
            IOException iOException2 = new IOException(resource.getString(ASN_ERROR));
            iOException2.initCause(e2);
            throw iOException2;
        }
    }

    public boolean isExchange() {
        return this.b;
    }

    public boolean isServer() {
        return this.c;
    }

    public int lengthExtKeyUsage() {
        return this.e.size();
    }

    public int lengthExtList() {
        return this.f.size();
    }

    public void printToBASE64(PrintStream printStream) throws IOException, SignatureException {
        if (this.encoded == null) {
            throw new SignatureException(resource.getString(NO_SIGNED));
        }
        printStream.getClass();
        new Encoder().encodeBuffer(this.encoded, printStream);
    }

    public void printToDER(PrintStream printStream) throws IOException, SignatureException {
        byte[] bArr = this.encoded;
        if (bArr == null) {
            throw new SignatureException(resource.getString(NO_SIGNED));
        }
        printStream.write(bArr);
    }

    public void removeExtKeyUsage(int[] iArr) {
        KeyPurposeId keyPurposeId = new KeyPurposeId(iArr);
        int i = 0;
        while (true) {
            Vector vector = this.e;
            if (i >= vector.size()) {
                return;
            }
            KeyPurposeId keyPurposeId2 = (KeyPurposeId) vector.elementAt(i);
            if (isEquals(keyPurposeId2, keyPurposeId)) {
                vector.remove(keyPurposeId2);
                return;
            }
            i++;
        }
    }

    public void removeExtension(Extension extension) {
        Asn1ObjectIdentifier asn1ObjectIdentifier;
        if (extension == null || (asn1ObjectIdentifier = extension.extnID) == null || Arrays.equals(asn1ObjectIdentifier.value, ALL_CertificateExtensionsValues.id_ce_keyUsage) || Arrays.equals(extension.extnID.value, ALL_CertificateExtensionsValues.id_ce_extKeyUsage)) {
            w511.q();
        } else {
            this.f.remove(extension);
        }
    }

    public void reset() {
        this.encoded = null;
        this.b = false;
        this.c = false;
        this.d = 3;
        this.e.clear();
        this.f.clear();
        this.a = createRequest();
    }

    public void setCriticalExtendedKeyUsages(boolean z) {
        this.m = z;
    }

    public void setKeyUsage(int i) {
        this.d = i;
    }

    public void setNeedCertificateBasicConstraints(boolean z) {
        this.l = z;
    }

    public void setNotAfterDate(Calendar calendar) {
        this.k = calendar;
    }

    public void setNotBeforeDate(Calendar calendar) {
        this.j = calendar;
    }

    public void setPublicKeyInfo(PublicKey publicKey) throws IOException, SignatureException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(publicKey.getEncoded());
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        this.g = subjectPublicKeyInfo;
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public void setPublicKeyInfoOLD(PublicKey publicKey) throws IOException, SignatureException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(publicKey.getEncoded());
        SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
        try {
            subjectPublicKeyInfo.decode(asn1BerDecodeBuffer);
            this.a.certificationRequestInfo.subjectPublicKeyInfo = new CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo();
            CertificationRequest_certificationRequestInfo_subjectPublicKeyInfo certificationRequest_certificationRequestInfo_subjectPublicKeyInfo = this.a.certificationRequestInfo.subjectPublicKeyInfo;
            certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.subjectPublicKey = subjectPublicKeyInfo.subjectPublicKey;
            certificationRequest_certificationRequestInfo_subjectPublicKeyInfo.algorithm = subjectPublicKeyInfo.algorithm;
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public void setSerialNumberAsHex(String str) {
        this.i = str;
    }

    public void setSubjectInfo(X500Name x500Name) throws IOException, SignatureException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(x500Name.getEncoded());
        RDNSequence rDNSequence = new RDNSequence();
        this.h = rDNSequence;
        try {
            rDNSequence.decode(asn1BerDecodeBuffer);
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public void setSubjectInfoOLD(String str) throws IOException, SignatureException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(new X500Name(str).getEncoded());
        this.a.certificationRequestInfo.subject = new Name();
        RDNSequence rDNSequence = new RDNSequence();
        try {
            rDNSequence.decode(asn1BerDecodeBuffer);
            this.a.certificationRequestInfo.subject.set_rdnSequence(rDNSequence);
        } catch (Asn1Exception e) {
            IOException iOException = new IOException(resource.getString(ASN_ERROR));
            iOException.initCause(e);
            throw iOException;
        }
    }

    public byte[] generateCertFromRequest(PrivateKey privateKey, X500Name x500Name) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(privateKey, (PublicKey) null, (X500Name) null, x500Name, (String) null);
    }

    public byte[] getEncodedSelfCert(KeyPair keyPair, String str, String str2) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return getEncodedSelfCert(keyPair, new X500Name(str), str2);
    }

    public byte[] getEncodedSelfCert(KeyPair keyPair, String str) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(keyPair.getPrivate(), keyPair.getPublic(), str, str);
    }

    public void removeExtKeyUsage(OID oid) {
        removeExtKeyUsage(oid.value);
    }

    public void removeExtKeyUsage(String str) {
        removeExtKeyUsage(new OID(str).value);
    }

    public void addExtKeyUsage(OID oid) {
        addExtKeyUsage(oid.value);
    }

    public void addExtKeyUsage(String str) {
        addExtKeyUsage(new OID(str).value);
    }

    public void setSubjectInfo(String str) throws IOException, SignatureException {
        if (this.encoded != null) {
            throw new SignatureException(resource.getString(IS_SIGNED));
        }
        setSubjectInfo(new X500Name(str));
    }

    public GostCertificateRequest() throws IOException {
        this.a = createRequest();
        this.encoded = null;
        this.b = false;
        this.c = false;
        this.d = 3;
        this.e = new Vector(0);
        this.f = new Vector(0);
        this.g = null;
        this.h = null;
        this.providerName = "JCP";
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = true;
        this.m = false;
        SelfTester_Auxiliary.checkClass(GostCertificateRequest.class);
        init(JCP.GOST_EL_DEGREE_NAME);
    }

    public static Extension createExtUsage(Vector vector) throws IOException {
        return createExtUsage(vector, false);
    }

    public static byte[] httpGetFile(String str, CAUser cAUser) throws Exception {
        return httpGetFile(str, cAUser, null);
    }

    public void encodeAndSign(PrivateKey privateKey) throws SignatureException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchProviderException {
        encodeAndSign(privateKey, null);
    }

    public void init(String str, boolean z) throws IOException {
        init(str, z, false);
    }

    public void init(String str) throws IOException {
        init(str, false);
    }

    public byte[] generateCert(PrivateKey privateKey, PublicKey publicKey, String str, String str2, String str3) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(privateKey, publicKey, new X500Name(str), new X500Name(str2), str3);
    }

    public byte[] generateCert(PrivateKey privateKey, PublicKey publicKey, String str, String str2) throws InvalidKeyException, IOException, SignatureException, NoSuchAlgorithmException, NoSuchProviderException {
        return generateCert(privateKey, publicKey, str, str2, (String) null);
    }
}
