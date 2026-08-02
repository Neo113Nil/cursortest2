package androidx.metrics.performance;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public abstract class DelegatingOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        declaredField.getClass();
        declaredField.setAccessible(true);
    }
}
