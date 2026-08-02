package app.cash.redwood.treehouse;

import app.cash.redwood.ui.core.api.FocusRequester;
import app.cash.zipline.internal.bridge.OutboundCallHandler;
import app.cash.zipline.internal.bridge.OutboundService;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public final class ZiplineTreehouseUi$Host$Companion$Adapter$GeneratedOutboundService implements ZiplineTreehouseUi$Host, OutboundService {
    public final OutboundCallHandler callHandler;

    public ZiplineTreehouseUi$Host$Companion$Adapter$GeneratedOutboundService(OutboundCallHandler outboundCallHandler) {
        this.callHandler = outboundCallHandler;
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final CancellableService addOnBackPressedCallback(OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) {
        Object call = this.callHandler.call(this, 0, onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService);
        call.getClass();
        return (CancellableService) call;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        Object call = this.callHandler.call(this, 3, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.zipline.internal.bridge.OutboundService
    public final OutboundCallHandler getCallHandler() {
        return this.callHandler;
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final StateSnapshot getStateSnapshot() {
        return (StateSnapshot) this.callHandler.call(this, 6, new Object[0]);
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final StateFlow getUiConfigurations() {
        Object call = this.callHandler.call(this, 5, new Object[0]);
        call.getClass();
        return (StateFlow) call;
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final void hideSoftwareKeyboard() {
        Object call = this.callHandler.call(this, 1, new Object[0]);
        call.getClass();
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final void requestFocus(FocusRequester focusRequester) {
        Object call = this.callHandler.call(this, 2, focusRequester);
        call.getClass();
    }

    @Override // app.cash.redwood.protocol.ChangesSink
    public final void sendChanges(List list) {
        Object call = this.callHandler.call(this, 4, list);
        call.getClass();
    }
}
