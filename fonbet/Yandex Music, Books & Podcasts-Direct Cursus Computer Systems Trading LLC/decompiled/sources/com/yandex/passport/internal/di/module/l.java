package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.common.network.j0;
import defpackage.rzm;
import io.appmetrica.analytics.IReporterYandex;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class l implements rzm {
    public final /* synthetic */ int a;
    public final h b;
    public final rzm c;
    public final rzm d;

    public /* synthetic */ l(h hVar, rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = hVar;
        this.c = rzmVar;
        this.d = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) this.c.get();
                OkHttpClient okHttpClient = (OkHttpClient) this.d.get();
                this.b.getClass();
                aVar.getClass();
                okHttpClient.getClass();
                return new com.yandex.passport.common.network.l(aVar, okHttpClient);
            case 1:
                com.yandex.passport.common.coroutine.a aVar2 = (com.yandex.passport.common.coroutine.a) this.c.get();
                com.yandex.passport.common.network.l lVar = (com.yandex.passport.common.network.l) this.d.get();
                this.b.getClass();
                aVar2.getClass();
                lVar.getClass();
                j0 j0Var = new j0(((com.yandex.passport.common.coroutine.b) aVar2).c, lVar);
                j0Var.e = com.yandex.passport.common.domain.b.b;
                return j0Var;
            case 2:
                IReporterYandex iReporterYandex = (IReporterYandex) this.c.get();
                Context context = (Context) this.d.get();
                this.b.getClass();
                iReporterYandex.getClass();
                context.getClass();
                return com.yandex.passport.common.util.a.b(context) ? new com.yandex.passport.internal.sloth.credentialmanager.k(iReporterYandex) : new com.yandex.passport.internal.sloth.credentialmanager.l();
            default:
                Context context2 = (Context) this.c.get();
                com.yandex.passport.internal.flags.i iVar = (com.yandex.passport.internal.flags.i) this.d.get();
                this.b.getClass();
                context2.getClass();
                iVar.getClass();
                return com.yandex.passport.common.util.a.b(context2) ? new com.yandex.passport.internal.sloth.webauthn.c(iVar) : new com.yandex.passport.internal.sloth.webauthn.d();
        }
    }
}
