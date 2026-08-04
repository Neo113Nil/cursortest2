package com.gamericefishpro.space.bb;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default Object b(Class cls) {
        return f(v.a(cls));
    }

    com.gamericefishpro.space.nb.a d(v vVar);

    default com.gamericefishpro.space.nb.a e(Class cls) {
        return d(v.a(cls));
    }

    default Object f(v vVar) {
        com.gamericefishpro.space.nb.a aVarD = d(vVar);
        if (aVarD == null) {
            return null;
        }
        return aVarD.get();
    }

    com.gamericefishpro.space.nb.a g(v vVar);

    default Set h(v vVar) {
        return (Set) g(vVar).get();
    }
}
