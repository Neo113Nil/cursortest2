package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.t87;
import defpackage.u2;
import defpackage.xr1;
import java.security.PrivateKey;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;

/* loaded from: classes4.dex */
public class GostCMSSignatureEncryptionAlgorithmFinder implements t87 {
    public final String a;

    public GostCMSSignatureEncryptionAlgorithmFinder(PrivateKey privateKey) throws AdESException {
        this.a = AlgorithmUtility.keyAlgToKeyAlgorithmOid(privateKey.getAlgorithm());
    }

    @Override // defpackage.t87
    public xr1 findEncryptionAlgorithm(xr1 xr1Var) {
        return new xr1(new u2(this.a));
    }
}
