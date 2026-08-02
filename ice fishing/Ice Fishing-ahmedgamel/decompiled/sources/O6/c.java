package O6;

import f6.C4522a;
import m6.l;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f2298c;

    public c(d dVar, int i) {
        this.f2298c = dVar;
        this.f2297b = i;
        long j6 = i;
        l lVar = dVar.f2306g;
        if (lVar == null || h.e(lVar)) {
            lVar = dVar.c().d(dVar.f2301b + ".exporter.seen").mo53build();
            dVar.f2306g = lVar;
        }
        lVar.b(j6, dVar.f2303d);
    }

    @Override // O6.a
    public final void a(C4522a c4522a, String str) {
        int i = this.f2297b;
        d dVar = this.f2298c;
        if (str != null) {
            dVar.b().b(i, dVar.f2305f);
        } else {
            dVar.b().b(i, dVar.f2304e);
        }
    }
}
