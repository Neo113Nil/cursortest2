package defpackage;

import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class ws61 extends mr61 {
    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final Integer getSignatureType() {
        return AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE;
    }

    @Override // defpackage.mr61, ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public final Map k() {
        JCPLogger.fine("Preparing attribute parameters (simple archive-timestamp -> enhanced archive-timestamp)...");
        HashMap hashMap = new HashMap();
        xc3 unsignedAttributes = this.a.getUnsignedAttributes();
        u2 u2Var = CAdESParameters.id_aa_ets_ATSHashIndex;
        vc3 singleAttribute = CAdESUtility.getSingleAttribute(unsignedAttributes, u2Var);
        if (singleAttribute != null) {
            hashMap.put(u2Var, singleAttribute);
            return hashMap;
        }
        xc3 unsignedAttributes2 = this.a.getUnsignedAttributes();
        u2 u2Var2 = CAdESParameters.id_aa_ets_ATSHashIndexV3;
        hashMap.put(u2Var2, CAdESUtility.getSingleAttribute(unsignedAttributes2, u2Var2));
        return hashMap;
    }
}
