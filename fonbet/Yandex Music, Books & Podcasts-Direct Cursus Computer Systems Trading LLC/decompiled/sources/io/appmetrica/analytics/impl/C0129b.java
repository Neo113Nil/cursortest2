package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0129b implements O9 {
    public final AESEncrypter a;

    public C0129b(C0100a c0100a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0100a.b(), c0100a.a()));
    }

    @Override // io.appmetrica.analytics.impl.O9
    @NonNull
    public final H9 a(@NonNull H6 h6) {
        byte[] encrypt;
        String encodeToString;
        String value = h6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                h6.setValue(encodeToString);
                return new H9(h6, Q9.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        h6.setValue(encodeToString);
        return new H9(h6, Q9.AES_VALUE_ENCRYPTION);
    }

    public C0129b() {
        this(new C0100a(C0747wb.k().g()));
    }

    public C0129b(AESEncrypter aESEncrypter) {
        this.a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.O9
    @NonNull
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

    @NonNull
    public final Q9 a() {
        return Q9.AES_VALUE_ENCRYPTION;
    }
}
