package w8;

import com.bumptech.glide.e;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a extends e {
    public final d i;

    public a(d trustRootIndex) {
        h.e(trustRootIndex, "trustRootIndex");
        this.i = trustRootIndex;
    }

    public static boolean o(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!h.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.bumptech.glide.e
    public final List a(String hostname, List chain) {
        h.e(chain, "chain");
        h.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        h.d(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a9 = this.i.a(x509Certificate);
            if (a9 == null) {
                Iterator it = arrayDeque.iterator();
                h.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    h.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (o(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z3) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a9)) {
                arrayList.add(a9);
            }
            if (o(a9, a9, arrayList.size() - 2)) {
                return arrayList;
            }
            z3 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && h.a(((a) obj).i, this.i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
