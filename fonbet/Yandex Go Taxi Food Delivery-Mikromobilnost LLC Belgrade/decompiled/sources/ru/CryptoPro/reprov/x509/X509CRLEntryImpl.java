package ru.CryptoPro.reprov.x509;

import defpackage.quz;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.CRLReason;
import java.security.cert.X509CRLEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class X509CRLEntryImpl extends X509CRLEntry implements Comparable {
    private static final long YR_2050 = 2524636800000L;
    private static final boolean isExplicit = false;
    private javax.security.auth.x500.X500Principal certIssuer;
    private CRLExtensions extensions;
    private Date revocationDate;
    private byte[] revokedCert;
    private SerialNumber serialNumber;

    public X509CRLEntryImpl(byte[] bArr) throws CRLException {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        try {
            parse(new DerValue(bArr));
        } catch (IOException e) {
            this.revokedCert = null;
            quz.o("Parsing error: ", e);
            throw null;
        }
    }

    private byte[] getEncoded0() throws CRLException {
        if (this.revokedCert == null) {
            encode(new DerOutputStream());
        }
        return this.revokedCert;
    }

    public static CRLReason getRevocationReason(X509CRLEntry x509CRLEntry) {
        try {
            byte[] extensionValue = x509CRLEntry.getExtensionValue("2.5.29.21");
            if (extensionValue == null) {
                return null;
            }
            return new CRLReasonCodeExtension(Boolean.FALSE, new DerValue(extensionValue).getOctetString()).getReasonCode();
        } catch (IOException unused) {
            return null;
        }
    }

    private void parse(DerValue derValue) throws CRLException, IOException {
        Date generalizedTime;
        if (derValue.tag != 48) {
            throw new CRLException("Invalid encoded RevokedCertificate, starting sequence tag missing.");
        }
        if (derValue.data.available() == 0) {
            throw new CRLException("No data encoded for RevokedCertificates");
        }
        this.revokedCert = derValue.toByteArray();
        this.serialNumber = new SerialNumber(derValue.toDerInputStream().getDerValue());
        byte peekByte = (byte) derValue.data.peekByte();
        if (peekByte == 23) {
            generalizedTime = derValue.data.getUTCTime();
        } else {
            if (peekByte != 24) {
                throw new CRLException("Invalid encoding for revocation date");
            }
            generalizedTime = derValue.data.getGeneralizedTime();
        }
        this.revocationDate = generalizedTime;
        if (derValue.data.available() == 0) {
            return;
        }
        this.extensions = new CRLExtensions(derValue.toDerInputStream());
    }

    public static X509CRLEntryImpl toImpl(X509CRLEntry x509CRLEntry) throws CRLException {
        return x509CRLEntry instanceof X509CRLEntryImpl ? (X509CRLEntryImpl) x509CRLEntry : new X509CRLEntryImpl(x509CRLEntry.getEncoded());
    }

    @Override // java.lang.Comparable
    public int compareTo(X509CRLEntryImpl x509CRLEntryImpl) {
        int compareTo = getSerialNumber().compareTo(x509CRLEntryImpl.getSerialNumber());
        if (compareTo != 0) {
            return compareTo;
        }
        try {
            byte[] encoded0 = getEncoded0();
            byte[] encoded02 = x509CRLEntryImpl.getEncoded0();
            for (int i = 0; i < encoded0.length && i < encoded02.length; i++) {
                int i2 = encoded0[i] & 255;
                int i3 = encoded02[i] & 255;
                if (i2 != i3) {
                    return i2 - i3;
                }
            }
            return encoded0.length - encoded02.length;
        } catch (CRLException unused) {
            return -1;
        }
    }

    public void encode(DerOutputStream derOutputStream) throws CRLException {
        try {
            if (this.revokedCert == null) {
                DerOutputStream derOutputStream2 = new DerOutputStream();
                this.serialNumber.encode(derOutputStream2);
                long time = this.revocationDate.getTime();
                Date date = this.revocationDate;
                if (time < YR_2050) {
                    derOutputStream2.putUTCTime(date);
                } else {
                    derOutputStream2.putGeneralizedTime(date);
                }
                CRLExtensions cRLExtensions = this.extensions;
                if (cRLExtensions != null) {
                    cRLExtensions.encode(derOutputStream2, false);
                }
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.write((byte) 48, derOutputStream2);
                this.revokedCert = derOutputStream3.toByteArray();
            }
            derOutputStream.write(this.revokedCert);
        } catch (IOException e) {
            quz.o("Encoding error: ", e);
        }
    }

    public CertificateIssuerExtension getCertificateIssuerExtension() {
        return (CertificateIssuerExtension) getExtension(PKIXExtensions.CertificateIssuer_Id);
    }

    public javax.security.auth.x500.X500Principal getCertificateIssuerInternal() {
        return this.certIssuer;
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

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        return (byte[]) getEncoded0().clone();
    }

    public Extension getExtension(ObjectIdentifier objectIdentifier) {
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

    public Map getExtensions() {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return Collections.EMPTY_MAP;
        }
        Collection<Extension> allExtensions = cRLExtensions.getAllExtensions();
        TreeMap treeMap = new TreeMap();
        for (Extension extension : allExtensions) {
            treeMap.put(extension.getId(), extension);
        }
        return treeMap;
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

    public Integer getReasonCode() throws IOException {
        Extension extension = getExtension(PKIXExtensions.ReasonCode_Id);
        if (extension == null) {
            return null;
        }
        return (Integer) ((CRLReasonCodeExtension) extension).get(CRLReasonCodeExtension.REASON);
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return new Date(this.revocationDate.getTime());
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return this.serialNumber.getNumber();
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return this.extensions != null;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions == null) {
            return false;
        }
        return cRLExtensions.hasUnsupportedCriticalExtension();
    }

    public void setCertificateIssuer(javax.security.auth.x500.X500Principal x500Principal, javax.security.auth.x500.X500Principal x500Principal2) {
        if (x500Principal.equals(x500Principal2)) {
            this.certIssuer = null;
        } else {
            this.certIssuer = x500Principal2;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        String extension;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.serialNumber.toString());
        stringBuffer.append("  On: " + this.revocationDate.toString());
        if (this.certIssuer != null) {
            stringBuffer.append("\n    Certificate issuer: " + this.certIssuer);
        }
        CRLExtensions cRLExtensions = this.extensions;
        if (cRLExtensions != null) {
            Object[] array = cRLExtensions.getAllExtensions().toArray();
            stringBuffer.append("\n    CRL Entry Extensions: " + array.length);
            int i = 0;
            while (i < array.length) {
                StringBuilder sb = new StringBuilder("\n    [");
                int i2 = i + 1;
                sb.append(i2);
                sb.append("]: ");
                stringBuffer.append(sb.toString());
                Extension extension2 = (Extension) array[i];
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
                        i = i2;
                    }
                } else {
                    extension = extension2.toString();
                }
                stringBuffer.append(extension);
                i = i2;
            }
        }
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public X509CRLEntryImpl(BigInteger bigInteger, Date date, CRLExtensions cRLExtensions) {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        this.serialNumber = new SerialNumber(bigInteger);
        this.revocationDate = date;
        this.extensions = cRLExtensions;
    }

    public X509CRLEntryImpl(DerValue derValue) throws CRLException {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        try {
            parse(derValue);
        } catch (IOException e) {
            this.revokedCert = null;
            quz.o("Parsing error: ", e);
            throw null;
        }
    }

    @Override // java.security.cert.X509CRLEntry
    public CRLReason getRevocationReason() {
        Extension extension = getExtension(PKIXExtensions.ReasonCode_Id);
        if (extension == null) {
            return null;
        }
        return ((CRLReasonCodeExtension) extension).getReasonCode();
    }

    public X509CRLEntryImpl(BigInteger bigInteger, Date date) {
        this.serialNumber = null;
        this.revocationDate = null;
        this.extensions = null;
        this.revokedCert = null;
        this.serialNumber = new SerialNumber(bigInteger);
        this.revocationDate = date;
    }
}
