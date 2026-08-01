package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class QM extends VK {
    private static final QM zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private PM zzb;

    static {
        QM qm = new QM();
        zzc = qm;
        VK.u(QM.class, qm);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new QM();
        }
        if (d2 == 4) {
            return new C3294hK(zzc);
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
        synchronized (QM.class) {
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
