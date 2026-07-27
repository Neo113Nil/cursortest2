package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class TM extends AbstractC3199fL {
    private static final TM zzQ;
    private static volatile GL zzR;
    private RM zzA;
    private InterfaceC3630nL zzB;
    private C4116wM zzC;
    private String zzD;
    private C3846rM zzE;
    private InterfaceC3630nL zzF;
    private int zzG;
    private InterfaceC3630nL zzH;
    private InterfaceC3630nL zzI;
    private long zzJ;
    private SM zzK;
    private GM zzL;
    private String zzM;
    private QM zzN;
    private InterfaceC3630nL zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private C4008uM zzg;
    private InterfaceC3630nL zzh;
    private InterfaceC3630nL zzi;
    private String zzj;
    private JM zzk;
    private boolean zzl;
    private InterfaceC3630nL zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private SK zzu;
    private OM zzv;
    private boolean zzw;
    private String zzx;
    private InterfaceC3630nL zzy;
    private InterfaceC3630nL zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        TM tm = new TM();
        zzQ = tm;
        AbstractC3199fL.u(TM.class, tm);
    }

    public TM() {
        JL jl = JL.f25761x;
        this.zzh = jl;
        this.zzi = jl;
        this.zzj = "";
        this.zzm = jl;
        this.zzn = "";
        this.zzu = SK.f27529u;
        this.zzx = "";
        this.zzy = jl;
        this.zzz = jl;
        this.zzB = jl;
        this.zzD = "";
        this.zzF = jl;
        this.zzH = jl;
        this.zzI = jl;
        this.zzM = "";
        this.zzO = jl;
    }

    public static C3900sM D() {
        return (C3900sM) zzQ.r();
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

    public final /* synthetic */ void G(C4008uM c4008uM) {
        this.zzg = c4008uM;
        this.zza |= 32;
    }

    public final void H(MM mm) {
        InterfaceC3630nL interfaceC3630nL = this.zzh;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzh = interfaceC3630nL.A(size + size);
        }
        this.zzh.add(mm);
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void J() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void K(JM jm) {
        this.zzk = jm;
        this.zza |= 128;
    }

    public final /* synthetic */ void L(OM om) {
        this.zzv = om;
        this.zza |= 8192;
    }

    public final void M(ArrayList arrayList) {
        InterfaceC3630nL interfaceC3630nL = this.zzy;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzy = interfaceC3630nL.A(size + size);
        }
        IK.e(arrayList, this.zzy);
    }

    public final void N(ArrayList arrayList) {
        InterfaceC3630nL interfaceC3630nL = this.zzz;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzz = interfaceC3630nL.A(size + size);
        }
        IK.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void O(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        switch (AbstractC5088e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = abstractC3199fL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new KL(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", MM.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", C3793qM.f33696k, "zzc", C3793qM.f33691e, "zzg", "zzj", "zzk", "zzu", "zzi", VM.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", YM.class, "zzC", "zzD", "zzE", "zzF", C4170xM.class, "zzG", C3793qM.f33700o, "zzH", FM.class, "zzI", HM.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", PM.class});
            case 3:
                return new TM();
            case 4:
                return new C3900sM(zzQ);
            case 5:
                return zzQ;
            case 6:
                GL gl2 = zzR;
                if (gl2 != null) {
                    return gl2;
                }
                synchronized (TM.class) {
                    try {
                        gl = zzR;
                        if (gl == null) {
                            gl = new C3144eL(zzQ);
                            zzR = gl;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gl;
            default:
                throw null;
        }
    }
}
