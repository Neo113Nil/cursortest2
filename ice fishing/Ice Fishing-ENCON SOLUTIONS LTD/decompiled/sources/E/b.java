package E;

import P.E;
import android.os.Parcel;
import android.os.Parcelable;
import h.a0;
import h.m0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    public /* synthetic */ b(int i2) {
        this.f305a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f305a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f306b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, classLoader);
            case 2:
                return new a0(parcel, classLoader);
            default:
                return new m0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f305a) {
            case 0:
                return new c[i2];
            case 1:
                return new E[i2];
            case 2:
                return new a0[i2];
            default:
                return new m0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f305a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f306b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new E(parcel, null);
            case 2:
                return new a0(parcel, null);
            default:
                return new m0(parcel, null);
        }
    }
}
