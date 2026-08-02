package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.yI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4230yI extends VK {
    public static final /* synthetic */ int zza = 0;
    private static final C4230yI zzd;
    private static volatile InterfaceC4071vL zze;
    private String zzb = "";
    private InterfaceC3049cL zzc = C4233yL.f35935x;

    static {
        C4230yI c4230yI = new C4230yI();
        zzd = c4230yI;
        VK.u(C4230yI.class, c4230yI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", C3315hI.class});
        }
        if (d9 == 3) {
            return new C4230yI();
        }
        if (d9 == 4) {
            return new I9(zzd);
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
        synchronized (C4230yI.class) {
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
