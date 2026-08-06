package p0;

import a.AbstractC0083a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import q0.AbstractC1035a;

/* renamed from: p0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016m extends AbstractC1035a {
    public static final Parcelable.Creator<C1016m> CREATOR = new C.l(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f8390a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f8391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8392c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f8393d;

    public C1016m(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f8390a = i2;
        this.f8391b = account;
        this.f8392c = i3;
        this.f8393d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8390a);
        AbstractC0083a.u(parcel, 2, this.f8391b, i2);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(this.f8392c);
        AbstractC0083a.u(parcel, 4, this.f8393d, i2);
        AbstractC0083a.z(parcel, y2);
    }
}
