package androidx.compose.foundation.text.handwriting;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class StylusHandwriting_androidKt {
    public static final boolean isStylusHandwritingSupported;

    static {
        isStylusHandwritingSupported = Build.VERSION.SDK_INT >= 34;
    }
}
