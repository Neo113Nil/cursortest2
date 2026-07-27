package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.zM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4278zM extends AbstractC3199fL {
    private static final C4278zM zze;
    private static volatile GL zzf;
    private int zza;
    private SK zzb;
    private SK zzc;
    private byte zzd = 2;

    static {
        C4278zM c4278zM = new C4278zM();
        zze = c4278zM;
        AbstractC3199fL.u(C4278zM.class, c4278zM);
    }

    public C4278zM() {
        QK qk = SK.f27529u;
        this.zzb = qk;
        this.zzc = qk;
    }

    public static C4224yM A() {
        return (C4224yM) zze.r();
    }

    public final /* synthetic */ void B(QK qk) {
        qk.getClass();
        this.zza |= 1;
        this.zzb = qk;
    }

    public final /* synthetic */ void C(SK sk) {
        sk.getClass();
        this.zza |= 2;
        this.zzc = sk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        switch (AbstractC5088e.d(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = abstractC3199fL == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new KL(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new C4278zM();
            case 4:
                return new C4224yM(zze);
            case 5:
                return zze;
            case 6:
                GL gl2 = zzf;
                if (gl2 != null) {
                    return gl2;
                }
                synchronized (C4278zM.class) {
                    try {
                        gl = zzf;
                        if (gl == null) {
                            gl = new C3144eL(zze);
                            zzf = gl;
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
