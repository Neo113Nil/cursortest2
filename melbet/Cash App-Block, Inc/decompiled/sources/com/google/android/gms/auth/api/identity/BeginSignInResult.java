package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zzd(7);
    public final PendingIntent zba;

    public BeginSignInResult(PendingIntent pendingIntent) {
        zzae.checkNotNull(pendingIntent);
        this.zba = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zba, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
