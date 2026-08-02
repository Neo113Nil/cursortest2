package f3;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Wv;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4518a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37439a = 0;

    static {
        AbstractC4518a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(Wv.f(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
