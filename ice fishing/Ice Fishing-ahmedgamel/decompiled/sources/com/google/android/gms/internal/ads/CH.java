package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class CH extends VK {
    private static final CH zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private JK zzb = JK.f26428u;

    static {
        CH ch = new CH();
        zzc = ch;
        VK.u(CH.class, ch);
    }

    public static CH C(JK jk, PK pk) {
        return (CH) VK.m(zzc, jk, pk);
    }

    public static BH D() {
        return (BH) zzc.r();
    }

    public static InterfaceC4071vL E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final JK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(JK jk) {
        jk.getClass();
        this.zzb = jk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new CH();
        }
        if (d9 == 4) {
            return new BH(zzc);
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
        synchronized (CH.class) {
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
