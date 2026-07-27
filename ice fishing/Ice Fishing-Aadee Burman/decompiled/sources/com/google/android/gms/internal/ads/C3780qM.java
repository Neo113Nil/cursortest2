package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.qM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3780qM extends VK {
    private static final C3780qM zzi;
    private static volatile InterfaceC4048vL zzj;
    private int zza;
    private C3726pM zzb;
    private JK zzd;
    private JK zze;
    private int zzf;
    private JK zzg;
    private byte zzh = 2;
    private InterfaceC3026cL zzc = C4210yL.f35149x;

    static {
        C3780qM c3780qM = new C3780qM();
        zzi = c3780qM;
        VK.u(C3780qM.class, c3780qM);
    }

    public C3780qM() {
        HK hk = JK.f25675u;
        this.zzd = hk;
        this.zze = hk;
        this.zzg = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        switch (AbstractC5049e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4264zL(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", C3510lM.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new C3780qM();
            case 4:
                return new C3294hK(zzi);
            case 5:
                return zzi;
            case 6:
                InterfaceC4048vL interfaceC4048vL2 = zzj;
                if (interfaceC4048vL2 != null) {
                    return interfaceC4048vL2;
                }
                synchronized (C3780qM.class) {
                    try {
                        interfaceC4048vL = zzj;
                        if (interfaceC4048vL == null) {
                            interfaceC4048vL = new UK(zzi);
                            zzj = interfaceC4048vL;
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
