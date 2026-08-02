package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes4.dex */
public final class zzfc implements Parcelable {
    public static final Parcelable.Creator<zzfc> CREATOR = new zzdp(17);
    public final Place.BooleanPlaceAttributeValue zza;
    public final Place.BooleanPlaceAttributeValue zzb;
    public final Place.BooleanPlaceAttributeValue zzc;
    public final Place.BooleanPlaceAttributeValue zzd;

    public zzfc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null acceptsCreditCards");
            throw null;
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null acceptsDebitCards");
            throw null;
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null acceptsCashOnly");
            throw null;
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 != null) {
            this.zzd = booleanPlaceAttributeValue4;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null acceptsNfc");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfc) {
            zzfc zzfcVar = (zzfc) obj;
            if (this.zza.equals(zzfcVar.zza) && this.zzb.equals(zzfcVar.zzb) && this.zzc.equals(zzfcVar.zzc) && this.zzd.equals(zzfcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode() ^ ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        String obj3 = this.zzc.toString();
        int length3 = obj3.length();
        String obj4 = this.zzd.toString();
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 18 + length3 + 13 + obj4.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "PaymentOptions{acceptsCreditCards=", obj, ", acceptsDebitCards=", obj2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", acceptsCashOnly=", obj3, ", acceptsNfc=", obj4);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
    }
}
