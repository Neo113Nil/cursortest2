package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzag implements zzao {
    public final zzao zza;
    public final String zzb;

    public zzag(String str) {
        this.zza = zzao.zzf;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zzb.equals(zzagVar.zzb) && this.zza.equals(zzagVar.zza);
    }

    public final int hashCode() {
        return this.zza.hashCode() + (this.zzb.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzag(this.zzb, this.zza.zzt());
    }

    public zzag(String str, zzao zzaoVar) {
        this.zza = zzaoVar;
        this.zzb = str;
    }
}
