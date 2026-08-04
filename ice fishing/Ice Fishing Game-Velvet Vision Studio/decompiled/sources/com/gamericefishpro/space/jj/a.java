package com.gamericefishpro.space.jj;

import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.hj.b;
import com.gamericefishpro.space.i9.a4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a = a4.x();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(b factory) {
        Intrinsics.checkNotNullParameter(factory, "instanceFactory");
        com.gamericefishpro.space.fj.a aVar = factory.a;
        g gVar = aVar.b;
        String mapping = com.gamericefishpro.space.qj.a.a(gVar) + "::" + aVar.a;
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.c.put(mapping, factory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return Intrinsics.a(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
