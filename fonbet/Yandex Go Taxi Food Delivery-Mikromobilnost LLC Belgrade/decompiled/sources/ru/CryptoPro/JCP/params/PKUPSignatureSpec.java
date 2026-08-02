package ru.CryptoPro.JCP.params;

import com.objsys.asn1j.runtime.Asn1DerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class PKUPSignatureSpec implements PKUPSignatureInterface {
    public static final ResourceBundle c = ResourceBundle.getBundle(InternalGostPrivateKey.BUNDLE_NAME, Locale.getDefault());
    public final int a;
    public final int b;

    public PKUPSignatureSpec(int i, int i2) throws InvalidParameterException {
        this.a = 15;
        this.b = 2;
        if (i <= 0) {
            throw new InvalidParameterException(c.getString("PKUPSpecNullDate"));
        }
        this.a = i;
        this.b = i2;
    }

    public static Extension DEFAULT_PK_UP_EXT_EXC() {
        try {
            return a(PKUPSignatureInterface.PK_UP_OID_EXC, 15, 2);
        } catch (Exception e) {
            JCPLogger.thrown(e);
            return null;
        }
    }

    public static Extension DEFAULT_PK_UP_EXT_SIG() {
        try {
            return a(PKUPSignatureInterface.PK_UP_OID_SIG, 15, 2);
        } catch (Exception e) {
            JCPLogger.thrown(e);
            return null;
        }
    }

    public static Extension a(OID oid, int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar.add(i2, i);
        calendar2.add(2, 15);
        if (calendar.toInstant().getEpochSecond() > calendar2.toInstant().getEpochSecond()) {
            throw new InvalidParameterException(c.getString("PKUPSpecInvalidDate"));
        }
        Asn1GeneralizedTime asn1GeneralizedTime = new Asn1GeneralizedTime();
        try {
            asn1GeneralizedTime.setTime(calendar);
            PrivateKeyUsagePeriod privateKeyUsagePeriod = new PrivateKeyUsagePeriod((Asn1GeneralizedTime) null, asn1GeneralizedTime);
            Asn1DerEncodeBuffer asn1DerEncodeBuffer = new Asn1DerEncodeBuffer();
            try {
                privateKeyUsagePeriod.encode(asn1DerEncodeBuffer);
                return new Extension(oid.value, false, asn1DerEncodeBuffer.getMsgCopy());
            } catch (Asn1Exception e) {
                InvalidParameterException invalidParameterException = new InvalidParameterException();
                invalidParameterException.initCause(e);
                throw invalidParameterException;
            }
        } catch (Asn1Exception e2) {
            InvalidParameterException invalidParameterException2 = new InvalidParameterException();
            invalidParameterException2.initCause(e2);
            throw invalidParameterException2;
        }
    }

    @Override // ru.CryptoPro.JCP.params.PKUPSignatureInterface
    public Extension getExchangePKUPExtension() throws InvalidParameterException {
        return a(PKUPSignatureInterface.PK_UP_OID_EXC, this.a, this.b);
    }

    @Override // ru.CryptoPro.JCP.params.PKUPSignatureInterface
    public Extension getSignaturePKUPExtension() throws InvalidParameterException {
        return a(PKUPSignatureInterface.PK_UP_OID_SIG, this.a, this.b);
    }
}
