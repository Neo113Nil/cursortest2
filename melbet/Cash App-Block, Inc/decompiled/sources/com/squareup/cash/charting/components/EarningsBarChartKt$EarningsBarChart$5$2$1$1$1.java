package com.squareup.cash.charting.components;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.stripe.android.financialconnections.features.success.SuccessContentKt$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class EarningsBarChartKt$EarningsBarChart$5$2$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ float $barSpacingPx;
    public final /* synthetic */ float $barWidth;
    public final /* synthetic */ List $bars;
    public final /* synthetic */ PlatformHapticFeedback $hapticFeedback;
    public final /* synthetic */ Function1 $onBarSelected;
    public final /* synthetic */ Function0 $onBarSelectionCleared;
    public final /* synthetic */ MutableState $selectedBar$delegate;
    public final /* synthetic */ MutableFloatState $selectedOffsetX$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsBarChartKt$EarningsBarChart$5$2$1$1$1(MutableFloatState mutableFloatState, List list, float f, float f2, PlatformHapticFeedback platformHapticFeedback, Function0 function0, MutableState mutableState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$selectedOffsetX$delegate = mutableFloatState;
        this.$bars = list;
        this.$barWidth = f;
        this.$barSpacingPx = f2;
        this.$hapticFeedback = platformHapticFeedback;
        this.$onBarSelectionCleared = function0;
        this.$selectedBar$delegate = mutableState;
        this.$onBarSelected = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EarningsBarChartKt$EarningsBarChart$5$2$1$1$1(this.$selectedOffsetX$delegate, this.$bars, this.$barWidth, this.$barSpacingPx, this.$hapticFeedback, this.$onBarSelectionCleared, this.$selectedBar$delegate, this.$onBarSelected, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EarningsBarChartKt$EarningsBarChart$5$2$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SafeFlow snapshotFlow = Updater.snapshotFlow(new SuccessContentKt$$ExternalSyntheticLambda0(this.$selectedOffsetX$delegate, 1));
            final MutableState mutableState = this.$selectedBar$delegate;
            final Function1 function1 = this.$onBarSelected;
            final List list = this.$bars;
            final float f = this.$barWidth;
            final float f2 = this.$barSpacingPx;
            final PlatformHapticFeedback platformHapticFeedback = this.$hapticFeedback;
            final Function0 function0 = this.$onBarSelectionCleared;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.charting.components.EarningsBarChartKt$EarningsBarChart$5$2$1$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object obj3;
                    float floatValue = ((Number) obj2).floatValue();
                    Iterator it = list.iterator();
                    float f3 = RecyclerView.DECELERATION_RATE;
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        float f4 = f + f3 + f2;
                        if (f3 <= floatValue && floatValue <= f4) {
                            break;
                        }
                        f3 = f4;
                    }
                    EarningsBarViewModel earningsBarViewModel = (EarningsBarViewModel) obj3;
                    MutableState mutableState2 = mutableState;
                    if (!Intrinsics.areEqual(earningsBarViewModel, (EarningsBarViewModel) mutableState2.getValue())) {
                        mutableState2.setValue(earningsBarViewModel);
                        platformHapticFeedback.m769performHapticFeedbackCdsT49E(0);
                        EarningsBarViewModel earningsBarViewModel2 = (EarningsBarViewModel) mutableState2.getValue();
                        if (earningsBarViewModel2 != null) {
                            function1.invoke(earningsBarViewModel2);
                        } else {
                            function0.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
