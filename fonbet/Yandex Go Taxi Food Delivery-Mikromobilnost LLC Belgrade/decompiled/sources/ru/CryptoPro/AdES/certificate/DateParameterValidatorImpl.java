package ru.CryptoPro.AdES.certificate;

import defpackage.vfc;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class DateParameterValidatorImpl implements BaseParameterValidator<X509Certificate> {
    protected final Date checkDate;

    public DateParameterValidatorImpl(Date date) {
        this.checkDate = date == null ? Calendar.getInstance().getTime() : date;
    }

    @Override // ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(X509Certificate x509Certificate) throws AdESException {
        JCPLogger.subEnter();
        try {
            x509Certificate.checkValidity(this.checkDate);
            JCPLogger.subExit();
        } catch (CertificateExpiredException e) {
            StringBuilder sb = new StringBuilder("Certificate sn: ");
            vfc.B(x509Certificate, 16, sb, ", subject: ", ", issuer: ");
            sb.append(", not before: ");
            sb.append(x509Certificate.getNotBefore());
            sb.append(", not after: ");
            sb.append(x509Certificate.getNotAfter());
            sb.append(" expired at ");
            sb.append(this.checkDate);
            sb.append(Extension.DOT_CHAR);
            throw new AdESException(sb.toString(), e, IAdESException.ecCertificateExpiredOrNotYetValid);
        } catch (CertificateNotYetValidException e2) {
            StringBuilder sb2 = new StringBuilder("Certificate sn: ");
            vfc.B(x509Certificate, 16, sb2, ", subject: ", ", issuer: ");
            sb2.append(", not before: ");
            sb2.append(x509Certificate.getNotBefore());
            sb2.append(", not after: ");
            sb2.append(x509Certificate.getNotAfter());
            sb2.append(" not yet valid at ");
            sb2.append(this.checkDate);
            sb2.append(Extension.DOT_CHAR);
            throw new AdESException(sb2.toString(), e2, IAdESException.ecCertificateExpiredOrNotYetValid);
        }
    }
}
