package defpackage;

import ru.yandex.taxi.preorder.map.model.RouteIconType;

/* loaded from: classes6.dex */
public final class t3l0 {
    public final bl00 a;
    public final gk00 b;
    public final boolean c;
    public final RouteIconType d;

    public t3l0(bl00 bl00Var, gk00 gk00Var, boolean z, RouteIconType routeIconType, int i) {
        bl00Var = (i & 1) != 0 ? null : bl00Var;
        gk00Var = (i & 2) != 0 ? null : gk00Var;
        z = (i & 4) != 0 ? false : z;
        routeIconType = (i & 8) != 0 ? RouteIconType.UNKNOWN : routeIconType;
        this.a = bl00Var;
        this.b = gk00Var;
        this.c = z;
        this.d = routeIconType;
    }

    public final boolean a() {
        return this.a == null && this.b == null;
    }

    public final boolean b() {
        return !a();
    }

    public t3l0() {
        this(null, null, false, null, 15);
    }
}
