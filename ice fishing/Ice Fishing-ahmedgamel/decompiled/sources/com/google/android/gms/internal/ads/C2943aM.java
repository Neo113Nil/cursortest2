package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.aM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2943aM extends VK {
    private static final C2943aM zzb;
    private static volatile InterfaceC4071vL zzc;
    private InterfaceC3049cL zza = C4233yL.f35935x;

    static {
        C2943aM c2943aM = new C2943aM();
        zzb = c2943aM;
        VK.u(C2943aM.class, c2943aM);
    }

    public static ZL A() {
        return (ZL) zzb.r();
    }

    public final void B(YL yl) {
        InterfaceC3049cL interfaceC3049cL = this.zza;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zza = interfaceC3049cL.D(size + size);
        }
        this.zza.add(yl);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", YL.class});
        }
        if (d9 == 3) {
            return new C2943aM();
        }
        if (d9 == 4) {
            return new ZL(zzb);
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
        synchronized (C2943aM.class) {
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
