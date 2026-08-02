package A3;

import J3.F;
import android.os.Parcel;
import android.os.Parcelable;
import m.W0;
import r3.C4907a;
import s3.C4971b;
import t0.C4994J;

/* loaded from: classes2.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    public /* synthetic */ b(int i) {
        this.f96a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f96a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new B.g(parcel, classLoader);
            case 2:
                return new G0.i(parcel, classLoader);
            case 3:
                return new H3.d(parcel, classLoader);
            case 4:
                return new F(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return V.b.f3389u;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new a0.e(parcel, classLoader);
            case 7:
                return new W0(parcel, classLoader);
            case 8:
                return new C4907a(parcel, classLoader);
            case 9:
                return new C4971b(parcel, classLoader);
            default:
                return new C4994J(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f96a) {
            case 0:
                return new c[i];
            case 1:
                return new B.g[i];
            case 2:
                return new G0.i[i];
            case 3:
                return new H3.d[i];
            case 4:
                return new F[i];
            case 5:
                return new V.b[i];
            case 6:
                return new a0.e[i];
            case 7:
                return new W0[i];
            case 8:
                return new C4907a[i];
            case 9:
                return new C4971b[i];
            default:
                return new C4994J[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f96a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new B.g(parcel, null);
            case 2:
                return new G0.i(parcel, null);
            case 3:
                return new H3.d(parcel, null);
            case 4:
                return new F(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return V.b.f3389u;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new a0.e(parcel, null);
            case 7:
                return new W0(parcel, null);
            case 8:
                return new C4907a(parcel, null);
            case 9:
                return new C4971b(parcel, null);
            default:
                return new C4994J(parcel, null);
        }
    }
}
