package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nax extends a {
    public final AtomicReference E;

    public nax(rn5 rn5Var, rmd rmdVar, smd smdVar, Context context, Looper looper) {
        super(context, looper, 41, rn5Var, rmdVar, smdVar, 0);
        this.E = new AtomicReference();
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final void disconnect() {
        try {
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        if (this.E.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof gax ? (gax) queryLocalInterface : new gax(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", 2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return gld.h;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean y() {
        return true;
    }
}
