package com.google.android.gms.internal.ads;

import java.util.RandomAccess;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Kw extends VK {
    private static final Kw zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private ZK zzb = WK.f29146x;
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
        if (!((AK) randomAccess).f24443n) {
            WK wk = (WK) randomAccess;
            int i4 = wk.f29148v;
            this.zzb = wk.D(i4 + i4);
        }
        ((WK) this.zzb).e(2);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", C3517l6.f32517y, "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new Kw();
        }
        if (d9 == 4) {
            return new Jw(zzf);
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
        synchronized (Kw.class) {
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
