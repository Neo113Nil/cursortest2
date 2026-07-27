package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.rM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3846rM extends AbstractC3199fL {
    private static final C3846rM zzy;
    private static volatile GL zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private InterfaceC3630nL zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private InterfaceC3630nL zzo;
    private boolean zzp;
    private long zzu;
    private InterfaceC3414jL zzv;
    private boolean zzw;
    private InterfaceC3414jL zzx;

    static {
        C3846rM c3846rM = new C3846rM();
        zzy = c3846rM;
        AbstractC3199fL.u(C3846rM.class, c3846rM);
    }

    public C3846rM() {
        JL jl = JL.f25761x;
        this.zze = jl;
        this.zzj = "";
        this.zzo = jl;
        C3254gL c3254gL = C3254gL.f30989x;
        this.zzv = c3254gL;
        this.zzx = c3254gL;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", C3793qM.f33690d, "zzc", "zzd", "zze", "zzf", C3793qM.f33688b, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C3739pM.class, "zzp", "zzu", "zzv", C3293h6.f31149D, "zzw", "zzx", C3793qM.f33689c});
        }
        if (d2 == 3) {
            return new C3846rM();
        }
        if (d2 == 4) {
            return new UL(zzy);
        }
        if (d2 == 5) {
            return zzy;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzz;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3846rM.class) {
            try {
                gl = zzz;
                if (gl == null) {
                    gl = new C3144eL(zzy);
                    zzz = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
