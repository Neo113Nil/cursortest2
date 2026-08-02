package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class U9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final U9 zzl;
    private static volatile InterfaceC4071vL zzm;
    private int zzf;
    private String zzg = "";
    private InterfaceC3049cL zzh = C4233yL.f35935x;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        U9 u9 = new U9();
        zzl = u9;
        VK.u(U9.class, u9);
    }

    public static U9 A() {
        return zzl;
    }

    public final void B(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32516x;
            return new C4287zL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", R9.class, "zzi", c3517l6, "zzj", c3517l6, "zzk", c3517l6});
        }
        if (d9 == 3) {
            return new U9();
        }
        if (d9 == 4) {
            return new T9(zzl);
        }
        if (d9 == 5) {
            return zzl;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzm;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (U9.class) {
            try {
                interfaceC4071vL = zzm;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzl);
                    zzm = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
