package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.vM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4072vM extends VK {
    private static final C4072vM zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private JK zzd;
    private JK zze;

    static {
        C4072vM c4072vM = new C4072vM();
        zzf = c4072vM;
        VK.u(C4072vM.class, c4072vM);
    }

    public C4072vM() {
        HK hk = JK.f26428u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static C4018uM A() {
        return (C4018uM) zzf.r();
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", C3050cM.f30238j, "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C4072vM();
        }
        if (d9 == 4) {
            return new C4018uM(zzf);
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
        synchronized (C4072vM.class) {
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
