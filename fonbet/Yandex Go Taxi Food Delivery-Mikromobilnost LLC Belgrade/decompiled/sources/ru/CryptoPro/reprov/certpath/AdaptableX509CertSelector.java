package ru.CryptoPro.reprov.certpath;

import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes4.dex */
class AdaptableX509CertSelector extends java.security.cert.X509CertSelector {
    public Date a;
    public Date b;

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public Object clone() {
        AdaptableX509CertSelector adaptableX509CertSelector = (AdaptableX509CertSelector) super.clone();
        Date date = this.a;
        if (date != null) {
            adaptableX509CertSelector.a = (Date) date.clone();
        }
        Date date2 = this.b;
        if (date2 != null) {
            adaptableX509CertSelector.b = (Date) date2.clone();
        }
        return adaptableX509CertSelector;
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (x509Certificate.getVersion() < 3) {
            Date date = this.a;
            if (date != null) {
                try {
                    x509Certificate.checkValidity(date);
                } catch (CertificateException unused) {
                    return false;
                }
            }
            Date date2 = this.b;
            if (date2 != null) {
                try {
                    x509Certificate.checkValidity(date2);
                } catch (CertificateException unused2) {
                    return false;
                }
            }
        }
        return super.match(certificate);
    }
}
