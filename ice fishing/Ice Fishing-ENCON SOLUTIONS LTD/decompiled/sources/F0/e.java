package F0;

import android.app.ActivityManager;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i2, String str) {
        return new ActivityManager.TaskDescription(str, 0, i2);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout n(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
