package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.qM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3803qM extends VK {
    private static final C3803qM zzi;
    private static volatile InterfaceC4071vL zzj;
    private int zza;
    private C3749pM zzb;
    private JK zzd;
    private JK zze;
    private int zzf;
    private JK zzg;
    private byte zzh = 2;
    private InterfaceC3049cL zzc = C4233yL.f35935x;

    static {
        C3803qM c3803qM = new C3803qM();
        zzi = c3803qM;
        VK.u(C3803qM.class, c3803qM);
    }

    public C3803qM() {
        HK hk = JK.f26428u;
        this.zzd = hk;
        this.zze = hk;
        this.zzg = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        switch (AbstractC5050e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4287zL(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", C3533lM.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new C3803qM();
            case 4:
                return new C3317hK(zzi);
            case 5:
                return zzi;
            case 6:
                InterfaceC4071vL interfaceC4071vL2 = zzj;
                if (interfaceC4071vL2 != null) {
                    return interfaceC4071vL2;
                }
                synchronized (C3803qM.class) {
                    try {
                        interfaceC4071vL = zzj;
                        if (interfaceC4071vL == null) {
                            interfaceC4071vL = new UK(zzi);
                            zzj = interfaceC4071vL;
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
