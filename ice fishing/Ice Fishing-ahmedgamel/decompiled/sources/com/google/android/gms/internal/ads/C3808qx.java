package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.qx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3808qx extends VK {
    private static final C3808qx zzb;
    private static volatile InterfaceC4048vL zzc;
    private C3617nL zza = C3617nL.f32721u;

    static {
        C3808qx c3808qx = new C3808qx();
        zzb = c3808qx;
        VK.u(C3808qx.class, c3808qx);
    }

    public static C3808qx C(FileInputStream fileInputStream) {
        C3808qx c3808qx = zzb;
        LK lk = new LK(fileInputStream);
        PK pk = PK.f26757a;
        int i = BK.f23877a;
        VK l9 = VK.l(c3808qx, lk, PK.f26758b);
        VK.z(l9);
        return (C3808qx) l9;
    }

    public static C3808qx D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final C3617nL E() {
        C3617nL c3617nL = this.zza;
        if (!c3617nL.f32722n) {
            this.zza = c3617nL.h();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", AbstractC3700ox.f32979a});
        }
        if (d2 == 3) {
            return new C3808qx();
        }
        if (d2 == 4) {
            return new C3646nx(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzc;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3808qx.class) {
            try {
                interfaceC4048vL = zzc;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzb);
                    zzc = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
