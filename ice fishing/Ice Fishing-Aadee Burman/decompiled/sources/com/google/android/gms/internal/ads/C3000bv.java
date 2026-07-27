package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.bv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3000bv extends VK {
    private static final C3000bv zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private Yu zzb;

    static {
        C3000bv c3000bv = new C3000bv();
        zzc = c3000bv;
        VK.u(C3000bv.class, c3000bv);
    }

    public static C2946av A() {
        return (C2946av) zzc.r();
    }

    public final /* synthetic */ void B(Yu yu) {
        this.zzb = yu;
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
            return new C4264zL(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3000bv();
        }
        if (d2 == 4) {
            return new C2946av(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzd;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3000bv.class) {
            try {
                interfaceC4048vL = zzd;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzc);
                    zzd = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
