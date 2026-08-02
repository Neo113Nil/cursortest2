package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zab(15);
    public final int zza;
    public final int zzb;

    public zzan(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzan) {
            zzan zzanVar = (zzan) obj;
            if (zzae.equal(Integer.valueOf(this.zza), Integer.valueOf(zzanVar.zza)) && zzae.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzanVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Integer.valueOf(this.zza), "accountType");
        workLauncherImpl.add(Integer.valueOf(this.zzb), "status");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
