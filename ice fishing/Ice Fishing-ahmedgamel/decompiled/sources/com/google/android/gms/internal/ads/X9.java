package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class X9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final X9 zzv;
    private static volatile InterfaceC4048vL zzw;
    private int zzi;
    private C3928t9 zzk;
    private int zzl;
    private C4036v9 zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        X9 x9 = new X9();
        zzv = x9;
        VK.u(X9.class, x9);
    }

    public static X9 A() {
        return zzv;
    }

    public final void B(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void C(C4036v9 c4036v9) {
        this.zzm = c4036v9;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3494l6 c3494l6 = C3494l6.f31736x;
            return new C4264zL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", c3494l6, "zzp", c3494l6, "zzu", c3494l6});
        }
        if (d2 == 3) {
            return new X9();
        }
        if (d2 == 4) {
            return new W9(zzv);
        }
        if (d2 == 5) {
            return zzv;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzw;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (X9.class) {
            try {
                interfaceC4048vL = zzw;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzv);
                    zzw = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
