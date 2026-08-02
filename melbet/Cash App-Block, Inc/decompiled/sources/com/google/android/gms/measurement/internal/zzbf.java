package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzac(25);
    public final Bundle zza;

    public zzbf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzbe(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeBundle(parcel, 2, zzf());
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final Object zza(String str) {
        return this.zza.get(str);
    }

    public final Long zzb(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    public final Double zzc() {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final String zzd(String str) {
        return this.zza.getString(str);
    }

    public final Bundle zzf() {
        return new Bundle(this.zza);
    }
}
