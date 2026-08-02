package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.tI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3960tI extends VK {
    private static final C3960tI zzb;
    private static volatile InterfaceC4071vL zzc;
    private String zza = "";

    static {
        C3960tI c3960tI = new C3960tI();
        zzb = c3960tI;
        VK.u(C3960tI.class, c3960tI);
    }

    public static C3960tI B(JK jk, PK pk) {
        return (C3960tI) VK.m(zzb, jk, pk);
    }

    public static C3906sI C() {
        return (C3906sI) zzb.r();
    }

    public static C3960tI D() {
        return zzb;
    }

    public final String A() {
        return this.zza;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (d9 == 3) {
            return new C3960tI();
        }
        if (d9 == 4) {
            return new C3906sI(zzb);
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
        synchronized (C3960tI.class) {
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
