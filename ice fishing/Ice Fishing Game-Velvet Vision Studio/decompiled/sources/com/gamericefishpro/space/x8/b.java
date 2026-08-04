package com.gamericefishpro.space.x8;

import android.content.Context;
import android.os.Build;
import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.r9.h;
import com.gamericefishpro.space.t.f;
import com.gamericefishpro.space.t8.e;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.u8.d;
import com.gamericefishpro.space.u8.k0;
import com.gamericefishpro.space.u8.m0;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.n;
import com.gamericefishpro.space.v8.o;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final com.gamericefishpro.space.t8.c i = new com.gamericefishpro.space.t8.c("ClientTelemetry.API", new com.gamericefishpro.space.o9.b(2), new com.gamericefishpro.space.t8.b());
    public final Context a;
    public final String b;
    public final com.gamericefishpro.space.t8.c c;
    public final o d;
    public final com.gamericefishpro.space.u8.a e;
    public final int f;
    public final com.gamericefishpro.space.u4.b g;
    public final d h;

    public b(Context context, com.gamericefishpro.space.t8.c cVar, o oVar, e eVar) {
        c0.h(context, "Null context is not permitted.");
        c0.h(cVar, "Api must not be null.");
        c0.h(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        c0.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = cVar;
        this.d = oVar;
        this.e = new com.gamericefishpro.space.u8.a(cVar, oVar, attributionTag);
        d dVarD = d.d(applicationContext);
        this.h = dVarD;
        this.f = dVarD.A.getAndIncrement();
        this.g = eVar.a;
        com.gamericefishpro.space.f9.e eVar2 = dVarD.F;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final com.gamericefishpro.space.r5.b a() {
        com.gamericefishpro.space.r5.b bVar = new com.gamericefishpro.space.r5.b(6);
        Set set = Collections.EMPTY_SET;
        if (((f) bVar.e) == null) {
            bVar.e = new f(0);
        }
        ((f) bVar.e).addAll(set);
        Context context = this.a;
        bVar.v = context.getClass().getName();
        bVar.i = context.getPackageName();
        return bVar;
    }

    public final com.gamericefishpro.space.r9.o b(n nVar) {
        u uVar = new u(7, false);
        com.gamericefishpro.space.s8.d[] dVarArr = {com.gamericefishpro.space.f9.c.a};
        uVar.e = new u(25, nVar);
        g4 g4Var = new g4();
        g4Var.c = uVar;
        g4Var.b = dVarArr;
        g4Var.a = false;
        h hVar = new h();
        d dVar = this.h;
        dVar.getClass();
        k0 k0Var = new k0(new m0(g4Var, hVar, this.g), dVar.B.get(), this);
        com.gamericefishpro.space.f9.e eVar = dVar.F;
        eVar.sendMessage(eVar.obtainMessage(4, k0Var));
        return hVar.a;
    }
}
