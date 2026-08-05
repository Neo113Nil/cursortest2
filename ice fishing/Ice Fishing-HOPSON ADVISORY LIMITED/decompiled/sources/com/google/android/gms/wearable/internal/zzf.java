package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final zzgp zza;
    public final IntentFilter[] zzb;
    public final String zzc;
    public final String zzd;

    zzf(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        zzgp zzgpVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            zzgpVar = queryLocalInterface instanceof zzgp ? (zzgp) queryLocalInterface : new zzgn(iBinder);
        } else {
            zzgpVar = null;
        }
        this.zza = zzgpVar;
        this.zzb = intentFilterArr;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzgp zzgpVar = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, zzgpVar == null ? null : zzgpVar.asBinder(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzf(zzko zzkoVar) {
        this.zza = zzkoVar;
        this.zzb = zzkoVar.zzv();
        this.zzc = zzkoVar.zzw();
        this.zzd = null;
    }
}
