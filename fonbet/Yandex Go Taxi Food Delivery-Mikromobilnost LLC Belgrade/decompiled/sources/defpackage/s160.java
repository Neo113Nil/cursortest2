package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class s160 extends bgo {
    public final uva0 m;
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public s160(uva0 uva0Var) {
        this.m = uva0Var;
    }

    @Override // defpackage.bgo
    public final void callFailed(yf7 yf7Var, IOException iOException) {
        d5j0 k = yf7Var.k();
        String p0 = evu0.p0(k.a.b(), '/');
        this.n.remove(p0);
        this.o.remove(p0);
        uva0 uva0Var = this.m;
        if (uva0Var != null) {
            String localizedMessage = iOException.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = iOException.getClass().getSimpleName();
            }
            uva0Var.a(localizedMessage, k.b, p0, yf7Var.timeout().h() / 1000000, null);
        }
    }

    @Override // defpackage.bgo
    public final void callStart(yf7 yf7Var) {
        String p0 = evu0.p0(yf7Var.k().a.b(), '/');
        this.n.put(p0, Long.valueOf(System.nanoTime()));
        uva0 uva0Var = this.m;
        if (uva0Var != null) {
            ((a) uva0Var.a).a(new ez50("perform_request", b.i(new Pair("endpoint_method", yf7Var.k().b), new Pair("endpoint_path", p0), new Pair("endpoint_timeout_seconds", String.valueOf((yf7Var.timeout().h() / 1000000) / 1000)))));
            uva0Var.c.compute(p0, new pw7(8, new g990(6)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bgo
    public final void responseBodyEnd(yf7 yf7Var, long j) {
        uva0 uva0Var;
        d5j0 k = yf7Var.k();
        String p0 = evu0.p0(yf7Var.k().a.b(), '/');
        Long l = (Long) this.n.remove(p0);
        if (l != null) {
            long longValue = l.longValue();
            Boolean bool = (Boolean) this.o.remove(p0);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            long nanoTime = (System.nanoTime() - longValue) / 1000000;
            if (!booleanValue || (uva0Var = this.m) == null) {
                return;
            }
            String str = k.b;
            long h = yf7Var.timeout().h() / 1000000;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            uva0Var.c.computeIfPresent(p0, new pw7(5, new eye(nanoTime, ref$ObjectRef, 2)));
            z22 z22Var = uva0Var.a;
            Long l2 = (Long) ref$ObjectRef.element;
            Map i = b.i(new Pair("endpoint_method", str), new Pair("endpoint_path", p0), new Pair("endpoint_timeout_seconds", String.valueOf(h / 1000)));
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("duration_ms", String.valueOf(nanoTime));
            mapBuilder.put("size_bytes", String.valueOf(j));
            if (l2 != null) {
                mapBuilder.put("first_byte_duration_ms", String.valueOf(l2.longValue()));
            }
            ((a) z22Var).a(new ez50("perform_request_success", b.n(i, mapBuilder.j())));
            uva0Var.d(p0);
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersEnd(yf7 yf7Var, kvj0 kvj0Var) {
        int i = kvj0Var.w;
        d5j0 k = yf7Var.k();
        String p0 = evu0.p0(k.a.b(), '/');
        boolean z = kvj0Var.J;
        ConcurrentHashMap concurrentHashMap = this.o;
        if (z) {
            concurrentHashMap.put(p0, Boolean.TRUE);
            return;
        }
        concurrentHashMap.remove(p0);
        uva0 uva0Var = this.m;
        if (uva0Var != null) {
            uva0Var.a(oyr.k(i, "HTTP ", " ", kvj0Var.c), k.b, p0, yf7Var.timeout().h() / 1000000, Integer.valueOf(i));
        }
    }

    @Override // defpackage.bgo
    public final void responseHeadersStart(yf7 yf7Var) {
        String p0 = evu0.p0(yf7Var.k().a.b(), '/');
        Long l = (Long) this.n.get(p0);
        if (l != null) {
            long nanoTime = (System.nanoTime() - l.longValue()) / 1000000;
            uva0 uva0Var = this.m;
            if (uva0Var != null) {
                uva0Var.c.computeIfPresent(p0, new pw7(10, new ot6(nanoTime, 4)));
                z22 z22Var = uva0Var.a;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("duration_ms", String.valueOf(nanoTime));
                mapBuilder.put(StateEntry.COLUMN_PATH, p0);
                ((a) z22Var).a(new vva0("performance_first_byte_received", mapBuilder.j()));
            }
        }
    }
}
