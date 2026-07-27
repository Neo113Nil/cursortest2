package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2906a8 extends VK {
    private static final C2906a8 zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private InterfaceC3026cL zzb = C4210yL.f35149x;
    private S7 zzc;

    static {
        C2906a8 c2906a8 = new C2906a8();
        zzd = c2906a8;
        VK.u(C2906a8.class, c2906a8);
    }

    public static Z7 A() {
        return (Z7) zzd.r();
    }

    public final void B(Y7 y7) {
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
        }
        this.zzb.add(y7);
    }

    public final /* synthetic */ void C(S7 s72) {
        s72.getClass();
        this.zzc = s72;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", Y7.class, "zzc"});
        }
        if (d2 == 3) {
            return new C2906a8();
        }
        if (d2 == 4) {
            return new Z7(zzd);
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
        synchronized (C2906a8.class) {
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
