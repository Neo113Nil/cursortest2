package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Y7 extends VK {
    private static final Y7 zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private C3440k6 zzb;

    static {
        Y7 y7 = new Y7();
        zzc = y7;
        VK.u(Y7.class, y7);
    }

    public static X7 A() {
        return (X7) zzc.r();
    }

    public final /* synthetic */ void B(C3440k6 c3440k6) {
        this.zzb = c3440k6;
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
            return new C4264zL(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new Y7();
        }
        if (d2 == 4) {
            return new X7(zzc);
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
        synchronized (Y7.class) {
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
