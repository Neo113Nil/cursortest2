package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.tI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3937tI extends VK {
    private static final C3937tI zzb;
    private static volatile InterfaceC4048vL zzc;
    private String zza = "";

    static {
        C3937tI c3937tI = new C3937tI();
        zzb = c3937tI;
        VK.u(C3937tI.class, c3937tI);
    }

    public static C3937tI B(JK jk, PK pk) {
        return (C3937tI) VK.m(zzb, jk, pk);
    }

    public static C3883sI C() {
        return (C3883sI) zzb.r();
    }

    public static C3937tI D() {
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C3937tI();
        }
        if (d2 == 4) {
            return new C3883sI(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzc;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3937tI.class) {
            try {
                interfaceC4048vL = zzc;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzb);
                    zzc = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
