package V1;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1830a;

    public b(X509Certificate... caCerts) {
        i.e(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i2 = 0;
        while (i2 < length) {
            X509Certificate x509Certificate = caCerts[i2];
            i2++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            i.d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f1830a = linkedHashMap;
    }

    @Override // V1.d
    public final X509Certificate a(X509Certificate cert) {
        i.e(cert, "cert");
        Set set = (Set) this.f1830a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && i.a(((b) obj).f1830a, this.f1830a));
    }

    public final int hashCode() {
        return this.f1830a.hashCode();
    }
}
