package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new com.google.android.gms.common.zzs(24);
    public final int zza;
    public final short zzb;
    public final short zzc;

    public UvmEntry(short s, short s2, int i) {
        this.zza = i;
        this.zzb = s;
        this.zzc = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.zza == uvmEntry.zza && this.zzb == uvmEntry.zzb && this.zzc == uvmEntry.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
