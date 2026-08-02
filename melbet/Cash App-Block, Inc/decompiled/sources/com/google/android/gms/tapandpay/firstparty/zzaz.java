package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zab(22);
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    public zzaz(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zza == zzazVar.zza && this.zzb == zzazVar.zzb && this.zzc == zzazVar.zzc && this.zzd == zzazVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Integer.valueOf(this.zza), "transactionDelivery");
        workLauncherImpl.add(Integer.valueOf(this.zzb), "transactionLimit");
        workLauncherImpl.add(Integer.valueOf(this.zzc), "supportedTransactions");
        workLauncherImpl.add(Integer.valueOf(this.zzd), "deliveryPreference");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
