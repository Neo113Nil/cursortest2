package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class EH extends VK {
    private static final EH zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private int zzb;

    static {
        EH eh = new EH();
        zzc = eh;
        VK.u(EH.class, eh);
    }

    public static EH C(JK jk, PK pk) {
        return (EH) VK.m(zzc, jk, pk);
    }

    public static DH D() {
        return (DH) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (d9 == 3) {
            return new EH();
        }
        if (d9 == 4) {
            return new DH(zzc);
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
        synchronized (EH.class) {
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
