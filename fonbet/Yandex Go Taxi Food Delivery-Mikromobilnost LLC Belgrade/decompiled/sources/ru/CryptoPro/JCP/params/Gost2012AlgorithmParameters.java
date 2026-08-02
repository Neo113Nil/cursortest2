package ru.CryptoPro.JCP.params;

import com.objsys.asn1j.runtime.Asn1Type;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax.GostR3410_2012_PublicKeyParameters;

/* loaded from: classes4.dex */
public class Gost2012AlgorithmParameters extends Gost2001AlgorithmParameters {
    @Override // ru.CryptoPro.JCP.params.Gost2001AlgorithmParameters
    public Asn1Type createParameters() {
        return new GostR3410_2012_PublicKeyParameters();
    }

    @Override // ru.CryptoPro.JCP.params.Gost2001AlgorithmParameters
    public String getParametersName() {
        return "GOST R 34.10-2012";
    }
}
