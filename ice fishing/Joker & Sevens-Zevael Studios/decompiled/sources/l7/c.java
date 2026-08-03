package l7;

import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return b(r.a(cls));
    }

    default Object b(r rVar) {
        w7.a e10 = e(rVar);
        if (e10 == null) {
            return null;
        }
        return e10.get();
    }

    default w7.a d(Class cls) {
        return e(r.a(cls));
    }

    w7.a e(r rVar);

    w7.a f(r rVar);

    default Set h(r rVar) {
        return (Set) f(rVar).get();
    }
}
