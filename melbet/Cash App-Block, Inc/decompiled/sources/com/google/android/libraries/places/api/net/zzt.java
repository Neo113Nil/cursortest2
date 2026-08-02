package com.google.android.libraries.places.api.net;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.internal.zznk;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzt implements zznk {
    public final com.google.android.gms.tasks.zzb zza;
    public final List zzh;
    public final List zzi;
    public final String zzm;
    public final int zzu;

    public zzt(com.google.android.gms.tasks.zzb zzbVar, List list, List list2, String str, int i) {
        this.zza = zzbVar;
        this.zzh = list;
        this.zzi = list2;
        this.zzm = str;
        this.zzu = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzt)) {
            return false;
        }
        zzt zztVar = (zzt) obj;
        com.google.android.gms.tasks.zzb zzbVar = zztVar.zza;
        com.google.android.gms.tasks.zzb zzbVar2 = this.zza;
        if (zzbVar2 == null) {
            if (zzbVar != null) {
                return false;
            }
        } else if (zzbVar2 != zzbVar) {
            return false;
        }
        return this.zzh.equals(zztVar.zzh) && this.zzi.equals(zztVar.zzi) && this.zzm.equals(zztVar.zzm) && this.zzu == zztVar.zzu;
    }

    @Override // com.google.android.libraries.places.internal.zznk
    public final com.google.android.gms.tasks.zzb getCancellationToken() {
        return this.zza;
    }

    public final int hashCode() {
        com.google.android.gms.tasks.zzb zzbVar = this.zza;
        return this.zzu ^ (((((((((((((((((((zzbVar == null ? 0 : zzbVar.hashCode()) ^ 1000003) * 272515929) ^ 1237) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 583896283) ^ 1237) * 1000003) ^ this.zzm.hashCode()) * 1525764945) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * (-721379959));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzh.toString();
        String obj2 = this.zzi.toString();
        int length = valueOf.length();
        int length2 = "null".length();
        int length3 = "null".length();
        int length4 = "null".length();
        int length5 = String.valueOf(false).length();
        int length6 = obj.length();
        int length7 = obj2.length();
        int length8 = "null".length();
        int m$1 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(length + 53 + length2 + 62 + length3 + 12 + length4 + 10 + length5 + 14 + length6 + 14 + length7 + 17 + length8 + 13 + "null".length(), 22, String.valueOf(false).length(), 12);
        String str = this.zzm;
        int length9 = str.length() + m$1;
        int length10 = String.valueOf(false).length() + length9 + 106;
        int length11 = "null".length() + Boxes$$ExternalSyntheticOutline1.m(length10 + 36 + String.valueOf(false).length() + 20, 12, String.valueOf(false));
        int i = this.zzu;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length11 + 19 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "SearchByTextRequest{cancellationToken=", valueOf, ", includedType=null, locationBias=null, locationRestriction=null, maxResultCount=null, minRating=null, openNow=false, placeFields=", obj);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", priceLevels=", obj2, ", rankPreference=", "null");
        sb.append(", regionCode=null, strictTypeFiltering=false, textQuery=");
        sb.append(str);
        sb.append(", evSearchOptions=null, routingParameters=null, searchAlongRouteParameters=null, routingSummariesIncluded=false, pureServiceAreaBusinessesIncluded=false, searchUriIncluded=false, pageToken=null, requestPageIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
