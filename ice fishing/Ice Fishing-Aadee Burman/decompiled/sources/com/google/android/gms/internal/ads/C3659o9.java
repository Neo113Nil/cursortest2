package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;
import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.o9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3659o9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C3659o9 zzv;
    private static volatile InterfaceC4048vL zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private InterfaceC3026cL zzj = C4210yL.f35149x;
    private String zzn = "";
    private String zzo = "";

    static {
        C3659o9 c3659o9 = new C3659o9();
        zzv = c3659o9;
        VK.u(C3659o9.class, c3659o9);
    }

    public static C3551m9 A() {
        return (C3551m9) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        InterfaceC3026cL interfaceC3026cL = this.zzj;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzj = interfaceC3026cL.D(size + size);
        }
        AbstractC4263zK.e(arrayList, this.zzj);
    }

    public final void C(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void D(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void E(long j6) {
        this.zzi |= 4;
        this.zzm = j6;
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

    public final void H(long j6) {
        this.zzi |= 32;
        this.zzp = j6;
    }

    public final void I(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", C3497l9.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (d2 == 3) {
            return new C3659o9();
        }
        if (d2 == 4) {
            return new C3551m9(zzv);
        }
        if (d2 == 5) {
            return zzv;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzw;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3659o9.class) {
            try {
                interfaceC4048vL = zzw;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzv);
                    zzw = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
