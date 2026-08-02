package com.squareup.cash.core.navigationcontainer.api;

/* loaded from: classes.dex */
public enum NavigatorState {
    ColdStart(false),
    Locked(false),
    Unlocked(true),
    UpdateRequired(false);

    public final boolean supportsTabs;

    NavigatorState(boolean z) {
        this.supportsTabs = z;
    }
}
