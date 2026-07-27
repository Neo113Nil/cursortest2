package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC4355o2 {
    private static final P0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        P0 p02 = new P0();
        zzb = p02;
        AbstractC4355o2.l(P0.class, p02);
    }

    public static O0 m() {
        return (O0) zzb.g();
    }

    public static /* synthetic */ void n(P0 p02, B0 b02) {
        p02.zzf = b02;
        p02.zze = 38;
    }

    public static /* synthetic */ void o(P0 p02, long j6) {
        p02.zzd |= 1;
        p02.zzg = j6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", C4365r1.class, "zzg", D1.class, V0.class, C4301b0.class, C4322g1.class, C4325h0.class, N0.class, C4313e0.class, C4353o0.class, Y0.class, C4298a1.class, S1.class, C4393y1.class, Z1.class, "zzh", Y1.class, G1.class, C4364r0.class, O1.class, N1.class, C4329i0.class, C4303b2.class, T1.class, B0.class});
        }
        if (i6 == 3) {
            return new P0();
        }
        if (i6 == 4) {
            return new O0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
