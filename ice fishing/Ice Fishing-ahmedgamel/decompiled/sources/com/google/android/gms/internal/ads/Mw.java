package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Mw extends VK {
    private static final Mw zzf;
    private static volatile InterfaceC4071vL zzg;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", C3517l6.f32518z, "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new Mw();
        }
        if (d9 == 4) {
            return new Lw(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Mw.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
