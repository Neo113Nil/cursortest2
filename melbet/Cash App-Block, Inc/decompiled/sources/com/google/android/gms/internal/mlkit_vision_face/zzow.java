package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zze(6);
    public final int zza;
    public final Rect zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final float zzi;
    public final List zzj;
    public final List zzk;

    public zzow(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList, ArrayList arrayList2) {
        this.zza = i;
        this.zzb = rect;
        this.zzc = f;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = f7;
        this.zzj = arrayList;
        this.zzk = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeFloat(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeFloat(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeFloat(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeFloat(this.zzh);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeFloat(this.zzi);
        MooncakeHeaderViewKt.writeTypedList(parcel, 10, this.zzj);
        MooncakeHeaderViewKt.writeTypedList(parcel, 11, this.zzk);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
