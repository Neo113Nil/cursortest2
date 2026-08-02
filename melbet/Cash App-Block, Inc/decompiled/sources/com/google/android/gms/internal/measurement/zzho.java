package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzho extends zzadu {
    private static final zzho zze;
    private static volatile zzafj zzf;
    private zzaef zzb = zzafm.zzb;

    static {
        zzho zzhoVar = new zzho();
        zze = zzhoVar;
        zzadu.zzcs(zzho.class, zzhoVar);
    }

    public static zzhh zzb() {
        return (zzhh) zze.zzcn();
    }

    public static zzho zzc() {
        return zze;
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzd(ArrayList arrayList) {
        zzaef zzaefVar = this.zzb;
        if (!((zzace) zzaefVar).zza) {
            this.zzb = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        zzadp.zzaV(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzhl.class});
        }
        if (i2 == 3) {
            return new zzho();
        }
        if (i2 == 4) {
            return new zzhh(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzf;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzho.class) {
            try {
                zzafjVar = zzf;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zze);
                    zzf = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
