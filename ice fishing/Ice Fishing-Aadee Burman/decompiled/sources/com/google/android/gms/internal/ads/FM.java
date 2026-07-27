package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class FM extends VK {
    private static final FM zzQ;
    private static volatile InterfaceC4048vL zzR;
    private DM zzA;
    private InterfaceC3026cL zzB;
    private C3350iM zzC;
    private String zzD;
    private C3081dM zzE;
    private InterfaceC3026cL zzF;
    private int zzG;
    private InterfaceC3026cL zzH;
    private InterfaceC3026cL zzI;
    private long zzJ;
    private EM zzK;
    private C3887sM zzL;
    private String zzM;
    private CM zzN;
    private InterfaceC3026cL zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private C3242gM zzg;
    private InterfaceC3026cL zzh;
    private InterfaceC3026cL zzi;
    private String zzj;
    private C4049vM zzk;
    private boolean zzl;
    private InterfaceC3026cL zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private JK zzu;
    private AM zzv;
    private boolean zzw;
    private String zzx;
    private InterfaceC3026cL zzy;
    private InterfaceC3026cL zzz;
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
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzh = c4210yL;
        this.zzi = c4210yL;
        this.zzj = "";
        this.zzm = c4210yL;
        this.zzn = "";
        this.zzu = JK.f25675u;
        this.zzx = "";
        this.zzy = c4210yL;
        this.zzz = c4210yL;
        this.zzB = c4210yL;
        this.zzD = "";
        this.zzF = c4210yL;
        this.zzH = c4210yL;
        this.zzI = c4210yL;
        this.zzM = "";
        this.zzO = c4210yL;
    }

    public static C3134eM D() {
        return (C3134eM) zzQ.r();
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

    public final /* synthetic */ void G(C3242gM c3242gM) {
        this.zzg = c3242gM;
        this.zza |= 32;
    }

    public final void H(C4211yM c4211yM) {
        InterfaceC3026cL interfaceC3026cL = this.zzh;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzh = interfaceC3026cL.D(size + size);
        }
        this.zzh.add(c4211yM);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void K(C4049vM c4049vM) {
        this.zzk = c4049vM;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(AM am) {
        this.zzv = am;
        this.zza |= 8192;
    }

    public final void M(ArrayList arrayList) {
        InterfaceC3026cL interfaceC3026cL = this.zzy;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzy = interfaceC3026cL.D(size + size);
        }
        AbstractC4263zK.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        InterfaceC3026cL interfaceC3026cL = this.zzz;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzz = interfaceC3026cL.D(size + size);
        }
        AbstractC4263zK.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        switch (AbstractC5049e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = vk == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new C4264zL(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", C4211yM.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", C3027cM.f29456k, "zzc", C3027cM.f29451e, "zzg", "zzj", "zzk", "zzu", "zzi", HM.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", JM.class, "zzC", "zzD", "zzE", "zzF", C3402jM.class, "zzG", C3027cM.f29460o, "zzH", C3833rM.class, "zzI", C3941tM.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", BM.class});
            case 3:
                return new FM();
            case 4:
                return new C3134eM(zzQ);
            case 5:
                return zzQ;
            case 6:
                InterfaceC4048vL interfaceC4048vL2 = zzR;
                if (interfaceC4048vL2 != null) {
                    return interfaceC4048vL2;
                }
                synchronized (FM.class) {
                    try {
                        interfaceC4048vL = zzR;
                        if (interfaceC4048vL == null) {
                            interfaceC4048vL = new UK(zzQ);
                            zzR = interfaceC4048vL;
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
