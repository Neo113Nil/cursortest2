package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new com.google.android.gms.wallet.zzab(5);
    public boolean zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            return zzae.equal(Boolean.valueOf(this.zza), Boolean.valueOf(((zzv) obj).zza));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        boolean z = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
