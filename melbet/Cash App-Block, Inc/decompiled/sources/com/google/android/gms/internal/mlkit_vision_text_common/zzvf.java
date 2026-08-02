package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzg(8);
    public final String zza;
    public final List zzb;

    public zzvf(String str, ArrayList arrayList) {
        this.zza = str;
        this.zzb = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeTypedList(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
