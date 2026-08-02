package ru.CryptoPro.JCP.params;

import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class Kexp15ParamsSpec implements AlgorithmParameterSpec {
    public final byte[] a;
    public final byte[] b;

    public Kexp15ParamsSpec(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
        if (bArr2 != null) {
            this.b = Array.copy(bArr2);
        }
    }

    public byte[] getBaseUkm() {
        return this.a;
    }

    public byte[] getExtendKeyUkm() {
        return this.b;
    }

    public boolean isNeedExtendKey() {
        return this.b != null;
    }
}
