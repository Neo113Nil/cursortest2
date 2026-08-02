package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class pg3 implements ng3 {
    public static final pg3 a = new pg3();

    @Override // defpackage.ng3
    public final Rect p(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
