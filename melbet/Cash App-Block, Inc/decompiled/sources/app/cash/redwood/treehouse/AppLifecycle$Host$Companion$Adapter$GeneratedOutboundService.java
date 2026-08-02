package app.cash.redwood.treehouse;

import app.cash.redwood.protocol.EventTag;
import app.cash.redwood.protocol.Id;
import app.cash.redwood.protocol.RedwoodVersion;
import app.cash.redwood.protocol.WidgetTag;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;

/* loaded from: classes3.dex */
public final class AppLifecycle$Host$Companion$Adapter$GeneratedOutboundService implements AppLifecycle$Host, OutboundService {
    public final OutboundCallHandler callHandler;

    public AppLifecycle$Host$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 4, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: getHostProtocolVersion-7jYel6c */
    public final String mo1388getHostProtocolVersion7jYel6c() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
        return ((RedwoodVersion) call).value;
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    public final void handleUncaughtException(Throwable th) {
        Object call = this.callHandler.call(this, 3, th);
        call.getClass();
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: onUnknownEvent-_LM6m-c */
    public final void mo1389onUnknownEvent_LM6mc(int i, int i2) {
        Object call = this.callHandler.call(this, 1, new WidgetTag(i), new EventTag(i2));
        call.getClass();
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    /* renamed from: onUnknownEventNode-1ccMwuE */
    public final void mo1390onUnknownEventNode1ccMwuE(int i, int i2) {
        Object call = this.callHandler.call(this, 2, new Id(i), new EventTag(i2));
        call.getClass();
    }

    @Override // app.cash.redwood.treehouse.AppLifecycle$Host
    public final void requestFrame() {
        Object call = this.callHandler.call(this, 0, new Object[0]);
        call.getClass();
    }
}
