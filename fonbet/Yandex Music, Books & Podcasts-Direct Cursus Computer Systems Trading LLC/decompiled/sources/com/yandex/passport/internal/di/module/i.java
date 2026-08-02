package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.analytics.a0;
import com.yandex.passport.internal.analytics.w;
import defpackage.rzm;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class i implements rzm {
    public final /* synthetic */ int a;
    public final h b;
    public final rzm c;

    public /* synthetic */ i(h hVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.report.reporters.h hVar = (com.yandex.passport.internal.report.reporters.h) this.c.get();
                this.b.getClass();
                hVar.getClass();
                return hVar;
            case 1:
                w wVar = (w) this.c.get();
                this.b.getClass();
                wVar.getClass();
                return new a0(wVar);
            case 2:
                com.yandex.passport.internal.report.d dVar = (com.yandex.passport.internal.report.d) this.c.get();
                this.b.getClass();
                dVar.getClass();
                return dVar;
            case 3:
                OkHttpClient okHttpClient = (OkHttpClient) this.c.get();
                this.b.getClass();
                okHttpClient.getClass();
                return new com.yandex.passport.internal.network.requester.e(okHttpClient);
            default:
                com.yandex.passport.internal.network.l lVar = (com.yandex.passport.internal.network.l) this.c.get();
                this.b.getClass();
                lVar.getClass();
                return lVar;
        }
    }
}
