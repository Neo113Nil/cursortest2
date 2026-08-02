package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.lM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3533lM extends VK {
    private static final C3533lM zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private JK zzb;
    private JK zzc;
    private byte zzd = 2;

    static {
        C3533lM c3533lM = new C3533lM();
        zze = c3533lM;
        VK.u(C3533lM.class, c3533lM);
    }

    public C3533lM() {
        HK hk = JK.f26428u;
        this.zzb = hk;
        this.zzc = hk;
    }

    public static C3479kM A() {
        return (C3479kM) zze.r();
    }

    public final /* synthetic */ void B(HK hk) {
        hk.getClass();
        this.zza |= 1;
        this.zzb = hk;
    }

    public final /* synthetic */ void C(JK jk) {
        jk.getClass();
        this.zza |= 2;
        this.zzc = jk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        switch (AbstractC5050e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4287zL(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new C3533lM();
            case 4:
                return new C3479kM(zze);
            case 5:
                return zze;
            case 6:
                InterfaceC4071vL interfaceC4071vL2 = zzf;
                if (interfaceC4071vL2 != null) {
                    return interfaceC4071vL2;
                }
                synchronized (C3533lM.class) {
                    try {
                        interfaceC4071vL = zzf;
                        if (interfaceC4071vL == null) {
                            interfaceC4071vL = new UK(zze);
                            zzf = interfaceC4071vL;
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
