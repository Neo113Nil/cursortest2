package com.squareup.cash.money.views;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.activity.views.ErrorActivityItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.datefilterbar.views.DateFilterBarKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import java.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabUIKt$MoneyTabLoaded$4$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $shouldScroll$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyTabUIKt$MoneyTabLoaded$4$2$1(MutableState mutableState, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$shouldScroll$delegate = mutableState;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$shouldScroll$delegate;
        LazyListState lazyListState = this.$listState;
        switch (i) {
            case 0:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, continuation, 0);
            case 1:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(mutableState, lazyListState, continuation);
            case 2:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, continuation, 2);
            case 3:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, continuation, 3);
            case 4:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, continuation, 4);
            default:
                return new MoneyTabUIKt$MoneyTabLoaded$4$2$1(lazyListState, mutableState, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneyTabUIKt$MoneyTabLoaded$4$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        MutableState mutableState = this.$shouldScroll$delegate;
        LazyListState lazyListState = this.$listState;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        this.label = 1;
                        WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                        if (lazyListState.scrollToItem(0, 0, this) == coroutineSingletons) {
                            break;
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new WorkerWorkflow$render$1(Updater.snapshotFlow(new TabContentViewKt$$ExternalSyntheticLambda1(15, mutableState)), new ErrorActivityItemKt$$ExternalSyntheticLambda0(14), continuation, 16));
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(i2, lazyListState, mutableState);
                    this.label = 1;
                    if (safeFlow.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 4)), 5), 1);
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(17, mutableState);
                    this.label = 1;
                    if (take.collect(anonymousClass1, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DateTimeFormatter dateTimeFormatter = DateFilterBarKt.monthSelectedFormatter;
                    Integer num = (Integer) mutableState.getValue();
                    if (num == null) {
                        break;
                    } else {
                        int intValue = num.intValue();
                        this.label = 1;
                        if (DateFilterBarKt.access$animateScrollToItemCenter(lazyListState, intValue, this) == coroutineSingletons4) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        this.label = 1;
                        WorkLauncherImpl workLauncherImpl2 = LazyListState.Saver;
                        if (lazyListState.scrollToItem(0, 0, this) == coroutineSingletons5) {
                            break;
                        }
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 13));
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass12 = new MusicPresenter$models$2$1.AnonymousClass1(22, mutableState);
                    this.label = 1;
                    if (snapshotFlow.collect(anonymousClass12, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$4$2$1(LazyListState lazyListState, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$listState = lazyListState;
        this.$shouldScroll$delegate = mutableState;
    }
}
