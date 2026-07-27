package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.hN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3310hN extends AbstractC3199fL {
    private static final C3310hN zzj;
    private static volatile GL zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private InterfaceC3630nL zzd;
    private InterfaceC3630nL zze;
    private InterfaceC3630nL zzf;
    private int zzg;
    private C2928aN zzh;
    private String zzi;

    static {
        C3310hN c3310hN = new C3310hN();
        zzj = c3310hN;
        AbstractC3199fL.u(C3310hN.class, c3310hN);
    }

    public C3310hN() {
        JL jl = JL.f25761x;
        this.zzd = jl;
        this.zze = jl;
        this.zzf = jl;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", C3037cN.class, "zze", C3201fN.class, "zzg", "zzb", "zzf", C3524lN.class, "zzi", "zzh"});
        }
        if (d2 == 3) {
            return new C3310hN();
        }
        if (d2 == 4) {
            return new UL(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzk;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3310hN.class) {
            try {
                gl = zzk;
                if (gl == null) {
                    gl = new C3144eL(zzj);
                    zzk = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
