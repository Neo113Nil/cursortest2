package B;

import V0.C;
import android.os.Parcel;
import android.os.Parcelable;
import k0.U;
import m.a1;
import m0.C0301i;

/* loaded from: classes.dex */
public final class h implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    public /* synthetic */ h(int i) {
        this.f25a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f25a) {
            case 0:
                return new i(parcel, classLoader);
            case 1:
                return new B0.i(parcel, classLoader);
            case 2:
                return new C0.b(parcel, classLoader);
            case 3:
                return new L0.a(parcel, classLoader);
            case 4:
                return new L0.f(parcel, classLoader);
            case 5:
                return new N0.k(parcel, classLoader);
            case 6:
                if (parcel.readParcelable(classLoader) == null) {
                    return T.b.f1146b;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new T0.d(parcel, classLoader);
            case 8:
                return new C(parcel, classLoader);
            case 9:
                return new U(parcel, classLoader);
            case 10:
                return new a1(parcel, classLoader);
            default:
                return new C0301i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f25a) {
            case 0:
                return new i[i];
            case 1:
                return new B0.i[i];
            case 2:
                return new C0.b[i];
            case 3:
                return new L0.a[i];
            case 4:
                return new L0.f[i];
            case 5:
                return new N0.k[i];
            case 6:
                return new T.b[i];
            case 7:
                return new T0.d[i];
            case 8:
                return new C[i];
            case 9:
                return new U[i];
            case 10:
                return new a1[i];
            default:
                return new C0301i[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25a) {
            case 0:
                return new i(parcel, null);
            case 1:
                return new B0.i(parcel, (ClassLoader) null);
            case 2:
                return new C0.b(parcel, null);
            case 3:
                return new L0.a(parcel, null);
            case 4:
                return new L0.f(parcel, null);
            case 5:
                return new N0.k(parcel, null);
            case 6:
                if (parcel.readParcelable(null) == null) {
                    return T.b.f1146b;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new T0.d(parcel, (ClassLoader) null);
            case 8:
                return new C(parcel, null);
            case 9:
                return new U(parcel, null);
            case 10:
                return new a1(parcel, null);
            default:
                return new C0301i(parcel);
        }
    }
}
