package R2;

import N2.i;
import N2.j;
import P2.AbstractC0379i;
import P2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.b1;

/* loaded from: classes.dex */
public final class d extends AbstractC0379i {

    /* renamed from: X, reason: collision with root package name */
    public final o f2706X;

    public d(Context context, Looper looper, b1 b1Var, o oVar, i iVar, j jVar) {
        super(context, looper, 270, b1Var, iVar, jVar);
        this.f2706X = oVar;
    }

    @Override // P2.AbstractC0376f, N2.c
    public final int j() {
        return 203400000;
    }

    @Override // P2.AbstractC0376f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // P2.AbstractC0376f
    public final M2.d[] r() {
        return a3.c.f4333b;
    }

    @Override // P2.AbstractC0376f
    public final Bundle s() {
        this.f2706X.getClass();
        return new Bundle();
    }

    @Override // P2.AbstractC0376f
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // P2.AbstractC0376f
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // P2.AbstractC0376f
    public final boolean x() {
        return true;
    }
}
