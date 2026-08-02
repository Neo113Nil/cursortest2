package F5;

import a7.InterfaceC0450e;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import k1.C4639a;
import p7.C4853a;
import r6.C4910a;
import s6.C4976a;

/* loaded from: classes2.dex */
public final class k extends j implements d {

    /* renamed from: e, reason: collision with root package name */
    public final f f1005e;

    public k(f fVar, I0.j jVar, n4.c cVar) {
        super(jVar, cVar);
        this.f1005e = fVar;
    }

    @Override // F5.j
    public final X6.d d(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = X6.d.f3769y;
        S0.c cVar = new S0.c(6, false);
        cVar.f2902u = C4910a.f40221b;
        C4853a g9 = t8.g.g(attributes);
        f fVar = this.f1005e;
        String rootDir = fVar.getCrashStoragePath();
        long minFileAgeForReadMillis = fVar.getMinFileAgeForReadMillis();
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        C4976a c4976a = new C4976a(new C4639a(com.bumptech.glide.h.f(rootDir, minFileAgeForReadMillis), C4976a.f40543u));
        Logger logger2 = b7.n.f5606x;
        ArrayList arrayList = new ArrayList();
        C4853a c4853a = C4853a.f39847c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0450e.m();
        String str = e7.c.f37303v;
        arrayList.add(new e7.d(c4976a).a());
        cVar.f2903v = new b7.n(g9, new H5.a(0), arrayList, new a7.h(arrayList2));
        return cVar.d();
    }
}
