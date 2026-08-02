package defpackage;

import ru.CryptoPro.AdES.AdESParameters;

/* loaded from: classes4.dex */
public final class rx61 extends xx61 {
    @Override // defpackage.xx61, ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final Integer getSignatureType() {
        return AdESParameters.TSA_CAdESC_TIME_STAMP;
    }
}
