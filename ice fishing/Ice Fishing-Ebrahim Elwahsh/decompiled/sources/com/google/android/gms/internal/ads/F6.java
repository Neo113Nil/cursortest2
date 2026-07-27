package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class F6 extends AbstractC3199fL {
    private static final F6 zzc;
    private static volatile GL zzd;
    private InterfaceC3576mL zza;
    private InterfaceC3576mL zzb;

    static {
        F6 f6 = new F6();
        zzc = f6;
        AbstractC3199fL.u(F6.class, f6);
    }

    public F6() {
        C4061vL c4061vL = C4061vL.f34755x;
        this.zza = c4061vL;
        this.zzb = c4061vL;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new F6();
        }
        if (d2 == 4) {
            return new C3453k6(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (F6.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
