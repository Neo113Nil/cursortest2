package F5;

import S0.s;
import a7.InterfaceC0446e;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import m1.C4726a;
import p7.C4853a;
import r6.C4960a;
import s6.C4977a;

/* loaded from: classes2.dex */
public final class k extends j implements d {

    /* renamed from: e, reason: collision with root package name */
    public final f f979e;

    public k(f fVar, C4522b c4522b, I0.j jVar) {
        super(c4522b, jVar);
        this.f979e = fVar;
    }

    @Override // F5.j
    public final X6.d d(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = X6.d.f3814y;
        s sVar = new s(5);
        sVar.f2840u = C4960a.f40382b;
        C4853a h9 = O3.b.h(attributes);
        f fVar = this.f979e;
        String rootDir = fVar.getCrashStoragePath();
        long minFileAgeForReadMillis = fVar.getMinFileAgeForReadMillis();
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        C4977a c4977a = new C4977a(new C4726a(A8.b.j(rootDir, minFileAgeForReadMillis), C4977a.f40486u));
        Logger logger2 = b7.o.f5458x;
        ArrayList arrayList = new ArrayList();
        C4853a c4853a = C4853a.f39797c;
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0446e.n();
        String str = e7.c.f37227v;
        arrayList.add(new e7.d(c4977a).a());
        sVar.f2841v = new b7.o(h9, new H5.a(0), arrayList, new a7.h(arrayList2));
        return sVar.i();
    }
}
