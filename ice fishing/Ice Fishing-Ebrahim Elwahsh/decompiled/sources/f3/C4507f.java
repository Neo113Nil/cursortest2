package f3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507f extends P2.a {
    public static final Parcelable.Creator<C4507f> CREATOR = new F0.a(29);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f37704n;

    /* renamed from: u, reason: collision with root package name */
    public final String f37705u;

    public C4507f(String str, ArrayList arrayList) {
        this.f37704n = arrayList;
        this.f37705u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.w(parcel, 1, this.f37704n);
        S0.f.u(parcel, 2, this.f37705u);
        S0.f.C(parcel, B8);
    }
}
