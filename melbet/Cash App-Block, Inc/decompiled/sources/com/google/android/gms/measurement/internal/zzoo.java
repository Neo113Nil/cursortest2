package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzac(29);
    public final List zza;

    public zzoo(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public static zzoo zza(zzls... zzlsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zzg));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeIntegerList(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
