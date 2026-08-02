package O6;

import D.x;
import f6.C4522a;
import java.util.Collections;
import java.util.List;
import m6.j;
import m6.k;
import m6.l;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2309b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2310c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f2311d;

    public g(h hVar, int i) {
        this.f2311d = hVar;
        this.f2309b = i;
        hVar.d().b(i, hVar.b());
    }

    @Override // O6.a
    public final void a(C4522a c4522a, String str) {
        h hVar = this.f2311d;
        hVar.d().b(-this.f2309b, hVar.b());
        h hVar2 = this.f2311d;
        long j6 = this.f2309b;
        l lVar = hVar2.f2317f;
        if (lVar == null || h.e(lVar)) {
            String e9 = x.e(hVar2.f2313b);
            lVar = hVar2.f().d(x.c(hVar2.f2313b).concat(".exported")).e("{" + e9 + "}").d("The number of " + e9 + "s for which the export has finished, either successful or failed").mo53build();
            hVar2.f2317f = lVar;
        }
        lVar.b(j6, hVar2.c(C4522a.f37475w, str));
        long nanoTime = System.nanoTime() - this.f2310c;
        h hVar3 = this.f2311d;
        double d9 = nanoTime / 1.0E9d;
        j jVar = hVar3.f2318g;
        if (jVar == null || h.e(jVar)) {
            k a9 = hVar3.f().c("otel.sdk.exporter.operation.duration").c().a();
            List list = Collections.EMPTY_LIST;
            jVar = a9.g().build();
            hVar3.f2318g = jVar;
        }
        jVar.f(d9, hVar3.c(c4522a, str));
    }
}
