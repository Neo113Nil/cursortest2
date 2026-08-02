package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zab(14);
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;

    public zzal(int i, boolean z, boolean z2, boolean z3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Boolean.valueOf(this.zza), "transactions");
        workLauncherImpl.add(Boolean.valueOf(this.zzb), "plasticTransactions");
        workLauncherImpl.add(Boolean.valueOf(this.zzc), "promotions");
        workLauncherImpl.add(Integer.valueOf(this.zzd), "bitMask");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
