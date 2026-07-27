package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Tu extends AbstractC3199fL {
    private static final Tu zzc;
    private static volatile GL zzd;
    private int zza;
    private long zzb;

    static {
        Tu tu = new Tu();
        zzc = tu;
        AbstractC3199fL.u(Tu.class, tu);
    }

    public static Su A() {
        return (Su) zzc.r();
    }

    public final /* synthetic */ void B(long j9) {
        this.zzb = j9;
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new Tu();
        }
        if (d2 == 4) {
            return new Su(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (Tu.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
