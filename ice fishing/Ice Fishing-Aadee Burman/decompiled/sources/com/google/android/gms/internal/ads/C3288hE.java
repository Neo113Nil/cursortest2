package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.hE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3288hE extends VK {
    private static final C3288hE zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private C3126eE zzb;
    private JL zzc;
    private InterfaceC3026cL zzd = C4210yL.f35149x;
    private InterfaceC2973bL zze = C3509lL.f31759x;

    static {
        C3288hE c3288hE = new C3288hE();
        zzf = c3288hE;
        VK.u(C3288hE.class, c3288hE);
    }

    public static C3234gE A() {
        return (C3234gE) zzf.r();
    }

    public final /* synthetic */ void B(C3126eE c3126eE) {
        this.zzb = c3126eE;
        this.zza |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(ArrayDeque arrayDeque) {
        InterfaceC2973bL interfaceC2973bL = this.zze;
        if (!((AK) interfaceC2973bL).f23663n) {
            this.zze = VK.k(interfaceC2973bL);
        }
        AbstractC4263zK.e(arrayDeque, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", JL.class, "zze"});
        }
        if (d2 == 3) {
            return new C3288hE();
        }
        if (d2 == 4) {
            return new C3234gE(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3288hE.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
