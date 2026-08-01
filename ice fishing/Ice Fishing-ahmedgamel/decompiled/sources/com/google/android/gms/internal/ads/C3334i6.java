package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3334i6 extends VK {
    private static final C3334i6 zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private C3764q6 zzg;
    private C3925t6 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        C3334i6 c3334i6 = new C3334i6();
        zzj = c3334i6;
        VK.u(C3334i6.class, c3334i6);
    }

    public static C3280h6 E() {
        return (C3280h6) zzj.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return this.zze;
    }

    public final C3764q6 C() {
        C3764q6 c3764q6 = this.zzg;
        return c3764q6 == null ? C3764q6.D() : c3764q6;
    }

    public final void D() {
        if (this.zzh == null) {
            int i = C3925t6.f34219a;
        }
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void G(boolean z3) {
        this.zza |= 8;
        this.zze = z3;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", C3494l6.f31715b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new C3334i6();
        }
        if (d2 == 4) {
            return new C3280h6(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3334i6.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
