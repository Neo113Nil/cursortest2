package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y50 {
    public final x50 qoPGr6Ce;

    public y50(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.qoPGr6Ce = new w50(nestedScrollView);
        } else {
            this.qoPGr6Ce = new k00(5);
        }
    }
}
