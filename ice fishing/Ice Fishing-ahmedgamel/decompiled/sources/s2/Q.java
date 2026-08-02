package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC3487kd;

/* loaded from: classes.dex */
public final class Q extends AbstractC0549a implements S {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 1);
    }

    @Override // s2.S
    public final void Q(int i) {
        Parcel F02 = F0();
        F02.writeInt(i);
        d1(F02, 18);
    }

    @Override // s2.S
    public final void U0(BinderC3487kd binderC3487kd) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, binderC3487kd);
        d1(F02, 8);
    }
}
