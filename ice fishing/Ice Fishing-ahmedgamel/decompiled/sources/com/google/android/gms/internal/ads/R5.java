package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class R5 implements YG, InterfaceC3068cn {

    /* renamed from: n, reason: collision with root package name */
    public int f27928n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27929u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27930v;

    /* renamed from: w, reason: collision with root package name */
    public Object f27931w;

    public R5(M5 m52, int i, F5 f52) {
        this.f27929u = m52;
        this.f27928n = i;
        this.f27930v = f52;
    }

    public static final void j(long j6) {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        if (j6 % (((((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new P5();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3068cn
    /* renamed from: a */
    public /* synthetic */ void mo9a(Object obj) {
        InterfaceC4022uQ interfaceC4022uQ = (InterfaceC4022uQ) obj;
        interfaceC4022uQ.b(0, ((AP) this.f27929u).f24455a, (C3429jQ) this.f27930v, (C3699oQ) this.f27931w, this.f27928n);
    }

    public void b(long j6) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j9 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        long j14 = jArr[5];
        long j15 = jArr[6];
        long j16 = jArr[7];
        j(j6);
        long j17 = j6 / (((((((~j9) & j10) | j11) + ((j9 & j12) | j13)) - j14) + j15) ^ (j16 % 899334107));
        if (j17 < 0 || j17 > ((M5) this.f27929u).f27037a.length) {
            throw new Q5();
        }
        this.f27928n = (int) j17;
    }

    public long c() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j6 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        return this.f27928n * (((((((~j6) & j9) | j10) + ((j6 & j11) | j12)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        if (i > this.f27928n) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C2941aK c2941aK = (C2941aK) this.f27929u;
        ((Mac) c2941aK.get()).update(bArr);
        return Arrays.copyOf(((Mac) c2941aK.get()).doFinal(), i);
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.f27929u) {
            try {
                AbstractC2792Sd.H(this.f27928n > 0);
                int i = this.f27928n - 1;
                this.f27928n = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f27931w) != null) {
                    handlerThread.quit();
                    this.f27931w = null;
                    this.f27930v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long f() {
        try {
            F5 f52 = (F5) this.f27930v;
            M5 m52 = (M5) this.f27929u;
            this.f27928n = this.f27928n + 1;
            return f52.g(m52, r2);
        } catch (IndexOutOfBoundsException e9) {
            throw new Q5(e9);
        }
    }

    public int g() {
        try {
            F5 f52 = (F5) this.f27930v;
            M5 m52 = (M5) this.f27929u;
            int i = this.f27928n;
            this.f27928n = i + 1;
            int g9 = f52.g(m52, i) & 255;
            F5 f53 = (F5) this.f27930v;
            M5 m53 = (M5) this.f27929u;
            int i4 = this.f27928n;
            this.f27928n = i4 + 1;
            int g10 = g9 | ((f53.g(m53, i4) & 255) << 8);
            F5 f54 = (F5) this.f27930v;
            M5 m54 = (M5) this.f27929u;
            int i6 = this.f27928n;
            this.f27928n = i6 + 1;
            int g11 = g10 | ((f54.g(m54, i6) & 255) << 16);
            F5 f55 = (F5) this.f27930v;
            M5 m55 = (M5) this.f27929u;
            int i9 = this.f27928n;
            this.f27928n = i9 + 1;
            return g11 | (f55.g(m55, i9) << 24);
        } catch (IndexOutOfBoundsException e9) {
            throw new Q5(e9);
        }
    }

    public long h() {
        int i = 0;
        long j6 = 0;
        while (i < 64) {
            try {
                F5 f52 = (F5) this.f27930v;
                M5 m52 = (M5) this.f27929u;
                int i4 = this.f27928n;
                this.f27928n = i4 + 1;
                byte g9 = f52.g(m52, i4);
                j6 |= (g9 & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (g9 > 1) {
                        throw new O5();
                    }
                    i = 63;
                }
                if ((g9 & com.anythink.core.common.s.a.c.f17103a) == 0) {
                    return (-(j6 & 1)) ^ (j6 >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new Q5(e9);
            }
        }
        throw new O5();
    }

    public M5 i(long j6) {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i4 = iArr[1];
        int i6 = iArr[2];
        int i9 = iArr[3];
        int i10 = iArr[4];
        int i11 = iArr[5];
        int i12 = iArr[6];
        int i13 = iArr[7];
        int f2 = com.IceFishing.LiveIceFishing.k.f((i4 & (~i)) | i6, (i & i9) | i10, i11, i12);
        j(c() + j6);
        int i14 = this.f27928n;
        long j9 = i14;
        M5 m52 = (M5) this.f27929u;
        long j10 = (j6 >> ((i13 % 774318984) ^ f2)) + j9;
        if (j10 > m52.f27037a.length || j10 < j9) {
            throw new Q5();
        }
        try {
            int i15 = (int) j10;
            M5 l9 = ((F5) this.f27930v).l(m52, i14, i15);
            this.f27928n = i15;
            return l9;
        } catch (IndexOutOfBoundsException e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }

    public R5(M5 m52, int i, F5 f52, V2 v22) {
        this(m52, i, f52);
        this.f27931w = v22;
    }

    public /* synthetic */ R5(AP ap, C3429jQ c3429jQ, C3699oQ c3699oQ, int i) {
        this.f27929u = ap;
        this.f27930v = c3429jQ;
        this.f27931w = c3699oQ;
        this.f27928n = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public R5(String str, SecretKeySpec secretKeySpec) {
        char c9;
        int i;
        C2941aK c2941aK = new C2941aK(this);
        this.f27929u = c2941aK;
        if (WC.c(2)) {
            this.f27930v = str;
            this.f27931w = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 == 0) {
                    i = 20;
                } else if (c9 == 1) {
                    i = 28;
                } else if (c9 == 2) {
                    i = 32;
                } else if (c9 == 3) {
                    i = 48;
                } else {
                    if (c9 != 4) {
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    }
                    i = 64;
                }
                this.f27928n = i;
                c2941aK.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
