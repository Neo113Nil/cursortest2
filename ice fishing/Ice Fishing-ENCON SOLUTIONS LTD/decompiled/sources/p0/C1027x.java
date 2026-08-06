package p0;

import a.AbstractC0083a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* renamed from: p0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027x extends AbstractC1035a {
    public static final Parcelable.Creator<C1027x> CREATOR = new C.l(19);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f8417a;

    /* renamed from: b, reason: collision with root package name */
    public m0.d[] f8418b;

    /* renamed from: c, reason: collision with root package name */
    public int f8419c;

    /* renamed from: d, reason: collision with root package name */
    public C1006c f8420d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        Bundle bundle = this.f8417a;
        if (bundle != null) {
            int y3 = AbstractC0083a.y(parcel, 1);
            parcel.writeBundle(bundle);
            AbstractC0083a.z(parcel, y3);
        }
        AbstractC0083a.w(parcel, 2, this.f8418b, i2);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(this.f8419c);
        AbstractC0083a.u(parcel, 4, this.f8420d, i2);
        AbstractC0083a.z(parcel, y2);
    }
}
