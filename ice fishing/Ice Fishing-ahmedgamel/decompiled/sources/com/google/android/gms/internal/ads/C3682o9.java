package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;
import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.o9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3682o9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final C3682o9 zzv;
    private static volatile InterfaceC4071vL zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private InterfaceC3049cL zzj = C4233yL.f35935x;
    private String zzn = "";
    private String zzo = "";

    static {
        C3682o9 c3682o9 = new C3682o9();
        zzv = c3682o9;
        VK.u(C3682o9.class, c3682o9);
    }

    public static C3574m9 A() {
        return (C3574m9) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        InterfaceC3049cL interfaceC3049cL = this.zzj;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzj = interfaceC3049cL.D(size + size);
        }
        AbstractC4286zK.e(arrayList, this.zzj);
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", C3520l9.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (d9 == 3) {
            return new C3682o9();
        }
        if (d9 == 4) {
            return new C3574m9(zzv);
        }
        if (d9 == 5) {
            return zzv;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzw;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3682o9.class) {
            try {
                interfaceC4071vL = zzw;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzv);
                    zzw = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
