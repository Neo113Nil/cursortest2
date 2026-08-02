package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.s87;
import defpackage.xr1;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;

/* loaded from: classes4.dex */
public class GostCMSSignatureAlgorithmNameGenerator implements s87 {
    @Override // defpackage.s87
    public String getSignatureName(xr1 xr1Var, xr1 xr1Var2) {
        return AlgorithmUtility.digestAlgToSignatureOid(xr1Var.a.a);
    }
}
