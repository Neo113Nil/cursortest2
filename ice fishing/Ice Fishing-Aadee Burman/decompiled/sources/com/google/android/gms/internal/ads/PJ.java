package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class PJ {

    /* renamed from: d, reason: collision with root package name */
    public static final L7.b f26753d = new L7.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f26754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26755b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26756c;

    public PJ(byte[] bArr, int i) {
        if (!WC.c(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3341iD.d(bArr.length);
        this.f26754a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f26753d.get()).getBlockSize();
        this.f26756c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f26755b = i;
    }
}
