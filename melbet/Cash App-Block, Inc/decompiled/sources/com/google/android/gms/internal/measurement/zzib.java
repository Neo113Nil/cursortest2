package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzib extends zzadu {
    private static final zzib zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzaef zze = zzafm.zzb;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzib zzibVar = new zzib();
        zzi = zzibVar;
        zzadu.zzcs(zzib.class, zzibVar);
    }

    public static zzhz zzi() {
        return (zzhz) zzi.zzcn();
    }

    public static zzhz zzj(zzib zzibVar) {
        zzadp zzcn = zzi.zzcn();
        zzcn.zzbe(zzibVar);
        return (zzhz) zzcn;
    }

    public final List zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final zzid zzc(int i) {
        return (zzid) this.zze.get(i);
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", zzid.class, "zzf", "zzg", "zzh", zzfj.zza$9});
        }
        if (i2 == 3) {
            return new zzib();
        }
        if (i2 == 4) {
            return new zzhz(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzj;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzib.class) {
            try {
                zzafjVar = zzj;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzi);
                    zzj = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final /* synthetic */ void zzk(int i, zzid zzidVar) {
        zzr();
        this.zze.set(i, zzidVar);
    }

    public final /* synthetic */ void zzl(zzid zzidVar) {
        zzr();
        this.zze.add(zzidVar);
    }

    public final void zzm(ArrayList arrayList) {
        zzr();
        zzadp.zzaV(arrayList, this.zze);
    }

    public final void zzn$1() {
        this.zze = zzafm.zzb;
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void zzr() {
        zzaef zzaefVar = this.zze;
        if (((zzace) zzaefVar).zza) {
            return;
        }
        this.zze = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
    }
}
