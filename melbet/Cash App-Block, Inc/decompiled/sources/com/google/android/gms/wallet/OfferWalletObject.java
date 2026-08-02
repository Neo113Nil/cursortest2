package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzb(17);
    public final String zzb;
    public final CommonWalletObject zzc;
    public final int zzd;

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.zza = str;
        this.zzc = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
