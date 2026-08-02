package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes4.dex */
public final class zzcq implements Parcelable {
    public static final Parcelable.Creator<zzcq> CREATOR = new zzb(18);
    public final Place.BooleanPlaceAttributeValue zza;
    public final Place.BooleanPlaceAttributeValue zzb;
    public final Place.BooleanPlaceAttributeValue zzc;
    public final Place.BooleanPlaceAttributeValue zzd;

    public zzcq(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null wheelchairAccessibleParking");
            throw null;
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null wheelchairAccessibleEntrance");
            throw null;
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null wheelchairAccessibleRestroom");
            throw null;
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 != null) {
            this.zzd = booleanPlaceAttributeValue4;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null wheelchairAccessibleSeating");
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
        if (obj instanceof zzcq) {
            zzcq zzcqVar = (zzcq) obj;
            if (this.zza.equals(zzcqVar.zza) && this.zzb.equals(zzcqVar.zzb) && this.zzc.equals(zzcqVar.zzc) && this.zzd.equals(zzcqVar.zzd)) {
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
        StringBuilder sb = new StringBuilder(length + 80 + length2 + 31 + length3 + 30 + obj4.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "AccessibilityOptions{wheelchairAccessibleParking=", obj, ", wheelchairAccessibleEntrance=", obj2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", wheelchairAccessibleRestroom=", obj3, ", wheelchairAccessibleSeating=", obj4);
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
