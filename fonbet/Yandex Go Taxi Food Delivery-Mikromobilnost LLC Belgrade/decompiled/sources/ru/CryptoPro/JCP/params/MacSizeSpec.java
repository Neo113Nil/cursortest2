package ru.CryptoPro.JCP.params;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public class MacSizeSpec implements AlgorithmParameterSpec {
    public final int a;

    public MacSizeSpec(int i) {
        this.a = i;
    }

    public int getMacSize() {
        return this.a;
    }
}
