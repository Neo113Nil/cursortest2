package ru.CryptoPro.JCP.spec;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public class SpecialCipherSpec implements AlgorithmParameterSpec {
    public boolean a = false;

    public SpecialCipherSpec invertedByteOrder() {
        this.a = true;
        return this;
    }

    public boolean isInvertedByteOrder() {
        return this.a;
    }
}
