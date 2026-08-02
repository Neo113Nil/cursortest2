package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.zza;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR;
    public final long zza;
    public final int zzb;

    static {
        new zzg(0L, 0);
        CREATOR = new zzh(0);
    }

    public zzg(long j, int i) {
        if (i < 0 || i > 999999999) {
            throw new zza("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.zza = j;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        return this.zza == zzgVar.zza && this.zzb == zzgVar.zzb;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableDuration{seconds=");
        sb.append(this.zza);
        sb.append(", nano=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzb, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final long zzc() {
        return zzbz.zza(zzbz.zzb(this.zza, 1000L), this.zzb / 1000000);
    }
}
