package N2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1919a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1919a) {
            case 0:
                int L2 = com.bumptech.glide.d.L(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < L2) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        com.bumptech.glide.d.J(parcel, readInt);
                    } else {
                        intent = (Intent) com.bumptech.glide.d.k(parcel, readInt, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.d.p(parcel, L2);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f1919a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
