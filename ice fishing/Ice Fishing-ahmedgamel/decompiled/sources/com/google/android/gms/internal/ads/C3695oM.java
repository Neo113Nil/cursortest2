package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.oM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3695oM extends VK {
    private static final C3695oM zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zza;
    private C3641nM zzb;
    private JK zzd;
    private JK zze;
    private int zzf;
    private byte zzg = 2;
    private InterfaceC3049cL zzc = C4233yL.f35935x;

    static {
        C3695oM c3695oM = new C3695oM();
        zzh = c3695oM;
        VK.u(C3695oM.class, c3695oM);
    }

    public C3695oM() {
        HK hk = JK.f26428u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static C3587mM A() {
        return (C3587mM) zzh.r();
    }

    public final void B(C3533lM c3533lM) {
        InterfaceC3049cL interfaceC3049cL = this.zzc;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzc = interfaceC3049cL.D(size + size);
        }
        this.zzc.add(c3533lM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        switch (AbstractC5050e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4287zL(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", C3533lM.class, "zzd", "zze", "zzf"});
            case 3:
                return new C3695oM();
            case 4:
                return new C3587mM(zzh);
            case 5:
                return zzh;
            case 6:
                InterfaceC4071vL interfaceC4071vL2 = zzi;
                if (interfaceC4071vL2 != null) {
                    return interfaceC4071vL2;
                }
                synchronized (C3695oM.class) {
                    try {
                        interfaceC4071vL = zzi;
                        if (interfaceC4071vL == null) {
                            interfaceC4071vL = new UK(zzh);
                            zzi = interfaceC4071vL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC4071vL;
            default:
                throw null;
        }
    }
}
