package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3497l9 extends VK {
    private static final C3497l9 zzG;
    private static volatile InterfaceC4048vL zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final InterfaceC2919aL zzx = new V2(26);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private ZK zzw = WK.f28348x;
    private C3337i9 zzy;
    private int zzz;

    static {
        C3497l9 c3497l9 = new C3497l9();
        zzG = c3497l9;
        VK.u(C3497l9.class, c3497l9);
    }

    public static C3497l9 P(byte[] bArr) {
        C3497l9 c3497l9 = zzG;
        int length = bArr.length;
        PK pk = PK.f26757a;
        int i = BK.f23877a;
        VK y7 = VK.y(c3497l9, bArr, length, PK.f26758b);
        VK.z(y7);
        return (C3497l9) y7;
    }

    public static C3443k9 Q() {
        return (C3443k9) zzG.r();
    }

    public final void A(long j6) {
        this.zzn |= 1;
        this.zzo = j6;
    }

    public final void B(int i) {
        this.zzp = com.anythink.basead.exoplayer.f.f.d(i);
        this.zzn |= 2;
    }

    public final void C(long j6) {
        this.zzn |= 4;
        this.zzu = j6;
    }

    public final void D(long j6) {
        this.zzn |= 8;
        this.zzv = j6;
    }

    public final void E(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((AK) randomAccess).f23663n) {
            WK wk = (WK) randomAccess;
            int i = wk.f28350v;
            this.zzw = wk.D(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q9 q9 = (Q9) it.next();
            ((WK) this.zzw).e(q9.f26998n);
        }
    }

    public final void F(C3337i9 c3337i9) {
        this.zzy = c3337i9;
        this.zzn |= 16;
    }

    public final void G(int i) {
        this.zzz = com.anythink.basead.exoplayer.f.f.d(i);
        this.zzn |= 32;
    }

    public final void H(int i) {
        this.zzA = com.anythink.basead.exoplayer.f.f.d(i);
        this.zzn |= 64;
    }

    public final void I(int i) {
        this.zzB = com.anythink.basead.exoplayer.f.f.d(i);
        this.zzn |= 128;
    }

    public final void J(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void K(int i) {
        this.zzD = com.anythink.basead.exoplayer.f.f.d(i);
        this.zzn |= 512;
    }

    public final void L(EnumC3605n9 enumC3605n9) {
        this.zzE = enumC3605n9.f32698n;
        this.zzn |= 1024;
    }

    public final void M(long j6) {
        this.zzn |= 2048;
        this.zzF = j6;
    }

    public final long N() {
        return this.zzo;
    }

    public final int O() {
        int i = this.zzp;
        int i6 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3494l6 c3494l6 = C3494l6.f31736x;
            return new C4264zL(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", c3494l6, "zzu", "zzv", "zzw", C3494l6.f31734v, "zzy", "zzz", c3494l6, "zzA", c3494l6, "zzB", c3494l6, "zzC", "zzD", c3494l6, "zzE", C3494l6.f31731s, "zzF"});
        }
        if (d2 == 3) {
            return new C3497l9();
        }
        if (d2 == 4) {
            return new C3443k9(zzG);
        }
        if (d2 == 5) {
            return zzG;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzH;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3497l9.class) {
            try {
                interfaceC4048vL = zzH;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzG);
                    zzH = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
