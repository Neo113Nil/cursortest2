package ru.CryptoPro.JCP.params;

import defpackage.ny61;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class OmacParams extends AlgorithmParametersSpi {
    public byte[] a = null;

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded() {
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null) {
            ny61.t("argument must not be null.");
            return null;
        }
        if (cls == OmacParamsSpec.class) {
            return new OmacParamsSpec(this.a);
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec class unsupported: ".concat(cls.getName()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof OmacParamsSpec)) {
            throw new InvalidParameterSpecException("AlgorithmParameterSpec class unsupported: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        try {
            this.a = Array.copy(((OmacParamsSpec) algorithmParameterSpec).getOmacValue());
        } catch (IOException e) {
            InvalidParameterSpecException invalidParameterSpecException = new InvalidParameterSpecException("Unable get OMAC value.");
            invalidParameterSpecException.initCause(e);
            throw invalidParameterSpecException;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final String engineToString() {
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded(String str) {
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr) {
        this.a = Array.copy(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr, String str) {
        this.a = Array.copy(bArr);
    }
}
