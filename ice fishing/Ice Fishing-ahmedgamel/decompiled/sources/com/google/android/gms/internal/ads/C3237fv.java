package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.fv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3237fv extends VK {
    private static final C3237fv zzi;
    private static volatile InterfaceC4071vL zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        C3237fv c3237fv = new C3237fv();
        zzi = c3237fv;
        VK.u(C3237fv.class, c3237fv);
    }

    public static C3183ev A() {
        return (C3183ev) zzi.r();
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

    public final /* synthetic */ void E(boolean z6) {
        this.zzd = z6;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d9 == 3) {
            return new C3237fv();
        }
        if (d9 == 4) {
            return new C3183ev(zzi);
        }
        if (d9 == 5) {
            return zzi;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzj;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3237fv.class) {
            try {
                interfaceC4071vL = zzj;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzi);
                    zzj = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
