package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.l9;
import defpackage.o8g;
import defpackage.onv;
import defpackage.y1g;

/* loaded from: classes.dex */
public class SignInAccount extends l9 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new onv(14);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        y1g.D(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        y1g.D(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 4, this.a);
        o8g.i0(parcel, 7, this.b, i);
        o8g.j0(parcel, 8, this.c);
        o8g.p0(parcel, o0);
    }
}
