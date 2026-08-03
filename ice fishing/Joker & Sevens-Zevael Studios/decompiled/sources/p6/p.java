package p6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends q6.a {
    public static final Parcelable.Creator<p> CREATOR = new e7.c(14);

    /* renamed from: g, reason: collision with root package name */
    public final int f5627g;

    /* renamed from: h, reason: collision with root package name */
    public final Account f5628h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5629i;

    /* renamed from: j, reason: collision with root package name */
    public final GoogleSignInAccount f5630j;

    public p(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f5627g = i10;
        this.f5628h = account;
        this.f5629i = i11;
        this.f5630j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f5627g);
        x4.f.b0(parcel, 2, this.f5628h, i10);
        x4.f.i0(parcel, 3, 4);
        parcel.writeInt(this.f5629i);
        x4.f.b0(parcel, 4, this.f5630j, i10);
        x4.f.h0(parcel, g02);
    }
}
