package defpackage;

import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes6.dex */
public final class wit0 implements n5v0 {
    public final a a;
    public final atd0 b;
    public final i c;
    public final tit0 d;
    public final ir3 e;
    public final xwt f;

    public wit0(a aVar, atd0 atd0Var, i iVar, tit0 tit0Var, ir3 ir3Var, xwt xwtVar) {
        this.a = aVar;
        this.b = atd0Var;
        this.c = iVar;
        this.d = tit0Var;
        this.e = ir3Var;
        this.f = xwtVar;
    }

    public final void a(boolean z) {
        this.e.d();
        if (z) {
            this.f.c = true;
        }
    }

    public final void b(zzs zzsVar) {
        this.a.h = zzsVar;
        this.d.a = null;
    }

    public final void c(zzs zzsVar, String str, PositionInitAction positionInitAction) {
        a(false);
        b(zzsVar);
        atd0.b(this.b, zzsVar, RoutePointType.POINT_A, str, positionInitAction, Action.PIN_DROP);
    }
}
