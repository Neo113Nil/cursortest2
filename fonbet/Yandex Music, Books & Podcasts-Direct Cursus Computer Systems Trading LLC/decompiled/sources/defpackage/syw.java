package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class syw extends a {
    public final q8s E;

    public syw(Context context, Looper looper, rn5 rn5Var, q8s q8sVar, rmd rmdVar, smd smdVar) {
        super(context, looper, 270, rn5Var, rmdVar, smdVar, 0);
        this.E = q8sVar;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof iyw ? (iyw) queryLocalInterface : new iyw(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return yd5.h;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle r() {
        this.E.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }
}
