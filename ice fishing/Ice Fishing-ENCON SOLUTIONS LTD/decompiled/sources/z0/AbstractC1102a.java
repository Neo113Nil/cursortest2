package z0;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1102a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8619a = 0;

    static {
        AbstractC1102a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(C1.a.f(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
