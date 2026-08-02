package com.squareup.cash.payments.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.ui.SecureScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class MainPaymentView extends ComposeUiView implements SecureScreen {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ElementBoundsRegistry elementBoundsRegistry;
    public final RealImageLoader imageLoader;
    public Object lastResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPaymentView(Context context, RealImageLoader realImageLoader, ElementBoundsRegistry elementBoundsRegistry) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.elementBoundsRegistry = elementBoundsRegistry;
    }

    public final void Content(MainPaymentViewModel mainPaymentViewModel, Function1 function1, Composer composer, int i) {
        Object androidFileSaver$save$2;
        Continuation continuation;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-718588580);
        int i2 = (gapComposer.changedInstance(mainPaymentViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (mainPaymentViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(12, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Object obj = this.lastResult;
            boolean changedInstance = gapComposer.changedInstance(this) | (i3 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MainPaymentView$Content$2$1(this, function1, null, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, obj, (Function2) rememberedValue2);
            String str = mainPaymentViewModel.searchQuery;
            String str2 = mainPaymentViewModel.note;
            InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = mainPaymentViewModel.instrumentSelectionRowViewModel;
            MainPaymentViewState mainPaymentViewState = new MainPaymentViewState(str, str2, instrumentSelectionRowViewModel != null ? instrumentSelectionRowViewModel.instrumentSelection : null, mainPaymentViewModel.selectedRecipients, false);
            Object[] objArr = new Object[0];
            boolean changedInstance2 = gapComposer.changedInstance(mainPaymentViewState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda5(mainPaymentViewState, 28);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 0);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), MainPaymentViewKt.LocalElementBoundsRegistry.defaultProvidedValue$runtime(this.elementBoundsRegistry)}, Expect_jvmKt.rememberComposableLambda(-991848292, new MainPaymentView$$ExternalSyntheticLambda2(mainPaymentViewModel, function1, this, 0), gapComposer), gapComposer, 56);
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(mutableState) | (i3 == 32) | gapComposer.changedInstance(this);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                continuation = null;
                androidFileSaver$save$2 = new AndroidFileSaver$save$2(function1, this, mutableState, null, 4);
                gapComposer.updateRememberedValue(androidFileSaver$save$2);
            } else {
                androidFileSaver$save$2 = rememberedValue4;
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) androidFileSaver$save$2);
            Boolean valueOf = Boolean.valueOf(mainPaymentViewModel.shouldShowContactsSyncPrompt);
            boolean changedInstance3 = gapComposer.changedInstance(mainPaymentViewModel) | (i3 == 32);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new MainPaymentView$Content$2$1(mainPaymentViewModel, function1, continuation, 21);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue5);
            boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changedInstance(mainPaymentViewState);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new MainPaymentView$Content$2$1(mainPaymentViewState, mutableState, continuation, 22);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, mainPaymentViewState, (Function2) rememberedValue6);
            boolean z2 = i3 == 32;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (z2 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new HomeViewKt$$ExternalSyntheticLambda8(22, function1);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue7, gapComposer, 0, 1);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentView$$ExternalSyntheticLambda2(this, mainPaymentViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((MainPaymentViewModel) obj, function1, gapComposer, 0);
    }
}
