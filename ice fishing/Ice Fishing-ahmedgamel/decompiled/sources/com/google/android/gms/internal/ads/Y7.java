package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Y7 extends VK {
    private static final Y7 zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private C3463k6 zzb;

    static {
        Y7 y7 = new Y7();
        zzc = y7;
        VK.u(Y7.class, y7);
    }

    public static X7 A() {
        return (X7) zzc.r();
    }

    public final /* synthetic */ void B(C3463k6 c3463k6) {
        this.zzb = c3463k6;
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
            return new C4287zL(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new Y7();
        }
        if (d9 == 4) {
            return new X7(zzc);
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
        synchronized (Y7.class) {
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
