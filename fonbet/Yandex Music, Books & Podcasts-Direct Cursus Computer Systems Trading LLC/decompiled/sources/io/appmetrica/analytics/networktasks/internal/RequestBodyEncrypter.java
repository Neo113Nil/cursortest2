package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    @NonNull
    RequestBodyEncryptionMode getEncryptionMode();
}
