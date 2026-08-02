package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class uva0 implements uyi0, gdr {
    public final z22 a;
    public final yi10 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final AtomicReference d = new AtomicReference(null);

    public uva0(z22 z22Var, yi10 yi10Var) {
        this.a = z22Var;
        this.b = yi10Var;
    }

    public final void a(String str, String str2, String str3, long j, Integer num) {
        this.c.computeIfPresent(str3, new pw7(12, new g990(7)));
        this.d.getAndUpdate(new vp7(5));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.i(new Pair("endpoint_method", str2), new Pair("endpoint_path", str3), new Pair("endpoint_timeout_seconds", String.valueOf(j / 1000))));
        linkedHashMap.put("error_message", str);
        if (num != null) {
            linkedHashMap.put("status_code", num.toString());
        }
        ((a) this.a).a(new ez50("network_error", linkedHashMap));
    }

    public final void b(long j, long j2, String str) {
        this.c.computeIfPresent(str, new pw7(11, new ot6(j, 5)));
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("duration_ms", String.valueOf(j));
        mapBuilder.put(StateEntry.COLUMN_PATH, str);
        mapBuilder.put("size_bytes", String.valueOf(j2));
        ((a) this.a).a(new vva0("performance_screen_decoding_completed", mapBuilder.j()));
        d(str);
    }

    public final void c(long j, String str) {
        this.c.compute(str, new pw7(9, new ot6(j, 3)));
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("duration_ms", String.valueOf(j));
        mapBuilder.put(StateEntry.COLUMN_PATH, str);
        ((a) this.a).a(new vva0("performance_screen_rendering_completed", mapBuilder.j()));
        d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.c.computeIfPresent(str, new pw7(7, new sc20(29, ref$ObjectRef)));
        rva0 rva0Var = (rva0) ref$ObjectRef.element;
        if (rva0Var != null) {
            long j = rva0Var.e;
            Long l = rva0Var.c;
            Long l2 = rva0Var.b;
            Long l3 = rva0Var.d;
            Long l4 = rva0Var.a;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("duration_ms", String.valueOf(j));
            mapBuilder.put(StateEntry.COLUMN_PATH, str);
            if (l != null) {
            }
            if (l2 != null) {
            }
            if (l3 != null) {
            }
            if (l4 != null) {
                mapBuilder.put("decoding_duration_ms", String.valueOf(l4.longValue()));
            }
            ((a) this.a).a(new vva0("performance_screen_fully_loaded", mapBuilder.j()));
            this.b.a("screen_fully_loaded", str);
        }
    }
}
