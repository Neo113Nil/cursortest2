package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zzab(11);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;

    public TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = z;
        this.zzi = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(this.zzh ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzi);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
