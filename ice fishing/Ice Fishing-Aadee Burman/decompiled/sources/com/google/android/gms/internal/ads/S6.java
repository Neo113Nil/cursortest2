package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class S6 extends VK {
    private static final S6 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private InterfaceC3026cL zzb = C4210yL.f35149x;
    private JK zzc = JK.f25675u;
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
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", C3494l6.f31726n, "zze", C3494l6.f31724l});
        }
        if (d2 == 3) {
            return new S6();
        }
        if (d2 == 4) {
            return new R6(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (S6.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
