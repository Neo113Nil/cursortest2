package F0;

import android.os.Parcel;
import android.util.SparseIntArray;
import u1.h;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f895d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f897f;

    /* renamed from: g, reason: collision with root package name */
    public final int f898g;

    /* renamed from: h, reason: collision with root package name */
    public final String f899h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f900j;

    /* renamed from: k, reason: collision with root package name */
    public int f901k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.b(), new s.b(), new s.b());
    }

    @Override // F0.a
    public final b a() {
        Parcel parcel = this.f896e;
        int dataPosition = parcel.dataPosition();
        int i = this.f900j;
        if (i == this.f897f) {
            i = this.f898g;
        }
        return new b(parcel, dataPosition, i, h.g(new StringBuilder(), this.f899h, "  "), this.f892a, this.f893b, this.f894c);
    }

    @Override // F0.a
    public final boolean e(int i) {
        while (this.f900j < this.f898g) {
            int i6 = this.f901k;
            if (i6 == i) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i9 = this.f900j;
            Parcel parcel = this.f896e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f901k = parcel.readInt();
            this.f900j += readInt;
        }
        return this.f901k == i;
    }

    @Override // F0.a
    public final void h(int i) {
        int i6 = this.i;
        SparseIntArray sparseIntArray = this.f895d;
        Parcel parcel = this.f896e;
        if (i6 >= 0) {
            int i9 = sparseIntArray.get(i6);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i6, String str, s.b bVar, s.b bVar2, s.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f895d = new SparseIntArray();
        this.i = -1;
        this.f901k = -1;
        this.f896e = parcel;
        this.f897f = i;
        this.f898g = i6;
        this.f900j = i;
        this.f899h = str;
    }
}
