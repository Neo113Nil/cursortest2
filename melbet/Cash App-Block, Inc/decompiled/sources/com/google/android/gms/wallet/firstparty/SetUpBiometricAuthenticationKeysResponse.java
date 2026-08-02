package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class SetUpBiometricAuthenticationKeysResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpBiometricAuthenticationKeysResponse> CREATOR = new zzab(19);
    public final byte[] zza;

    public SetUpBiometricAuthenticationKeysResponse(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArray(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
