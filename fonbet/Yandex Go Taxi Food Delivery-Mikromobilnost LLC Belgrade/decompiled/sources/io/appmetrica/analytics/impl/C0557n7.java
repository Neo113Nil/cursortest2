package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0557n7 implements CryptoProvider {
    public final AESRSAEncrypter a = new AESRSAEncrypter();

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider
    public final Encrypter getAesRsaEncrypter() {
        return this.a;
    }
}
