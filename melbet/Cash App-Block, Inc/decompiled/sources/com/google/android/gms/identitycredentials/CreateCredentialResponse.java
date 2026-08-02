package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CreateCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCredentialResponse> CREATOR = new zzef(18);
    public final Bundle data;

    /* renamed from: type, reason: collision with root package name */
    public final String f991type;

    public CreateCredentialResponse(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        this.f991type = str;
        this.data = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.f991type);
        MooncakeHeaderViewKt.writeBundle(parcel, 2, this.data);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
