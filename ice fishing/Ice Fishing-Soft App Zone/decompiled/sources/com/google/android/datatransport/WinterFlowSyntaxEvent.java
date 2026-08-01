package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxEvent extends CancellationException {
    public final transient Object WinterFlowVariableVersionControl;

    public WinterFlowSyntaxEvent(WinterFlowCacheInterface winterFlowCacheInterface) {
        super("Flow was aborted, no more elements needed");
        this.WinterFlowVariableVersionControl = winterFlowCacheInterface;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
