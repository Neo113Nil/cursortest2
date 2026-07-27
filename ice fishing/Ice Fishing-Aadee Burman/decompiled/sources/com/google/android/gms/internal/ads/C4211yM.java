package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.yM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4211yM extends VK {
    private static final C4211yM zzl;
    private static volatile InterfaceC4048vL zzm;
    private int zza;
    private int zzb;
    private C3672oM zzd;
    private C3780qM zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private ZK zzg = WK.f28348x;
    private String zzh = "";
    private InterfaceC3026cL zzj = C4210yL.f35149x;

    static {
        C4211yM c4211yM = new C4211yM();
        zzl = c4211yM;
        VK.u(C4211yM.class, c4211yM);
    }

    public static C4103wM C() {
        return (C4103wM) zzl.r();
    }

    public final String A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzj.size();
    }

    public final /* synthetic */ void D(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void F(C3672oM c3672oM) {
        this.zzd = c3672oM;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        InterfaceC3026cL interfaceC3026cL = this.zzj;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzj = interfaceC3026cL.D(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        switch (AbstractC5049e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4264zL(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C3027cM.f29457l, "zzj"});
            case 3:
                return new C4211yM();
            case 4:
                return new C4103wM(zzl);
            case 5:
                return zzl;
            case 6:
                InterfaceC4048vL interfaceC4048vL2 = zzm;
                if (interfaceC4048vL2 != null) {
                    return interfaceC4048vL2;
                }
                synchronized (C4211yM.class) {
                    try {
                        interfaceC4048vL = zzm;
                        if (interfaceC4048vL == null) {
                            interfaceC4048vL = new UK(zzl);
                            zzm = interfaceC4048vL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC4048vL;
            default:
                throw null;
        }
    }
}
