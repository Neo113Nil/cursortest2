package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.List;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.rI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3842rI extends AbstractC3199fL {
    private static final C3842rI zzc;
    private static volatile GL zzd;
    private int zza;
    private InterfaceC3630nL zzb = JL.f25761x;

    static {
        C3842rI c3842rI = new C3842rI();
        zzc = c3842rI;
        AbstractC3199fL.u(C3842rI.class, c3842rI);
    }

    public static C3842rI E(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zzc, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (C3842rI) y6;
    }

    public static C3842rI F(ByteArrayInputStream byteArrayInputStream, YK yk) {
        AbstractC3199fL l9 = AbstractC3199fL.l(zzc, new UK(byteArrayInputStream), yk);
        AbstractC3199fL.z(l9);
        return (C3842rI) l9;
    }

    public static C3681oI G() {
        return (C3681oI) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final List B() {
        return this.zzb;
    }

    public final int C() {
        return this.zzb.size();
    }

    public final C3789qI D(int i) {
        return (C3789qI) this.zzb.get(i);
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    public final void I(C3789qI c3789qI) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(c3789qI);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3789qI.class});
        }
        if (d2 == 3) {
            return new C3842rI();
        }
        if (d2 == 4) {
            return new C3681oI(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3842rI.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
