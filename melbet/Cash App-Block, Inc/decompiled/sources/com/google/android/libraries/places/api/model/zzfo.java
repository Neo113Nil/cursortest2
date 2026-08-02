package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfo implements Parcelable {
    public static final Parcelable.Creator<zzfo> CREATOR = new zzdp(22);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;

    public zzfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null regionCode");
            throw null;
        }
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = list;
        this.zzi = list2;
        this.zzj = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfo) {
            zzfo zzfoVar = (zzfo) obj;
            if (this.zza.equals(zzfoVar.zza)) {
                String str = zzfoVar.zzb;
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = zzfoVar.zzc;
                    String str4 = this.zzc;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = zzfoVar.zzd;
                        String str6 = this.zzd;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = zzfoVar.zze;
                            String str8 = this.zze;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                String str9 = zzfoVar.zzf;
                                String str10 = this.zzf;
                                if (str10 != null ? str10.equals(str9) : str9 == null) {
                                    String str11 = zzfoVar.zzg;
                                    String str12 = this.zzg;
                                    if (str12 != null ? str12.equals(str11) : str11 == null) {
                                        List list = zzfoVar.zzh;
                                        List list2 = this.zzh;
                                        if (list2 != null ? list2.equals(list) : list == null) {
                                            List list3 = zzfoVar.zzi;
                                            List list4 = this.zzi;
                                            if (list4 != null ? list4.equals(list3) : list3 == null) {
                                                String str13 = zzfoVar.zzj;
                                                String str14 = this.zzj;
                                                if (str14 != null ? str14.equals(str13) : str13 == null) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzc;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.zzd;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.zze;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.zzf;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.zzg;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        List list = this.zzh;
        int hashCode8 = (hashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzi;
        int hashCode9 = (hashCode8 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str7 = this.zzj;
        return hashCode9 ^ (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzh);
        String valueOf2 = String.valueOf(this.zzi);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzd;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zze;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zzf;
        int length5 = String.valueOf(str5).length();
        String str6 = this.zzg;
        int length6 = String.valueOf(str6).length();
        int length7 = valueOf.length();
        int length8 = valueOf2.length();
        String str7 = this.zzj;
        int length9 = String.valueOf(str7).length();
        String str8 = this.zza;
        StringBuilder sb = new StringBuilder(str8.length() + 40 + length + 13 + length2 + 14 + length3 + 21 + length4 + 11 + length5 + 14 + length6 + 15 + length7 + 13 + length8 + 15 + length9 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "PostalAddress{regionCode=", str8, ", languageCode=", str);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", postalCode=", str2, ", sortingCode=", str3);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", administrativeArea=", str4, ", locality=", str5);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", sublocality=", str6, ", addressLines=", valueOf);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", recipients=", valueOf2, ", organization=", str7);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        String str = this.zzb;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzc;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        String str3 = this.zzd;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        String str4 = this.zze;
        if (str4 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str4);
        }
        String str5 = this.zzf;
        if (str5 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str5);
        }
        String str6 = this.zzg;
        if (str6 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str6);
        }
        parcel.writeList(this.zzh);
        parcel.writeList(this.zzi);
        String str7 = this.zzj;
        if (str7 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str7);
        }
    }
}
