package defpackage;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class oks {
    public static final oks a = new oks();

    public final void a(@NotNull Activity activity) {
        activity.getClass();
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
