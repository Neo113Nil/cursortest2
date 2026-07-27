package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class E6 extends AbstractC3199fL {
    private static final E6 zzn;
    private static volatile GL zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private F6 zzl;
    private InterfaceC3414jL zze = C3254gL.f30989x;
    private InterfaceC3630nL zzh = JL.f25761x;
    private InterfaceC3576mL zzm = C4061vL.f34755x;

    static {
        E6 e6 = new E6();
        zzn = e6;
        AbstractC3199fL.u(E6.class, e6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", J6.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new E6();
        }
        if (d2 == 4) {
            return new C3453k6(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzo;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (E6.class) {
            try {
                gl = zzo;
                if (gl == null) {
                    gl = new C3144eL(zzn);
                    zzo = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
