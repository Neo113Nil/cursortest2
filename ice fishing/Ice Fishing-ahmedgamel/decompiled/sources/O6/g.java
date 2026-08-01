package O6;

import D.y;
import f6.C4512a;
import java.util.Collections;
import java.util.List;
import m6.j;
import m6.k;
import m6.l;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2378b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2379c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f2380d;

    public g(h hVar, int i) {
        this.f2380d = hVar;
        this.f2378b = i;
        hVar.d().b(i, hVar.b());
    }

    @Override // O6.a
    public final void a(C4512a c4512a, String str) {
        h hVar = this.f2380d;
        hVar.d().b(-this.f2378b, hVar.b());
        h hVar2 = this.f2380d;
        long j6 = this.f2378b;
        l lVar = hVar2.f2386f;
        if (lVar == null || h.e(lVar)) {
            String e9 = y.e(hVar2.f2382b);
            lVar = hVar2.f().d(y.c(hVar2.f2382b).concat(".exported")).e("{" + e9 + "}").d("The number of " + e9 + "s for which the export has finished, either successful or failed").build();
            hVar2.f2386f = lVar;
        }
        lVar.b(j6, hVar2.c(C4512a.f37513w, str));
        long nanoTime = System.nanoTime() - this.f2379c;
        h hVar3 = this.f2380d;
        double d2 = nanoTime / 1.0E9d;
        j jVar = hVar3.f2387g;
        if (jVar == null || h.e(jVar)) {
            k a9 = hVar3.f().c("otel.sdk.exporter.operation.duration").c().a();
            List list = Collections.EMPTY_LIST;
            jVar = a9.k().build();
            hVar3.f2387g = jVar;
        }
        jVar.f(d2, hVar3.c(c4512a, str));
    }
}
