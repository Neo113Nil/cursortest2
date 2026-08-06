package V1;

import R1.l;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: i, reason: collision with root package name */
    public final d f1829i;

    public a(d trustRootIndex) {
        i.e(trustRootIndex, "trustRootIndex");
        this.f1829i = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i.a(((a) obj).f1829i, this.f1829i);
    }

    @Override // R1.l
    public final List f(String hostname, List chain) {
        i.e(chain, "chain");
        i.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < 9) {
            i2++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a2 = this.f1829i.a(x509Certificate);
            if (a2 == null) {
                Iterator it = arrayDeque.iterator();
                i.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (i.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(i.h(x509Certificate, "Failed to find a trusted cert that signed "));
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                arrayList.add(a2);
            }
            if (i.a(a2.getIssuerDN(), a2.getSubjectDN())) {
                try {
                    a2.verify(a2.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException(i.h(arrayList, "Certificate chain too long: "));
    }

    public final int hashCode() {
        return this.f1829i.hashCode();
    }
}
