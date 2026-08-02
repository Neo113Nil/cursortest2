package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class JM extends VK {
    private static final JM zzp;
    private static volatile InterfaceC4071vL zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private InterfaceC3049cL zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private InterfaceC3049cL zzj;
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
        C4233yL c4233yL = C4233yL.f35935x;
        this.zze = c4233yL;
        this.zzf = "";
        this.zzg = "";
        this.zzj = c4233yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", C3050cM.f30246r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", IM.class, "zzc", "zzk", C3050cM.f30245q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (d9 == 3) {
            return new JM();
        }
        if (d9 == 4) {
            return new C3317hK(zzp);
        }
        if (d9 == 5) {
            return zzp;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzu;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (JM.class) {
            try {
                interfaceC4071vL = zzu;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzp);
                    zzu = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
