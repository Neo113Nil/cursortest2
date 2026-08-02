package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.x;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class s implements rzm {
    public final /* synthetic */ int a;
    public final p b;
    public final rzm c;
    public final rzm d;
    public final rzm e;

    public /* synthetic */ s(p pVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.b = pVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c.get();
                com.yandex.passport.common.coroutine.e eVar = (com.yandex.passport.common.coroutine.e) this.d.get();
                com.yandex.passport.common.coroutine.a aVar = (com.yandex.passport.common.coroutine.a) this.e.get();
                this.b.getClass();
                context.getClass();
                eVar.getClass();
                aVar.getClass();
                return new com.yandex.passport.common.analytics.f(context, eVar, aVar);
            case 1:
                Context context2 = (Context) this.c.get();
                com.yandex.passport.common.analytics.f fVar = (com.yandex.passport.common.analytics.f) this.d.get();
                x xVar = (x) this.e.get();
                this.b.getClass();
                context2.getClass();
                fVar.getClass();
                xVar.getClass();
                return new com.yandex.passport.common.analytics.k(context2, fVar, xVar.g, xVar.f);
            default:
                Context context3 = (Context) this.c.get();
                com.yandex.passport.common.a aVar2 = (com.yandex.passport.common.a) this.d.get();
                com.yandex.passport.internal.flags.i iVar = (com.yandex.passport.internal.flags.i) this.e.get();
                this.b.getClass();
                context3.getClass();
                aVar2.getClass();
                iVar.getClass();
                String string = context3.getString(R.string.passport_sync_adapter_content_authority);
                string.getClass();
                return new com.yandex.passport.internal.core.sync.b(context3, string, com.yandex.passport.common.time.a.c(((Number) iVar.b(com.yandex.passport.internal.flags.o.p0)).intValue(), 0, 0, 14), aVar2);
        }
    }
}
