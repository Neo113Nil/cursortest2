package androidx.navigationevent;

import android.os.Build;
import android.window.BackEvent;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationEvent.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"NavigationEvent", "Landroidx/navigationevent/NavigationEvent;", "backEvent", "Landroid/window/BackEvent;", "navigationevent"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class NavigationEvent_androidKt {
    public static final NavigationEvent NavigationEvent(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new NavigationEvent(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
