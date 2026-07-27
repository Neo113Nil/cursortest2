package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3723p6 extends AbstractC3199fL {
    private static final C3723p6 zzi;
    private static volatile GL zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C3723p6 c3723p6 = new C3723p6();
        zzi = c3723p6;
        AbstractC3199fL.u(C3723p6.class, c3723p6);
    }

    public static C3669o6 A() {
        return (C3669o6) zzi.r();
    }

    public final /* synthetic */ void B(long j9) {
        this.zza |= 1;
        this.zzb = j9;
    }

    public final /* synthetic */ void C(long j9) {
        this.zza |= 2;
        this.zzc = j9;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j9) {
        this.zza |= 32;
        this.zzg = j9;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", C3293h6.f31154e, "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new C3723p6();
        }
        if (d2 == 4) {
            return new C3669o6(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzj;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3723p6.class) {
            try {
                gl = zzj;
                if (gl == null) {
                    gl = new C3144eL(zzi);
                    zzj = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
