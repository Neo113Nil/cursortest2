package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import java.time.Instant;

/* loaded from: classes4.dex */
public final class zzdm implements Parcelable {
    public static final Parcelable.Creator<zzdm> CREATOR = new zzb(28);
    public final EVConnectorType zza;
    public final Double zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final Integer zze;
    public final Instant zzf;

    public zzdm(EVConnectorType eVConnectorType, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (eVConnectorType == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null type");
            throw null;
        }
        this.zza = eVConnectorType;
        this.zzb = d;
        this.zzc = num;
        this.zzd = num2;
        this.zze = num3;
        this.zzf = instant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        if (!this.zza.equals(zzdmVar.zza) || !this.zzb.equals(zzdmVar.zzb) || !this.zzc.equals(zzdmVar.zzc)) {
            return false;
        }
        Integer num = zzdmVar.zzd;
        Integer num2 = this.zzd;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        Integer num3 = zzdmVar.zze;
        Integer num4 = this.zze;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        Instant instant = zzdmVar.zzf;
        Instant instant2 = this.zzf;
        return instant2 == null ? instant == null : instant2.equals(instant);
    }

    public final int hashCode() {
        int hashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        Integer num = this.zzd;
        int hashCode2 = ((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.zze;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Instant instant = this.zzf;
        return hashCode3 ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzf);
        Double d = this.zzb;
        int length2 = d.toString().length();
        Integer num = this.zzc;
        int length3 = num.toString().length();
        Integer num2 = this.zzd;
        int length4 = String.valueOf(num2).length();
        Integer num3 = this.zze;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 8 + length3 + 17 + length4 + 20 + String.valueOf(num3).length() + 29 + valueOf.length() + 1);
        sb.append("ConnectorAggregation{type=");
        sb.append(obj);
        sb.append(", maxChargeRateKw=");
        sb.append(d);
        sb.append(", count=");
        sb.append(num);
        sb.append(", availableCount=");
        sb.append(num2);
        sb.append(", outOfServiceCount=");
        sb.append(num3);
        sb.append(", availabilityLastUpdateTime=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeDouble(this.zzb.doubleValue());
        parcel.writeInt(this.zzc.intValue());
        Integer num = this.zzd;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 0, num);
        }
        Integer num2 = this.zze;
        if (num2 == null) {
            parcel.writeInt(1);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 0, num2);
        }
        Instant instant = this.zzf;
        if (instant == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant);
        }
    }
}
