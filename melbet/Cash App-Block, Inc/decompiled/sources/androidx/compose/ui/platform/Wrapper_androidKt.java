package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.UiApplier;
import com.squareup.cash.R;

/* loaded from: classes.dex */
public abstract class Wrapper_androidKt {
    public static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WrappedComposition setContent(AbstractComposeView abstractComposeView, ComposeViewContext composeViewContext, ComposableLambdaImpl composableLambdaImpl) {
        AndroidComposeView androidComposeView;
        WrappedComposition wrappedComposition;
        CompositionContext compositionContext = composeViewContext.compositionContext;
        GlobalSnapshotManager.ensureStarted();
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(composeViewContext);
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), composeViewContext);
                    abstractComposeView.addView(androidComposeView, DefaultLayoutParams);
                }
                androidComposeView.setComposeViewContext(composeViewContext);
                if (abstractComposeView.composeViewContext != null) {
                    composeViewContext.incrementViewCount$ui();
                    androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
                wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
                if (wrappedComposition == null) {
                    wrappedComposition = new WrappedComposition(androidComposeView, new CompositionImpl(compositionContext, new UiApplier(androidComposeView.root)));
                    androidComposeView.setTag(R.id.wrapped_composition_tag, wrappedComposition);
                }
                wrappedComposition.setContent(composableLambdaImpl);
                androidComposeView.setFrameEndScheduler$ui(new Wrapper_androidKt$setContent$1(compositionContext));
                return wrappedComposition;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        androidComposeView.setComposeViewContext(composeViewContext);
        if (abstractComposeView.composeViewContext != null) {
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
        }
        wrappedComposition.setContent(composableLambdaImpl);
        androidComposeView.setFrameEndScheduler$ui(new Wrapper_androidKt$setContent$1(compositionContext));
        return wrappedComposition;
    }
}
