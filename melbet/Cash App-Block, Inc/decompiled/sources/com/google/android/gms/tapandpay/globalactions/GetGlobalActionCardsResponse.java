package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new zzab(7);
    public GlobalActionCard[] zza;
    public int zzb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && zzae.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsResponse.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 1, this.zza, i);
        int i2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
