package d3;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4446a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37037a = 0;

    static {
        AbstractC4446a.class.getClassLoader();
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
            throw new BadParcelableException(AbstractC4404f.e(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
