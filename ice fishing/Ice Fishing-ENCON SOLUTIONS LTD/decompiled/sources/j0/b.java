package j0;

import C.l;
import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class b extends AbstractC1035a {
    public static final Parcelable.Creator<b> CREATOR = new l(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f8030a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8031b;

    public b(String str, int i2) {
        this.f8030a = str;
        this.f8031b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.v(parcel, 1, this.f8030a);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8031b);
        AbstractC0083a.z(parcel, y2);
    }
}
