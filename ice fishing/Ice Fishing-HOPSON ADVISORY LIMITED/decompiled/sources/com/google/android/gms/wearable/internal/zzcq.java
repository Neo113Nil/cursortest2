package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.provider.FontsContractCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzcq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcq> CREATOR = new zzcr();
    private final int zza;
    private final String zzb;

    public zzcq(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcq)) {
            return false;
        }
        zzcq zzcqVar = (zzcq) obj;
        return this.zza == zzcqVar.zza && Objects.equals(this.zzb, zzcqVar.zzb);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String str;
        int i = this.zza;
        switch (i) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /* -4 */:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Unrecognized state value: ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.zzb, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
