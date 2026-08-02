package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public interface kn5 {
    default Object b(Class cls) {
        return k(m5n.a(cls));
    }

    uzm f(m5n m5nVar);

    uzm j(m5n m5nVar);

    default Object k(m5n m5nVar) {
        uzm j = j(m5nVar);
        if (j == null) {
            return null;
        }
        return j.get();
    }

    default Set l(m5n m5nVar) {
        return (Set) f(m5nVar).get();
    }

    default uzm n(Class cls) {
        return j(m5n.a(cls));
    }

    owj r(m5n m5nVar);
}
