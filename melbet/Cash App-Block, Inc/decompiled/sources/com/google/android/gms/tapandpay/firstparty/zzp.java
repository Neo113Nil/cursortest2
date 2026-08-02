package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new com.google.android.gms.wallet.zzab(2);
    public final CardInfo[] zza;
    public final AccountInfo zzb;
    public final String zzc;
    public final String zzd;
    public final SparseArray zze;
    public final byte[] zzf;

    public zzp(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray, byte[] bArr) {
        this.zza = cardInfoArr;
        this.zzb = accountInfo;
        this.zzc = str;
        this.zzd = str2;
        this.zze = sparseArray;
        this.zzf = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        SparseArray sparseArray = this.zze;
        if (sparseArray != null) {
            int zzb2 = MooncakeHeaderViewKt.zzb(parcel, 6);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            MooncakeHeaderViewKt.zzc(parcel, zzb2);
        }
        MooncakeHeaderViewKt.writeByteArray(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
