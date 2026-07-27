package d0;

import L.C0026b;
import c0.AbstractActivityC0104f;
import e0.C0125a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1838a = new ArrayList();

    public C0119i(AbstractActivityC0104f abstractActivityC0104f, String[] strArr) {
        h0.d dVar = (h0.d) C0026b.C().f525g;
        if (dVar.f2333b) {
            return;
        }
        dVar.d(abstractActivityC0104f.getApplicationContext());
        dVar.a(abstractActivityC0104f.getApplicationContext(), strArr);
    }

    public final C0113c a(C0118h c0118h) {
        C0125a c0125a;
        C0113c c0113c;
        AbstractActivityC0104f abstractActivityC0104f = c0118h.f1832a;
        C0125a c0125a2 = c0118h.f1833b;
        String str = c0118h.f1834c;
        List<String> list = c0118h.f1835d;
        io.flutter.plugin.platform.k kVar = new io.flutter.plugin.platform.k();
        boolean z2 = c0118h.f1836e;
        boolean z3 = c0118h.f1837f;
        if (c0125a2 == null) {
            h0.d dVar = (h0.d) C0026b.C().f525g;
            if (!dVar.f2333b) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            c0125a = new C0125a(dVar.f2336e.f2324b, "main");
        } else {
            c0125a = c0125a2;
        }
        ArrayList arrayList = this.f1838a;
        if (arrayList.size() == 0) {
            c0113c = new C0113c(abstractActivityC0104f, null, kVar, z2, z3);
            if (str != null) {
                c0113c.f1792i.f2694a.D("setInitialRoute", str, null);
            }
            c0113c.f1786c.a(c0125a, list);
        } else {
            C0113c c0113c2 = (C0113c) arrayList.get(0);
            if (!c0113c2.f1784a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j2 = C0113c.f1782y;
            c0113c = new C0113c(abstractActivityC0104f, c0113c2.f1784a.spawn(c0125a.f1846c, c0125a.f1845b, str, list, j2), kVar, z2, z3);
        }
        arrayList.add(c0113c);
        c0113c.f1804v.add(new C0117g(this, c0113c));
        return c0113c;
    }
}
