package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.mv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3590mv extends VK {
    private static final C3590mv zzc;
    private static volatile InterfaceC4048vL zzd;
    private InterfaceC3026cL zza = C4210yL.f35149x;
    private long zzb;

    static {
        C3590mv c3590mv = new C3590mv();
        zzc = c3590mv;
        VK.u(C3590mv.class, c3590mv);
    }

    public static C3536lv A() {
        return (C3536lv) zzc.r();
    }

    public final void B(Qu qu) {
        InterfaceC3026cL interfaceC3026cL = this.zza;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zza = interfaceC3026cL.D(size + size);
        }
        this.zza.add(qu);
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", Qu.class, "zzb"});
        }
        if (d2 == 3) {
            return new C3590mv();
        }
        if (d2 == 4) {
            return new C3536lv(zzc);
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
        synchronized (C3590mv.class) {
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
