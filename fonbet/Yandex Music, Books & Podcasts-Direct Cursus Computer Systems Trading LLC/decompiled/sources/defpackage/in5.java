package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes.dex */
public abstract class in5 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(hn5 hn5Var, wn5 wn5Var) {
        View childAt = ((ViewGroup) hn5Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(wn5Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(hn5Var, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(wn5Var);
        View decorView = hn5Var.getWindow().getDecorView();
        if (swf.E(decorView) == null) {
            decorView.setTag(ru.yandex.music.R.id.view_tree_lifecycle_owner, hn5Var);
        }
        if (zwf.D(decorView) == null) {
            decorView.setTag(ru.yandex.music.R.id.view_tree_view_model_store_owner, hn5Var);
        }
        if (ywf.y(decorView) == null) {
            decorView.setTag(ru.yandex.music.R.id.view_tree_saved_state_registry_owner, hn5Var);
        }
        hn5Var.setContentView(composeView2, a);
    }
}
