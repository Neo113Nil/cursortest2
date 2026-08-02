package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.appset.zzg;

/* loaded from: classes.dex */
public final class xg91 extends ukt {
    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Feature[] f() {
        return em91.b;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean p() {
        return true;
    }
}
