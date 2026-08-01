package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class L4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public CQ f26058a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3543m1 f26059b;

    /* renamed from: c, reason: collision with root package name */
    public int f26060c;

    /* renamed from: d, reason: collision with root package name */
    public long f26061d;

    /* renamed from: e, reason: collision with root package name */
    public J4 f26062e;

    /* renamed from: f, reason: collision with root package name */
    public int f26063f;

    /* renamed from: g, reason: collision with root package name */
    public long f26064g;

    static {
        int i = AbstractC2639Kg.f25949M;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0275  */
    @Override // com.google.android.gms.internal.ads.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(R0 r02, U0 u02) {
        byte[] bArr;
        int i;
        int i6;
        byte[] bArr2;
        int b9;
        int i9;
        this.f26059b.getClass();
        String str = AbstractC3159eu.f29993a;
        int i10 = this.f26060c;
        if (i10 == 0) {
            AbstractC2772Sd.H(((K0) r02).f25819w == 0);
            int i11 = this.f26063f;
            if (i11 != -1) {
                ((K0) r02).a(i11, false);
                this.f26060c = 4;
                return 0;
            }
            K0 k02 = (K0) r02;
            if (!AbstractC3043cl.o(k02)) {
                throw U4.a(null, "Unsupported or unrecognized wav file type.");
            }
            k02.a((int) (k02.q() - k02.f25819w), false);
            this.f26060c = 1;
            return 0;
        }
        long j6 = -1;
        if (i10 == 1) {
            Cr cr = new Cr(8);
            K0 k03 = (K0) r02;
            D a9 = D.a(k03, cr);
            if (a9.f24288a != 1685272116) {
                k03.f25821y = 0;
            } else {
                k03.c(8, false);
                cr.E(0);
                K0 k04 = (K0) r02;
                k04.A(cr.f24252a, 0, 8, false);
                j6 = cr.e();
                k04.a(((int) a9.f24289b) + 8, false);
            }
            this.f26061d = j6;
            this.f26060c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                AbstractC2772Sd.H(this.f26064g != -1);
                long j9 = this.f26064g - ((K0) r02).f25819w;
                J4 j42 = this.f26062e;
                j42.getClass();
                return j42.a((K0) r02, j9) ? -1 : 0;
            }
            ((K0) r02).f25821y = 0;
            K0 k05 = (K0) r02;
            D A9 = AbstractC3043cl.A(1684108385, k05, new Cr(8));
            k05.a(8, false);
            Pair create = Pair.create(Long.valueOf(k05.f25819w), Long.valueOf(A9.f24289b));
            this.f26063f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j10 = this.f26061d;
            if (j10 != -1 && longValue == 4294967295L) {
                longValue = j10;
            }
            long j11 = this.f26063f + longValue;
            this.f26064g = j11;
            long j12 = k05.f25818v;
            if (j12 != -1 && j11 > j12) {
                StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 29 + String.valueOf(j12).length());
                D.y.x(sb, "Data exceeds input length: ", j11, ", ");
                sb.append(j12);
                AbstractC2968bG.y("WavExtractor", sb.toString());
                this.f26064g = j12;
                j11 = j12;
            }
            J4 j43 = this.f26062e;
            j43.getClass();
            j43.c(this.f26063f, j11);
            this.f26060c = 4;
            return 0;
        }
        Cr cr2 = new Cr(16);
        K0 k06 = (K0) r02;
        long j13 = AbstractC3043cl.A(1718449184, k06, cr2).f24289b;
        AbstractC2772Sd.H(j13 >= 16);
        k06.A(cr2.f24252a, 0, 16, false);
        cr2.E(0);
        int M8 = cr2.M();
        int M9 = cr2.M();
        int i12 = cr2.i();
        cr2.i();
        int M10 = cr2.M();
        int M11 = cr2.M();
        int i13 = ((int) j13) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            ((K0) r02).A(bArr, 0, i13, false);
            if (M8 == 65534) {
                if (i13 != 24) {
                    i = 0;
                    i6 = 65534;
                    bArr2 = bArr;
                    K0 k07 = (K0) r02;
                    k07.a((int) (k07.q() - k07.f25819w), false);
                    M4 m4 = new M4(i6, M9, i12, M10, M11, bArr2, i);
                    if (i6 == 17) {
                    }
                    this.f26060c = 3;
                    return 0;
                }
                Cr cr3 = new Cr(bArr);
                cr3.M();
                int M12 = cr3.M();
                if (M12 != 0 && M12 != M11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(M11).length() + String.valueOf(M12).length() + 33 + 19);
                    u1.h.h(sb2, "validBits ( ", M12, ")  != bitsPerSample( ", M11);
                    sb2.append(") are not supported");
                    throw U4.c(sb2.toString());
                }
                int i14 = cr3.i();
                if ((i14 >> 18) != 0 || (i14 != 0 && Integer.bitCount(i14) != M9)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 57 + String.valueOf(M9).length());
                    sb3.append("Channel mask ");
                    sb3.append(i14);
                    sb3.append(" is invalid or does not match channel count ");
                    sb3.append(M9);
                    throw U4.c(sb3.toString());
                }
                int M13 = cr3.M();
                byte[] bArr3 = new byte[14];
                cr3.H(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, AbstractC3043cl.f29557A) && !Arrays.equals(bArr3, AbstractC3043cl.f29558B)) {
                    throw U4.c("invalid wav format extension guid");
                }
                i = i14;
                bArr2 = bArr;
                i6 = M13;
                K0 k072 = (K0) r02;
                k072.a((int) (k072.q() - k072.f25819w), false);
                M4 m42 = new M4(i6, M9, i12, M10, M11, bArr2, i);
                if (i6 == 17) {
                    this.f26062e = new I4(this.f26058a, this.f26059b, m42);
                } else if (i6 == 6) {
                    this.f26062e = new K4(this.f26058a, this.f26059b, m42, com.anythink.basead.exoplayer.k.o.f8466x, -1);
                } else if (i6 == 7) {
                    this.f26062e = new K4(this.f26058a, this.f26059b, m42, com.anythink.basead.exoplayer.k.o.f8467y, -1);
                } else {
                    if (i6 != 1) {
                        if (i6 == 3) {
                            b9 = AbstractC3159eu.c(M11, ByteOrder.LITTLE_ENDIAN);
                            i9 = b9;
                            if (i9 == 0) {
                            }
                        } else if (i6 != 65534) {
                            i9 = 0;
                            if (i9 == 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i6).length() + 29);
                                sb4.append("Unsupported WAV format type: ");
                                sb4.append(i6);
                                throw U4.c(sb4.toString());
                            }
                            this.f26062e = new K4(this.f26058a, this.f26059b, m42, com.anythink.basead.exoplayer.k.o.f8465w, i9);
                        }
                    }
                    b9 = AbstractC3159eu.b(M11, ByteOrder.LITTLE_ENDIAN);
                    i9 = b9;
                    if (i9 == 0) {
                    }
                }
                this.f26060c = 3;
                return 0;
            }
        } else {
            bArr = AbstractC3159eu.f29994b;
        }
        i = 0;
        i6 = M8;
        bArr2 = bArr;
        K0 k0722 = (K0) r02;
        k0722.a((int) (k0722.q() - k0722.f25819w), false);
        M4 m422 = new M4(i6, M9, i12, M10, M11, bArr2, i);
        if (i6 == 17) {
        }
        this.f26060c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        CQ cq = (CQ) s02;
        this.f26058a = cq;
        this.f26059b = cq.C(0, 1);
        cq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f26060c = j6 == 0 ? 0 : 4;
        J4 j42 = this.f26062e;
        if (j42 != null) {
            j42.b(j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return AbstractC3043cl.o((K0) r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
