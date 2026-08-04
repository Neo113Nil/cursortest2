package com.gamericefishpro.space.d;

import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final Runnable a;
    public final com.gamericefishpro.space.oh.s b = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(1, this));

    public r(Runnable runnable) {
        this.a = runnable;
    }

    public final p a() {
        return (p) this.b.getValue();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "invoker");
        com.gamericefishpro.space.tb.s sVar = a().c;
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        sVar.c(new com.gamericefishpro.space.j5.k(onBackInvokedDispatcher, 0), 1);
        com.gamericefishpro.space.tb.s sVar2 = a().c;
        Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "onBackInvokedDispatcher");
        sVar2.c(new com.gamericefishpro.space.j5.k(onBackInvokedDispatcher, 1000000), 0);
    }
}
