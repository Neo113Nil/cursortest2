package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class vyw extends l9 {
    public static final Parcelable.Creator<vyw> CREATOR = new onv(12);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public vyw(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.i0(parcel, 2, this.b, i);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c);
        o8g.i0(parcel, 4, this.d, i);
        o8g.p0(parcel, o0);
    }
}
