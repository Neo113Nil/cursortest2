package defpackage;

import com.yandex.plus.home.b;
import com.yandex.plus.home.plaque.feature.api.a;
import com.yandex.plus.home.plaque.plugin.internal.proxy.h;
import com.yandex.plus.home.plaque.plugin.internal.proxy.i;
import com.yandex.plus.home.r;
import com.yandex.plus.home.t;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class g9m extends bfu {
    public final jyr k;
    public final jyr l;
    public final xdr m;
    public final jyr n;

    public g9m(y8m y8mVar) {
        y8mVar.getClass();
        this.k = btf.b(new ril(18, y8mVar));
        final int i = 0;
        this.l = btf.b(new Function0(this) { // from class: e9m
            public final /* synthetic */ g9m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                b b;
                switch (i) {
                    case 0:
                        l13 l13Var = ((l7m) this.b.k.getValue()).a;
                        t tVar = (t) l13Var.a.D(hag.I(t.class), l13Var, l13Var.b);
                        synchronized (tVar) {
                            b = tVar.b(i.class);
                        }
                        if (b != null) {
                            return new ysk((i) b);
                        }
                        jj4.h(i.class, " is absent! You must install plugin before using it!", "Plugin ");
                        return null;
                    default:
                        g9m g9mVar = this.b;
                        return lg3.u0(new h0m((pjc) ((ysk) g9mVar.l.getValue()).d.getValue(), 6), ot0.F(g9mVar), c9m.a);
                }
            }
        });
        xdr a = ydr.a(Boolean.TRUE);
        this.m = a;
        ox6.B(new u21(10, a, y8mVar.b, new ib3(3, 9, null)), ot0.F(this), new gfl(9, this));
        final int i2 = 1;
        this.n = btf.b(new Function0(this) { // from class: e9m
            public final /* synthetic */ g9m b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                b b;
                switch (i2) {
                    case 0:
                        l13 l13Var = ((l7m) this.b.k.getValue()).a;
                        t tVar = (t) l13Var.a.D(hag.I(t.class), l13Var, l13Var.b);
                        synchronized (tVar) {
                            b = tVar.b(i.class);
                        }
                        if (b != null) {
                            return new ysk((i) b);
                        }
                        jj4.h(i.class, " is absent! You must install plugin before using it!", "Plugin ");
                        return null;
                    default:
                        g9m g9mVar = this.b;
                        return lg3.u0(new h0m((pjc) ((ysk) g9mVar.l.getValue()).d.getValue(), 6), ot0.F(g9mVar), c9m.a);
                }
            }
        });
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        ce5 ce5Var = ((h) ((ysk) this.l.getValue()).b.getValue()).a;
        ((a) ce5Var.i).b((com.yandex.plus.home.plaque.feature.internal.a) ce5Var.o);
        r rVar = (r) ce5Var.j;
        com.yandex.plus.home.plaque.feature.internal.b bVar = (com.yandex.plus.home.plaque.feature.internal.b) ce5Var.p;
        bVar.getClass();
        ((HashSet) rVar.b).remove(bVar);
        com.yandex.plus.home.plaque.feature.internal.presentation.h hVar = (com.yandex.plus.home.plaque.feature.internal.presentation.h) ((jyr) ce5Var.a).getValue();
        com.yandex.plus.log.api.b bVar2 = hVar.g;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "PlaqueViewModel", "onCleared()");
        }
        gld.L(hVar.n, null);
        super.onCleared();
    }
}
