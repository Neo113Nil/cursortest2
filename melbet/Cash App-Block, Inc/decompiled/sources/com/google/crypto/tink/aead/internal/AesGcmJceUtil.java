package com.google.crypto.tink.aead.internal;

import android.os.Build;
import androidx.camera.core.impl.utils.Exif;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Validators;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public abstract class AesGcmJceUtil {
    public static final Exif.AnonymousClass1 localCipher = new Exif.AnonymousClass1(14);

    public static AlgorithmParameterSpec getParams(int i, int i2, byte[] bArr) {
        Charset charset = Util.UTF_8;
        Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (valueOf == null || valueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static SecretKeySpec getSecretKey(byte[] bArr) {
        Validators.validateAesKeySize(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher getThreadLocalCipher() {
        return (Cipher) localCipher.get();
    }

    public static AlgorithmParameterSpec getParams(byte[] bArr) {
        return getParams(0, bArr.length, bArr);
    }
}
