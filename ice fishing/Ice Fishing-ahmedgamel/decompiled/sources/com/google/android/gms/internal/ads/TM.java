package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class TM extends VK {
    private static final TM zzl;
    private static volatile InterfaceC4071vL zzm;
    private int zza;
    private JK zzb = JK.f26428u;
    private ZK zzc;
    private long zzd;
    private ZK zze;
    private InterfaceC3049cL zzf;
    private String zzg;
    private InterfaceC3049cL zzh;
    private UM zzi;
    private VM zzj;
    private C3371iK zzk;

    static {
        TM tm = new TM();
        zzl = tm;
        VK.u(TM.class, tm);
    }

    public TM() {
        WK wk = WK.f29146x;
        this.zzc = wk;
        this.zze = wk;
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzf = c4233yL;
        this.zzg = "";
        this.zzh = c4233yL;
    }

    public static TM A(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzl, bArr, bArr.length, pk);
        VK.z(y7);
        return (TM) y7;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", OM.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (d9 == 3) {
            return new TM();
        }
        if (d9 == 4) {
            return new SM(zzl);
        }
        if (d9 == 5) {
            return zzl;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzm;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (TM.class) {
            try {
                interfaceC4071vL = zzm;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzl);
                    zzm = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
