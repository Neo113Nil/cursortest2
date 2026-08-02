package ru.CryptoPro.JCSP.Key;

import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCSP.MSCAPI.HHash;

/* loaded from: classes4.dex */
public interface JCSPSignatureKeyPreHashInterface {
    HHash prepareHash(int i, DigestParamsSpec digestParamsSpec, boolean z);
}
