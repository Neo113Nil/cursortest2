package R2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class s extends S2.a {
    public static final Parcelable.Creator<s> CREATOR = new B8.d(12);

    /* renamed from: n, reason: collision with root package name */
    public final int f2859n;

    /* renamed from: u, reason: collision with root package name */
    public final Account f2860u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2861v;

    /* renamed from: w, reason: collision with root package name */
    public final GoogleSignInAccount f2862w;

    public s(int i, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f2859n = i;
        this.f2860u = account;
        this.f2861v = i4;
        this.f2862w = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f2859n);
        com.bumptech.glide.e.q(parcel, 2, this.f2860u, i);
        com.bumptech.glide.e.w(parcel, 3, 4);
        parcel.writeInt(this.f2861v);
        com.bumptech.glide.e.q(parcel, 4, this.f2862w, i);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
