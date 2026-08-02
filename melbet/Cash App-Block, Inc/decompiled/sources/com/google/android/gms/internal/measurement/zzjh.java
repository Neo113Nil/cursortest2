package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzjg(1);
    public final String zza;
    public final byte[] zzb;
    public final String zzc;
    public final zzjf[] zzd;
    public final TreeMap zze = new TreeMap();
    public final boolean zzf;
    public final long zzg;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z, byte[] bArr, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzd = zzjfVarArr;
        this.zzf = z;
        this.zzb = bArr;
        this.zzg = j;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.zze.put(Integer.valueOf(zzjfVar.zza), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return zzh.zza(this.zza, zzjhVar.zza) && zzh.zza(this.zzc, zzjhVar.zzc) && this.zze.equals(zzjhVar.zze) && this.zzf == zzjhVar.zzf && Arrays.equals(this.zzb, zzjhVar.zzb) && this.zzg == zzjhVar.zzg;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zze, Boolean.valueOf(this.zzf), this.zzb, Long.valueOf(this.zzg)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.zza);
        sb.append("', '");
        sb.append(this.zzc);
        sb.append("', (");
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.zzf);
        sb.append(", ");
        byte[] bArr = this.zzb;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.zzg, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzf ? 1 : 0);
        MooncakeHeaderViewKt.writeByteArray(parcel, 6, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 7, 8);
        parcel.writeLong(this.zzg);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
