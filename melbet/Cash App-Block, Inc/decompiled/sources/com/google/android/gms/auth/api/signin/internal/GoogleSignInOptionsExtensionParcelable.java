package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zzd(13);
    public final int zaa;
    public final int zab;
    public final Bundle zac;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.zaa = i;
        this.zab = i2;
        this.zac = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zab);
        MooncakeHeaderViewKt.writeBundle(parcel, 3, this.zac);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
