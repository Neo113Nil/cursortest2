package ru.CryptoPro.reprov.x509;

import defpackage.lt61;
import defpackage.ny61;
import defpackage.oq61;
import defpackage.oyr;
import defpackage.x4e;
import defpackage.zr61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.CryptoPro.reprov.utils.Cache;

/* loaded from: classes4.dex */
public class X509CRLImpl extends X509CRL implements lt61 {
    private static final long YR_2050 = 2524636800000L;
    private static final boolean isExplicit = true;
    private CRLExtensions extensions;
    private AlgorithmId infoSigAlgId;
    private X500Name issuer;
    private X500Principal issuerPrincipal;
    private Date nextUpdate;
    private boolean readOnly;
    private List revokedList;
    private Map revokedMap;
    private AlgorithmId sigAlgId;
    private byte[] signature;
    private byte[] signedCRL;
    private byte[] tbsCertList;
    private Date thisUpdate;
    private String verifiedProvider;
    private PublicKey verifiedPublicKey;
    private int version;

    public X509CRLImpl(X500Name x500Name, Date date, Date date2, X509CRLEntry[] x509CRLEntryArr) throws CRLException {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
        this.issuer = x500Name;
        this.thisUpdate = date;
        this.nextUpdate = date2;
        if (x509CRLEntryArr != null) {
            javax.security.auth.x500.X500Principal issuerX500Principal = getIssuerX500Principal();
            javax.security.auth.x500.X500Principal x500Principal = issuerX500Principal;
            for (X509CRLEntry x509CRLEntry : x509CRLEntryArr) {
                X509CRLEntryImpl x509CRLEntryImpl = (X509CRLEntryImpl) x509CRLEntry;
                try {
                    x500Principal = getCertIssuer(x509CRLEntryImpl, x500Principal);
                    x509CRLEntryImpl.setCertificateIssuer(issuerX500Principal, x500Principal);
                    this.revokedMap.put(new X509IssuerSerial(x500Principal, x509CRLEntryImpl.getSerialNumber()), x509CRLEntryImpl);
                    this.revokedList.add(x509CRLEntryImpl);
                    if (x509CRLEntryImpl.hasExtensions()) {
                        this.version = 1;
                    }
                } catch (IOException e) {
                    throw new CRLException(e);
                }
            }
        }
    }

    private javax.security.auth.x500.X500Principal getCertIssuer(X509CRLEntryImpl x509CRLEntryImpl, javax.security.auth.x500.X500Principal x500Principal) throws IOException {
        CertificateIssuerExtension certificateIssuerExtension = x509CRLEntryImpl.getCertificateIssuerExtension();
        return certificateIssuerExtension != null ? new javax.security.auth.x500.X500Principal(((X500Name) ((GeneralNames) certificateIssuerExtension.get("issuer")).get(0).getName()).asX500Principal().getEncoded()) : x500Principal;
    }

    public static byte[] getEncodedInternal(X509CRL x509crl) throws CRLException {
        return x509crl instanceof X509CRLImpl ? ((X509CRLImpl) x509crl).getEncodedInternal() : x509crl.getEncoded();
    }

    public static X500Principal getIssuerX500Principal(X509CRL x509crl) {
        try {
            DerInputStream derInputStream = new DerInputStream(x509crl.getEncoded()).getSequence(3)[0].data;
            if (((byte) derInputStream.peekByte()) == 2) {
                derInputStream.getDerValue();
            }
            derInputStream.getDerValue();
            return new X500Principal(derInputStream.getDerValue().toByteArray());
        } catch (Exception e) {
            ny61.n("Could not parse issuer", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parse(DerValue derValue) throws CRLException, IOException {
        Date generalizedTime;
        Date generalizedTime2;
        if (this.readOnly) {
            throw new CRLException("cannot over-write existing CRL");
        }
        if (derValue.getData() == null || derValue.tag != 48) {
            throw new CRLException("Invalid DER-encoded CRL data");
        }
        this.signedCRL = derValue.toByteArray();
        DerValue[] derValueArr = {derValue.data.getDerValue(), derValue.data.getDerValue(), derValue.data.getDerValue()};
        if (derValue.data.available() != 0) {
            throw new CRLException("signed overrun, bytes = " + derValue.data.available());
        }
        if (derValueArr[0].tag != 48) {
            throw new CRLException("signed CRL fields invalid");
        }
        this.sigAlgId = AlgorithmId.parse(derValueArr[1]);
        this.signature = derValueArr[2].getBitString();
        if (derValueArr[1].data.available() != 0) {
            throw new CRLException("AlgorithmId field overrun");
        }
        if (derValueArr[2].data.available() != 0) {
            throw new CRLException("Signature field overrun");
        }
        this.tbsCertList = derValueArr[0].toByteArray();
        DerInputStream derInputStream = derValueArr[0].data;
        this.version = 0;
        if (((byte) derInputStream.peekByte()) == 2) {
            int integer = derInputStream.getInteger();
            this.version = integer;
            if (integer != 1) {
                throw new CRLException("Invalid version");
            }
        }
        AlgorithmId parse = AlgorithmId.parse(derInputStream.getDerValue());
        if (!parse.equals(this.sigAlgId)) {
            throw new CRLException("Signature algorithm mismatch");
        }
        this.infoSigAlgId = parse;
        X500Name x500Name = new X500Name(derInputStream);
        this.issuer = x500Name;
        if (x500Name.isEmpty()) {
            throw new CRLException("Empty issuer DN not allowed in X509CRLs");
        }
        byte peekByte = (byte) derInputStream.peekByte();
        if (peekByte == 23) {
            generalizedTime = derInputStream.getUTCTime();
        } else {
            if (peekByte != 24) {
                throw new CRLException(oyr.j(peekByte, "Invalid encoding for thisUpdate (tag=", ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE));
            }
            generalizedTime = derInputStream.getGeneralizedTime();
        }
        this.thisUpdate = generalizedTime;
        if (derInputStream.available() == 0) {
            return;
        }
        byte peekByte2 = (byte) derInputStream.peekByte();
        if (peekByte2 != 23) {
            if (peekByte2 == 24) {
                generalizedTime2 = derInputStream.getGeneralizedTime();
            }
            if (derInputStream.available() != 0) {
                return;
            }
            byte peekByte3 = (byte) derInputStream.peekByte();
            if (peekByte3 == 48 && (peekByte3 & DerValue.TAG_PRIVATE) != 128) {
                DerValue[] sequence = derInputStream.getSequence(4);
                javax.security.auth.x500.X500Principal issuerX500Principal = getIssuerX500Principal();
                javax.security.auth.x500.X500Principal x500Principal = issuerX500Principal;
                for (DerValue derValue2 : sequence) {
                    X509CRLEntryImpl x509CRLEntryImpl = new X509CRLEntryImpl(derValue2);
                    x500Principal = getCertIssuer(x509CRLEntryImpl, x500Principal);
                    x509CRLEntryImpl.setCertificateIssuer(issuerX500Principal, x500Principal);
                    this.revokedMap.put(new X509IssuerSerial(x500Principal, x509CRLEntryImpl.getSerialNumber()), x509CRLEntryImpl);
                    this.revokedList.add(x509CRLEntryImpl);
                }
            }
            if (derInputStream.available() == 0) {
                return;
            }
            DerValue derValue3 = derInputStream.getDerValue();
            if (derValue3.isConstructed() && derValue3.isContextSpecific((byte) 0)) {
                this.extensions = new CRLExtensions(derValue3.data);
            }
            this.readOnly = true;
            return;
        }
        generalizedTime2 = derInputStream.getUTCTime();
        this.nextUpdate = generalizedTime2;
        if (derInputStream.available() != 0) {
        }
    }

    public static X509CRLImpl toImpl(X509CRL x509crl) throws CRLException {
        X509CRLImpl x509CRLImpl;
        if (x509crl instanceof X509CRLImpl) {
            return (X509CRLImpl) x509crl;
        }
        Cache cache = oq61.a;
        if (x509crl == null) {
            return null;
        }
        boolean z = x509crl instanceof X509CRLImpl;
        byte[] encodedInternal = z ? ((X509CRLImpl) x509crl).getEncodedInternal() : x509crl.getEncoded();
        Cache cache2 = oq61.b;
        try {
            cache2.readLock();
            Object obj = cache2.get(new zr61(encodedInternal));
            cache2.readUnlock();
            X509CRLImpl x509CRLImpl2 = (X509CRLImpl) obj;
            if (x509CRLImpl2 != null) {
                return x509CRLImpl2;
            }
            if (z) {
                x509CRLImpl = (X509CRLImpl) x509crl;
            } else {
                x509CRLImpl = new X509CRLImpl(encodedInternal);
                encodedInternal = x509CRLImpl.getEncodedInternal();
            }
            oq61.b(cache2, encodedInternal, x509CRLImpl);
            return x509CRLImpl;
        } catch (Throwable th) {
            cache2.readUnlock();
            throw th;
        }
    }

    @Override // defpackage.lt61
    public void derEncode(OutputStream outputStream) throws IOException {
        byte[] bArr = this.signedCRL;
        if (bArr != null) {
            outputStream.write((byte[]) bArr.clone());
        } else {
            ny61.v("Null CRL to encode");
        }
    }

    public void encodeInfo(OutputStream outputStream) throws CRLException {
        try {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            DerOutputStream derOutputStream3 = new DerOutputStream();
            int i = this.version;
            if (i != 0) {
                derOutputStream.putInteger(i);
            }
            this.infoSigAlgId.encode(derOutputStream);
            if (this.version == 0 && this.issuer.toString() == null) {
                throw new CRLException("Null Issuer DN not allowed in v1 CRL");
            }
            this.issuer.encode(derOutputStream);
            long time = this.thisUpdate.getTime();
            Date date = this.thisUpdate;
            if (time < YR_2050) {
                derOutputStream.putUTCTime(date);
            } else {
                derOutputStream.putGeneralizedTime(date);
            }
            Date date2 = this.nextUpdate;
            if (date2 != null) {
                long time2 = date2.getTime();
                Date date3 = this.nextUpdate;
                if (time2 < YR_2050) {
                    derOutputStream.putUTCTime(date3);
                } else {
                    derOutputStream.putGeneralizedTime(date3);
                }
            }
            if (!this.revokedList.isEmpty()) {
                Iterator it = this.revokedList.iterator();
                while (it.hasNext()) {
                    ((X509CRLEntryImpl) ((X509CRLEntry) it.next())).encode(derOutputStream2);
                }
                derOutputStream.write((byte) 48, derOutputStream2);
            }
            CRLExtensions cRLExtensions = this.extensions;
            if (cRLExtensions != null) {
                cRLExtensions.encode(derOutputStream, true);
            }
            derOutputStream3.write((byte) 48, derOutputStream);
            byte[] byteArray = derOutputStream3.toByteArray();
            this.tbsCertList = byteArray;
            outputStream.write(byteArray);
        } catch (IOException e) {
            throw new CRLException(x4e.d(e, new StringBuilder("Encoding error: ")));
        }
    }

    public KeyIdentifier getAuthKeyId() throws IOException {
        AuthorityKeyIdentifierExtension authKeyIdExtension = getAuthKeyIdExtension();
        if (authKeyIdExtension != null) {
            return (KeyIdentifier) authKeyIdExtension.get("key_id");
        }
        return null;
    }

    public AuthorityKeyIdentifierExtension getAuthKeyIdExtension() throws IOException {
        return (AuthorityKeyIdentifierExtension) getExtension(PKIXExtensions.AuthorityKey_Id);
    }

    public BigInteger getBaseCRLNumber() throws IOException {
        DeltaCRLIndicatorExtension deltaCRLIndicatorExtension = getDeltaCRLIndicatorExtension();
        if (deltaCRLIndicatorExtension != null) {
            return (BigInteger) deltaCRLIndicatorExtension.get("value");
        }
        return null;
    }

    public BigInteger getCRLNumber() throws IOException {
        CRLNumberExtension cRLNumberExtension = getCRLNumberExtension();
        if (cRLNumberExtension != null) {
            return (BigInteger) cRLNumberExtension.get("value");
        }
        return null;
    }

    public CRLNumberExtension getCRLNumberExtension() throws IOException {
        return (CRLNumberExtension) getExtension(PKIXExtensions.CRLNumber_Id);
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (this.extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Extension extension : this.extensions.getAllExtensions()) {
            if (extension.isCritical()) {
                hashSet.add(extension.getExtensionId().toString());
            }
        }
        return hashSet;
    }

    public DeltaCRLIndicatorExtension getDeltaCRLIndicatorExtension() throws IOException {
        return (DeltaCRLIndicatorExtension) getExtension(PKIXExtensions.DeltaCRLIndicator_Id);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        return (byte[]) getEncodedInternal().clone();
    }

    public Object getExtension(ObjectIdentifier objectIdentifier) {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return null;
        }
        return cRLExtensions.get(OIDMap.getName(objectIdentifier));
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        byte[] extensionValue;
        if (this.extensions == null) {
            return null;
        }
        try {
            String name = OIDMap.getName(new ObjectIdentifier(str));
            if (name == null) {
                ObjectIdentifier objectIdentifier = new ObjectIdentifier(str);
                Enumeration elements = this.extensions.getElements();
                while (true) {
                    if (!elements.hasMoreElements()) {
                        extension = null;
                        break;
                    }
                    extension = (Extension) elements.nextElement();
                    if (extension.getExtensionId().equals((Object) objectIdentifier)) {
                        break;
                    }
                }
            } else {
                extension = this.extensions.get(name);
            }
            if (extension == null || (extensionValue = extension.getExtensionValue()) == null) {
                return null;
            }
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putOctetString(extensionValue);
            return derOutputStream.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public IssuerAlternativeNameExtension getIssuerAltNameExtension() throws IOException {
        return (IssuerAlternativeNameExtension) getExtension(PKIXExtensions.IssuerAlternativeName_Id);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return this.issuer;
    }

    public X500Principal getIssuerX500PrincipalInternal() {
        if (this.issuerPrincipal == null) {
            this.issuerPrincipal = this.issuer.asX500Principal();
        }
        return this.issuerPrincipal;
    }

    public IssuingDistributionPointExtension getIssuingDistributionPointExtension() throws IOException {
        return (IssuingDistributionPointExtension) getExtension(PKIXExtensions.IssuingDistributionPoint_Id);
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        if (this.nextUpdate == null) {
            return null;
        }
        return new Date(this.nextUpdate.getTime());
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (this.extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Extension extension : this.extensions.getAllExtensions()) {
            if (!extension.isCritical()) {
                hashSet.add(extension.getExtensionId().toString());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        if (this.revokedMap.isEmpty()) {
            return null;
        }
        return (X509CRLEntry) this.revokedMap.get(new X509IssuerSerial(getIssuerX500Principal(), bigInteger));
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        if (this.revokedList.isEmpty()) {
            return null;
        }
        return new TreeSet(this.revokedList);
    }

    public AlgorithmId getSigAlgId() {
        return this.sigAlgId;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        AlgorithmId algorithmId = this.sigAlgId;
        if (algorithmId == null) {
            return null;
        }
        return algorithmId.getName();
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        AlgorithmId algorithmId = this.sigAlgId;
        if (algorithmId == null) {
            return null;
        }
        return algorithmId.getOID().toString();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        AlgorithmId algorithmId = this.sigAlgId;
        if (algorithmId == null) {
            return null;
        }
        try {
            return algorithmId.getEncodedParams();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        byte[] bArr = this.signature;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        byte[] bArr = this.tbsCertList;
        if (bArr == null) {
            throw new CRLException("Uninitialized CRL");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return new Date(this.thisUpdate.getTime());
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return this.version + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return false;
        }
        return cRLExtensions.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        if (this.revokedMap.isEmpty() || !(certificate instanceof X509Certificate)) {
            return false;
        }
        return this.revokedMap.containsKey(new X509IssuerSerial((X509Certificate) certificate));
    }

    public void sign(PrivateKey privateKey, String str, String str2) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            if (this.readOnly) {
                throw new CRLException("cannot over-write existing CRL");
            }
            if (str2 != null && str2.length() != 0) {
                signature = Signature.getInstance(str, str2);
                signature.initSign(privateKey);
                AlgorithmId algorithmId = AlgorithmId.get(signature.getAlgorithm());
                this.sigAlgId = algorithmId;
                this.infoSigAlgId = algorithmId;
                DerOutputStream derOutputStream = new DerOutputStream();
                DerOutputStream derOutputStream2 = new DerOutputStream();
                encodeInfo(derOutputStream2);
                this.sigAlgId.encode(derOutputStream2);
                byte[] bArr = this.tbsCertList;
                signature.update(bArr, 0, bArr.length);
                byte[] sign = signature.sign();
                this.signature = sign;
                derOutputStream2.putBitString(sign);
                derOutputStream.write((byte) 48, derOutputStream2);
                this.signedCRL = derOutputStream.toByteArray();
                this.readOnly = true;
            }
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
            AlgorithmId algorithmId2 = AlgorithmId.get(signature.getAlgorithm());
            this.sigAlgId = algorithmId2;
            this.infoSigAlgId = algorithmId2;
            DerOutputStream derOutputStream3 = new DerOutputStream();
            DerOutputStream derOutputStream22 = new DerOutputStream();
            encodeInfo(derOutputStream22);
            this.sigAlgId.encode(derOutputStream22);
            byte[] bArr2 = this.tbsCertList;
            signature.update(bArr2, 0, bArr2.length);
            byte[] sign2 = signature.sign();
            this.signature = sign2;
            derOutputStream22.putBitString(sign2);
            derOutputStream3.write((byte) 48, derOutputStream22);
            this.signedCRL = derOutputStream3.toByteArray();
            this.readOnly = true;
        } catch (IOException e) {
            throw new CRLException(x4e.d(e, new StringBuilder("Error while encoding data: ")));
        }
    }

    @Override // java.security.cert.CRL
    public String toString() {
        String str;
        String extension;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("X.509 CRL v");
        int i = 1;
        sb.append(this.version + 1);
        sb.append("\n");
        stringBuffer.append(sb.toString());
        if (this.sigAlgId != null) {
            stringBuffer.append("Signature Algorithm: " + this.sigAlgId.toString() + ", OID=" + this.sigAlgId.getOID().toString() + "\n");
        }
        if (this.issuer != null) {
            stringBuffer.append("Issuer: " + this.issuer.toString() + "\n");
        }
        if (this.thisUpdate != null) {
            stringBuffer.append("\nThis Update: " + this.thisUpdate.toString() + "\n");
        }
        if (this.nextUpdate != null) {
            stringBuffer.append("Next Update: " + this.nextUpdate.toString() + "\n");
        }
        if (this.revokedList.isEmpty()) {
            stringBuffer.append("\nNO certificates have been revoked\n");
        } else {
            stringBuffer.append("\nRevoked Certificates: " + this.revokedList.size());
            Iterator it = this.revokedList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("\n[" + i + "] " + ((X509CRLEntry) it.next()).toString());
                i++;
            }
        }
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions != null) {
            Object[] array = cRLExtensions.getAllExtensions().toArray();
            stringBuffer.append("\nCRL Extensions: " + array.length);
            int i2 = 0;
            while (i2 < array.length) {
                StringBuilder sb2 = new StringBuilder("\n[");
                int i3 = i2 + 1;
                sb2.append(i3);
                sb2.append("]: ");
                stringBuffer.append(sb2.toString());
                Extension extension2 = (Extension) array[i2];
                try {
                } catch (Exception unused) {
                    stringBuffer.append(", Error parsing this extension");
                }
                if (OIDMap.getClass(extension2.getExtensionId()) == null) {
                    stringBuffer.append(extension2.toString());
                    byte[] extensionValue = extension2.getExtensionValue();
                    if (extensionValue != null) {
                        DerOutputStream derOutputStream = new DerOutputStream();
                        derOutputStream.putOctetString(extensionValue);
                        byte[] byteArray = derOutputStream.toByteArray();
                        extension = "Extension unknown: DER encoded OCTET string =\n" + new Encoder().encodeBuffer(byteArray) + "\n";
                    } else {
                        i2 = i3;
                    }
                } else {
                    extension = extension2.toString();
                }
                stringBuffer.append(extension);
                i2 = i3;
            }
        }
        if (this.signature != null) {
            str = "\nSignature:\n" + new Encoder().encodeBuffer(this.signature) + "\n";
        } else {
            str = "NOT signed yet\n";
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public synchronized void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        if (str == null) {
            str = "";
        }
        try {
            PublicKey publicKey2 = this.verifiedPublicKey;
            if (publicKey2 != null && publicKey2.equals(publicKey) && str.equals(this.verifiedProvider)) {
                return;
            }
            if (this.signedCRL == null) {
                throw new CRLException("Uninitialized CRL");
            }
            int length = str.length();
            AlgorithmId algorithmId = this.sigAlgId;
            Signature signature = length == 0 ? Signature.getInstance(algorithmId.getName()) : Signature.getInstance(algorithmId.getName(), str);
            signature.initVerify(publicKey);
            byte[] bArr = this.tbsCertList;
            if (bArr == null) {
                throw new CRLException("Uninitialized CRL");
            }
            signature.update(bArr, 0, bArr.length);
            if (!signature.verify(this.signature)) {
                throw new SignatureException("Signature does not match.");
            }
            this.verifiedPublicKey = publicKey;
            this.verifiedProvider = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    final class X509IssuerSerial implements Comparable {
        volatile int hashcode;
        final javax.security.auth.x500.X500Principal issuer;
        final BigInteger serial;

        public X509IssuerSerial(X509Certificate x509Certificate) {
            this(x509Certificate.getIssuerX500Principal(), x509Certificate.getSerialNumber());
        }

        @Override // java.lang.Comparable
        public int compareTo(X509IssuerSerial x509IssuerSerial) {
            int compareTo = this.issuer.toString().compareTo(x509IssuerSerial.issuer.toString());
            return compareTo != 0 ? compareTo : this.serial.compareTo(x509IssuerSerial.serial);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof X509IssuerSerial)) {
                return false;
            }
            X509IssuerSerial x509IssuerSerial = (X509IssuerSerial) obj;
            return this.serial.equals(x509IssuerSerial.getSerial()) && this.issuer.equals(x509IssuerSerial.getIssuer());
        }

        public javax.security.auth.x500.X500Principal getIssuer() {
            return this.issuer;
        }

        public BigInteger getSerial() {
            return this.serial;
        }

        public int hashCode() {
            if (this.hashcode == 0) {
                this.hashcode = this.serial.hashCode() + ((this.issuer.hashCode() + 629) * 37);
            }
            return this.hashcode;
        }

        public X509IssuerSerial(javax.security.auth.x500.X500Principal x500Principal, BigInteger bigInteger) {
            this.hashcode = 0;
            this.issuer = x500Principal;
            this.serial = bigInteger;
        }
    }

    public byte[] getEncodedInternal() throws CRLException {
        byte[] bArr = this.signedCRL;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException("Null CRL to encode");
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(X509Certificate x509Certificate) {
        if (this.revokedMap.isEmpty()) {
            return null;
        }
        return (X509CRLEntry) this.revokedMap.get(new X509IssuerSerial(x509Certificate));
    }

    public X509CRLImpl(InputStream inputStream) throws CRLException {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
        try {
            parse(new DerValue(inputStream));
        } catch (IOException e) {
            this.signedCRL = null;
            throw new CRLException(x4e.d(e, new StringBuilder("Parsing error: ")));
        }
    }

    public X509CRLImpl(DerValue derValue) throws CRLException {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
        try {
            parse(derValue);
        } catch (IOException e) {
            this.signedCRL = null;
            throw new CRLException(x4e.d(e, new StringBuilder("Parsing error: ")));
        }
    }

    public X509CRLImpl(X500Name x500Name, Date date, Date date2) {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
        this.issuer = x500Name;
        this.thisUpdate = date;
        this.nextUpdate = date2;
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        verify(publicKey, "");
    }

    private X509CRLImpl() {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
    }

    public X509CRLImpl(X500Name x500Name, Date date, Date date2, X509CRLEntry[] x509CRLEntryArr, CRLExtensions cRLExtensions) throws CRLException {
        this(x500Name, date, date2, x509CRLEntryArr);
        if (cRLExtensions != null) {
            this.extensions = cRLExtensions;
            this.version = 1;
        }
    }

    public X509CRLImpl(byte[] bArr) throws CRLException {
        this.signedCRL = null;
        this.signature = null;
        this.tbsCertList = null;
        this.sigAlgId = null;
        this.issuer = null;
        this.issuerPrincipal = null;
        this.thisUpdate = null;
        this.nextUpdate = null;
        this.revokedMap = new TreeMap();
        this.revokedList = new LinkedList();
        this.extensions = null;
        this.readOnly = false;
        try {
            parse(new DerValue(bArr));
        } catch (IOException e) {
            this.signedCRL = null;
            throw new CRLException(x4e.d(e, new StringBuilder("Parsing error: ")));
        }
    }

    public void sign(PrivateKey privateKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        sign(privateKey, str, null);
    }
}
