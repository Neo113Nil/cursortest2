package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zab(23);
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final TokenStatus zzd;
    public final String zze;
    public final zzaz zzf;

    public zzb(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, zzaz zzazVar) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = tokenStatus;
        this.zze = str2;
        this.zzf = zzazVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.zzc == zzbVar.zzc && zzae.equal(this.zza, zzbVar.zza) && Arrays.equals(this.zzb, zzbVar.zzb) && zzae.equal(this.zzd, zzbVar.zzd) && zzae.equal(this.zze, zzbVar.zze) && zzae.equal(this.zzf, zzbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "clientTokenId");
        byte[] bArr = this.zzb;
        workLauncherImpl.add(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        workLauncherImpl.add(Integer.valueOf(this.zzc), "cardNetwork");
        workLauncherImpl.add(this.zzd, "tokenStatus");
        workLauncherImpl.add(this.zze, "tokenLastDigits");
        workLauncherImpl.add(this.zzf, "transactionInfo");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zzf, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
