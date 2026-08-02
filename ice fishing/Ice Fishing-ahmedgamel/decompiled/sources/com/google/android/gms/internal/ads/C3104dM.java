package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.dM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3104dM extends VK {
    private static final C3104dM zzy;
    private static volatile InterfaceC4071vL zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private InterfaceC3049cL zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private InterfaceC3049cL zzo;
    private boolean zzp;
    private long zzu;
    private ZK zzv;
    private boolean zzw;
    private ZK zzx;

    static {
        C3104dM c3104dM = new C3104dM();
        zzy = c3104dM;
        VK.u(C3104dM.class, c3104dM);
    }

    public C3104dM() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zze = c4233yL;
        this.zzj = "";
        this.zzo = c4233yL;
        WK wk = WK.f29146x;
        this.zzv = wk;
        this.zzx = wk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", C3050cM.f30233d, "zzc", "zzd", "zze", "zzf", C3050cM.f30231b, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C2997bM.class, "zzp", "zzu", "zzv", C3517l6.f32493D, "zzw", "zzx", C3050cM.f30232c});
        }
        if (d9 == 3) {
            return new C3104dM();
        }
        if (d9 == 4) {
            return new C3317hK(zzy);
        }
        if (d9 == 5) {
            return zzy;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzz;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3104dM.class) {
            try {
                interfaceC4071vL = zzz;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzy);
                    zzz = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
