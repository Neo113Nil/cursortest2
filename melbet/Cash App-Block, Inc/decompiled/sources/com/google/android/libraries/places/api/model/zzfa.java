package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes4.dex */
public final class zzfa implements Parcelable {
    public static final Parcelable.Creator<zzfa> CREATOR = new zzdp(16);
    public final Place.BooleanPlaceAttributeValue zza;
    public final Place.BooleanPlaceAttributeValue zzb;
    public final Place.BooleanPlaceAttributeValue zzc;
    public final Place.BooleanPlaceAttributeValue zzd;
    public final Place.BooleanPlaceAttributeValue zze;
    public final Place.BooleanPlaceAttributeValue zzf;
    public final Place.BooleanPlaceAttributeValue zzg;

    public zzfa(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7) {
        if (booleanPlaceAttributeValue == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null freeParkingLot");
            throw null;
        }
        this.zza = booleanPlaceAttributeValue;
        if (booleanPlaceAttributeValue2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null paidParkingLot");
            throw null;
        }
        this.zzb = booleanPlaceAttributeValue2;
        if (booleanPlaceAttributeValue3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null freeStreetParking");
            throw null;
        }
        this.zzc = booleanPlaceAttributeValue3;
        if (booleanPlaceAttributeValue4 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null paidStreetParking");
            throw null;
        }
        this.zzd = booleanPlaceAttributeValue4;
        if (booleanPlaceAttributeValue5 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null valetParking");
            throw null;
        }
        this.zze = booleanPlaceAttributeValue5;
        if (booleanPlaceAttributeValue6 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null freeGarageParking");
            throw null;
        }
        this.zzf = booleanPlaceAttributeValue6;
        if (booleanPlaceAttributeValue7 != null) {
            this.zzg = booleanPlaceAttributeValue7;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null paidGarageParking");
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
        if (obj instanceof zzfa) {
            zzfa zzfaVar = (zzfa) obj;
            if (this.zza.equals(zzfaVar.zza) && this.zzb.equals(zzfaVar.zzb) && this.zzc.equals(zzfaVar.zzc) && this.zzd.equals(zzfaVar.zzd) && this.zze.equals(zzfaVar.zze) && this.zzf.equals(zzfaVar.zzf) && this.zzg.equals(zzfaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzg.hashCode() ^ ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        String obj3 = this.zzc.toString();
        int length3 = obj3.length();
        String obj4 = this.zzd.toString();
        int length4 = obj4.length();
        String obj5 = this.zze.toString();
        int length5 = obj5.length();
        String obj6 = this.zzf.toString();
        int length6 = obj6.length();
        String obj7 = this.zzg.toString();
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 20 + length3 + 20 + length4 + 15 + length5 + 20 + length6 + 20 + obj7.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ParkingOptions{freeParkingLot=", obj, ", paidParkingLot=", obj2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", freeStreetParking=", obj3, ", paidStreetParking=", obj4);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", valetParking=", obj5, ", freeGarageParking=", obj6);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", paidGarageParking=", obj7, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
        parcel.writeParcelable(this.zze, i);
        parcel.writeParcelable(this.zzf, i);
        parcel.writeParcelable(this.zzg, i);
    }
}
