package kotlin.text;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class CatchingFishRoomUnitTesting implements CatchingFishRealmEspresso {
    public final LinkedHashMap CatchingFishParcelableFAB = new LinkedHashMap();

    public CatchingFishRoomUnitTesting(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.CatchingFishParcelableFAB.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.CatchingFishParcelableFAB.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // kotlin.text.CatchingFishRealmEspresso
    public final X509Certificate CatchingFishParcelableFAB(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.CatchingFishParcelableFAB.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CatchingFishRoomUnitTesting) && ((CatchingFishRoomUnitTesting) obj).CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode();
    }
}
