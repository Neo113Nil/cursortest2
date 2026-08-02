package com.google.crypto.tink.subtle;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.XChaCha20Poly1305Key;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class XChaCha20Poly1305 implements Aead {
    public final InsecureNonceChaCha20Poly1305 cipher;
    public final byte[] outputPrefix;

    public XChaCha20Poly1305(byte[] bArr, byte[] bArr2) {
        this.cipher = new InsecureNonceChaCha20Poly1305(bArr, 1);
        this.outputPrefix = bArr2;
    }

    public static XChaCha20Poly1305 create(XChaCha20Poly1305Key xChaCha20Poly1305Key) {
        return new XChaCha20Poly1305(((com.google.crypto.tink.util.Bytes) xChaCha20Poly1305Key.keyBytes.adapter).toByteArray(), xChaCha20Poly1305Key.outputPrefix.toByteArray());
    }

    public final byte[] rawDecrypt$1(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
            return null;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.cipher.decrypt(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
