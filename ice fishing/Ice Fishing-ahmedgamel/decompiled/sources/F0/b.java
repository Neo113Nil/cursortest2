package F0;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f958d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f959e;

    /* renamed from: f, reason: collision with root package name */
    public final int f960f;

    /* renamed from: g, reason: collision with root package name */
    public final int f961g;

    /* renamed from: h, reason: collision with root package name */
    public final String f962h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f963j;

    /* renamed from: k, reason: collision with root package name */
    public int f964k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.b(), new s.b(), new s.b());
    }

    @Override // F0.a
    public final b a() {
        Parcel parcel = this.f959e;
        int dataPosition = parcel.dataPosition();
        int i = this.f963j;
        if (i == this.f960f) {
            i = this.f961g;
        }
        return new b(parcel, dataPosition, i, Wv.i(new StringBuilder(), this.f962h, "  "), this.f955a, this.f956b, this.f957c);
    }

    @Override // F0.a
    public final boolean e(int i) {
        while (this.f963j < this.f961g) {
            int i4 = this.f964k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i6 = this.f963j;
            Parcel parcel = this.f959e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f964k = parcel.readInt();
            this.f963j += readInt;
        }
        return this.f964k == i;
    }

    @Override // F0.a
    public final void h(int i) {
        int i4 = this.i;
        SparseIntArray sparseIntArray = this.f958d;
        Parcel parcel = this.f959e;
        if (i4 >= 0) {
            int i6 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i4, String str, s.b bVar, s.b bVar2, s.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f958d = new SparseIntArray();
        this.i = -1;
        this.f964k = -1;
        this.f959e = parcel;
        this.f960f = i;
        this.f961g = i4;
        this.f963j = i;
        this.f962h = str;
    }
}
