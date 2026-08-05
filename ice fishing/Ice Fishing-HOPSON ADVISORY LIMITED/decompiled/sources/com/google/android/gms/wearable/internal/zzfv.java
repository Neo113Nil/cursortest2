package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzfv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
    public final int zza;
    public final List zzb;
    public final List zzc;

    public zzfv(int i, List list, List list2) {
        this.zza = i;
        this.zzb = list;
        this.zzc = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
