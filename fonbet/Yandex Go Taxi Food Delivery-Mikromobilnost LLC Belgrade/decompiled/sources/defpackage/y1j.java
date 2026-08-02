package defpackage;

import android.content.Context;
import com.yandex.go.navigation.modals.coroutines.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.altpins.walking_route.modal.WalkingRouteModalView;

/* loaded from: classes5.dex */
public final class y1j extends a {
    public final w030 F;
    public final Context G;
    public final q741 H;

    public y1j(w030 w030Var, Context context, q741 q741Var) {
        super(null);
        this.F = w030Var;
        this.G = context;
        this.H = q741Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        w1j w1jVar = (w1j) obj;
        String str = w1jVar.a;
        g741 g741Var = w1jVar.b;
        x1j x1jVar = new x1j(this);
        i02 i02Var = w1jVar.d;
        ki9 ki9Var = this.H.a;
        return new WalkingRouteModalView(this.G, new ru.yandex.taxi.altpins.walking_route.modal.a(str, g741Var, x1jVar, i02Var, (po21) ki9Var.a.get(), (ah00) ki9Var.b.get(), (y641) ki9Var.c.get(), (p2y0) ki9Var.d.get(), (com.yandex.go.taxi.order.provider.a) ki9Var.e.get()), w1jVar.c);
    }
}
