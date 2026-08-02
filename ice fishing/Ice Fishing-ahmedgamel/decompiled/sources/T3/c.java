package T3;

import e4.InterfaceC4481a;
import java.util.Set;

/* loaded from: classes2.dex */
public interface c {
    default Object a(Class cls) {
        return b(r.a(cls));
    }

    default Object b(r rVar) {
        InterfaceC4481a c9 = c(rVar);
        if (c9 == null) {
            return null;
        }
        return c9.get();
    }

    InterfaceC4481a c(r rVar);

    InterfaceC4481a d(r rVar);

    default InterfaceC4481a e(Class cls) {
        return c(r.a(cls));
    }

    default Set f(r rVar) {
        return (Set) d(rVar).get();
    }
}
