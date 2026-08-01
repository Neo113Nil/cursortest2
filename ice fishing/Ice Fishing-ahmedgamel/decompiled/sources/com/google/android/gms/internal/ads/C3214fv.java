package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.fv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214fv extends VK {
    private static final C3214fv zzi;
    private static volatile InterfaceC4048vL zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        C3214fv c3214fv = new C3214fv();
        zzi = c3214fv;
        VK.u(C3214fv.class, c3214fv);
    }

    public static C3160ev A() {
        return (C3160ev) zzi.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zzc = j6;
    }

    public final /* synthetic */ void E(boolean z3) {
        this.zzd = z3;
    }

    public final /* synthetic */ void F(long j6) {
        this.zze = j6;
    }

    public final /* synthetic */ void G(long j6) {
        this.zzf = j6;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void I(int i) {
        this.zzh = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new C3214fv();
        }
        if (d2 == 4) {
            return new C3160ev(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzj;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3214fv.class) {
            try {
                interfaceC4048vL = zzj;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzi);
                    zzj = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
