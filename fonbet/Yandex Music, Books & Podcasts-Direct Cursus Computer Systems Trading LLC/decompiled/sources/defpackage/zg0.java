package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes3.dex */
public final class zg0 {
    public KeyStore a;

    public zg0() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            wvs.m(e);
            throw null;
        }
    }

    public static void a(String str) {
        if (new zg0().c(str)) {
            xq0.x(hrg.q("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
            return;
        }
        String b = qwt.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized wn b(String str) {
        wn wnVar;
        wnVar = new wn(qwt.b(str), this.a);
        byte[] a = qhn.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, wnVar.b(wnVar.a(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return wnVar;
    }

    public final synchronized boolean c(String str) {
        String b;
        b = qwt.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("zg0", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.a.containsAlias(b);
        }
        return this.a.containsAlias(b);
    }
}
