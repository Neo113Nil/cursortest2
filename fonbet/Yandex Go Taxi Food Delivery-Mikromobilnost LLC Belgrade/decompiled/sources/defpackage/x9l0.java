package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.sourcedestination.PinType;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class x9l0 {
    public final SourcePicker a;
    public final PinType b;
    public final int c;
    public final String d;
    public final bj70 e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final RouteSelectorModalView.a l;
    public final boolean m;
    public final Double n;
    public final Runnable o;
    public final tls p;
    public final RouteSelectorOpenReason q;
    public final RouteSelectorOpenReason r;

    public x9l0(v9l0 v9l0Var) {
        this.a = v9l0Var.b;
        this.b = v9l0Var.c;
        this.c = v9l0Var.d;
        this.d = v9l0Var.e;
        this.e = v9l0Var.f;
        this.f = v9l0Var.g;
        this.i = v9l0Var.j;
        this.g = v9l0Var.k;
        this.j = v9l0Var.i;
        this.h = v9l0Var.h;
        this.l = v9l0Var.a;
        this.k = v9l0Var.l;
        this.m = v9l0Var.m;
        this.n = v9l0Var.n;
        this.q = v9l0Var.o;
        this.r = v9l0Var.p;
        this.o = v9l0Var.q;
        this.p = v9l0Var.r;
    }

    public final PointType a() {
        int i = w9l0.a[this.a.ordinal()];
        if (i == 1 || i == 2) {
            return PointType.SOURCE;
        }
        if (i == 3 || i == 4 || i == 5) {
            return PointType.DESTINATION;
        }
        return null;
    }

    public final boolean b() {
        return a() == PointType.SOURCE;
    }
}
