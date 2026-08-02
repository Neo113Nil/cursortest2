package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0203b implements V9 {
    public final AESEncrypter a;

    public C0203b(C0174a c0174a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0174a.b(), c0174a.a()));
    }

    @Override // io.appmetrica.analytics.impl.V9
    public final N9 a(K6 k6) {
        byte[] encrypt;
        String encodeToString;
        String value = k6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                k6.setValue(encodeToString);
                return new N9(k6, X9.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        k6.setValue(encodeToString);
        return new N9(k6, X9.AES_VALUE_ENCRYPTION);
    }

    public C0203b() {
        this(new C0174a(Jb.k().g()));
    }

    public C0203b(AESEncrypter aESEncrypter) {
        this.a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.V9
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    public final X9 a() {
        return X9.AES_VALUE_ENCRYPTION;
    }
}
