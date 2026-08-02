package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PendingGetCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PendingGetCredentialHandle> CREATOR = new zzef(24);
    public final PendingIntent pendingIntent;

    public PendingGetCredentialHandle(PendingIntent pendingIntent) {
        pendingIntent.getClass();
        this.pendingIntent = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.pendingIntent, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
