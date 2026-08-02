package ru.CryptoPro.AdES.tools.revocation.impl;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.revocation.RevocationURL;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ResponderRevocationURLStrategy extends SingleRevocationURLStrategy {
    public static final String OCSP_RESPONDER_URL = GetProperty.getStringProperty("ru.CryptoPro.AdES.ocsp.responderURL", null);
    public static final String OCSP_RESPONDER_ISSUER = GetProperty.getStringProperty("ru.CryptoPro.AdES.ocsp.responderCertIssuerName", null);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.CryptoPro.AdES.tools.revocation.impl.SingleRevocationURLStrategy, ru.CryptoPro.AdES.tools.revocation.template.RevocationURLStrategy
    public RevocationURL get(ValidatingData validatingData) throws AdESException {
        String str = OCSP_RESPONDER_URL;
        if (str == null || str.isEmpty()) {
            return null;
        }
        X509Certificate certificate = validatingData.getCertificate();
        String str2 = OCSP_RESPONDER_ISSUER;
        boolean z = str2 == null || str2.isEmpty();
        if (!z) {
            try {
                z = new X500Principal(str2).equals(certificate.getIssuerX500Principal());
            } catch (Exception e) {
                JCPLogger.thrown(e);
            }
        }
        if (z) {
            return new DefaultRevocationURL(OCSP_RESPONDER_URL);
        }
        return null;
    }
}
