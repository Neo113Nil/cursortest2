package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new zzb(6);
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;

    public ProxyCard(String str, int i, int i2, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
