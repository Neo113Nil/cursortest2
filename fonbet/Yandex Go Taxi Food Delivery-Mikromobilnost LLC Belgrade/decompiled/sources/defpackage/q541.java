package defpackage;

import com.yandex.go.walking.navigation.impl.navigation_core.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class q541 {
    public final tse a;
    public final y141 b;
    public final b c;
    public final cne0 d;
    public double e;
    public double f;
    public final r0 g;
    public final gci0 h;

    public q541(tse tseVar, y141 y141Var, b bVar, dne0 dne0Var) {
        this.a = tseVar;
        this.b = y141Var;
        this.c = bVar;
        cne0 a = dne0Var.a("walk_nav_route_passed_distance");
        this.d = a;
        r0 c = bvf0.c(Double.valueOf(Double.longBitsToDouble(a.j("passed_distance", 0L))));
        this.g = c;
        this.h = e.d(c);
    }
}
