package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class zzjf extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator<zzjf> CREATOR = new zzjg(0);
    public final int zza;
    public final zzjo[] zzb;
    public final String[] zzc;
    public final TreeMap zzd = new TreeMap();

    public zzjf(int i, zzjo[] zzjoVarArr, String[] strArr) {
        this.zza = i;
        this.zzb = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.zzd.put(zzjoVar.zza, zzjoVar);
        }
        this.zzc = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzjf) obj).zza;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.zza == zzjfVar.zza && zzh.zza(this.zzd, zzjfVar.zzd) && Arrays.equals(this.zzc, zzjfVar.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.zza);
        sb.append(", (");
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjo) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.zzc;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeStringArray(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
