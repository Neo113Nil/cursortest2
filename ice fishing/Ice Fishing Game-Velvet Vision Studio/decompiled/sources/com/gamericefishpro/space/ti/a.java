package com.gamericefishpro.space.ti;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {
    public final transient Object d;

    public a(com.gamericefishpro.space.si.f fVar) {
        super("Flow was aborted, no more elements needed");
        this.d = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
