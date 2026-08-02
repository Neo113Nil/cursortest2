package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;

/* loaded from: classes4.dex */
public final class vqq0 {
    public Activity a;
    public final int b;
    public final ndl0 c;

    public vqq0(int i, Activity activity, ndl0 ndl0Var) {
        this.a = activity;
        this.b = i;
        this.c = ndl0Var;
        ndl0Var.b = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.a;
        int i = this.b;
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        ny61.g(oyr.j(i, "FlutterView with ID ", "not found"));
        return 0;
    }

    public final void b(int i) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            ny61.r("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
            return;
        }
        Activity activity = this.a;
        int i2 = this.b;
        View findViewById = activity.findViewById(i2);
        if (findViewById == null) {
            ny61.g(oyr.j(i2, "FlutterView with ID ", "not found"));
            return;
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i) {
            return;
        }
        findViewById.setContentSensitivity(i);
        findViewById.invalidate();
    }
}
