package app.cash.redwood.treehouse;

import app.cash.redwood.protocol.ChangesSink;
import app.cash.redwood.ui.core.api.FocusRequester;
import app.cash.zipline.ZiplineService;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public interface ZiplineTreehouseUi$Host extends ZiplineService, ChangesSink {
    CancellableService addOnBackPressedCallback(OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService);

    StateSnapshot getStateSnapshot();

    StateFlow getUiConfigurations();

    void hideSoftwareKeyboard();

    void requestFocus(FocusRequester focusRequester);
}
