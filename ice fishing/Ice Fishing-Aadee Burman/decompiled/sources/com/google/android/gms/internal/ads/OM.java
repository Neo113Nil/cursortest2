package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class OM extends VK {
    private static final OM zzn;
    private static volatile InterfaceC4048vL zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private QM zzk;
    private NM zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        OM om = new OM();
        zzn = om;
        VK.u(OM.class, om);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", C3027cM.f29466u, "zze", C3027cM.f29465t, "zzf", "zzg", "zzh", "zzi", "zzj", C3027cM.f29464s, "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new OM();
        }
        if (d2 == 4) {
            return new C3294hK(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzo;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (OM.class) {
            try {
                interfaceC4048vL = zzo;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzn);
                    zzo = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
