package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzg(2);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MooncakeHeaderViewKt.zzc(parcel, MooncakeHeaderViewKt.zzb(parcel, 20293));
    }
}
