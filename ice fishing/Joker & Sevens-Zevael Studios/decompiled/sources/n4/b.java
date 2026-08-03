package n4;

import android.os.Parcel;
import android.util.SparseIntArray;
import s.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f5049d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f5050e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5051f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5052g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5053h;

    /* renamed from: i, reason: collision with root package name */
    public int f5054i;

    /* renamed from: j, reason: collision with root package name */
    public int f5055j;

    /* renamed from: k, reason: collision with root package name */
    public int f5056k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // n4.a
    public final b a() {
        Parcel parcel = this.f5050e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f5055j;
        if (i10 == this.f5051f) {
            i10 = this.f5052g;
        }
        return new b(parcel, dataPosition, i10, this.f5053h + "  ", this.f5046a, this.f5047b, this.f5048c);
    }

    @Override // n4.a
    public final boolean e(int i10) {
        while (this.f5055j < this.f5052g) {
            int i11 = this.f5056k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f5055j;
            Parcel parcel = this.f5050e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f5056k = parcel.readInt();
            this.f5055j += readInt;
        }
        return this.f5056k == i10;
    }

    @Override // n4.a
    public final void h(int i10) {
        int i11 = this.f5054i;
        SparseIntArray sparseIntArray = this.f5049d;
        Parcel parcel = this.f5050e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(dataPosition - i12);
            parcel.setDataPosition(dataPosition);
        }
        this.f5054i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public b(Parcel parcel, int i10, int i11, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f5049d = new SparseIntArray();
        this.f5054i = -1;
        this.f5056k = -1;
        this.f5050e = parcel;
        this.f5051f = i10;
        this.f5052g = i11;
        this.f5055j = i10;
        this.f5053h = str;
    }
}
