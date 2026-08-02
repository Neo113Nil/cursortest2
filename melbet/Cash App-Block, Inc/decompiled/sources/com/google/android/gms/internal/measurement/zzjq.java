package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjg(5);
    public final String zza;
    public final String zzb;
    public final zzjo zzc;
    public final boolean zzd;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzjoVar;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzh.zza(this.zza, zzjqVar.zza) && zzh.zza(this.zzb, zzjqVar.zzb) && zzh.zza(this.zzc, zzjqVar.zzc) && this.zzd == zzjqVar.zzd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        zza(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final void zza(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.zza);
        sb.append(", ");
        sb.append(this.zzb);
        sb.append(", ");
        this.zzc.zzf(sb);
        sb.append(", ");
        sb.append(this.zzd);
        sb.append(")");
    }
}
