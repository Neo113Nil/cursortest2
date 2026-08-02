package defpackage;

import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.home.plaque.feature.api.a;
import com.yandex.plus.home.plaque.feature.internal.e;
import com.yandex.plus.home.plaque.plugin.internal.defaults.f;
import com.yandex.plus.home.plaque.plugin.internal.proxy.h;
import com.yandex.plus.home.plaque.plugin.internal.proxy.i;
import com.yandex.plus.home.r;
import com.yandex.plus.log.api.b;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ysk {
    public final i a;
    public final jyr b;
    public final jyr c = btf.b(new aok(4));
    public final jyr d;

    public ysk(i iVar) {
        this.a = iVar;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: wsk
            public final /* synthetic */ ysk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i iVar2 = this.b.a;
                        tqn tqnVar = new tqn();
                        e eVar = (e) iVar2.a.getValue();
                        a aVar = tqnVar.a ? new com.yandex.plus.home.plaque.plugin.internal.defaults.a() : new f();
                        r rVar = new r();
                        eVar.getClass();
                        b bVar = eVar.f;
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "PlaqueFeatureImpl", "createPlaqueComponent()");
                        }
                        eVar.a(false);
                        r rVar2 = eVar.a;
                        p pVar = eVar.j;
                        y yVar = new y(eVar.c, bVar);
                        com.yandex.plus.home.plaque.repository.api.a aVar3 = eVar.b;
                        ((com.yandex.plus.core.dispatcher.a) eVar.h).getClass();
                        return new h(new ce5(rVar2, pVar, yVar, new y(aVar3, (kotlinx.coroutines.a) com.yandex.plus.core.dispatcher.a.f), new com.yandex.plus.bdui.flex.factory.e(bVar, 5), eVar.d, eVar.e, aVar, rVar, eVar.i, bVar, eVar.g, eVar.h));
                    default:
                        com.yandex.plus.home.plaque.feature.internal.presentation.h hVar = (com.yandex.plus.home.plaque.feature.internal.presentation.h) ((jyr) ((h) this.b.b.getValue()).a.a).getValue();
                        return new kvh(zsd.k0(zsd.b0(new com.yandex.plus.home.graphql.plusstate.e(hVar.k, 4)), hVar.i), 24);
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: wsk
            public final /* synthetic */ ysk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i iVar2 = this.b.a;
                        tqn tqnVar = new tqn();
                        e eVar = (e) iVar2.a.getValue();
                        a aVar = tqnVar.a ? new com.yandex.plus.home.plaque.plugin.internal.defaults.a() : new f();
                        r rVar = new r();
                        eVar.getClass();
                        b bVar = eVar.f;
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "PlaqueFeatureImpl", "createPlaqueComponent()");
                        }
                        eVar.a(false);
                        r rVar2 = eVar.a;
                        p pVar = eVar.j;
                        y yVar = new y(eVar.c, bVar);
                        com.yandex.plus.home.plaque.repository.api.a aVar3 = eVar.b;
                        ((com.yandex.plus.core.dispatcher.a) eVar.h).getClass();
                        return new h(new ce5(rVar2, pVar, yVar, new y(aVar3, (kotlinx.coroutines.a) com.yandex.plus.core.dispatcher.a.f), new com.yandex.plus.bdui.flex.factory.e(bVar, 5), eVar.d, eVar.e, aVar, rVar, eVar.i, bVar, eVar.g, eVar.h));
                    default:
                        com.yandex.plus.home.plaque.feature.internal.presentation.h hVar = (com.yandex.plus.home.plaque.feature.internal.presentation.h) ((jyr) ((h) this.b.b.getValue()).a.a).getValue();
                        return new kvh(zsd.k0(zsd.b0(new com.yandex.plus.home.graphql.plusstate.e(hVar.k, 4)), hVar.i), 24);
                }
            }
        });
    }
}
