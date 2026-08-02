package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new com.google.android.gms.wallet.zzab(6);
    public final int zza;
    public final long zzb;

    public zzx(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza == zzxVar.zza && this.zzb == zzxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Integer.valueOf(this.zza), "result");
        workLauncherImpl.add(Long.valueOf(this.zzb), "timeMillis");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeLong(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
