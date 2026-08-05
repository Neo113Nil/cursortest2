package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzi(List list, List list2, List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
    }

    public final String toString() {
        com.google.android.gms.internal.wearable.zzag zza = com.google.android.gms.internal.wearable.zzah.zza(this);
        zza.zza("allowedDataItemFilters", this.zza);
        zza.zza("allowedCapabilities", this.zzb);
        zza.zza("allowedPackages", this.zzc);
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
