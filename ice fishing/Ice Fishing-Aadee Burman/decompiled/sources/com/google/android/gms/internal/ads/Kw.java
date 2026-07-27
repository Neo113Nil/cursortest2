package com.google.android.gms.internal.ads;

import java.util.RandomAccess;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Kw extends VK {
    private static final Kw zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private ZK zzb = WK.f28348x;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        Kw kw = new Kw();
        zzf = kw;
        VK.u(Kw.class, kw);
    }

    public static Jw A() {
        return (Jw) zzf.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void C(int i) {
        RandomAccess randomAccess = this.zzb;
        if (!((AK) randomAccess).f23663n) {
            WK wk = (WK) randomAccess;
            int i6 = wk.f28350v;
            this.zzb = wk.D(i6 + i6);
        }
        ((WK) this.zzb).e(2);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", C3494l6.f31737y, "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new Kw();
        }
        if (d2 == 4) {
            return new Jw(zzf);
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
        synchronized (Kw.class) {
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
