package L2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1630a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1630a) {
            case 0:
                int H8 = t8.g.H(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < H8) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        t8.g.G(parcel, readInt);
                    } else {
                        intent = (Intent) t8.g.h(parcel, readInt, Intent.CREATOR);
                    }
                }
                t8.g.n(parcel, H8);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f1630a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
