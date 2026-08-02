package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzo extends Exception implements SafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzn(12);
    public final int zza;
    public final int zzb;
    public final zzca zzc;
    public final zzbi zzd;

    public zzo(int i, int i2, String str, zzca zzcaVar, zzbi zzbiVar) {
        super(str);
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcaVar;
        this.zzd = zzbiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, getMessage());
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zzd, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
