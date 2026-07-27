package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class Z6 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28839a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f28840b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f28841c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f28842d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f28843e = new CountDownLatch(1);

    public static void a() {
        synchronized (f28842d) {
            try {
                if (!f28839a) {
                    f28839a = true;
                    new Thread(new Y6(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static R6 b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length > 0) {
            int i = length + 254;
            vector = new Vector();
            for (int i6 = 0; i6 < i / com.anythink.basead.exoplayer.k.p.f8473b; i6++) {
                int i9 = i6 * com.anythink.basead.exoplayer.k.p.f8473b;
                try {
                    int length2 = bArr.length;
                    if (length2 - i9 > 255) {
                        length2 = i9 + com.anythink.basead.exoplayer.k.p.f8473b;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i9, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            R6 A9 = S6.A();
            int size = vector.size();
            for (int i10 = 0; i10 < size; i10++) {
                HK s9 = JK.s(d((byte[]) vector.get(i10), str, false), 0, 256);
                A9.h();
                ((S6) A9.f27721u).B(s9);
            }
            byte[] c9 = c(bArr);
            HK hk = JK.f25675u;
            HK s10 = JK.s(c9, 0, c9.length);
            A9.h();
            ((S6) A9.f27721u).C(s10);
            return A9;
        }
        vector = null;
        if (vector != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.Z6.f28840b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f28841c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f28843e.await(2L, TimeUnit.SECONDS) && (messageDigest = f28840b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static byte[] d(byte[] bArr, String str, boolean z3) {
        byte[] array;
        int length = bArr.length;
        int i = true != z3 ? 255 : 239;
        if (length > i) {
            C3979u6 C0 = H6.C0();
            C0.n(4096L);
            bArr = ((H6) C0.j()).b();
        }
        int i6 = i + 1;
        int length2 = bArr.length;
        byte b9 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i6).put(b9).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i6).put(b9).put(bArr).array();
        }
        if (z3) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC2905a7[] interfaceC2905a7Arr = (InterfaceC2905a7[]) new C3173f7(0).f30088K2;
        int length3 = interfaceC2905a7Arr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            interfaceC2905a7Arr[i9].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            T6 t6 = new T6(str.getBytes("UTF-8"), 0);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                i10 = (i10 + 1) & com.anythink.basead.exoplayer.k.p.f8473b;
                byte[] bArr4 = t6.f27694a;
                byte b10 = bArr4[i10];
                i11 = (i11 + b10) & com.anythink.basead.exoplayer.k.p.f8473b;
                bArr4[i10] = bArr4[i11];
                bArr4[i11] = b10;
                bArr3[i12] = (byte) (bArr4[(bArr4[i10] + b10) & com.anythink.basead.exoplayer.k.p.f8473b] ^ bArr3[i12]);
            }
        }
        return bArr3;
    }
}
