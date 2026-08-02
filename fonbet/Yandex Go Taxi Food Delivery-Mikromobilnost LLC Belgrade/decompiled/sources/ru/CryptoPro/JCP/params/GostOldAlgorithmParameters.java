package ru.CryptoPro.JCP.params;

import java.io.IOException;

/* loaded from: classes4.dex */
public class GostOldAlgorithmParameters extends Gost2001AlgorithmParameters {
    @Override // ru.CryptoPro.JCP.params.Gost2001AlgorithmParameters, java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        throw new IOException("engineGetEncoded() is unsupported for " + getParametersName());
    }

    @Override // ru.CryptoPro.JCP.params.Gost2001AlgorithmParameters
    public String getParametersName() {
        return "GOST R 34.10-94";
    }
}
