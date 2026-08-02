package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import kotlin.collections.a;
import ru.yandex.taxi.appdelegates.SupportedOrderType;
import ru.yandex.taxi.map_common.map.MapViewInflateStrategy;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes9.dex */
public final class tt00 {
    public final h3y a;
    public final h3y b;
    public final h3y c;

    public tt00(h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
    }

    public final void a(MapViewInflateStrategy mapViewInflateStrategy) {
        int i = st00.a[mapViewInflateStrategy.ordinal()];
        h3y h3yVar = this.a;
        h3y h3yVar2 = this.c;
        if (i != 1) {
            if (i == 2) {
                ((p) h3yVar2.get()).b(mapViewInflateStrategy, "map screen opened");
                return;
            }
            if (i != 3) {
                w511.b();
                return;
            }
            ic00 ic00Var = ((kc00) ((jc00) h3yVar.get())).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                ((p) h3yVar2.get()).b(mapViewInflateStrategy, "on lcp");
                return;
            }
            return;
        }
        g gVar = (g) this.b.get();
        ic00 ic00Var2 = ((kc00) ((jc00) h3yVar.get())).a;
        ic00Var2.getClass();
        if (ic00Var2 instanceof hc00) {
            gVar.getClass();
            SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
            if (!gVar.b.r() && gVar.a().d.isEmpty() && !a.E(gVar.a().f)) {
                return;
            }
        }
        ((p) h3yVar2.get()).b(mapViewInflateStrategy, "active orders on create");
    }
}
