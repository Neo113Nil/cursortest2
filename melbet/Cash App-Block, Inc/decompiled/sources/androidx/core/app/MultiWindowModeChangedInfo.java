package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes3.dex */
public final class MultiWindowModeChangedInfo {
    public final boolean isInMultiWindowMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiWindowModeChangedInfo(boolean z, Configuration configuration) {
        this(z);
        configuration.getClass();
    }

    public final boolean isInMultiWindowMode() {
        return this.isInMultiWindowMode;
    }

    public MultiWindowModeChangedInfo(boolean z) {
        this.isInMultiWindowMode = z;
    }
}
