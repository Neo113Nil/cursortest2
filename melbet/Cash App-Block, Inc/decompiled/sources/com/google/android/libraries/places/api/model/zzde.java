package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.wallet.zzb;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzde implements Parcelable {
    public static final Parcelable.Creator<zzde> CREATOR = new zzb(25);
    public final String zza;
    public final Integer zzb;
    public final List zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;

    public zzde(String str, Integer num, List list, String str2, String str3, String str4, List list2, List list3, List list4) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null placeId");
            throw null;
        }
        this.zza = str;
        this.zzb = num;
        if (list == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null types");
            throw null;
        }
        this.zzc = list;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null fullText");
            throw null;
        }
        this.zzd = str2;
        if (str3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null primaryText");
            throw null;
        }
        this.zze = str3;
        if (str4 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null secondaryText");
            throw null;
        }
        this.zzf = str4;
        if (list2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null fullTextMatchedSubstrings");
            throw null;
        }
        this.zzg = list2;
        if (list3 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null primaryTextMatchedSubstrings");
            throw null;
        }
        this.zzh = list3;
        if (list4 != null) {
            this.zzi = list4;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null secondaryTextMatchedSubstrings");
            throw null;
        }
    }

    public static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzdg zzdgVar = (zzdg) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzdgVar.zza, zzdgVar.zza + zzdgVar.zzb, 0);
            }
        }
        return spannableString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzde) {
            zzde zzdeVar = (zzde) obj;
            if (this.zza.equals(zzdeVar.zza)) {
                Integer num = zzdeVar.zzb;
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.zzc.equals(zzdeVar.zzc) && this.zzd.equals(zzdeVar.zzd) && this.zze.equals(zzdeVar.zze) && this.zzf.equals(zzdeVar.zzf) && this.zzg.equals(zzdeVar.zzg) && this.zzh.equals(zzdeVar.zzh) && this.zzi.equals(zzdeVar.zzi)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        Integer num = this.zzb;
        return this.zzi.hashCode() ^ (((((((((((((((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg.hashCode()) * 1000003) ^ this.zzh.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zzc.toString();
        String obj2 = this.zzg.toString();
        String obj3 = this.zzh.toString();
        String obj4 = this.zzi.toString();
        Integer num = this.zzb;
        int length = String.valueOf(num).length();
        int length2 = obj.length();
        int length3 = obj2.length();
        int length4 = obj3.length();
        int length5 = obj4.length();
        String str = this.zza;
        int length6 = str.length() + 48 + length + 8 + length2 + 11;
        String str2 = this.zzd;
        int length7 = str2.length() + length6 + 14;
        String str3 = this.zze;
        int length8 = str3.length() + length7 + 16;
        String str4 = this.zzf;
        StringBuilder sb = new StringBuilder(str4.length() + length8 + 28 + length3 + 31 + length4 + 33 + length5 + 1);
        sb.append("AutocompletePrediction{placeId=");
        sb.append(str);
        sb.append(", distanceMeters=");
        sb.append(num);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", types=", obj, ", fullText=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", primaryText=", str3, ", secondaryText=", str4);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", fullTextMatchedSubstrings=", obj2, ", primaryTextMatchedSubstrings=", obj3);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", secondaryTextMatchedSubstrings=", obj4, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        Integer num = this.zzb;
        if (num == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(num.intValue());
        }
        parcel.writeList(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeList(this.zzg);
        parcel.writeList(this.zzh);
        parcel.writeList(this.zzi);
    }
}
