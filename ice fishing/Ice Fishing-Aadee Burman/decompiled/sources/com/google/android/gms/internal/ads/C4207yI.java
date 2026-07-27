package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.yI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4207yI extends VK {
    public static final /* synthetic */ int zza = 0;
    private static final C4207yI zzd;
    private static volatile InterfaceC4048vL zze;
    private String zzb = "";
    private InterfaceC3026cL zzc = C4210yL.f35149x;

    static {
        C4207yI c4207yI = new C4207yI();
        zzd = c4207yI;
        VK.u(C4207yI.class, c4207yI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", C3292hI.class});
        }
        if (d2 == 3) {
            return new C4207yI();
        }
        if (d2 == 4) {
            return new I9(zzd);
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
        synchronized (C4207yI.class) {
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
