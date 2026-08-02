package com.squareup.cash.shopping.viewmodels;

/* loaded from: classes8.dex */
public enum PaykitInfoToastState {
    PAYKIT_LOADING(false),
    PAYKIT_LOADED(false),
    PAYKIT_TIMEOUT(true),
    PAYKIT_TIMEOUT_INFO_SHOWN(false);

    public final boolean showToast;

    PaykitInfoToastState(boolean z) {
        this.showToast = z;
    }
}
