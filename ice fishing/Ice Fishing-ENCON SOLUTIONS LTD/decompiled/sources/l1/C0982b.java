package l1;

import t1.p;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0982b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8134a;

    public /* synthetic */ C0982b(int i2) {
        this.f8134a = i2;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f8134a) {
            case 0:
                String acc = (String) obj;
                g element = (g) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                i acc2 = (i) obj;
                g element2 = (g) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                i c2 = acc2.c(element2.getKey());
                j jVar = j.f8138a;
                if (c2 == jVar) {
                    return element2;
                }
                e eVar = e.f8137a;
                f fVar = (f) c2.m(eVar);
                if (fVar == null) {
                    cVar = new c(c2, element2);
                } else {
                    i c3 = c2.c(eVar);
                    if (c3 == jVar) {
                        return new c(element2, fVar);
                    }
                    cVar = new c(new c(c3, element2), fVar);
                }
                return cVar;
        }
    }
}
