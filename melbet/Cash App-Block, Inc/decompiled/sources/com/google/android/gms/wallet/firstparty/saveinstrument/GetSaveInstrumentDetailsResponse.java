package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsResponse> CREATOR = new zzab(16);
    public String[] zza;
    public int[] zzb;
    public RemoteViews zzc;
    public byte[] zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeStringArray(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeIntArray(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
