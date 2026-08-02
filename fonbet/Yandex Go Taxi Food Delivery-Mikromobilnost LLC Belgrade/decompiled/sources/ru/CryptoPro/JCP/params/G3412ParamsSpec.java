package ru.CryptoPro.JCP.params;

import java.security.spec.AlgorithmParameterSpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class G3412ParamsSpec implements AlgorithmParameterSpec {
    public final byte[] a;
    public final int b;
    public final int c;
    public final boolean w;

    public G3412ParamsSpec(byte[] bArr, int i, int i2) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.w = false;
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
        this.b = i;
        this.c = i2;
    }

    public int getGammaLen() {
        return this.b;
    }

    public byte[] getIV() {
        return this.a;
    }

    public int getMixBlockSize() {
        return this.c;
    }

    public boolean isCms() {
        return this.w;
    }

    public G3412ParamsSpec(byte[] bArr, int i) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.w = false;
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
        this.b = i;
    }

    public G3412ParamsSpec(byte[] bArr, boolean z) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.w = false;
        if (bArr != null) {
            this.a = Array.copy(bArr);
        }
        this.w = z;
    }
}
