package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3252g9 extends VK {
    private static final C3252g9 zzB;
    private static volatile InterfaceC4071vL zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private InterfaceC3049cL zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private S9 zzo;
    private U9 zzp;
    private InterfaceC3049cL zzu;
    private V9 zzv;
    private C3736p9 zzw;
    private C3412j9 zzx;
    private C3055ca zzy;
    private C3109da zzz;

    static {
        C3252g9 c3252g9 = new C3252g9();
        zzB = c3252g9;
        VK.u(C3252g9.class, c3252g9);
    }

    public C3252g9() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzu = c4233yL;
        this.zzA = c4233yL;
    }

    public static C3252g9 A() {
        return zzB;
    }

    public final void B(EnumC3144e9 enumC3144e9) {
        this.zzm = enumC3144e9.f30683n;
        this.zzl |= 1;
    }

    public final void C(U9 u9) {
        this.zzp = u9;
        this.zzl |= 8;
    }

    public final U9 D() {
        U9 u9 = this.zzp;
        return u9 == null ? U9.A() : u9;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", C3517l6.f32508p, "zzn", C3517l6.f32516x, "zzo", "zzp", "zzu", R9.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C4113w9.class});
        }
        if (d9 == 3) {
            return new C3252g9();
        }
        if (d9 == 4) {
            return new C3198f9(zzB);
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
        synchronized (C3252g9.class) {
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
