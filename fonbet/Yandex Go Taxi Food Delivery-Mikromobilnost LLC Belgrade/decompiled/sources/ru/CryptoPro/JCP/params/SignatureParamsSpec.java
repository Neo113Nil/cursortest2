package ru.CryptoPro.JCP.params;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public class SignatureParamsSpec implements AlgorithmParameterSpec {
    public static int CP_ECC_PLAIN_SIGNATURE = 8;
    public static int CRYPT_NOHASHOID = 1;
    public static int CRYPT_RSA_PSS = 128;
    public static int CRYPT_X931_FORMAT = 4;
    public final int a;

    public SignatureParamsSpec(int i) {
        this.a = i;
    }

    public int getFlag() {
        return this.a;
    }
}
