package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class E9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final E9 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        E9 e9 = new E9();
        zzf = e9;
        VK.u(E9.class, e9);
    }

    public static D9 A() {
        return (D9) zzf.r();
    }

    public static E9 B() {
        return zzf;
    }

    public final void C(boolean z3) {
        this.zzc |= 1;
        this.zzd = z3;
    }

    public final void D(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new E9();
        }
        if (d2 == 4) {
            return new D9(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (E9.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
