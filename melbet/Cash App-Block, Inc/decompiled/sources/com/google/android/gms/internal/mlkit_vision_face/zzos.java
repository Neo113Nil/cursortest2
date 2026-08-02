package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zze(4);
    public final int zza;
    public final List zzb;

    public zzos(int i, ArrayList arrayList) {
        this.zza = i;
        this.zzb = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeTypedList(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
