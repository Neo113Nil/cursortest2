package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbn> CREATOR = new zzn(4);
    public final ParcelFileDescriptor zza;
    public final String zzb;

    public zzbn(ParcelFileDescriptor parcelFileDescriptor, String str) {
        this.zza = parcelFileDescriptor;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
