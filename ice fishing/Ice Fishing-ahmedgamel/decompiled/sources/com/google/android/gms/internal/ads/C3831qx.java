package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.qx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3831qx extends VK {
    private static final C3831qx zzb;
    private static volatile InterfaceC4071vL zzc;
    private C3640nL zza = C3640nL.f33499u;

    static {
        C3831qx c3831qx = new C3831qx();
        zzb = c3831qx;
        VK.u(C3831qx.class, c3831qx);
    }

    public static C3831qx C(FileInputStream fileInputStream) {
        C3831qx c3831qx = zzb;
        LK lk = new LK(fileInputStream);
        PK pk = PK.f27540a;
        int i = BK.f24648a;
        VK l9 = VK.l(c3831qx, lk, PK.f27541b);
        VK.z(l9);
        return (C3831qx) l9;
    }

    public static C3831qx D() {
        return zzb;
    }

    public final int A() {
        return this.zza.size();
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final C3640nL E() {
        C3640nL c3640nL = this.zza;
        if (!c3640nL.f33500n) {
            this.zza = c3640nL.h();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", AbstractC3723ox.f33769a});
        }
        if (d9 == 3) {
            return new C3831qx();
        }
        if (d9 == 4) {
            return new C3669nx(zzb);
        }
        if (d9 == 5) {
            return zzb;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzc;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3831qx.class) {
            try {
                interfaceC4071vL = zzc;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzb);
                    zzc = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
