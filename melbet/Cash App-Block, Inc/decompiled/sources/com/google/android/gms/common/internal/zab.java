package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new com.google.android.gms.appset.zzd(19);
    public final int zaa;
    public final String zab;
    public final long zac;
    public final int zad;
    public final boolean zae;

    public zab(int i, int i2, long j, String str, boolean z) {
        this.zaa = i;
        this.zab = str;
        this.zac = j;
        this.zad = i2;
        this.zae = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zab);
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(this.zac);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zad);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zae ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
