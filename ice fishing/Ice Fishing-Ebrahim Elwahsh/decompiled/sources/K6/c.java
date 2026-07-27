package K6;

import b6.C0530a;
import i6.l;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1645c;

    public c(d dVar, int i) {
        this.f1645c = dVar;
        this.f1644b = i;
        long j9 = i;
        l lVar = dVar.f1653g;
        if (lVar == null || h.e(lVar)) {
            lVar = dVar.c().d(dVar.f1648b + ".exporter.seen").build();
            dVar.f1653g = lVar;
        }
        lVar.e(j9, dVar.f1650d);
    }

    @Override // K6.a
    public final void a(C0530a c0530a, String str) {
        int i = this.f1644b;
        d dVar = this.f1645c;
        if (str != null) {
            dVar.b().e(i, dVar.f1652f);
        } else {
            dVar.b().e(i, dVar.f1651e);
        }
    }
}
