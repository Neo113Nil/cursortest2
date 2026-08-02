package com.yandex.passport.internal.badges;

import android.app.Activity;
import android.content.Context;
import com.yandex.passport.common.network.n;
import com.yandex.passport.data.network.s7;
import com.yandex.passport.data.network.z0;
import com.yandex.passport.internal.filter.l;
import com.yandex.passport.internal.filter.r;
import com.yandex.passport.internal.provider.communication.w;
import com.yandex.passport.internal.push.f0;
import com.yandex.passport.internal.push.g0;
import com.yandex.passport.internal.push.p;
import com.yandex.passport.internal.report.reporters.h1;
import com.yandex.passport.internal.sloth.m;
import com.yandex.passport.internal.ui.bouncer.error.k;
import com.yandex.passport.internal.ui.bouncer.error.q;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.sloth.k0;
import com.yandex.passport.internal.usecase.ui.h0;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.command.performers.v;
import com.yandex.passport.sloth.ui.dependencies.o;
import com.yandex.passport.sloth.ui.n0;
import defpackage.o9h;
import defpackage.rzm;
import defpackage.toe;
import defpackage.xy0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final Object c;
    public final rzm d;

    public f(s7 s7Var, rzm rzmVar, rzm rzmVar2) {
        this.a = 5;
        this.d = s7Var;
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new e((com.yandex.passport.common.coroutine.a) this.b.get(), (Context) ((rzm) this.c).get(), (c) ((z0) this.d).get());
            case 1:
                com.yandex.passport.internal.di.module.h hVar = (com.yandex.passport.internal.di.module.h) this.c;
                Map map = (Map) this.b.get();
                Map map2 = (Map) ((o9h) this.d).get();
                hVar.getClass();
                map.getClass();
                map2.getClass();
                xy0 xy0Var = new xy0(0);
                xy0 xy0Var2 = new xy0(0);
                for (Map.Entry entry : map.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    com.yandex.passport.internal.network.client.g gVar = (com.yandex.passport.internal.network.client.g) entry.getValue();
                    com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                    num.getClass();
                    int intValue = num.intValue();
                    aVar.getClass();
                    com.yandex.passport.common.core.b b = com.yandex.passport.common.core.a.b(intValue);
                    gVar.getClass();
                    xy0Var.put(b, gVar);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    Integer num2 = (Integer) entry2.getKey();
                    com.yandex.passport.internal.network.client.j jVar = (com.yandex.passport.internal.network.client.j) entry2.getValue();
                    com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                    num2.getClass();
                    int intValue2 = num2.intValue();
                    aVar2.getClass();
                    com.yandex.passport.common.core.b b2 = com.yandex.passport.common.core.a.b(intValue2);
                    jVar.getClass();
                    xy0Var2.put(b2, jVar);
                }
                return new com.yandex.passport.internal.network.client.h(xy0Var, xy0Var2);
            case 2:
                r rVar = (r) this.b.get();
                com.yandex.passport.common.common.a aVar3 = (com.yandex.passport.common.common.a) ((rzm) this.c).get();
                ((com.yandex.passport.internal.di.module.c) this.d).get();
                return new l(rVar, aVar3, "7.54.1", new com.yandex.passport.data.network.token.i(12));
            case 3:
                return new p((Context) this.b.get(), (n) ((w) this.c).get(), (f0) ((g0) this.d).get());
            case 4:
                return new q((Activity) this.b.get(), (k) ((rzm) this.c).get(), (com.yandex.passport.internal.ui.bouncer.error.p) ((h1) this.d).get());
            case 5:
                return new com.yandex.passport.internal.ui.bouncer.loading.i((com.yandex.passport.internal.ui.bouncer.loading.l) ((s7) this.d).get(), (s) this.b.get(), (com.yandex.passport.internal.sloth.n) ((rzm) this.c).get());
            case 6:
                return new com.yandex.passport.internal.ui.common.web.a((com.yandex.passport.internal.config.p) this.b.get(), (m) ((h1) this.d).get(), (com.yandex.passport.internal.network.d) ((rzm) this.c).get());
            case 7:
                return new com.yandex.passport.internal.ui.sloth.webcard.z0((com.yandex.passport.internal.ui.sloth.h) this.b.get(), (k0) ((rzm) this.c).get(), (o) ((com.yandex.passport.internal.di.module.k) this.d).get());
            case 8:
                return new h0((com.yandex.passport.common.coroutine.a) this.b.get(), (com.yandex.passport.internal.core.accounts.e) ((rzm) this.c).get(), (l) ((f) this.d).get());
            case 9:
                return new v((Context) ((com.yandex.passport.sloth.dependencies.c) this.c).get(), (com.yandex.passport.sloth.v) this.b.get(), (com.yandex.passport.sloth.data.m) ((toe) this.d).a);
            case 10:
                return new com.yandex.passport.sloth.ui.z0((a1) this.b.get(), (com.yandex.passport.sloth.v) ((rzm) this.c).get(), (com.yandex.passport.sloth.data.m) ((toe) this.d).a);
            default:
                return new n0((Activity) ((com.yandex.passport.sloth.ui.dependencies.n) this.b).get(), (com.yandex.passport.sloth.ui.string.b) ((com.yandex.passport.sloth.ui.dependencies.n) this.c).get(), (o) ((com.yandex.passport.sloth.ui.dependencies.n) this.d).get());
        }
    }

    public /* synthetic */ f(Object obj, rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.c = obj;
        this.b = rzmVar;
        this.d = rzmVar2;
    }

    public /* synthetic */ f(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    public f(rzm rzmVar, h1 h1Var, rzm rzmVar2) {
        this.a = 6;
        this.b = rzmVar;
        this.d = h1Var;
        this.c = rzmVar2;
    }
}
