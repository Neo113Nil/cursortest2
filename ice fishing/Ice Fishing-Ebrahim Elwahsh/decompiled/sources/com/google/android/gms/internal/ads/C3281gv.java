package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.gv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3281gv extends AbstractC3199fL {
    private static final C3281gv zzb;
    private static volatile GL zzc;
    private String zza = "";

    static {
        C3281gv c3281gv = new C3281gv();
        zzb = c3281gv;
        AbstractC3199fL.u(C3281gv.class, c3281gv);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C3281gv();
        }
        if (d2 == 4) {
            return new F9(zzb);
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
        synchronized (C3281gv.class) {
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
