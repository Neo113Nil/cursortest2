package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.kE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3461kE extends AbstractC3199fL {
    private static final C3461kE zzf;
    private static volatile GL zzg;
    private int zza;
    private C3301hE zzb;
    private VL zzc;
    private InterfaceC3630nL zzd = JL.f25761x;
    private InterfaceC3576mL zze = C4061vL.f34755x;

    static {
        C3461kE c3461kE = new C3461kE();
        zzf = c3461kE;
        AbstractC3199fL.u(C3461kE.class, c3461kE);
    }

    public static C3407jE A() {
        return (C3407jE) zzf.r();
    }

    public final /* synthetic */ void B(C3301hE c3301hE) {
        this.zzb = c3301hE;
        this.zza |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(ArrayDeque arrayDeque) {
        InterfaceC3576mL interfaceC3576mL = this.zze;
        if (!((JK) interfaceC3576mL).f25759n) {
            this.zze = AbstractC3199fL.k(interfaceC3576mL);
        }
        IK.e(arrayDeque, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", VL.class, "zze"});
        }
        if (d2 == 3) {
            return new C3461kE();
        }
        if (d2 == 4) {
            return new C3407jE(zzf);
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
        synchronized (C3461kE.class) {
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
