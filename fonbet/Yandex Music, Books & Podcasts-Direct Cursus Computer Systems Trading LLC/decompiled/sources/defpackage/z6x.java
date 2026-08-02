package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class z6x extends a {
    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof xax ? (xax) queryLocalInterface : new xax(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return cxb.s;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean y() {
        return true;
    }
}
