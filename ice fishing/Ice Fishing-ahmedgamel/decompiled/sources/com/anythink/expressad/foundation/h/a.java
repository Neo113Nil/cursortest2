package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import android.util.Base64;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19587a = "HkzwDFeD4QuyLdx5igfZYcu9xTM9NN==";

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f19588b = new byte[32];

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f19589c = new byte[16];

    /* renamed from: com.anythink.expressad.foundation.h.a$a, reason: collision with other inner class name */
    public static class C0125a extends Provider {
        public C0125a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        String b9 = com.anythink.core.express.a.a.b(f19587a);
        if (TextUtils.isEmpty(b9)) {
            return;
        }
        try {
            byte[] digest = MessageDigest.getInstance("sha-384").digest(b9.getBytes());
            System.arraycopy(digest, 0, f19588b, 0, 32);
            System.arraycopy(digest, 32, f19589c, 0, 16);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static String a(String str) {
        return a(str, f19588b, f19589c);
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] digest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(digest, 0, f19588b, 0, 32);
            System.arraycopy(digest, 32, f19589c, 0, 16);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static String c(String str) {
        return b(str, f19588b, f19589c);
    }

    private static byte[] d(String str) {
        String upperCase = str.trim().replace(" ", "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i6 = i * 2;
            int i9 = i6 + 1;
            bArr[i] = (byte) (Integer.decode("0x" + upperCase.substring(i6, i9) + upperCase.substring(i9, i6 + 2)).intValue() & com.anythink.basead.exoplayer.k.p.f8473b);
        }
        return bArr;
    }

    private static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0125a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static String b(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        String str = "";
        for (byte b9 : bArr) {
            String hexString = Integer.toHexString(b9 & 255);
            if (hexString.length() == 1) {
                str = AbstractC4404f.g(str, "0", hexString);
            } else {
                str = AbstractC4404f.f(str, hexString);
            }
        }
        return str;
    }
}
