package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.dqe0;
import defpackage.ftx;
import defpackage.h3y;
import defpackage.jjt0;
import defpackage.nzb0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.wb1;
import java.util.function.Consumer;
import ru.yandex.taxi.preorder.source.domain.v;

/* loaded from: classes6.dex */
public final class v {
    public final dqe0 a;
    public final wb1 b;
    public final ftx c;
    public final w d;
    public final jjt0 e;
    public final h3y f;
    public final com.yandex.go.preorder.address.a g;

    public v(dqe0 dqe0Var, wb1 wb1Var, ftx ftxVar, w wVar, jjt0 jjt0Var, h3y h3yVar, com.yandex.go.preorder.address.a aVar) {
        this.a = dqe0Var;
        this.b = wb1Var;
        this.c = ftxVar;
        this.d = wVar;
        this.e = jjt0Var;
        this.f = h3yVar;
        this.g = aVar;
    }

    public final void a(pv0 pv0Var) {
        final int i = 0;
        Consumer consumer = new Consumer(this) { // from class: ijt0
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i2 = i;
                v vVar = this.b;
                switch (i2) {
                    case 0:
                        vVar.e.b((Zone) obj, null);
                        vVar.b.i();
                        break;
                    default:
                        vVar.g.b((Throwable) obj, true);
                        break;
                }
            }
        };
        final int i2 = 1;
        Consumer consumer2 = new Consumer(this) { // from class: ijt0
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i22 = i2;
                v vVar = this.b;
                switch (i22) {
                    case 0:
                        vVar.e.b((Zone) obj, null);
                        vVar.b.i();
                        break;
                    default:
                        vVar.g.b((Throwable) obj, true);
                        break;
                }
            }
        };
        w wVar = this.d;
        pzt0 pzt0Var = wVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        nzb0 nzb0Var = wVar.a;
        wVar.g = com.yandex.go.coroutines.b.g(nzb0Var.a, null, null, new SourcePointZoneRequestInteractor$requestZone$1(wVar, pv0Var, consumer, consumer2, null), 3);
    }
}
