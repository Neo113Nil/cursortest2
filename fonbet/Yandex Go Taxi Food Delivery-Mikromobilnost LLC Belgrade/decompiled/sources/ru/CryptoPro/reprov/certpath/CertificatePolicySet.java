package ru.CryptoPro.reprov.certpath;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.x509.CertificatePolicyId;

/* loaded from: classes4.dex */
public class CertificatePolicySet {
    public final Vector a;

    public CertificatePolicySet(DerInputStream derInputStream) throws IOException {
        this.a = new Vector();
        for (DerValue derValue : derInputStream.getSequence(5)) {
            this.a.addElement(new CertificatePolicyId(derValue));
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        int i = 0;
        while (true) {
            Vector vector = this.a;
            if (i >= vector.size()) {
                derOutputStream.write((byte) 48, derOutputStream2);
                return;
            } else {
                ((CertificatePolicyId) vector.elementAt(i)).encode(derOutputStream2);
                i++;
            }
        }
    }

    public List getCertPolicyIds() {
        return Collections.unmodifiableList(this.a);
    }

    public String toString() {
        return "CertificatePolicySet:[\n" + this.a.toString() + "]\n";
    }

    public CertificatePolicySet(Vector vector) {
        this.a = vector;
    }
}
