package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class B9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final B9 zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zzd;
    private int zze;
    private E9 zzf;
    private G9 zzg;

    static {
        B9 b9 = new B9();
        zzh = b9;
        VK.u(B9.class, b9);
    }

    public static A9 B() {
        return (A9) zzh.r();
    }

    public final void A(G9 g9) {
        this.zzg = g9;
        this.zzd |= 4;
    }

    public final void C() {
        this.zze = AbstractC5050e.d(2);
        this.zzd |= 1;
    }

    public final void D(E9 e9) {
        e9.getClass();
        this.zzf = e9;
        this.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C3517l6.f32513u, "zzf", "zzg"});
        }
        if (d9 == 3) {
            return new B9();
        }
        if (d9 == 4) {
            return new A9(zzh);
        }
        if (d9 == 5) {
            return zzh;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzi;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (B9.class) {
            try {
                interfaceC4071vL = zzi;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzh);
                    zzi = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
