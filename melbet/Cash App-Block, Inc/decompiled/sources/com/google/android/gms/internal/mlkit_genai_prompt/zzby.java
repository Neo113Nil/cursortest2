package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzby implements SafeParcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new zzn(9);
    public final zzil zza;
    public final zzbl zzb;

    public zzby(ArrayList arrayList, zzbl zzblVar) {
        this.zza = zzil.zzj(arrayList);
        this.zzb = zzblVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
