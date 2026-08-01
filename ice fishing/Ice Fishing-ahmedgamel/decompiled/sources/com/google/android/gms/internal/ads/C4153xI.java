package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4153xI extends VK {
    private static final C4153xI zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private String zzb = "";
    private C3238gI zzc;

    static {
        C4153xI c4153xI = new C4153xI();
        zzd = c4153xI;
        VK.u(C4153xI.class, c4153xI);
    }

    public static C4153xI C(JK jk, PK pk) {
        return (C4153xI) VK.m(zzd, jk, pk);
    }

    public static C4099wI D() {
        return (C4099wI) zzd.r();
    }

    public static C4153xI E() {
        return zzd;
    }

    public final String A() {
        return this.zzb;
    }

    public final C3238gI B() {
        C3238gI c3238gI = this.zzc;
        return c3238gI == null ? C3238gI.E() : c3238gI;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void G(C3238gI c3238gI) {
        c3238gI.getClass();
        this.zzc = c3238gI;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C4153xI();
        }
        if (d2 == 4) {
            return new C4099wI(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C4153xI.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
