package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class W7 extends AbstractC3199fL {
    private static final W7 zzd;
    private static volatile GL zze;
    private int zza;
    private InterfaceC3630nL zzb = JL.f25761x;
    private C3415jM zzc;

    static {
        W7 w72 = new W7();
        zzd = w72;
        AbstractC3199fL.u(W7.class, w72);
    }

    public static V7 A() {
        return (V7) zzd.r();
    }

    public final void B(U7 u7) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(u7);
    }

    public final /* synthetic */ void C(C3415jM c3415jM) {
        c3415jM.getClass();
        this.zzc = c3415jM;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", U7.class, "zzc"});
        }
        if (d2 == 3) {
            return new W7();
        }
        if (d2 == 4) {
            return new V7(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (W7.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
