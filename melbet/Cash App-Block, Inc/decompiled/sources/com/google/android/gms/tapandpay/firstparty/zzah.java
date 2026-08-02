package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zab(12);
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;

    public zzah(int i, int i2, int i3, boolean z, boolean z2) {
        this.zza = z;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (this.zza == zzahVar.zza && this.zzb == zzahVar.zzb && this.zzd == zzahVar.zzd && this.zzc == zzahVar.zzc && this.zze == zzahVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Boolean.valueOf(this.zze)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Boolean.valueOf(this.zza), "requireCdcvmPassing");
        workLauncherImpl.add(Integer.valueOf(this.zzb), "cdcvmExpirationInSecs");
        workLauncherImpl.add(Integer.valueOf(this.zzc), "unlockedTapLimit");
        workLauncherImpl.add(Integer.valueOf(this.zzd), "cdcvmTapLimit");
        workLauncherImpl.add(Boolean.valueOf(this.zze), "prioritizeOnlinePinOverCdcvm");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
