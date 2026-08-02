package com.squareup.cash.bitcoin.views.applet;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.views.InAppNotificationView$setModel$4$2;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinHomeViewKt$HandleScrollEvents$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinHomeViewKt$HandleScrollEvents$1$1(LazyListState lazyListState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new BitcoinHomeViewKt$HandleScrollEvents$1$1(this.$onEvent, this.$listState, continuation);
            default:
                return new BitcoinHomeViewKt$HandleScrollEvents$1$1(this.$listState, this.$onEvent, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinHomeViewKt$HandleScrollEvents$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        LazyListState lazyListState = this.$listState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 3)));
                    InAppNotificationView$setModel$4$2 inAppNotificationView$setModel$4$2 = new InAppNotificationView$setModel$4$2(1, function1);
                    this.label = 1;
                    Object collect = distinctUntilChanged.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(inAppNotificationView$setModel$4$2, 1), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl = lazyListState.internalInteractionSource.interactions;
                MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3 moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3 = new MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3(function1, lazyListState, 1);
                this.label = 1;
                sharedFlowImpl.collect(moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3, this);
                return coroutineSingletons2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinHomeViewKt$HandleScrollEvents$1$1(Function1 function1, LazyListState lazyListState, Continuation continuation) {
        super(2, continuation);
        this.$onEvent = function1;
        this.$listState = lazyListState;
    }
}
