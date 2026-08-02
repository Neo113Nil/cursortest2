package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.p9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3736p9 extends VK {
    private static final C3736p9 zzB;
    private static volatile InterfaceC4071vL zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private C3790q9 zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C3736p9 c3736p9 = new C3736p9();
        zzB = c3736p9;
        VK.u(C3736p9.class, c3736p9);
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
            return new C4287zL(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", c3517l6, "zzn", c3517l6, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (d9 == 3) {
            return new C3736p9();
        }
        if (d9 == 4) {
            return new C3625n6(zzB);
        }
        if (d9 == 5) {
            return zzB;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzC;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3736p9.class) {
            try {
                interfaceC4071vL = zzC;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzB);
                    zzC = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
