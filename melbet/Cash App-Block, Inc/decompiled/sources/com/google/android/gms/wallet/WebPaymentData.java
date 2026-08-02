package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class WebPaymentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new zzb(9);
    public String zza;
    public Bundle zzb;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeBundle(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
