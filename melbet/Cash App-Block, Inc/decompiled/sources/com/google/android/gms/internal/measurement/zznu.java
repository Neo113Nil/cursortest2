package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zznu extends zzadu {
    private static final zznu zze;
    private static volatile zzafj zzf;
    private zzaew zzb = zzaew.zzb;

    static {
        zznu zznuVar = new zznu();
        zze = zznuVar;
        zzadu.zzcs(zznu.class, zznuVar);
    }

    public static zznu zzb() {
        return zze;
    }

    public final zznr zza(String str, zznr zznrVar) {
        str.getClass();
        zznr zznrVar2 = (zznr) this.zzb.get(str);
        return zznrVar2 != null ? zznrVar2 : zznrVar;
    }

    public final zzaew zzc() {
        zzaew zzaewVar = this.zzb;
        if (!zzaewVar.zza) {
            this.zzb = zzaewVar.zzc();
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", zzns.zza});
        }
        if (i2 == 3) {
            return new zznu();
        }
        if (i2 == 4) {
            return new zznt(zze);
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
        synchronized (zznu.class) {
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
