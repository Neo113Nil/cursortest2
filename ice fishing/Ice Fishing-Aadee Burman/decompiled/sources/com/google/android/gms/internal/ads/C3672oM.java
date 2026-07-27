package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.oM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3672oM extends VK {
    private static final C3672oM zzh;
    private static volatile InterfaceC4048vL zzi;
    private int zza;
    private C3618nM zzb;
    private JK zzd;
    private JK zze;
    private int zzf;
    private byte zzg = 2;
    private InterfaceC3026cL zzc = C4210yL.f35149x;

    static {
        C3672oM c3672oM = new C3672oM();
        zzh = c3672oM;
        VK.u(C3672oM.class, c3672oM);
    }

    public C3672oM() {
        HK hk = JK.f25675u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static C3564mM A() {
        return (C3564mM) zzh.r();
    }

    public final void B(C3510lM c3510lM) {
        InterfaceC3026cL interfaceC3026cL = this.zzc;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzc = interfaceC3026cL.D(size + size);
        }
        this.zzc.add(c3510lM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        switch (AbstractC5049e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4264zL(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", C3510lM.class, "zzd", "zze", "zzf"});
            case 3:
                return new C3672oM();
            case 4:
                return new C3564mM(zzh);
            case 5:
                return zzh;
            case 6:
                InterfaceC4048vL interfaceC4048vL2 = zzi;
                if (interfaceC4048vL2 != null) {
                    return interfaceC4048vL2;
                }
                synchronized (C3672oM.class) {
                    try {
                        interfaceC4048vL = zzi;
                        if (interfaceC4048vL == null) {
                            interfaceC4048vL = new UK(zzh);
                            zzi = interfaceC4048vL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC4048vL;
            default:
                throw null;
        }
    }
}
