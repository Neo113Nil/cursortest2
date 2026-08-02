package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zzb;
    public static final ApiMetadata zzb;
    public final ComplianceOptions zzc;
    public final boolean zzd;
    public boolean zze;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.zze = false;
        zzb = apiMetadata;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.zzc = complianceOptions;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return zzae.equal(this.zzc, apiMetadata.zzc) && this.zze == apiMetadata.zze && this.zzd == apiMetadata.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, Boolean.valueOf(this.zze), Boolean.valueOf(this.zzd)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int zzb2 = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zzc, i);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb2);
    }
}
