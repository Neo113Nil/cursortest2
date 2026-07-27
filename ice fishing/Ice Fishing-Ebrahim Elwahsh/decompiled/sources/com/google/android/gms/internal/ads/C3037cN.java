package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.cN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3037cN extends AbstractC3199fL {
    private static final C3037cN zzn;
    private static volatile GL zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private C3146eN zzk;
    private C2983bN zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        C3037cN c3037cN = new C3037cN();
        zzn = c3037cN;
        AbstractC3199fL.u(C3037cN.class, c3037cN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", C3793qM.f33706u, "zze", C3793qM.f33705t, "zzf", "zzg", "zzh", "zzi", "zzj", C3793qM.f33704s, "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new C3037cN();
        }
        if (d2 == 4) {
            return new UL(zzn);
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
        synchronized (C3037cN.class) {
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
