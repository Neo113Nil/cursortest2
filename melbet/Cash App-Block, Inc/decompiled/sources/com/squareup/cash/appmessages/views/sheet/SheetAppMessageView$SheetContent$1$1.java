package com.squareup.cash.appmessages.views.sheet;

import androidx.compose.runtime.Updater;
import androidx.datastore.core.DataStoreImpl$data$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.sheet.SheetAppMessageEvent;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class SheetAppMessageView$SheetContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ RealSheetState $sheetState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetAppMessageView$SheetContent$1$1(RealSheetState realSheetState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = realSheetState;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SheetAppMessageView$SheetContent$1$1(this.$onEvent, this.$sheetState, continuation);
            default:
                return new SheetAppMessageView$SheetContent$1$1(this.$sheetState, this.$onEvent, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SheetAppMessageView$SheetContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        RealSheetState realSheetState = this.$sheetState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, 5));
                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(2, null, 10);
                    this.label = 1;
                    if (FlowKt.first(snapshotFlow, anonymousClass2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                function1.invoke(SheetAppMessageEvent.ViewedTreehouseContent.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop(Updater.snapshotFlow(new RealSheetState$$ExternalSyntheticLambda1(realSheetState, 4)), 1);
                    SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2 anonymousClass22 = new SetPinViewKt$SetPin$3$1$1$1.AnonymousClass2(2, function1);
                    this.label = 1;
                    if (drop.collect(anonymousClass22, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
    public SheetAppMessageView$SheetContent$1$1(Function1 function1, RealSheetState realSheetState, Continuation continuation) {
        super(2, continuation);
        this.$onEvent = function1;
        this.$sheetState = realSheetState;
    }
}
