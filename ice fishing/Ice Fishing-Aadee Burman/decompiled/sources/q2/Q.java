package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC3464kd;

/* loaded from: classes.dex */
public final class Q extends AbstractC0432a implements S {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 2);
    }

    @Override // q2.S
    public final void Q(int i) {
        Parcel H02 = H0();
        H02.writeInt(i);
        f1(H02, 18);
    }

    @Override // q2.S
    public final void V0(BinderC3464kd binderC3464kd) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, binderC3464kd);
        f1(H02, 8);
    }
}
