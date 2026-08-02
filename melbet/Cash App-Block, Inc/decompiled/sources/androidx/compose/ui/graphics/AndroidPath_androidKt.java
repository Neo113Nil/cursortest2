package androidx.compose.ui.graphics;

import android.graphics.Path;

/* loaded from: classes.dex */
public abstract class AndroidPath_androidKt {
    public static final AndroidPath Path() {
        return new AndroidPath(new Path());
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }
}
