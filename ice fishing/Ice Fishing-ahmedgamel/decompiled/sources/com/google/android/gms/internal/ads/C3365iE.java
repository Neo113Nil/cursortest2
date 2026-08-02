package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.iE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3365iE extends VK {
    private static final C3365iE zzb;
    private static volatile InterfaceC4071vL zzc;
    private InterfaceC3049cL zza = C4233yL.f35935x;

    static {
        C3365iE c3365iE = new C3365iE();
        zzb = c3365iE;
        VK.u(C3365iE.class, c3365iE);
    }

    public static C3203fE B() {
        return (C3203fE) zzb.r();
    }

    public final int A() {
        return this.zza.size();
    }

    public final void C(C3311hE c3311hE) {
        InterfaceC3049cL interfaceC3049cL = this.zza;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zza = interfaceC3049cL.D(size + size);
        }
        this.zza.add(c3311hE);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3311hE.class});
        }
        if (d9 == 3) {
            return new C3365iE();
        }
        if (d9 == 4) {
            return new C3203fE(zzb);
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
        synchronized (C3365iE.class) {
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
