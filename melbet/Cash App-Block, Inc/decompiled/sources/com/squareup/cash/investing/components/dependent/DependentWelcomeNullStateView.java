package com.squareup.cash.investing.components.dependent;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.support.chat.views.transcript.ChatAdapter$$ExternalSyntheticLambda5;

/* loaded from: classes6.dex */
public final class DependentWelcomeNullStateView extends AbstractComposeView implements Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Ui.EventReceiver eventReceiver;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentWelcomeNullStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.viewModel$delegate = Updater.mutableStateOf$default(null);
        this.eventReceiver = new ChatAdapter$$ExternalSyntheticLambda5(1);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1579109313);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(978778068, new DependentWelcomeNullStateView$$ExternalSyntheticLambda1(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DependentWelcomeNullStateView$$ExternalSyntheticLambda1(this, i);
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(DependentWelcomeViewModel dependentWelcomeViewModel) {
        dependentWelcomeViewModel.getClass();
        this.viewModel$delegate.setValue(dependentWelcomeViewModel);
    }

    public /* synthetic */ DependentWelcomeNullStateView(Context context) {
        this(context, null);
    }
}
