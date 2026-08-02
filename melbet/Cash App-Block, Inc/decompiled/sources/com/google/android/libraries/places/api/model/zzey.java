package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzey implements Parcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new zzdp(15);
    public final OpeningHours$HoursType zza;
    public final List zzb;
    public final List zzc;
    public final List zzd;
    public final Boolean zze;
    public final Instant zzf;
    public final Instant zzg;

    public zzey(OpeningHours$HoursType openingHours$HoursType, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        this.zza = openingHours$HoursType;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null periods");
            throw null;
        }
        this.zzb = list;
        if (list2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null specialDays");
            throw null;
        }
        this.zzc = list2;
        if (list3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null weekdayText");
            throw null;
        }
        this.zzd = list3;
        this.zze = bool;
        this.zzf = instant;
        this.zzg = instant2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzey) {
            zzey zzeyVar = (zzey) obj;
            OpeningHours$HoursType openingHours$HoursType = this.zza;
            if (openingHours$HoursType != null ? openingHours$HoursType.equals(zzeyVar.zza) : zzeyVar.zza == null) {
                if (this.zzb.equals(zzeyVar.zzb) && this.zzc.equals(zzeyVar.zzc) && this.zzd.equals(zzeyVar.zzd)) {
                    Boolean bool = zzeyVar.zze;
                    Boolean bool2 = this.zze;
                    if (bool2 != null ? bool2.equals(bool) : bool == null) {
                        Instant instant = zzeyVar.zzf;
                        Instant instant2 = this.zzf;
                        if (instant2 != null ? instant2.equals(instant) : instant == null) {
                            Instant instant3 = zzeyVar.zzg;
                            Instant instant4 = this.zzg;
                            if (instant4 != null ? instant4.equals(instant3) : instant3 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        OpeningHours$HoursType openingHours$HoursType = this.zza;
        int hashCode = (((((((openingHours$HoursType == null ? 0 : openingHours$HoursType.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
        Boolean bool = this.zze;
        int hashCode2 = ((hashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Instant instant = this.zzf;
        int hashCode3 = (hashCode2 ^ (instant == null ? 0 : instant.hashCode())) * 1000003;
        Instant instant2 = this.zzg;
        return hashCode3 ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzb.toString();
        String obj2 = this.zzc.toString();
        String obj3 = this.zzd.toString();
        String valueOf2 = String.valueOf(this.zzf);
        String valueOf3 = String.valueOf(this.zzg);
        int length = valueOf.length();
        int length2 = obj.length();
        int length3 = obj2.length();
        int length4 = obj3.length();
        Boolean bool = this.zze;
        int length5 = String.valueOf(bool).length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 14 + length3 + 14 + length4 + 10 + length5 + 11 + valueOf2.length() + 12 + valueOf3.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "OpeningHours{hoursType=", valueOf, ", periods=", obj);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", specialDays=", obj2, ", weekdayText=", obj3);
        sb.append(", openNow=");
        sb.append(bool);
        sb.append(", nextOpen=");
        sb.append(valueOf2);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", nextClose=", valueOf3, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeList(this.zzb);
        parcel.writeList(this.zzc);
        parcel.writeList(this.zzd);
        Boolean bool = this.zze;
        if (bool == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Instant instant = this.zzf;
        if (instant == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant);
        }
        Instant instant2 = this.zzg;
        if (instant2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(instant2);
        }
    }
}
