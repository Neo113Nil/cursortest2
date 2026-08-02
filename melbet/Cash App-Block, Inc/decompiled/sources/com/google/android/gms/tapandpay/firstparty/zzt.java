package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new com.google.android.gms.wallet.zzab(4);
    public final ContactlessSetupItem[] zza;

    public zzt(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.zza = contactlessSetupItemArr;
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        for (ContactlessSetupItem contactlessSetupItem : this.zza) {
            workLauncherImpl.add(Integer.valueOf(contactlessSetupItem.zza), "type");
            workLauncherImpl.add(Integer.valueOf(contactlessSetupItem.zzb), "status");
        }
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
