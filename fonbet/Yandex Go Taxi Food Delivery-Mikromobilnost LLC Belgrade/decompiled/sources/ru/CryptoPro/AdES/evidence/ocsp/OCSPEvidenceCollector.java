package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.he5;
import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.AbstractEvidenceSingleCollector;
import ru.CryptoPro.AdES.evidence.Evidence;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public abstract class OCSPEvidenceCollector extends AbstractEvidenceSingleCollector<he5> implements SignatureOptions {
    protected Options options = null;

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidenceSingleCollector, ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public abstract /* synthetic */ Evidence make(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException;

    @Override // ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.options = options;
    }
}
