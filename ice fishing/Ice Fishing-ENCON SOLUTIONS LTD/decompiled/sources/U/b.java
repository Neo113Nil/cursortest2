package U;

import android.os.Parcel;
import android.util.SparseIntArray;
import l.C0978b;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1806d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1807e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1808f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1809g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1810h;

    /* renamed from: i, reason: collision with root package name */
    public int f1811i;

    /* renamed from: j, reason: collision with root package name */
    public int f1812j;

    /* renamed from: k, reason: collision with root package name */
    public int f1813k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0978b(), new C0978b(), new C0978b());
    }

    @Override // U.a
    public final b a() {
        Parcel parcel = this.f1807e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1812j;
        if (i2 == this.f1808f) {
            i2 = this.f1809g;
        }
        return new b(parcel, dataPosition, i2, C1.a.k(new StringBuilder(), this.f1810h, "  "), this.f1803a, this.f1804b, this.f1805c);
    }

    @Override // U.a
    public final boolean e(int i2) {
        while (this.f1812j < this.f1809g) {
            int i3 = this.f1813k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1812j;
            Parcel parcel = this.f1807e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1813k = parcel.readInt();
            this.f1812j += readInt;
        }
        return this.f1813k == i2;
    }

    @Override // U.a
    public final void h(int i2) {
        int i3 = this.f1811i;
        SparseIntArray sparseIntArray = this.f1806d;
        Parcel parcel = this.f1807e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1811i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0978b c0978b, C0978b c0978b2, C0978b c0978b3) {
        super(c0978b, c0978b2, c0978b3);
        this.f1806d = new SparseIntArray();
        this.f1811i = -1;
        this.f1813k = -1;
        this.f1807e = parcel;
        this.f1808f = i2;
        this.f1809g = i3;
        this.f1812j = i2;
        this.f1810h = str;
    }
}
