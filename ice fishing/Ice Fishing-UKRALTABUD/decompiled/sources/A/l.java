package A;

import L.C0065p;
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
                C0065p c0065p = new C0065p();
                c0065p.f667a = parcel.readInt();
                c0065p.f668b = parcel.readInt();
                c0065p.f669c = parcel.readInt() == 1;
                return c0065p;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                M m2 = new M();
                m2.f570a = parcel.readInt();
                m2.f571b = parcel.readInt();
                m2.f573d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    m2.f572c = iArr;
                    parcel.readIntArray(iArr);
                }
                return m2;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                N n2 = new N();
                n2.f574a = parcel.readInt();
                n2.f575b = parcel.readInt();
                int readInt2 = parcel.readInt();
                n2.f576c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    n2.f577d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                n2.f578e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    n2.f579f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n2.f581h = parcel.readInt() == 1;
                n2.f582i = parcel.readInt() == 1;
                n2.f583j = parcel.readInt() == 1;
                n2.f580g = parcel.readArrayList(M.class.getClassLoader());
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
                return new C0065p[i2];
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new M[i2];
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new N[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}
