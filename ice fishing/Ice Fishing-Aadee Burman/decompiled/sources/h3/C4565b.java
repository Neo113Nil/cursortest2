package h3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4565b extends Q2.a {
    public static final Parcelable.Creator<C4565b> CREATOR = new C4566c(0);

    /* renamed from: n, reason: collision with root package name */
    public final int f38009n;

    /* renamed from: u, reason: collision with root package name */
    public final int f38010u;

    /* renamed from: v, reason: collision with root package name */
    public final Intent f38011v;

    public C4565b(int i, int i6, Intent intent) {
        this.f38009n = i;
        this.f38010u = i6;
        this.f38011v = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f38009n);
        A8.b.F(parcel, 2, 4);
        parcel.writeInt(this.f38010u);
        A8.b.y(parcel, 3, this.f38011v, i);
        A8.b.I(parcel, G7);
    }
}
