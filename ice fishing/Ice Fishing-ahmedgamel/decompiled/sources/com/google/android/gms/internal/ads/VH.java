package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class VH extends VK {
    private static final VH zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private JK zzb = JK.f26428u;

    static {
        VH vh = new VH();
        zzc = vh;
        VK.u(VH.class, vh);
    }

    public static VH C(JK jk, PK pk) {
        return (VH) VK.m(zzc, jk, pk);
    }

    public static UH D() {
        return (UH) zzc.r();
    }

    public static VH E() {
        return zzc;
    }

    public static InterfaceC4071vL F() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final JK B() {
        return this.zzb;
    }

    public final /* synthetic */ void G(JK jk) {
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
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new VH();
        }
        if (d9 == 4) {
            return new UH(zzc);
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
        synchronized (VH.class) {
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
