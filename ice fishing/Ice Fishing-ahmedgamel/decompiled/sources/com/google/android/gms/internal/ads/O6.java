package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class O6 extends VK {
    private static final O6 zzi;
    private static volatile InterfaceC4071vL zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        O6 o6 = new O6();
        zzi = o6;
        VK.u(O6.class, o6);
    }

    public static N6 A() {
        return (N6) zzi.r();
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

    public final /* synthetic */ void D(long j6) {
        this.zza |= 4;
        this.zzd = j6;
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

    public final /* synthetic */ void G(long j6) {
        this.zza |= 32;
        this.zzg = j6;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d9 == 3) {
            return new O6();
        }
        if (d9 == 4) {
            return new N6(zzi);
        }
        if (d9 == 5) {
            return zzi;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzj;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (O6.class) {
            try {
                interfaceC4071vL = zzj;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzi);
                    zzj = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
