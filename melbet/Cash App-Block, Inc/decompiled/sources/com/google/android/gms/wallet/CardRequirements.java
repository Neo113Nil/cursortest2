package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzb(11);
    public ArrayList zza;
    public boolean zzb;
    public boolean zzc;
    public int zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeIntegerList(parcel, 1, this.zza);
        boolean z = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
