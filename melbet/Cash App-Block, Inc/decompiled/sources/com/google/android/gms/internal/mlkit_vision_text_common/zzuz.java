package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzg(5);
    public final String zza;
    public final Rect zzb;
    public final List zzc;
    public final String zzd;
    public final List zze;

    public zzuz(String str, Rect rect, ArrayList arrayList, String str2, ArrayList arrayList2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = arrayList;
        this.zzd = str2;
        this.zze = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeTypedList(parcel, 5, this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
