package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.t9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3941t9 extends AbstractC3199fL {
    private static final C3941t9 zzL;
    private static volatile GL zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private H9 zzA;
    private C4103w9 zzB;
    private int zzC;
    private int zzD;
    private C3780q9 zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private G9 zzv;
    private I9 zzw;
    private J9 zzx;
    private K9 zzy;
    private C3995u9 zzz;

    static {
        C3941t9 c3941t9 = new C3941t9();
        zzL = c3941t9;
        AbstractC3199fL.u(C3941t9.class, c3941t9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (d2 == 3) {
            return new C3941t9();
        }
        if (d2 == 4) {
            return new C3453k6(zzL);
        }
        if (d2 == 5) {
            return zzL;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzM;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3941t9.class) {
            try {
                gl = zzM;
                if (gl == null) {
                    gl = new C3144eL(zzL);
                    zzM = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
