package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3615n6 extends AbstractC3199fL {
    private static final C3615n6 zzg;
    private static volatile GL zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C3615n6 c3615n6 = new C3615n6();
        zzg = c3615n6;
        AbstractC3199fL.u(C3615n6.class, c3615n6);
    }

    public static C3615n6 D() {
        return zzg;
    }

    public final boolean A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzc;
    }

    public final boolean C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3615n6();
        }
        if (d2 == 4) {
            return new C3453k6(zzg);
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
        synchronized (C3615n6.class) {
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
