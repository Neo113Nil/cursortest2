package p6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends q6.a {
    public static final Parcelable.Creator<k> CREATOR = new e7.c(12);

    /* renamed from: g, reason: collision with root package name */
    public final int f5609g;

    /* renamed from: h, reason: collision with root package name */
    public List f5610h;

    public k(int i10, List list) {
        this.f5609g = i10;
        this.f5610h = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f5609g);
        x4.f.e0(parcel, 2, this.f5610h);
        x4.f.h0(parcel, g02);
    }
}
