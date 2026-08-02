package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class SignalCredentialStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignalCredentialStateResponse> CREATOR = new zzef(29);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        MooncakeHeaderViewKt.zzc(parcel, MooncakeHeaderViewKt.zzb(parcel, 20293));
    }
}
