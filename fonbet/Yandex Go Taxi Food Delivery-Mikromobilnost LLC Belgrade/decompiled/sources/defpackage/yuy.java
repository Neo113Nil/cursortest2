package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes12.dex */
public final class yuy {
    public final ac20 a;
    public final czf0 b;

    public yuy(ac20 ac20Var, czf0 czf0Var) {
        this.a = ac20Var;
        this.b = czf0Var;
    }

    public final void a(long j) {
        this.b.getClass();
        czf0.a(j / 1000000, "Perf.LiteRt.FeatureLoad");
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("total_ns", Long.valueOf(j));
        ((q) this.a).d("Perf.LiteRt.FeatureLoad.Success", mapBuilder.j());
    }
}
