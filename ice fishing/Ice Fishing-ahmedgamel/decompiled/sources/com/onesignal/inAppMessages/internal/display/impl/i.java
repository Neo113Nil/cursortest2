package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class i extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        kotlin.jvm.internal.h.b(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i4, int i6, int i9, int i10, int i11, int i12, int i13, boolean z6) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i4) {
    }
}
