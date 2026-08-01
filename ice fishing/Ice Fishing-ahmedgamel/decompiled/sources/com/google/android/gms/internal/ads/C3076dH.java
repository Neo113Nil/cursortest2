package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.dH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3076dH extends VK {
    private static final C3076dH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private C3183fH zzc;

    static {
        C3076dH c3076dH = new C3076dH();
        zzd = c3076dH;
        VK.u(C3076dH.class, c3076dH);
    }

    public static C3076dH C(JK jk, PK pk) {
        return (C3076dH) VK.m(zzd, jk, pk);
    }

    public static C3022cH D() {
        return (C3022cH) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3183fH B() {
        C3183fH c3183fH = this.zzc;
        return c3183fH == null ? C3183fH.C() : c3183fH;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void F(C3183fH c3183fH) {
        this.zzc = c3183fH;
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
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3076dH();
        }
        if (d2 == 4) {
            return new C3022cH(zzd);
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
        synchronized (C3076dH.class) {
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
