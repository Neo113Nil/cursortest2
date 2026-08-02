package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificateValidity implements CertAttrSet {
    public static final String IDENT = "x509.info.validity";
    public static final String NAME = "validity";
    public static final String NOT_AFTER = "notAfter";
    public static final String NOT_BEFORE = "notBefore";
    private static final long YR_2050 = 2524636800000L;
    private Date notAfter;
    private Date notBefore;

    public CertificateValidity(DerInputStream derInputStream) throws IOException {
        construct(derInputStream.getDerValue());
    }

    private void construct(DerValue derValue) throws IOException {
        Date generalizedTime;
        if (derValue.tag != 48) {
            ny61.v("Invalid encoded CertificateValidity, starting sequence tag missing.");
            return;
        }
        if (derValue.data.available() == 0) {
            ny61.v("No data encoded for CertificateValidity");
            return;
        }
        DerValue[] sequence = new DerInputStream(derValue.toByteArray()).getSequence(2);
        if (sequence.length != 2) {
            ny61.v("Invalid encoding for CertificateValidity");
            return;
        }
        byte b = sequence[0].tag;
        if (b == 23) {
            generalizedTime = derValue.data.getUTCTime();
        } else {
            if (b != 24) {
                ny61.v("Invalid encoding for CertificateValidity");
                return;
            }
            generalizedTime = derValue.data.getGeneralizedTime();
        }
        this.notBefore = generalizedTime;
        byte b2 = sequence[1].tag;
        if (b2 == 23) {
            this.notAfter = derValue.data.getUTCTime();
        } else if (b2 == 24) {
            this.notAfter = derValue.data.getGeneralizedTime();
        } else {
            ny61.v("Invalid encoding for CertificateValidity");
        }
    }

    private Date getNotAfter() {
        return new Date(this.notAfter.getTime());
    }

    private Date getNotBefore() {
        return new Date(this.notBefore.getTime());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            this.notBefore = null;
        } else if (str.equalsIgnoreCase(NOT_AFTER)) {
            this.notAfter = null;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateValidity.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        if (this.notBefore == null || this.notAfter == null) {
            ny61.v("CertAttrSet:CertificateValidity: null values to encode.\n");
            return;
        }
        DerOutputStream derOutputStream = new DerOutputStream();
        long time = this.notBefore.getTime();
        Date date = this.notBefore;
        if (time < YR_2050) {
            derOutputStream.putUTCTime(date);
        } else {
            derOutputStream.putGeneralizedTime(date);
        }
        long time2 = this.notAfter.getTime();
        Date date2 = this.notAfter;
        if (time2 < YR_2050) {
            derOutputStream.putUTCTime(date2);
        } else {
            derOutputStream.putGeneralizedTime(date2);
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.write((byte) 48, derOutputStream);
        outputStream.write(derOutputStream2.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            return getNotBefore();
        }
        if (str.equalsIgnoreCase(NOT_AFTER)) {
            return getNotAfter();
        }
        ny61.v("Attribute name not recognized by CertAttrSet: CertificateValidity.");
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
        return "validity";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Date)) {
            ny61.v("Attribute must be of type Date.");
            return;
        }
        if (str.equalsIgnoreCase(NOT_BEFORE)) {
            this.notBefore = (Date) obj;
        } else if (str.equalsIgnoreCase(NOT_AFTER)) {
            this.notAfter = (Date) obj;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet: CertificateValidity.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        if (this.notBefore == null || this.notAfter == null) {
            return "";
        }
        return "Validity: [From: " + this.notBefore.toString() + ",\n               To: " + this.notAfter.toString() + "]";
    }

    public void valid(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (this.notBefore.after(date)) {
            throw new CertificateNotYetValidException("NotBefore: " + this.notBefore.toString());
        }
        if (this.notAfter.before(date)) {
            throw new CertificateExpiredException("NotAfter: " + this.notAfter.toString());
        }
    }

    public CertificateValidity(Date date, Date date2) {
        this.notBefore = date;
        this.notAfter = date2;
    }

    public CertificateValidity() {
    }

    public void valid() throws CertificateNotYetValidException, CertificateExpiredException {
        valid(new Date());
    }
}
