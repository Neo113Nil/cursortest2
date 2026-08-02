package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes4.dex */
public final class zznr extends zzadu {
    private static final zznr zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzafm.zzb;
    private String zzf = "";

    static {
        zznr zznrVar = new zznr();
        zzg = zznrVar;
        zzadu.zzcs(zznr.class, zznrVar);
    }

    public static zznr zzb() {
        return zzg;
    }

    public final List zza() {
        return this.zze;
    }

    public final void zzc$4(String str) {
        zzaef zzaefVar = this.zze;
        if (!((zzace) zzaefVar).zza) {
            this.zze = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void zzd(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zznr();
        }
        if (i2 == 4) {
            return new zznq(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzh;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zznr.class) {
            try {
                zzafjVar = zzh;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzg);
                    zzh = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
