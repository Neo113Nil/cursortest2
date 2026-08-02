package com.squareup.cash.clipboard;

import com.squareup.cash.treehouse.clipboard.RawClipboardService;

/* loaded from: classes.dex */
public final class RealClipboardService implements RawClipboardService {
    public final RealClipboardManager clipboardManager;

    public RealClipboardService(RealClipboardManager realClipboardManager) {
        realClipboardManager.getClass();
        this.clipboardManager = realClipboardManager;
    }

    @Override // com.squareup.cash.treehouse.clipboard.RawClipboardService
    public final void copy(String str) {
        this.clipboardManager.copy("", str);
    }
}
