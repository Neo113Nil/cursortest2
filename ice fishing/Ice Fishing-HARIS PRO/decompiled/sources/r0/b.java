package r0;

import D1.h;
import android.os.Parcel;
import android.util.SparseIntArray;
import r.C0338f;

/* loaded from: classes.dex */
public final class b extends AbstractC0345a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f4332d;
    public final Parcel e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4333f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4334g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4335h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4336k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0338f(0), new C0338f(0), new C0338f(0));
    }

    @Override // r0.AbstractC0345a
    public final b a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f4333f) {
            i = this.f4334g;
        }
        return new b(parcel, dataPosition, i, h.h(new StringBuilder(), this.f4335h, "  "), this.f4329a, this.f4330b, this.f4331c);
    }

    @Override // r0.AbstractC0345a
    public final boolean e(int i) {
        while (this.j < this.f4334g) {
            int i2 = this.f4336k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f4336k = parcel.readInt();
            this.j += readInt;
        }
        return this.f4336k == i;
    }

    @Override // r0.AbstractC0345a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.f4332d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i2, String str, C0338f c0338f, C0338f c0338f2, C0338f c0338f3) {
        super(c0338f, c0338f2, c0338f3);
        this.f4332d = new SparseIntArray();
        this.i = -1;
        this.f4336k = -1;
        this.e = parcel;
        this.f4333f = i;
        this.f4334g = i2;
        this.j = i;
        this.f4335h = str;
    }
}
