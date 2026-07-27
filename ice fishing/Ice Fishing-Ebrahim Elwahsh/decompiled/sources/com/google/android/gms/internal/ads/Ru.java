package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Ru extends AbstractC3199fL {
    private static final Ru zzg;
    private static volatile GL zzh;
    private long zza;
    private InterfaceC3414jL zzb = C3254gL.f30989x;
    private InterfaceC3630nL zzc;
    private InterfaceC3630nL zzd;
    private InterfaceC3630nL zze;
    private InterfaceC3630nL zzf;

    static {
        Ru ru = new Ru();
        zzg = ru;
        AbstractC3199fL.u(Ru.class, ru);
    }

    public Ru() {
        JL jl = JL.f25761x;
        this.zzc = jl;
        this.zzd = jl;
        this.zze = jl;
        this.zzf = jl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new Ru();
        }
        if (d2 == 4) {
            return new F9(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzh;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (Ru.class) {
            try {
                gl = zzh;
                if (gl == null) {
                    gl = new C3144eL(zzg);
                    zzh = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
