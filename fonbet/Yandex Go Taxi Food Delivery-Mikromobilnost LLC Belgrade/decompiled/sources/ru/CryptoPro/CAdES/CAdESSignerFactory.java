package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.fr61;
import defpackage.jx61;
import defpackage.mr61;
import defpackage.rx61;
import defpackage.ws61;
import defpackage.xx61;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerFactory extends CAdESType {
    public static CAdESSignerPKCS7Impl a(acs0 acs0Var, Integer num) {
        if (num == null) {
            num = CAdESType.getCAdESSignatureType(acs0Var);
        }
        JCPLogger.fine("New signer with type: " + CAdESType.getSignatureTypeName(num));
        Integer num2 = CAdESParameters.PKCS7;
        if (num.equals(num2)) {
            return new CAdESSignerPKCS7Impl(acs0Var, num2);
        }
        if (num.equals(CAdESParameters.CAdES_T)) {
            return new CAdESSignerTImpl(acs0Var, false);
        }
        if (num.equals(CAdESParameters.CAdES_C)) {
            throw new CAdESException("Unsupported signature type CAdES-C", IAdESException.ecSignatureUnsupported);
        }
        if (num.equals(CAdESParameters.CAdES_X_Long_Type_1)) {
            return new CAdESSignerXLT1Impl(acs0Var, false);
        }
        if (num.equals(CAdESParameters.CAdES_A)) {
            return new CAdESSignerAImpl(acs0Var, false);
        }
        Integer num3 = AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
        if (num.equals(num3)) {
            return new mr61(acs0Var, num3);
        }
        if (num.equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP)) {
            return new xx61(acs0Var);
        }
        Integer num4 = AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE;
        if (num.equals(num4)) {
            return new ws61(acs0Var, num4);
        }
        if (num.equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
            return new jx61(acs0Var);
        }
        Integer num5 = AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE;
        if (num.equals(num5)) {
            return new fr61(acs0Var, num5);
        }
        Integer num6 = AdESParameters.TSA_CAdESC_TIME_STAMP;
        if (num.equals(num6)) {
            return new rx61(acs0Var, num6);
        }
        if (num.equals(CAdESParameters.CAdES_BES)) {
            return new CAdESSignerBESImpl(acs0Var);
        }
        throw new CAdESException("Unknown signature type: " + num, IAdESException.ecSignatureUnsupported);
    }
}
