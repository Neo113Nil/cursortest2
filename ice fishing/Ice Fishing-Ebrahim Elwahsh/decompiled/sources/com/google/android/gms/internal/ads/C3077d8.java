package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3077d8 extends AbstractC3199fL {
    private static final C3077d8 zzg;
    private static volatile GL zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        C3077d8 c3077d8 = new C3077d8();
        zzg = c3077d8;
        AbstractC3199fL.u(C3077d8.class, c3077d8);
    }

    public static C3077d8 F(QK qk) {
        C3077d8 c3077d8 = zzg;
        YK yk = YK.f28820a;
        int i = KK.f25952a;
        AbstractC3199fL m8 = AbstractC3199fL.m(c3077d8, qk, YK.f28821b);
        AbstractC3199fL.z(m8);
        return (C3077d8) m8;
    }

    public static C3077d8 G(QK qk, YK yk) {
        return (C3077d8) AbstractC3199fL.m(zzg, qk, yk);
    }

    public static C3022c8 H() {
        return (C3022c8) zzg.r();
    }

    public static C3077d8 I() {
        return zzg;
    }

    public final String A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void L(long j9) {
        this.zza |= 4;
        this.zzd = j9;
    }

    public final /* synthetic */ void M(long j9) {
        this.zza |= 8;
        this.zze = j9;
    }

    public final /* synthetic */ void N(long j9) {
        this.zza |= 16;
        this.zzf = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3077d8();
        }
        if (d2 == 4) {
            return new C3022c8(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzh;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3077d8.class) {
            try {
                gl = zzh;
                if (gl == null) {
                    gl = new C3144eL(zzg);
                    zzh = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
