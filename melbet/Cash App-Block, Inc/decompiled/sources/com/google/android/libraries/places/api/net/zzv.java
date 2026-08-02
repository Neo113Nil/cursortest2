package com.google.android.libraries.places.api.net;

import android.net.Uri;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.internal.zzgc;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzv {
    public final List zza;
    public final List zzb;
    public final zzgc zzc;
    public final String zzd;
    public final int zze;
    public final Uri zzf;

    public zzv(List list, List list2, zzgc zzgcVar, String str, int i, Uri uri) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = zzgcVar;
        this.zzd = str;
        this.zze = i;
        this.zzf = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzv)) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        if (!this.zza.equals(zzvVar.zza)) {
            return false;
        }
        List list = zzvVar.zzb;
        List list2 = this.zzb;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        zzgc zzgcVar = zzvVar.zzc;
        zzgc zzgcVar2 = this.zzc;
        if (zzgcVar2 == null) {
            if (zzgcVar != null) {
                return false;
            }
        } else if (zzgcVar2 != zzgcVar) {
            return false;
        }
        String str = zzvVar.zzd;
        String str2 = this.zzd;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.zze != zzvVar.zze) {
            return false;
        }
        Uri uri = zzvVar.zzf;
        Uri uri2 = this.zzf;
        return uri2 == null ? uri == null : uri2.equals(uri);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        List list = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        zzgc zzgcVar = this.zzc;
        int hashCode3 = (hashCode2 ^ (zzgcVar == null ? 0 : zzgcVar.hashCode())) * 1000003;
        String str = this.zzd;
        int hashCode4 = (((hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zze) * 1000003;
        Uri uri = this.zzf;
        return hashCode4 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzf);
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        String str = this.zzd;
        int length4 = String.valueOf(str).length();
        int i = this.zze;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 13 + length3 + 16 + length4 + 20 + String.valueOf(i).length() + 12 + valueOf3.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "SearchByTextResponse{places=", obj, ", routingSummaries=", valueOf);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", pagination=", valueOf2, ", nextPageToken=", str);
        sb.append(", responsePageIndex=");
        sb.append(i);
        sb.append(", searchUri=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
