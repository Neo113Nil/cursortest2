package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3229g9 extends VK {
    private static final C3229g9 zzB;
    private static volatile InterfaceC4048vL zzC = null;
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
    private InterfaceC3026cL zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private S9 zzo;
    private U9 zzp;
    private InterfaceC3026cL zzu;
    private V9 zzv;
    private C3713p9 zzw;
    private C3389j9 zzx;
    private C3032ca zzy;
    private C3086da zzz;

    static {
        C3229g9 c3229g9 = new C3229g9();
        zzB = c3229g9;
        VK.u(C3229g9.class, c3229g9);
    }

    public C3229g9() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzu = c4210yL;
        this.zzA = c4210yL;
    }

    public static C3229g9 A() {
        return zzB;
    }

    public final void B(EnumC3121e9 enumC3121e9) {
        this.zzm = enumC3121e9.f29891n;
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", C3494l6.f31728p, "zzn", C3494l6.f31736x, "zzo", "zzp", "zzu", R9.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C4090w9.class});
        }
        if (d2 == 3) {
            return new C3229g9();
        }
        if (d2 == 4) {
            return new C3175f9(zzB);
        }
        if (d2 == 5) {
            return zzB;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzC;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3229g9.class) {
            try {
                interfaceC4048vL = zzC;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzB);
                    zzC = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
