package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzao extends AbstractSafeParcelable implements CapabilityInfo {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();
    private final String zzb;
    private final List zzc;
    private final Object zza = new Object();
    private Set zzd = null;

    public zzao(String str, List list) {
        this.zzb = str;
        this.zzc = list;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzao zzaoVar = (zzao) obj;
        String str = this.zzb;
        if (str == null ? zzaoVar.zzb != null : !str.equals(zzaoVar.zzb)) {
            return false;
        }
        List list = this.zzc;
        return list == null ? zzaoVar.zzc == null : list.equals(zzaoVar.zzc);
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final String getName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.wearable.CapabilityInfo
    public final Set<Node> getNodes() {
        Set<Node> set;
        synchronized (this.zza) {
            if (this.zzd == null) {
                this.zzd = new HashSet(this.zzc);
            }
            set = this.zzd;
        }
        return set;
    }

    public final int hashCode() {
        String str = this.zzb;
        int hashCode = str != null ? str.hashCode() : 0;
        List list = this.zzc;
        return ((hashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(valueOf).length() + 1);
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
