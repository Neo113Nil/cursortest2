package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.arcade.components.ProgressCircularKt;

/* loaded from: classes5.dex */
public final class SpinnerBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Modifier modifier;
    public int size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.size = 56;
        this.modifier = Modifier.Companion.$$INSTANCE;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(498240643);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, this.size));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 26);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
