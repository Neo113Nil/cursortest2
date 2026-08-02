package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class PrivateKeyUsageExtension extends Extension implements CertAttrSet {
    public static final String IDENT = "x509.info.extensions.PrivateKeyUsage";
    public static final String NAME = "PrivateKeyUsage";
    public static final String NOT_AFTER = "not_after";
    public static final String NOT_BEFORE = "not_before";
    private static final byte TAG_AFTER = 1;
    private static final byte TAG_BEFORE = 0;
    private Date notAfter;
    private Date notBefore;

    public PrivateKeyUsageExtension(Boolean bool, Object obj) throws CertificateException, IOException {
        this.notBefore = null;
        this.notAfter = null;
        this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
        this.critical = bool.booleanValue();
        byte[] bArr = (byte[]) obj;
        this.extensionValue = bArr;
        for (DerValue derValue : new DerInputStream(bArr).getSequence(2)) {
            if (!derValue.isContextSpecific((byte) 0) || derValue.isConstructed()) {
                if (!derValue.isContextSpecific((byte) 1) || derValue.isConstructed()) {
                    ny61.v("Invalid encoding of PrivateKeyUsageExtension");
                    throw null;
                }
                if (this.notAfter != null) {
                    throw new CertificateParsingException("Duplicate notAfter in PrivateKeyUsage.");
                }
                derValue.resetTag((byte) 24);
                this.notAfter = new DerInputStream(derValue.toByteArray()).getGeneralizedTime();
            } else {
                if (this.notBefore != null) {
                    throw new CertificateParsingException("Duplicate notBefore in PrivateKeyUsage.");
                }
                derValue.resetTag((byte) 24);
                this.notBefore = new DerInputStream(derValue.toByteArray()).getGeneralizedTime();
            }
        }
    }

    private void encodeThis() throws IOException {
        byte[] byteArray;
        if (this.notBefore == null && this.notAfter == null) {
            byteArray = null;
        } else {
            DerOutputStream derOutputStream = new DerOutputStream();
            DerOutputStream derOutputStream2 = new DerOutputStream();
            if (this.notBefore != null) {
                DerOutputStream derOutputStream3 = new DerOutputStream();
                derOutputStream3.putGeneralizedTime(this.notBefore);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 0), derOutputStream3);
            }
            if (this.notAfter != null) {
                DerOutputStream derOutputStream4 = new DerOutputStream();
                derOutputStream4.putGeneralizedTime(this.notAfter);
                derOutputStream2.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream4);
            }
            derOutputStream.write((byte) 48, derOutputStream2);
            byteArray = derOutputStream.toByteArray();
        }
        this.extensionValue = byteArray;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws CertificateException, IOException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            this.notBefore = null;
        } else {
            if (!str.equalsIgnoreCase(NOT_AFTER)) {
                w511.y("Attribute name not recognized by CertAttrSet:PrivateKeyUsage.");
                return;
            }
            this.notAfter = null;
        }
        encodeThis();
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, java.security.cert.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        if (this.extensionValue == null) {
            this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
            this.critical = false;
            encodeThis();
        }
        super.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws CertificateException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            return new Date(this.notBefore.getTime());
        }
        if (str.equalsIgnoreCase(NOT_AFTER)) {
            return new Date(this.notAfter.getTime());
        }
        w511.y("Attribute name not recognized by CertAttrSet:PrivateKeyUsage.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        attributeNameEnumeration.addElement(NOT_BEFORE);
        attributeNameEnumeration.addElement(NOT_AFTER);
        return attributeNameEnumeration.elements();
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return NAME;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws CertificateException, IOException {
        String str2;
        if (obj instanceof Date) {
            if (str.equalsIgnoreCase(NOT_BEFORE)) {
                this.notBefore = (Date) obj;
            } else if (str.equalsIgnoreCase(NOT_AFTER)) {
                this.notAfter = (Date) obj;
            } else {
                str2 = "Attribute name not recognized by CertAttrSet:PrivateKeyUsage.";
            }
            encodeThis();
            return;
        }
        str2 = "Attribute must be of type Date.";
        w511.y(str2);
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("PrivateKeyUsage: [\n");
        String str2 = "";
        if (this.notBefore == null) {
            str = "";
        } else {
            str = "From: " + this.notBefore.toString() + ru.CryptoPro.JCP.tools.CertReader.Extension.FIX_SPACE;
        }
        sb.append(str);
        if (this.notAfter != null) {
            str2 = "To: " + this.notAfter.toString();
        }
        return oyr.t(sb, str2, "]\n");
    }

    public void valid(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (this.notBefore.after(date)) {
            throw new CertificateNotYetValidException("NotBefore: " + this.notBefore.toString());
        }
        if (this.notAfter.before(date)) {
            throw new CertificateExpiredException("NotAfter: " + this.notAfter.toString());
        }
    }

    public void valid() throws CertificateNotYetValidException, CertificateExpiredException {
        valid(new Date());
    }

    public PrivateKeyUsageExtension(Date date, Date date2) throws IOException {
        this.notBefore = date;
        this.notAfter = date2;
        this.extensionId = PKIXExtensions.PrivateKeyUsage_Id;
        this.critical = false;
        encodeThis();
    }
}
