package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;
import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3510l9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C3510l9 zzv;
    private static volatile GL zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private InterfaceC3630nL zzj = JL.f25761x;
    private String zzn = "";
    private String zzo = "";

    static {
        C3510l9 c3510l9 = new C3510l9();
        zzv = c3510l9;
        AbstractC3199fL.u(C3510l9.class, c3510l9);
    }

    public static C3402j9 A() {
        return (C3402j9) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        InterfaceC3630nL interfaceC3630nL = this.zzj;
        if (!((JK) interfaceC3630nL).f25759n) {
            int size = interfaceC3630nL.size();
            this.zzj = interfaceC3630nL.A(size + size);
        }
        IK.e(arrayList, this.zzj);
    }

    public final void C(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void D(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void E(long j9) {
        this.zzi |= 4;
        this.zzm = j9;
    }

    public final void F(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void G() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void H(long j9) {
        this.zzi |= 32;
        this.zzp = j9;
    }

    public final void I(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", C3350i9.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (d2 == 3) {
            return new C3510l9();
        }
        if (d2 == 4) {
            return new C3402j9(zzv);
        }
        if (d2 == 5) {
            return zzv;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzw;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3510l9.class) {
            try {
                gl = zzw;
                if (gl == null) {
                    gl = new C3144eL(zzv);
                    zzw = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
