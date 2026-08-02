package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzg(10);
    public final String zza;
    public final Rect zzb;
    public final List zzc;
    public final float zzd;
    public final float zze;

    public zzvj(String str, Rect rect, ArrayList arrayList, float f, float f2) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = arrayList;
        this.zzd = f;
        this.zze = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeFloat(this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
