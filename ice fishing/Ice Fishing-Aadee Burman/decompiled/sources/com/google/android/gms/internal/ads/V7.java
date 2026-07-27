package com.google.android.gms.internal.ads;

import android.os.Build;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class V7 extends VK {
    private static final V7 zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private JK zzb = JK.f25675u;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        V7 v72 = new V7();
        zzj = v72;
        VK.u(V7.class, v72);
    }

    public static T7 A() {
        return (T7) zzj.r();
    }

    public final /* synthetic */ void B(HK hk) {
        hk.getClass();
        this.zza |= 1;
        this.zzb = hk;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
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

    public final /* synthetic */ void F(long j6) {
        this.zza |= 16;
        this.zzf = j6;
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

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new V7();
        }
        if (d2 == 4) {
            return new T7(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (V7.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
