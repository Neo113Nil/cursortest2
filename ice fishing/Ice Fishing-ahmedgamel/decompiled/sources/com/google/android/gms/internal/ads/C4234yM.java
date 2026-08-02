package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.yM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4234yM extends VK {
    private static final C4234yM zzl;
    private static volatile InterfaceC4071vL zzm;
    private int zza;
    private int zzb;
    private C3695oM zzd;
    private C3803qM zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private ZK zzg = WK.f29146x;
    private String zzh = "";
    private InterfaceC3049cL zzj = C4233yL.f35935x;

    static {
        C4234yM c4234yM = new C4234yM();
        zzl = c4234yM;
        VK.u(C4234yM.class, c4234yM);
    }

    public static C4126wM C() {
        return (C4126wM) zzl.r();
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

    public final /* synthetic */ void F(C3695oM c3695oM) {
        this.zzd = c3695oM;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        InterfaceC3049cL interfaceC3049cL = this.zzj;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzj = interfaceC3049cL.D(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        switch (AbstractC5050e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4287zL(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C3050cM.f30240l, "zzj"});
            case 3:
                return new C4234yM();
            case 4:
                return new C4126wM(zzl);
            case 5:
                return zzl;
            case 6:
                InterfaceC4071vL interfaceC4071vL2 = zzm;
                if (interfaceC4071vL2 != null) {
                    return interfaceC4071vL2;
                }
                synchronized (C4234yM.class) {
                    try {
                        interfaceC4071vL = zzm;
                        if (interfaceC4071vL == null) {
                            interfaceC4071vL = new UK(zzl);
                            zzm = interfaceC4071vL;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC4071vL;
            default:
                throw null;
        }
    }
}
