package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new com.google.android.gms.appset.zzd(20);
    public final int zaa;
    public final Account zab;
    public final int zac;
    public final GoogleSignInAccount zad;

    public zaw(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.zaa = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zab, i);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zac);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zad, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
