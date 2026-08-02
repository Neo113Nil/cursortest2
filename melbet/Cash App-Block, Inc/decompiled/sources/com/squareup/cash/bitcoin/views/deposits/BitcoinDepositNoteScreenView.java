package com.squareup.cash.bitcoin.views.deposits;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.EditText;
import androidx.appcompat.view.menu.StandardMenuPopup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewModel;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.ViewGroups;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class BitcoinDepositNoteScreenView extends ComposeUiView implements FormView.FormViewParent {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final FormView formView;

    static {
        KProperty[] kPropertyArr = FormView.$$delegatedProperties;
    }

    public BitcoinDepositNoteScreenView(Context context, Activity activity, RealCashScreenBrightness realCashScreenBrightness, FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl) {
        super(context);
        this.formView = new FormView(activity, context, formElementViewBuilder$Factory$Impl);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        addOnAttachStateChangeListener(new StandardMenuPopup.AnonymousClass2(realCashScreenBrightness, 7));
    }

    public static final void access$hideKeyboard(BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView, FormView formView, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, FocusOwnerImpl focusOwnerImpl) {
        if (delegatingSoftwareKeyboardController != null) {
            delegatingSoftwareKeyboardController.hide();
        }
        focusOwnerImpl.clearFocus(false);
        View findViewInTree = ViewGroups.findViewInTree(formView, new BenefitsHubViewKt$$ExternalSyntheticLambda2(25));
        EditText editText = findViewInTree instanceof EditText ? (EditText) findViewInTree : null;
        if (editText != null) {
            editText.clearFocus();
            Keyboards.hideKeyboard(editText);
        }
    }

    public final void Content(BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel, Function1 function1, Composer composer, int i) {
        BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView;
        BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-894976441);
        int i3 = (gapComposer.changedInstance(bitcoinDepositNoteViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            bitcoinDepositNoteScreenView = this;
            bitcoinDepositNoteViewModel2 = bitcoinDepositNoteViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinDepositNoteViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0(this, bitcoinDepositNoteViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            bitcoinDepositNoteScreenView = this;
            bitcoinDepositNoteViewModel2 = bitcoinDepositNoteViewModel;
            function12 = function1;
            i2 = i;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-2022305492, new BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0(bitcoinDepositNoteScreenView, bitcoinDepositNoteViewModel2, function12), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            int i4 = i2;
            endRestartGroup2.block = new BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0(bitcoinDepositNoteScreenView, bitcoinDepositNoteViewModel2, function12, i4, 2);
        }
    }

    public final void Form(Modifier modifier, FormViewModel formViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-827938938);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(formViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(this) : gapComposer.changedInstance(this) ? 256 : 128;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            Modifier focusRequester = FocusTraversalKt.focusRequester(modifier, (FocusRequester) rememberedValue);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256 || ((i2 & 512) != 0 && gapComposer.changedInstance(this));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BadgeQueries$$ExternalSyntheticLambda5(this, 14);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            if (i3 == 256 || ((i2 & 512) != 0 && gapComposer.changedInstance(this))) {
                z = true;
            }
            boolean changedInstance = gapComposer.changedInstance(formViewModel) | z;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BadgeQueries$$ExternalSyntheticLambda0(19, this, formViewModel);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            AndroidView_androidKt.AndroidView(function1, focusRequester, (Function1) rememberedValue3, gapComposer, 0, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3(this, modifier, formViewModel, i, 6);
        }
    }

    public final void HandleFormViewEvents(BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1643577396);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinDepositNoteViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(this) : gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer.changedInstance(bitcoinDepositNoteViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda0(bitcoinDepositNoteViewModel, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            SharedFlowImpl sharedFlowImpl = this.formView.viewEvents;
            Updater.LaunchedEffect(gapComposer, sharedFlowImpl, new EngineInterceptor$intercept$2(17, mutableState, sharedFlowImpl, this, delegatingSoftwareKeyboardController, focusOwnerImpl, function1, (Continuation) null));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3(this, bitcoinDepositNoteViewModel, function1, i, 7);
        }
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return this.formView.onBack();
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BitcoinDepositNoteViewModel) obj, function1, gapComposer, 0);
    }
}
