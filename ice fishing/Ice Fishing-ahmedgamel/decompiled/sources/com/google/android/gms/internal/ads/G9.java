package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class G9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final G9 zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        G9 g9 = new G9();
        zzh = g9;
        VK.u(G9.class, g9);
    }

    public static F9 B() {
        return (F9) zzh.r();
    }

    public final void A(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }

    public final void C(boolean z6) {
        this.zzd |= 1;
        this.zze = z6;
    }

    public final void D(boolean z6) {
        this.zzd |= 2;
        this.zzf = z6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (d9 == 3) {
            return new G9();
        }
        if (d9 == 4) {
            return new F9(zzh);
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
        synchronized (G9.class) {
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
