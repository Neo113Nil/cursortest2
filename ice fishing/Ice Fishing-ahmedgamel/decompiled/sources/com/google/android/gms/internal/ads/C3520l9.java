package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3520l9 extends VK {
    private static final C3520l9 zzG;
    private static volatile InterfaceC4071vL zzH = null;
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
    private static final InterfaceC2942aL zzx = new V2(26);
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
    private ZK zzw = WK.f29146x;
    private C3360i9 zzy;
    private int zzz;

    static {
        C3520l9 c3520l9 = new C3520l9();
        zzG = c3520l9;
        VK.u(C3520l9.class, c3520l9);
    }

    public static C3520l9 P(byte[] bArr) {
        C3520l9 c3520l9 = zzG;
        int length = bArr.length;
        PK pk = PK.f27540a;
        int i = BK.f24648a;
        VK y7 = VK.y(c3520l9, bArr, length, PK.f27541b);
        VK.z(y7);
        return (C3520l9) y7;
    }

    public static C3466k9 Q() {
        return (C3466k9) zzG.r();
    }

    public final void A(long j6) {
        this.zzn |= 1;
        this.zzo = j6;
    }

    public final void B(int i) {
        this.zzp = com.IceFishing.LiveIceFishing.k.d(i);
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
        if (!((AK) randomAccess).f24443n) {
            WK wk = (WK) randomAccess;
            int i = wk.f29148v;
            this.zzw = wk.D(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q9 q9 = (Q9) it.next();
            ((WK) this.zzw).e(q9.f27785n);
        }
    }

    public final void F(C3360i9 c3360i9) {
        this.zzy = c3360i9;
        this.zzn |= 16;
    }

    public final void G(int i) {
        this.zzz = com.IceFishing.LiveIceFishing.k.d(i);
        this.zzn |= 32;
    }

    public final void H(int i) {
        this.zzA = com.IceFishing.LiveIceFishing.k.d(i);
        this.zzn |= 64;
    }

    public final void I(int i) {
        this.zzB = com.IceFishing.LiveIceFishing.k.d(i);
        this.zzn |= 128;
    }

    public final void J(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void K(int i) {
        this.zzD = com.IceFishing.LiveIceFishing.k.d(i);
        this.zzn |= 512;
    }

    public final void L(EnumC3628n9 enumC3628n9) {
        this.zzE = enumC3628n9.f33476n;
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
        int i4 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32516x;
            return new C4287zL(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", c3517l6, "zzu", "zzv", "zzw", C3517l6.f32514v, "zzy", "zzz", c3517l6, "zzA", c3517l6, "zzB", c3517l6, "zzC", "zzD", c3517l6, "zzE", C3517l6.f32511s, "zzF"});
        }
        if (d9 == 3) {
            return new C3520l9();
        }
        if (d9 == 4) {
            return new C3466k9(zzG);
        }
        if (d9 == 5) {
            return zzG;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzH;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3520l9.class) {
            try {
                interfaceC4071vL = zzH;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzG);
                    zzH = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
