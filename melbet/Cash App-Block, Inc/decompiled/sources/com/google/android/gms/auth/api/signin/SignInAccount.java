package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zzd(17);
    public final String zba;
    public final String zbb;
    public final GoogleSignInAccount zbc;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        zzae.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zba = str;
        zzae.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zba);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zbc, i);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zbb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
