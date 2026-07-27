package O6;

import f6.C4512a;
import m6.l;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f2367c;

    public c(d dVar, int i) {
        this.f2367c = dVar;
        this.f2366b = i;
        long j6 = i;
        l lVar = dVar.f2375g;
        if (lVar == null || h.e(lVar)) {
            lVar = dVar.c().d(dVar.f2370b + ".exporter.seen").build();
            dVar.f2375g = lVar;
        }
        lVar.b(j6, dVar.f2372d);
    }

    @Override // O6.a
    public final void a(C4512a c4512a, String str) {
        int i = this.f2366b;
        d dVar = this.f2367c;
        if (str != null) {
            dVar.b().b(i, dVar.f2374f);
        } else {
            dVar.b().b(i, dVar.f2373e);
        }
    }
}
