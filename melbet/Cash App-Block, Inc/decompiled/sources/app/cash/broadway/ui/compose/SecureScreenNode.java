package app.cash.broadway.ui.compose;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SecureScreenNode {
    public Function0 enabledChangedCallback;
    public boolean isEnabled;

    public SecureScreenNode(boolean z) {
        this.isEnabled = z;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }
}
