package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Qu extends VK {
    private static final Qu zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private long zzb;

    static {
        Qu qu = new Qu();
        zzc = qu;
        VK.u(Qu.class, qu);
    }

    public static Pu A() {
        return (Pu) zzc.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new Qu();
        }
        if (d9 == 4) {
            return new Pu(zzc);
        }
        if (d9 == 5) {
            return zzc;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzd;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Qu.class) {
            try {
                interfaceC4071vL = zzd;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzc);
                    zzd = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
