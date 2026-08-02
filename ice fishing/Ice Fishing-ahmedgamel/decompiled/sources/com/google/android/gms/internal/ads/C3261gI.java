package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3261gI extends VK {
    private static final C3261gI zzd;
    private static volatile InterfaceC4071vL zze;
    private String zza = "";
    private JK zzb = JK.f26428u;
    private int zzc;

    static {
        C3261gI c3261gI = new C3261gI();
        zzd = c3261gI;
        VK.u(C3261gI.class, c3261gI);
    }

    public static C3261gI C(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzd, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3261gI) y7;
    }

    public static C3207fI D() {
        return (C3207fI) zzd.r();
    }

    public static C3261gI E() {
        return zzd;
    }

    public final String A() {
        return this.zza;
    }

    public final JK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zzb = jk;
    }

    public final int H() {
        int g9 = AbstractC3364iD.g(this.zzc);
        if (g9 == 0) {
            return 1;
        }
        return g9;
    }

    public final void I(int i) {
        if (i != 1) {
            this.zzc = i - 2;
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
            return new C4287zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3261gI();
        }
        if (d9 == 4) {
            return new C3207fI(zzd);
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
        synchronized (C3261gI.class) {
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
