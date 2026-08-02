package defpackage;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes11.dex */
public abstract class wc91 {
    public static final /* synthetic */ int a = 0;

    static {
        wc91.class.getClassLoader();
    }

    public static void a(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(oyr.i(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}
