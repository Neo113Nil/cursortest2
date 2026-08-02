package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new zzab(10);
    public final int zza;
    public final int zzb;
    public final byte[] zzc;
    public final String zzd;
    public final String zze;
    public final UserAddress zzf;
    public final boolean zzg;
    public final int[] zzh;
    public final IBinder zzi;

    public PushTokenizeRequest(int i, int i2, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z, int[] iArr, IBinder iBinder) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = userAddress;
        this.zzg = z;
        this.zzh = iArr;
        this.zzi = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzf, i);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(this.zzg ? 1 : 0);
        MooncakeHeaderViewKt.writeIntArray(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.writeIBinder(parcel, 10, this.zzi);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
