package ru.CryptoPro.reprov.x509;

import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class CertificatePolicyId {
    private ObjectIdentifier id;

    public CertificatePolicyId(DerValue derValue) throws IOException {
        this.id = derValue.getOID();
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOID(this.id);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePolicyId) {
            return this.id.equals((Object) ((CertificatePolicyId) obj).getIdentifier());
        }
        return false;
    }

    public ObjectIdentifier getIdentifier() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "CertificatePolicyId: [" + this.id.toString() + "]\n";
    }

    public CertificatePolicyId(ObjectIdentifier objectIdentifier) {
        this.id = objectIdentifier;
    }
}
