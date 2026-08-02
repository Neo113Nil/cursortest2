package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes8.dex */
public final class s300 extends mx60 {
    public final h d;
    public final h3y e;
    public final ly01 f;
    public final ra00 g;
    public final NotificationStackComponent h;
    public final NotificationStackComponent i;
    public final a j;

    public s300(h hVar, h3y h3yVar, ly01 ly01Var, ra00 ra00Var, NotificationStackComponent notificationStackComponent, NotificationStackComponent notificationStackComponent2, a aVar) {
        super(false);
        this.d = hVar;
        this.e = h3yVar;
        this.f = ly01Var;
        this.g = ra00Var;
        this.h = notificationStackComponent;
        this.i = notificationStackComponent2;
        this.j = aVar;
    }

    @Override // defpackage.mx60
    public final void d() {
        h hVar = this.d;
        bf4 bf4Var = (bf4) kotlin.collections.a.b0(hVar.a);
        if ((bf4Var != null ? bf4Var.onBackPress() : false) || this.f.c() || this.i.onBackPressed() || this.h.onBackPressed()) {
            return;
        }
        f600 f600Var = (f600) this.e.get();
        if (f600Var.d() && f600Var.b() == 1.0f) {
            f600Var.f();
            return;
        }
        v40 a = ((ics) this.j.i).a();
        if (a instanceof df4 ? ((df4) a).onBackPressed() : false) {
            return;
        }
        bf4 bf4Var2 = (bf4) kotlin.collections.a.b0(hVar.b);
        if (bf4Var2 != null ? bf4Var2.onBackPress() : false) {
            return;
        }
        xby.y(jst.e, "GlobalMoveBack:Unhandled", null, new IllegalStateException(), "Unhandled move back detected! Navigation should be done with NavigationRouter API!", 2);
        this.g.a();
    }
}
