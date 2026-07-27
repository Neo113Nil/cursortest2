package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3350i9 extends AbstractC3199fL {
    private static final C3350i9 zzG;
    private static volatile GL zzH = null;
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
    private static final InterfaceC3468kL zzx = new T2(26);
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
    private InterfaceC3414jL zzw = C3254gL.f30989x;
    private C3187f9 zzy;
    private int zzz;

    static {
        C3350i9 c3350i9 = new C3350i9();
        zzG = c3350i9;
        AbstractC3199fL.u(C3350i9.class, c3350i9);
    }

    public static C3350i9 P(byte[] bArr) {
        C3350i9 c3350i9 = zzG;
        int length = bArr.length;
        YK yk = YK.f28820a;
        int i = KK.f25952a;
        AbstractC3199fL y6 = AbstractC3199fL.y(c3350i9, bArr, length, YK.f28821b);
        AbstractC3199fL.z(y6);
        return (C3350i9) y6;
    }

    public static C3296h9 Q() {
        return (C3296h9) zzG.r();
    }

    public final void A(long j9) {
        this.zzn |= 1;
        this.zzo = j9;
    }

    public final void B(int i) {
        this.zzp = com.anythink.basead.b.c.i.d(i);
        this.zzn |= 2;
    }

    public final void C(long j9) {
        this.zzn |= 4;
        this.zzu = j9;
    }

    public final void D(long j9) {
        this.zzn |= 8;
        this.zzv = j9;
    }

    public final void E(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((JK) randomAccess).f25759n) {
            C3254gL c3254gL = (C3254gL) randomAccess;
            int i = c3254gL.f30991v;
            this.zzw = c3254gL.A(i + i);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N9 n9 = (N9) it.next();
            ((C3254gL) this.zzw).e(n9.f26489n);
        }
    }

    public final void F(C3187f9 c3187f9) {
        this.zzy = c3187f9;
        this.zzn |= 16;
    }

    public final void G(int i) {
        this.zzz = com.anythink.basead.b.c.i.d(i);
        this.zzn |= 32;
    }

    public final void H(int i) {
        this.zzA = com.anythink.basead.b.c.i.d(i);
        this.zzn |= 64;
    }

    public final void I(int i) {
        this.zzB = com.anythink.basead.b.c.i.d(i);
        this.zzn |= 128;
    }

    public final void J(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void K(int i) {
        this.zzD = com.anythink.basead.b.c.i.d(i);
        this.zzn |= 512;
    }

    public final void L(EnumC3456k9 enumC3456k9) {
        this.zzE = enumC3456k9.f32271n;
        this.zzn |= 1024;
    }

    public final void M(long j9) {
        this.zzn |= 2048;
        this.zzF = j9;
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

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31172x;
            return new KL(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", c3293h6, "zzu", "zzv", "zzw", C3293h6.f31170v, "zzy", "zzz", c3293h6, "zzA", c3293h6, "zzB", c3293h6, "zzC", "zzD", c3293h6, "zzE", C3293h6.f31167s, "zzF"});
        }
        if (d2 == 3) {
            return new C3350i9();
        }
        if (d2 == 4) {
            return new C3296h9(zzG);
        }
        if (d2 == 5) {
            return zzG;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzH;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3350i9.class) {
            try {
                gl = zzH;
                if (gl == null) {
                    gl = new C3144eL(zzG);
                    zzH = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
