package h3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: h3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4570g extends Q2.a {
    public static final Parcelable.Creator<C4570g> CREATOR = new C4566c(1);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f38013n;

    /* renamed from: u, reason: collision with root package name */
    public final String f38014u;

    public C4570g(String str, ArrayList arrayList) {
        this.f38013n = arrayList;
        this.f38014u = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.B(parcel, 1, this.f38013n);
        A8.b.z(parcel, 2, this.f38014u);
        A8.b.I(parcel, G7);
    }
}
