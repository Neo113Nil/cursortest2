package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3495kv extends AbstractC3199fL {
    private static final C3495kv zzb;
    private static volatile GL zzc;
    private String zza = "";

    static {
        C3495kv c3495kv = new C3495kv();
        zzb = c3495kv;
        AbstractC3199fL.u(C3495kv.class, c3495kv);
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
            return new C3495kv();
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
        synchronized (C3495kv.class) {
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
