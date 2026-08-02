package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzb(12);
    public String zza;
    public String zzb;
    public ProxyCard zzc;
    public String zzd;
    public zza zze;
    public zza zzf;
    public String[] zzg;
    public UserAddress zzh;
    public UserAddress zzi;
    public InstrumentInfo[] zzj;
    public PaymentMethodToken zzk;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zze, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzf, i);
        MooncakeHeaderViewKt.writeStringArray(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzh, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzi, i);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 11, this.zzj, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
