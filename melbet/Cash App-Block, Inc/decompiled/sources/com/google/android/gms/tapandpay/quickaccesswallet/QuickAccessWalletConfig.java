package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzab(14);
    public int zza;
    public int zzb;
    public int zzc;
    public String[] zzd;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (zzae.equal(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && zzae.equal(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && zzae.equal(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(i4);
        MooncakeHeaderViewKt.writeStringArray(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
