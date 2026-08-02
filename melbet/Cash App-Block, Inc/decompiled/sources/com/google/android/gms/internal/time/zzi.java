package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.time.zza;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR;
    public final long zza;
    public final int zzb;

    static {
        new zzi(0L, 0);
        new zzi(31556889864403199L, 999999999);
        new zzi(-31557014167219200L, 0);
        CREATOR = new zzh(1);
    }

    public zzi(long j, int i) {
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new zza("Instant exceeds minimum or maximum instant");
        }
        this.zza = j;
        if (i < 0 || i > 999999999) {
            throw new zza("Nano adjustment should be in the range 0 to 999,999,999");
        }
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.zza == zziVar.zza && this.zzb == zziVar.zzb;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableInstant{epochSecond=");
        sb.append(this.zza);
        sb.append(", nanosOfSecond=");
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
}
