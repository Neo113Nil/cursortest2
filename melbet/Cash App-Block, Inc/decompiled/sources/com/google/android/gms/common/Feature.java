package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zza(7);
    public final String zza;
    public final int zzb;
    public final long zzc;
    public final boolean zzd;

    public Feature(String str, int i, long j, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (com.google.android.gms.common.internal.zzae.equal(this.zza, feature.zza) && getVersion() == feature.getVersion() && this.zzd == feature.zzd) {
                return true;
            }
        }
        return false;
    }

    public final long getVersion() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(getVersion()), Boolean.valueOf(this.zzd)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "name");
        workLauncherImpl.add(Long.valueOf(getVersion()), "version");
        workLauncherImpl.add(Boolean.valueOf(this.zzd), "is_fully_rolled_out");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeInt(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeLong(parcel, 3, getVersion());
        MooncakeHeaderViewKt.writeBoolean(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }
}
