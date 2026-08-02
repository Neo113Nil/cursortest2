package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes3.dex */
public final class wn implements un {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public wn(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    @Override // defpackage.un
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                sfm sfmVar = (sfm) this.b;
                return h4a.p(((hsm) sfmVar.b).a(), ((un) ((hsm) sfmVar.b).a).a(bArr, bArr2));
            default:
                try {
                    return d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("wn", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused) {
                    }
                    return d(bArr, bArr2);
                }
        }
    }

    @Override // defpackage.un
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                sfm sfmVar = (sfm) this.b;
                if (bArr.length > 5) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                    Iterator it = sfmVar.v(copyOfRange).iterator();
                    while (it.hasNext()) {
                        try {
                            return ((un) ((hsm) it.next()).a).b(copyOfRange2, bArr2);
                        } catch (GeneralSecurityException e) {
                            xn.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                        }
                    }
                }
                Iterator it2 = sfmVar.v(c3x.f).iterator();
                while (it2.hasNext()) {
                    try {
                        return ((un) ((hsm) it2.next()).a).b(bArr, bArr2);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                b6e.m("decryption failed");
                return null;
            default:
                try {
                    return c(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w("wn", "encountered a potentially transient KeyStore error, will wait and retry", e2);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                    } catch (InterruptedException unused2) {
                    }
                    return c(bArr, bArr2);
                }
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            b6e.m("ciphertext too short");
            return null;
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            b6e.m("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public wn(sfm sfmVar) {
        this.b = sfmVar;
    }
}
