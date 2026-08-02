package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;

/* loaded from: classes.dex */
public final class U extends AbstractC0549a implements V {
    public U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 1);
    }

    @Override // s2.V
    public final void q2(String str, String str2) {
        Parcel F02 = F0();
        F02.writeString(str);
        F02.writeString(str2);
        d1(F02, 1);
    }
}
