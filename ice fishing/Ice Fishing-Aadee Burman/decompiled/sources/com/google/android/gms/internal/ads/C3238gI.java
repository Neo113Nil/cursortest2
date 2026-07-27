package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3238gI extends VK {
    private static final C3238gI zzd;
    private static volatile InterfaceC4048vL zze;
    private String zza = "";
    private JK zzb = JK.f25675u;
    private int zzc;

    static {
        C3238gI c3238gI = new C3238gI();
        zzd = c3238gI;
        VK.u(C3238gI.class, c3238gI);
    }

    public static C3238gI C(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzd, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3238gI) y7;
    }

    public static C3184fI D() {
        return (C3184fI) zzd.r();
    }

    public static C3238gI E() {
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
        int g4 = AbstractC3341iD.g(this.zzc);
        if (g4 == 0) {
            return 1;
        }
        return g4;
    }

    public final void I(int i) {
        if (i != 1) {
            this.zzc = i - 2;
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
            return new C4264zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3238gI();
        }
        if (d2 == 4) {
            return new C3184fI(zzd);
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
        synchronized (C3238gI.class) {
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
