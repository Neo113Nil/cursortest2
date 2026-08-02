package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4110w6 extends VK {
    private static final C4110w6 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        C4110w6 c4110w6 = new C4110w6();
        zzf = c4110w6;
        VK.u(C4110w6.class, c4110w6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32505m;
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", c3517l6, "zzc", c3517l6, "zzd", c3517l6, "zze", c3517l6});
        }
        if (d9 == 3) {
            return new C4110w6();
        }
        if (d9 == 4) {
            return new C3625n6(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C4110w6.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
