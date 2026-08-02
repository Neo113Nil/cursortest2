package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzac(13);
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;

    public zzal(long j, long j2, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc)});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        long j = this.zzd;
        int length3 = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, "NetworkLocationStatus: Wifi status: ", " Cell status: ", sb);
        Boxes$$ExternalSyntheticOutline1.m1151m(j, " elapsed time NS: ", " system time ms: ", sb);
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 8);
        parcel.writeLong(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
