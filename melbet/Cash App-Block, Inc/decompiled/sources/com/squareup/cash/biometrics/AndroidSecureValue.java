package com.squareup.cash.biometrics;

import javax.crypto.Cipher;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AndroidSecureValue {
    public final Cipher decryptionCipher;
    public final ByteString encrypted;

    public AndroidSecureValue(ByteString byteString, Cipher cipher) {
        this.encrypted = byteString;
        this.decryptionCipher = cipher;
    }

    public final ByteString decryptThrowing() {
        ByteString.Companion companion = ByteString.Companion;
        byte[] doFinal = this.decryptionCipher.doFinal(this.encrypted.toByteArray());
        doFinal.getClass();
        return ByteString.Companion.of$default(doFinal);
    }
}
