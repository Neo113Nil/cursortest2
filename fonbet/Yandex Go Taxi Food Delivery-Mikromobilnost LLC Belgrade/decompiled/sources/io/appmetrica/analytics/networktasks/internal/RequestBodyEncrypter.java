package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes9.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    RequestBodyEncryptionMode getEncryptionMode();
}
