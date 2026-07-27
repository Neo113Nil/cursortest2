package com.google.android.gms.internal.ads;

import java.util.RandomAccess;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Lw extends AbstractC3199fL {
    private static final Lw zzf;
    private static volatile GL zzg;
    private int zza;
    private InterfaceC3414jL zzb = C3254gL.f30989x;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        Lw lw = new Lw();
        zzf = lw;
        AbstractC3199fL.u(Lw.class, lw);
    }

    public static Kw A() {
        return (Kw) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void C(int i) {
        RandomAccess randomAccess = this.zzb;
        if (!((JK) randomAccess).f25759n) {
            C3254gL c3254gL = (C3254gL) randomAccess;
            int i4 = c3254gL.f30991v;
            this.zzb = c3254gL.A(i4 + i4);
        }
        ((C3254gL) this.zzb).e(2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", C3293h6.f31173y, "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new Lw();
        }
        if (d2 == 4) {
            return new Kw(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (Lw.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
