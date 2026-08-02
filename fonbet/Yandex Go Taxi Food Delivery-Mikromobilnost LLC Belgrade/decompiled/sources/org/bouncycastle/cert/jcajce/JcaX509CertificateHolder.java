package org.bouncycastle.cert.jcajce;

import defpackage.h79;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: classes4.dex */
public class JcaX509CertificateHolder extends X509CertificateHolder {
    public JcaX509CertificateHolder(X509Certificate x509Certificate) {
        super(h79.m(x509Certificate.getEncoded()));
    }
}
