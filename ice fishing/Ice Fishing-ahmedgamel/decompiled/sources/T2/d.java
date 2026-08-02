package T2;

import P2.i;
import P2.j;
import R2.AbstractC0383i;
import R2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m.c1;

/* loaded from: classes.dex */
public final class d extends AbstractC0383i {

    /* renamed from: X, reason: collision with root package name */
    public final o f3161X;

    public d(Context context, Looper looper, c1 c1Var, o oVar, i iVar, j jVar) {
        super(context, looper, 270, c1Var, iVar, jVar);
        this.f3161X = oVar;
    }

    @Override // R2.AbstractC0380f, P2.c
    public final int i() {
        return 203400000;
    }

    @Override // R2.AbstractC0380f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // R2.AbstractC0380f
    public final O2.d[] r() {
        return c3.c.f5726b;
    }

    @Override // R2.AbstractC0380f
    public final Bundle s() {
        this.f3161X.getClass();
        return new Bundle();
    }

    @Override // R2.AbstractC0380f
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // R2.AbstractC0380f
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // R2.AbstractC0380f
    public final boolean x() {
        return true;
    }
}
