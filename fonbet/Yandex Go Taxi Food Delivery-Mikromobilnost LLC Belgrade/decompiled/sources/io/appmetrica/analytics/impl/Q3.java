package io.appmetrica.analytics.impl;

import defpackage.tls;
import io.appmetrica.analytics.coreutils.internal.buffering.AccumulatingTaskBuffer;
import io.appmetrica.analytics.coreutils.internal.buffering.DeferredBatchExecutor;

/* loaded from: classes9.dex */
public final class Q3 {
    public final tls a;
    public final DeferredBatchExecutor b = new DeferredBatchExecutor(Jb.k().w().f(), new AccumulatingTaskBuffer(), new P3(this), 1000, "[BufferedTempCacheWriter]");

    public Q3(Oq oq) {
        this.a = oq;
    }
}
