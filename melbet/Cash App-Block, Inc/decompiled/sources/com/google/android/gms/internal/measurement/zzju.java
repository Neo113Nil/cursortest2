package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjg(7);
    public final int zza;
    public final int zzb;

    public zzju(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzju zzjuVar = (zzju) obj;
        int i = zzjuVar.zza;
        int i2 = this.zza;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = zzjuVar.zzb;
        int i4 = this.zzb;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r3 = r3.zzb;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        return (obj instanceof zzju) && (i2 = this.zza) >= i && i2 <= i && (i4 = this.zzb) >= i3 && i4 <= i3;
    }

    public final int hashCode() {
        return (this.zza * 31) + this.zzb;
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, "GenericDimension(", ", ", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
