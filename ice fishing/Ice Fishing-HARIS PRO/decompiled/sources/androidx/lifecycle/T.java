package androidx.lifecycle;

import a.AbstractC0078a;
import c0.C0122c;

/* loaded from: classes.dex */
public interface T {
    default Q g(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Q m(D1.e eVar, C0122c c0122c) {
        return u(AbstractC0078a.F(eVar), c0122c);
    }

    default Q u(Class cls, C0122c c0122c) {
        return g(cls);
    }
}
