package defpackage;

import java.security.cert.CertificateException;

/* loaded from: classes5.dex */
public final class ea4 extends CertificateException {
    public final int a;

    public ea4(int i) {
        super("Certificate chain is not trusted: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "TRANSIENT_FAILURE" : "UNTRUSTED_ROOT" : "TRUSTED"));
        this.a = i;
    }
}
