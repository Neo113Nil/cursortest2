package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.lM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3510lM extends VK {
    private static final C3510lM zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private JK zzb;
    private JK zzc;
    private byte zzd = 2;

    static {
        C3510lM c3510lM = new C3510lM();
        zze = c3510lM;
        VK.u(C3510lM.class, c3510lM);
    }

    public C3510lM() {
        HK hk = JK.f25675u;
        this.zzb = hk;
        this.zzc = hk;
    }

    public static C3456kM A() {
        return (C3456kM) zze.r();
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
        InterfaceC4048vL interfaceC4048vL;
        switch (AbstractC5049e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4264zL(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new C3510lM();
            case 4:
                return new C3456kM(zze);
            case 5:
                return zze;
            case 6:
                InterfaceC4048vL interfaceC4048vL2 = zzf;
                if (interfaceC4048vL2 != null) {
                    return interfaceC4048vL2;
                }
                synchronized (C3510lM.class) {
                    try {
                        interfaceC4048vL = zzf;
                        if (interfaceC4048vL == null) {
                            interfaceC4048vL = new UK(zze);
                            zzf = interfaceC4048vL;
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
