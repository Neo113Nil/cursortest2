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
    public MessageDigest f28613a;

    /* renamed from: b, reason: collision with root package name */
    public final C3983uA f28614b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28615c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f28616d = false;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f28617e;

    public Xy(C3983uA c3983uA) {
        this.f28614b = c3983uA;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:com.google.android.gms.internal.ads.tA) VIRTUAL call: com.google.android.gms.internal.ads.tA.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:27:0x0039 */
    public final void a() {
        boolean z3;
        C3929tA c9;
        synchronized (this) {
            z3 = this.f28616d;
        }
        if (z3) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                C3929tA a9 = this.f28614b.a(202);
                try {
                    a9.a();
                    this.f28617e = secureRandom;
                    this.f28613a = MessageDigest.getInstance("MD5");
                    this.f28616d = true;
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

    public final byte[] b(byte[] bArr, String str, boolean z3) {
        int length = bArr.length;
        int i = true != z3 ? 255 : 239;
        AbstractC2772Sd.i(length <= i);
        ByteBuffer put = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i6 = i - length;
            byte[] bArr2 = new byte[i6];
            this.f28617e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i6);
            System.arraycopy(bArr2, 0, bArr, length, i6);
        }
        byte[] array = put.put(bArr).array();
        if (z3) {
            array = ByteBuffer.allocate(256).put(c(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        Yy[] yyArr = (Yy[]) new C3173f7(1).f30088K2;
        int length2 = yyArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            yyArr[i9].a(array, bArr3);
        }
        if (!SK.n(str)) {
            C3308hh c3308hh = new C3308hh(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), 1);
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 256; i12++) {
                i10 = (i10 + 1) & com.anythink.basead.exoplayer.k.p.f8473b;
                byte[] bArr4 = c3308hh.f30827n;
                byte b9 = bArr4[i10];
                i11 = (i11 + b9) & com.anythink.basead.exoplayer.k.p.f8473b;
                bArr4[i10] = bArr4[i11];
                bArr4[i11] = b9;
                bArr3[i12] = (byte) (bArr4[(bArr4[i10] + b9) & com.anythink.basead.exoplayer.k.p.f8473b] ^ bArr3[i12]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] digest;
        synchronized (this.f28615c) {
            this.f28613a.reset();
            this.f28613a.update(bArr);
            digest = this.f28613a.digest();
        }
        return digest;
    }

    public final R6 d(String str, byte[] bArr) {
        R6 A9 = S6.A();
        byte[] c9 = c(bArr);
        HK hk = JK.f25675u;
        HK s9 = JK.s(c9, 0, c9.length);
        A9.h();
        ((S6) A9.f27721u).C(s9);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / com.anythink.basead.exoplayer.k.p.f8473b) + 1) {
                break;
            }
            int i6 = i * com.anythink.basead.exoplayer.k.p.f8473b;
            int i9 = i6 + com.anythink.basead.exoplayer.k.p.f8473b;
            if (length > i9) {
                length = i9;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i6, length));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HK s10 = JK.s(b((byte[]) it.next(), str, false), 0, 256);
            A9.h();
            ((S6) A9.f27721u).B(s10);
        }
        return A9;
    }
}
