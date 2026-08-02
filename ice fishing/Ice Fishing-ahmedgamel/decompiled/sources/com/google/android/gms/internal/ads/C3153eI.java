package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153eI extends VK {
    private static final C3153eI zzd;
    private static volatile InterfaceC4071vL zze;
    private String zza = "";
    private JK zzb = JK.f26428u;
    private int zzc;

    static {
        C3153eI c3153eI = new C3153eI();
        zzd = c3153eI;
        VK.u(C3153eI.class, c3153eI);
    }

    public static C3100dI C() {
        return (C3100dI) zzd.r();
    }

    public static C3153eI D() {
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
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3153eI();
        }
        if (d9 == 4) {
            return new C3100dI(zzd);
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
        synchronized (C3153eI.class) {
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
