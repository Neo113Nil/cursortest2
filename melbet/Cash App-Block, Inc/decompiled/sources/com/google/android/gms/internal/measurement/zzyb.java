package com.google.android.gms.internal.measurement;

import java.io.File;

/* loaded from: classes.dex */
public final class zzyb extends zzyc {
    public int zzf;

    public final boolean equals(Object obj) {
        return obj instanceof zzyb;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        this.zzf = -1391114360;
        return -1391114360;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zza() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zzb() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final int zzc() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zzd() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String zze() {
        return "Phlogger.java";
    }
}
