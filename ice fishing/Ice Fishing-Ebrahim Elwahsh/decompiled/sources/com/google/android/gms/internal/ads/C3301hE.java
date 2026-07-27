package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.hE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3301hE extends AbstractC3199fL {
    private static final C3301hE zzd;
    private static volatile GL zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        C3301hE c3301hE = new C3301hE();
        zzd = c3301hE;
        AbstractC3199fL.u(C3301hE.class, c3301hE);
    }

    public static C3247gE A() {
        return (C3247gE) zzd.r();
    }

    public final /* synthetic */ void B(long j9) {
        this.zza |= 1;
        this.zzb = j9;
    }

    public final /* synthetic */ void C(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C3293h6.f31148C});
        }
        if (d2 == 3) {
            return new C3301hE();
        }
        if (d2 == 4) {
            return new C3247gE(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3301hE.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
