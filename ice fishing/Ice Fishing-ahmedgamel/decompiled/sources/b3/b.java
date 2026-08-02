package b3;

import R2.AbstractC0383i;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class b extends AbstractC0383i {
    @Override // R2.AbstractC0380f, P2.c
    public final int i() {
        return 212800000;
    }

    @Override // R2.AbstractC0380f
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // R2.AbstractC0380f
    public final O2.d[] r() {
        return K2.d.f1685b;
    }

    @Override // R2.AbstractC0380f
    public final String v() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // R2.AbstractC0380f
    public final String w() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // R2.AbstractC0380f
    public final boolean x() {
        return true;
    }
}
