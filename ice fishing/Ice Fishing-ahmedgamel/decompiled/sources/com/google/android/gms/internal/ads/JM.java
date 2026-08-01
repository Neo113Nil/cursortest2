package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class JM extends VK {
    private static final JM zzp;
    private static volatile InterfaceC4048vL zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private InterfaceC3026cL zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private InterfaceC3026cL zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        JM jm = new JM();
        zzp = jm;
        VK.u(JM.class, jm);
    }

    public JM() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zze = c4210yL;
        this.zzf = "";
        this.zzg = "";
        this.zzj = c4210yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", C3027cM.f29463r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", IM.class, "zzc", "zzk", C3027cM.f29462q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (d2 == 3) {
            return new JM();
        }
        if (d2 == 4) {
            return new C3294hK(zzp);
        }
        if (d2 == 5) {
            return zzp;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzu;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (JM.class) {
            try {
                interfaceC4048vL = zzu;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzp);
                    zzu = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
