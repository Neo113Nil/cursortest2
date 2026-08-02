package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class J6 extends VK {
    private static final J6 zzc;
    private static volatile InterfaceC4071vL zzd;
    private InterfaceC2996bL zza;
    private InterfaceC2996bL zzb;

    static {
        J6 j6 = new J6();
        zzc = j6;
        VK.u(J6.class, j6);
    }

    public J6() {
        C3532lL c3532lL = C3532lL.f32539x;
        this.zza = c3532lL;
        this.zzb = c3532lL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new J6();
        }
        if (d9 == 4) {
            return new C3625n6(zzc);
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
        synchronized (J6.class) {
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
