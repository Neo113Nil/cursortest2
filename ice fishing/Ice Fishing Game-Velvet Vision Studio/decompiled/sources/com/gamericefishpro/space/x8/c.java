package com.gamericefishpro.space.x8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.gamericefishpro.space.b8.k;
import com.gamericefishpro.space.s8.d;
import com.gamericefishpro.space.t8.f;
import com.gamericefishpro.space.t8.g;
import com.gamericefishpro.space.v8.i;
import com.gamericefishpro.space.v8.o;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public final o X;

    public c(Context context, Looper looper, k kVar, o oVar, f fVar, g gVar) {
        super(context, looper, 270, kVar, fVar, gVar);
        this.X = oVar;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final int f() {
        return 203400000;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.gamericefishpro.space.v8.f
    public final d[] r() {
        return com.gamericefishpro.space.f9.c.b;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final Bundle s() {
        o oVar = this.X;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.gamericefishpro.space.v8.f
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.gamericefishpro.space.v8.f
    public final boolean x() {
        return true;
    }
}
