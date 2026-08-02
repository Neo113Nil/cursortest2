package com.google.android.libraries.places.api.net;

import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.internal.zzgc;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzu {
    public List zza;
    public List zzb;
    public zzgc zzc;
    public String zzd;
    public int zze;
    public Uri zzf;
    public byte zzg;

    public final zzv build() {
        List list;
        List list2 = this.zza;
        if (list2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"places\" has not been set");
            return null;
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list2);
        if (copyOf == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null places");
            return null;
        }
        this.zza = copyOf;
        List list3 = this.zzb;
        if (list3 != null) {
            this.zzb = ImmutableList.copyOf((Collection) list3);
        }
        if (this.zzg == 1 && (list = this.zza) != null) {
            return new zzv(list, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" places");
        }
        if (this.zzg == 0) {
            sb.append(" responsePageIndex");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
