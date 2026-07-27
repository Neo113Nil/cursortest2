package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ez, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3164ez {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f30005a = StandardCharsets.UTF_8;

    /* renamed from: b, reason: collision with root package name */
    public static Cipher f30006b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30007c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f30008d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] r9 = AbstractC2772Sd.r(str, false);
            int length2 = r9.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(r9);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f30007c) {
                    b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = b().doFinal(bArr3);
                }
                return doFinal;
            }
            try {
                throw new C3110dz();
            } catch (IllegalArgumentException e9) {
                e = e9;
                throw new C3110dz(e);
            } catch (InvalidAlgorithmParameterException e10) {
                e = e10;
                throw new C3110dz(e);
            } catch (InvalidKeyException e11) {
                e = e11;
                throw new C3110dz(e);
            } catch (BadPaddingException e12) {
                e = e12;
                throw new C3110dz(e);
            } catch (IllegalBlockSizeException e13) {
                e = e13;
                throw new C3110dz(e);
            } catch (NoSuchPaddingException e14) {
                e = e14;
                throw new C3110dz(e);
            }
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e15) {
            e = e15;
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f30008d) {
            try {
                if (f30006b == null) {
                    f30006b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f30006b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
