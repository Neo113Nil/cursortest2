package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzca extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzca> CREATOR = new zzn(10);
    public final int zza;

    public zzca(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzca) && this.zza == ((zzca) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i = this.zza;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RetryDetails { retryGuidance = ", i != 0 ? i != 1 ? i != 2 ? "Unknown" : "NOT_RETRYABLE" : "RETRYABLE" : "UNSPECIFIED", " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
