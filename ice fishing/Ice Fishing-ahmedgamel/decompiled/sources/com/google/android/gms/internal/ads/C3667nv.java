package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3667nv extends VK {
    private static final C3667nv zzg;
    private static volatile InterfaceC4071vL zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        C3667nv c3667nv = new C3667nv();
        zzg = c3667nv;
        VK.u(C3667nv.class, c3667nv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d9 == 3) {
            return new C3667nv();
        }
        if (d9 == 4) {
            return new I9(zzg);
        }
        if (d9 == 5) {
            return zzg;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzh;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3667nv.class) {
            try {
                interfaceC4071vL = zzh;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzg);
                    zzh = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
