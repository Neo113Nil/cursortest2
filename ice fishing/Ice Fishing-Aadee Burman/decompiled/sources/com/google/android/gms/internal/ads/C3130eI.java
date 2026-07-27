package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3130eI extends VK {
    private static final C3130eI zzd;
    private static volatile InterfaceC4048vL zze;
    private String zza = "";
    private JK zzb = JK.f25675u;
    private int zzc;

    static {
        C3130eI c3130eI = new C3130eI();
        zzd = c3130eI;
        VK.u(C3130eI.class, c3130eI);
    }

    public static C3077dI C() {
        return (C3077dI) zzd.r();
    }

    public static C3130eI D() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final JK B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(JK jk) {
        jk.getClass();
        this.zzb = jk;
    }

    public final int G() {
        int i = this.zzc;
        int i6 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3130eI();
        }
        if (d2 == 4) {
            return new C3077dI(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3130eI.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
