package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3668oI extends VK {
    private static final C3668oI zze;
    private static volatile InterfaceC4048vL zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        C3668oI c3668oI = new C3668oI();
        zze = c3668oI;
        VK.u(C3668oI.class, c3668oI);
    }

    public static C3614nI A() {
        return (C3614nI) zze.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(int i) {
        this.zzc = i;
    }

    public final void D(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    public final void E(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3668oI();
        }
        if (d2 == 4) {
            return new C3614nI(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3668oI.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
