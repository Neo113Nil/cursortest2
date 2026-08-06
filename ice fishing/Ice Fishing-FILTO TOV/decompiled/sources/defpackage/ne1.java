package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.combinations.level.experts.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ne1 {
    public static final /* synthetic */ int GWasM1elztuh = 0;

    static {
        new WeakHashMap();
    }

    public static void GWasM1elztuh(View view, mb mbVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(mbVar != null ? new yf1(mbVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = xf1.OOA6hdeuvCS;
        View.OnApplyWindowInsetsListener wf1Var = mbVar != null ? new wf1(view, mbVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, wf1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(wf1Var);
        }
    }
}
