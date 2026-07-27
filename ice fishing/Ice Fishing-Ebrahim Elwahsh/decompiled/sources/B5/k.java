package B5;

import S0.s;
import g1.C4523c;
import g1.C4524d;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import l7.C4707a;
import n6.C4814a;
import o6.C4839a;

/* loaded from: classes2.dex */
public final class k extends j implements d {

    /* renamed from: e, reason: collision with root package name */
    public final f f350e;

    public k(f fVar, C4524d c4524d, C4523c c4523c) {
        super(c4524d, c4523c);
        this.f350e = fVar;
    }

    @Override // B5.j
    public final T6.d d(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        Logger logger = T6.d.f3120y;
        s sVar = new s(6, false);
        sVar.f2952u = C4814a.f39646b;
        C4707a d2 = K3.b.d(attributes);
        f fVar = this.f350e;
        String rootDir = fVar.getCrashStoragePath();
        long minFileAgeForReadMillis = fVar.getMinFileAgeForReadMillis();
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        C4839a c4839a = new C4839a(new S0.c(p8.g.g(rootDir, minFileAgeForReadMillis), C4839a.f39728u));
        Logger logger2 = X6.n.f3871x;
        ArrayList arrayList = new ArrayList();
        C4707a c4707a = C4707a.f39080c;
        ArrayList arrayList2 = new ArrayList();
        W6.e.h();
        String str = a7.d.f4412v;
        arrayList.add(new a7.e(c4839a).a());
        sVar.f2953v = new X6.n(d2, new D5.a(0), arrayList, new W6.h(arrayList2));
        return sVar.a();
    }
}
