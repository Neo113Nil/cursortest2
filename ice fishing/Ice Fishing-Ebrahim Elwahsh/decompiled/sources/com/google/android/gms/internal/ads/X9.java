package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class X9 extends AbstractC3199fL {
    private static final X9 zzF;
    private static volatile GL zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private C3187f9 zzA;
    private C3078d9 zzB;
    private C3510l9 zzC;
    private M9 zzD;
    private E9 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private C3887s9 zzw;
    private U9 zzy;
    private V9 zzz;
    private String zzp = "";
    private int zzv = 1000;
    private InterfaceC3576mL zzx = C4061vL.f34755x;

    static {
        X9 x9 = new X9();
        zzF = x9;
        AbstractC3199fL.u(X9.class, x9);
    }

    public static W9 L() {
        return (W9) zzF.r();
    }

    public final U9 A() {
        U9 u9 = this.zzy;
        return u9 == null ? U9.A() : u9;
    }

    public final void B(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final C3078d9 C() {
        C3078d9 c3078d9 = this.zzB;
        return c3078d9 == null ? C3078d9.A() : c3078d9;
    }

    public final void D(E9 e9) {
        this.zzE = e9;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        InterfaceC3576mL interfaceC3576mL = this.zzx;
        if (!((JK) interfaceC3576mL).f25759n) {
            this.zzx = AbstractC3199fL.k(interfaceC3576mL);
        }
        IK.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = C4061vL.f34755x;
    }

    public final void G(U9 u9) {
        this.zzy = u9;
        this.zzn |= 32;
    }

    public final void H(C3078d9 c3078d9) {
        this.zzB = c3078d9;
        this.zzn |= 256;
    }

    public final void I(C3510l9 c3510l9) {
        this.zzC = c3510l9;
        this.zzn |= 512;
    }

    public final void J(M9 m9) {
        this.zzD = m9;
        this.zzn |= 1024;
    }

    public final String K() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", C3293h6.f31172x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (d2 == 3) {
            return new X9();
        }
        if (d2 == 4) {
            return new W9(zzF);
        }
        if (d2 == 5) {
            return zzF;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzG;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (X9.class) {
            try {
                gl = zzG;
                if (gl == null) {
                    gl = new C3144eL(zzF);
                    zzG = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
