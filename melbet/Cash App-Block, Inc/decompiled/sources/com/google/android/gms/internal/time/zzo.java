package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzh(4);
    public final long zzb;

    public zzo(int i, long j) {
        if (i == 1) {
            this.zzb = j;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid ticker type. Refer to @TickerType to see all the valid cases.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzo) && this.zzb == ((zzo) obj).zzb;
    }

    public final int hashCode() {
        return Objects.hash(1, Long.valueOf(this.zzb));
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.zzb, "}", new StringBuilder("ParcelableTicks{tickerType=1, value="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(1);
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeLong(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
