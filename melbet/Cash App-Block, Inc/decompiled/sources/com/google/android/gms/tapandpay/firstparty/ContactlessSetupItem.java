package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new zab(27);
    public final int zza;
    public final int zzb;

    public ContactlessSetupItem(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.zza == contactlessSetupItem.zza && this.zzb == contactlessSetupItem.zzb) {
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
        workLauncherImpl.add(Integer.valueOf(this.zza), "type");
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
