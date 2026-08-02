package com.google.android.material.motion;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.ui.window.Api33Impl$$ExternalSyntheticLambda0;
import java.util.Objects;

/* loaded from: classes4.dex */
public class MaterialBackOrchestrator$Api33BackCallbackDelegate {
    public OnBackInvokedCallback onBackInvokedCallback;

    public OnBackInvokedCallback createOnBackInvokedCallback(MaterialBackHandler materialBackHandler) {
        Objects.requireNonNull(materialBackHandler);
        return new Api33Impl$$ExternalSyntheticLambda0(materialBackHandler, 3);
    }

    public void startListeningForBackCallbacks(MaterialBackHandler materialBackHandler, View view, boolean z) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.onBackInvokedCallback == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback createOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
            this.onBackInvokedCallback = createOnBackInvokedCallback;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, createOnBackInvokedCallback);
        }
    }

    public void stopListeningForBackCallbacks(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.onBackInvokedCallback == null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
        this.onBackInvokedCallback = null;
    }
}
