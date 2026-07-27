package Z2;

import P2.AbstractC0379i;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class b extends AbstractC0379i {
    @Override // P2.AbstractC0376f, N2.c
    public final int j() {
        return 212800000;
    }

    @Override // P2.AbstractC0376f
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // P2.AbstractC0376f
    public final M2.d[] r() {
        return I2.d.f1292b;
    }

    @Override // P2.AbstractC0376f
    public final String v() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // P2.AbstractC0376f
    public final String w() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // P2.AbstractC0376f
    public final boolean x() {
        return true;
    }
}
