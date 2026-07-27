package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.uv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4034uv extends AbstractC3199fL {
    private static final C4034uv zzf;
    private static volatile GL zzg;
    private long zza;
    private long zzb;
    private InterfaceC3630nL zzc;
    private InterfaceC3630nL zzd;
    private InterfaceC3630nL zze;

    static {
        C4034uv c4034uv = new C4034uv();
        zzf = c4034uv;
        AbstractC3199fL.u(C4034uv.class, c4034uv);
    }

    public C4034uv() {
        JL jl = JL.f25761x;
        this.zzc = jl;
        this.zzd = jl;
        this.zze = jl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C4034uv();
        }
        if (d2 == 4) {
            return new F9(zzf);
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
        synchronized (C4034uv.class) {
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
