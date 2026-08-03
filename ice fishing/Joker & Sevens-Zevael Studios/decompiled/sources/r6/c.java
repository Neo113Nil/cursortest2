package r6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import n6.f;
import n6.g;
import p6.d;
import p6.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.a {
    public final l D;

    public c(Context context, Looper looper, d dVar, l lVar, f fVar, g gVar) {
        super(context, looper, 270, dVar, fVar, gVar);
        this.D = lVar;
    }

    @Override // n6.a
    public final int e() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final m6.d[] p() {
        return y6.c.f8794b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        l lVar = this.D;
        lVar.getClass();
        Bundle bundle = new Bundle();
        String str = lVar.f5612a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
