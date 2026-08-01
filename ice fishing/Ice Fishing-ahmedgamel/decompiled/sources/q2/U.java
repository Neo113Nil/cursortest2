package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class U extends AbstractC0432a implements V {
    public U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 2);
    }

    @Override // q2.V
    public final void u2(String str, String str2) {
        Parcel H02 = H0();
        H02.writeString(str);
        H02.writeString(str2);
        f1(H02, 1);
    }
}
