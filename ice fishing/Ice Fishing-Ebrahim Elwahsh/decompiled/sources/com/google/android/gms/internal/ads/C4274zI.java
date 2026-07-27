package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.zI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4274zI extends AbstractC3199fL {
    private static final C4274zI zzb;
    private static volatile GL zzc;
    private String zza = "";

    static {
        C4274zI c4274zI = new C4274zI();
        zzb = c4274zI;
        AbstractC3199fL.u(C4274zI.class, c4274zI);
    }

    public static C4274zI B(SK sk, YK yk) {
        return (C4274zI) AbstractC3199fL.m(zzb, sk, yk);
    }

    public static C4220yI C() {
        return (C4220yI) zzb.r();
    }

    public static C4274zI D() {
        return zzb;
    }

    public final String A() {
        return this.zza;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C4274zI();
        }
        if (d2 == 4) {
            return new C4220yI(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzc;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4274zI.class) {
            try {
                gl = zzc;
                if (gl == null) {
                    gl = new C3144eL(zzb);
                    zzc = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
