package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

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
    private static volatile InterfaceC4071vL zzw;
    private int zzi;
    private C3951t9 zzk;
    private int zzl;
    private C4059v9 zzm;
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

    public final void C(C4059v9 c4059v9) {
        this.zzm = c4059v9;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32516x;
            return new C4287zL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", c3517l6, "zzp", c3517l6, "zzu", c3517l6});
        }
        if (d9 == 3) {
            return new X9();
        }
        if (d9 == 4) {
            return new W9(zzv);
        }
        if (d9 == 5) {
            return zzv;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzw;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (X9.class) {
            try {
                interfaceC4071vL = zzw;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzv);
                    zzw = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
