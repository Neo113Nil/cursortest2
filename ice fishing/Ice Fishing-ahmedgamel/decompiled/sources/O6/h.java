package O6;

import D.y;
import a7.i;
import a7.k;
import d1.C4445c;
import f6.C4512a;
import java.util.concurrent.atomic.AtomicInteger;
import m6.j;
import m6.l;
import m6.o;
import m6.q;
import m6.s;

/* loaded from: classes2.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final H5.a f2381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2382b;

    /* renamed from: c, reason: collision with root package name */
    public final k f2383c;

    /* renamed from: d, reason: collision with root package name */
    public final C4512a f2384d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f2385e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f2386f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f2387g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile C4512a f2388h = null;

    public h(H5.a aVar, int i, k kVar, C4512a c4512a) {
        this.f2381a = aVar;
        this.f2383c = kVar;
        this.f2382b = i;
        this.f2384d = c4512a;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // O6.b
    public final a a(int i) {
        return new g(this, i);
    }

    public final f6.c b() {
        C4512a c4512a = this.f2388h;
        if (c4512a != null) {
            return c4512a;
        }
        C4445c c4445c = new C4445c();
        c4445c.f(i.f4366a, this.f2383c.f4377a);
        k6.e eVar = i.f4367b;
        k kVar = this.f2383c;
        if (kVar.f4378b == null) {
            synchronized (kVar) {
                try {
                    if (kVar.f4378b == null) {
                        kVar.f4378b = kVar.f4377a + "/" + ((AtomicInteger) k.f4376d.computeIfAbsent(kVar.f4377a, new K6.b(16))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        c4445c.f(eVar, kVar.f4378b);
        c4445c.g(this.f2384d);
        C4512a d2 = c4445c.d();
        this.f2388h = d2;
        return d2;
    }

    public final f6.c c(C4512a c4512a, String str) {
        f6.c b9 = b();
        boolean z3 = (str == null || str.isEmpty()) ? false : true;
        if (!z3 && c4512a.isEmpty()) {
            return b9;
        }
        C4445c d2 = ((C4512a) b9).d();
        if (z3) {
            d2.f(i.f4368c, str);
        }
        d2.g(c4512a);
        return d2.d();
    }

    public final o d() {
        o oVar = this.f2385e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String e9 = y.e(this.f2382b);
        o build = f().a(y.c(this.f2382b).concat(".inflight")).e("{" + e9 + "}").d("The number of " + e9 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").build();
        this.f2385e = build;
        return build;
    }

    public final q f() {
        s sVar = (s) this.f2381a.get();
        if (sVar == null) {
            sVar = m6.h.f39314n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f2383c.f4377a).mo5build();
    }
}
