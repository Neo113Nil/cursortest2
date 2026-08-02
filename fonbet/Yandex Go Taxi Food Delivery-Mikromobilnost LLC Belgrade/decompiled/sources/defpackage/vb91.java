package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public abstract class vb91 {
    public static final /* synthetic */ int a = 0;

    static {
        vb91.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
