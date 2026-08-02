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
    public static boolean f29619a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f29620b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29621c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f29622d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f29623e = new CountDownLatch(1);

    public static void a() {
        synchronized (f29622d) {
            try {
                if (!f29619a) {
                    f29619a = true;
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
            for (int i4 = 0; i4 < i / com.anythink.basead.exoplayer.k.p.f9259b; i4++) {
                int i6 = i4 * com.anythink.basead.exoplayer.k.p.f9259b;
                try {
                    int length2 = bArr.length;
                    if (length2 - i6 > 255) {
                        length2 = i6 + com.anythink.basead.exoplayer.k.p.f9259b;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i6, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            R6 A9 = S6.A();
            int size = vector.size();
            for (int i9 = 0; i9 < size; i9++) {
                HK s9 = JK.s(d((byte[]) vector.get(i9), str, false), 0, 256);
                A9.h();
                ((S6) A9.f28504u).B(s9);
            }
            byte[] c9 = c(bArr);
            HK hk = JK.f26428u;
            HK s10 = JK.s(c9, 0, c9.length);
            A9.h();
            ((S6) A9.f28504u).C(s10);
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
        r6 = com.google.android.gms.internal.ads.Z6.f29620b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f29621c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f29623e.await(2L, TimeUnit.SECONDS) && (messageDigest = f29620b) != null) {
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

    public static byte[] d(byte[] bArr, String str, boolean z6) {
        byte[] array;
        int length = bArr.length;
        int i = true != z6 ? 255 : 239;
        if (length > i) {
            C4002u6 C0 = H6.C0();
            C0.n(4096L);
            bArr = ((H6) C0.j()).b();
        }
        int i4 = i + 1;
        int length2 = bArr.length;
        byte b9 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i4).put(b9).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i4).put(b9).put(bArr).array();
        }
        if (z6) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC2928a7[] interfaceC2928a7Arr = (InterfaceC2928a7[]) new C3196f7(0).f30875K2;
        int length3 = interfaceC2928a7Arr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            interfaceC2928a7Arr[i6].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            T6 t6 = new T6(str.getBytes("UTF-8"), 0);
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 256; i11++) {
                i9 = (i9 + 1) & com.anythink.basead.exoplayer.k.p.f9259b;
                byte[] bArr4 = t6.f28477a;
                byte b10 = bArr4[i9];
                i10 = (i10 + b10) & com.anythink.basead.exoplayer.k.p.f9259b;
                bArr4[i9] = bArr4[i10];
                bArr4[i10] = b10;
                bArr3[i11] = (byte) (bArr4[(bArr4[i9] + b10) & com.anythink.basead.exoplayer.k.p.f9259b] ^ bArr3[i11]);
            }
        }
        return bArr3;
    }
}
