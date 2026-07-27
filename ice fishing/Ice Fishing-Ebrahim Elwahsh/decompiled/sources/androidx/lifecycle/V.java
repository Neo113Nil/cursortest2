package androidx.lifecycle;

import h0.C4558d;

/* loaded from: classes.dex */
public interface V {
    default S a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default S b(Class cls, C4558d c4558d) {
        return a(cls);
    }
}
