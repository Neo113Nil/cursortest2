package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.w9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4113w9 extends VK {
    private static final C4113w9 zzL;
    private static volatile InterfaceC4071vL zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private K9 zzA;
    private C4275z9 zzB;
    private int zzC;
    private int zzD;
    private C3951t9 zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private J9 zzv;
    private L9 zzw;
    private M9 zzx;
    private N9 zzy;
    private C4167x9 zzz;

    static {
        C4113w9 c4113w9 = new C4113w9();
        zzL = c4113w9;
        VK.u(C4113w9.class, c4113w9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (d9 == 3) {
            return new C4113w9();
        }
        if (d9 == 4) {
            return new C3625n6(zzL);
        }
        if (d9 == 5) {
            return zzL;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzM;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C4113w9.class) {
            try {
                interfaceC4071vL = zzM;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzL);
                    zzM = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
