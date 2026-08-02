package app.cash.zipline;

import app.cash.zipline.internal.bridge.OutboundCallHandler;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ZiplineScope implements AutoCloseable {
    public final LinkedHashSet callHandlers = new LinkedHashSet();
    public boolean closed;

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        LinkedHashSet linkedHashSet = this.callHandlers;
        OutboundCallHandler[] outboundCallHandlerArr = (OutboundCallHandler[]) linkedHashSet.toArray(new OutboundCallHandler[0]);
        linkedHashSet.clear();
        for (OutboundCallHandler outboundCallHandler : outboundCallHandlerArr) {
            outboundCallHandler.adapter.outboundService(outboundCallHandler).close();
        }
    }
}
