package com.gamericefishpro.space.d;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Executor a;
    public final Object b;
    public boolean c;
    public final ArrayList d;

    public m(Executor executor, c reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.a = executor;
        this.b = new Object();
        this.d = new ArrayList();
    }
}
