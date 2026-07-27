package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.RandomAccess;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3239g6 extends AbstractC3199fL {
    private static final C3239g6 zzu;
    private static volatile GL zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private InterfaceC3630nL zzb = JL.f25761x;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private InterfaceC3414jL zzn = C3254gL.f30989x;

    static {
        C3239g6 c3239g6 = new C3239g6();
        zzu = c3239g6;
        AbstractC3199fL.u(C3239g6.class, c3239g6);
    }

    public static C3184f6 A() {
        return (C3184f6) zzu.r();
    }

    public final void B(C3723p6 c3723p6) {
        InterfaceC3630nL interfaceC3630nL = this.zzb;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzb = interfaceC3630nL.A(size + size);
        }
        this.zzb.add(c3723p6);
    }

    public final void C() {
        this.zzb = JL.f25761x;
    }

    public final /* synthetic */ void D(long j9) {
        this.zza |= 1;
        this.zzc = j9;
    }

    public final /* synthetic */ void E(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void I(long j9) {
        this.zza |= 64;
        this.zzi = j9;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void L(long j9) {
        this.zza |= 512;
        this.zzl = j9;
    }

    public final /* synthetic */ void M(long j9) {
        this.zza |= 1024;
        this.zzm = j9;
    }

    public final void N(InterfaceC3414jL interfaceC3414jL) {
        RandomAccess randomAccess = this.zzn;
        if (!((JK) randomAccess).f25759n) {
            C3254gL c3254gL = (C3254gL) randomAccess;
            int i = c3254gL.f30991v;
            this.zzn = c3254gL.A(i + i);
        }
        IK.e(interfaceC3414jL, this.zzn);
    }

    public final /* synthetic */ void O(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    public final void P(int i) {
        this.zzo = i - 2;
        this.zza |= 2048;
    }

    public final /* synthetic */ void Q(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", C3723p6.class, "zzc", "zzd", "zze", "zzf", "zzg", C3293h6.f31153d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (d2 == 3) {
            return new C3239g6();
        }
        if (d2 == 4) {
            return new C3184f6(zzu);
        }
        if (d2 == 5) {
            return zzu;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzv;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3239g6.class) {
            try {
                gl = zzv;
                if (gl == null) {
                    gl = new C3144eL(zzu);
                    zzv = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
