package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new zab(7);
    public final String zza;
    public final String zzb;

    public AccountInfo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (zzae.equal(this.zza, accountInfo.zza) && zzae.equal(this.zzb, accountInfo.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "accountId");
        workLauncherImpl.add(this.zzb, "accountName");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
