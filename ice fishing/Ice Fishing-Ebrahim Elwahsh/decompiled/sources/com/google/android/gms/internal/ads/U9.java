package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class U9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final U9 zzv;
    private static volatile GL zzw;
    private int zzi;
    private C3780q9 zzk;
    private int zzl;
    private C3887s9 zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        U9 u9 = new U9();
        zzv = u9;
        AbstractC3199fL.u(U9.class, u9);
    }

    public static U9 A() {
        return zzv;
    }

    public final void B(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void C(C3887s9 c3887s9) {
        this.zzm = c3887s9;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31172x;
            return new KL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", c3293h6, "zzp", c3293h6, "zzu", c3293h6});
        }
        if (d2 == 3) {
            return new U9();
        }
        if (d2 == 4) {
            return new T9(zzv);
        }
        if (d2 == 5) {
            return zzv;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzw;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (U9.class) {
            try {
                gl = zzw;
                if (gl == null) {
                    gl = new C3144eL(zzv);
                    zzw = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
