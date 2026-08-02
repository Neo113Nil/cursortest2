package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.b490;
import defpackage.m8z0;
import defpackage.vc3;
import defpackage.xc3;
import java.util.HashMap;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;

/* loaded from: classes4.dex */
public class CAdESType implements CAdESParameters {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(CAdESParameters.CAdES_Unknown, "Unknown signature type");
        hashMap.put(CAdESParameters.CAdES_BES, "CAdES-BES");
        hashMap.put(CAdESParameters.CAdES_X_Long_Type_1, "CAdES-X Long Type 1");
        hashMap.put(CAdESParameters.CAdES_T, "CAdES-T");
        hashMap.put(CAdESParameters.CAdES_C, "CAdES-C (internal)");
        hashMap.put(AdESParameters.TSA_SIGNATURE_TIME_STAMP, "Enhanced signature timestamp (internal)");
        hashMap.put(AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE, "CAdES-C timestamp (internal)");
        hashMap.put(AdESParameters.TSA_CAdESC_TIME_STAMP, "Enhanced CAdES-C timestamp (internal)");
        hashMap.put(CAdESParameters.PKCS7, "PKCS7");
        hashMap.put(AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE, "Signature timestamp (internal)");
        hashMap.put(AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE, "Archive signature timestamp");
        hashMap.put(AdESParameters.TSA_ARCHIVE_TIME_STAMP, "Enhanced archive signature timestamp");
    }

    public static Integer getCAdESSignatureType(acs0 acs0Var) throws CAdESException {
        xc3 signedAttributes = acs0Var.getSignedAttributes();
        if (signedAttributes == null) {
            return CAdESParameters.PKCS7;
        }
        vc3 singleAttribute = CAdESUtility.getSingleAttribute(signedAttributes, b490.I3);
        if (singleAttribute == null && (singleAttribute = CAdESUtility.getSingleAttribute(signedAttributes, b490.G3)) == null) {
            singleAttribute = CAdESUtility.getSingleAttribute(signedAttributes, b490.Q3);
        }
        vc3 singleAttribute2 = CAdESUtility.getSingleAttribute(signedAttributes, b490.u3);
        if (singleAttribute == null || singleAttribute2 == null) {
            return CAdESParameters.PKCS7;
        }
        xc3 unsignedAttributes = acs0Var.getUnsignedAttributes();
        if (unsignedAttributes == null) {
            return CAdESParameters.CAdES_BES;
        }
        vc3 singleAttribute3 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.J3);
        vc3 singleAttribute4 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.K3);
        vc3 singleAttribute5 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.L3);
        vc3 singleAttribute6 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.M3);
        vc3 singleAttribute7 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.O3);
        vc3 singleAttribute8 = CAdESUtility.getSingleAttribute(unsignedAttributes, b490.P3);
        return (CAdESUtility.getSingleAttribute(unsignedAttributes, CAdESParameters.id_aa_ets_archiveTimestampV3) == null || singleAttribute3 == null || singleAttribute4 == null || singleAttribute5 == null || singleAttribute6 == null || singleAttribute7 == null || singleAttribute8 == null) ? (singleAttribute3 == null || singleAttribute4 == null || singleAttribute5 == null || singleAttribute6 == null || singleAttribute7 == null || singleAttribute8 == null) ? (singleAttribute3 != null || singleAttribute4 == null || singleAttribute5 == null || singleAttribute6 == null || singleAttribute7 == null || singleAttribute8 != null) ? (singleAttribute3 == null || singleAttribute4 == null || singleAttribute5 == null) ? singleAttribute3 != null ? CAdESParameters.CAdES_T : CAdESParameters.CAdES_BES : CAdESParameters.CAdES_C : AdESParameters.TSA_SIGNATURE_TIME_STAMP : CAdESParameters.CAdES_X_Long_Type_1 : CAdESParameters.CAdES_A;
    }

    public static String getSignatureTypeName(Integer num) {
        return (String) a.get(num);
    }

    public static boolean isTimeStampEnhanced(m8z0 m8z0Var) throws CAdESException {
        xc3 unsignedAttributes = m8z0Var.b.getUnsignedAttributes();
        if (unsignedAttributes == null) {
            return false;
        }
        return (CAdESUtility.getSingleAttribute(unsignedAttributes, b490.K3) == null || CAdESUtility.getSingleAttribute(unsignedAttributes, b490.L3) == null || CAdESUtility.getSingleAttribute(unsignedAttributes, b490.M3) == null || CAdESUtility.getSingleAttribute(unsignedAttributes, b490.O3) == null) ? false : true;
    }
}
