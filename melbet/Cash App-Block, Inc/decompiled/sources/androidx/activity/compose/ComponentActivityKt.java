package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.room.util.DBUtil;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;

/* loaded from: classes3.dex */
public abstract class ComponentActivityKt {
    public static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static void setContent$default(ComponentActivity componentActivity, ComposableLambdaImpl composableLambdaImpl) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambdaImpl);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(composableLambdaImpl);
        View decorView = componentActivity.getWindow().getDecorView();
        if (DBUtil.get(decorView) == null) {
            decorView.setTag(com.squareup.cash.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (Strings.get(decorView) == null) {
            decorView.setTag(com.squareup.cash.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (Countries.get(decorView) == null) {
            decorView.setTag(com.squareup.cash.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }
}
