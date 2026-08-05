package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable implements com.google.android.gms.wearable.zza {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    private final byte zza;
    private final byte zzb;
    private final String zzc;

    public zzj(byte b, byte b2, String str) {
        this.zza = b;
        this.zzb = b2;
        this.zzc = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return this.zza == zzjVar.zza && this.zzb == zzjVar.zzb && this.zzc.equals(zzjVar.zzc);
    }

    public final int hashCode() {
        return ((((this.zza + 31) * 31) + this.zzb) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        byte b = this.zza;
        int length = String.valueOf((int) b).length();
        byte b2 = this.zzb;
        int length2 = String.valueOf((int) b2).length();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(length + 53 + length2 + 10 + String.valueOf(str).length() + 2);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append((int) b);
        sb.append(", mAttributeId=");
        sb.append((int) b2);
        sb.append(", mValue='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, this.zza);
        SafeParcelWriter.writeByte(parcel, 3, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
