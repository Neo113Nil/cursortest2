package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class rj {
    private CertificateFactory get;

    public rj() {
        try {
            this.get = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            a$$ExternalSyntheticBUOutline0.m("Couldn't find X.509 CertificateFactory!?!", e);
            throw null;
        }
    }

    public static rj get(String str) {
        if (str == null) {
            return new rj();
        }
        try {
            return new rj(str);
        } catch (NoSuchProviderException e) {
            throw new ro(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Provider ", str, " not found when creating X509Util."), e);
        }
    }

    public X509Certificate initialize(String str) {
        try {
            return (X509Certificate) this.get.generateCertificate(new ByteArrayInputStream(op.getWarnings(str)));
        } catch (CertificateException e) {
            JWK$$ExternalSyntheticBUOutline0.m("Unable to convert ", (Object) str, (Object) " value to X509Certificate: ", (Throwable) e);
            return null;
        }
    }

    public rj(String str) {
        try {
            this.get = CertificateFactory.getInstance("X.509", str);
        } catch (CertificateException e) {
            a$$ExternalSyntheticBUOutline0.m("Couldn't find X.509 CertificateFactory!?!", e);
            throw null;
        }
    }

    public String initialize(X509Certificate x509Certificate) {
        try {
            return op.initialize(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e) {
            a$$ExternalSyntheticBUOutline0.m("Unexpected problem getting encoded certificate.", e);
            return null;
        }
    }
}
