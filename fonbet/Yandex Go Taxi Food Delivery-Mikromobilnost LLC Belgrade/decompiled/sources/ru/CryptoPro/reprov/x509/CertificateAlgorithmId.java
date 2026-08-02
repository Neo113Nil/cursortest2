package ru.CryptoPro.reprov.x509;

import defpackage.n;
import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificateAlgorithmId implements CertAttrSet {
    public static final String ALGORITHM = "algorithm";
    public static final String IDENT = "x509.info.algorithmID";
    public static final String NAME = "algorithmID";
    private AlgorithmId algId;

    public CertificateAlgorithmId(InputStream inputStream) throws IOException {
        this.algId = AlgorithmId.parse(new DerValue(inputStream));
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void delete(String str) throws IOException {
        if (str.equalsIgnoreCase("algorithm")) {
            this.algId = null;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void encode(OutputStream outputStream) throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        this.algId.encode(derOutputStream);
        outputStream.write(derOutputStream.toByteArray());
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Object get(String str) throws IOException {
        if (str.equalsIgnoreCase("algorithm")) {
            return this.algId;
        }
        ny61.v("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        return null;
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public Enumeration getElements() {
        return n.s("algorithm");
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String getName() {
        return "algorithmID";
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof AlgorithmId)) {
            ny61.v("Attribute must be of type AlgorithmId.");
        } else if (str.equalsIgnoreCase("algorithm")) {
            this.algId = (AlgorithmId) obj;
        } else {
            ny61.v("Attribute name not recognized by CertAttrSet:CertificateAlgorithmId.");
        }
    }

    @Override // ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        if (this.algId == null) {
            return "";
        }
        return this.algId.toString() + ", OID = " + this.algId.getOID().toString() + "\n";
    }

    public CertificateAlgorithmId(DerInputStream derInputStream) throws IOException {
        this.algId = AlgorithmId.parse(derInputStream.getDerValue());
    }

    public CertificateAlgorithmId(AlgorithmId algorithmId) {
        this.algId = algorithmId;
    }
}
