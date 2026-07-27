package n2;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4750a extends Q2.a {
    public static final Parcelable.Creator<C4750a> CREATOR = new C4566c(4);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39460n;

    public C4750a(boolean z3) {
        this.f39460n = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f39460n ? 1 : 0);
        A8.b.I(parcel, G7);
    }
}
