package B;

import H3.F;
import android.os.Parcel;
import android.os.Parcelable;
import m.V0;
import p3.C4836a;
import q3.C4922b;
import t0.C4997L;
import y3.C5233a;

/* loaded from: classes.dex */
public final class g implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a;

    public /* synthetic */ g(int i) {
        this.f87a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f87a) {
            case 0:
                return new h(parcel, classLoader);
            case 1:
                return new F3.d(parcel, classLoader);
            case 2:
                return new G0.j(parcel, classLoader);
            case 3:
                return new F(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return V.b.f3266u;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new a0.e(parcel, classLoader);
            case 6:
                return new V0(parcel, classLoader);
            case 7:
                return new C4836a(parcel, classLoader);
            case 8:
                return new C4922b(parcel, classLoader);
            case 9:
                return new C4997L(parcel, classLoader);
            default:
                return new C5233a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f87a) {
            case 0:
                return new h[i];
            case 1:
                return new F3.d[i];
            case 2:
                return new G0.j[i];
            case 3:
                return new F[i];
            case 4:
                return new V.b[i];
            case 5:
                return new a0.e[i];
            case 6:
                return new V0[i];
            case 7:
                return new C4836a[i];
            case 8:
                return new C4922b[i];
            case 9:
                return new C4997L[i];
            default:
                return new C5233a[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f87a) {
            case 0:
                return new h(parcel, null);
            case 1:
                return new F3.d(parcel, null);
            case 2:
                return new G0.j(parcel, null);
            case 3:
                return new F(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return V.b.f3266u;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new a0.e(parcel, null);
            case 6:
                return new V0(parcel, null);
            case 7:
                return new C4836a(parcel, null);
            case 8:
                return new C4922b(parcel, null);
            case 9:
                return new C4997L(parcel, null);
            default:
                return new C5233a(parcel, null);
        }
    }
}
