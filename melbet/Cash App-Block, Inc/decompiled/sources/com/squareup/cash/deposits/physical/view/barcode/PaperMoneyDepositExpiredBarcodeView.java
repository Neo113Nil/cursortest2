package com.squareup.cash.deposits.physical.view.barcode;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.components.FormView$Factory$Impl;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositExpiredBarcodeView extends ComposeUiView implements FormView.FormViewParent {
    public final FormView formView;

    static {
        KProperty[] kPropertyArr = FormView.$$delegatedProperties;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperMoneyDepositExpiredBarcodeView(Context context, FormView$Factory$Impl formView$Factory$Impl) {
        super(context);
        context.getClass();
        this.formView = formView$Factory$Impl.create(context);
    }

    public final void Content(PaperMoneyDepositBarcodeExpiredViewModel paperMoneyDepositBarcodeExpiredViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-294715822);
        int i2 = (gapComposer.changedInstance(paperMoneyDepositBarcodeExpiredViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Unit unit = Unit.INSTANCE;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new EntitySyncerKt$hasSyncedFlow$1(this, function1, (Continuation) null, 23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-829818073, new PaperMoneyDepositExpiredBarcodeView$$ExternalSyntheticLambda0(function1, paperMoneyDepositBarcodeExpiredViewModel, this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaperMoneyDepositExpiredBarcodeView$$ExternalSyntheticLambda0(this, paperMoneyDepositBarcodeExpiredViewModel, function1, i);
        }
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return this.formView.onBack();
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
        this.formView.onDialogCanceled(screen);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView, com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        this.formView.onDialogResult(screen, obj);
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onEnterTransitionFinished() {
        this.formView.onEnterTransitionFinished();
    }

    @Override // com.squareup.cash.ui.OnTransitionListener
    public final void onExitTransitionStarted() {
        FormView formView = this.formView;
        formView.getClass();
        Keyboards.hideKeyboard(formView);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((PaperMoneyDepositBarcodeExpiredViewModel) obj, function1, gapComposer, 0);
    }
}
