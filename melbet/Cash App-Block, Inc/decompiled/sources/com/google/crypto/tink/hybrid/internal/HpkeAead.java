package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes4.dex */
public interface HpkeAead {
    byte[] getAeadId();

    int getKeyLength();

    byte[] open(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4);

    byte[] seal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4);
}
