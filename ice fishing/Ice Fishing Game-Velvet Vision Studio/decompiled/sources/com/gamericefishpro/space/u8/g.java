package com.gamericefishpro.space.u8;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final Set a;

    public g(int i) {
        switch (i) {
            case 1:
                this.a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
                break;
            default:
                this.a = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }
}
