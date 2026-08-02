package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ArcadeFormViewTitleBar extends AbstractComposeView {
    public final ParcelableSnapshotMutableState accessoryText$delegate;
    public final ParcelableSnapshotMutableState fullBleedBackgroundColor$delegate;
    public final FormView$$ExternalSyntheticLambda1 onCloseClick;
    public final FormView$$ExternalSyntheticLambda1 onHelpClick;
    public final FormView$$ExternalSyntheticLambda1 onRetreatClick;
    public final FormView$$ExternalSyntheticLambda2 onUrlClick;
    public final ParcelableSnapshotMutableState showCloseButton$delegate;
    public final ParcelableSnapshotMutableState showHelpButton$delegate;
    public final ParcelableSnapshotMutableState showRetreatButton$delegate;
    public final ParcelableSnapshotMutableState title$delegate;
    public final ParcelableSnapshotMutableFloatState titleVisibility$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormViewTitleBar(FormView$$ExternalSyntheticLambda1 formView$$ExternalSyntheticLambda1, FormView$$ExternalSyntheticLambda2 formView$$ExternalSyntheticLambda2, FormView$$ExternalSyntheticLambda1 formView$$ExternalSyntheticLambda12, FormView$$ExternalSyntheticLambda1 formView$$ExternalSyntheticLambda13, Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.onCloseClick = formView$$ExternalSyntheticLambda1;
        this.onUrlClick = formView$$ExternalSyntheticLambda2;
        this.onHelpClick = formView$$ExternalSyntheticLambda12;
        this.onRetreatClick = formView$$ExternalSyntheticLambda13;
        this.accessoryText$delegate = Updater.mutableStateOf$default(null);
        Boolean bool = Boolean.FALSE;
        this.showHelpButton$delegate = Updater.mutableStateOf$default(bool);
        this.showCloseButton$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.showRetreatButton$delegate = Updater.mutableStateOf$default(bool);
        this.fullBleedBackgroundColor$delegate = Updater.mutableStateOf$default(null);
        this.title$delegate = Updater.mutableStateOf$default(null);
        this.titleVisibility$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-628345360);
        int i2 = 2;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1271222523, new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(this, i4), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(this, i, i2);
        }
    }

    public final void TitleBarContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-510367467);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1920487695, new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(this, i2), gapComposer);
            NavigationType navigationType = ((Boolean) this.showRetreatButton$delegate.getValue()).booleanValue() ? NavigationType.BACK : ((Boolean) this.showCloseButton$delegate.getValue()).booleanValue() ? NavigationType.CLOSE : NavigationType.NONE;
            boolean z = (i3 & 14) == 4 || gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(201325588, new ArcadeModal$$ExternalSyntheticLambda3(this, 28), gapComposer), gapComposer, 1572870, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(this, i, 5);
        }
    }

    public final void setAccessoryText(String str) {
        this.accessoryText$delegate.setValue(str);
    }

    public final void setFullBleedBackgroundColor(ColorModel colorModel) {
        this.fullBleedBackgroundColor$delegate.setValue(colorModel);
    }

    public final void setShowCloseButton(boolean z) {
        this.showCloseButton$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowHelpButton(boolean z) {
        this.showHelpButton$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowRetreatButton(boolean z) {
        this.showRetreatButton$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTitle(String str) {
        this.title$delegate.setValue(str);
    }
}
