package com.google.android.libraries.places.api.net;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzj {
    public String zza;
    public List zze;
    public zzdi zzf;
    public List zzg;
    public com.google.android.gms.tasks.zzb zzk;
    public byte zzl;

    public final zzk build() {
        List list;
        List list2;
        List list3 = this.zze;
        if (list3 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"countries\" has not been set");
            return null;
        }
        setCountries(ImmutableList.copyOf((Collection) list3));
        List list4 = this.zzg;
        if (list4 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Property \"typesFilter\" has not been set");
            return null;
        }
        setTypesFilter(ImmutableList.copyOf((Collection) list4));
        if (this.zzl == 1 && (list = this.zze) != null && (list2 = this.zzg) != null) {
            return new zzk(this.zza, list, this.zzf, list2, this.zzk);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zze == null) {
            sb.append(" countries");
        }
        if (this.zzg == null) {
            sb.append(" typesFilter");
        }
        if (this.zzl == 0) {
            sb.append(" pureServiceAreaBusinessesIncluded");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final void setCountries(List list) {
        if (list != null) {
            this.zze = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null countries");
        }
    }

    public final void setTypesFilter(List list) {
        if (list != null) {
            this.zzg = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null typesFilter");
        }
    }
}
