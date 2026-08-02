package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.math.BigDecimal;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zab(18);
    public final long zza;
    public final BigDecimal zzb;
    public final String zzc;
    public final long zzd;
    public final int zze;

    public zzas(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.zza = j;
        this.zzb = bigDecimal;
        this.zzc = str;
        this.zzd = j2;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzas) {
            zzas zzasVar = (zzas) obj;
            if (this.zza == zzasVar.zza && zzae.equal(this.zzb, zzasVar.zzb) && zzae.equal(this.zzc, zzasVar.zzc) && this.zzd == zzasVar.zzd && this.zze == zzasVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, this.zzc, Long.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(Long.valueOf(this.zza), "transactionId");
        workLauncherImpl.add(this.zzb, "amount");
        workLauncherImpl.add(this.zzc, "currency");
        workLauncherImpl.add(Long.valueOf(this.zzd), "transactionTimeMillis");
        workLauncherImpl.add(Integer.valueOf(this.zze), "type");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        BigDecimal bigDecimal = this.zzb;
        if (bigDecimal != null) {
            int zzb2 = MooncakeHeaderViewKt.zzb(parcel, 2);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            MooncakeHeaderViewKt.zzc(parcel, zzb2);
        }
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 8);
        parcel.writeLong(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
