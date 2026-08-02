package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new zzd(27);
    public final boolean zaa;
    public final int zab;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.zaa = z;
        this.zab = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zab);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
