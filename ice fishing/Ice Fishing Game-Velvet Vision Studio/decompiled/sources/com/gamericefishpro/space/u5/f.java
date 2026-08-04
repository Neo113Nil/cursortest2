package com.gamericefishpro.space.u5;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.gamericefishpro.space.c6.a, com.gamericefishpro.space.xi.a {
    public final com.gamericefishpro.space.c6.a d;
    public final com.gamericefishpro.space.xi.c e;
    public CoroutineContext i;
    public Throwable v;

    public f(com.gamericefishpro.space.c6.a delegate) {
        com.gamericefishpro.space.xi.c lock = new com.gamericefishpro.space.xi.c();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.d = delegate;
        this.e = lock;
    }

    @Override // com.gamericefishpro.space.c6.a
    public final com.gamericefishpro.space.c6.c O(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return this.d.O(sql);
    }

    @Override // com.gamericefishpro.space.xi.a
    public final void b(Object obj) {
        this.e.b(null);
    }

    @Override // com.gamericefishpro.space.xi.a
    public final Object c(com.gamericefishpro.space.vh.c cVar) {
        return this.e.c(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.d.close();
    }

    public final void j(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.i == null && this.v == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        CoroutineContext coroutineContext = this.i;
        if (coroutineContext != null) {
            builder.append("\t\tCoroutine: " + coroutineContext);
            builder.append('\n');
        }
        Throwable th = this.v;
        if (th != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = CollectionsKt.u(StringsKt.w(com.gamericefishpro.space.oh.c.b(th))).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
