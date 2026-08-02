package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CredentialTransferCapabilities extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialTransferCapabilities> CREATOR = new zzef(20);
    public final Bundle responseBundle;

    public CredentialTransferCapabilities(Bundle bundle) {
        bundle.getClass();
        this.responseBundle = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeBundle(parcel, 1, this.responseBundle);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
