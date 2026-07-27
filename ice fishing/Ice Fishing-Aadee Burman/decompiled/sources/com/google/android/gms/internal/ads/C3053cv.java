package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3053cv extends VK {
    private static final C3053cv zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private InterfaceC3026cL zzb = C4210yL.f35149x;
    private UL zzc;

    static {
        C3053cv c3053cv = new C3053cv();
        zzd = c3053cv;
        VK.u(C3053cv.class, c3053cv);
    }

    public static Zu B() {
        return (Zu) zzd.r();
    }

    public final int A() {
        return this.zzb.size();
    }

    public final void C(C3000bv c3000bv) {
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
        }
        this.zzb.add(c3000bv);
    }

    public final void D() {
        this.zzb = C4210yL.f35149x;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", C3000bv.class, "zzc"});
        }
        if (d2 == 3) {
            return new C3053cv();
        }
        if (d2 == 4) {
            return new Zu(zzd);
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
        synchronized (C3053cv.class) {
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
