package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class YL extends VK {
    private static final YL zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        YL yl = new YL();
        zzd = yl;
        VK.u(YL.class, yl);
    }

    public static XL A() {
        return (XL) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zzc = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new YL();
        }
        if (d9 == 4) {
            return new XL(zzd);
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
        synchronized (YL.class) {
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
