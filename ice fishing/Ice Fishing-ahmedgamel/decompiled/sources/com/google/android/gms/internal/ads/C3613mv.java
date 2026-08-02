package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.mv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3613mv extends VK {
    private static final C3613mv zzc;
    private static volatile InterfaceC4071vL zzd;
    private InterfaceC3049cL zza = C4233yL.f35935x;
    private long zzb;

    static {
        C3613mv c3613mv = new C3613mv();
        zzc = c3613mv;
        VK.u(C3613mv.class, c3613mv);
    }

    public static C3559lv A() {
        return (C3559lv) zzc.r();
    }

    public final void B(Qu qu) {
        InterfaceC3049cL interfaceC3049cL = this.zza;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zza = interfaceC3049cL.D(size + size);
        }
        this.zza.add(qu);
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", Qu.class, "zzb"});
        }
        if (d9 == 3) {
            return new C3613mv();
        }
        if (d9 == 4) {
            return new C3559lv(zzc);
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
        synchronized (C3613mv.class) {
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
