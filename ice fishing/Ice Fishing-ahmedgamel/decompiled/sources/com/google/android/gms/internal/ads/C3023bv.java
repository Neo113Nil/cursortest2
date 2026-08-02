package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.bv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3023bv extends VK {
    private static final C3023bv zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private Yu zzb;

    static {
        C3023bv c3023bv = new C3023bv();
        zzc = c3023bv;
        VK.u(C3023bv.class, c3023bv);
    }

    public static C2969av A() {
        return (C2969av) zzc.r();
    }

    public final /* synthetic */ void B(Yu yu) {
        this.zzb = yu;
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
            return new C4287zL(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new C3023bv();
        }
        if (d9 == 4) {
            return new C2969av(zzc);
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
        synchronized (C3023bv.class) {
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
