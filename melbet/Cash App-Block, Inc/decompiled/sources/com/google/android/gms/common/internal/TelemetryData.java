package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.List;

/* loaded from: classes.dex */
public final class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new com.google.android.gms.common.zza(5);
    public final int zaa;
    public List zab;

    public TelemetryData(int i, List list) {
        this.zaa = i;
        this.zab = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeInt(parcel, 1, this.zaa);
        MooncakeHeaderViewKt.writeTypedList(parcel, 2, this.zab);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }
}
