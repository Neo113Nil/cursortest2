package defpackage;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.dispatcher.a;
import com.yandex.plus.home.analytics.c;
import com.yandex.plus.home.graphql.panel.g;
import com.yandex.plus.home.graphql.plusstate.f;
import com.yandex.plus.home.graphql.user.e;
import com.yandex.plus.home.h;
import com.yandex.plus.home.internal.di.l;
import com.yandex.plus.home.internal.di.t;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.internal.di.z;
import com.yandex.plus.home.j;
import com.yandex.plus.home.plaque.feature.internal.presentation.b;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.internal.c1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g5k {
    public final hn5 a;
    public final String b;
    public final jyr d;
    public final jyr e;
    public rar f;
    public final jyr c = l18.b.b(hag.I(n7m.class), true);
    public final xdr g = ydr.a(n5k.a);

    public g5k(hn5 hn5Var, String str) {
        this.a = hn5Var;
        this.b = str;
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: f5k
            public final /* synthetic */ g5k b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        g5k g5kVar = this.b;
                        n7m n7mVar = (n7m) g5kVar.c.getValue();
                        hn5 hn5Var2 = g5kVar.a;
                        l13 l13Var = n7mVar.a;
                        j jVar = (j) ((o7m) l13Var.a.D(hag.I(o7m.class), l13Var, l13Var.b)).a(hn5Var2).a.getValue();
                        t tVar = jVar.a;
                        u uVar = jVar.b;
                        ((a) uVar.w).getClass();
                        bsd bsdVar = a.c;
                        d dVar = uVar.x;
                        s sVar = new s(bsdVar, dVar);
                        ((a) uVar.w).getClass();
                        y yVar = new y(sVar, (kotlinx.coroutines.a) bsdVar);
                        z zVar = (z) jVar.i.getValue();
                        b bVar = jVar.f;
                        com.yandex.plus.home.core.navigation.a aVar = (com.yandex.plus.home.core.navigation.a) ((jyr) bVar.e).getValue();
                        com.yandex.plus.home.core.navigation.b bVar2 = (com.yandex.plus.home.core.navigation.b) ((jyr) bVar.f).getValue();
                        com.yandex.plus.core.dispatcher.b bVar3 = uVar.w;
                        zVar.getClass();
                        aVar.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        com.yandex.passport.internal.entities.j jVar2 = new com.yandex.passport.internal.entities.j();
                        jVar2.a = zVar;
                        jVar2.b = aVar;
                        jVar2.c = bVar2;
                        jVar2.d = bVar3;
                        jVar2.e = dVar;
                        com.yandex.plus.core.imageloader.b bVar4 = uVar.e;
                        fkn fknVar = uVar.c;
                        l lVar = jVar.e;
                        g gVar = (g) lVar.i.getValue();
                        e eVar = (e) lVar.j.getValue();
                        f b = lVar.b();
                        com.yandex.plus.home.internal.di.d dVar2 = jVar.d;
                        return new d5k(hn5Var2, new z8f(bVar4, fknVar, gVar, eVar, b, jVar2, (c) dVar2.i.getValue(), (com.yandex.plus.home.feature.panel.internalapi.analytics.b) dVar2.n.getValue(), (com.yandex.plus.core.theme.e) jVar.j.getValue(), yVar, uVar.o, uVar.a(), new h(jVar, 2), uVar.w, dVar));
                    default:
                        g5k g5kVar2 = this.b;
                        d5k d5kVar = (d5k) g5kVar2.d.getValue();
                        String str2 = g5kVar2.b;
                        z8f z8fVar = d5kVar.b;
                        return new s5k(new com.yandex.plus.home.feature.panel.internal.f(com.yandex.plus.home.common.utils.a.m(d5kVar.a, ((com.yandex.plus.core.locale.a) z8fVar.k).a()), (com.yandex.plus.core.imageloader.b) z8fVar.a, (fkn) z8fVar.b, (com.yandex.plus.home.feature.panel.internalapi.analytics.b) z8fVar.h, (com.yandex.plus.core.theme.e) z8fVar.i, (y) z8fVar.j, ((c1) ((g0) z8fVar.l)).b(), (g) z8fVar.c, (e) z8fVar.d, (f) z8fVar.e, str2, (com.yandex.passport.internal.entities.j) z8fVar.f, (c) z8fVar.g, ((Boolean) ((h) z8fVar.m).invoke()).booleanValue(), (com.yandex.plus.core.dispatcher.b) z8fVar.n, (d) z8fVar.o));
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: f5k
            public final /* synthetic */ g5k b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        g5k g5kVar = this.b;
                        n7m n7mVar = (n7m) g5kVar.c.getValue();
                        hn5 hn5Var2 = g5kVar.a;
                        l13 l13Var = n7mVar.a;
                        j jVar = (j) ((o7m) l13Var.a.D(hag.I(o7m.class), l13Var, l13Var.b)).a(hn5Var2).a.getValue();
                        t tVar = jVar.a;
                        u uVar = jVar.b;
                        ((a) uVar.w).getClass();
                        bsd bsdVar = a.c;
                        d dVar = uVar.x;
                        s sVar = new s(bsdVar, dVar);
                        ((a) uVar.w).getClass();
                        y yVar = new y(sVar, (kotlinx.coroutines.a) bsdVar);
                        z zVar = (z) jVar.i.getValue();
                        b bVar = jVar.f;
                        com.yandex.plus.home.core.navigation.a aVar = (com.yandex.plus.home.core.navigation.a) ((jyr) bVar.e).getValue();
                        com.yandex.plus.home.core.navigation.b bVar2 = (com.yandex.plus.home.core.navigation.b) ((jyr) bVar.f).getValue();
                        com.yandex.plus.core.dispatcher.b bVar3 = uVar.w;
                        zVar.getClass();
                        aVar.getClass();
                        bVar2.getClass();
                        bVar3.getClass();
                        com.yandex.passport.internal.entities.j jVar2 = new com.yandex.passport.internal.entities.j();
                        jVar2.a = zVar;
                        jVar2.b = aVar;
                        jVar2.c = bVar2;
                        jVar2.d = bVar3;
                        jVar2.e = dVar;
                        com.yandex.plus.core.imageloader.b bVar4 = uVar.e;
                        fkn fknVar = uVar.c;
                        l lVar = jVar.e;
                        g gVar = (g) lVar.i.getValue();
                        e eVar = (e) lVar.j.getValue();
                        f b = lVar.b();
                        com.yandex.plus.home.internal.di.d dVar2 = jVar.d;
                        return new d5k(hn5Var2, new z8f(bVar4, fknVar, gVar, eVar, b, jVar2, (c) dVar2.i.getValue(), (com.yandex.plus.home.feature.panel.internalapi.analytics.b) dVar2.n.getValue(), (com.yandex.plus.core.theme.e) jVar.j.getValue(), yVar, uVar.o, uVar.a(), new h(jVar, 2), uVar.w, dVar));
                    default:
                        g5k g5kVar2 = this.b;
                        d5k d5kVar = (d5k) g5kVar2.d.getValue();
                        String str2 = g5kVar2.b;
                        z8f z8fVar = d5kVar.b;
                        return new s5k(new com.yandex.plus.home.feature.panel.internal.f(com.yandex.plus.home.common.utils.a.m(d5kVar.a, ((com.yandex.plus.core.locale.a) z8fVar.k).a()), (com.yandex.plus.core.imageloader.b) z8fVar.a, (fkn) z8fVar.b, (com.yandex.plus.home.feature.panel.internalapi.analytics.b) z8fVar.h, (com.yandex.plus.core.theme.e) z8fVar.i, (y) z8fVar.j, ((c1) ((g0) z8fVar.l)).b(), (g) z8fVar.c, (e) z8fVar.d, (f) z8fVar.e, str2, (com.yandex.passport.internal.entities.j) z8fVar.f, (c) z8fVar.g, ((Boolean) ((h) z8fVar.m).invoke()).booleanValue(), (com.yandex.plus.core.dispatcher.b) z8fVar.n, (d) z8fVar.o));
                }
            }
        });
    }

    public final void a() {
        xdr xdrVar = this.g;
        if (Intrinsics.d(xdrVar.getValue(), n5k.a)) {
            rar rarVar = this.f;
            if (rarVar != null) {
                rarVar.g(null);
            }
            xdrVar.getClass();
            xdrVar.m(null, p5k.a);
            this.f = ox6.B(((s5k) this.e.getValue()).b, wyf.F(this.a.getLifecycle()), new fmi(16, this));
        }
    }
}
