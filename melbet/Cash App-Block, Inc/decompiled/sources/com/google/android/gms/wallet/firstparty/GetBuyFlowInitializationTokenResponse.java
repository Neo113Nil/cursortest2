package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new zzab(17);
    public byte[] zza;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
