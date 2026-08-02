package com.squareup.cash.arcade.components.internal;

import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;

/* loaded from: classes5.dex */
public final /* synthetic */ class TooltipKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TooltipState f$0;

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(TooltipState tooltipState, int i) {
        this.$r8$classId = i;
        this.f$0 = tooltipState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TooltipState tooltipState = this.f$0;
        switch (i) {
            case 0:
                StandaloneCoroutine standaloneCoroutine = tooltipState.dismissJob;
                Continuation continuation = null;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                JobKt.launch$default(tooltipState.scope, null, null, new AmountPickerCondensedView.AnonymousClass14(tooltipState, continuation, 7), 3);
                return Unit.INSTANCE;
            case 1:
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                TooltipState tooltipState2 = this.f$0;
                StandaloneCoroutine standaloneCoroutine2 = tooltipState2.dismissJob;
                Continuation continuation2 = null;
                if (standaloneCoroutine2 != null) {
                    standaloneCoroutine2.cancel(null);
                }
                JobKt.launch$default(tooltipState2.scope, null, null, new ToastKt$Toast$8$1(tooltipState2, duration, continuation2, 5), 3);
                return Unit.INSTANCE;
            default:
                return Float.valueOf(tooltipState._alpha$delegate.getFloatValue());
        }
    }
}
