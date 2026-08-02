package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.uH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4013uH extends VK {
    private static final C4013uH zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private C4121wH zzb;
    private int zzc;

    static {
        C4013uH c4013uH = new C4013uH();
        zzd = c4013uH;
        VK.u(C4013uH.class, c4013uH);
    }

    public static C4013uH C(JK jk, PK pk) {
        return (C4013uH) VK.m(zzd, jk, pk);
    }

    public static C3959tH D() {
        return (C3959tH) zzd.r();
    }

    public final C4121wH A() {
        C4121wH c4121wH = this.zzb;
        return c4121wH == null ? C4121wH.C() : c4121wH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C4121wH c4121wH) {
        this.zzb = c4121wH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C4013uH();
        }
        if (d9 == 4) {
            return new C3959tH(zzd);
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
        synchronized (C4013uH.class) {
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
