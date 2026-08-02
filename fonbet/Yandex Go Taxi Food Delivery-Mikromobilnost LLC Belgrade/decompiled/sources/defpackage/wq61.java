package defpackage;

import java.security.AlgorithmConstraints;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class wq61 extends qw61 {
    public final HashSet f;

    public wq61(String str) {
        super("LIBSSPI", str);
        this.f = new HashSet();
    }

    @Override // defpackage.qw61
    public final Collection b() {
        return this.f;
    }

    @Override // defpackage.qw61
    public final X509Certificate[] c(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, Object obj) {
        return x509CertificateArr;
    }
}
