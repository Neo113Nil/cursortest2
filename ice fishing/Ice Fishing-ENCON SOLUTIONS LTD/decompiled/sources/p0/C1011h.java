package p0;

import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011h extends AbstractC1035a {
    public static final Parcelable.Creator<C1011h> CREATOR = new C.l(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f8377a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8378b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8381e;

    public C1011h(int i2, int i3, int i4, boolean z2, boolean z3) {
        this.f8377a = i2;
        this.f8378b = z2;
        this.f8379c = z3;
        this.f8380d = i3;
        this.f8381e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8377a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8378b ? 1 : 0);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(this.f8379c ? 1 : 0);
        AbstractC0083a.A(parcel, 4, 4);
        parcel.writeInt(this.f8380d);
        AbstractC0083a.A(parcel, 5, 4);
        parcel.writeInt(this.f8381e);
        AbstractC0083a.z(parcel, y2);
    }
}
