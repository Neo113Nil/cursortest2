package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = new zzjg(6);
    public final List zza;

    public zzjs(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjs) {
            return this.zza.equals(((zzjs) obj).zza);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (zzjq zzjqVar : this.zza) {
            if (!z) {
                sb.append(", ");
            }
            zzjqVar.zza(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 2, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
