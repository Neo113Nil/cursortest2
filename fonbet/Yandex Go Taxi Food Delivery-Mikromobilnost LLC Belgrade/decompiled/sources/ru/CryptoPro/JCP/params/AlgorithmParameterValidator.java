package ru.CryptoPro.JCP.params;

import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class AlgorithmParameterValidator extends AlgorithmParametersSpi {
    public int a;

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded() {
        String str;
        int i = this.a;
        if (i == 26142) {
            str = "GOST28147";
        } else if (i == 26160) {
            str = "GR3412_2015_M";
        } else {
            if (i != 26161) {
                return null;
            }
            str = "GR3412_2015_K";
        }
        return str.getBytes();
    }

    @Override // java.security.AlgorithmParametersSpi
    public final AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        throw new InvalidParameterSpecException("Unsupported method");
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new InvalidParameterSpecException("Unsupported method");
    }

    @Override // java.security.AlgorithmParametersSpi
    public final String engineToString() {
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr) {
        this.a = Array.getInt(bArr, 0);
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr, String str) {
        this.a = Array.getInt(bArr, 0);
    }

    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded(String str) {
        return engineGetEncoded();
    }
}
