package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCSP.Cipher.GostCipher;
import ru.CryptoPro.JCSP.JCSP;

/* loaded from: classes11.dex */
public final class uvj0 {
    public final Object a = new Object();

    public final uzn a(byte[] bArr) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, b());
        return new uzn(Base64.encodeToString(cipher.getIV(), 1), cipher.doFinal(bArr));
    }

    public final SecretKey b() {
        synchronized (this.a) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey("yb_responses_key", null);
            if (key != null) {
                return (SecretKey) key;
            }
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("yb_responses_key", 3);
            builder.setKeySize(256);
            builder.setBlockModes(GostCipher.STR_GCM_MODE);
            builder.setEncryptionPaddings("NoPadding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME, "AndroidKeyStore");
            keyGenerator.init(builder.build());
            return keyGenerator.generateKey();
        }
    }
}
