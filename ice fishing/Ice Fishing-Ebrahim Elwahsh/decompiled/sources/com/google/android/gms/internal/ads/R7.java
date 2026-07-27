package com.google.android.gms.internal.ads;

import android.os.Build;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class R7 extends AbstractC3199fL {
    private static final R7 zzj;
    private static volatile GL zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private SK zzb = SK.f27529u;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        R7 r72 = new R7();
        zzj = r72;
        AbstractC3199fL.u(R7.class, r72);
    }

    public static Q7 A() {
        return (Q7) zzj.r();
    }

    public final /* synthetic */ void B(QK qk) {
        qk.getClass();
        this.zza |= 1;
        this.zzb = qk;
    }

    public final /* synthetic */ void C(long j9) {
        this.zza |= 2;
        this.zzc = j9;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
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

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final void I(int i) {
        this.zzi = i - 2;
        this.zza |= 128;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new R7();
        }
        if (d2 == 4) {
            return new Q7(zzj);
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
        synchronized (R7.class) {
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
