package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class L6 extends AbstractC3199fL {
    private static final L6 zzi;
    private static volatile GL zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        L6 l62 = new L6();
        zzi = l62;
        AbstractC3199fL.u(L6.class, l62);
    }

    public static K6 A() {
        return (K6) zzi.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void D(long j9) {
        this.zza |= 4;
        this.zzd = j9;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j9) {
        this.zza |= 16;
        this.zzf = j9;
    }

    public final /* synthetic */ void G(long j9) {
        this.zza |= 32;
        this.zzg = j9;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new L6();
        }
        if (d2 == 4) {
            return new K6(zzi);
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
        synchronized (L6.class) {
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
