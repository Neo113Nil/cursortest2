package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class L4 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public FQ f26858a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC3566m1 f26859b;

    /* renamed from: c, reason: collision with root package name */
    public int f26860c;

    /* renamed from: d, reason: collision with root package name */
    public long f26861d;

    /* renamed from: e, reason: collision with root package name */
    public J4 f26862e;

    /* renamed from: f, reason: collision with root package name */
    public int f26863f;

    /* renamed from: g, reason: collision with root package name */
    public long f26864g;

    static {
        int i = AbstractC2659Kg.f26727M;
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
        int i4;
        byte[] bArr2;
        int b9;
        int i6;
        this.f26859b.getClass();
        String str = AbstractC3182eu.f30782a;
        int i9 = this.f26860c;
        if (i9 == 0) {
            AbstractC2792Sd.H(((K0) r02).f26571w == 0);
            int i10 = this.f26863f;
            if (i10 != -1) {
                ((K0) r02).a(i10, false);
                this.f26860c = 4;
                return 0;
            }
            K0 k02 = (K0) r02;
            if (!AbstractC3066cl.o(k02)) {
                throw U4.a(null, "Unsupported or unrecognized wav file type.");
            }
            k02.a((int) (k02.q() - k02.f26571w), false);
            this.f26860c = 1;
            return 0;
        }
        long j6 = -1;
        if (i9 == 1) {
            Cr cr = new Cr(8);
            K0 k03 = (K0) r02;
            D a9 = D.a(k03, cr);
            if (a9.f25033a != 1685272116) {
                k03.f26573y = 0;
            } else {
                k03.d(8, false);
                cr.E(0);
                K0 k04 = (K0) r02;
                k04.E(cr.f24997a, 0, 8, false);
                j6 = cr.e();
                k04.a(((int) a9.f25034b) + 8, false);
            }
            this.f26861d = j6;
            this.f26860c = 2;
            return 0;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                AbstractC2792Sd.H(this.f26864g != -1);
                long j9 = this.f26864g - ((K0) r02).f26571w;
                J4 j42 = this.f26862e;
                j42.getClass();
                return j42.a((K0) r02, j9) ? -1 : 0;
            }
            ((K0) r02).f26573y = 0;
            K0 k05 = (K0) r02;
            D A9 = AbstractC3066cl.A(1684108385, k05, new Cr(8));
            k05.a(8, false);
            Pair create = Pair.create(Long.valueOf(k05.f26571w), Long.valueOf(A9.f25034b));
            this.f26863f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j10 = this.f26861d;
            if (j10 != -1 && longValue == 4294967295L) {
                longValue = j10;
            }
            long j11 = this.f26863f + longValue;
            this.f26864g = j11;
            long j12 = k05.f26570v;
            if (j12 != -1 && j11 > j12) {
                StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 29 + String.valueOf(j12).length());
                com.IceFishing.LiveIceFishing.k.z(sb, "Data exceeds input length: ", j11, ", ");
                sb.append(j12);
                AbstractC2991bG.y("WavExtractor", sb.toString());
                this.f26864g = j12;
                j11 = j12;
            }
            J4 j43 = this.f26862e;
            j43.getClass();
            j43.c(this.f26863f, j11);
            this.f26860c = 4;
            return 0;
        }
        Cr cr2 = new Cr(16);
        K0 k06 = (K0) r02;
        long j13 = AbstractC3066cl.A(1718449184, k06, cr2).f25034b;
        AbstractC2792Sd.H(j13 >= 16);
        k06.E(cr2.f24997a, 0, 16, false);
        cr2.E(0);
        int M8 = cr2.M();
        int M9 = cr2.M();
        int i11 = cr2.i();
        cr2.i();
        int M10 = cr2.M();
        int M11 = cr2.M();
        int i12 = ((int) j13) - 16;
        if (i12 > 0) {
            bArr = new byte[i12];
            ((K0) r02).E(bArr, 0, i12, false);
            if (M8 == 65534) {
                if (i12 != 24) {
                    i = 0;
                    i4 = 65534;
                    bArr2 = bArr;
                    K0 k07 = (K0) r02;
                    k07.a((int) (k07.q() - k07.f26571w), false);
                    M4 m42 = new M4(i4, M9, i11, M10, M11, bArr2, i);
                    if (i4 == 17) {
                    }
                    this.f26860c = 3;
                    return 0;
                }
                Cr cr3 = new Cr(bArr);
                cr3.M();
                int M12 = cr3.M();
                if (M12 != 0 && M12 != M11) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(M11).length() + String.valueOf(M12).length() + 33 + 19);
                    AbstractC5128c.g(sb2, "validBits ( ", M12, ")  != bitsPerSample( ", M11);
                    sb2.append(") are not supported");
                    throw U4.c(sb2.toString());
                }
                int i13 = cr3.i();
                if ((i13 >> 18) != 0 || (i13 != 0 && Integer.bitCount(i13) != M9)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 57 + String.valueOf(M9).length());
                    sb3.append("Channel mask ");
                    sb3.append(i13);
                    sb3.append(" is invalid or does not match channel count ");
                    sb3.append(M9);
                    throw U4.c(sb3.toString());
                }
                int M13 = cr3.M();
                byte[] bArr3 = new byte[14];
                cr3.H(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, AbstractC3066cl.f30342A) && !Arrays.equals(bArr3, AbstractC3066cl.f30343B)) {
                    throw U4.c("invalid wav format extension guid");
                }
                i = i13;
                bArr2 = bArr;
                i4 = M13;
                K0 k072 = (K0) r02;
                k072.a((int) (k072.q() - k072.f26571w), false);
                M4 m422 = new M4(i4, M9, i11, M10, M11, bArr2, i);
                if (i4 == 17) {
                    this.f26862e = new I4(this.f26858a, this.f26859b, m422);
                } else if (i4 == 6) {
                    this.f26862e = new K4(this.f26858a, this.f26859b, m422, com.anythink.basead.exoplayer.k.o.f9252x, -1);
                } else if (i4 == 7) {
                    this.f26862e = new K4(this.f26858a, this.f26859b, m422, com.anythink.basead.exoplayer.k.o.f9253y, -1);
                } else {
                    if (i4 != 1) {
                        if (i4 == 3) {
                            b9 = AbstractC3182eu.c(M11, ByteOrder.LITTLE_ENDIAN);
                            i6 = b9;
                            if (i6 == 0) {
                            }
                        } else if (i4 != 65534) {
                            i6 = 0;
                            if (i6 == 0) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i4).length() + 29);
                                sb4.append("Unsupported WAV format type: ");
                                sb4.append(i4);
                                throw U4.c(sb4.toString());
                            }
                            this.f26862e = new K4(this.f26858a, this.f26859b, m422, com.anythink.basead.exoplayer.k.o.f9251w, i6);
                        }
                    }
                    b9 = AbstractC3182eu.b(M11, ByteOrder.LITTLE_ENDIAN);
                    i6 = b9;
                    if (i6 == 0) {
                    }
                }
                this.f26860c = 3;
                return 0;
            }
        } else {
            bArr = AbstractC3182eu.f30783b;
        }
        i = 0;
        i4 = M8;
        bArr2 = bArr;
        K0 k0722 = (K0) r02;
        k0722.a((int) (k0722.q() - k0722.f26571w), false);
        M4 m4222 = new M4(i4, M9, i11, M10, M11, bArr2, i);
        if (i4 == 17) {
        }
        this.f26860c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void b(S0 s02) {
        FQ fq = (FQ) s02;
        this.f26858a = fq;
        this.f26859b = fq.C(0, 1);
        fq.B();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void c(long j6, long j9) {
        this.f26860c = j6 == 0 ? 0 : 4;
        J4 j42 = this.f26862e;
        if (j42 != null) {
            j42.b(j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean d(R0 r02) {
        return AbstractC3066cl.o((K0) r02);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final void e() {
    }
}
