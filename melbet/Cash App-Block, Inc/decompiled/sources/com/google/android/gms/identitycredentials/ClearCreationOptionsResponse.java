package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ClearCreationOptionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClearCreationOptionsResponse> CREATOR = new zzef(12);
    public final boolean isDeleted;

    public ClearCreationOptionsResponse(boolean z) {
        this.isDeleted = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
