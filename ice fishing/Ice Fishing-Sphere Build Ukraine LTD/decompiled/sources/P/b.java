package P;

import android.os.Parcel;
import android.util.SparseIntArray;
import k.C0189a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f821d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f822e;

    /* renamed from: f, reason: collision with root package name */
    public final int f823f;

    /* renamed from: g, reason: collision with root package name */
    public final int f824g;

    /* renamed from: h, reason: collision with root package name */
    public final String f825h;

    /* renamed from: i, reason: collision with root package name */
    public int f826i;

    /* renamed from: j, reason: collision with root package name */
    public int f827j;

    /* renamed from: k, reason: collision with root package name */
    public int f828k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0189a(), new C0189a(), new C0189a());
    }

    @Override // P.a
    public final b a() {
        Parcel parcel = this.f822e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f827j;
        if (i2 == this.f823f) {
            i2 = this.f824g;
        }
        return new b(parcel, dataPosition, i2, this.f825h + "  ", this.f818a, this.f819b, this.f820c);
    }

    @Override // P.a
    public final boolean e(int i2) {
        while (this.f827j < this.f824g) {
            int i3 = this.f828k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f827j;
            Parcel parcel = this.f822e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f828k = parcel.readInt();
            this.f827j += readInt;
        }
        return this.f828k == i2;
    }

    @Override // P.a
    public final void h(int i2) {
        int i3 = this.f826i;
        SparseIntArray sparseIntArray = this.f821d;
        Parcel parcel = this.f822e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f826i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0189a c0189a, C0189a c0189a2, C0189a c0189a3) {
        super(c0189a, c0189a2, c0189a3);
        this.f821d = new SparseIntArray();
        this.f826i = -1;
        this.f828k = -1;
        this.f822e = parcel;
        this.f823f = i2;
        this.f824g = i3;
        this.f827j = i2;
        this.f825h = str;
    }
}
