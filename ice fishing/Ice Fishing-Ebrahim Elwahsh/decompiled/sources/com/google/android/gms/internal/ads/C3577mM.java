package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.mM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3577mM extends AbstractC3199fL {
    private static final C3577mM zzd;
    private static volatile GL zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        C3577mM c3577mM = new C3577mM();
        zzd = c3577mM;
        AbstractC3199fL.u(C3577mM.class, c3577mM);
    }

    public static C3523lM A() {
        return (C3523lM) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void C(long j9) {
        this.zzb = j9;
    }

    public final /* synthetic */ void D(long j9) {
        this.zzc = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3577mM();
        }
        if (d2 == 4) {
            return new C3523lM(zzd);
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
        synchronized (C3577mM.class) {
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
