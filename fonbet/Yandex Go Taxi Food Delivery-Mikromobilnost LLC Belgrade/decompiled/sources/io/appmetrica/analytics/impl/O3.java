package io.appmetrica.analytics.impl;

import defpackage.nq6;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.buffering.AccumulatingTaskBuffer;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;
import java.util.List;

/* loaded from: classes9.dex */
public final class O3 {
    public final S9 a;
    public final DeferredBatchExecutor b;

    public O3(S9 s9, IHandlerExecutor iHandlerExecutor) {
        this.a = s9;
        this.b = new DeferredBatchExecutor(iHandlerExecutor, new AccumulatingTaskBuffer(), new nq6(1, this), 1000L, "[BufferedEventsWriter]");
    }

    public static final void a(O3 o3, List list) {
        try {
            o3.a.b(list);
            o3.a.a(list);
        } catch (Exception unused) {
        }
    }
}
