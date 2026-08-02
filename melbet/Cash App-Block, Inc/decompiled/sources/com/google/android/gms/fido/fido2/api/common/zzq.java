package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzef(6);
    public final long zza;
    public final zzgu zzb;
    public final zzgu zzc;
    public final zzgu zzd;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        zzae.checkNotNull(bArr);
        zzgu zzl = zzgu.zzl(bArr.length, bArr);
        zzae.checkNotNull(bArr2);
        zzgu zzl2 = zzgu.zzl(bArr2.length, bArr2);
        zzae.checkNotNull(bArr3);
        zzgu zzl3 = zzgu.zzl(bArr3.length, bArr3);
        this.zza = j;
        this.zzb = zzl;
        this.zzc = zzl2;
        this.zzd = zzl3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && zzae.equal(this.zzb, zzqVar.zzb) && zzae.equal(this.zzc, zzqVar.zzc) && zzae.equal(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zzb.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzc.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzd.zzm());
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
