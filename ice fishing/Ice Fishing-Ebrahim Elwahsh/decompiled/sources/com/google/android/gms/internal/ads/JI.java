package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class JI extends AbstractC3199fL {
    private static final JI zzb;
    private static volatile GL zzc;
    private int zza;

    static {
        JI ji = new JI();
        zzb = ji;
        AbstractC3199fL.u(JI.class, ji);
    }

    public static II B() {
        return (II) zzb.r();
    }

    public static JI C() {
        return zzb;
    }

    public final EnumC3032cI A() {
        EnumC3032cI b9 = EnumC3032cI.b(this.zza);
        return b9 == null ? EnumC3032cI.UNRECOGNIZED : b9;
    }

    public final /* synthetic */ void D(EnumC3032cI enumC3032cI) {
        this.zza = enumC3032cI.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new JI();
        }
        if (d2 == 4) {
            return new II(zzb);
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
        synchronized (JI.class) {
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
