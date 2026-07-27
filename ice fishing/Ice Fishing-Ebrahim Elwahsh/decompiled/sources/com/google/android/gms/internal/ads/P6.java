package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class P6 extends AbstractC3199fL {
    private static final P6 zzf;
    private static volatile GL zzg;
    private int zza;
    private InterfaceC3630nL zzb = JL.f25761x;
    private SK zzc = SK.f27529u;
    private int zzd = 1;
    private int zze = 1;

    static {
        P6 p6 = new P6();
        zzf = p6;
        AbstractC3199fL.u(P6.class, p6);
    }

    public static O6 A() {
        return (O6) zzf.r();
    }

    public final void B(QK qk) {
        qk.getClass();
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(qk);
    }

    public final /* synthetic */ void C(QK qk) {
        qk.getClass();
        this.zza |= 1;
        this.zzc = qk;
    }

    public final /* synthetic */ void D(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void E(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", C3293h6.f31162n, "zze", C3293h6.f31160l});
        }
        if (d2 == 3) {
            return new P6();
        }
        if (d2 == 4) {
            return new O6(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (P6.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
