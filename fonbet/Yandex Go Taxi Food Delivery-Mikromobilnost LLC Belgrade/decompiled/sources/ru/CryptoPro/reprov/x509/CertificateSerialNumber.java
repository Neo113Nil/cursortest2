package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificateSerialNumber implements CertAttrSet {
    public static final String IDENT = "x509.info.serialNumber";
    public static final String NAME = "serialNumber";
    public static final String NUMBER = "number";
    private SerialNumber serial;

    public CertificateSerialNumber(int i) {
        this.serial = new SerialNumber(i);
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            this.serial = null;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.serial.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("number")) {
            return this.serial;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("number");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "serialNumber";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof SerialNumber)) {
            ny61.v("Attribute must be of type SerialNumber.");
        } else if (str.equalsIgnoreCase("number")) {
            this.serial = (SerialNumber) obj;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateSerialNumber.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        SerialNumber serialNumber = this.serial;
        return serialNumber == null ? "" : serialNumber.toString();
    }

    public CertificateSerialNumber(InputStream inputStream) throws IOException {
        this.serial = new SerialNumber(inputStream);
    }

    public CertificateSerialNumber(BigInteger bigInteger) {
        this.serial = new SerialNumber(bigInteger);
    }

    public CertificateSerialNumber(DerInputStream derInputStream) throws IOException {
        this.serial = new SerialNumber(derInputStream);
    }

    public CertificateSerialNumber(DerValue derValue) throws IOException {
        this.serial = new SerialNumber(derValue);
    }
}
