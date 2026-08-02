package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzh(8);
    public int zza;
    public boolean zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        return this.zza == zzahVar.zza && zzae.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzahVar.zzb));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
