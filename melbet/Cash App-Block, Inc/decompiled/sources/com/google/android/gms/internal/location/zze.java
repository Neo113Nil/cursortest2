package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzac(3);
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final zzex zzf;
    public final zze zzg;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.location.zzey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public zze(int i, String str, String str2, String str3, ArrayList arrayList, zze zzeVar) {
        str.getClass();
        if (zzeVar != null && zzeVar.zzg != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
        this.zze = str3 == null ? zzeVar != null ? zzeVar.zze : null : str3;
        if (arrayList == 0) {
            arrayList = zzeVar != null ? zzeVar.zzf : 0;
            if (arrayList == 0) {
                zzev zzevVar = zzex.zza;
                arrayList = zzey.zza;
                arrayList.getClass();
            }
        }
        zzev zzevVar2 = zzex.zza;
        Object[] array2 = arrayList.toArray();
        int length = array2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array2[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(Boxes$$ExternalSyntheticOutline1.m(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                throw null;
            }
        }
        zzey zzeyVar = length == 0 ? zzey.zza : new zzey(length, array2);
        zzeyVar.getClass();
        this.zzf = zzeyVar;
        this.zzg = zzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.zzb == zzeVar.zzb && Intrinsics.areEqual(this.zzc, zzeVar.zzc) && Intrinsics.areEqual(this.zzd, zzeVar.zzd) && Intrinsics.areEqual(this.zze, zzeVar.zze) && Intrinsics.areEqual(this.zzg, zzeVar.zzg) && Intrinsics.areEqual(this.zzf, zzeVar.zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzg});
    }

    public final String toString() {
        String str = this.zzc;
        int length = str.length() + 18;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.zzb);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (StringsKt__StringsJVMKt.startsWith(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.zze;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 8, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
