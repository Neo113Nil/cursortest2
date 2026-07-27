package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class MM extends AbstractC3199fL {
    private static final MM zzl;
    private static volatile GL zzm;
    private int zza;
    private int zzb;
    private CM zzd;
    private EM zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private InterfaceC3414jL zzg = C3254gL.f30989x;
    private String zzh = "";
    private InterfaceC3630nL zzj = JL.f25761x;

    static {
        MM mm = new MM();
        zzl = mm;
        AbstractC3199fL.u(MM.class, mm);
    }

    public static LM C() {
        return (LM) zzl.r();
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

    public final /* synthetic */ void F(CM cm) {
        this.zzd = cm;
        this.zza |= 4;
    }

    public final void G(String str) {
        str.getClass();
        InterfaceC3630nL interfaceC3630nL = this.zzj;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzj = interfaceC3630nL.A(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void H(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        switch (AbstractC5088e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = abstractC3199fL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new KL(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C3793qM.f33697l, "zzj"});
            case 3:
                return new MM();
            case 4:
                return new LM(zzl);
            case 5:
                return zzl;
            case 6:
                GL gl2 = zzm;
                if (gl2 != null) {
                    return gl2;
                }
                synchronized (MM.class) {
                    try {
                        gl = zzm;
                        if (gl == null) {
                            gl = new C3144eL(zzl);
                            zzm = gl;
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
