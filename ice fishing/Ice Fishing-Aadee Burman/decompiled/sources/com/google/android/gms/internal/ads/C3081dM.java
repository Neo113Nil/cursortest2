package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.dM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3081dM extends VK {
    private static final C3081dM zzy;
    private static volatile InterfaceC4048vL zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private InterfaceC3026cL zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private InterfaceC3026cL zzo;
    private boolean zzp;
    private long zzu;
    private ZK zzv;
    private boolean zzw;
    private ZK zzx;

    static {
        C3081dM c3081dM = new C3081dM();
        zzy = c3081dM;
        VK.u(C3081dM.class, c3081dM);
    }

    public C3081dM() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zze = c4210yL;
        this.zzj = "";
        this.zzo = c4210yL;
        WK wk = WK.f28348x;
        this.zzv = wk;
        this.zzx = wk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", C3027cM.f29450d, "zzc", "zzd", "zze", "zzf", C3027cM.f29448b, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C2974bM.class, "zzp", "zzu", "zzv", C3494l6.f31713D, "zzw", "zzx", C3027cM.f29449c});
        }
        if (d2 == 3) {
            return new C3081dM();
        }
        if (d2 == 4) {
            return new C3294hK(zzy);
        }
        if (d2 == 5) {
            return zzy;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzz;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3081dM.class) {
            try {
                interfaceC4048vL = zzz;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzy);
                    zzz = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
