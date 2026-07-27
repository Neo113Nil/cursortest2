package A;

import L.C0040p;
import L.M;
import L.N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f31a) {
            case 0:
                m mVar = new m(parcel);
                mVar.f32a = parcel.readInt();
                return mVar;
            case 1:
                C0040p c0040p = new C0040p();
                c0040p.f589a = parcel.readInt();
                c0040p.f590b = parcel.readInt();
                c0040p.f591c = parcel.readInt() == 1;
                return c0040p;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                M m2 = new M();
                m2.f492a = parcel.readInt();
                m2.f493b = parcel.readInt();
                m2.f495d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    m2.f494c = iArr;
                    parcel.readIntArray(iArr);
                }
                return m2;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                N n2 = new N();
                n2.f496a = parcel.readInt();
                n2.f497b = parcel.readInt();
                int readInt2 = parcel.readInt();
                n2.f498c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    n2.f499d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                n2.f500e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    n2.f501f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n2.f503h = parcel.readInt() == 1;
                n2.f504i = parcel.readInt() == 1;
                n2.f505j = parcel.readInt() == 1;
                n2.f502g = parcel.readArrayList(M.class.getClassLoader());
                return n2;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f31a) {
            case 0:
                return new m[i2];
            case 1:
                return new C0040p[i2];
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new M[i2];
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new N[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
