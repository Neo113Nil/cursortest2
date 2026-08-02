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
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zab(21);
    public final zzaw zza;
    public final int zzb;
    public final boolean zzc;

    public TokenStatus(zzaw zzawVar, int i, boolean z) {
        this.zza = zzawVar;
        this.zzb = i;
        this.zzc = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (zzae.equal(this.zza, tokenStatus.zza) && this.zzb == tokenStatus.zzb && this.zzc == tokenStatus.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "tokenReference");
        workLauncherImpl.add(Integer.valueOf(this.zzb), "tokenState");
        workLauncherImpl.add(Boolean.valueOf(this.zzc), "isSelected");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
