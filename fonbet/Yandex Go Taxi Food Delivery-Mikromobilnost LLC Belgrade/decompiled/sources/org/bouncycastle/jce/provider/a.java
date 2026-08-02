package org.bouncycastle.jce.provider;

import defpackage.ayo;
import defpackage.s0x;
import defpackage.w2;
import java.security.cert.X509CRL;

/* loaded from: classes4.dex */
public abstract class a extends X509CRL {
    public static boolean a(X509CRL x509crl) {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(ayo.F.a);
            if (extensionValue != null) {
                return s0x.n(w2.x(extensionValue).a).x;
            }
            return false;
        } catch (Exception e) {
            ExtCRLException extCRLException = new ExtCRLException("Exception reading IssuingDistributionPoint");
            extCRLException.cause = e;
            throw extCRLException;
        }
    }
}
