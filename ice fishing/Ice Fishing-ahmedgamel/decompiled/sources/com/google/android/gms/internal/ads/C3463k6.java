package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.RandomAccess;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.k6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3463k6 extends VK {
    private static final C3463k6 zzu;
    private static volatile InterfaceC4071vL zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private InterfaceC3049cL zzb = C4233yL.f35935x;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private ZK zzn = WK.f29146x;

    static {
        C3463k6 c3463k6 = new C3463k6();
        zzu = c3463k6;
        VK.u(C3463k6.class, c3463k6);
    }

    public static C3409j6 A() {
        return (C3409j6) zzu.r();
    }

    public final void B(C3894s6 c3894s6) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(c3894s6);
    }

    public final void C() {
        this.zzb = C4233yL.f35935x;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 1;
        this.zzc = j6;
    }

    public final /* synthetic */ void E(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void I(long j6) {
        this.zza |= 64;
        this.zzi = j6;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void L(long j6) {
        this.zza |= 512;
        this.zzl = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zza |= 1024;
        this.zzm = j6;
    }

    public final void N(ZK zk) {
        RandomAccess randomAccess = this.zzn;
        if (!((AK) randomAccess).f24443n) {
            WK wk = (WK) randomAccess;
            int i = wk.f29148v;
            this.zzn = wk.D(i + i);
        }
        AbstractC4286zK.e(zk, this.zzn);
    }

    public final /* synthetic */ void O(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    public final void P(int i) {
        this.zzo = i - 2;
        this.zza |= 2048;
    }

    public final /* synthetic */ void Q(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", C3894s6.class, "zzc", "zzd", "zze", "zzf", "zzg", C3517l6.f32497d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (d9 == 3) {
            return new C3463k6();
        }
        if (d9 == 4) {
            return new C3409j6(zzu);
        }
        if (d9 == 5) {
            return zzu;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzv;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3463k6.class) {
            try {
                interfaceC4071vL = zzv;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzu);
                    zzv = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
