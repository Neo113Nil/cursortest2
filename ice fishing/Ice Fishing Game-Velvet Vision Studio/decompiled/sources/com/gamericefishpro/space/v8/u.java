package com.gamericefishpro.space.v8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.y3;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<u> CREATOR = new v(0);
    public final int d;
    public final Account e;
    public final int i;
    public final GoogleSignInAccount v;

    public u(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.d = i;
        this.e = account;
        this.i = i2;
        this.v = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.P(parcel, 2, this.e, i);
        y3.U(parcel, 3, 4);
        parcel.writeInt(this.i);
        y3.P(parcel, 4, this.v, i);
        y3.W(parcel, iV);
    }
}
