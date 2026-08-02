package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zab(19);
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final TokenStatus zzd;
    public final String zze;
    public final Uri zzf;
    public final byte[] zzg;
    public final zzan[] zzh;
    public final int zzi;
    public final boolean zzj;

    public zzau(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, zzan[] zzanVarArr, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = tokenStatus;
        this.zze = str3;
        this.zzf = uri;
        this.zzg = bArr;
        this.zzh = zzanVarArr;
        this.zzi = i2;
        this.zzj = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzau) {
            zzau zzauVar = (zzau) obj;
            if (zzae.equal(this.zza, zzauVar.zza) && zzae.equal(this.zzb, zzauVar.zzb) && this.zzc == zzauVar.zzc && zzae.equal(this.zzd, zzauVar.zzd) && zzae.equal(this.zze, zzauVar.zze) && zzae.equal(this.zzf, zzauVar.zzf) && Arrays.equals(this.zzg, zzauVar.zzg) && Arrays.equals(this.zzh, zzauVar.zzh) && this.zzi == zzauVar.zzi && this.zzj == zzauVar.zzj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh, Integer.valueOf(this.zzi), Boolean.valueOf(this.zzj)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "billingCardId");
        workLauncherImpl.add(this.zzb, "displayName");
        workLauncherImpl.add(Integer.valueOf(this.zzc), "cardNetwork");
        workLauncherImpl.add(this.zzd, "tokenStatus");
        workLauncherImpl.add(this.zze, "panLastDigits");
        workLauncherImpl.add(this.zzf, "cardImageUrl");
        byte[] bArr = this.zzg;
        workLauncherImpl.add(bArr == null ? null : Arrays.toString(bArr), "inAppCardToken");
        zzan[] zzanVarArr = this.zzh;
        workLauncherImpl.add(zzanVarArr != null ? Arrays.toString(zzanVarArr) : null, "onlineAccountCardLinkInfos");
        workLauncherImpl.add(Integer.valueOf(this.zzi), "tokenType");
        workLauncherImpl.add(Boolean.valueOf(this.zzj), "supportsOdaTransit");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zzf, i);
        MooncakeHeaderViewKt.writeByteArray(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 8, this.zzh, i);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzi);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzj ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
