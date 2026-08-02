package com.squareup.cash.investing.components.teengraduation;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.formview.components.FormElementViewBuilder$Factory$Impl;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class StocksTransferEtaFullScreenView extends ComposeUiView implements FormView.FormViewParent {
    public final FormView formView;

    static {
        KProperty[] kPropertyArr = FormView.$$delegatedProperties;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StocksTransferEtaFullScreenView(Activity activity, Context context, FormElementViewBuilder$Factory$Impl formElementViewBuilder$Factory$Impl) {
        super(context);
        context.getClass();
        this.formView = new FormView(activity, context, formElementViewBuilder$Factory$Impl);
    }

    public final void Content(StocksTransferEtaViewModel stocksTransferEtaViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(900935131);
        int i2 = (gapComposer.changed(stocksTransferEtaViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (stocksTransferEtaViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(666530176, new StocksTransferEtaFullScreenView$$ExternalSyntheticLambda0(this, stocksTransferEtaViewModel, function1), gapComposer), gapComposer, 6);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CheckStatusPresenter.AnonymousClass1(this, function1, null, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KProperty[] kPropertyArr = FormView.$$delegatedProperties;
            Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StocksTransferEtaFullScreenView$$ExternalSyntheticLambda0(this, stocksTransferEtaViewModel, function1, i);
        }
    }

    public final void Form$1(Modifier modifier, FormViewModel formViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1664439550);
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
            int i3 = i2 & 896;
            boolean z2 = i3 == 256 || ((i2 & 512) != 0 && gapComposer.changedInstance(this));
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TooltipBoxKt$$ExternalSyntheticLambda2(this, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            if (i3 == 256 || ((i2 & 512) != 0 && gapComposer.changedInstance(this))) {
                z = true;
            }
            boolean changedInstance = gapComposer.changedInstance(formViewModel) | z;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MerchantBlockingViewKt$$ExternalSyntheticLambda15(1, this, formViewModel);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, (i2 << 3) & 112, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(i, 18, modifier, this, formViewModel);
        }
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return this.formView.onBack();
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((StocksTransferEtaViewModel) obj, function1, gapComposer, 0);
    }
}
