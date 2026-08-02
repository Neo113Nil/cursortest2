package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class PJ {

    /* renamed from: d, reason: collision with root package name */
    public static final L7.b f27536d = new L7.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f27537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27539c;

    public PJ(byte[] bArr, int i) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3364iD.d(bArr.length);
        this.f27537a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f27536d.get()).getBlockSize();
        this.f27539c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f27538b = i;
    }
}
