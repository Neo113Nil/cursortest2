package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class w2x extends a {
    public final String E;
    public final l2x F;

    public w2x(rn5 rn5Var, rmd rmdVar, smd smdVar, Context context, Looper looper) {
        super(context, looper, 23, rn5Var, rmdVar, smdVar, 0);
        kwl kwlVar = new kwl();
        this.E = "locationServices";
        this.F = new l2x(kwlVar);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final void disconnect() {
        synchronized (this.F) {
            if (isConnected()) {
                try {
                    this.F.b();
                    this.F.getClass();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof k1x ? (k1x) queryLocalInterface : new k1x(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return qld.o;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.E);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean y() {
        return true;
    }
}
