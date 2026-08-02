package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4176xI extends VK {
    private static final C4176xI zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private String zzb = "";
    private C3261gI zzc;

    static {
        C4176xI c4176xI = new C4176xI();
        zzd = c4176xI;
        VK.u(C4176xI.class, c4176xI);
    }

    public static C4176xI C(JK jk, PK pk) {
        return (C4176xI) VK.m(zzd, jk, pk);
    }

    public static C4122wI D() {
        return (C4122wI) zzd.r();
    }

    public static C4176xI E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final C3261gI B() {
        C3261gI c3261gI = this.zzc;
        return c3261gI == null ? C3261gI.E() : c3261gI;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(C3261gI c3261gI) {
        c3261gI.getClass();
        this.zzc = c3261gI;
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
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C4176xI();
        }
        if (d9 == 4) {
            return new C4122wI(zzd);
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
        synchronized (C4176xI.class) {
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
