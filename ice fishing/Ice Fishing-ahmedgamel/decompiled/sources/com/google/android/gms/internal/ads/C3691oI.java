package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3691oI extends VK {
    private static final C3691oI zze;
    private static volatile InterfaceC4071vL zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        C3691oI c3691oI = new C3691oI();
        zze = c3691oI;
        VK.u(C3691oI.class, c3691oI);
    }

    public static C3637nI A() {
        return (C3637nI) zze.r();
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
            AbstractC3103dL.a();
            throw null;
        }
    }

    public final void E(int i) {
        if (i != 1) {
            this.zzd = i - 2;
        } else {
            AbstractC3103dL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C3691oI();
        }
        if (d9 == 4) {
            return new C3637nI(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3691oI.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
