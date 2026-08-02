package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CertificatePolicyMap {
    private CertificatePolicyId issuerDomain;
    private CertificatePolicyId subjectDomain;

    public CertificatePolicyMap(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding for CertificatePolicyMap");
            throw null;
        }
        this.issuerDomain = new CertificatePolicyId(derValue.data.getDerValue());
        this.subjectDomain = new CertificatePolicyId(derValue.data.getDerValue());
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.issuerDomain.encode(derOutputStream2);
        this.subjectDomain.encode(derOutputStream2);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public CertificatePolicyId getIssuerIdentifier() {
        return this.issuerDomain;
    }

    public CertificatePolicyId getSubjectIdentifier() {
        return this.subjectDomain;
    }

    public String toString() {
        return "CertificatePolicyMap: [\nIssuerDomain:" + this.issuerDomain.toString() + "SubjectDomain:" + this.subjectDomain.toString() + "]\n";
    }

    public CertificatePolicyMap(CertificatePolicyId certificatePolicyId, CertificatePolicyId certificatePolicyId2) {
        this.issuerDomain = certificatePolicyId;
        this.subjectDomain = certificatePolicyId2;
    }
}
