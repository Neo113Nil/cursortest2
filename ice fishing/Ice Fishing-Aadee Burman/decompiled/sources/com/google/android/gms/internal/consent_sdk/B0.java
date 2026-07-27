package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC4355o2 {
    private static final B0 zzb;
    private int zzd;
    private C4392y0 zze;
    private A0 zzg;
    private C4384w0 zzh;
    private C4372t0 zzi;
    private String zzf = "";
    private InterfaceC4366r2 zzj = G2.f35519x;

    static {
        B0 b02 = new B0();
        zzb = b02;
        AbstractC4355o2.l(B0.class, b02);
    }

    public static C4376u0 m() {
        return (C4376u0) zzb.g();
    }

    public static void n(B0 b02, String str) {
        str.getClass();
        InterfaceC4366r2 interfaceC4366r2 = b02.zzj;
        if (!((AbstractC4311d2) interfaceC4366r2).f35664n) {
            int size = interfaceC4366r2.size();
            b02.zzj = interfaceC4366r2.b(size + size);
        }
        b02.zzj.add(str);
    }

    public static /* synthetic */ void o(B0 b02, String str) {
        b02.zzd |= 2;
        b02.zzf = str;
    }

    public static /* synthetic */ void p(B0 b02, C4372t0 c4372t0) {
        b02.zzi = c4372t0;
        b02.zzd |= 16;
    }

    public static /* synthetic */ void q(B0 b02, C4384w0 c4384w0) {
        b02.zzh = c4384w0;
        b02.zzd |= 8;
    }

    public static /* synthetic */ void r(B0 b02, C4392y0 c4392y0) {
        b02.zze = c4392y0;
        b02.zzd |= 1;
    }

    public static /* synthetic */ void s(B0 b02, A0 a02) {
        b02.zzg = a02;
        b02.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4355o2
    public final Object f(int i) {
        int i6 = i - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new H2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i6 == 3) {
            return new B0();
        }
        if (i6 == 4) {
            return new C4376u0(zzb);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
