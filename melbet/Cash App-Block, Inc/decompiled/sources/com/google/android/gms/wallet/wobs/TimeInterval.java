package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzab(27);
    public long zza;
    public long zzb;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        long j = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(j2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
