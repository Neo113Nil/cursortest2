package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wxUZMvaN implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ wxUZMvaN(int i) {
        this.qoPGr6Ce = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.qoPGr6Ce) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return VgvYg0wo.MdtA4re8;
                }
                m1.Ey6iv0m0("superState must be null");
                return null;
            case 1:
                return new fr(parcel, classLoader);
            case 2:
                return new sv(parcel, classLoader);
            case 3:
                return new bz(parcel, classLoader);
            case 4:
                return new c20(parcel, classLoader);
            default:
                return new ad0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.qoPGr6Ce) {
            case 0:
                return new VgvYg0wo[i];
            case 1:
                return new fr[i];
            case 2:
                return new sv[i];
            case 3:
                return new bz[i];
            case 4:
                return new c20[i];
            default:
                return new ad0[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.qoPGr6Ce) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return VgvYg0wo.MdtA4re8;
                }
                m1.Ey6iv0m0("superState must be null");
                return null;
            case 1:
                return new fr(parcel, null);
            case 2:
                return new sv(parcel, null);
            case 3:
                return new bz(parcel, null);
            case 4:
                return new c20(parcel, null);
            default:
                return new ad0(parcel, null);
        }
    }
}
