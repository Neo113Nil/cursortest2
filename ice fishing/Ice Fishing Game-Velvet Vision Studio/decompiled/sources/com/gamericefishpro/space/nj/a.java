package com.gamericefishpro.space.nj;

import com.gamericefishpro.space.b1.d;
import com.gamericefishpro.space.mj.b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b e;
    public final d a;
    public final Set b;
    public final ConcurrentHashMap c;
    public final com.gamericefishpro.space.pj.a d;

    static {
        Intrinsics.checkNotNullParameter("_root_", "name");
        Intrinsics.checkNotNullParameter("_root_", "value");
        e = new b();
    }

    public a(d _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.a = _koin;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(...)");
        this.b = setNewSetFromMap;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        b bVar = e;
        com.gamericefishpro.space.pj.a aVar = new com.gamericefishpro.space.pj.a(bVar, "_root_", null, _koin, 8);
        this.d = aVar;
        setNewSetFromMap.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
