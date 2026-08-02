package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzab(8);
    public int zza;
    public String zzb;
    public Bitmap zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public Bitmap zzg;
    public PendingIntent zzh;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (zzae.equal(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && zzae.equal(this.zzb, globalActionCard.zzb) && zzae.equal(this.zzc, globalActionCard.zzc) && zzae.equal(this.zzd, globalActionCard.zzd) && zzae.equal(this.zze, globalActionCard.zze) && zzae.equal(this.zzf, globalActionCard.zzf) && zzae.equal(this.zzg, globalActionCard.zzg) && zzae.equal(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zzg, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzh, i);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
