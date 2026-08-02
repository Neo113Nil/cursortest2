package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbi> CREATOR = new zzn(2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof zzbi;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "InferenceErrorDetails {}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MooncakeHeaderViewKt.zzc(parcel, MooncakeHeaderViewKt.zzb(parcel, 20293));
    }
}
