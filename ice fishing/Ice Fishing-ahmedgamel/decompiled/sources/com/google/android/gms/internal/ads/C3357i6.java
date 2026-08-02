package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3357i6 extends VK {
    private static final C3357i6 zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private C3787q6 zzg;
    private C3948t6 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        C3357i6 c3357i6 = new C3357i6();
        zzj = c3357i6;
        VK.u(C3357i6.class, c3357i6);
    }

    public static C3303h6 E() {
        return (C3303h6) zzj.r();
    }

    public final String A() {
        return this.zzd;
    }

    public final boolean B() {
        return this.zze;
    }

    public final C3787q6 C() {
        C3787q6 c3787q6 = this.zzg;
        return c3787q6 == null ? C3787q6.D() : c3787q6;
    }

    public final void D() {
        if (this.zzh == null) {
            int i = C3948t6.f35005a;
        }
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void G(boolean z6) {
        this.zza |= 8;
        this.zze = z6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", C3517l6.f32495b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d9 == 3) {
            return new C3357i6();
        }
        if (d9 == 4) {
            return new C3303h6(zzj);
        }
        if (d9 == 5) {
            return zzj;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzk;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3357i6.class) {
            try {
                interfaceC4071vL = zzk;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzj);
                    zzk = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
