package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class EM extends AbstractC3199fL {
    private static final EM zzi;
    private static volatile GL zzj;
    private int zza;
    private DM zzb;
    private SK zzd;
    private SK zze;
    private int zzf;
    private SK zzg;
    private byte zzh = 2;
    private InterfaceC3630nL zzc = JL.f25761x;

    static {
        EM em = new EM();
        zzi = em;
        AbstractC3199fL.u(EM.class, em);
    }

    public EM() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
        this.zzg = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        switch (AbstractC5088e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = abstractC3199fL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new KL(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", C4278zM.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new EM();
            case 4:
                return new UL(zzi);
            case 5:
                return zzi;
            case 6:
                GL gl2 = zzj;
                if (gl2 != null) {
                    return gl2;
                }
                synchronized (EM.class) {
                    try {
                        gl = zzj;
                        if (gl == null) {
                            gl = new C3144eL(zzi);
                            zzj = gl;
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
