package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zab(16);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MooncakeHeaderViewKt.zzc(parcel, MooncakeHeaderViewKt.zzb(parcel, 20293));
    }
}
