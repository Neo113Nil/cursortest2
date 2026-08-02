package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class S6 extends VK {
    private static final S6 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private InterfaceC3049cL zzb = C4233yL.f35935x;
    private JK zzc = JK.f26428u;
    private int zzd = 1;
    private int zze = 1;

    static {
        S6 s62 = new S6();
        zzf = s62;
        VK.u(S6.class, s62);
    }

    public static R6 A() {
        return (R6) zzf.r();
    }

    public final void B(HK hk) {
        hk.getClass();
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(hk);
    }

    public final /* synthetic */ void C(HK hk) {
        hk.getClass();
        this.zza |= 1;
        this.zzc = hk;
    }

    public final /* synthetic */ void D(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", C3517l6.f32506n, "zze", C3517l6.f32504l});
        }
        if (d9 == 3) {
            return new S6();
        }
        if (d9 == 4) {
            return new R6(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (S6.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
