package com.gamericefishpro.space.f2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface n0 extends p {
    m0 G(int i, int i2, Map map, Function1 function1, Function1 function2);

    default m0 y(int i, int i2, Map map, Function1 function1) {
        return G(i, i2, map, null, function1);
    }
}
