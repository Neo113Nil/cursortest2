package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    public final ParcelableSnapshotMutableState content;
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(420213850);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.content.getValue();
            if (function2 == null) {
                gapComposer.startReplaceGroup(-1238823553);
            } else {
                gapComposer.startReplaceGroup(98585282);
                function2.invoke(gapComposer, 0);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposeView$Content$1(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(function2);
        if (isAttachedToWindow() || this.composeViewContext != null) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = Updater.mutableStateOf$default(null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
