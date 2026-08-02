package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zab(4);
    public final List zaa;
    public final String zab;

    public zag(String str, ArrayList arrayList) {
        this.zaa = arrayList;
        this.zab = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zab != null ? Status.RESULT_SUCCESS : Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeStringList(parcel, 1, this.zaa);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zab);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
