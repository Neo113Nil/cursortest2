package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3099dH extends VK {
    private static final C3099dH zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private C3206fH zzc;

    static {
        C3099dH c3099dH = new C3099dH();
        zzd = c3099dH;
        VK.u(C3099dH.class, c3099dH);
    }

    public static C3099dH C(JK jk, PK pk) {
        return (C3099dH) VK.m(zzd, jk, pk);
    }

    public static C3045cH D() {
        return (C3045cH) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3206fH B() {
        C3206fH c3206fH = this.zzc;
        return c3206fH == null ? C3206fH.C() : c3206fH;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void F(C3206fH c3206fH) {
        this.zzc = c3206fH;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3099dH();
        }
        if (d9 == 4) {
            return new C3045cH(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3099dH.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
