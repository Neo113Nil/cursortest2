package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzac(10);
    public final List zza;
    public final boolean zzb;
    public final boolean zzc;

    public LocationSettingsRequest(ArrayList arrayList, boolean z, boolean z2) {
        this.zza = arrayList;
        this.zzb = z;
        this.zzc = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza));
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
