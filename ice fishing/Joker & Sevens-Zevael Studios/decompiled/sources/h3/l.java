package h3;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f2796a;

    public l(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2796a = new j(nestedScrollView);
        } else {
            this.f2796a = new u7.d();
        }
    }
}
