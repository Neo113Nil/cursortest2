package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Xy {

    /* renamed from: a, reason: collision with root package name */
    public MessageDigest f29390a;

    /* renamed from: b, reason: collision with root package name */
    public final C4006uA f29391b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f29392c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f29393d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f29394e;

    public Xy(C4006uA c4006uA) {
        this.f29391b = c4006uA;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.tA) VIRTUAL call: com.google.android.gms.internal.ads.tA.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:27:0x0039 */
    public final void a() {
        boolean z6;
        C3952tA c9;
        synchronized (this) {
            z6 = this.f29393d;
        }
        if (z6) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                C3952tA a9 = this.f29391b.a(202);
                try {
                    a9.a();
                    this.f29394e = secureRandom;
                    this.f29390a = MessageDigest.getInstance("MD5");
                    this.f29393d = true;
                } catch (NoSuchAlgorithmException e9) {
                    a9.b(e9);
                } catch (Throwable th) {
                    a9.b(th);
                    throw th;
                }
                a9.c();
            } catch (Throwable th2) {
                c9.c();
                throw th2;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z6) {
        int length = bArr.length;
        int i = true != z6 ? 255 : 239;
        AbstractC2792Sd.i(length <= i);
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i4 = i - length;
            byte[] bArr2 = new byte[i4];
            this.f29394e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i4);
            System.arraycopy(bArr2, 0, bArr, length, i4);
        }
        byte[] array = put.put(bArr).array();
        if (z6) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        Yy[] yyArr = (Yy[]) new C3196f7(1).f30875K2;
        int length2 = yyArr.length;
        for (int i6 = 0; i6 < 12; i6++) {
            yyArr[i6].a(array, bArr3);
        }
        if (!SK.n(str)) {
            C3331hh c3331hh = new C3331hh(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), 1);
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 256; i11++) {
                i9 = (i9 + 1) & com.anythink.basead.exoplayer.k.p.f9259b;
                byte[] bArr4 = c3331hh.f31588n;
                byte b9 = bArr4[i9];
                i10 = (i10 + b9) & com.anythink.basead.exoplayer.k.p.f9259b;
                bArr4[i9] = bArr4[i10];
                bArr4[i10] = b9;
                bArr3[i11] = (byte) (bArr4[(bArr4[i9] + b9) & com.anythink.basead.exoplayer.k.p.f9259b] ^ bArr3[i11]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] digest;
        synchronized (this.f29392c) {
            this.f29390a.reset();
            this.f29390a.update(bArr);
            digest = this.f29390a.digest();
        }
        return digest;
    }

    public final R6 d(String str, byte[] bArr) {
        R6 A9 = S6.A();
        byte[] c9 = c(bArr);
        HK hk = JK.f26428u;
        HK s9 = JK.s(c9, 0, c9.length);
        A9.h();
        ((S6) A9.f28504u).C(s9);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / com.anythink.basead.exoplayer.k.p.f9259b) + 1) {
                break;
            }
            int i4 = i * com.anythink.basead.exoplayer.k.p.f9259b;
            int i6 = i4 + com.anythink.basead.exoplayer.k.p.f9259b;
            if (length > i6) {
                length = i6;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i4, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HK s10 = JK.s(b((byte[]) it.next(), str, false), 0, 256);
            A9.h();
            ((S6) A9.f28504u).B(s10);
        }
        return A9;
    }
}
