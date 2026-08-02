package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab(0);
    public final int zaa;
    public final int zab;
    public final Intent zac;

    public zaa(int i, int i2, Intent intent) {
        this.zaa = i;
        this.zab = i2;
        this.zac = intent;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zab == 0 ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zab);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zac, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
