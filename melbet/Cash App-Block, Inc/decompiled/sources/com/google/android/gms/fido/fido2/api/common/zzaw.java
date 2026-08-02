package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new com.google.android.gms.common.zzs(17);
    public final String zza;

    public zzaw(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaw) {
            return zzae.equal(this.zza, ((zzaw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
