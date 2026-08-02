package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class lwo {
    public final kwo a;

    public lwo(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new o7j(nestedScrollView);
        } else {
            this.a = new qcm();
        }
    }
}
