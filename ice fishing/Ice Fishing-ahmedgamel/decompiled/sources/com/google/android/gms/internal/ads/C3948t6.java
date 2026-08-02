package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3948t6 extends VK {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35005a = 0;
    private static final C3948t6 zzg;
    private static volatile InterfaceC4071vL zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        C3948t6 c3948t6 = new C3948t6();
        zzg = c3948t6;
        VK.u(C3948t6.class, c3948t6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d9 == 3) {
            return new C3948t6();
        }
        if (d9 == 4) {
            return new C3625n6(zzg);
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
        synchronized (C3948t6.class) {
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
