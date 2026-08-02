package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.gM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3265gM extends VK {
    private static final C3265gM zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private String zzb = "";

    static {
        C3265gM c3265gM = new C3265gM();
        zzc = c3265gM;
        VK.u(C3265gM.class, c3265gM);
    }

    public static C3211fM A() {
        return (C3211fM) zzc.r();
    }

    public final /* synthetic */ void B(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new C3265gM();
        }
        if (d9 == 4) {
            return new C3211fM(zzc);
        }
        if (d9 == 5) {
            return zzc;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzd;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3265gM.class) {
            try {
                interfaceC4071vL = zzd;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzc);
                    zzd = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
