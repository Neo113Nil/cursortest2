package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3076cv extends VK {
    private static final C3076cv zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private InterfaceC3049cL zzb = C4233yL.f35935x;
    private UL zzc;

    static {
        C3076cv c3076cv = new C3076cv();
        zzd = c3076cv;
        VK.u(C3076cv.class, c3076cv);
    }

    public static Zu B() {
        return (Zu) zzd.r();
    }

    public final int A() {
        return this.zzb.size();
    }

    public final void C(C3023bv c3023bv) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(c3023bv);
    }

    public final void D() {
        this.zzb = C4233yL.f35935x;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", C3023bv.class, "zzc"});
        }
        if (d9 == 3) {
            return new C3076cv();
        }
        if (d9 == 4) {
            return new Zu(zzd);
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
        synchronized (C3076cv.class) {
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
