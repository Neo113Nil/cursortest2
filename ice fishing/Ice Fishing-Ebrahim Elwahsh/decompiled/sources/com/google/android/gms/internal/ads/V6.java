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
public abstract class V6 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28212a = false;

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f28213b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f28214c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f28215d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f28216e = new CountDownLatch(1);

    public static void a() {
        synchronized (f28215d) {
            try {
                if (!f28212a) {
                    f28212a = true;
                    new Thread(new U6(0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static O6 b(String str, byte[] bArr) {
        Vector vector;
        int length = bArr.length;
        if (length > 0) {
            int i = length + 254;
            vector = new Vector();
            for (int i4 = 0; i4 < i / com.anythink.basead.exoplayer.k.p.f8630b; i4++) {
                int i9 = i4 * com.anythink.basead.exoplayer.k.p.f8630b;
                try {
                    int length2 = bArr.length;
                    if (length2 - i9 > 255) {
                        length2 = i9 + com.anythink.basead.exoplayer.k.p.f8630b;
                    }
                    vector.add(Arrays.copyOfRange(bArr, i9, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (vector != null || vector.isEmpty()) {
                return null;
            }
            O6 A8 = P6.A();
            int size = vector.size();
            for (int i10 = 0; i10 < size; i10++) {
                QK s3 = SK.s(d((byte[]) vector.get(i10), str, false), 0, 256);
                A8.h();
                ((P6) A8.f30000u).B(s3);
            }
            byte[] c4 = c(bArr);
            QK qk = SK.f27529u;
            QK s6 = SK.s(c4, 0, c4.length);
            A8.h();
            ((P6) A8.f30000u).C(s6);
            return A8;
        }
        vector = null;
        if (vector != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.V6.f28213b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] c(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f28214c) {
            try {
                a();
                MessageDigest messageDigest2 = null;
                try {
                    if (f28216e.await(2L, TimeUnit.SECONDS) && (messageDigest = f28213b) != null) {
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

    public static byte[] d(byte[] bArr, String str, boolean z8) {
        byte[] array;
        int length = bArr.length;
        int i = true != z8 ? 255 : 239;
        if (length > i) {
            C3830r6 C0 = D6.C0();
            C0.n(4096L);
            bArr = ((D6) C0.j()).b();
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
        if (z8) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        W6[] w6Arr = (W6[]) new C3076d7(0).f29838K2;
        int length3 = w6Arr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            w6Arr[i9].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            Q6 q6 = new Q6(str.getBytes("UTF-8"), 0);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                i10 = (i10 + 1) & com.anythink.basead.exoplayer.k.p.f8630b;
                byte[] bArr4 = q6.f27118a;
                byte b10 = bArr4[i10];
                i11 = (i11 + b10) & com.anythink.basead.exoplayer.k.p.f8630b;
                bArr4[i10] = bArr4[i11];
                bArr4[i11] = b10;
                bArr3[i12] = (byte) (bArr4[(bArr4[i10] + b10) & com.anythink.basead.exoplayer.k.p.f8630b] ^ bArr3[i12]);
            }
        }
        return bArr3;
    }
}
