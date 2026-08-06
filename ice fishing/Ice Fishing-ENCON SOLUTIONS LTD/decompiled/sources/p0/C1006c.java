package p0;

import a.AbstractC0083a;
import android.os.Parcel;
import android.os.Parcelable;
import q0.AbstractC1035a;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006c extends AbstractC1035a {
    public static final Parcelable.Creator<C1006c> CREATOR = new C.l(20);

    /* renamed from: a, reason: collision with root package name */
    public final C1011h f8343a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8344b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8345c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8346d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8347e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8348f;

    public C1006c(C1011h c1011h, boolean z2, boolean z3, int[] iArr, int i2, int[] iArr2) {
        this.f8343a = c1011h;
        this.f8344b = z2;
        this.f8345c = z3;
        this.f8346d = iArr;
        this.f8347e = i2;
        this.f8348f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int y2 = AbstractC0083a.y(parcel, 20293);
        AbstractC0083a.u(parcel, 1, this.f8343a, i2);
        AbstractC0083a.A(parcel, 2, 4);
        parcel.writeInt(this.f8344b ? 1 : 0);
        AbstractC0083a.A(parcel, 3, 4);
        parcel.writeInt(this.f8345c ? 1 : 0);
        int[] iArr = this.f8346d;
        if (iArr != null) {
            int y3 = AbstractC0083a.y(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0083a.z(parcel, y3);
        }
        AbstractC0083a.A(parcel, 5, 4);
        parcel.writeInt(this.f8347e);
        int[] iArr2 = this.f8348f;
        if (iArr2 != null) {
            int y4 = AbstractC0083a.y(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0083a.z(parcel, y4);
        }
        AbstractC0083a.z(parcel, y2);
    }
}
