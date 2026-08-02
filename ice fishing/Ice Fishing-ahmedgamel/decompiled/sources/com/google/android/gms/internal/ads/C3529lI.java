package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.List;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.lI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3529lI extends VK {
    private static final C3529lI zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private InterfaceC3049cL zzb = C4233yL.f35935x;

    static {
        C3529lI c3529lI = new C3529lI();
        zzc = c3529lI;
        VK.u(C3529lI.class, c3529lI);
    }

    public static C3529lI E(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzc, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3529lI) y7;
    }

    public static C3529lI F(ByteArrayInputStream byteArrayInputStream, PK pk) {
        VK l9 = VK.l(zzc, new LK(byteArrayInputStream), pk);
        VK.z(l9);
        return (C3529lI) l9;
    }

    public static C3369iI G() {
        return (C3369iI) zzc.r();
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

    public final C3475kI D(int i) {
        return (C3475kI) this.zzb.get(i);
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    public final void I(C3475kI c3475kI) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(c3475kI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3475kI.class});
        }
        if (d9 == 3) {
            return new C3529lI();
        }
        if (d9 == 4) {
            return new C3369iI(zzc);
        }
        if (d9 == 5) {
            return zzc;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzd;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3529lI.class) {
            try {
                interfaceC4071vL = zzd;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzc);
                    zzd = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
