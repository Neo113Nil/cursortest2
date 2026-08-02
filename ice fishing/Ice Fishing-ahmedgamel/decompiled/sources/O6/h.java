package O6;

import D.x;
import a7.i;
import a7.k;
import f6.C4522a;
import java.util.concurrent.atomic.AtomicInteger;
import m6.j;
import m6.l;
import m6.o;
import m6.q;
import m6.s;

/* loaded from: classes2.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f2312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2313b;

    /* renamed from: c, reason: collision with root package name */
    public final k f2314c;

    /* renamed from: d, reason: collision with root package name */
    public final C4522a f2315d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f2316e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f2317f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f2318g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile C4522a f2319h = null;

    public h(H5.a aVar, int i, k kVar, C4522a c4522a) {
        this.f2312a = aVar;
        this.f2314c = kVar;
        this.f2313b = i;
        this.f2315d = c4522a;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // O6.b
    public final a a(int i) {
        return new g(this, i);
    }

    public final f6.c b() {
        C4522a c4522a = this.f2319h;
        if (c4522a != null) {
            return c4522a;
        }
        K1.c cVar = new K1.c(1);
        cVar.c(i.f4334a, this.f2314c.f4345a);
        k6.e eVar = i.f4335b;
        k kVar = this.f2314c;
        if (kVar.f4346b == null) {
            synchronized (kVar) {
                try {
                    if (kVar.f4346b == null) {
                        kVar.f4346b = kVar.f4345a + "/" + ((AtomicInteger) k.f4344d.computeIfAbsent(kVar.f4345a, new K6.b(16))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        cVar.c(eVar, kVar.f4346b);
        cVar.d(this.f2315d);
        C4522a a9 = cVar.a();
        this.f2319h = a9;
        return a9;
    }

    public final f6.c c(C4522a c4522a, String str) {
        f6.c b9 = b();
        boolean z6 = (str == null || str.isEmpty()) ? false : true;
        if (!z6 && c4522a.isEmpty()) {
            return b9;
        }
        K1.c d9 = ((C4522a) b9).d();
        if (z6) {
            d9.c(i.f4336c, str);
        }
        d9.d(c4522a);
        return d9.a();
    }

    public final o d() {
        o oVar = this.f2316e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String e9 = x.e(this.f2313b);
        o build = f().a(x.c(this.f2313b).concat(".inflight")).e("{" + e9 + "}").d("The number of " + e9 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").build();
        this.f2316e = build;
        return build;
    }

    public final q f() {
        s sVar = (s) this.f2312a.get();
        if (sVar == null) {
            sVar = m6.h.f39473n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f2314c.f4345a).mo56build();
    }
}
