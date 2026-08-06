package C0;

import C.l;
import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import p0.C1017n;
import q0.AbstractC1035a;

/* loaded from: classes.dex */
public final class f extends AbstractC1035a {
    public static final Parcelable.Creator<f> CREATOR = new l(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f144a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.b f145b;

    /* renamed from: c, reason: collision with root package name */
    public final C1017n f146c;

    public f(int i2, m0.b bVar, C1017n c1017n) {
        this.f144a = i2;
        this.f145b = bVar;
        this.f146c = c1017n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.A(parcel, 1, 4);
        parcel.writeInt(this.f144a);
        AbstractC0083a.u(parcel, 2, this.f145b, i2);
        AbstractC0083a.u(parcel, 3, this.f146c, i2);
        AbstractC0083a.z(parcel, y2);
    }
}
