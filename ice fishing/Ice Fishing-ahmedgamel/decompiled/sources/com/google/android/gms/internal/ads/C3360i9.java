package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3360i9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3360i9 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3360i9 c3360i9 = new C3360i9();
        zzf = c3360i9;
        VK.u(C3360i9.class, c3360i9);
    }

    public static C3306h9 A() {
        return (C3306h9) zzf.r();
    }

    public final void B(int i) {
        this.zzd = AbstractC5050e.d(i);
        this.zzc |= 1;
    }

    public final void C(int i) {
        int i4 = 1;
        if (i == 1) {
            i4 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i4 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i4 = 2;
            }
        }
        this.zze = i4;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", C3517l6.f32510r, "zze", C3517l6.f32509q});
        }
        if (d9 == 3) {
            return new C3360i9();
        }
        if (d9 == 4) {
            return new C3306h9(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3360i9.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
