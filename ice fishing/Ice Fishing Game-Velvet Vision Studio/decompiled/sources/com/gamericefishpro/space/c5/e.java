package com.gamericefishpro.space.c5;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final LinkedHashMap a;

    public e(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(com.gamericefishpro.space.ei.g clazz, Function1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new g(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.b() + '.').toString());
    }

    public void b(com.gamericefishpro.space.w5.a migration) {
        Intrinsics.checkNotNullParameter(migration, "migration");
        int i = migration.a;
        int i2 = migration.b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + migration);
        }
        treeMap2.put(Integer.valueOf(i2), migration);
    }

    public d c() {
        Collection initializers = this.a.values();
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        g[] gVarArr = (g[]) initializers.toArray(new g[0]);
        return new d((g[]) Arrays.copyOf(gVarArr, gVarArr.length));
    }
}
