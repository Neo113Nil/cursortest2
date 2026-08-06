package io.appmetrica.analytics.coreutils.internal.toggle;

/* loaded from: classes.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z2, String str) {
        super(z2, str);
    }

    public final void update(boolean z2) {
        updateState(z2);
    }
}
