package P2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class s extends Q2.a {
    public static final Parcelable.Creator<s> CREATOR = new B8.d(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f2538n;

    /* renamed from: u, reason: collision with root package name */
    public final Account f2539u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2540v;

    /* renamed from: w, reason: collision with root package name */
    public final GoogleSignInAccount f2541w;

    public s(int i, Account account, int i6, GoogleSignInAccount googleSignInAccount) {
        this.f2538n = i;
        this.f2539u = account;
        this.f2540v = i6;
        this.f2541w = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f2538n);
        A8.b.y(parcel, 2, this.f2539u, i);
        A8.b.F(parcel, 3, 4);
        parcel.writeInt(this.f2540v);
        A8.b.y(parcel, 4, this.f2541w, i);
        A8.b.I(parcel, G7);
    }
}
