package defpackage;

import com.yandex.paymentsdk.opentelemetry.b;
import com.yandex.paymentsdk.opentelemetry.c;
import com.yandex.paymentsdk.opentelemetry.queue.a;
import com.yandex.xplat.common.NetworkMethod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class v870 implements u870 {
    public final b a;
    public final km0 b;
    public final hlt0 c;

    public v870(b bVar, km0 km0Var) {
        this.a = bVar;
        this.b = km0Var;
        c b = bVar.b("New Session Custom");
        b.g = System.currentTimeMillis() * 1000000;
        this.c = b.a();
    }

    @Override // defpackage.u870
    public final void a() {
        b bVar = this.a;
        com.yandex.paymentsdk.opentelemetry.queue.b bVar2 = bVar.e;
        if (bVar2.c) {
            try {
                bVar2.f.unregisterNetworkCallback(bVar2.g);
                bVar2.c = false;
            } catch (Exception unused) {
            }
        }
        a aVar = bVar.d;
        pzt0 pzt0Var = aVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.f = null;
    }

    @Override // defpackage.u870
    public final void b() {
        this.a.d.h = true;
    }

    @Override // defpackage.qgo
    public final void c(c9v c9vVar) {
        String str = (String) c9vVar.b;
        String d0 = evu0.d0(str, "EVENTUS_", str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.a().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        c b = this.a.b(d0);
        b.e = this.c.c;
        b.g = System.currentTimeMillis() * 1000000;
        for (Map.Entry entry2 : ((LinkedHashMap) c9vVar.c).entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue().toString());
        }
        b.f.putAll(linkedHashMap);
        b.a();
    }

    @Override // defpackage.vv50
    public final md51 d(hz50 hz50Var) {
        String c = hz50Var.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.a().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        c b = this.a.b(c);
        b.e = this.c.c;
        b.g = System.currentTimeMillis() * 1000000;
        b.f.putAll(linkedHashMap);
        hlt0 a = b.a();
        String str = a.b;
        String str2 = a.c;
        NetworkMethod method = hz50Var.method();
        String c2 = hz50Var.c();
        wj00 a2 = hz50Var.a();
        wj00 b2 = hz50Var.b();
        wj00 d = hz50Var.d();
        Pair pair = new Pair("traceparent", unr0.p("00-", str, "-", str2, "-01"));
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        d.k("X-Request-ID", UUID.randomUUID().toString());
        d.k(str3, str4);
        return zmx.d(new tsp0(method, c2, a2, b2, d, hz50Var.encoding()));
    }

    @Override // defpackage.u870
    public final void destroy() {
        b bVar = this.a;
        a aVar = bVar.d;
        pzt0 pzt0Var = aVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.f = null;
        aVar.c.clear();
        aVar.i = true;
        com.yandex.paymentsdk.opentelemetry.queue.b bVar2 = bVar.e;
        if (bVar2.c) {
            try {
                bVar2.f.unregisterNetworkCallback(bVar2.g);
                bVar2.c = false;
            } catch (Exception unused) {
            }
        }
        bVar2.d.clear();
    }

    @Override // defpackage.u870
    public final List e(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.b.a().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        c b = this.a.b(str);
        b.e = this.c.c;
        b.g = System.currentTimeMillis() * 1000000;
        b.f.putAll(linkedHashMap);
        hlt0 a = b.a();
        return scc.g(new Pair("traceparent", unr0.p("00-", a.b, "-", a.c, "-01")), new Pair("X-Request-ID", UUID.randomUUID().toString()));
    }
}
