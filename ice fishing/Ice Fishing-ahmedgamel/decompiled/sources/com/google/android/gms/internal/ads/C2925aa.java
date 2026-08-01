package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2925aa extends VK {
    private static final C2925aa zzF;
    private static volatile InterfaceC4048vL zzG = null;
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
    private C3337i9 zzA;
    private C3229g9 zzB;
    private C3659o9 zzC;
    private P9 zzD;
    private H9 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private C4036v9 zzw;
    private X9 zzy;
    private Y9 zzz;
    private String zzp = "";
    private int zzv = 1000;
    private InterfaceC2973bL zzx = C3509lL.f31759x;

    static {
        C2925aa c2925aa = new C2925aa();
        zzF = c2925aa;
        VK.u(C2925aa.class, c2925aa);
    }

    public static Z9 L() {
        return (Z9) zzF.r();
    }

    public final X9 A() {
        X9 x9 = this.zzy;
        return x9 == null ? X9.A() : x9;
    }

    public final void B(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final C3229g9 C() {
        C3229g9 c3229g9 = this.zzB;
        return c3229g9 == null ? C3229g9.A() : c3229g9;
    }

    public final void D(H9 h9) {
        this.zzE = h9;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        InterfaceC2973bL interfaceC2973bL = this.zzx;
        if (!((AK) interfaceC2973bL).f23663n) {
            this.zzx = VK.k(interfaceC2973bL);
        }
        AbstractC4263zK.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = C3509lL.f31759x;
    }

    public final void G(X9 x9) {
        this.zzy = x9;
        this.zzn |= 32;
    }

    public final void H(C3229g9 c3229g9) {
        this.zzB = c3229g9;
        this.zzn |= 256;
    }

    public final void I(C3659o9 c3659o9) {
        this.zzC = c3659o9;
        this.zzn |= 512;
    }

    public final void J(P9 p9) {
        this.zzD = p9;
        this.zzn |= 1024;
    }

    public final String K() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", C3494l6.f31736x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (d2 == 3) {
            return new C2925aa();
        }
        if (d2 == 4) {
            return new Z9(zzF);
        }
        if (d2 == 5) {
            return zzF;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzG;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C2925aa.class) {
            try {
                interfaceC4048vL = zzG;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzF);
                    zzG = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
