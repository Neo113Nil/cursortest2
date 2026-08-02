package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.b;

@gsq0(with = w280.class)
/* loaded from: classes14.dex */
public final class v280 {
    public static final u280 Companion = new u280();
    public static final v280 b = new v280(b.f());
    public static final List c = scc.g("prepaid_time_ends_soon", "prepaid_time_ends_now");
    public final Map a;

    public v280(Map map) {
        this.a = map;
    }

    public final xh60 a() {
        return b("after_cancel_popup");
    }

    public final xh60 b(String str) {
        return (xh60) this.a.get(str);
    }
}
