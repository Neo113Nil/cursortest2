package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3733p6 extends VK {
    private static final C3733p6 zzo;
    private static volatile InterfaceC4071vL zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private InterfaceC3049cL zzm = C4233yL.f35935x;

    static {
        C3733p6 c3733p6 = new C3733p6();
        zzo = c3733p6;
        VK.u(C3733p6.class, c3733p6);
    }

    public static C3571m6 A() {
        return (C3571m6) zzo.r();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C3679o6.class, "zzn", C3517l6.f32496c});
        }
        if (d9 == 3) {
            return new C3733p6();
        }
        if (d9 == 4) {
            return new C3571m6(zzo);
        }
        if (d9 == 5) {
            return zzo;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzp;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3733p6.class) {
            try {
                interfaceC4071vL = zzp;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzo);
                    zzp = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
