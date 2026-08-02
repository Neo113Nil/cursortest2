package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.yH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4229yH extends VK {
    private static final C4229yH zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private JK zzb = JK.f26428u;

    static {
        C4229yH c4229yH = new C4229yH();
        zzc = c4229yH;
        VK.u(C4229yH.class, c4229yH);
    }

    public static C4229yH C(JK jk, PK pk) {
        return (C4229yH) VK.m(zzc, jk, pk);
    }

    public static C4175xH D() {
        return (C4175xH) zzc.r();
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
            return new C4229yH();
        }
        if (d9 == 4) {
            return new C4175xH(zzc);
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
        synchronized (C4229yH.class) {
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
