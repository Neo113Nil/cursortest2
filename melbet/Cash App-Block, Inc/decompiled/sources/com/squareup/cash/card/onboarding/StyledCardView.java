package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class StyledCardView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.viewModel$delegate = Updater.mutableStateOf$default(null);
        setClipChildren(false);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1847715942);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            StyledCardViewModel styledCardViewModel = (StyledCardViewModel) this.viewModel$delegate.getValue();
            if (styledCardViewModel == null) {
                gapComposer.startReplaceGroup(-1004729663);
            } else {
                gapComposer.startReplaceGroup(-1004729662);
                StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, KeypadKt.m3658mooncakeShadowWMci_g0$default(Modifier.Companion.$$INSTANCE, 0.7f, RecyclerView.DECELERATION_RATE, 0.2f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(10.0f), 18), null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 60);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(this, i, 15);
        }
    }

    public final void setModel(StyledCardViewModel styledCardViewModel) {
        styledCardViewModel.getClass();
        this.viewModel$delegate.setValue(styledCardViewModel);
    }

    public /* synthetic */ StyledCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
