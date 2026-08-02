package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db.contacts.Recipient$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormElementViewBuilder$toView$36;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ArcadeFormMerchantTransactionPickerView extends AbstractComposeView {
    public final String formElementId;
    public final RealImageLoader imageLoader;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final FormElementViewBuilder$toView$36 onEvent;
    public final List options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormMerchantTransactionPickerView(Context context, String str, List list, LocalizedMoneyFormatter.Factory factory, RealImageLoader realImageLoader, FormElementViewBuilder$toView$36 formElementViewBuilder$toView$36) {
        super(context, null, 6, 0);
        context.getClass();
        list.getClass();
        this.formElementId = str;
        this.options = list;
        this.moneyFormatterFactory = factory;
        this.imageLoader = realImageLoader;
        this.onEvent = formElementViewBuilder$toView$36;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1850926056);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new Recipient$$ExternalSyntheticLambda2(29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
            List list = (List) mutableState.getValue();
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CheckStatusPresenter.AnonymousClass1.C00611(this, mutableState, null, 14);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, list, (Function2) rememberedValue2);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1027515011, new ErrorView$$ExternalSyntheticLambda1(13, this, mutableState), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(this, i, 20);
        }
    }
}
