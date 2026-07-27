package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.vM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4049vM extends VK {
    private static final C4049vM zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private JK zzd;
    private JK zze;

    static {
        C4049vM c4049vM = new C4049vM();
        zzf = c4049vM;
        VK.u(C4049vM.class, c4049vM);
    }

    public C4049vM() {
        HK hk = JK.f25675u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static C3995uM A() {
        return (C3995uM) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void C(JK jk) {
        jk.getClass();
        this.zza |= 4;
        this.zzd = jk;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", C3027cM.f29455j, "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C4049vM();
        }
        if (d2 == 4) {
            return new C3995uM(zzf);
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
        synchronized (C4049vM.class) {
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
