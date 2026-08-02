package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new zza(1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;

    public ComplianceOptions(int i, int i2, boolean z, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze)});
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzd;
        int length3 = String.valueOf(i3).length();
        boolean z = this.zze;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
