package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3711ov extends AbstractC3199fL {
    private static final C3711ov zzc;
    private static volatile GL zzd;
    private InterfaceC3630nL zza = JL.f25761x;
    private long zzb;

    static {
        C3711ov c3711ov = new C3711ov();
        zzc = c3711ov;
        AbstractC3199fL.u(C3711ov.class, c3711ov);
    }

    public static C3657nv A() {
        return (C3657nv) zzc.r();
    }

    public final void B(Tu tu) {
        InterfaceC3630nL interfaceC3630nL = this.zza;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zza = interfaceC3630nL.A(size + size);
        }
        this.zza.add(tu);
    }

    public final /* synthetic */ void C(long j9) {
        this.zzb = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", Tu.class, "zzb"});
        }
        if (d2 == 3) {
            return new C3711ov();
        }
        if (d2 == 4) {
            return new C3657nv(zzc);
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
        synchronized (C3711ov.class) {
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
