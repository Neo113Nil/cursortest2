package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.combinations.level.experts.R;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xf1 extends ag1 {
    public static final PathInterpolator OOA6hdeuvCS = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final hr EljAMC1QTz = new hr();
    public static final DecelerateInterpolator AvO7iQsrTN = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator encWxUiV2 = new AccelerateInterpolator(1.5f);

    public static void AvO7iQsrTN(View view, bg1 bg1Var, wg1 wg1Var, boolean z) {
        mb JFJ3QoxA = JFJ3QoxA(view);
        if (JFJ3QoxA != null) {
            JFJ3QoxA.EljAMC1QTz = wg1Var;
            if (!z) {
                JFJ3QoxA.EljAMC1QTz(bg1Var);
                z = JFJ3QoxA.OOA6hdeuvCS == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                AvO7iQsrTN(viewGroup.getChildAt(i), bg1Var, wg1Var, z);
            }
        }
    }

    public static void EljAMC1QTz(bg1 bg1Var, View view) {
        mb JFJ3QoxA = JFJ3QoxA(view);
        if (JFJ3QoxA != null) {
            JFJ3QoxA.OOA6hdeuvCS(bg1Var);
            if (JFJ3QoxA.OOA6hdeuvCS == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                EljAMC1QTz(bg1Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static mb JFJ3QoxA(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof wf1) {
            return ((wf1) tag).GWasM1elztuh;
        }
        return null;
    }

    public static void encWxUiV2(View view, wg1 wg1Var, List list) {
        mb JFJ3QoxA = JFJ3QoxA(view);
        if (JFJ3QoxA != null) {
            wg1Var = JFJ3QoxA.AvO7iQsrTN(wg1Var, list);
            if (JFJ3QoxA.OOA6hdeuvCS == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                encWxUiV2(viewGroup.getChildAt(i), wg1Var, list);
            }
        }
    }

    public static void mOu10nynGul(View view, bg1 bg1Var, d dVar) {
        mb JFJ3QoxA = JFJ3QoxA(view);
        if (JFJ3QoxA != null) {
            JFJ3QoxA.encWxUiV2(bg1Var, dVar);
            if (JFJ3QoxA.OOA6hdeuvCS == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                mOu10nynGul(viewGroup.getChildAt(i), bg1Var, dVar);
            }
        }
    }
}
