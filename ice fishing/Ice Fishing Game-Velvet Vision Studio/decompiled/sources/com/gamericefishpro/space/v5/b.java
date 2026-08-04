package com.gamericefishpro.space.v5;

import com.gamericefishpro.space.tb.u;
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.u5.b {
    public final u d;

    public b(u supportDriver) {
        Intrinsics.checkNotNullParameter(supportDriver, "supportDriver");
        this.d = supportDriver;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((com.gamericefishpro.space.d6.f) this.d.e).close();
    }

    @Override // com.gamericefishpro.space.u5.b
    public final Object s(boolean z, Function2 function2, com.gamericefishpro.space.vh.c cVar) {
        com.gamericefishpro.space.d6.f fVar = (com.gamericefishpro.space.d6.f) this.d.e;
        String fileName = fVar.getDatabaseName();
        if (fileName == null) {
            fileName = ":memory:";
        }
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return function2.invoke(new d(new a(fVar.L())), cVar);
    }
}
