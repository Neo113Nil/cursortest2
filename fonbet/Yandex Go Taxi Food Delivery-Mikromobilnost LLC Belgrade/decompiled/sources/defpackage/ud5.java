package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ud5 extends i79 {
    public final cg11 a;

    public ud5(cg11 cg11Var) {
        this.a = cg11Var;
    }

    public static boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!jl40.l(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.i79
    public final List a(List list, String str) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) unr0.k(1, arrayList);
            X509Certificate a = this.a.a(x509Certificate);
            if (a == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (b(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    quz.j(x509Certificate, "Failed to find a trusted cert that signed ");
                    return null;
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                arrayList.add(a);
            }
            if (b(a, a, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        quz.j(arrayList, "Certificate chain too long: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ud5) && jl40.l(((ud5) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
