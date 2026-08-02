package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzb(14);
    public ArrayList zza;
    public String zzb;
    public String zzc;
    public ArrayList zzd;
    public boolean zze;
    public String zzf;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeIntegerList(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzc);
        MooncakeHeaderViewKt.writeIntegerList(parcel, 6, this.zzd);
        boolean z = this.zze;
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
