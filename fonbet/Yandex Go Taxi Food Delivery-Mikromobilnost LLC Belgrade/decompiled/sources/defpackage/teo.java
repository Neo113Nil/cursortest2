package defpackage;

import com.yandex.plus.core.benchmark.b;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes8.dex */
public final class teo extends yx4 implements djt {
    public static final i3y d = a.a(new fsn(5));
    public final b3u0 b;
    public volatile sls c;

    public teo(b3u0 b3u0Var) {
        super(reo.class);
        this.b = b3u0Var;
        this.c = new fsn(4);
    }

    @Override // defpackage.djt
    public final void a(d9 d9Var) {
        this.c = d9Var;
    }

    @Override // defpackage.yx4
    public final void c(ll5 ll5Var, pl5 pl5Var, Map map) {
        b3u0 b3u0Var = this.b;
        StringBuilder sb = new StringBuilder("Perf.");
        sb.append(((reo) pl5Var).a);
        sb.append('.');
        sb.append(((b) ll5Var).a);
        String sb2 = sb.toString();
        Map map2 = (Map) this.c.invoke();
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        b3u0Var.reportStatboxEvent(sb2, kotlin.collections.b.n(kotlin.collections.b.n(gw00.e(new Pair("duration", Double.valueOf(r6.a() / ((Number) d.getValue()).longValue()))), map2), map));
    }
}
