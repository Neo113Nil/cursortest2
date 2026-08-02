package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CreateCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCredentialHandle> CREATOR = new zzef(16);
    public final CreateCredentialResponse createCredentialResponse;
    public final PendingIntent pendingIntent;

    public CreateCredentialHandle(PendingIntent pendingIntent, CreateCredentialResponse createCredentialResponse) {
        this.pendingIntent = pendingIntent;
        this.createCredentialResponse = createCredentialResponse;
        if (pendingIntent == null && createCredentialResponse == null) {
            a$$ExternalSyntheticBUOutline0.m$3("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.pendingIntent, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.createCredentialResponse, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
