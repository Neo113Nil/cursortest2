package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.gM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3242gM extends VK {
    private static final C3242gM zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private String zzb = "";

    static {
        C3242gM c3242gM = new C3242gM();
        zzc = c3242gM;
        VK.u(C3242gM.class, c3242gM);
    }

    public static C3188fM A() {
        return (C3188fM) zzc.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3242gM();
        }
        if (d2 == 4) {
            return new C3188fM(zzc);
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
        synchronized (C3242gM.class) {
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
