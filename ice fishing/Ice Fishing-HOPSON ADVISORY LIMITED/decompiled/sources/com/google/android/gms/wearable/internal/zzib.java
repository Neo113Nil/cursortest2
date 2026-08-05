package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.Node;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzib extends AbstractSafeParcelable implements Node {
    public static final Parcelable.Creator<zzib> CREATOR = new zzic();
    private final String zza;
    private final String zzb;
    private final int zzc;
    private final boolean zzd;

    public zzib(String str, String str2, int i, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzib) {
            return ((zzib) obj).zza.equals(this.zza);
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getId() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.wearable.Node
    public final boolean isNearby() {
        return this.zzd;
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        boolean z = this.zzd;
        StringBuilder sb = new StringBuilder(length + 10 + length2 + 7 + length3 + 11 + String.valueOf(z).length() + 1);
        sb.append("Node{");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
