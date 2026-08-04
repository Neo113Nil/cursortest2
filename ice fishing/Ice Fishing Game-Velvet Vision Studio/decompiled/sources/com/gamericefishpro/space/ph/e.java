package com.gamericefishpro.space.ph;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f implements RandomAccess {
    public final f e;
    public final int i;
    public final int v;

    public e(f list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.e = list;
        this.i = i;
        c cVar = f.d;
        int iB = list.b();
        cVar.getClass();
        c.c(i, i2, iB);
        this.v = i2 - i;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.v;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f.d.getClass();
        c.a(i, this.v);
        return this.e.get(this.i + i);
    }
}
