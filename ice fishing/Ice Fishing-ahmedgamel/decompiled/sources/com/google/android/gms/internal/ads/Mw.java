package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Mw extends VK {
    private static final Mw zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private Kw zze;

    static {
        Mw mw = new Mw();
        zzf = mw;
        VK.u(Mw.class, mw);
    }

    public static Lw A() {
        return (Lw) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void C(Kw kw) {
        this.zze = kw;
        this.zza |= 8;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", C3494l6.f31738z, "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new Mw();
        }
        if (d2 == 4) {
            return new Lw(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Mw.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
