package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> CREATOR = new zab(17);
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final String zzf;

    public RetrieveInAppPaymentCredentialResponse(String str, byte[] bArr, int i, int i2, String str2, String str3) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
