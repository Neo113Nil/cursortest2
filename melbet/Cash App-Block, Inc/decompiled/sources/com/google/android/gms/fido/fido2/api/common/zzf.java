package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new com.google.android.gms.common.zzs(28);
    public final zzgu zza;
    public final zzgu zzb;

    public zzf(zzgu zzguVar, zzgu zzguVar2) {
        this.zza = zzguVar;
        this.zzb = zzguVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return zzae.equal(this.zza, zzfVar.zza) && zzae.equal(this.zzb, zzfVar.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        zzgu zzguVar = this.zza;
        MooncakeHeaderViewKt.writeByteArray(parcel, 1, zzguVar == null ? null : zzguVar.zzm());
        zzgu zzguVar2 = this.zzb;
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, zzguVar2 != null ? zzguVar2.zzm() : null);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
