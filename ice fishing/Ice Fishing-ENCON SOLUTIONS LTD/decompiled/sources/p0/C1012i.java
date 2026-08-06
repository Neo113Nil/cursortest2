package p0;

import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import q0.AbstractC1035a;

/* renamed from: p0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1012i extends AbstractC1035a {
    public static final Parcelable.Creator<C1012i> CREATOR = new C.l(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f8382a;

    /* renamed from: b, reason: collision with root package name */
    public List f8383b;

    public C1012i(int i2, List list) {
        this.f8382a = i2;
        this.f8383b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f8382a);
        AbstractC0083a.x(parcel, 2, this.f8383b);
        AbstractC0083a.z(parcel, y2);
    }
}
