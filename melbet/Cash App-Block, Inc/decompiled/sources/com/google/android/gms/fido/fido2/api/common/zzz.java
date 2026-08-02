package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new com.google.android.gms.common.zzs(2);
    public final boolean zza;

    public zzz(boolean z) {
        this.zza = Boolean.valueOf(z).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.zza == ((zzz) obj).zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
