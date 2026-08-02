package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zab(6);
    public final int zaa;
    public final ConnectionResult zab;
    public final zay zac;

    public zak(int i, ConnectionResult connectionResult, zay zayVar) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zab, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zac, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
