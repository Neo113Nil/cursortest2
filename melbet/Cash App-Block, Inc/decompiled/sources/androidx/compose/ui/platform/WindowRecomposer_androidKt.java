package androidx.compose.ui.platform;

import android.view.View;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.CompositionContext;
import com.squareup.cash.R;

/* loaded from: classes.dex */
public abstract class WindowRecomposer_androidKt {
    public static final MutableScatterMap animationScale;

    static {
        long[] jArr = ScatterMapKt.EmptyGroup;
        animationScale = new MutableScatterMap();
    }

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }
}
