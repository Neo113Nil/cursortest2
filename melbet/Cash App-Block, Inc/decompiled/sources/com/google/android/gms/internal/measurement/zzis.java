package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class zzis extends zzadu {
    private static final zzis zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzis zzisVar = new zzis();
        zzh = zzisVar;
        zzadu.zzcs(zzis.class, zzisVar);
    }

    public static zzil zzb() {
        return (zzil) zzh.zzcn();
    }

    public static zzis zzc() {
        return zzh;
    }

    public final int zza$1() {
        int _zzb = FillrEnv$EnumUnboxingLocalUtility._zzb(this.zzf);
        if (_zzb == 0) {
            return 1;
        }
        return _zzb;
    }

    public final void zzd$1(int i) {
        this.zzf = FillrEnv$EnumUnboxingLocalUtility.getZzm(i);
        this.zzb |= 2;
    }

    public final int zzf() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zzfj.zza$13, "zzf", zzfj.zza$11, "zzg", zzfj.zza$12});
        }
        if (i2 == 3) {
            return new zzis();
        }
        if (i2 == 4) {
            return new zzil(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzi;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzis.class) {
            try {
                zzafjVar = zzi;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzh);
                    zzi = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final int zzh() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzj(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }
}
