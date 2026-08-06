package r0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import m0.d;
import o0.l;
import p0.C1013j;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041c extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final C1013j f8471y;

    public C1041c(Context context, Looper looper, Q0.c cVar, C1013j c1013j, l lVar, l lVar2) {
        super(context, looper, 270, cVar, lVar, lVar2);
        this.f8471y = c1013j;
    }

    @Override // n0.InterfaceC0989c
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C1039a ? (C1039a) queryLocalInterface : new C1039a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final d[] o() {
        return y0.c.f8602b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.f8471y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
