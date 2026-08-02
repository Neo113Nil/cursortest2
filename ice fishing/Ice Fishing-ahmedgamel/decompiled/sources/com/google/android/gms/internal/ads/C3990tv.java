package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.tv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3990tv extends VK {
    private static final C3990tv zzf;
    private static volatile InterfaceC4071vL zzg;
    private long zza;
    private long zzb;
    private InterfaceC3049cL zzc;
    private InterfaceC3049cL zzd;
    private InterfaceC3049cL zze;

    static {
        C3990tv c3990tv = new C3990tv();
        zzf = c3990tv;
        VK.u(C3990tv.class, c3990tv);
    }

    public C3990tv() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzc = c4233yL;
        this.zzd = c4233yL;
        this.zze = c4233yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3990tv();
        }
        if (d9 == 4) {
            return new I9(zzf);
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
        synchronized (C3990tv.class) {
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
