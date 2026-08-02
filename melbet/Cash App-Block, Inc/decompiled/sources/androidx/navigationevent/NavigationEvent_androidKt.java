package androidx.navigationevent;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* loaded from: classes3.dex */
public abstract class NavigationEvent_androidKt {
    public static final NavigationEvent NavigationEvent(BackEvent backEvent) {
        backEvent.getClass();
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        return new NavigationEvent(Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L, backEvent.getSwipeEdge(), progress, touchX, touchY);
    }

    public static boolean canPostPromotedNotifications(NotificationManager notificationManager) {
        return notificationManager.canPostPromotedNotifications();
    }

    public static int getExpandedState(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence getSupplementalDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean isFieldRequired(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void setAllowPassThroughOnTouchOutside(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    public static void setShortCriticalText(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}
