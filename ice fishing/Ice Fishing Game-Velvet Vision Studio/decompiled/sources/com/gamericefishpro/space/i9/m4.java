package com.gamericefishpro.space.i9;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {
    public static final com.gamericefishpro.space.t.e a = new com.gamericefishpro.space.t.e(0);

    public static synchronized void a() {
        com.gamericefishpro.space.t.e eVar = a;
        Iterator it = ((com.gamericefishpro.space.t.d) eVar.values()).iterator();
        if (it.hasNext()) {
            ((m4) it.next()).getClass();
            throw null;
        }
        eVar.clear();
    }
}
