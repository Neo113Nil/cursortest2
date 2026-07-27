package d0;

import L.C0051b;
import c0.AbstractActivityC0104f;
import e0.C0125a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1830a = new ArrayList();

    public C0119i(AbstractActivityC0104f abstractActivityC0104f, String[] strArr) {
        h0.d dVar = (h0.d) C0051b.C().f603h;
        if (dVar.f2325b) {
            return;
        }
        dVar.d(abstractActivityC0104f.getApplicationContext());
        dVar.a(abstractActivityC0104f.getApplicationContext(), strArr);
    }

    public final C0113c a(C0118h c0118h) {
        C0125a c0125a;
        C0113c c0113c;
        AbstractActivityC0104f abstractActivityC0104f = c0118h.f1824a;
        C0125a c0125a2 = c0118h.f1825b;
        String str = c0118h.f1826c;
        List<String> list = c0118h.f1827d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = c0118h.f1828e;
        boolean z3 = c0118h.f1829f;
        if (c0125a2 == null) {
            h0.d dVar = (h0.d) C0051b.C().f603h;
            if (!dVar.f2325b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0125a = new C0125a(dVar.f2328e.f2316b, "main");
        } else {
            c0125a = c0125a2;
        }
        ArrayList arrayList = this.f1830a;
        if (arrayList.size() == 0) {
            c0113c = new C0113c(abstractActivityC0104f, null, kVar, z2, z3);
            if (str != null) {
                c0113c.f1784i.f2686a.D("setInitialRoute", str, null);
            }
            c0113c.f1778c.a(c0125a, list);
        } else {
            C0113c c0113c2 = (C0113c) arrayList.get(0);
            if (!c0113c2.f1776a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = C0113c.f1774y;
            c0113c = new C0113c(abstractActivityC0104f, c0113c2.f1776a.spawn(c0125a.f1838c, c0125a.f1837b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(c0113c);
        c0113c.f1796v.add(new C0117g(this, c0113c));
        return c0113c;
    }
}
