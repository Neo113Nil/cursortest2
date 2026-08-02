package defpackage;

import com.yandex.go.places.impl.navigation.common.base.d;
import com.yandex.go.places.impl.navigation.organization.card.a;
import com.yandex.go.tappable_poi.b;
import com.yandex.go.tappable_poi.tappable_favorite.TappableFavoriteController$attach$$inlined$safeCollectIn$1;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes14.dex */
public final class z9x0 implements y9x0 {
    public final b a;
    public final cax0 b;
    public final gax0 c;

    public z9x0(b bVar, cax0 cax0Var, gax0 gax0Var) {
        this.a = bVar;
        this.b = cax0Var;
        this.c = gax0Var;
    }

    public final void a(aax0 aax0Var) {
        this.a.a(aax0Var);
        cax0 cax0Var = this.b;
        cax0Var.d.a();
        cax0Var.e = aax0Var;
        tje.N(cax0Var.d, null, null, new TappableFavoriteController$attach$$inlined$safeCollectIn$1(cax0Var.a.h, null, cax0Var), 3);
    }

    public final void b() {
        b bVar = this.a;
        if (bVar.n == null) {
            bVar.j.b();
            gcc0 gcc0Var = (gcc0) bVar.e.get();
            String str = bVar.n;
            a aVar = ((jcc0) ((hcc0) gcc0Var).c.getValue()).J;
            if (aVar != null) {
                d dVar = aVar.a0().a;
                if (str != null) {
                    ti80 ti80Var = dVar.T;
                    qi80 qi80Var = ti80Var instanceof qi80 ? (qi80) ti80Var : null;
                    if (jl40.l(qi80Var != null ? qi80Var.a : null, str)) {
                        dVar.i();
                    }
                }
            }
            bVar.n = null;
            ((gh00) bVar.a).t(bVar);
            ((gh00) bVar.a).s(bVar);
            bVar.o = null;
            if (bVar.m) {
                ((e) bVar.g).c(5, "");
            }
            if (bVar.l != null && jl40.l((String) ((e) bVar.g).h.getValue(), bVar.l)) {
                ((e) bVar.g).b();
            }
            bVar.l = null;
        }
        cax0 cax0Var = this.b;
        cax0Var.d.b();
        cax0Var.e = null;
    }
}
