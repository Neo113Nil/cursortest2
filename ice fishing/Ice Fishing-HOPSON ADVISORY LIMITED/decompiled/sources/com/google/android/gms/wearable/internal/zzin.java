package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzin extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzin> CREATOR = new zzio();
    final int zza;
    public final zzgp zzb;

    zzin(int i, IBinder iBinder) {
        zzgp zzgpVar;
        this.zza = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            zzgpVar = queryLocalInterface instanceof zzgp ? (zzgp) queryLocalInterface : new zzgn(iBinder);
        } else {
            zzgpVar = null;
        }
        this.zzb = zzgpVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        zzgp zzgpVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzgpVar == null ? null : zzgpVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzin(zzgp zzgpVar) {
        this.zza = 1;
        this.zzb = zzgpVar;
    }
}
