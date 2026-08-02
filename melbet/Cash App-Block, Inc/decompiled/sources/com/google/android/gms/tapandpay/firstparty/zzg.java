package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zab(26);
    public boolean zza;
    public boolean zzb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (zzae.equal(Boolean.valueOf(this.zza), Boolean.valueOf(zzgVar.zza)) && zzae.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzgVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        boolean z = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
