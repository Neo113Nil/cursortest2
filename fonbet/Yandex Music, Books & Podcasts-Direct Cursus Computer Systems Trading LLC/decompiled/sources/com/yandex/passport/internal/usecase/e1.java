package com.yandex.passport.internal.usecase;

import android.security.keystore.KeyGenParameterSpec;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.z6;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class e1 {
    public static final Charset d = Charsets.UTF_8;
    public final com.yandex.passport.internal.report.reporters.w a;
    public SecretKey b;
    public final KeyGenParameterSpec c;

    public e1(com.yandex.passport.internal.report.reporters.w wVar) {
        wVar.getClass();
        this.a = wVar;
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_passport_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        build.getClass();
        this.c = build;
    }

    public final Serializable a(String str, String str2) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = b();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.a;
            wVar.getClass();
            wVar.n(z6.d, new ff(a), new com.yandex.passport.internal.report.f(str, 11), new ff(str2, 16, false));
        }
        return (Serializable) t7oVar;
    }

    public final SecretKey b() {
        SecretKey secretKey;
        SecretKey secretKey2 = this.b;
        if (secretKey2 != null) {
            return secretKey2;
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        KeyGenParameterSpec keyGenParameterSpec = this.c;
        if (keyStore.containsAlias(keyGenParameterSpec.getKeystoreAlias())) {
            KeyStore.Entry entry = keyStore.getEntry(keyGenParameterSpec.getKeystoreAlias(), null);
            entry.getClass();
            secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            secretKey.getClass();
        } else {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.getClass();
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
            KeyStore.Entry entry2 = keyStore.getEntry(keyGenParameterSpec.getKeystoreAlias(), null);
            entry2.getClass();
            secretKey = ((KeyStore.SecretKeyEntry) entry2).getSecretKey();
            secretKey.getClass();
        }
        this.b = secretKey;
        return secretKey;
    }
}
