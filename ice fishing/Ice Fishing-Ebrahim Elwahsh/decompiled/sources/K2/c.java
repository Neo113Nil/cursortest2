package K2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1575a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1575a) {
            case 0:
                int F8 = K3.b.F(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < F8) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        K3.b.C(parcel, readInt);
                    } else {
                        intent = (Intent) K3.b.h(parcel, readInt, Intent.CREATOR);
                    }
                }
                K3.b.m(parcel, F8);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f1575a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
