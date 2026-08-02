package com.squareup.cash.overlays;

import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public interface OverlayLayer {

    /* loaded from: classes6.dex */
    public interface Session {
        void dismiss();

        Overlay getOverlay();
    }

    CoroutineScope getCoroutineScope();

    boolean onBack();

    Session show(Overlay overlay);
}
