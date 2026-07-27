package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.List;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.lI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3506lI extends VK {
    private static final C3506lI zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private InterfaceC3026cL zzb = C4210yL.f35149x;

    static {
        C3506lI c3506lI = new C3506lI();
        zzc = c3506lI;
        VK.u(C3506lI.class, c3506lI);
    }

    public static C3506lI E(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzc, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3506lI) y7;
    }

    public static C3506lI F(ByteArrayInputStream byteArrayInputStream, PK pk) {
        VK l9 = VK.l(zzc, new LK(byteArrayInputStream), pk);
        VK.z(l9);
        return (C3506lI) l9;
    }

    public static C3346iI G() {
        return (C3346iI) zzc.r();
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

    public final C3452kI D(int i) {
        return (C3452kI) this.zzb.get(i);
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    public final void I(C3452kI c3452kI) {
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
        }
        this.zzb.add(c3452kI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3452kI.class});
        }
        if (d2 == 3) {
            return new C3506lI();
        }
        if (d2 == 4) {
            return new C3346iI(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzd;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3506lI.class) {
            try {
                interfaceC4048vL = zzd;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzc);
                    zzd = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
