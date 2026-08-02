package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.qbs0;
import defpackage.u2;
import defpackage.xr1;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;

/* loaded from: classes4.dex */
public class GostSignatureAlgorithmIdentifierFinder implements qbs0 {
    @Override // defpackage.qbs0
    public xr1 find(String str) {
        return new xr1(new u2(AlgorithmUtility.signAlgToSignatureOid(str)));
    }
}
