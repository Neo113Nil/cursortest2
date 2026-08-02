package ru.CryptoPro.JCP.spec;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes4.dex */
public class X509PublicKeySpec extends X509EncodedKeySpec implements AlgorithmParameterSpec {
    public X509PublicKeySpec(byte[] bArr) {
        super(bArr);
    }

    public static X509PublicKeySpec fromKey(PublicKey publicKey) {
        return new X509PublicKeySpec(publicKey.getEncoded());
    }
}
