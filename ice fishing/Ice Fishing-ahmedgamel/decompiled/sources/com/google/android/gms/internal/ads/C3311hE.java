package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.hE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3311hE extends VK {
    private static final C3311hE zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private C3149eE zzb;
    private JL zzc;
    private InterfaceC3049cL zzd = C4233yL.f35935x;
    private InterfaceC2996bL zze = C3532lL.f32539x;

    static {
        C3311hE c3311hE = new C3311hE();
        zzf = c3311hE;
        VK.u(C3311hE.class, c3311hE);
    }

    public static C3257gE A() {
        return (C3257gE) zzf.r();
    }

    public final /* synthetic */ void B(C3149eE c3149eE) {
        this.zzb = c3149eE;
        this.zza |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(ArrayDeque arrayDeque) {
        InterfaceC2996bL interfaceC2996bL = this.zze;
        if (!((AK) interfaceC2996bL).f24443n) {
            this.zze = VK.k(interfaceC2996bL);
        }
        AbstractC4286zK.e(arrayDeque, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", JL.class, "zze"});
        }
        if (d9 == 3) {
            return new C3311hE();
        }
        if (d9 == 4) {
            return new C3257gE(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3311hE.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
