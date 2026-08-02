package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class FM extends VK {
    private static final FM zzQ;
    private static volatile InterfaceC4071vL zzR;
    private DM zzA;
    private InterfaceC3049cL zzB;
    private C3373iM zzC;
    private String zzD;
    private C3104dM zzE;
    private InterfaceC3049cL zzF;
    private int zzG;
    private InterfaceC3049cL zzH;
    private InterfaceC3049cL zzI;
    private long zzJ;
    private EM zzK;
    private C3910sM zzL;
    private String zzM;
    private CM zzN;
    private InterfaceC3049cL zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private C3265gM zzg;
    private InterfaceC3049cL zzh;
    private InterfaceC3049cL zzi;
    private String zzj;
    private C4072vM zzk;
    private boolean zzl;
    private InterfaceC3049cL zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private JK zzu;
    private AM zzv;
    private boolean zzw;
    private String zzx;
    private InterfaceC3049cL zzy;
    private InterfaceC3049cL zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        FM fm = new FM();
        zzQ = fm;
        VK.u(FM.class, fm);
    }

    public FM() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzh = c4233yL;
        this.zzi = c4233yL;
        this.zzj = "";
        this.zzm = c4233yL;
        this.zzn = "";
        this.zzu = JK.f26428u;
        this.zzx = "";
        this.zzy = c4233yL;
        this.zzz = c4233yL;
        this.zzB = c4233yL;
        this.zzD = "";
        this.zzF = c4233yL;
        this.zzH = c4233yL;
        this.zzI = c4233yL;
        this.zzM = "";
        this.zzO = c4233yL;
    }

    public static C3157eM D() {
        return (C3157eM) zzQ.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final List B() {
        return this.zzh;
    }

    public final String C() {
        return this.zzj;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void G(C3265gM c3265gM) {
        this.zzg = c3265gM;
        this.zza |= 32;
    }

    public final void H(C4234yM c4234yM) {
        InterfaceC3049cL interfaceC3049cL = this.zzh;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzh = interfaceC3049cL.D(size + size);
        }
        this.zzh.add(c4234yM);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void K(C4072vM c4072vM) {
        this.zzk = c4072vM;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(AM am) {
        this.zzv = am;
        this.zza |= 8192;
    }

    public final void M(ArrayList arrayList) {
        InterfaceC3049cL interfaceC3049cL = this.zzy;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzy = interfaceC3049cL.D(size + size);
        }
        AbstractC4286zK.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        InterfaceC3049cL interfaceC3049cL = this.zzz;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzz = interfaceC3049cL.D(size + size);
        }
        AbstractC4286zK.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        switch (AbstractC5050e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4287zL(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", C4234yM.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", C3050cM.f30239k, "zzc", C3050cM.f30234e, "zzg", "zzj", "zzk", "zzu", "zzi", HM.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", JM.class, "zzC", "zzD", "zzE", "zzF", C3425jM.class, "zzG", C3050cM.f30243o, "zzH", C3856rM.class, "zzI", C3964tM.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", BM.class});
            case 3:
                return new FM();
            case 4:
                return new C3157eM(zzQ);
            case 5:
                return zzQ;
            case 6:
                InterfaceC4071vL interfaceC4071vL2 = zzR;
                if (interfaceC4071vL2 != null) {
                    return interfaceC4071vL2;
                }
                synchronized (FM.class) {
                    try {
                        interfaceC4071vL = zzR;
                        if (interfaceC4071vL == null) {
                            interfaceC4071vL = new UK(zzQ);
                            zzR = interfaceC4071vL;
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
