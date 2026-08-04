package c;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f49d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f50e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f52g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f53h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f56k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.b(), new a.b(), new a.b());
    }

    @Override // c.b
    public final c a() {
        Parcel parcel = this.f50e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f55j;
        if (i2 == this.f51f) {
            i2 = this.f52g;
        }
        return new c(parcel, iDataPosition, i2, this.f53h + "  ", this.f46a, this.f47b, this.f48c);
    }

    @Override // c.b
    public final boolean e(int i2) {
        while (this.f55j < this.f52g) {
            int i3 = this.f56k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f55j;
            Parcel parcel = this.f50e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f56k = parcel.readInt();
            this.f55j += i5;
        }
        return this.f56k == i2;
    }

    @Override // c.b
    public final void i(int i2) {
        int i3 = this.f54i;
        SparseIntArray sparseIntArray = this.f49d;
        Parcel parcel = this.f50e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f54i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, a.b bVar, a.b bVar2, a.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f49d = new SparseIntArray();
        this.f54i = -1;
        this.f56k = -1;
        this.f50e = parcel;
        this.f51f = i2;
        this.f52g = i3;
        this.f55j = i2;
        this.f53h = str;
    }
}
