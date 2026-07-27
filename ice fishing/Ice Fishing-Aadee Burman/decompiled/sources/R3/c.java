package R3;

import c4.InterfaceC0542a;
import java.util.Set;

/* loaded from: classes2.dex */
public interface c {
    default Object a(Class cls) {
        return d(r.a(cls));
    }

    default InterfaceC0542a b(Class cls) {
        return e(r.a(cls));
    }

    default Set c(r rVar) {
        return (Set) f(rVar).get();
    }

    default Object d(r rVar) {
        InterfaceC0542a e9 = e(rVar);
        if (e9 == null) {
            return null;
        }
        return e9.get();
    }

    InterfaceC0542a e(r rVar);

    InterfaceC0542a f(r rVar);
}
