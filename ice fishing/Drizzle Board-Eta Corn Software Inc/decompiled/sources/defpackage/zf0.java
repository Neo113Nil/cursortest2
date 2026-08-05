package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class zf0 {
    public static void MdtA4re8(View view, rw rwVar) {
        yf0 yf0Var = rwVar != null ? new yf0(view, rwVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, yf0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (yf0Var != null) {
            view.setOnApplyWindowInsetsListener(yf0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static wi0 NCTxEWno(View view, wi0 wi0Var, Rect rect) {
        WindowInsets wxUZMvaN = wi0Var.wxUZMvaN();
        if (wxUZMvaN != null) {
            return wi0.VgvYg0wo(view.computeSystemWindowInsets(wxUZMvaN, rect), view);
        }
        rect.setEmpty();
        return wi0Var;
    }

    public static void qoPGr6Ce(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
