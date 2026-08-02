package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new zzef(10);
    public final String zza;

    public FidoAppIdExtension(String str) {
        zzae.checkNotNull(str);
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.zza.equals(((FidoAppIdExtension) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("FidoAppIdExtension{appid='"), this.zza, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
