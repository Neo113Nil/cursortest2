package com.squareup.cash.arcade.components;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidClipboardManager;

/* loaded from: classes5.dex */
public final class CopyCodeState {
    public final AndroidClipboardManager clipboardManager;
    public final ParcelableSnapshotMutableState isAnimating$delegate;

    public CopyCodeState(AndroidClipboardManager androidClipboardManager) {
        androidClipboardManager.getClass();
        this.clipboardManager = androidClipboardManager;
        this.isAnimating$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    }
}
