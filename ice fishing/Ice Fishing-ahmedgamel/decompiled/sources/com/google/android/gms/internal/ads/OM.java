package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class OM extends VK {
    private static final OM zzn;
    private static volatile InterfaceC4071vL zzo;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", C3050cM.f30249u, "zze", C3050cM.f30248t, "zzf", "zzg", "zzh", "zzi", "zzj", C3050cM.f30247s, "zzk", "zzl", "zzm"});
        }
        if (d9 == 3) {
            return new OM();
        }
        if (d9 == 4) {
            return new C3317hK(zzn);
        }
        if (d9 == 5) {
            return zzn;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzo;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (OM.class) {
            try {
                interfaceC4071vL = zzo;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzn);
                    zzo = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
