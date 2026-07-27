package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class TM extends VK {
    private static final TM zzl;
    private static volatile InterfaceC4048vL zzm;
    private int zza;
    private JK zzb = JK.f25675u;
    private ZK zzc;
    private long zzd;
    private ZK zze;
    private InterfaceC3026cL zzf;
    private String zzg;
    private InterfaceC3026cL zzh;
    private UM zzi;
    private VM zzj;
    private C3348iK zzk;

    static {
        TM tm = new TM();
        zzl = tm;
        VK.u(TM.class, tm);
    }

    public TM() {
        WK wk = WK.f28348x;
        this.zzc = wk;
        this.zze = wk;
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzf = c4210yL;
        this.zzg = "";
        this.zzh = c4210yL;
    }

    public static TM A(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzl, bArr, bArr.length, pk);
        VK.z(y7);
        return (TM) y7;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", OM.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (d2 == 3) {
            return new TM();
        }
        if (d2 == 4) {
            return new SM(zzl);
        }
        if (d2 == 5) {
            return zzl;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzm;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (TM.class) {
            try {
                interfaceC4048vL = zzm;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzl);
                    zzm = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
