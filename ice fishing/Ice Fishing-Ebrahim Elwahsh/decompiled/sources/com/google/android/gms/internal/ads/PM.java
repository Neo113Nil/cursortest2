package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class PM extends AbstractC3199fL {
    private static final PM zzf;
    private static volatile GL zzg;
    private int zza;
    private String zzb = "";
    private InterfaceC3630nL zzc;
    private InterfaceC3630nL zzd;
    private String zze;

    static {
        PM pm = new PM();
        zzf = pm;
        AbstractC3199fL.u(PM.class, pm);
    }

    public PM() {
        JL jl = JL.f25761x;
        this.zzc = jl;
        this.zzd = jl;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new PM();
        }
        if (d2 == 4) {
            return new UL(zzf);
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
        synchronized (PM.class) {
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
