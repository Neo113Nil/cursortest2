package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.f1;
import defpackage.ixf;
import defpackage.jbw;
import defpackage.joj;
import defpackage.rzm;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class j implements rzm {
    public final /* synthetic */ int a;
    public final h b;
    public final rzm c;
    public final rzm d;
    public final rzm e;

    public /* synthetic */ j(h hVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.b = hVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c.get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) this.d.get();
                f1 f1Var = (f1) this.e.get();
                this.b.getClass();
                wVar.getClass();
                aVar.getClass();
                f1Var.getClass();
                return new com.yandex.passport.internal.network.a(wVar, aVar, f1Var);
            default:
                x xVar = (x) this.c.get();
                Context context = (Context) this.d.get();
                com.yandex.passport.internal.flags.i iVar = (com.yandex.passport.internal.flags.i) this.e.get();
                this.b.getClass();
                xVar.getClass();
                context.getClass();
                iVar.getClass();
                joj jojVar = xVar.j;
                if (((Boolean) iVar.b(com.yandex.passport.internal.flags.o.f)).booleanValue()) {
                    jbw v = ixf.v(context);
                    jojVar.f(ixf.u(v), v);
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jojVar.c(30L, timeUnit);
                jojVar.e(30L, timeUnit);
                jojVar.g(30L);
                return new OkHttpClient(jojVar);
        }
    }
}
