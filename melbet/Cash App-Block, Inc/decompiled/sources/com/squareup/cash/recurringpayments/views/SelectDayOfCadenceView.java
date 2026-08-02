package com.squareup.cash.recurringpayments.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.util.BackHandlerKt;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SelectDayOfCadenceView extends ComposeUiView {
    public final RealImageLoader imageLoader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.values().length];
            try {
                iArr[RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectDayOfCadenceView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
    }

    public final void Content(SelectDayOfCadenceViewModel selectDayOfCadenceViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1373342654);
        int i2 = (gapComposer.changedInstance(selectDayOfCadenceViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BackHandlerKt.setBackHandler(this, (Function0) rememberedValue);
            if (selectDayOfCadenceViewModel != null) {
                gapComposer.startReplaceGroup(-607199452);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1268620542, new SelectDayOfCadenceView$$ExternalSyntheticLambda1(function1, selectDayOfCadenceViewModel, this), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-604647036);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectDayOfCadenceView$$ExternalSyntheticLambda1(this, selectDayOfCadenceViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SelectDayOfCadenceViewModel) obj, function1, gapComposer, 0);
    }
}
