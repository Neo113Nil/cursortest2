package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2929a8 extends VK {
    private static final C2929a8 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private InterfaceC3049cL zzb = C4233yL.f35935x;
    private S7 zzc;

    static {
        C2929a8 c2929a8 = new C2929a8();
        zzd = c2929a8;
        VK.u(C2929a8.class, c2929a8);
    }

    public static Z7 A() {
        return (Z7) zzd.r();
    }

    public final void B(Y7 y7) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(y7);
    }

    public final /* synthetic */ void C(S7 s72) {
        s72.getClass();
        this.zzc = s72;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", Y7.class, "zzc"});
        }
        if (d9 == 3) {
            return new C2929a8();
        }
        if (d9 == 4) {
            return new Z7(zzd);
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
        synchronized (C2929a8.class) {
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
