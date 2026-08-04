package com.gamericefishpro.space.t;

import com.gamericefishpro.space.i9.n6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r0 implements Map {
    public n6 v;
    public b w;
    public d y;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        n6 n6Var = this.v;
        if (n6Var != null) {
            return n6Var;
        }
        n6 n6Var2 = new n6(this, 2);
        this.v = n6Var2;
        return n6Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.w;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.w = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.i);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.y;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.y = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r0 map) {
        super(0);
        Intrinsics.checkNotNullParameter(map, "map");
        int i = map.i;
        b(this.i + i);
        if (this.i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(map.f(i2), map.i(i2));
            }
        } else if (i > 0) {
            com.gamericefishpro.space.ph.u.c(0, 0, i, map.d, this.d);
            com.gamericefishpro.space.ph.u.d(0, 0, i << 1, map.e, this.e);
            this.i = i;
        }
    }
}
