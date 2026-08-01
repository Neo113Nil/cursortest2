package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class R5 implements YG, InterfaceC2992bn {

    /* renamed from: n, reason: collision with root package name */
    public int f27172n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27173u;

    /* renamed from: v, reason: collision with root package name */
    public Object f27174v;

    /* renamed from: w, reason: collision with root package name */
    public Object f27175w;

    public R5(M5 m52, int i, F5 f52) {
        this.f27173u = m52;
        this.f27172n = i;
        this.f27174v = f52;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC2992bn
    /* renamed from: a */
    public /* synthetic */ void mo10a(Object obj) {
        InterfaceC3837rQ interfaceC3837rQ = (InterfaceC3837rQ) obj;
        interfaceC3837rQ.b(0, ((AP) this.f27173u).f23675a, (C3246gQ) this.f27174v, (C3514lQ) this.f27175w, this.f27172n);
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
        if (j17 < 0 || j17 > ((M5) this.f27173u).f26246a.length) {
            throw new Q5();
        }
        this.f27172n = (int) j17;
    }

    public long c() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j6 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        return this.f27172n * (((((((~j6) & j9) | j10) + ((j6 & j11) | j12)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        if (i > this.f27172n) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        C2918aK c2918aK = (C2918aK) this.f27173u;
        ((Mac) c2918aK.get()).update(bArr);
        return Arrays.copyOf(((Mac) c2918aK.get()).doFinal(), i);
    }

    public void e() {
        HandlerThread handlerThread;
        synchronized (this.f27173u) {
            try {
                AbstractC2772Sd.H(this.f27172n > 0);
                int i = this.f27172n - 1;
                this.f27172n = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f27175w) != null) {
                    handlerThread.quit();
                    this.f27175w = null;
                    this.f27174v = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long f() {
        try {
            F5 f52 = (F5) this.f27174v;
            M5 m52 = (M5) this.f27173u;
            this.f27172n = this.f27172n + 1;
            return f52.g(m52, r2);
        } catch (IndexOutOfBoundsException e9) {
            throw new Q5(e9);
        }
    }

    public int g() {
        try {
            F5 f52 = (F5) this.f27174v;
            M5 m52 = (M5) this.f27173u;
            int i = this.f27172n;
            this.f27172n = i + 1;
            int g4 = f52.g(m52, i) & 255;
            F5 f53 = (F5) this.f27174v;
            M5 m53 = (M5) this.f27173u;
            int i6 = this.f27172n;
            this.f27172n = i6 + 1;
            int g9 = g4 | ((f53.g(m53, i6) & 255) << 8);
            F5 f54 = (F5) this.f27174v;
            M5 m54 = (M5) this.f27173u;
            int i9 = this.f27172n;
            this.f27172n = i9 + 1;
            int g10 = g9 | ((f54.g(m54, i9) & 255) << 16);
            F5 f55 = (F5) this.f27174v;
            M5 m55 = (M5) this.f27173u;
            int i10 = this.f27172n;
            this.f27172n = i10 + 1;
            return g10 | (f55.g(m55, i10) << 24);
        } catch (IndexOutOfBoundsException e9) {
            throw new Q5(e9);
        }
    }

    public long h() {
        int i = 0;
        long j6 = 0;
        while (i < 64) {
            try {
                F5 f52 = (F5) this.f27174v;
                M5 m52 = (M5) this.f27173u;
                int i6 = this.f27172n;
                this.f27172n = i6 + 1;
                byte g4 = f52.g(m52, i6);
                j6 |= (g4 & Byte.MAX_VALUE) << i;
                if (i == 63) {
                    if (g4 > 1) {
                        throw new O5();
                    }
                    i = 63;
                }
                if ((g4 & com.anythink.core.common.s.a.c.f16316a) == 0) {
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
        int i6 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        int i11 = iArr[4];
        int i12 = iArr[5];
        int i13 = iArr[6];
        int i14 = iArr[7];
        int g4 = com.anythink.basead.exoplayer.f.f.g((i6 & (~i)) | i9, (i & i10) | i11, i12, i13);
        j(c() + j6);
        int i15 = this.f27172n;
        long j9 = i15;
        M5 m52 = (M5) this.f27173u;
        long j10 = (j6 >> ((i14 % 774318984) ^ g4)) + j9;
        if (j10 > m52.f26246a.length || j10 < j9) {
            throw new Q5();
        }
        try {
            int i16 = (int) j10;
            M5 l9 = ((F5) this.f27174v).l(m52, i15, i16);
            this.f27172n = i16;
            return l9;
        } catch (IndexOutOfBoundsException e9) {
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e9);
        }
    }

    public R5(M5 m52, int i, F5 f52, V2 v22) {
        this(m52, i, f52);
        this.f27175w = v22;
    }

    public /* synthetic */ R5(AP ap, C3246gQ c3246gQ, C3514lQ c3514lQ, int i) {
        this.f27173u = ap;
        this.f27174v = c3246gQ;
        this.f27175w = c3514lQ;
        this.f27172n = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public R5(String str, SecretKeySpec secretKeySpec) {
        char c9;
        int i;
        C2918aK c2918aK = new C2918aK(this);
        this.f27173u = c2918aK;
        if (WC.c(2)) {
            this.f27174v = str;
            this.f27175w = secretKeySpec;
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
                this.f27172n = i;
                c2918aK.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
