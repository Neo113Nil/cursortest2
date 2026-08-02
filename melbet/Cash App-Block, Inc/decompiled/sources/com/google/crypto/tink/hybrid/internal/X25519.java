package com.google.crypto.tink.hybrid.internal;

import com.google.zxing.BinaryBitmap;

/* loaded from: classes4.dex */
public interface X25519 {
    byte[] computeSharedSecret(byte[] bArr, byte[] bArr2);

    BinaryBitmap generateKeyPair();
}
