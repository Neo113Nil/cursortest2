package ru.CryptoPro.JCP.Digest;

import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes4.dex */
public final class DigestForSign implements AlgorithmParameterSpec {
    public final MessageDigest a;

    public DigestForSign(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    public MessageDigest getDigest() {
        return this.a;
    }
}
