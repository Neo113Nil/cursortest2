package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes.dex */
public abstract class v0d {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, a aVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(aVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(aVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (vng.o(decorView) == null) {
            vng.E(decorView, componentActivity);
        }
        if (rzo.z(decorView) == null) {
            rzo.T(decorView, componentActivity);
        }
        if (s8o.l(decorView) == null) {
            s8o.R(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, a);
    }
}
