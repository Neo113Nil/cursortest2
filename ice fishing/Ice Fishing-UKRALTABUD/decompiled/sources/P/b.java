package P;

import android.os.Parcel;
import android.util.SparseIntArray;
import k.C0189a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f850d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f852f;

    /* renamed from: g, reason: collision with root package name */
    public final int f853g;

    /* renamed from: h, reason: collision with root package name */
    public final String f854h;

    /* renamed from: i, reason: collision with root package name */
    public int f855i;

    /* renamed from: j, reason: collision with root package name */
    public int f856j;

    /* renamed from: k, reason: collision with root package name */
    public int f857k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0189a(), new C0189a(), new C0189a());
    }

    @Override // P.a
    public final b a() {
        Parcel parcel = this.f851e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f856j;
        if (i2 == this.f852f) {
            i2 = this.f853g;
        }
        return new b(parcel, dataPosition, i2, this.f854h + "  ", this.f847a, this.f848b, this.f849c);
    }

    @Override // P.a
    public final boolean e(int i2) {
        while (this.f856j < this.f853g) {
            int i3 = this.f857k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f856j;
            Parcel parcel = this.f851e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f857k = parcel.readInt();
            this.f856j += readInt;
        }
        return this.f857k == i2;
    }

    @Override // P.a
    public final void h(int i2) {
        int i3 = this.f855i;
        SparseIntArray sparseIntArray = this.f850d;
        Parcel parcel = this.f851e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f855i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0189a c0189a, C0189a c0189a2, C0189a c0189a3) {
        super(c0189a, c0189a2, c0189a3);
        this.f850d = new SparseIntArray();
        this.f855i = -1;
        this.f857k = -1;
        this.f851e = parcel;
        this.f852f = i2;
        this.f853g = i3;
        this.f856j = i2;
        this.f854h = str;
    }
}
