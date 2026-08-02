package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2948aa extends VK {
    private static final C2948aa zzF;
    private static volatile InterfaceC4071vL zzG = null;
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
    private C3360i9 zzA;
    private C3252g9 zzB;
    private C3682o9 zzC;
    private P9 zzD;
    private H9 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private C4059v9 zzw;
    private X9 zzy;
    private Y9 zzz;
    private String zzp = "";
    private int zzv = 1000;
    private InterfaceC2996bL zzx = C3532lL.f32539x;

    static {
        C2948aa c2948aa = new C2948aa();
        zzF = c2948aa;
        VK.u(C2948aa.class, c2948aa);
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

    public final C3252g9 C() {
        C3252g9 c3252g9 = this.zzB;
        return c3252g9 == null ? C3252g9.A() : c3252g9;
    }

    public final void D(H9 h9) {
        this.zzE = h9;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        InterfaceC2996bL interfaceC2996bL = this.zzx;
        if (!((AK) interfaceC2996bL).f24443n) {
            this.zzx = VK.k(interfaceC2996bL);
        }
        AbstractC4286zK.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = C3532lL.f32539x;
    }

    public final void G(X9 x9) {
        this.zzy = x9;
        this.zzn |= 32;
    }

    public final void H(C3252g9 c3252g9) {
        this.zzB = c3252g9;
        this.zzn |= 256;
    }

    public final void I(C3682o9 c3682o9) {
        this.zzC = c3682o9;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", C3517l6.f32516x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (d9 == 3) {
            return new C2948aa();
        }
        if (d9 == 4) {
            return new Z9(zzF);
        }
        if (d9 == 5) {
            return zzF;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzG;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C2948aa.class) {
            try {
                interfaceC4071vL = zzG;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzF);
                    zzG = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
