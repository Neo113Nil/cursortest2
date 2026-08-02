package ru.CryptoPro.AdES.certificate;

import defpackage.m4f0;
import defpackage.o2;
import defpackage.pc51;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class PKUPParameterValidatorImpl extends DateParameterValidatorImpl {
    private final Set<X509Certificate> excludedCerts;

    public PKUPParameterValidatorImpl(Date date, Set<X509Certificate> set) {
        super(date);
        HashSet hashSet = new HashSet();
        this.excludedCerts = hashSet;
        if (set != null) {
            hashSet.addAll(set);
        }
    }

    @Override // ru.CryptoPro.AdES.certificate.DateParameterValidatorImpl, ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(X509Certificate x509Certificate) throws AdESException {
        JCPLogger.subEnter();
        if (this.excludedCerts.contains(x509Certificate)) {
            return;
        }
        try {
            o2 extensionValue = AdESUtility.getExtensionValue(x509Certificate, pc51.d.a);
            if (extensionValue != null) {
                m4f0 m = m4f0.m(extensionValue);
                Date y = m.a.y();
                Date y2 = m.b.y();
                JCPLogger.fineFormat("Certificate:\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tprivate key usage period not before: {3} not after: {4}\n\tcheck date: {5}", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), y, y2, this.checkDate);
                if ((!this.checkDate.after(y) && !this.checkDate.equals(y)) || (!this.checkDate.before(y2) && !this.checkDate.equals(y2))) {
                    throw new AdESException("PKUP of the certificate: sn " + x509Certificate.getSerialNumber().toString(16) + ", subject " + x509Certificate.getSubjectDN() + ", issuer " + x509Certificate.getIssuerDN() + " expired or not yet valid", IAdESException.ecSignaturePrivateKeyUsagePeriodExpiredOrNotYetValid);
                }
                JCPLogger.fineFormat("PKUP status of the certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tstatus: VALID usage period.", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
            }
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecInternal);
        } catch (ParseException e2) {
            throw new AdESException(e2, IAdESException.ecInternal);
        }
    }
}
